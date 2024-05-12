package X;

import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;

/* loaded from: classes14.dex */
public final class UFD implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ float LJLJLJ;
    public final /* synthetic */ boolean LJLJLLL;
    public final /* synthetic */ C80797VnN LJLL;

    public final void LIZ() {
        int i;
        String str;
        String str2;
        boolean LJIIJ = this.LJLL.LJIIJ(this.LJLIL, this.LJLILLLLZI);
        int abs = Math.abs(this.LJLILLLLZI);
        C80797VnN c80797VnN = this.LJLL;
        if (abs > c80797VnN.LLIIL && Math.abs((int) (this.LJLIL * c80797VnN.LJLIL)) <= this.LJLL.LLIILZL) {
            i = 1;
        } else {
            i = 0;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_live_up_down_draw_end");
        LIZ.LJIJJ(Long.valueOf(this.LJLJI), "room_id");
        LIZ.LJIJJ(Long.valueOf(this.LJLJJI), "anchor_id");
        LIZ.LJIJJ(this.LJLJJL, "action_type");
        LIZ.LJIJJ(this.LJLJJLL, "enter_from_merge");
        LIZ.LJIJJ(this.LJLJL, "enter_method");
        LIZ.LJIL("draw_distance", Float.valueOf(this.LJLJLJ));
        if (LJIIJ) {
            str = "rapid";
        } else {
            str = "slow";
        }
        LIZ.LJIJJ(str, "speed_type");
        LIZ.LJIJJ(Integer.valueOf(this.LJLJLLL ? 1 : 0), "is_succeed");
        if (this.LJLIL > 0) {
            str2 = "down";
        } else {
            str2 = "up";
        }
        C78895Uxn.LIZIZ(LIZ, str2, "draw_type", i, "is_accident");
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ.LJIILL())) {
            LIZ.LJJIIJZLJL();
        } else {
            LIZ.LJJIJ();
            LIZ.LJJIIZI();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public UFD(C80797VnN c80797VnN, int i, int i2, long j, long j2, String str, String str2, String str3, float f, boolean z) {
        this.LJLL = c80797VnN;
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = j;
        this.LJLJJI = j2;
        this.LJLJJL = str;
        this.LJLJJLL = str2;
        this.LJLJL = str3;
        this.LJLJLJ = f;
        this.LJLJLLL = z;
    }
}
