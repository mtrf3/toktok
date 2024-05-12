package X;

import com.bytedance.ies.effectcreator.swig.Canvas;
import com.bytedance.ies.effectcreator.swig.Feature;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;

/* renamed from: X.acK, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94148acK implements InterfaceC93942aZ0 {
    public final /* synthetic */ XJL LIZ;
    public final /* synthetic */ Feature LIZIZ;

    @Override // X.InterfaceC93942aZ0
    public final void LIZ() {
        boolean z;
        Canvas LJ;
        C93829aXB LJI = CKEffectEditorContext.LJI();
        if (LJI != null && (LJ = LJI.LJ()) != null) {
            z = LJ.isCompatibleWithFeatureID(this.LIZIZ.id());
        } else {
            z = true;
        }
        XJL xjl = this.LIZ;
        Boolean valueOf = Boolean.valueOf(z);
        C3C5.m7constructorimpl(valueOf);
        xjl.resumeWith(valueOf);
    }

    public C94148acK(XKS xks, Feature feature) {
        this.LIZ = xks;
        this.LIZIZ = feature;
    }
}
