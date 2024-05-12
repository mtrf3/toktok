package X;

import android.content.res.Resources;
import android.util.TypedValue;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.loading.IPageLoadingProvider;
import kotlin.jvm.internal.o;

/* renamed from: X.aQQ, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93410aQQ {
    public static final IPageLoadingProvider LIZJ() {
        return (IPageLoadingProvider) C93892aYC.LIZ(IPageLoadingProvider.class);
    }

    public static final float LIZ(float f) {
        Resources system = Resources.getSystem();
        o.LJIIIIZZ(system, "Resources.getSystem()");
        return TypedValue.applyDimension(1, f, system.getDisplayMetrics());
    }

    public static final int LIZIZ(int i) {
        Resources system = Resources.getSystem();
        o.LJIIIIZZ(system, "Resources.getSystem()");
        return (int) TypedValue.applyDimension(1, i, system.getDisplayMetrics());
    }
}
