package X;

/* loaded from: classes7.dex */
public final class F6C implements FJX {
    @Override // X.FJX
    public final void LIZ(boolean z) {
        C225248si.LJIJJ(Boolean.valueOf(z), "installing", null, null, null);
    }

    @Override // X.FJX
    public final void LIZJ(int i) {
        if (i == -1) {
            C225248si.LJIJJ(null, "Permission Dialog Result", null, null, "showPermissionDialog: clicked OK");
        } else {
            C225248si.LJIJJ(null, "Permission Dialog Result", null, null, "showPermissionDialog: clicked cancel");
        }
    }

    @Override // X.FJX
    public final void LIZLLL(boolean z) {
        C225248si.LJIJJ(Boolean.valueOf(z), "install end", null, null, null);
    }

    @Override // X.FJX
    public final void LJ(boolean z) {
        C225248si.LJIJJ(Boolean.valueOf(z), "install start", null, null, null);
    }

    @Override // X.FJX
    public final void LIZIZ(long j, long j2, boolean z) {
        C225248si.LJIJJ(Boolean.valueOf(z), "downloading", Long.valueOf(j), Long.valueOf(j2), null);
    }
}
