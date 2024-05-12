package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardFeedbackAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.JXz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49339JXz extends AbstractViewOnTouchListenerC49338JXy {
    public final /* synthetic */ SearchCardFeedbackAssem<T> LJLLILLLL;
    public final /* synthetic */ View LJLLJ;

    @Override // X.AbstractViewOnTouchListenerC49338JXy
    public final void LIZ(boolean z) {
        View view;
        int i;
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.LJLLILLLL.c4()) {
                view = this.LJLLILLLL.b4();
            } else {
                view = this.LJLLJ;
            }
            if (view != null) {
                JY1 jy1 = this.LJLLILLLL;
                View view2 = this.LJLLJ;
                if (z) {
                    if (jy1.l2().contains(Integer.valueOf(view2.getId()))) {
                        view.setForeground(null);
                        return;
                    }
                    Integer LIZIZ = C19N.LIZIZ(view, "it.context", R.attr.de);
                    if (LIZIZ != null) {
                        i = LIZIZ.intValue();
                    } else {
                        i = 0;
                    }
                    view.setForeground(new ColorDrawable(i));
                    return;
                }
                view.setForeground(null);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49339JXz(SearchCardFeedbackAssem<T> searchCardFeedbackAssem, View view, Context context) {
        super(context);
        this.LJLLILLLL = searchCardFeedbackAssem;
        this.LJLLJ = view;
        o.LJIIIIZZ(context, "context");
    }
}
