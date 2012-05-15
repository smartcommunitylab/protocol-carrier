package eu.trentorise.smartcampus.custom;

public class MessageResponse {

	private int httpStatus;
	private long timestamp;
	private String body; // not required
	private String contentType = "application/json"; // not required

	public MessageResponse(Integer httpStatus, Long timestamp) {
		if (httpStatus == null || timestamp == null) {
			throw new IllegalArgumentException("httpStatus and timestamp cannot be null", null);
		}

		setHttpStatus(httpStatus);
		setTimestamp(timestamp);
	}

	public int getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(int httpStatus) {
		this.httpStatus = httpStatus;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

}
