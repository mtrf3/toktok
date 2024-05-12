package X;

import com.ss.android.ugc.aweme.autocaption.VideoCLACaptionAssem;
import com.ss.android.ugc.aweme.autocaption.VideoCLACaptionViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* loaded from: classes16.dex */
public final class Y03 implements Y1C {
    public final /* synthetic */ VideoCLACaptionAssem LIZ;

    @Override // X.Y1C
    public final boolean LIZ() {
        String lv0 = this.LIZ.r4().lv0();
        if (lv0 == null || !this.LIZ.r4().xv0() || !AK4.LIZ().LJJIIJ(lv0)) {
            return false;
        }
        return true;
    }

    @Override // X.Y1C
    public final int LIZIZ() {
        return this.LIZ.q4();
    }

    @Override // X.Y1C
    public final void LIZJ() {
        this.LIZ.B4();
    }

    @Override // X.Y1C
    public final boolean LJ() {
        return this.LIZ.r4().yv0();
    }

    @Override // X.Y1C
    public final void LJFF() {
        if (!this.LIZ.r4().tv0(this.LIZ.getContext())) {
            this.LIZ.C4();
        }
    }

    public Y03(VideoCLACaptionAssem videoCLACaptionAssem) {
        this.LIZ = videoCLACaptionAssem;
    }

    @Override // X.Y1C
    public final void LIZLLL(boolean z) {
        this.LIZ.D4(!z);
        if (z) {
            this.LIZ.r4().qv0(EnumC86777Y3x.CLICK_ICON, this.LIZ.getContext(), false);
        } else {
            this.LIZ.r4().rv0(EnumC86777Y3x.CLICK_ICON, this.LIZ.getContext());
        }
    }

    @Override // X.Y1C
    public final void LJI(float f, int i) {
        int i2;
        String desc;
        VideoCLACaptionViewModel r4 = this.LIZ.r4();
        r4.LLI = Integer.valueOf(i);
        ((Y18) r4.LLFZ.getValue()).LIZ();
        this.LIZ.r4().LLIFFJFJJ = Float.valueOf(f);
        VideoCLACaptionAssem videoCLACaptionAssem = this.LIZ;
        if (videoCLACaptionAssem.LLIIIJ) {
            C86661Xzl nv0 = videoCLACaptionAssem.r4().nv0();
            nv0.getClass();
            C188727au c188727au = new C188727au();
            nv0.LJII(c188727au, null);
            nv0.LIZLLL(c188727au);
            C86669Xzt.LJFF(c188727au);
            Aweme aweme = nv0.LIZ;
            if (aweme == null || (desc = aweme.getDesc()) == null || desc.length() == 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            c188727au.LIZLLL(i2 ^ 1, "has_title");
            nv0.LJIILIIL(c188727au);
            c188727au.LIZLLL(i, "subtitle_index");
            c188727au.LIZIZ(f, "subtitle_position");
            FMX.LJIIL("subtitle_position_chosen", c188727au.LIZ);
        }
    }
}
