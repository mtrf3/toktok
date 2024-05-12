package com.ugc.effectcreator.effectcore.sdk.model;

import X.C36636EZk;
import X.C3C5;
import X.C48841JEv;
import X.C76800UCe;
import X.C78555UsJ;
import X.C93468aRM;
import X.C93797aWf;
import X.C93825aX7;
import X.C93829aXB;
import X.C93893aYD;
import X.C93939aYx;
import X.C94148acK;
import X.C94821anB;
import X.EnumC93944aZ2;
import X.InterfaceC67352kd;
import X.InterfaceC70422pa;
import X.InterfaceC88472Yns;
import X.T2R;
import X.XKS;
import X.XKX;
import com.bytedance.effectcreatormobile.ckeapi.api.IEditorModel;
import com.bytedance.ies.effectcreator.swig.Canvas;
import com.bytedance.ies.effectcreator.swig.Feature;
import com.bytedance.ies.effectcreator.swig.FeatureType;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;
import kotlin.jvm.internal.IDqS419S0100000_42;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class EditorModelImpl implements IEditorModel {
    public final InterfaceC70422pa scope = C48841JEv.LIZ(C36636EZk.LIZ.LJJIJIL().plus(T2R.LJIIJJI()));

    public final void selectIfNeed(Feature feature) {
        int i;
        FeatureType featureType = feature.getFeatureType();
        if ((featureType == null || ((i = C93893aYD.LIZ[featureType.ordinal()]) != 1 && i != 2 && i != 3)) && feature.getEditable() && feature.getVisible()) {
            CKEffectEditorContext.LJIILJJIL(Long.valueOf(C93825aX7.LIZ(feature)));
        }
    }

    public final Object waitForRenderEnvStable(InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        XKS xks = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
        xks.LJIIL();
        CKEffectEditorContext.LIZIZ(new IDqS419S0100000_42(xks, 41));
        return xks.LJIIJJI();
    }

    public final Object changeModelByCategoryKey(String str, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        XKS xks = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
        xks.LJIIL();
        C93797aWf.LIZ().fetchModelByCategoryKey(str, new IDqS419S0100000_42(xks, 40));
        return xks.LJIIJJI();
    }

    public final Object isFeatureCompatible(Feature feature, boolean z, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        Canvas LJ;
        Boolean valueOf;
        boolean z2 = true;
        XKS xks = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
        xks.LJIIL();
        if (z) {
            C93468aRM.LIZ(C93939aYx.LIZ(), new C94148acK(xks, feature), 0, 6);
        } else {
            C93829aXB LJI = CKEffectEditorContext.LJI();
            if (LJI != null && (LJ = LJI.LJ()) != null && (valueOf = Boolean.valueOf(LJ.isCompatibleWithFeatureID(feature.id()))) != null) {
                z2 = valueOf.booleanValue();
            }
            Boolean valueOf2 = Boolean.valueOf(z2);
            C3C5.m7constructorimpl(valueOf2);
            xks.resumeWith(valueOf2);
        }
        return xks.LJIIJJI();
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.IEditorModel
    public void selectAndChangeModel(long j, boolean z, InterfaceC88472Yns<? super EnumC93944aZ2, C76800UCe> onChangeResult) {
        o.LJIIIZ(onChangeResult, "onChangeResult");
        XKX.LIZLLL(this.scope, null, null, new C94821anB(this, j, z, onChangeResult, null), 3);
    }

    public static /* synthetic */ Object isFeatureCompatible$default(EditorModelImpl editorModelImpl, Feature feature, boolean z, InterfaceC67352kd interfaceC67352kd, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return editorModelImpl.isFeatureCompatible(feature, z, interfaceC67352kd);
    }
}
