package com.ss.android.ugc.aweme.prop.mobileefffect;

import X.C162476Zf;
import X.C221108m2;
import X.C47704Ins;
import X.C55749LuL;
import X.C62822Ol8;
import X.C73318Sq2;
import X.C74189T9t;
import X.TAF;
import X.V16;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfoWrapper;
import com.ss.android.ugc.aweme.effectcreator.models.EffectHintWrapper;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.MobileEffectData;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;

/* loaded from: classes13.dex */
public final class EffectEditVM extends AssemViewModel<C74189T9t> {
    public final C55749LuL LJLIL = new C55749LuL(C47704Ins.LIZLLL(this, MobileEffectData.class, "effect_init_data"), true);
    public final C73318Sq2 LJLILLLLZI = new C73318Sq2();
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 855));

    public final MobileEffectData gv0() {
        return (MobileEffectData) this.LJLIL.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        this.LJLILLLLZI.LIZLLL();
        super.onCleared();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C74189T9t defaultState() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i = TAF.LIZ[gv0().mode.ordinal()];
        String str6 = "";
        UrlModel urlModel = null;
        EffectHintWrapper effectHintWrapper = null;
        if (i != 1) {
            if (i == 2) {
                CKEDraftInfoWrapper cKEDraftInfoWrapper = gv0().draftInfo;
                if (cKEDraftInfoWrapper == null || (str3 = cKEDraftInfoWrapper.name) == null) {
                    str3 = "";
                }
                CKEDraftInfoWrapper cKEDraftInfoWrapper2 = gv0().draftInfo;
                if (cKEDraftInfoWrapper2 != null && (str5 = cKEDraftInfoWrapper2.author) != null) {
                    str6 = str5;
                }
                CKEDraftInfoWrapper cKEDraftInfoWrapper3 = gv0().draftInfo;
                if (cKEDraftInfoWrapper3 != null) {
                    str4 = V16.LJIILJJIL(cKEDraftInfoWrapper3);
                } else {
                    str4 = null;
                }
                CKEDraftInfoWrapper cKEDraftInfoWrapper4 = gv0().draftInfo;
                if (cKEDraftInfoWrapper4 != null) {
                    effectHintWrapper = cKEDraftInfoWrapper4.effectHint;
                }
                return new C74189T9t(str3, str6, null, str4, effectHintWrapper, 480);
            }
            throw new C162476Zf();
        }
        NewFaceStickerBean newFaceStickerBean = gv0().effect;
        if (newFaceStickerBean == null || (str = newFaceStickerBean.name) == null) {
            str = "";
        }
        NewFaceStickerBean newFaceStickerBean2 = gv0().effect;
        if (newFaceStickerBean2 != null && (str2 = newFaceStickerBean2.ownerName) != null) {
            str6 = str2;
        }
        NewFaceStickerBean newFaceStickerBean3 = gv0().effect;
        if (newFaceStickerBean3 != null) {
            urlModel = newFaceStickerBean3.iconUrl;
        }
        return new C74189T9t(str, str6, urlModel, null, null, 992);
    }

    public final void hv0() {
        int i = TAF.LIZ[gv0().mode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            withState(new AqS178S0100000_12(this, 267));
            return;
        }
        setState(new AqS178S0100000_12(this, 266));
    }
}
