package Y;

import X.C12460eI;
import X.C2NU;
import X.C36223EJn;
import X.C39032FTo;
import X.C40889G2z;
import X.C5S1;
import X.C794039s;
import X.E2F;
import X.E2G;
import X.E2H;
import X.FMX;
import X.G2H;
import X.G2Y;
import X.G30;
import X.G38;
import X.G39;
import X.G3F;
import X.G3G;
import X.OSZ;
import X.T16;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.journey.step.interestselector.AbstractSelectInterestFragment;
import com.ss.android.ugc.aweme.plugin.journey.TopicInterestCategoryItemStruct;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes7.dex */
public class ACListenerS41S0200000_6 implements View.OnClickListener {
    public final int $t;
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

    public static final void onClick$0(ACListenerS41S0200000_6 aCListenerS41S0200000_6, View view) {
        int adapterPosition = ((G38) aCListenerS41S0200000_6.l0).getAdapterPosition() - 1;
        boolean isSelected = ((G38) aCListenerS41S0200000_6.l0).itemView.findViewById(R.id.eqo).isSelected();
        if (isSelected) {
            ((G30) aCListenerS41S0200000_6.l1).LJLJJLL.remove(Integer.valueOf(adapterPosition));
        } else {
            ((G30) aCListenerS41S0200000_6.l1).LJLJJLL.add(Integer.valueOf(adapterPosition));
        }
        ((G38) aCListenerS41S0200000_6.l0).L(!isSelected);
        G30 g30 = (G30) aCListenerS41S0200000_6.l1;
        g30.LJLJI.invoke(Integer.valueOf(g30.LJLJJLL.size()));
    }

    public static final void onClick$1(ACListenerS41S0200000_6 aCListenerS41S0200000_6, View view) {
        String str;
        TopicInterestCategoryItemStruct topicInterestCategoryItemStruct;
        int adapterPosition = ((G3F) aCListenerS41S0200000_6.l0).getAdapterPosition();
        boolean isSelected = ((G3F) aCListenerS41S0200000_6.l0).itemView.findViewById(R.id.eqm).isSelected();
        G3G g3g = (G3G) aCListenerS41S0200000_6.l1;
        int i = g3g.LJLJI;
        List<TopicInterestCategoryItemStruct> list = g3g.LJLIL;
        if (list == null || (topicInterestCategoryItemStruct = (TopicInterestCategoryItemStruct) ListProtector.get(list, adapterPosition)) == null || (str = topicInterestCategoryItemStruct.id) == null) {
            str = "";
        }
        G2Y g2y = new G2Y(i, str, adapterPosition);
        if (isSelected) {
            ((G3G) aCListenerS41S0200000_6.l1).LJLJJI.remove(g2y);
        } else {
            ((G3G) aCListenerS41S0200000_6.l1).LJLJJI.add(g2y);
        }
        ((G3F) aCListenerS41S0200000_6.l0).L(!isSelected);
        G3G g3g2 = (G3G) aCListenerS41S0200000_6.l1;
        g3g2.LJLILLLLZI.invoke(Integer.valueOf(g3g2.LJLJJI.size()));
    }

