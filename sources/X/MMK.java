package X;

import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MMK extends MMX<MNP> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MMK(View itemView) {
        super(itemView);
        o.LJIIIZ(itemView, "itemView");
        TuxTextView tuxTextView = (TuxTextView) itemView;
        tuxTextView.LJJJ(16.0f);
        tuxTextView.setText(tuxTextView.getContext().getResources().getQuantityString(R.plurals.gv, 2));
    }
}
