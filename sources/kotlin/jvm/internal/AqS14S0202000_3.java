package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C177156xL;
import X.C203127y8;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.KL2;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomInputPriorityComponent;
import com.ss.android.ugc.aweme.ui.feed.FeedPhotoSlideAssem;
import com.zhiliaoapp.musically.R;

/* loaded from: classes4.dex */
public class AqS14S0202000_3 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i2;
    public int i3;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS14S0202000_3 aqS14S0202000_3, Object obj) {
        AbstractBottomInputPriorityComponent it = (AbstractBottomInputPriorityComponent) obj;
        o.LJIIIZ(it, "it");
        it.P3(aqS14S0202000_3.i2, aqS14S0202000_3.i3, (CharSequence) aqS14S0202000_3.l0, (C177156xL) aqS14S0202000_3.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS14S0202000_3 aqS14S0202000_3, Object obj) {
        C203127y8 state = (C203127y8) obj;
        o.LJIIIZ(state, "state");
        if (aqS14S0202000_3.i2 > KL2.LIZJ(((FeedPhotoSlideAssem) aqS14S0202000_3.l0).getContext(), 110.0f)) {
            ((FeedPhotoSlideAssem) aqS14S0202000_3.l0).LLILL = true;
            TuxIconView tuxIconView = (TuxIconView) aqS14S0202000_3.l1;
            if (tuxIconView != null) {
                tuxIconView.setIconRes(R.raw.icon_tick_cirlce_fill);
            }
        } else if (aqS14S0202000_3.i2 < KL2.LIZJ(((FeedPhotoSlideAssem) aqS14S0202000_3.l0).getContext(), 110.0f) && aqS14S0202000_3.i2 > 0) {
            ((FeedPhotoSlideAssem) aqS14S0202000_3.l0).LLILL = false;
            TuxIconView tuxIconView2 = (TuxIconView) aqS14S0202000_3.l1;
            if (tuxIconView2 != null) {
                tuxIconView2.setIconRes(R.raw.icon_arrow_left_circle_ltr);
            }
        }
        int i = aqS14S0202000_3.i3;
        int i2 = state.LJLIL;
        if (i == i2) {
            ((FeedPhotoSlideAssem) aqS14S0202000_3.l0).LLILIL = 1;
        } else if (i == i2 - 1) {
            ((FeedPhotoSlideAssem) aqS14S0202000_3.l0).LLILIL = 2;
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS14S0202000_3(int i, int i2, CharSequence charSequence, C177156xL c177156xL, int i3) {
        super(1);
        this.$t = i3;
        this.i2 = i;
        this.i3 = i2;
        this.l0 = charSequence;
        this.l1 = c177156xL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS14S0202000_3(int i, FeedPhotoSlideAssem feedPhotoSlideAssem, TuxIconView tuxIconView, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.i2 = i;
        this.l0 = feedPhotoSlideAssem;
        this.l1 = tuxIconView;
        this.i3 = i2;
    }
}
