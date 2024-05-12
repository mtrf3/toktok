package X;

import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.IDqS427S0100000_2;

/* renamed from: X.WbB, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82589WbB implements InterfaceC167686i4 {
    public List<String> LIZ;

    @Override // X.InterfaceC167686i4
    public final void onDestroy() {
    }

    @Override // X.InterfaceC167686i4
    public final void LIZ(InterfaceC88473Ynt<? super List<? extends Effect>, ? super Integer, ? super String, C76800UCe> interfaceC88473Ynt) {
        ((C82609WbV) C82609WbV.LIZJ.getValue()).LIZ(new C82590WbC(this, interfaceC88473Ynt));
    }

    @Override // X.InterfaceC167686i4
    public final void LIZIZ(IDqS427S0100000_2 iDqS427S0100000_2) {
        List<Effect> list;
        CategoryEffectModel categoryEffects = C149905uU.LIZ().getCategoryEffects();
        if (categoryEffects != null) {
            list = categoryEffects.getEffects();
        } else {
            list = null;
        }
        iDqS427S0100000_2.invoke(list, null, null);
    }
}
