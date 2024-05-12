package Y;

import X.C00F;
import X.C54688LdE;
import X.C54690LdG;
import X.C54693LdJ;
import X.C6ZT;
import X.C86904Y8u;
import X.FRW;
import X.InterfaceC86908Y8y;
import X.LYU;
import X.MFY;
import X.MFZ;
import X.VW9;
import android.content.Context;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class ACListenerS20S0301000_9 implements View.OnClickListener {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

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

    public static final void onClick$0(ACListenerS20S0301000_9 aCListenerS20S0301000_9, View view) {
        if (!((C86904Y8u) aCListenerS20S0301000_9.l2).LJLJL) {
            return;
        }
        InterfaceC86908Y8y interfaceC86908Y8y = (InterfaceC86908Y8y) aCListenerS20S0301000_9.l0;
        if (interfaceC86908Y8y != null) {
            interfaceC86908Y8y.LIZJ(1);
        }
        MFY.LIZ = new MFZ(System.currentTimeMillis(), 62);
        ((ViewPager) aCListenerS20S0301000_9.l1).setCurrentItem(aCListenerS20S0301000_9.i3);
    }

    public static final void onClick$1(ACListenerS20S0301000_9 aCListenerS20S0301000_9, View view) {
        String str;
        C86904Y8u c86904Y8u = (C86904Y8u) aCListenerS20S0301000_9.l0;
        InterfaceC86908Y8y interfaceC86908Y8y = (InterfaceC86908Y8y) aCListenerS20S0301000_9.l1;
        ViewPager viewPager = (ViewPager) aCListenerS20S0301000_9.l2;
        int i = aCListenerS20S0301000_9.i3;
        c86904Y8u.getClass();
        if (C00F.LIZ(31744, 0, "favorite_fragment_power_viewpager", true) > 0) {
            str = "favorite_tti_full_power_viewpager";
        } else {
            str = "favorite_tti_full";
        }
        FRW.LIZLLL(str);
        if (!c86904Y8u.LJLJL) {
            return;
        }
        if (interfaceC86908Y8y != null) {
            interfaceC86908Y8y.LIZJ(8);
        }
        viewPager.setCurrentItem(i);
    }

    public static final void onClick$2(ACListenerS20S0301000_9 aCListenerS20S0301000_9, View view) {
        if (!C6ZT.LIZ(((C54690LdG) aCListenerS20S0301000_9.l0).LJLJLLL)) {
            ((C54690LdG) aCListenerS20S0301000_9.l0).LJLIL = aCListenerS20S0301000_9.i3;
            LYU.LIZLLL();
            C54690LdG c54690LdG = (C54690LdG) aCListenerS20S0301000_9.l0;
            Context context = c54690LdG.itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            c54690LdG.V(context, (FollowingInterestUser) aCListenerS20S0301000_9.l1, (List) aCListenerS20S0301000_9.l2, ((C54690LdG) aCListenerS20S0301000_9.l0).LJLLI.getWidth(), ((C54690LdG) aCListenerS20S0301000_9.l0).LJLLI.getHeight());
            LYU.LIZIZ();
        }
    }

    public static final void onClick$3(ACListenerS20S0301000_9 aCListenerS20S0301000_9, View view) {
        if (!C6ZT.LIZ(((C54693LdJ) aCListenerS20S0301000_9.l0).LJLJJI)) {
            ((C54693LdJ) aCListenerS20S0301000_9.l0).LJLIL = aCListenerS20S0301000_9.i3;
            LYU.LIZLLL();
            C54693LdJ c54693LdJ = (C54693LdJ) aCListenerS20S0301000_9.l0;
            Context context = c54693LdJ.itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            c54693LdJ.V(context, (FollowingInterestUser) aCListenerS20S0301000_9.l1, (List) aCListenerS20S0301000_9.l2, ((C54693LdJ) aCListenerS20S0301000_9.l0).LJLJJLL.getWidth(), ((C54693LdJ) aCListenerS20S0301000_9.l0).LJLJJLL.getHeight());
        }
    }

    public static final void onClick$4(ACListenerS20S0301000_9 aCListenerS20S0301000_9, View view) {
        if (!C6ZT.LIZ(((C54688LdE) aCListenerS20S0301000_9.l0).LJLJJL)) {
            ((C54688LdE) aCListenerS20S0301000_9.l0).LJLIL = aCListenerS20S0301000_9.i3;
            LYU.LIZLLL();
            C54688LdE c54688LdE = (C54688LdE) aCListenerS20S0301000_9.l0;
            Context context = c54688LdE.itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            c54688LdE.V(context, (FollowingInterestUser) aCListenerS20S0301000_9.l1, (List) aCListenerS20S0301000_9.l2, ((C54688LdE) aCListenerS20S0301000_9.l0).LJLJL.getWidth(), ((C54688LdE) aCListenerS20S0301000_9.l0).LJLJL.getHeight());
            LYU.LIZIZ();
        }
    }

    public ACListenerS20S0301000_9(C86904Y8u c86904Y8u, InterfaceC86908Y8y interfaceC86908Y8y, VW9 vw9, int i, int i2) {
        this.$t = i2;
        switch (i2) {
            case 0:
                this.l2 = c86904Y8u;
                this.l0 = interfaceC86908Y8y;
                this.l1 = vw9;
                this.i3 = i;
                return;
            default:
                this.l0 = c86904Y8u;
                this.l1 = interfaceC86908Y8y;
                this.l2 = vw9;
                this.i3 = i;
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ACListenerS20S0301000_9(Object obj, C54690LdG c54690LdG, int i, FollowingInterestUser followingInterestUser, List<FollowingInterestUser> list) {
        this.$t = list;
        this.l0 = obj;
        this.i3 = c54690LdG;
        this.l1 = i;
        this.l2 = followingInterestUser;
    }
}
