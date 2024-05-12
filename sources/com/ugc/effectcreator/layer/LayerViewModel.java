package com.ugc.effectcreator.layer;

import X.AbstractC94471ahX;
import X.C93624aTs;
import X.C93829aXB;
import X.C94220adU;
import X.EnumC93711aVH;
import X.InterfaceC94376ag0;
import com.bytedance.ies.effectcreator.swig.Canvas;
import com.bytedance.ies.effectcreator.swig.Feature;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;
import com.ugc.effectcreator.foundation.viewmodel.StateViewModel;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.IDqS423S0100000_42;

/* loaded from: classes34.dex */
public final class LayerViewModel extends StateViewModel {
    public final C93624aTs<List<AbstractC94471ahX<InterfaceC94376ag0>>> LJLILLLLZI = new C93624aTs<>();
    public final AtomicBoolean LJLJI = new AtomicBoolean(true);
    public final EnumC93711aVH[] LJLJJI = {EnumC93711aVH.FeatureType_Filter, EnumC93711aVH.FeatureType_Makeup, EnumC93711aVH.FeatureType_FaceDistortion};

    public final void iv0() {
        CKEffectEditorContext.LIZLLL(new IDqS423S0100000_42(this, 115));
    }

    public static boolean jv0(C94220adU c94220adU) {
        Feature LJFF;
        C93829aXB LJI;
        Canvas LJ;
        C93829aXB LJI2 = CKEffectEditorContext.LJI();
        if (LJI2 != null && (LJFF = LJI2.LJFF(c94220adU.LJLIL)) != null && (LJI = CKEffectEditorContext.LJI()) != null && (LJ = LJI.LJ()) != null) {
            return LJ.isCompatibleWithFeatureID(LJFF.id());
        }
        return true;
    }
}
