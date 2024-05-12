package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C1DH;
import X.C76800UCe;
import X.C83168WkW;
import X.C83169WkX;
import X.C83175Wkd;
import X.C83195Wkx;
import X.InterfaceC83144Wk8;
import X.InterfaceC88472Yns;
import X.WOB;
import X.WOC;
import X.X1D;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify;
import com.ss.android.ugc.aweme.ftc.countdown.FTCCountdownState;
import com.ss.android.ugc.aweme.shortvideo.countdown.CountdownState;
import java.util.List;

/* loaded from: classes15.dex */
public class AqS101S0101000_14 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public final void LIZ$0(ComposerBeauty composerBeauty) {
        o.LJIIIZ(composerBeauty, "composerBeauty");
        composerBeauty.setProgressValue(this.i1);
        boolean LIZLLL = ((C83195Wkx) this.l0).LIZ.E7().LIZLLL(composerBeauty, false);
        boolean LJIJI = C1DH.LJIJI(composerBeauty);
        if (!LIZLLL || !LJIJI) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("update composer error, beautyAvailable:");
            LIZ.append(LIZLLL);
            LIZ.append(",canUpdateComposerNode:");
            LIZ.append(LJIJI);
            LIZ.append(',');
            LIZ.append("effectId:");
            LIZ.append(composerBeauty.getEffect().getEffectId());
            LIZ.append(",name:");
            LIZ.append(composerBeauty.getEffect().getName());
            LIZ.append(",id:");
            LIZ.append(composerBeauty.getEffect().getId());
            C83175Wkd.LIZ(X1D.LIZIZ(LIZ));
            return;
        }
        List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
        if (items == null || items.isEmpty()) {
            return;
        }
        for (ComposerBeautyExtraBeautify.ItemsBean itemsBean : items) {
            float LIZ2 = C83168WkW.LIZ(new C83169WkX(itemsBean.getDoubleDirection(), itemsBean.getMax(), itemsBean.getMin(), 0.0f, this.i1, 0.0f, 1868));
            InterfaceC83144Wk8 interfaceC83144Wk8 = ((C83195Wkx) this.l0).LIZIZ;
            if (interfaceC83144Wk8 != null) {
                interfaceC83144Wk8.LLLFF(composerBeauty.getEffect().getUnzipPath(), itemsBean.getTag(), LIZ2 / 100.0f);
            }
        }
    }

    public static final Object invoke$0(AqS101S0101000_14 aqS101S0101000_14, Object obj) {
        FTCCountdownState state = (FTCCountdownState) obj;
        o.LJIIIZ(state, "state");
        ((WOC) aqS101S0101000_14.l0).LLJJI(aqS101S0101000_14.i1, state.getStartTime(), state.getMaxDuration());
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS101S0101000_14 aqS101S0101000_14, Object obj) {
        CountdownState state = (CountdownState) obj;
        o.LJIIIZ(state, "state");
        ((WOB) aqS101S0101000_14.l0).LLJJIII(aqS101S0101000_14.i1, state.getStartTime(), state.getMaxDuration(), true);
        return C76800UCe.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$2(AqS101S0101000_14 aqS101S0101000_14, Object obj) {
        aqS101S0101000_14.LIZ$0((ComposerBeauty) obj);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS101S0101000_14(WOB wob, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = wob;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS101S0101000_14(WOC woc, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = woc;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS101S0101000_14(C83195Wkx c83195Wkx, int i, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.l0 = c83195Wkx;
        this.i1 = i;
    }
}
