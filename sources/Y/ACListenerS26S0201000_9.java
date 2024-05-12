package Y;

import X.C54691LdH;
import X.C54694LdK;
import X.C54695LdL;
import X.C57523Mhr;
import X.C6ZT;
import X.C78856UxA;
import X.LYU;
import X.MJG;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.discover.ui.DiscoverAndSearchFragment;
import com.ss.android.ugc.aweme.friends.model.RecommendContact;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class ACListenerS26S0201000_9 implements View.OnClickListener {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            case 3:
                onClick$3(this, view);
                return;
            case 4:
                onClick$4(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS26S0201000_9 aCListenerS26S0201000_9, View view) {
        AObjectS142S0100000_9 aObjectS142S0100000_9 = ((C57523Mhr) aCListenerS26S0201000_9.l0).LJLJL;
        if (aObjectS142S0100000_9 != null) {
            aObjectS142S0100000_9.invoke((RecommendContact) aCListenerS26S0201000_9.l1, Integer.valueOf(aCListenerS26S0201000_9.i2));
        }
    }

    public static final void onClick$1(ACListenerS26S0201000_9 aCListenerS26S0201000_9, View view) {
        MJG mjg = ((DiscoverAndSearchFragment) aCListenerS26S0201000_9.l0).LJLJJLL;
        if (mjg != null) {
            mjg.LJLLILLLL = aCListenerS26S0201000_9.i2;
        }
        ((C78856UxA) aCListenerS26S0201000_9.l1).LIZIZ();
    }

    public static final void onClick$2(ACListenerS26S0201000_9 aCListenerS26S0201000_9, View view) {
        if (!C6ZT.LIZ(((C54691LdH) aCListenerS26S0201000_9.l0).LJLJLLL)) {
            ((C54691LdH) aCListenerS26S0201000_9.l0).LJLIL = aCListenerS26S0201000_9.i2;
            LYU.LIZLLL();
            C54691LdH c54691LdH = (C54691LdH) aCListenerS26S0201000_9.l0;
            Context context = c54691LdH.itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            C54691LdH c54691LdH2 = (C54691LdH) aCListenerS26S0201000_9.l0;
            c54691LdH.V(context, c54691LdH2.LJLLL, (List) aCListenerS26S0201000_9.l1, c54691LdH2.LJLL.getWidth(), ((C54691LdH) aCListenerS26S0201000_9.l0).LJLL.getHeight());
            LYU.LIZIZ();
        }
    }

    public static final void onClick$3(ACListenerS26S0201000_9 aCListenerS26S0201000_9, View view) {
        if (!C6ZT.LIZ(((C54695LdL) aCListenerS26S0201000_9.l0).LJLJJL)) {
            ((C54695LdL) aCListenerS26S0201000_9.l0).LJLIL = aCListenerS26S0201000_9.i2;
            LYU.LIZLLL();
            C54695LdL c54695LdL = (C54695LdL) aCListenerS26S0201000_9.l0;
            Context context = c54695LdL.itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            C54695LdL c54695LdL2 = (C54695LdL) aCListenerS26S0201000_9.l0;
            c54695LdL.V(context, c54695LdL2.LJLLI, (List) aCListenerS26S0201000_9.l1, c54695LdL2.LJLJJLL.getWidth(), ((C54695LdL) aCListenerS26S0201000_9.l0).LJLJJLL.getHeight());
            LYU.LIZIZ();
        }
    }

    public static final void onClick$4(ACListenerS26S0201000_9 aCListenerS26S0201000_9, View view) {
        if (!C6ZT.LIZ(((C54694LdK) aCListenerS26S0201000_9.l0).LJLJJL)) {
            ((C54694LdK) aCListenerS26S0201000_9.l0).LJLIL = aCListenerS26S0201000_9.i2;
            LYU.LIZLLL();
            C54694LdK c54694LdK = (C54694LdK) aCListenerS26S0201000_9.l0;
            Context context = c54694LdK.itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            C54694LdK c54694LdK2 = (C54694LdK) aCListenerS26S0201000_9.l0;
            c54694LdK.V(context, c54694LdK2.LJLL, (List) aCListenerS26S0201000_9.l1, c54694LdK2.LJLJJLL.getWidth(), ((C54694LdK) aCListenerS26S0201000_9.l0).LJLJJLL.getHeight());
        }
    }

    public ACListenerS26S0201000_9(Object obj, Object obj2, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.i2 = i;
    }
}
