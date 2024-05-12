package X;

/* loaded from: classes16.dex */
public abstract class XDH<T> {
    public abstract T getResponseData();

    public abstract String getResponseMessage();

    public abstract int getStatusCode();

    public final boolean checkStatusCode() {
        if (getStatusCode() == 0) {
            return true;
        }
        return false;
    }

    public boolean checkValue() {
        if (getResponseData() != null) {
            return true;
        }
        return false;
    }
}
