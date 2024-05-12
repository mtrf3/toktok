package com.bytedance.effectcreatormobile.objectselect.impl;

import X.C1B3;
import X.C36636EZk;
import X.C3C5;
import X.C48841JEv;
import X.C78555UsJ;
import X.C93427aQh;
import X.C93500aRs;
import X.C93506aRy;
import X.C93829aXB;
import X.C93887aY7;
import X.C93940aYy;
import X.C93977aZZ;
import X.C94044aae;
import X.C94093abR;
import X.C94094abS;
import X.C94095abT;
import X.C94270aeI;
import X.C94271aeJ;
import X.C94272aeK;
import X.C94273aeL;
import X.EnumC93488aRg;
import X.EnumC93820aX2;
import X.EnumC93823aX5;
import X.InterfaceC67352kd;
import X.InterfaceC70422pa;
import X.InterfaceC93818aX0;
import X.T2R;
import X.XKS;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.effectcreatormobile.ckeapi.api.IEditorContext;
import com.bytedance.effectcreatormobile.ckeapi.api.objectselect.IObjectSelect;
import com.bytedance.effectcreatormobile.ckeapi.api.text.ITextEdit;
import com.bytedance.effectcreatormobile.ckeapi.api.text.TextModel;
import com.bytedance.effectcreatormobile.objectselect.ObjectSelectFragment;
import com.bytedance.effectcreatormobile.objectselect.api.IEffectDataResProvider;
import com.bytedance.ies.effectcreator.swig.Canvas;
import com.bytedance.ies.effectcreator.swig.Feature;
import com.bytedance.ies.effectcreator.swig.FeatureType;
import com.google.gson.Gson;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS419S0100000_42;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class ObjectSelectImpl implements IObjectSelect {
    public static final C93506aRy Companion = new C93506aRy();
    public static InterfaceC93818aX0 resultHandler;
    public final MutableLiveData<C94273aeL> previewTemplateEvent = new MutableLiveData<>();
    public final ObjectSelectLiveData<EnumC93488aRg> panelStateLiveData = new ObjectSelectLiveData<>();
    public final InterfaceC70422pa scope = C48841JEv.LIZ(C36636EZk.LIZ.LJJIJIL().plus(T2R.LJIIJJI()));

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.objectselect.IObjectSelect
    public void init() {
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.objectselect.IObjectSelect
    public void onRecycle() {
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.objectselect.IObjectSelect
    public void open(FragmentManager fragmentManager, int i) {
        o.LJIIIZ(fragmentManager, "fragmentManager");
    }

    public final Fragment getFragment() {
        return new ObjectSelectFragment();
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.objectselect.IObjectSelect
    public String getTag() {
        return ObjectSelectImpl.class.getName();
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.objectselect.IObjectSelect
    public void hidePanel() {
        FragmentManager fragmentManager;
        IEditorContext LIZ = C93940aYy.LIZ();
        if (LIZ != null && (fragmentManager = LIZ.getFragmentManager()) != null) {
            Fragment LJJJIL = fragmentManager.LJJJIL(getTag());
            if (!(LJJJIL instanceof ObjectSelectFragment)) {
                LJJJIL = null;
            }
            ObjectSelectFragment objectSelectFragment = (ObjectSelectFragment) LJJJIL;
            if (objectSelectFragment != null) {
                C94044aae c94044aae = objectSelectFragment.LJLIL;
                if (c94044aae != null) {
                    c94044aae.LJLILLLLZI.dismiss();
                } else {
                    o.LJIJI("binding");
                    throw null;
                }
            }
        }
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.objectselect.IObjectSelect
    public void prefetchFeatureList() {
        IEffectDataResProvider LIZ = C93977aZZ.LIZ();
        if (LIZ != null) {
            LIZ.getResourceList(new C94095abT());
        }
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.objectselect.IObjectSelect
    public LiveData<EnumC93488aRg> getPanelStateLiveData() {
        return this.panelStateLiveData;
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.objectselect.IObjectSelect
    public MutableLiveData<C94273aeL> previewTemplateEvent() {
        return this.previewTemplateEvent;
    }

    public final boolean needChangeModelWhenAdd(Feature feature) {
        if (feature == null) {
            return false;
        }
        FeatureType featureType = feature.getFeatureType();
        if (featureType != null && C93427aQh.LIZ[featureType.ordinal()] == 1) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.objectselect.IObjectSelect
    public void setNextResultHandler(InterfaceC93818aX0 interfaceC93818aX0) {
        resultHandler = interfaceC93818aX0;
    }

    public final Object handleResult(C94270aeI c94270aeI, InterfaceC67352kd<? super C94271aeJ> interfaceC67352kd) {
        XKS xks = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
        xks.LJIIL();
        InterfaceC93818aX0 interfaceC93818aX0 = resultHandler;
        if (interfaceC93818aX0 != null) {
            interfaceC93818aX0.LIZ(c94270aeI, new IDqS419S0100000_42(xks, 15));
        } else {
            C94271aeJ c94271aeJ = new C94271aeJ(null, EnumC93820aX2.NO_HANDLER);
            C3C5.m7constructorimpl(c94271aeJ);
            xks.resumeWith(c94271aeJ);
        }
        return xks.LJIIJJI();
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.objectselect.IObjectSelect
    public void add(FragmentManager fragmentManager, int i, String enterFrom) {
        o.LJIIIZ(fragmentManager, "fragmentManager");
        o.LJIIIZ(enterFrom, "enterFrom");
        if (fragmentManager.LJJJIL(getTag()) != null) {
            return;
        }
        setNextResultHandler(new C94093abR(this));
        Fragment fragment = getFragment();
        Bundle bundle = new Bundle();
        bundle.putString("page", "effect_select");
        bundle.putBoolean("sub_page_style", false);
        bundle.putString("enter_from_key", enterFrom);
        fragment.setArguments(bundle);
        C1B3 c1b3 = new C1B3(fragmentManager);
        c1b3.LJIIJJI(R.anim.i1, R.anim.i5, R.anim.i1, R.anim.i5);
        c1b3.LJIIJ(fragment, getTag(), i);
        c1b3.LJ(null);
        c1b3.LJI();
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.objectselect.IObjectSelect
    public void replace(FragmentManager fragmentManager, int i, long j) {
        Feature LJFF;
        o.LJIIIZ(fragmentManager, "fragmentManager");
        if (fragmentManager.LJJJIL(getTag()) != null) {
            return;
        }
        setNextResultHandler(new C94094abS(this, j));
        Fragment LJJJIL = fragmentManager.LJJJIL(getTag());
        if (LJJJIL == null) {
            LJJJIL = getFragment();
        }
        C93829aXB LJI = CKEffectEditorContext.LJI();
        if (LJI != null && (LJFF = LJI.LJFF(j)) != null) {
            String lokiPanelKey = LJFF.getLokiPanelKey();
            o.LJIIIIZZ(lokiPanelKey, "feature.lokiPanelKey");
            String assetCategory = LJFF.getAssetCategory();
            if (assetCategory == null) {
                assetCategory = "";
            }
            LJJJIL.setArguments(C93500aRs.LIZ(lokiPanelKey, "", assetCategory, "", false, "", ""));
            C1B3 c1b3 = new C1B3(fragmentManager);
            c1b3.LJIIJJI(R.anim.i1, R.anim.i5, R.anim.i1, R.anim.i5);
            c1b3.LJ(null);
            c1b3.LJIIJ(LJJJIL, getTag(), i);
            c1b3.LJI();
        }
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.objectselect.IObjectSelect
    public void reEdit(Fragment fragment, int i, C94272aeK resExtra, long j) {
        Canvas LJ;
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(resExtra, "resExtra");
        if (resExtra.LJLIL == EnumC93823aX5.Text) {
            C93829aXB LJI = CKEffectEditorContext.LJI();
            if (LJI != null && (LJ = LJI.LJ()) != null) {
                LJ.stopAnimation();
            }
            try {
                TextModel oldTextModel = (TextModel) new Gson().LJI(resExtra.LJLILLLLZI, TextModel.class);
                ITextEdit LIZ = C93887aY7.LIZ();
                if (LIZ != null) {
                    o.LJIIIIZZ(oldTextModel, "oldTextModel");
                    LIZ.openTextEditor(fragment, i, oldTextModel);
                }
            } catch (Exception unused) {
            }
        }
    }
}
