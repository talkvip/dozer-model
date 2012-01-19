package nl.dries.wicket.hibernate.dozer.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * @author dries
 */
@Entity(name = "company")
public class Company extends AbstractOrganization
{
	/** Default */
	private static final long serialVersionUID = 1L;

	/** */
	@ManyToOne
	private Adres adres;

	/**
	 * @return the adres
	 */
	public Adres getAdres()
	{
		return adres;
	}

	/**
	 * @param adres
	 *            the adres to set
	 */
	public void setAdres(Adres adres)
	{
		this.adres = adres;
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((adres == null) ? 0 : adres.hashCode());
		return result;
	}

	/**
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
		{
			return true;
		}
		if (!super.equals(obj))
		{
			return false;
		}
		if (getClass() != obj.getClass())
		{
			return false;
		}
		Company other = (Company) obj;
		if (adres == null)
		{
			if (other.adres != null)
			{
				return false;
			}
		}
		else if (!adres.equals(other.adres))
		{
			return false;
		}
		return true;
	}
}