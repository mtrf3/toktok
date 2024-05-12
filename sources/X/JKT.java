package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchVideoHolder;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JKT extends AbstractViewOnTouchListenerC49338JXy {
    public final /* synthetic */ SearchVideoHolder LJLLILLLL;

    @Override // X.AbstractViewOnTouchListenerC49338JXy
    public final void LIZ(boolean z) {
        int i;
        FrameLayout frameLayout = this.LJLLILLLL.LJLZ;
        if (frameLayout != null) {
            if (z) {
                Context context = frameLayout.getContext();
                o.LJIIIIZZ(context, "it.context");
                Integer LJI = C79045V0n.LJI(R.attr.de, context);
                if (LJI != null) {
                    i = LJI.intValue();
                } else {
                    i = 0;
                }
                frameLayout.setForeground(new ColorDrawable(i));
                return;
            }
            frameLayout.setForeground(null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JKT(SearchVideoHolder searchVideoHolder, Context context) {
        super(context);
        this.LJLLILLLL = searchVideoHolder;
        o.LJIIIIZZ(context, "context");
    }
}
