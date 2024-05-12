package X;

/* loaded from: classes16.dex */
public class YQR implements YBJ {
    public final /* synthetic */ YQ7 LIZ;

    @Override // X.YBJ
    public final void LIZ() {
        YQ6 yq6;
        YQ7 yq7 = this.LIZ;
        if (yq7.LJII.LJLLL && (yq6 = yq7.LJI) != null && yq6.LJJIL == 3) {
            C63922P6w.LIZLLL("TECameraModeBase", "gyro onChange set focus mode to continuous focus.");
            this.LIZ.LIZIZ();
            this.LIZ.LIZ();
            YQ7 yq72 = this.LIZ;
            YQ6 yq62 = yq72.LJI;
            YBH ybh = yq62.LJJJJ;
            if (ybh != null) {
                ybh.LIZJ(yq72.LJJJJLL, yq62.LIZLLL(VKA.UNREGISTER_SENSOR));
            }
        }
    }

    public YQR(YQ7 yq7) {
        this.LIZ = yq7;
    }
}
