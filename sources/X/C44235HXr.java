package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.HXr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44235HXr<T> implements InterfaceC73592SuS {
    public final /* synthetic */ C44226HXi LJLIL;

    public C44235HXr(C44226HXi c44226HXi) {
        this.LJLIL = c44226HXi;
    }

    @Override // X.InterfaceC73592SuS
    public final boolean test(Object obj) {
        String str;
        Effect effect;
        TO8 it = (TO8) obj;
        o.LJIIIZ(it, "it");
        String effect_id = ((C74397THt) it.LJLILLLLZI).LJLIL.getEffect_id();
        C44229HXl c44229HXl = this.LJLIL.LJLLJ;
        if (c44229HXl != null && (effect = c44229HXl.LIZ) != null) {
            str = effect.getEffect_id();
        } else {
            str = null;
        }
        return ujb.o.LJJJJIZL(effect_id, str, true);
    }
}
