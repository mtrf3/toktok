package X;

import Y.ACListenerS21S0100000_1;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsAuthCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.Mnr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ViewOnLongClickListenerC57895Mnr implements View.OnLongClickListener {
    public final /* synthetic */ AbsAuthCell<ITEM> LJLIL;
    public final /* synthetic */ C57900Mnw LJLILLLLZI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJI;

    public ViewOnLongClickListenerC57895Mnr(AbsAuthCell absAuthCell, C57900Mnw c57900Mnw, AqS156S0200000_9 aqS156S0200000_9) {
        this.LJLIL = absAuthCell;
        this.LJLILLLLZI = c57900Mnw;
        this.LJLJI = aqS156S0200000_9;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        ActivityC45651qj activityC45651qj;
        Context Q = this.LJLIL.Q();
        if (Q instanceof ActivityC45651qj) {
            activityC45651qj = (ActivityC45651qj) Q;
        } else {
            activityC45651qj = null;
        }
        if (activityC45651qj == null) {
            return false;
        }
        C57900Mnw c57900Mnw = this.LJLILLLLZI;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJI;
        C245319jz c245319jz = new C245319jz();
        C252669vq LIZIZ = C06530Nl.LIZIZ(R.string.efd);
        LIZIZ.LIZJ = 1;
        LIZIZ.LJ = new ACListenerS21S0100000_1(new AqS175S0100000_9(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 252), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
        c245319jz.LIZIZ(LIZIZ);
        TuxActionSheet LIZJ = c245319jz.LIZJ();
        FragmentManager supportFragmentManager = activityC45651qj.getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "it.supportFragmentManager");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(c57900Mnw.LJLIL);
        LIZ.append("_auth_cell");
        LIZJ.show(supportFragmentManager, X1D.LIZIZ(LIZ));
        return true;
    }
}
