package X;

import android.animation.ObjectAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.6l4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C169546l4 extends RecyclerView.ViewHolder {
    public final ObjectAnimator LJLIL;

    public C169546l4(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.f6h);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.iv_loading)");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(findViewById, "rotation", 0.0f, 360.0f);
        ofFloat.setDuration(800L);
        ofFloat.setRepeatMode(1);
        ofFloat.setRepeatCount(-1);
        this.LJLIL = ofFloat;
    }
}
