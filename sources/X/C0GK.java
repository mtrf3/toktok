package X;

/* renamed from: X.0GK, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0GK {
    public static volatile C0GK LIZIZ;
    public C0GI LIZ;

    public final void LIZ(Exception exc, String str) {
        C0GJ c0gj;
        C0GI c0gi = this.LIZ;
        if (c0gi != null && (c0gj = c0gi.LIZ) != null) {
            c0gj.LIZ(exc, str);
        }
        C0GI c0gi2 = this.LIZ;
        if (c0gi2 == null || !c0gi2.LIZIZ) {
        } else {
            throw new RuntimeException(exc);
        }
    }
}
