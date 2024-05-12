package X;

/* renamed from: X.E6z, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35897E6z extends Exception {
    public String message;
    public int statusCode;

    public String getMsg() {
        return this.message;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public C35897E6z(int i, String str) {
        this.statusCode = i;
        this.message = str;
    }
}
