package X;

/* renamed from: X.P9b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C63979P9b extends Exception {
    public String message;
    public int statusCode;

    public String getMsg() {
        return this.message;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public C63979P9b(int i, String str) {
        this.statusCode = i;
        this.message = str;
    }
}
