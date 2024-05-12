package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.SearchPhotoFeedbackAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JKK extends AbstractViewOnTouchListenerC49338JXy {
    public final /* synthetic */ SearchPhotoFeedbackAssem LJLLILLLL;

    @Override // X.AbstractViewOnTouchListenerC49338JXy
    public final void LIZ(boolean z) {
        int i;
        FrameLayout frameLayout = this.LJLLILLLL.LLD;
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
    public JKK(SearchPhotoFeedbackAssem searchPhotoFeedbackAssem, Context context) {
        super(context);
        this.LJLLILLLL = searchPhotoFeedbackAssem;
        o.LJIIIIZZ(context, "context");
    }
}
