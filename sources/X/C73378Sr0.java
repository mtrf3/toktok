package X;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.Sr0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73378Sr0 extends C73379Sr1 {
    public final /* synthetic */ DialogC73377Sqz LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C73378Sr0(DialogC73377Sqz dialogC73377Sqz, Context context) {
        super(context);
        this.LJLILLLLZI = dialogC73377Sqz;
    }

    @Override // X.C73379Sr1, X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        View view;
        o.LJIIIZ(recyclerView, "recyclerView");
        super.LJIILJJIL(i, recyclerView);
        if (i == 1) {
            Window window = this.LJLILLLLZI.getWindow();
            if (window != null) {
                view = window.getCurrentFocus();
            } else {
                view = null;
            }
            KeyboardUtils.LIZIZ(view);
        }
    }
}
