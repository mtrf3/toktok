package Y;

import X.AnonymousClass745;
import X.C16880lQ;
import X.C169776lR;
import X.C170606mm;
import X.C174446sy;
import X.C178406zM;
import X.C228648yC;
import X.C228888ya;
import X.C26045AKb;
import X.C5MM;
import X.C71897SJp;
import X.InterfaceC57784Mm4;
import X.Q8U;
import X.SY4;
import X.SYL;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.mediaplayer.MediaPlayerModule;
import com.ss.android.ugc.aweme.mix.mixdetail.MixFeedManagerActivity;
import com.ss.android.ugc.aweme.mix.pickcandidate.AddMultiVideoFragment;
import com.ss.android.ugc.aweme.pns.agegate.ui.view.PNSAgeGateBaseFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class AObserverS59S0101000_3 implements Observer {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                return;
            case 1:
                onChanged$1(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void onChanged$0(AObserverS59S0101000_3 aObserverS59S0101000_3, Object obj) {
        Long l;
        boolean z = true;
        int i = 0;
        switch (aObserverS59S0101000_3.i1) {
            case 0:
                AnonymousClass745 anonymousClass745 = (AnonymousClass745) aObserverS59S0101000_3.l0;
                Boolean bool = (Boolean) obj;
                Comment comment = anonymousClass745.LLFF;
                if (comment != null && anonymousClass745.LJLJJL != null) {
                    if (comment.getAliasAweme() == null) {
                        z = false;
                    }
                    C71897SJp c71897SJp = anonymousClass745.LJLJJL;
                    if (bool.booleanValue()) {
                        if (z) {
                            i = 4;
                        }
                    } else {
                        i = 8;
                    }
                    c71897SJp.setVisibility(i);
                    if (bool.booleanValue()) {
                        anonymousClass745.Q();
                        return;
                    }
                    if (!anonymousClass745.LLIIZ && C178406zM.LJIIJ(anonymousClass745.LLIIJI)) {
                        anonymousClass745.a0();
                        anonymousClass745.Q();
                        return;
                    } else {
                        if (!C174446sy.LIZLLL(anonymousClass745.LLFF) && !anonymousClass745.LLIIL) {
                            anonymousClass745.g0();
                        }
                        anonymousClass745.a0();
                        return;
                    }
                }
                return;
            case 1:
                C169776lR c169776lR = (C169776lR) aObserverS59S0101000_3.l0;
                if (!c169776lR.LJJIL || (l = c169776lR.LJJII.getPlayBoundary().LIZ) == null) {
                    return;
                }
                c169776lR.LIZLLL.setValue(C5MM.LIZIZ(c169776lR.LJJIIZ.LIZ(l.intValue())));
                c169776lR.LJJIII();
                return;
            case 2:
                MediaPlayerModule mediaPlayerModule = (MediaPlayerModule) aObserverS59S0101000_3.l0;
                C170606mm c170606mm = (C170606mm) obj;
                mediaPlayerModule.getClass();
                if (c170606mm == null) {
                    return;
                }
                switch (c170606mm.LIZIZ) {
                    case 1:
                        if (!c170606mm.LIZ) {
                            return;
                        }
                        mediaPlayerModule.LJLJJL = true;
                        return;
                    case 2:
                    case 4:
                        mediaPlayerModule.LJLJJI = true;
                        return;
                    case 3:
                    case 5:
                        mediaPlayerModule.LJLJJI = false;
                        return;
                    case 6:
                        mediaPlayerModule.LJLJJL = false;
                        mediaPlayerModule.LJLJJI = false;
                        return;
                    default:
                        return;
                }
            default:
                PNSAgeGateBaseFragment fragment = (PNSAgeGateBaseFragment) aObserverS59S0101000_3.l0;
                Boolean it = (Boolean) obj;
                o.LJIIIZ(fragment, "$fragment");
                o.LJIIIIZZ(it, "it");
                fragment.Kl(it.booleanValue());
                return;
        }
    }

    public static final void onChanged$1(AObserverS59S0101000_3 aObserverS59S0101000_3, Object obj) {
        boolean z;
        Integer it = (Integer) obj;
        SY4 sy4 = (SY4) ((AddMultiVideoFragment) aObserverS59S0101000_3.l0)._$_findCachedViewById(R.id.h0u);
        o.LJIIIIZZ(it, "it");
        if (it.intValue() >= 1) {
            z = true;
        } else {
            z = false;
        }
        sy4.setEnabled(z);
        if (it.intValue() >= aObserverS59S0101000_3.i1) {
            if (((AddMultiVideoFragment) aObserverS59S0101000_3.l0).xl().LJLJL) {
                return;
            }
            AddMultiVideoFragment addMultiVideoFragment = (AddMultiVideoFragment) aObserverS59S0101000_3.l0;
            addMultiVideoFragment.LJLJJI = true;
            addMultiVideoFragment.xl().LJLJL = true;
            Iterator it2 = ((ArrayList) ((SYL) ((AddMultiVideoFragment) aObserverS59S0101000_3.l0)._$_findCachedViewById(R.id.igw)).getState().LJII()).iterator();
            int i = 0;
            while (it2.hasNext()) {
                int i2 = i + 1;
                InterfaceC57784Mm4 interfaceC57784Mm4 = (InterfaceC57784Mm4) it2.next();
                if (interfaceC57784Mm4 instanceof C228648yC) {
                    C228648yC c228648yC = (C228648yC) interfaceC57784Mm4;
                    if (!c228648yC.LJLILLLLZI) {
                        ((SYL) ((AddMultiVideoFragment) aObserverS59S0101000_3.l0)._$_findCachedViewById(R.id.igw)).getState().LJIILL(i, C228648yC.LIZ(c228648yC, true));
                    }
                }
                i = i2;
            }
            String string = ((AddMultiVideoFragment) aObserverS59S0101000_3.l0).getResources().getString(R.string.se4);
            o.LJIIIIZZ(string, "resources.getString(R.string.toast_99vids)");
            String LIZIZ = Q8U.LIZIZ(new Object[]{Integer.valueOf(aObserverS59S0101000_3.i1)}, 1, string, "format(format, *args)");
            C26045AKb c26045AKb = new C26045AKb((AddMultiVideoFragment) aObserverS59S0101000_3.l0);
            c26045AKb.LJIIIZ(LIZIZ);
            c26045AKb.LJIIJ();
            ((AddMultiVideoFragment) aObserverS59S0101000_3.l0).xl().LJLJJLL = false;
            if (((AddMultiVideoFragment) aObserverS59S0101000_3.l0).mo49getActivity() instanceof MixFeedManagerActivity) {
                C228888ya.LIZIZ(((AddMultiVideoFragment) aObserverS59S0101000_3.l0).wl().LJLILLLLZI, ((AddMultiVideoFragment) aObserverS59S0101000_3.l0).wl().LJLIL, "manage_video");
            } else {
                C228888ya.LIZIZ(((AddMultiVideoFragment) aObserverS59S0101000_3.l0).vl().LJLIL, ((AddMultiVideoFragment) aObserverS59S0101000_3.l0).vl().LJLILLLLZI, "create_playlist");
            }
        } else {
            AddMultiVideoFragment addMultiVideoFragment2 = (AddMultiVideoFragment) aObserverS59S0101000_3.l0;
            if (addMultiVideoFragment2.LJLJJI) {
                addMultiVideoFragment2.LJLJJI = false;
                Iterator it3 = ((ArrayList) ((SYL) addMultiVideoFragment2._$_findCachedViewById(R.id.igw)).getState().LJII()).iterator();
                int i3 = 0;
                while (it3.hasNext()) {
                    int i4 = i3 + 1;
                    InterfaceC57784Mm4 interfaceC57784Mm42 = (InterfaceC57784Mm4) it3.next();
                    if (interfaceC57784Mm42 instanceof C228648yC) {
                        C228648yC c228648yC2 = (C228648yC) interfaceC57784Mm42;
                        if (!c228648yC2.LJLJJI && !c228648yC2.LJLILLLLZI) {
                            ((SYL) ((AddMultiVideoFragment) aObserverS59S0101000_3.l0)._$_findCachedViewById(R.id.igw)).getState().LJIILL(i3, C228648yC.LIZ(c228648yC2, false));
                        }
                    }
                    i3 = i4;
                }
                ((AddMultiVideoFragment) aObserverS59S0101000_3.l0).xl().LJLJJLL = true;
            }
        }
        if (!(((AddMultiVideoFragment) aObserverS59S0101000_3.l0).mo49getActivity() instanceof MixFeedManagerActivity)) {
            TextView textView = (TextView) ((AddMultiVideoFragment) aObserverS59S0101000_3.l0)._$_findCachedViewById(R.id.h0u);
            String string2 = ((AddMultiVideoFragment) aObserverS59S0101000_3.l0).getString(R.string.jta);
            o.LJIIIIZZ(string2, "getString(R.string.playlist_creation_done)");
            String LLLZ = C16880lQ.LLLZ(string2, Arrays.copyOf(new Object[]{it}, 1));
            o.LJIIIIZZ(LLLZ, "format(format, *args)");
            textView.setText(LLLZ);
        }
        if (it.intValue() >= aObserverS59S0101000_3.i1) {
            return;
        }
        ((AddMultiVideoFragment) aObserverS59S0101000_3.l0).xl().LJLJL = false;
    }

    public AObserverS59S0101000_3(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
