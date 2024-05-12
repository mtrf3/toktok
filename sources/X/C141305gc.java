package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;

/* renamed from: X.5gc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C141305gc extends RecyclerView.ViewHolder {
    public final /* synthetic */ C46048I5k LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C141305gc(C46048I5k c46048I5k, ViewGroup viewGroup) {
        super(C28289B8j.LIZ(viewGroup, R.layout.bea, viewGroup, false));
        this.LJLIL = c46048I5k;
        ((C5DU) this.itemView.findViewById(R.id.we)).setBgColor(ColorProtector.parseColor("#FFFFFF"));
    }
}
