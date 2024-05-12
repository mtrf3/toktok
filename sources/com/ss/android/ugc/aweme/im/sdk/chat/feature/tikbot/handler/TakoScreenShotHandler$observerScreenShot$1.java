package com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.handler;

import X.AbstractC62641OiD;
import X.C09G;
import X.C99033ud;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.screenshot.IScreenshotService;
import com.ss.android.ugc.aweme.screenshot.ScreenShotService;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class TakoScreenShotHandler$observerScreenShot$1 implements GenericLifecycleObserver, DefaultLifecycleObserver {
    public final /* synthetic */ C99033ud LJLIL;

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C09G.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        C09G.LIZIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C09G.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C09G.LJFF(this, lifecycleOwner);
    }

    public TakoScreenShotHandler$observerScreenShot$1(C99033ud c99033ud) {
        this.LJLIL = c99033ud;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final void onPause(LifecycleOwner owner) {
        o.LJIIIZ(owner, "owner");
        IScreenshotService LJIIIZ = ScreenShotService.LJIIIZ();
        o.LJIIIIZZ(LJIIIZ, "get().getService(IScreenshotService::class.java)");
        LJIIIZ.LJI(null);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final void onResume(LifecycleOwner owner) {
        o.LJIIIZ(owner, "owner");
        IScreenshotService LJIIIZ = ScreenShotService.LJIIIZ();
        String enterFromForMob = this.LJLIL.getEnterFromForMob();
        final C99033ud c99033ud = this.LJLIL;
        LJIIIZ.LIZ(enterFromForMob, new AbstractC62641OiD() { // from class: X.4Ra
            @Override // X.AbstractC62641OiD
            public final java.util.Map<String, String> mobExtalParams() {
                return C113554cx.LJJL(new OSZ("enter_from", C99033ud.this.getEnterFromForMob()), new OSZ("enter_method", C99033ud.this.getEnterMethod()), new OSZ("process_id", C3Y4.LIZJ));
            }

            @Override // X.AbstractC62641OiD
            public final boolean onShot(String imagePath) {
                o.LJIIIZ(imagePath, "imagePath");
                V1B.LJIIZILJ("screen shot");
                return false;
            }
        });
    }
}
