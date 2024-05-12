package X;

import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;

/* renamed from: X.5cq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C138965cq implements InterfaceC169466kw {
    public final /* synthetic */ InterfaceC88472Yns<Boolean, C76800UCe> LIZ;

    @Override // X.InterfaceC169466kw
    public final void LIZIZ() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C138965cq(InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        this.LIZ = interfaceC88472Yns;
    }

    @Override // X.InterfaceC169466kw
    public final void LIZ(CategoryPageModel categoryPageModel) {
        CategoryEffectModel categoryEffects;
        List<Effect> effects;
        if (categoryPageModel != null && (categoryEffects = categoryPageModel.getCategoryEffects()) != null && (effects = categoryEffects.getEffects()) != null && !effects.isEmpty()) {
            this.LIZ.invoke(Boolean.TRUE);
        } else {
            this.LIZ.invoke(Boolean.FALSE);
        }
    }

    @Override // X.InterfaceC169466kw
    public final void LIZJ(int i, String str) {
        this.LIZ.invoke(Boolean.FALSE);
    }
}
