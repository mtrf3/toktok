package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecListLayoutStyle;
import kotlin.jvm.internal.o;

/* renamed from: X.RhX, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70243RhX {
    public final ISpecListLayoutStyle LIZ;
    public final String LIZIZ;
    public final LifecycleOwner LIZJ;

    public C70243RhX(ISpecListLayoutStyle style, String str, Fragment lifecycleOwner) {
        o.LJIIIZ(style, "style");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LIZ = style;
        this.LIZIZ = str;
        this.LIZJ = lifecycleOwner;
    }
}
