package X;

/* renamed from: X.QvT, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68559QvT {
    public final android.net.Uri LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    public C68559QvT(android.net.Uri uri, boolean z, boolean z2) {
        this.LIZ = uri;
        this.LIZIZ = z;
        this.LIZJ = z2;
    }

    public final C68559QvT LIZ() {
        return new C68559QvT(this.LIZ, this.LIZIZ, true);
    }

    public final C68559QvT LIZIZ() {
        return new C68559QvT(this.LIZ, true, this.LIZJ);
    }

    public final C68192QpY LIZJ(long j, String str) {
        return new C68192QpY(this, str, Long.valueOf(j));
    }

    public final C68604QwC LIZLLL(String str, String str2) {
        return new C68604QwC(this, str, str2);
    }

    public final C68059QnP LJ(String str, boolean z) {
        return new C68059QnP(this, str, Boolean.valueOf(z));
    }
}
