package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.ss.android.ugc.aweme.views.IDlS62S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5oF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C146035oF {
    public static final void LIZIZ(View hide) {
        o.LJIIIZ(hide, "$this$hide");
        hide.setVisibility(8);
    }

    public static final float LIZ(Context context, float f) {
        Resources resources = context.getResources();
        o.LJIIIIZZ(resources, "resources");
        return (f * resources.getDisplayMetrics().density) + 0.5f;
    }

    public static final void LIZJ(View setDebounceOnClickListener, InterfaceC65784Pro<C76800UCe> run) {
        o.LJIIIZ(setDebounceOnClickListener, "$this$setDebounceOnClickListener");
        o.LJIIIZ(run, "run");
        C16880lQ.LJIIJ(new IDlS62S0100000_2(run, (AbstractC156316Bn<Object>) 20), setDebounceOnClickListener);
    }
}
