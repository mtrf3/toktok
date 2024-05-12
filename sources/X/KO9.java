package X;

import Y.ARunnableS3S0500000_8;
import android.view.View;
import android.view.ViewTreeObserver;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.LynxExposeHelper;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KO9 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ LynxExposeHelper.ExposeView LJLIL;
    public final /* synthetic */ SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJLILLLLZI;
    public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener LJLJI;
    public final /* synthetic */ ViewTreeObserver.OnWindowFocusChangeListener LJLJJI;
    public final /* synthetic */ ViewTreeObserver.OnScrollChangedListener LJLJJL;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        o.LJIIIZ(v, "v");
        this.LJLIL.LIZJ();
        v.post(new ARunnableS3S0500000_8(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, 0));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        o.LJIIIZ(v, "v");
        LynxExposeHelper.ExposeView exposeView = this.LJLIL;
        if (exposeView.LJLJJI) {
            exposeView.LIZIZ(KOD.ANY);
        }
        v.post(new ARunnableS3S0500000_8(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, 1));
    }

    public KO9(LynxExposeHelper.ExposeView exposeView, SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, KOB kob, KOA koa, KOC koc) {
        this.LJLIL = exposeView;
        this.LJLILLLLZI = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        this.LJLJI = kob;
        this.LJLJJI = koa;
        this.LJLJJL = koc;
    }
}
