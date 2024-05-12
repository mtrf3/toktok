package X;

import android.content.Context;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.commercialize.utils.video.VideoPlayTaskManager;
import com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS160S0100000_10;

/* renamed from: X.N5u, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58798N5u implements InterfaceC58799N5v {
    public static final /* synthetic */ int LJLLI = 0;
    public final N54 LJLIL;
    public C58802N5y LJLILLLLZI;
    public final Context LJLJI;
    public final ActivityC45651qj LJLJJI;
    public C58791N5n LJLJJL;
    public final List<IVideoPlayTaskManager> LJLJJLL;
    public final C58825N6v LJLJL;
    public final AqS160S0100000_10 LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public int LJLL;

    @Override // X.InterfaceC58803N5z
    public final void LLLLZI() {
    }

    @Override // X.InterfaceC41000G7g
    public final void initialize() {
    }

    @Override // X.InterfaceC58803N5z
    public final void onViewAttachedToWindow() {
    }

    @Override // X.InterfaceC58799N5v
    public final java.util.Set<EnumC58794N5q> D70() {
        C58791N5n c58791N5n = this.LJLJJL;
        if (c58791N5n != null) {
            return c58791N5n.LIZLLL;
        }
        return null;
    }

    @Override // X.InterfaceC58799N5v
    public final InterfaceC70352pT Fl() {
        return (InterfaceC70352pT) this.LJLJL.LIZJ;
    }

    @Override // X.InterfaceC58799N5v
    public final void LJIIIZ() {
        N6J.LJ(this.LJLJL, N65.LIZ, this.LJLJI);
    }

    @Override // X.InterfaceC58799N5v
    public final void Nt0() {
        N6J.LJ(this.LJLJL, N64.LIZ, this.LJLJI);
    }

    @Override // X.InterfaceC58799N5v
    public final IVideoPlayTaskManager WD() {
        IVideoPlayTaskManager videoPlayTaskManager;
        Object LIZ = C58096Mr6.LIZ(IVideoPlayTaskManager.class, false);
        if (LIZ != null) {
            videoPlayTaskManager = (IVideoPlayTaskManager) LIZ;
        } else {
            videoPlayTaskManager = new VideoPlayTaskManager();
        }
        videoPlayTaskManager.LJLJJI(100L);
        videoPlayTaskManager.LJLIL((C58800N5w) this.LJLJLLL.getValue());
        ((ArrayList) this.LJLJJLL).add(videoPlayTaskManager);
        return videoPlayTaskManager;
    }

    @Override // X.InterfaceC58799N5v
    public final void c() {
        N6J.LJ(this.LJLJL, N63.LIZ, this.LJLJI);
    }

    @Override // X.InterfaceC58799N5v
    public final long getCurrentPosition() {
        return ((Number) this.LJLJLJ.invoke()).longValue();
    }

    @Override // X.InterfaceC58799N5v
    public final long getVideoLength() {
        Video video;
        Aweme aweme = this.LJLIL.getAweme();
        if (aweme != null && (video = aweme.getVideo()) != null) {
            return video.getVideoLength();
        }
        return -1L;
    }

    @Override // X.InterfaceC58799N5v
    public final void o5() {
        N6J.LJ(this.LJLJL, N61.LIZ, this.LJLJI);
    }

    @Override // X.InterfaceC58803N5z
    public final void onViewDetachedFromWindow() {
        LifecycleCoroutineScope lifecycleScope;
        N66 n66 = N66.LIZ;
        ActivityC45651qj activityC45651qj = this.LJLJJI;
        if (activityC45651qj != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(activityC45651qj)) != null) {
            XKX.LIZLLL(lifecycleScope, null, null, new NES(this, n66, null), 3);
        }
        Iterator it = ((ArrayList) this.LJLJJLL).iterator();
        while (it.hasNext()) {
            ((IVideoPlayTaskManager) it.next()).reset();
        }
    }

    @Override // X.InterfaceC41034G8o
    public final /* bridge */ /* synthetic */ N54 L9() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC58799N5v
    public final int d0() {
        return this.LJLL;
    }

    @Override // X.InterfaceC58799N5v
    public final C58802N5y q7() {
        return this.LJLILLLLZI;
    }

    public C58798N5u(N54 n542) {
        ActivityC45651qj activityC45651qj;
        this.LJLIL = n542;
        this.LJLJI = n542.LIZ();
        Context LIZ = n542.LIZ();
        if (LIZ != null) {
            activityC45651qj = C45804HyK.LJJIFFI(LIZ);
        } else {
            activityC45651qj = null;
        }
        this.LJLJJI = activityC45651qj;
        String.valueOf(hashCode());
        this.LJLJJLL = new ArrayList();
        this.LJLJL = new C58825N6v(0);
        this.LJLJLJ = new AqS160S0100000_10(this, 405);
        this.LJLJLLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 406));
    }

    @Override // X.InterfaceC58799N5v
    public final void Ud(int i) {
        this.LJLL = i;
    }
}
