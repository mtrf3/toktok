package X;

/* renamed from: X.WKj, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82109WKj implements C0AK {
    public final /* synthetic */ WIW LJLIL;

    public C82109WKj(WIW wiw) {
        this.LJLIL = wiw;
    }

    @Override // X.C0AK
    public final void LJJIJLIJ(int i, int i2) {
        this.LJLIL.LJI.setValue(new C82108WKi(EnumC82111WKl.REMOVE, i, i2, VLL.SLIDE));
    }

    @Override // X.C0AK
    public final void LJLIIIL(int i, int i2) {
        this.LJLIL.LJI.setValue(new C82108WKi(EnumC82111WKl.INSERT, i, i2, VLL.SLIDE));
    }

    @Override // X.C0AK
    public final void LJLJLLL(int i, int i2) {
        this.LJLIL.LJI.setValue(new C82108WKi(EnumC82111WKl.MOVE, i, i2, VLL.SLIDE));
    }

    @Override // X.C0AK
    public final void LJJLIIIJILLIZJL(int i, int i2, Object obj) {
        this.LJLIL.LJI.setValue(new C82108WKi(EnumC82111WKl.CHANGE, i, i2, VLL.SLIDE));
    }
}
