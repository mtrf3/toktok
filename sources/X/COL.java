package X;

import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class COL {
    public Object LIZ;
    public Object LIZIZ;

    public final View LIZ() {
        return (View) ((Reference) this.LIZIZ).get();
    }

    public /* synthetic */ COL(View container, String str) {
        o.LJIIJ(container, "container");
        this.LIZ = str;
        this.LIZIZ = new WeakReference(container);
    }

    public /* synthetic */ COL(TuxTextView tvToggle, C89K textView) {
        o.LJIIIZ(tvToggle, "tvToggle");
        o.LJIIIZ(textView, "textView");
        this.LIZIZ = tvToggle;
        this.LIZ = textView;
    }
}
