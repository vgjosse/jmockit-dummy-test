package dummy.dto;

public abstract class AbstractMyDto {

	private int id;

	private String label;

	protected AbstractMyDto(final int id, final String label) {
		super();
		this.id = id;
		this.label = label;
	}

	public int getId() {
		return id;
	}

	public String getLabel() {
		return label;
	}

}
