package X;

import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;

/* renamed from: X.WbC, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82590WbC implements InterfaceC82611WbX {
    public final /* synthetic */ C82589WbB LIZ;
    public final /* synthetic */ InterfaceC88473Ynt<List<? extends Effect>, Integer, String, C76800UCe> LIZIZ;

    @Override // X.InterfaceC82611WbX
    public final void LIZJ() {
    }

    @Override // X.InterfaceC82611WbX
    public final void LIZ(CategoryPageModel categoryPageModel) {
        List<String> list;
        List<Effect> list2;
        CategoryEffectModel categoryEffects;
        List<Effect> effects;
        CategoryEffectModel categoryEffects2;
        C82589WbB c82589WbB = this.LIZ;
        if (categoryPageModel != null) {
            list = categoryPageModel.getUrl_prefix();
        } else {
            list = null;
        }
        c82589WbB.LIZ = list;
        InterfaceC88473Ynt<List<? extends Effect>, Integer, String, C76800UCe> interfaceC88473Ynt = this.LIZIZ;
        if (categoryPageModel != null && (categoryEffects2 = categoryPageModel.getCategoryEffects()) != null) {
            list2 = categoryEffects2.getEffects();
        } else {
            list2 = null;
        }
        interfaceC88473Ynt.invoke(list2, null, null);
        if (categoryPageModel != null && (categoryEffects = categoryPageModel.getCategoryEffects()) != null && (effects = categoryEffects.getEffects()) != null) {
            effects.isEmpty();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C82590WbC(C82589WbB c82589WbB, InterfaceC88473Ynt<? super List<? extends Effect>, ? super Integer, ? super String, C76800UCe> interfaceC88473Ynt) {
        this.LIZ = c82589WbB;
        this.LIZIZ = interfaceC88473Ynt;
    }

    @Override // X.InterfaceC82611WbX
    public final void LIZIZ(int i, String str) {
        this.LIZIZ.invoke(null, Integer.valueOf(i), str);
    }
}
