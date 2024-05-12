package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C1DH;
import X.C44655Hfn;
import X.C76800UCe;
import X.C81017Vqv;
import X.C81227VuJ;
import X.C83168WkW;
import X.C83169WkX;
import X.C83199Wl1;
import X.C83592WrM;
import X.EnumC83818Wv0;
import X.InterfaceC83144Wk8;
import X.InterfaceC83820Wv2;
import X.InterfaceC83823Wv5;
import X.InterfaceC88472Yns;
import X.X1D;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify;
import com.ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.List;

/* loaded from: classes15.dex */
public class AqS63S0201000_14 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public final void LIZ$0(ComposerBeauty composerBeauty) {
        InterfaceC83144Wk8 beautyViewListener;
        o.LJIIIZ(composerBeauty, "composerBeauty");
        List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
        if (items == null || items.isEmpty()) {
            return;
        }
        for (ComposerBeautyExtraBeautify.ItemsBean itemsBean : items) {
            boolean doubleDirection = itemsBean.getDoubleDirection();
            ((C81227VuJ) this.l1).getMaxPercent();
            float LIZ = C83168WkW.LIZ(new C83169WkX(doubleDirection, itemsBean.getMax(), itemsBean.getMin(), 0.0f, this.i2, 0.0f, 1868));
            if (((C83199Wl1) this.l0).LIZ.E7().LIZLLL(composerBeauty, false) && C1DH.LJIJI(composerBeauty) && (beautyViewListener = ((C83199Wl1) this.l0).LIZIZ.getBeautyViewListener()) != null) {
                beautyViewListener.LLLFF(composerBeauty.getEffect().getUnzipPath(), itemsBean.getTag(), LIZ / 100.0f);
            }
        }
        composerBeauty.setProgressValue(this.i2);
    }

    public final void LIZ$1(ComposerBeauty composerBeauty) {
        o.LJIIIZ(composerBeauty, "composerBeauty");
        ((C83199Wl1) this.l0).LIZJ();
        List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
        if (items == null || items.isEmpty()) {
            return;
        }
        for (ComposerBeautyExtraBeautify.ItemsBean itemsBean : items) {
            boolean doubleDirection = itemsBean.getDoubleDirection();
            ((C81227VuJ) this.l1).getMaxPercent();
            float LIZ = C83168WkW.LIZ(new C83169WkX(doubleDirection, itemsBean.getMax(), itemsBean.getMin(), 0.0f, this.i2, 0.0f, 1868));
            ((C83199Wl1) this.l0).LIZ.t7(composerBeauty, itemsBean.getTag(), LIZ);
            C81017Vqv<BeautyComposerInfo> z7 = ((C83199Wl1) this.l0).LIZ.z7();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(composerBeauty.getEffect().getUnzipPath());
            LIZ2.append(':');
            LIZ2.append(itemsBean.getTag());
            LIZ2.append(':');
            LIZ2.append(LIZ / 100.0f);
            String LIZIZ = X1D.LIZIZ(LIZ2);
            String extra = composerBeauty.getEffect().getExtra();
            if (extra == null) {
                extra = "";
            }
            z7.add(new BeautyComposerInfo(LIZIZ, extra, composerBeauty.getEffect().getEffectId(), composerBeauty.getEffect().getResourceId(), 16));
            if (C1DH.LJIJ(composerBeauty)) {
                ((C83199Wl1) this.l0).LIZ.y7(composerBeauty);
            } else {
                ((C83199Wl1) this.l0).LIZ.V7(composerBeauty);
            }
        }
    }

    public static final Object invoke$0(AqS63S0201000_14 aqS63S0201000_14, Object obj) {
        boolean z;
        InterfaceC83820Wv2 session = (InterfaceC83820Wv2) obj;
        o.LJIIIZ(session, "$this$session");
        session.LIZJ(((C83592WrM) aqS63S0201000_14.l0).LIZLLL);
        int[] LIZIZ = C44655Hfn.LIZIZ(aqS63S0201000_14.i2);
        if (LIZIZ.length > 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            session.LIZ(LIZIZ[0], LIZIZ[1]);
        }
        int[] LIZJ = C44655Hfn.LIZJ(aqS63S0201000_14.i2);
        if (LIZJ.length > 1) {
            session.LIZIZ(LIZJ[0], LIZJ[1]);
        }
        int i = aqS63S0201000_14.i2;
        CameraComponentModel cameraComponentModel = ((ShortVideoContext) aqS63S0201000_14.l1).cameraComponentModel;
        o.LJIIIIZZ(cameraComponentModel, "shortVideoContext.cameraComponentModel");
        int[] LIZ = C44655Hfn.LIZ(i, cameraComponentModel);
        if (LIZ.length > 1) {
            session.LIZLLL(LIZ[0], LIZ[1]);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS63S0201000_14 aqS63S0201000_14, Object obj) {
        InterfaceC83823Wv5 captureService = (InterfaceC83823Wv5) obj;
        o.LJIIIZ(captureService, "$this$captureService");
        captureService.LIZ(new AqS180S0100000_14((C83592WrM) aqS63S0201000_14.l0, 167));
        captureService.LIZIZ(EnumC83818Wv0.RECORD_VIDEO, true, null, new AqS63S0201000_14(aqS63S0201000_14.i2, (ShortVideoContext) aqS63S0201000_14.l1, (C83592WrM) aqS63S0201000_14.l0, 0));
        return C76800UCe.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$2(AqS63S0201000_14 aqS63S0201000_14, Object obj) {
        aqS63S0201000_14.LIZ$0((ComposerBeauty) obj);
        return C76800UCe.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$3(AqS63S0201000_14 aqS63S0201000_14, Object obj) {
        aqS63S0201000_14.LIZ$1((ComposerBeauty) obj);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS63S0201000_14(int i, ShortVideoContext shortVideoContext, C83592WrM c83592WrM, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c83592WrM;
        this.i2 = i;
        this.l1 = shortVideoContext;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS63S0201000_14(C83199Wl1 c83199Wl1, C81227VuJ c81227VuJ, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c83199Wl1;
        this.l1 = c81227VuJ;
        this.i2 = i;
    }
}
