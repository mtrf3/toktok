package X;

import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.8ab, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C214018ab implements InterfaceC59355NRf {
    public final IVideoPlayTaskManager LIZ;
    public final Aweme LIZIZ;
    public final Fragment LIZJ;
    public final ViewGroup LIZLLL;
    public final ViewGroup LJ;
    public final ViewGroup LJFF;
    public final ViewGroup LJI;
    public final C59362NRm LJII;
    public final C226568uq LJIIIIZZ;

    @Override // X.InterfaceC44391HbX
    public final Context getContext() {
        return getFragment().getContext();
    }

    @Override // X.NSF
    public final IVideoPlayTaskManager LIZIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC59355NRf
    public final ViewGroup LIZJ() {
        return this.LJI;
    }

    @Override // X.InterfaceC59355NRf
    public final ViewGroup LJIIIZ() {
        return this.LJFF;
    }

    @Override // X.InterfaceC59355NRf
    public final C59362NRm LJIIZILJ() {
        return this.LJII;
    }

    @Override // X.InterfaceC59355NRf
    public final C226568uq LJIJ() {
        return this.LJIIIIZZ;
    }

    @Override // X.NRV
    public final Aweme getAweme() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC42661Goj
    public final Fragment getFragment() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC42661Goj, X.InterfaceC41451GOp
    public final LifecycleOwner getLifecycleOwner() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC41452GOq
    public final ViewModelStoreOwner getViewModelStoreOwner() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC41449GOn
    public final void LJIIJJI(InterfaceC40967G5z listener) {
        o.LJIIIZ(listener, "listener");
        C42660Goi.LIZ(this, listener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C214018ab(android.view.View r14, androidx.fragment.app.Fragment r15, com.ss.android.ugc.aweme.commercialize.utils.video.VideoPlayTaskManager r16, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell r17, com.ss.android.ugc.aweme.feed.model.Aweme r18) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C214018ab.<init>(android.view.View, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.commercialize.utils.video.VideoPlayTaskManager, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }
}
