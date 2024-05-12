package X;

import Y.IDObjectS0S0101000;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.effectcreatormobile.behaviour.view.eidt.BehaviourEditFragment;
import com.bytedance.effectcreatormobile.behaviour.view.preview.BehaviourPreviewFragment;
import com.bytedance.effectcreatormobile.behaviour.view.preview.CommandCardTransition;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.aiW, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94532aiW extends AbstractC65781Prl implements InterfaceC88472Yns<View, C76800UCe> {
    public final /* synthetic */ C94530aiU LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ View LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94532aiW(int i, View view, C94530aiU c94530aiU) {
        super(1);
        this.LJLIL = c94530aiU;
        this.LJLILLLLZI = i;
        this.LJLJI = view;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(View it) {
        int i;
        Object obj;
        RecyclerView recyclerView;
        o.LJIIIZ(it, "it");
        C94530aiU c94530aiU = this.LJLIL;
        BehaviourPreviewFragment behaviourPreviewFragment = c94530aiU.LJLIL;
        C94526aiQ c94526aiQ = c94530aiU.LJLJI;
        C93815aWx c93815aWx = c94530aiU.LJLJJI;
        int i2 = this.LJLILLLLZI;
        View view = this.LJLJI;
        behaviourPreviewFragment.getClass();
        boolean Kl = BehaviourPreviewFragment.Kl(view);
        C94194ad4 c94194ad4 = (C94194ad4) behaviourPreviewFragment.Al();
        if (c94194ad4 != null && (recyclerView = c94194ad4.LJLJI) != null) {
            Iterator<View> it2 = C78924UyG.LIZLLL(recyclerView).iterator();
            while (true) {
                IDObjectS0S0101000 iDObjectS0S0101000 = (IDObjectS0S0101000) it2;
                if (!iDObjectS0S0101000.hasNext()) {
                    break;
                }
                ((View) iDObjectS0S0101000.next()).setTransitionName("");
            }
        }
        List<C93815aWx> value = behaviourPreviewFragment.Jl().LJLILLLLZI.LIZ.getValue();
        if (value != null) {
            i = value.indexOf(c93815aWx);
        } else {
            i = -1;
        }
        Bundle arguments = behaviourPreviewFragment.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putInt("cke_behaviour_share_element_position", i);
        arguments.putInt("cke_behaviour_edit_command_index", i);
        behaviourPreviewFragment.setArguments(arguments);
        Fragment behaviourEditFragment = new BehaviourEditFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("cke_behaviour_command_key", i);
        bundle.putInt("cke_behaviour_command_position_key", i2);
        bundle.putBoolean("cke_behaviour_command_init_show_keyboard", Kl);
        behaviourEditFragment.setArguments(bundle);
        CommandCardTransition commandCardTransition = new CommandCardTransition();
        BehaviourPreviewFragment.Ml(behaviourPreviewFragment, commandCardTransition);
        behaviourEditFragment.setSharedElementEnterTransition(commandCardTransition);
        CommandCardTransition commandCardTransition2 = new CommandCardTransition();
        BehaviourPreviewFragment.Ml(behaviourPreviewFragment, commandCardTransition2);
        behaviourEditFragment.setSharedElementReturnTransition(commandCardTransition2);
        C40241i0 c40241i0 = new C40241i0();
        BehaviourPreviewFragment.Ml(behaviourPreviewFragment, c40241i0);
        behaviourPreviewFragment.setExitTransition(c40241i0);
        C40241i0 c40241i02 = new C40241i0();
        BehaviourPreviewFragment.Ml(behaviourPreviewFragment, c40241i02);
        behaviourPreviewFragment.setEnterTransition(c40241i02);
        c94526aiQ.setTransitionName(behaviourPreviewFragment.getString(R.string.tz8));
        View view2 = behaviourPreviewFragment.getView();
        if (view2 != null) {
            obj = view2.getParent();
        } else {
            obj = null;
        }
        if (!(obj instanceof View)) {
            obj = null;
        }
        View view3 = (View) obj;
        if (view3 != null) {
            int id = view3.getId();
            FragmentManager fragmentManager = behaviourPreviewFragment.getFragmentManager();
            if (fragmentManager != null) {
                C1B3 c1b3 = new C1B3(fragmentManager);
                c1b3.LJIILL = true;
                c1b3.LIZLLL(c94526aiQ, c94526aiQ.getTransitionName());
                c1b3.LJIIJ(behaviourEditFragment, null, id);
                c1b3.LJ(null);
                c1b3.LJIILJJIL();
            }
        }
        return C76800UCe.LIZ;
    }
}
