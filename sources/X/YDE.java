package X;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import com.ss.android.videoshop.context.VideoContext;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YDE extends View {
    public VideoContext LJLIL;

    public YDE(Context context) {
        super(context);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration newConfig) {
        o.LJIIJ(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        VideoContext videoContext = this.LJLIL;
        if (videoContext != null) {
            videoContext.onInternalConfigurationChanged(newConfig);
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        VideoContext videoContext = this.LJLIL;
        if (videoContext != null) {
            videoContext.onWindowFocusChanged(z);
        }
    }

    @Override // android.view.View
    public void setKeepScreenOn(boolean z) {
        VideoContext videoContext;
        C48217Iw9 LIZIZ;
        if (getKeepScreenOn() != z && (videoContext = this.LJLIL) != null && (LIZIZ = C48217Iw9.LIZIZ("KeepScreenOn", YDG.KEEP_SCREEN, 6)) != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("");
            LIZ.append(z);
            LIZIZ.LIZ("keep", X1D.LIZIZ(LIZ));
            EnumC48216Iw8.INS.addTrace(videoContext.getPlayEntity(), LIZIZ);
        }
        super.setKeepScreenOn(z);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("keep_screen_on:");
        LIZ2.append(String.valueOf(z));
        LIZ2.append(" hash:");
        LIZ2.append(hashCode());
        X1D.LIZIZ(LIZ2);
    }

    public final void setVideoContext(VideoContext videoContext) {
        this.LJLIL = videoContext;
    }
}
