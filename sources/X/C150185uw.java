package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;

/* renamed from: X.5uw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C150185uw extends AbstractC65781Prl implements InterfaceC88474Ynu<List<? extends Effect>, Boolean, Integer, String, C76800UCe> {
    public final /* synthetic */ C167676i3 LJLIL;
    public final /* synthetic */ C150145us LJLILLLLZI;
    public final /* synthetic */ Effect LJLJI;
    public final /* synthetic */ InterfaceC88474Ynu<List<? extends Effect>, Boolean, Integer, String, List<Effect>> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C150185uw(C167676i3 c167676i3, C150145us c150145us, Effect effect, InterfaceC88474Ynu<? super List<? extends Effect>, ? super Boolean, ? super Integer, ? super String, ? extends List<? extends Effect>> interfaceC88474Ynu) {
        super(4);
        this.LJLIL = c167676i3;
        this.LJLILLLLZI = c150145us;
        this.LJLJI = effect;
        this.LJLJJI = interfaceC88474Ynu;
    }

    @Override // X.InterfaceC88474Ynu
    public final C76800UCe invoke(List<? extends Effect> list, Boolean bool, Integer num, String str) {
        List<? extends Effect> list2 = list;
        if (bool.booleanValue()) {
            C167676i3 c167676i3 = this.LJLIL;
            C150145us c150145us = this.LJLILLLLZI;
            Effect effect = this.LJLJI;
            if (effect == null) {
                effect = new Effect(null, 1, null);
            }
            c167676i3.LJII(list2, c150145us, effect);
        } else if (list2 != null) {
            InterfaceC88474Ynu<List<? extends Effect>, Boolean, Integer, String, List<Effect>> interfaceC88474Ynu = this.LJLJJI;
            C167676i3 c167676i32 = this.LJLIL;
            C150145us c150145us2 = this.LJLILLLLZI;
            Effect effect2 = this.LJLJI;
            List<Effect> invoke = interfaceC88474Ynu.invoke(list2, Boolean.FALSE, num, str);
            if (invoke != null) {
                c167676i32.LJII(invoke, c150145us2, effect2);
            }
        }
        return C76800UCe.LIZ;
    }
}
