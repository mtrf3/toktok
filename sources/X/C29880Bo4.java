package X;

import android.content.Context;
import com.bytedance.android.livesdk.model.PromoteInfo;
import com.bytedance.android.livesdk.model.PromoteOtherMessage;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Bo4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29880Bo4 extends AbstractC62607Ohf {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ PromoteInfo LIZIZ;
    public final /* synthetic */ OKT LIZJ;

    @Override // X.AbstractC62607Ohf
    public final int LIZLLL() {
        return R.raw.icon_2pt_fire;
    }

    @Override // X.AbstractC62607Ohf
    public final String LJ() {
        return "promote_button";
    }

    @Override // X.AbstractC62607Ohf
    public final int LJFF() {
        return R.string.phc;
    }

    @Override // X.AbstractC62607Ohf
    public final int LJI() {
        return 21;
    }

    @Override // X.AbstractC62607Ohf
    public final boolean LIZIZ() {
        return !this.LIZ;
    }

    @Override // X.AbstractC62607Ohf
    public final void LIZJ(Context context, C29930Bos c29930Bos) {
        if (this.LIZ) {
            PromoteOtherMessage promoteOtherMessage = this.LIZIZ.promoteOtherMessage;
            if (promoteOtherMessage == null) {
                return;
            }
            OKT okt = this.LIZJ;
            String str = promoteOtherMessage.recallToast;
            okt.getClass();
            if (str == null) {
                return;
            }
            LiveOuterService.LJJJLL().LJJIJIL().LJIILLIIL(str);
            return;
        }
        this.LIZJ.LJIIJ(context, c29930Bos, "others");
    }

    public C29880Bo4(boolean z, PromoteInfo promoteInfo, OKT okt) {
        this.LIZ = z;
        this.LIZIZ = promoteInfo;
        this.LIZJ = okt;
    }
}
