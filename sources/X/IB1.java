package X;

import com.ss.android.ugc.aweme.sticker.senor.presenter.LandmarkARPresenter;
import defpackage.e1;

/* loaded from: classes8.dex */
public final class IB1 implements X0W {
    public final /* synthetic */ C46193IAz LIZ;

    public IB1(C46193IAz c46193IAz) {
        this.LIZ = c46193IAz;
    }

    @Override // X.X0W
    public final void LIZ(boolean z) {
        boolean booleanValue;
        int i;
        if (z) {
            C46193IAz c46193IAz = this.LIZ;
            if (!(c46193IAz.LJLLI.LIZ instanceof LandmarkARPresenter)) {
                Boolean LIZ = c46193IAz.LJLL.LIZ();
                if (LIZ == null) {
                    booleanValue = false;
                } else {
                    booleanValue = LIZ.booleanValue();
                }
                ID9 id9 = this.LIZ.LJLLI;
                C46193IAz c46193IAz2 = this.LIZ;
                C29S c29s = c46193IAz2.LJLIL;
                c46193IAz2.getLifecycleOwner();
                C83893WwD c83893WwD = new C83893WwD(this.LIZ.LLF(), this.LIZ.LJLLL());
                if (e1.LIZ(31744, "reduce_sensor_frequency", true, false)) {
                    i = 10000;
                } else {
                    i = 5000;
                }
                id9.LIZJ(new LandmarkARPresenter(c29s, c46193IAz2, booleanValue, c83893WwD, i), true);
            }
        }
    }
}
