package Y;

import X.C113554cx;
import X.C34K;
import X.C70414RkI;
import X.C72188SUu;
import X.C72189SUv;
import X.C73411SrX;
import X.C74391THn;
import X.C74570TOk;
import X.C78983UzD;
import X.InterfaceC64592gB;
import X.InterfaceC65784Pro;
import X.InterfaceC74398THu;
import X.InterfaceC88472Yns;
import X.SV3;
import X.SV6;
import X.SVA;
import X.TGU;
import X.TGV;
import X.THZ;
import X.TO8;
import X.X1D;
import android.view.View;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.compliance.api.model.PrivacyVideoRestrictionModel;
import com.ss.android.ugc.aweme.compliance.api.model.VideoItemSettings;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopUp;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.ui.PdpFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sticker.view.internal.main.AbstractStickerView;
import com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewContainer;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS101S0300000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class AfS51S0300000_12 implements InterfaceC64592gB {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            case 3:
                accept$3(this, obj);
                return;
            case 4:
                accept$4(this, obj);
                return;
            case 5:
                accept$5(this, obj);
                return;
            case 6:
                accept$6(this, obj);
                return;
            case 7:
                accept$7(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS51S0300000_12 afS51S0300000_12, Object obj) {
        C72188SUu c72188SUu = (C72188SUu) afS51S0300000_12.l0;
        if (!c72188SUu.LJLLI) {
            c72188SUu.LJLJLLL.LIZ(SV6.LIZ((SV3) afS51S0300000_12.l2, (SVA) afS51S0300000_12.l1));
            ((C72188SUu) afS51S0300000_12.l0).LJLLI = true;
        }
    }

    public static final void accept$1(AfS51S0300000_12 afS51S0300000_12, Object obj) {
        C72189SUv c72189SUv = (C72189SUv) afS51S0300000_12.l0;
        if (!c72189SUv.LJLLILLLL) {
            c72189SUv.LJLL.LIZ(SV6.LIZ((SV3) afS51S0300000_12.l2, (SVA) afS51S0300000_12.l1));
            ((C72189SUv) afS51S0300000_12.l0).LJLLILLLL = true;
        }
    }

    public static final void accept$2(AfS51S0300000_12 afS51S0300000_12, Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            ((C74391THn) afS51S0300000_12.l0).LIZIZ = true;
        }
        ((C74391THn) afS51S0300000_12.l0).LIZIZ((Effect) afS51S0300000_12.l1, (InterfaceC74398THu) afS51S0300000_12.l2);
    }

    public static final void accept$3(AfS51S0300000_12 afS51S0300000_12, Object obj) {
        TO8 to8 = (TO8) obj;
        int i = C74570TOk.LIZ[to8.LJLIL.ordinal()];
        if (i != 1) {
            int i2 = 0;
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                    ((C74391THn) afS51S0300000_12.l0).LIZ = false;
                    ((InterfaceC74398THu) afS51S0300000_12.l2).LJLIIL((Effect) afS51S0300000_12.l1, new ExceptionResult(to8.LJLJJI));
                    return;
                }
                C74391THn c74391THn = (C74391THn) afS51S0300000_12.l0;
                c74391THn.LIZ = true;
                c74391THn.LIZ((Effect) afS51S0300000_12.l1, (InterfaceC74398THu) afS51S0300000_12.l2);
                return;
            }
            ((C74391THn) afS51S0300000_12.l0).LIZ = false;
            InterfaceC74398THu interfaceC74398THu = (InterfaceC74398THu) afS51S0300000_12.l2;
            Effect effect = (Effect) afS51S0300000_12.l1;
            Integer num = to8.LJLJJL;
            if (num != null) {
                i2 = num.intValue();
            }
            interfaceC74398THu.LJFF(i2, effect);
            return;
        }
        ((InterfaceC74398THu) afS51S0300000_12.l2).LLILLIZIL((Effect) afS51S0300000_12.l1);
    }

    public static final void accept$4(AfS51S0300000_12 afS51S0300000_12, Object obj) {
        ((C74391THn) afS51S0300000_12.l0).LIZ = false;
        ((InterfaceC74398THu) afS51S0300000_12.l2).LJLIIL((Effect) afS51S0300000_12.l1, new ExceptionResult(new Exception((Throwable) obj)));
    }

    public static final void accept$5(AfS51S0300000_12 afS51S0300000_12, Object obj) {
        SearchStickerViewContainer searchStickerViewContainer;
        View LJ;
        if (obj == THZ.PRE_HIDE) {
            ((TGV) afS51S0300000_12.l1).LLZLI();
            return;
        }
        if (obj != THZ.SHOWN) {
            return;
        }
        SearchStickerViewContainer searchStickerViewContainer2 = ((AbstractStickerView) afS51S0300000_12.l0).LJLLL;
        if ((searchStickerViewContainer2 == null || searchStickerViewContainer2.LIZLLL(null)) && !((TGU) afS51S0300000_12.l2).LIZ()) {
            return;
        }
        AbstractStickerView abstractStickerView = (AbstractStickerView) afS51S0300000_12.l0;
        abstractStickerView.getClass();
        int i = abstractStickerView.LLIIIJ.LJLJL;
        if (i != 1) {
            if (i != 2 || (searchStickerViewContainer = abstractStickerView.LJLLL) == null || (LJ = searchStickerViewContainer.LJ()) == null || LJ.getVisibility() != 0) {
                return;
            }
        } else if (abstractStickerView.LJFF() != abstractStickerView.LJLLLLLL) {
            return;
        }
        AbstractStickerView.LIZJ((AbstractStickerView) afS51S0300000_12.l0).bb(true);
    }

    public static final void accept$6(AfS51S0300000_12 afS51S0300000_12, Object obj) {
        int i;
        int i2;
        int i3;
        PrivacyVideoRestrictionModel privacyVideoRestrictionModel = (PrivacyVideoRestrictionModel) obj;
        if (privacyVideoRestrictionModel.status_code == 0) {
            VideoItemSettings settings = privacyVideoRestrictionModel.getSettings();
            Aweme aweme = (Aweme) afS51S0300000_12.l0;
            int i4 = 0;
            if (aweme != null) {
                if (settings.getDuet() == 1) {
                    i = 0;
                } else {
                    i = 1;
                }
                aweme.setDuetSetting(i);
                if (settings.getDuet() == 1) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                aweme.setReactSetting(i2);
                if (settings.getStitch() == 1) {
                    i3 = 0;
                } else {
                    i3 = 1;
                }
                aweme.setStitchSetting(i3);
                if (settings.getComment() != 1) {
                    i4 = 3;
                }
                aweme.setCommentSetting(i4);
            }
            AwemeService.LIZ().R1(aweme);
            ((InterfaceC88472Yns) afS51S0300000_12.l1).invoke(privacyVideoRestrictionModel);
            return;
        }
        ((InterfaceC65784Pro) afS51S0300000_12.l2).invoke();
    }

    public static final void accept$7(AfS51S0300000_12 afS51S0300000_12, Object obj) {
        String str;
        HashMap<String, Object> trackParams;
        Integer num;
        Integer num2;
        ProductPackStruct productPackStruct = (ProductPackStruct) obj;
        ((C34K) afS51S0300000_12.l0).element = false;
        ((PdpFragment) afS51S0300000_12.l1).Jl();
        Map trackParams2 = ((IPdpStarter.PdpEnterParam) afS51S0300000_12.l2).getTrackParams();
        if (trackParams2 == null) {
            trackParams2 = C113554cx.LJJJLIIL();
        }
        HashMap hashMap = new HashMap(trackParams2);
        if (((PdpFragment) afS51S0300000_12.l1).Ll().LLFII != null) {
            C70414RkI.LJJLJLI(new AqS101S0300000_12((PdpFragment) afS51S0300000_12.l1, (PdpFragment) productPackStruct, (ProductPackStruct) hashMap, (HashMap<String, Object>) 13));
        }
        PdpViewModel Ll = ((PdpFragment) afS51S0300000_12.l1).Ll();
        Integer bizType = ((IPdpStarter.PdpEnterParam) afS51S0300000_12.l2).getBizType();
        if (bizType != null) {
            ProductPackStruct productPackStruct2 = Ll.LJLJLLL;
            if (productPackStruct2 != null && productPackStruct2.bizType != null) {
                if (productPackStruct2 != null) {
                    num = productPackStruct2.bizType;
                } else {
                    num = null;
                }
                if (!o.LJ(bizType, num)) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("pdp biz type difference, schema bizType: ");
                    LIZ.append(bizType);
                    LIZ.append(", server bizType: ");
                    ProductPackStruct productPackStruct3 = Ll.LJLJLLL;
                    if (productPackStruct3 != null) {
                        num2 = productPackStruct3.bizType;
                    } else {
                        num2 = null;
                    }
                    LIZ.append(num2);
                    C78983UzD.LJIILL(X1D.LIZIZ(LIZ));
                }
            }
        } else {
            Ll.getClass();
        }
        ((PdpFragment) afS51S0300000_12.l1).Ll().LLJI = true;
        PdpViewModel.yx0(((PdpFragment) afS51S0300000_12.l1).Ll(), productPackStruct, null, false, false, false, false, 96);
        ((PdpFragment) afS51S0300000_12.l1).Ll().Yw0(productPackStruct, productPackStruct.productId);
        C73411SrX c73411SrX = ((PdpFragment) afS51S0300000_12.l1).LJLJLJ;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        PdpFragment pdpFragment = (PdpFragment) afS51S0300000_12.l1;
        pdpFragment.LJLJLJ = null;
        PopUp popUp = productPackStruct.popUp;
        if (popUp != null && (trackParams = ((IPdpStarter.PdpEnterParam) afS51S0300000_12.l2).getTrackParams()) != null) {
            pdpFragment.Ol(popUp, trackParams);
        }
        String chainKey = ((IPdpStarter.PdpEnterParam) afS51S0300000_12.l2).getChainKey();
        if ((chainKey == null || chainKey.length() == 0) && (str = productPackStruct.chainKey) != null && str.length() > 0) {
            HashMap<String, Object> visitReportParams = ((IPdpStarter.PdpEnterParam) afS51S0300000_12.l2).getVisitReportParams();
            if (visitReportParams != null) {
                visitReportParams.put("chain_key", productPackStruct.chainKey);
            }
            ((IPdpStarter.PdpEnterParam) afS51S0300000_12.l2).setChainKey(productPackStruct.chainKey);
        }
    }

    public AfS51S0300000_12(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
