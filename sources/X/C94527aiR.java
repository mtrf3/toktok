package X;

import android.os.Bundle;
import android.view.View;
import com.bytedance.effectcreatormobile.behaviour.view.eidt.BehaviourEditFragment;
import kotlin.jvm.internal.IDqS196S0200000_42;
import kotlin.jvm.internal.o;

/* renamed from: X.aiR, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94527aiR extends AbstractC65781Prl implements InterfaceC88472Yns<View, C76800UCe> {
    public final /* synthetic */ IDqS196S0200000_42 LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ EnumC93441aQv LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94527aiR(IDqS196S0200000_42 iDqS196S0200000_42, int i, int i2, EnumC93441aQv enumC93441aQv) {
        super(1);
        this.LJLIL = iDqS196S0200000_42;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = enumC93441aQv;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(View it) {
        o.LJIIIZ(it, "it");
        BehaviourEditFragment behaviourEditFragment = (BehaviourEditFragment) this.LJLIL.l0;
        int i = this.LJLILLLLZI;
        Bundle arguments = behaviourEditFragment.getArguments();
        if (arguments != null) {
            arguments.putInt("cke_behaviour_command_position_key", i);
        }
        ((BehaviourEditFragment) this.LJLIL.l0).Ll().lv0(this.LJLJI, this.LJLJJI, false);
        IDqS196S0200000_42 iDqS196S0200000_42 = this.LJLIL;
        ((BehaviourEditFragment) iDqS196S0200000_42.l0).Ql((AbstractC94370afu) iDqS196S0200000_42.l1);
        return C76800UCe.LIZ;
    }
}
