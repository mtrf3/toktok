package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.VaK, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC79988VaK extends RelativeLayout {
    public HashMap _$_findViewCache;

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC79988VaK(Context context) {
        this(context, null, 0, 6, 0 == true ? 1 : 0);
    }

    public AbstractC79988VaK(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void destroy() {
    }

    public int getDuration() {
        return 0;
    }

    public abstract void onPropsUpdateOnce();

    public abstract void pause();

    public abstract void performZoom();

    public abstract void performZoomOut();

    public abstract void playReal(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro);

    public abstract void seek(int i, boolean z);

    public void setAutoLifecycle(boolean z) {
    }

    public abstract void setAutoPlay(boolean z);

    public void setBorderRadius(float[] fArr) {
    }

    public abstract void setDeviceChangeAware(boolean z);

    public void setEnablePlayListener(boolean z) {
    }

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

    public void setResourceLoader(J0G<C61259O2l> loader) {
        o.LJIIJ(loader, "loader");
    }

    public abstract void setSinglePlayer(boolean z);

    public abstract void setSrc(String str);

    public void setStateChangeReporter(InterfaceC88473Ynt<? super String, ? super java.util.Map<String, ? extends Object>, ? super AbstractC79988VaK, C76800UCe> interfaceC88473Ynt) {
    }

    public void setVideoHeight(int i) {
    }

    public void setVideoTag(String str) {
    }

    public void setVideoWidth(int i) {
    }

    public abstract void setVolume(float f);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC79988VaK(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        o.LJIIJ(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void playReal$default(AbstractC79988VaK abstractC79988VaK, InterfaceC65784Pro interfaceC65784Pro, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                interfaceC65784Pro = null;
            }
            abstractC79988VaK.playReal(interfaceC65784Pro);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: playReal");
    }

    public /* synthetic */ AbstractC79988VaK(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
