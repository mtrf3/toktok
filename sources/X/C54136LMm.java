package X;

import Y.AObserverS61S0101000_7;
import Y.AObserverS77S0100000_9;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.LMm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54136LMm extends AbstractC54129LMf {
    public final int LJLJJL;
    public final boolean LJLJJLL;
    public final C62822Ol8 LJLJL;
    public View LJLJLJ;
    public TextView LJLJLLL;
    public float LJLL;
    public final C62822Ol8 LJLLI;
    public OSZ<? extends Aweme, String> LJLLILLLL;
    public String LJLLJ;
    public String LJLLL;
    public volatile boolean LJLLLL;
    public XKQ LJLLLLLL;

    @Override // X.AbstractC54129LMf, X.LM4
    public final void LIZ() {
        TuxIconView tuxIconView;
        View view = this.LJLJLJ;
        if ((view instanceof TuxIconView) && (tuxIconView = (TuxIconView) view) != null) {
            tuxIconView.LIZIZ(false);
            Context context = tuxIconView.getContext();
            o.LJIIIIZZ(context, "context");
            Integer LJI = C79045V0n.LJI(R.attr.d4, context);
            if (LJI != null) {
                tuxIconView.setTintColor(LJI.intValue());
            }
        }
    }

    @Override // X.AbstractC54129LMf, X.LM4
    public final void LIZJ() {
        TuxIconView tuxIconView;
        View view = this.LJLJLJ;
        if ((view instanceof TuxIconView) && (tuxIconView = (TuxIconView) view) != null) {
            tuxIconView.LIZIZ(true);
            Context context = tuxIconView.getContext();
            o.LJIIIIZZ(context, "context");
            Integer LJI = C79045V0n.LJI(R.attr.dj, context);
            if (LJI != null) {
                tuxIconView.setTintColor(LJI.intValue());
            }
        }
    }

    @Override // X.LM4
    public final View LJII() {
        ActivityC45651qj activity;
        ActivityC45651qj activity2 = this.LJLIL.getActivity();
        if (activity2 == null) {
            return null;
        }
        if (((Boolean) this.LJLJL.getValue()).booleanValue()) {
            this.LJLJLJ = HomePageUIFrameServiceImpl.LIZ().getInflatedSearchIcon(activity2);
            LiveOuterService.LJJJLL().LJJJJLL(false).getClass();
            LQM.LJIIL = null;
        } else {
            int i = this.LJLJJL;
            OSJ<View, TextView, Integer> osj = C42124Gg4.LIZJ.get(Integer.valueOf(i));
            if (osj == null) {
                osj = LL8.LJ(i, activity2);
            }
            this.LJLJLJ = osj.getFirst();
            this.LJLJLLL = osj.getSecond();
            this.LJLL = osj.getThird().intValue();
            if (this.LJLJJLL) {
                TextView textView = this.LJLJLLL;
                if (textView != null) {
                    textView.setText(LJIILL());
                }
            } else {
                if (this.LJLILLLLZI == null && (activity = this.LJLIL.getActivity()) != null && this.LJLILLLLZI == null) {
                    AObserverS77S0100000_9 aObserverS77S0100000_9 = new AObserverS77S0100000_9(this, 24);
                    LNH.LIZJ(activity).observe(activity, aObserverS77S0100000_9);
                    this.LJLILLLLZI = aObserverS77S0100000_9;
                }
                Iterator<TopTabProtocol> it = ((HomeTabAbility) C55096Ljo.LIZIZ(C55230Lly.LIZLLL(activity2, null), HomeTabAbility.class)).L2().iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (o.LJ(it.next().getTag(), "MUSIC_DSP_XTAB")) {
                        if (i2 >= 0) {
                            C84193Sd.LIZ(activity2).LJZL.observe(activity2, new AObserverS61S0101000_7(i2, this, 4));
                        }
                    } else {
                        i2++;
                    }
                }
            }
            LQF LJJJJLL = LiveOuterService.LJJJLL().LJJJJLL(false);
            View view = this.LJLJLJ;
            LJJJJLL.getClass();
            LQM.LJIIL = view;
        }
        return this.LJLJLJ;
    }

    public final String LJIILIIL() {
        String str;
        Aweme first;
        String aid;
        Aweme aweme;
        ActivityC45651qj activity = this.LJLIL.getActivity();
        if (activity != null && (aweme = C3SZ.LIZ(activity).LJLJLLL) != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        OSZ<? extends Aweme, String> osz = this.LJLLILLLL;
        if (osz == null || (first = osz.getFirst()) == null || (aid = first.getAid()) == null) {
            return str;
        }
        return aid;
    }

    public final String LJIILL() {
        return (String) this.LJLLI.getValue();
    }

    @Override // X.AbstractC54129LMf
    public final void LJI() {
        LJIIIZ();
        XKQ xkq = this.LJLLLLLL;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ed  */
    @Override // X.LM4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(android.view.View r10) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54136LMm.LJFF(android.view.View):void");
    }

    @Override // X.AbstractC54129LMf
    public final void LJIIJJI(int i) {
        View view;
        LiveOuterService.LJJJLL().LJJJJLL(false).getClass();
        if (!LQM.LJIJI && (view = this.LJLJLJ) != null) {
            C55511LqV.LJIIJJI(i, view);
            if (i == 4) {
                view.setAlpha(1.0f);
            }
        }
    }

    @Override // X.LNI
    public final void LJJLIIIJ(Aweme aweme) {
        XKQ xkq = this.LJLLLLLL;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        TextView textView = this.LJLJLLL;
        if (textView == null) {
            return;
        }
        if (aweme == null) {
            textView.setText(LJIILL());
            this.LJLLILLLL = null;
            this.LJLLLL = false;
            return;
        }
        this.LJLLLLLL = XKX.LIZLLL(C48841JEv.LIZIZ(), null, null, new GLW(textView, this, aweme, null), 3);
    }

    public C54136LMm(int i, boolean z, LNP lnp) {
        super(lnp);
        this.LJLJJL = i;
        this.LJLJJLL = z;
        this.LJLJL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 990));
        this.LJLLI = C221108m2.LIZIZ(new AqS159S0100000_9(lnp, 989));
        this.LJLLJ = "";
        this.LJLLL = "";
    }
}
