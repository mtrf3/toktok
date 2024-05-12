package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Tvd, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC76213Tvd<D> extends RecyclerView.ViewHolder {
    public abstract void L(int i, Object obj);

    public void LJJJJIZL() {
    }

    public void onViewDetachedFromWindow() {
    }

    public AbstractC76213Tvd(View view) {
        super(view);
    }

    public void M(int i, Object obj, List payloads) {
        o.LJIIIZ(payloads, "payloads");
        L(i, obj);
    }
}
