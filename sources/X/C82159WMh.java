package X;

/* renamed from: X.WMh, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82159WMh implements WN1 {
    public final /* synthetic */ int LIZ;
    public final /* synthetic */ WM7 LIZIZ;

    @Override // X.WN1
    public final WN3 LIZ() {
        if (this.LIZ == 0) {
            return null;
        }
        return WN3.LIZJ(this.LIZIZ.requireActivity(), this.LIZ);
    }

    public C82159WMh(WM7 wm7, int i) {
        this.LIZ = i;
        this.LIZIZ = wm7;
    }
}
