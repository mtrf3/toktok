package com.bytedance.ugc.effectcreator.main.model;

import X.C76800UCe;
import X.C93480aRY;
import X.C93744aVo;
import X.C93829aXB;
import X.C93854aXa;
import X.C93940aYy;
import X.C93971aZT;
import X.C94550aio;
import X.C94551aip;
import X.InterfaceC88472Yns;
import android.content.Context;
import com.bytedance.effectcreatormobile.ckeapi.api.IEditorContext;
import com.bytedance.effectcreatormobile.ckeapi.api.IEditorModel;
import com.bytedance.effectcreatormobile.ckeapi.api.main.IAutoChangeModel;
import com.bytedance.effectcreatormobile.ckeapi.api.store.IStore;
import com.bytedance.ies.effectcreator.swig.Feature;
import com.bytedance.ies.effectcreator.swig.FeatureType;
import com.bytedance.keva.Keva;
import com.bytedance.news.common.service.manager.IService;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS179S0200000_42;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class AutoChangeModel implements IAutoChangeModel {
    public final void showChangeModelDialog() {
        Context context;
        IEditorContext LIZ = C93940aYy.LIZ();
        if (LIZ != null && (context = LIZ.getContext()) != null) {
            C93744aVo.LIZIZ(new IDqS179S0200000_42(context, getMessageIntroInfo(context), 1), 0L);
        }
    }

    private final C93480aRY getMessageIntroInfo(Context context) {
        return new C93480aRY("https://p16-amd-va.tiktokcdn.com/obj/musically-maliva-obj/Coupon_Offer_Light.png", context.getString(R.string.fxq), context.getString(R.string.fxp), true, context.getString(R.string.fw5), 1);
    }

    public final boolean shouldShowChangeModelTipDialog(Feature feature) {
        boolean z;
        boolean z2 = Keva.getRepo("ck_model_select_repo").getBoolean("cke_auto_switch_model_picture_key", false);
        IStore LIZ = C93854aXa.LIZ();
        if (LIZ != null) {
            z = LIZ.showMakeupChangeModel();
        } else {
            z = false;
        }
        if (feature.getFeatureType() == FeatureType.FeatureType_Makeup || feature.getFeatureType() == FeatureType.FeatureType_Filter) {
            IStore LIZ2 = C93854aXa.LIZ();
            if (LIZ2 != null) {
                LIZ2.markMakeupChangeModel();
            }
            if (z) {
                return false;
            }
        } else {
            Keva.getRepo("ck_model_select_repo").storeBoolean("cke_auto_switch_model_picture_key", true);
            if (z2) {
                return false;
            }
        }
        return true;
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.main.IAutoChangeModel
    public void autoChangeModelWhenAddNew(long j, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        autoChangeModel$default(this, j, "add_new", new C94551aip(j, interfaceC88472Yns), false, 8, null);
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.main.IAutoChangeModel
    public void autoChangeModelWhenCopy(long j, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        autoChangeModel$default(this, j, "copy_exist", interfaceC88472Yns, false, 8, null);
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.main.IAutoChangeModel
    public void autoChangeModelWhenLayerSelect(long j, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        autoChangeModel$default(this, j, "layer_select", interfaceC88472Yns, false, 8, null);
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.main.IAutoChangeModel
    public void autoChangeModelWhenObjectEdit(long j, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        autoChangeModel(j, "object_edit", interfaceC88472Yns, false);
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.main.IAutoChangeModel
    public void autoChangeModelWithReason(long j, String switchReason, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(switchReason, "switchReason");
        autoChangeModel$default(this, j, switchReason, interfaceC88472Yns, false, 8, null);
    }

    private final void autoChangeModel(long j, String str, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns, boolean z) {
        Feature LJFF;
        IEditorModel iEditorModel;
        C93829aXB LJI = CKEffectEditorContext.LJI();
        if (LJI != null && (LJFF = LJI.LJFF(j)) != null && (iEditorModel = (IEditorModel) ((IService) C93971aZT.LIZ().LIZ(IEditorModel.class))) != null) {
            iEditorModel.selectAndChangeModel(j, z, new C94550aio(this, interfaceC88472Yns, LJFF, str, j));
        }
    }

    public static /* synthetic */ void autoChangeModel$default(AutoChangeModel autoChangeModel, long j, String str, InterfaceC88472Yns interfaceC88472Yns, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        autoChangeModel.autoChangeModel(j, str, interfaceC88472Yns, z);
    }
}
