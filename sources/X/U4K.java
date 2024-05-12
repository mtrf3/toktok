package X;

import X.C79267V9b;
import X.C79276V9k;
import android.content.Context;
import android.view.View;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public abstract class U4K<INFO extends C79276V9k, IMAGE extends C79267V9b<INFO>> extends C19860qE<U4K<INFO, IMAGE>> {
    public List<? extends INFO> LJIJJLI;

    public abstract C79268V9c LIZIZ(Context context);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U4K(View anchorView) {
        super(anchorView);
        o.LJIIIZ(anchorView, "anchorView");
    }
}
