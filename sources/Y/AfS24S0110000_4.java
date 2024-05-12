package Y;

import X.C25528A0e;
import X.C25849ACn;
import X.InterfaceC64592gB;
import com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftSettingActivity;
import com.ss.android.ugc.aweme.paidcontent.manageseries.viewmodel.ManageSeriesViewModel;
import kotlin.jvm.internal.AqS9S0010000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class AfS24S0110000_4 implements InterfaceC64592gB {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS24S0110000_4 afS24S0110000_4, Object obj) {
        Throwable error = (Throwable) obj;
        o.LJIIIZ(error, "error");
        VideoGiftSettingActivity videoGiftSettingActivity = (VideoGiftSettingActivity) afS24S0110000_4.l0;
        boolean z = afS24S0110000_4.z1;
        C25849ACn c25849ACn = videoGiftSettingActivity.LJLJL;
        if (c25849ACn != null) {
            c25849ACn.LJIIJ(new AqS9S0010000_4(z, 3));
            if (z) {
                videoGiftSettingActivity.LLFII(0);
            } else {
                videoGiftSettingActivity.LLFZ(0);
            }
            error.getMessage();
            return;
        }
        o.LJIJI("giftSettingUnit");
        throw null;
    }

    public static final void accept$1(AfS24S0110000_4 afS24S0110000_4, Object obj) {
        if (afS24S0110000_4.z1) {
            ((ManageSeriesViewModel) afS24S0110000_4.l0).setState(C25528A0e.LJLIL);
        }
    }

    public AfS24S0110000_4(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
