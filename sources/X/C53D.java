package X;

import android.view.View;
import com.ss.ugc.android.editor.bottom.functionbar.HorizontalFuncBarFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.53D, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C53D {
    public final /* synthetic */ HorizontalFuncBarFragment LIZ;

    public C53D(HorizontalFuncBarFragment horizontalFuncBarFragment) {
        this.LIZ = horizontalFuncBarFragment;
    }

    public final void LIZ(AnonymousClass523 funcItem, int i, View view) {
        o.LJIIIZ(funcItem, "funcItem");
        C53G c53g = this.LIZ.LJLJJLL;
        if (c53g != null) {
            c53g.LIZIZ(funcItem);
        }
        this.LIZ.wl().dispatch(new AnonymousClass535(funcItem, i, view));
    }
}
