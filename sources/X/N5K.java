package X;

import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N5K extends RecyclerView.ViewHolder {
    public final View LJLIL;
    public final LifecycleOwner LJLILLLLZI;
    public final InterfaceC65462ha<N4T> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N5K(View view, LifecycleOwner lifecycleOwner, C79863Bm c79863Bm) {
        super(view);
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLIL = view;
        this.LJLILLLLZI = lifecycleOwner;
        this.LJLJI = c79863Bm;
        LifecycleOwnerKt.getLifecycleScope(lifecycleOwner).launchWhenStarted(new NE6(this, (TextView) view.findViewById(R.id.krn), null));
    }
}