    public static final void onClick$2(ACListenerS41S0200000_6 aCListenerS41S0200000_6, View view) {
        boolean z;
        if (a.LJIJJ().LJ(null)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            G2H event = G2H.INTEREST_SELECTION_SKIP_CLICK_IGNORE;
            OSZ[] oszArr = {new OSZ("reason", "not_confirm_consent")};
            o.LJIIIZ(event, "event");
            FMX.LJIILL(event.toString(), (OSZ[]) Arrays.copyOf(oszArr, 1));
            return;
        }
        view.getContext();
        if (C2NU.LIZ.LIZIZ()) {
            AbstractSelectInterestFragment abstractSelectInterestFragment = (AbstractSelectInterestFragment) aCListenerS41S0200000_6.l0;
            abstractSelectInterestFragment.LJLL = true;
            C39032FTo Kl = abstractSelectInterestFragment.Kl();
            C794039s.LIZ.uploadInterest(Kl.LIZ, null, Kl.LIZLLL).LJJL(T16.LIZ()).LJIJJ(E2F.LJLIL).LJJJLIIL(E2G.LJLIL, E2H.LJLIL);
            ((AbstractSelectInterestFragment) aCListenerS41S0200000_6.l0).Jl(Kl.LIZJ, "done", Kl.LIZIZ);
            ((AbstractSelectInterestFragment) aCListenerS41S0200000_6.l0).vl(Boolean.FALSE);
            if (o.LJ((Boolean) aCListenerS41S0200000_6.l1, Boolean.TRUE)) {
                C12460eI.LJIILJJIL(((AbstractSelectInterestFragment) aCListenerS41S0200000_6.l0).Dl(), "c7753", "d8838", null, null);
                return;
            } else {
                C12460eI.LJIILJJIL(((AbstractSelectInterestFragment) aCListenerS41S0200000_6.l0).Dl(), "c0639", "d0584", null, null);
                return;
            }
        }
        C5S1 c5s1 = new C5S1(view.getContext());
        c5s1.LIZJ(R.string.img);
        c5s1.LJ();
        G2H event2 = G2H.INTEREST_SELECTION_SKIP_CLICK_IGNORE;
        OSZ[] oszArr2 = {new OSZ("reason", "network")};
        o.LJIIIZ(event2, "event");
        FMX.LJIILL(event2.toString(), (OSZ[]) Arrays.copyOf(oszArr2, 1));
    }

    public static final void onClick$3(ACListenerS41S0200000_6 aCListenerS41S0200000_6, View view) {
        if (a.LJIJJ().LJ(null)) {
            C36223EJn.LIZ.onEventV3(G2H.INTEREST_SELECTION_DONE_CLICK_IGNORE);
            return;
        }
        AbstractSelectInterestFragment abstractSelectInterestFragment = (AbstractSelectInterestFragment) aCListenerS41S0200000_6.l0;
        abstractSelectInterestFragment.LJLL = true;
        C39032FTo Kl = abstractSelectInterestFragment.Kl();
        ((AbstractSelectInterestFragment) aCListenerS41S0200000_6.l0).Jl(Kl.LIZJ, "skip", Kl.LIZIZ);
        AbstractSelectInterestFragment abstractSelectInterestFragment2 = (AbstractSelectInterestFragment) aCListenerS41S0200000_6.l0;
        Boolean bool = Boolean.TRUE;
        abstractSelectInterestFragment2.vl(bool);
        if (o.LJ((Boolean) aCListenerS41S0200000_6.l1, bool)) {
            TextView textView = ((AbstractSelectInterestFragment) aCListenerS41S0200000_6.l0).LJLLL;
            if (textView != null) {
                C12460eI.LJIILJJIL(textView, "c7355", "d9090", null, null);
                return;
            } else {
                o.LJIJI("finalSkip");
                throw null;
            }
        }
        TextView textView2 = ((AbstractSelectInterestFragment) aCListenerS41S0200000_6.l0).LJLLL;
        if (textView2 != null) {
            C12460eI.LJIILJJIL(textView2, "c0639", "d8211", null, null);
        } else {
            o.LJIJI("finalSkip");
            throw null;
        }
    }

    public static final void onClick$4(ACListenerS41S0200000_6 aCListenerS41S0200000_6, View view) {
        int adapterPosition = ((G39) aCListenerS41S0200000_6.l0).getAdapterPosition() - 1;
        if (((G39) aCListenerS41S0200000_6.l0).itemView.findViewById(R.id.b_j).isSelected()) {
            ((C40889G2z) aCListenerS41S0200000_6.l1).LJLJJL.remove(Integer.valueOf(adapterPosition));
        } else {
            ((C40889G2z) aCListenerS41S0200000_6.l1).LJLJJL.add(Integer.valueOf(adapterPosition));
        }
        ((ImageView) ((G39) aCListenerS41S0200000_6.l0).itemView.findViewById(R.id.b_j)).setSelected(!((G39) aCListenerS41S0200000_6.l0).itemView.findViewById(R.id.b_j).isSelected());
        C40889G2z c40889G2z = (C40889G2z) aCListenerS41S0200000_6.l1;
        c40889G2z.LJLJI.invoke(Integer.valueOf(c40889G2z.LJLJJL.size()));
    }

    public ACListenerS41S0200000_6(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
