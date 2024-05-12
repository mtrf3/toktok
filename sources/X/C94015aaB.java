package X;

/* renamed from: X.aaB, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94015aaB extends Exception {
    public final int LJLIL = 1;

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        if (this.LJLIL != 1) {
            str = "Unknown error";
        } else {
            str = "Package not available";
        }
        StringBuilder sb = new StringBuilder(str.length() + 17);
        sb.append("LoaderException{");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
