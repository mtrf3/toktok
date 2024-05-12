package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.VaL, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC79989VaL extends RelativeLayout {
    public static final /* synthetic */ int LJLIL = 0;

    public void LIZ() {
    }

    public abstract void LIZIZ();

    public abstract void LIZJ();

    public abstract void LIZLLL();

    public abstract void LJ(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro);

    public abstract void LJFF(int i, boolean z);

    public int getDuration() {
        return 0;
    }

    public abstract void pause();

    public abstract void setAutoLifecycle(boolean z);

    public abstract void setAutoPlay(boolean z);

    public void setBorderRadius(float[] fArr) {
    }

    public abstract void setDeviceChangeAware(boolean z);

    public abstract void setInitTime(int i);

    public void setLogExtra(HashMap<String, Object> logExtra) {
        o.LJIIJ(logExtra, "logExtra");
    }

    public abstract void setLoop(boolean z);

    public abstract void setMuted(boolean z);

    public abstract void setObjectFit(String str);

    public void setPerformanceLog(String performanceLog) {
        o.LJIIJ(performanceLog, "performanceLog");
    }

    public abstract void setPoster(String str);

    public abstract void setPreload(boolean z);

    public abstract void setRate(int i);

    public abstract void setSinglePlayer(boolean z);

    public void setSinglePlayerScene(String singleScene) {
        o.LJIIJ(singleScene, "singleScene");
    }

    public abstract void setSrc(String str);

    public abstract void setStateChangeReporter(InterfaceC88473Ynt<? super String, ? super java.util.Map<String, ? extends Object>, ? super AbstractC79989VaL, C76800UCe> interfaceC88473Ynt);

    public void setVideoHeight(int i) {
    }

    public void setVideoWidth(int i) {
    }

    public abstract void setVolume(float f);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC79989VaL(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        o.LJIIJ(context, "context");
    }
}
