package X;

import android.content.Context;
import com.bytedance.effectcreatormobile.behaviour.view.preview.BehaviourPreviewFragment;
import com.bytedance.effectcreatormobile.behaviour.viewmodel.PreviewViewModel;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.dialog.IDialog;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.statistic.StatisticReporter;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS419S0100000_42;
import kotlin.jvm.internal.o;

/* renamed from: X.ab9, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94075ab9 implements InterfaceC93836aXI {
    public final /* synthetic */ IDqS419S0100000_42 LIZ;

    @Override // X.InterfaceC93836aXI
    public final void LIZ() {
        StatisticReporter LIZ = C93670aUc.LIZ();
        if (LIZ != null) {
            LIZ.onEvent("interaction_command_action", C51029K0z.LJJIIZI(new OSZ("action_type", "click_edit")));
        }
        PreviewViewModel Jl = ((C94530aiU) this.LIZ.l0).LJLIL.Jl();
        AbstractC94370afu command = ((C94530aiU) this.LIZ.l0).LJLILLLLZI;
        Jl.getClass();
        o.LJIIIZ(command, "command");
        Jl.LJLJI = true;
        Jl.jv0(command);
        C94530aiU c94530aiU = (C94530aiU) this.LIZ.l0;
        c94530aiU.LJLIL.Ll(c94530aiU.LJLILLLLZI);
    }

    @Override // X.InterfaceC93836aXI
    public final void LIZIZ() {
        StatisticReporter LIZ = C93670aUc.LIZ();
        if (LIZ != null) {
            LIZ.onEvent("interaction_command_action", C51029K0z.LJJIIZI(new OSZ("action_type", "click_delete")));
        }
        C94530aiU c94530aiU = (C94530aiU) this.LIZ.l0;
        BehaviourPreviewFragment behaviourPreviewFragment = c94530aiU.LJLIL;
        AbstractC94370afu abstractC94370afu = c94530aiU.LJLILLLLZI;
        behaviourPreviewFragment.getClass();
        IDialog LIZ2 = C93405aQL.LIZ();
        Context requireContext = behaviourPreviewFragment.requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        String string = behaviourPreviewFragment.requireContext().getString(R.string.h5);
        o.LJIIIIZZ(string, "requireContext().getStri…ool_deletecommand_header)");
        String string2 = behaviourPreviewFragment.requireContext().getString(R.string.h4);
        o.LJIIIIZZ(string2, "requireContext().getStri…_tool_deletecommand_body)");
        String string3 = behaviourPreviewFragment.requireContext().getString(R.string.fvx);
        o.LJIIIIZZ(string3, "requireContext().getStri…uageR.effect_tool_delete)");
        C93472aRQ.LIZ(LIZ2, requireContext, string, string2, string3, behaviourPreviewFragment.requireContext().getString(R.string.fvg), new C94264aeC(behaviourPreviewFragment, abstractC94370afu), null, null, null, null, 1984);
    }

    public C94075ab9(IDqS419S0100000_42 iDqS419S0100000_42) {
        this.LIZ = iDqS419S0100000_42;
    }
}
