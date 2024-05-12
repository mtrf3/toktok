package X;

/* renamed from: X.180, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass180 extends AnonymousClass013 {
    public static final AnonymousClass180 LJFF = new AnonymousClass180("lyric_dummy", "", -1);
    public final int LJ;

    @Override // X.AnonymousClass013
    public final String LIZ() {
        String str;
        if (this.LJ == 3) {
            str = ".krc";
        } else {
            str = ".lrc";
        }
        StringBuilder LIZ = X1D.LIZ();
        return JBR.LJFF(LIZ, this.LIZ, str, LIZ);
    }

    public AnonymousClass180(String str, String str2, int i) {
        super(str, str2);
        this.LJ = i;
    }
}
