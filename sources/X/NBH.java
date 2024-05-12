package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.AnoleServiceImpl;
import com.ss.android.ugc.aweme.IAnoleManager;
import com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import kotlin.jvm.internal.AqS160S0100000_10;

/* loaded from: classes11.dex */
public final class NBH implements N69 {
    public final NBG LJLIL;
    public final Context LJLILLLLZI;
    public final Aweme LJLJI;
    public final View LJLJJI;
    public final ActivityC45651qj LJLJJL;
    public IAnoleManager LJLJJLL;
    public ViewGroup LJLJL;
    public C58798N5u LJLJLJ;
    public IVideoPlayTaskManager LJLJLLL;
    public final Long LJLL;
    public final C62822Ol8 LJLLI;
    public boolean LJLLILLLL;

    @Override // X.InterfaceC41000G7g
    public final void initialize() {
    }

    @Override // X.InterfaceC58803N5z
    public final void LLLLZI() {
        NC7 nc7;
        if (!O5Y.LJJIJ(this.LJLJI)) {
            return;
        }
        IAnoleManager iAnoleManager = this.LJLJJLL;
        if (iAnoleManager != null) {
            iAnoleManager.LIZJ();
        }
        this.LJLJJLL = null;
        Context context = this.LJLILLLLZI;
        Aweme aweme = this.LJLIL.getAweme();
        if (context != null && aweme != null) {
            nc7 = AnoleServiceImpl.LIZJ().LIZIZ(context, aweme, new NBK(this), new INV(new NBF(this)));
        } else {
            nc7 = null;
        }
        this.LJLJJLL = nc7;
        if (nc7 == null) {
            return;
        }
        nc7.mount(this.LJLJL, "tt_search_bottom_slot", null);
        nc7.LJFF();
    }

    @Override // X.InterfaceC58803N5z
    public final void onViewAttachedToWindow() {
        String str;
        C242549fW.LIZ("onViewAttachedToWindow,anoleManager");
        IAnoleManager iAnoleManager = this.LJLJJLL;
        if (iAnoleManager != null) {
            iAnoleManager.LJFF();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("hostWillAppear,aweme = ");
        Aweme aweme = this.LJLJI;
        if (aweme != null) {
            str = aweme.getDesc();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(", currentItemView = ");
        LIZ.append(this.LJLJJI);
        C242549fW.LIZ(X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC58803N5z
    public final void onViewDetachedFromWindow() {
        String str;
        IAnoleManager iAnoleManager = this.LJLJJLL;
        if (iAnoleManager != null) {
            iAnoleManager.LIZIZ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("hostWillDisAppear, aweme = ");
            Aweme aweme = this.LJLJI;
            if (aweme != null) {
                str = aweme.getDesc();
            } else {
                str = null;
            }
            LIZ.append(str);
            C242549fW.LIZ(X1D.LIZIZ(LIZ));
        }
        C58798N5u c58798N5u = this.LJLJLJ;
        if (c58798N5u != null) {
            c58798N5u.onViewDetachedFromWindow();
        }
        this.LJLLILLLL = false;
    }

    @Override // X.InterfaceC41034G8o
    public final /* bridge */ /* synthetic */ NBG L9() {
        return this.LJLIL;
    }

    @Override // X.N69
    public final InterfaceC58799N5v LLLZIIL() {
        return this.LJLJLJ;
    }

    public NBH(NBG nbg) {
        ActivityC45651qj activityC45651qj;
        Video video;
        this.LJLIL = nbg;
        Context context = nbg.getContext();
        this.LJLILLLLZI = context;
        Aweme aweme = nbg.getAweme();
        this.LJLJI = aweme;
        this.LJLJJI = nbg.LJIIIIZZ();
        Long l = null;
        if (context != null) {
            activityC45651qj = C45804HyK.LJJIFFI(context);
        } else {
            activityC45651qj = null;
        }
        this.LJLJJL = activityC45651qj;
        if (aweme != null && (video = aweme.getVideo()) != null) {
            l = Long.valueOf(video.getDuration());
        }
        this.LJLL = l;
        this.LJLLI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 580));
    }

    @Override // X.N69
    public final void KF(ViewGroup viewGroup) {
        this.LJLJL = viewGroup;
    }

    @Override // X.N69
    public final void Kn(C58798N5u c58798N5u) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("initObservers playerModule=");
        LIZ.append(c58798N5u);
        N8M.LIZ(X1D.LIZIZ(LIZ));
        this.LJLJLLL = c58798N5u.WD();
        N6J.LIZIZ(c58798N5u, this.LJLJJL, C113554cx.LJJL(new OSZ(N65.LIZ, new AqS160S0100000_10(this, 581)), new OSZ(N63.LIZ, new AqS160S0100000_10(this, 582)), new OSZ(N64.LIZ, new AqS160S0100000_10(this, 583))));
    }

    @Override // X.N69
    public final InterfaceC58799N5v Z9(JGM jgm) {
        LifecycleCoroutineScope lifecycleScope;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("createPlayerModule() searchPlayerModule=");
        LIZ.append(this.LJLJLJ);
        N8M.LIZ(X1D.LIZIZ(LIZ));
        if (this.LJLJLJ == null) {
            C58798N5u LIZ2 = N55.LIZ(jgm);
            this.LJLJLJ = LIZ2;
            this.LJLJLLL = LIZ2.WD();
            ActivityC45651qj activityC45651qj = this.LJLJJL;
            if (activityC45651qj != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(activityC45651qj)) != null) {
                XKX.LIZLLL(lifecycleScope, null, null, new NEG(this, null), 3);
            }
        }
        return this.LJLJLJ;
    }
}
