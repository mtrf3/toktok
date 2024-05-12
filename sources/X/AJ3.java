package X;

import android.graphics.drawable.Animatable;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.ss.android.ugc.aweme.rss.link.ui.RssIntroAssem;

/* loaded from: classes5.dex */
public final class AJ3 extends AbstractC72439Sbr {
    public final /* synthetic */ RssIntroAssem LJLIL;

    public AJ3(RssIntroAssem rssIntroAssem) {
        this.LJLIL = rssIntroAssem;
    }

    @Override // X.InterfaceC70769Rq1
    public final void s2(android.net.Uri uri, View view, Throwable th) {
        RssIntroAssem rssIntroAssem = this.LJLIL;
        rssIntroAssem.getClass();
        rssIntroAssem.LJLILLLLZI = XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(rssIntroAssem), null, null, new C66482jE(rssIntroAssem, null), 3);
    }

    @Override // X.InterfaceC70769Rq1
    public final void U0(android.net.Uri uri, View view, C2047581v c2047581v, Animatable animatable) {
        AnimatedDrawable2 animatedDrawable2;
        RssIntroAssem rssIntroAssem = this.LJLIL;
        if (animatable instanceof AnimatedDrawable2) {
            animatedDrawable2 = (AnimatedDrawable2) animatable;
        } else {
            animatedDrawable2 = null;
        }
        rssIntroAssem.LJLJI = animatedDrawable2;
        if (animatedDrawable2 != null) {
            animatedDrawable2.start();
        }
        RssIntroAssem rssIntroAssem2 = this.LJLIL;
        AnimatedDrawable2 animatedDrawable22 = rssIntroAssem2.LJLJI;
        if (animatedDrawable22 != null) {
            animatedDrawable22.LJLZ = new AJ5(rssIntroAssem2);
        }
    }
}
