package X;

import android.R;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.rank.impl.list.fragment.page.RankPageFragment;

/* renamed from: X.Uim, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77964Uim implements InterfaceC80659Vl9 {
    public final /* synthetic */ RankPageFragment LIZ;

    @Override // X.InterfaceC80659Vl9
    public final void LIZ() {
    }

    public C77964Uim(RankPageFragment rankPageFragment) {
        this.LIZ = rankPageFragment;
    }

    @Override // X.InterfaceC80659Vl9
    public final void LIZIZ(C80654Vl4 c80654Vl4) {
        View view;
        TextView textView;
        Context context;
        if (c80654Vl4 != null && (view = c80654Vl4.LJ) != null && (textView = (TextView) view.findViewById(R.id.text1)) != null && (context = this.LIZ.getContext()) != null) {
            Integer LJI = C79045V0n.LJI(com.zhiliaoapp.musically.R.attr.e2, context);
            if (LJI != null) {
                textView.setTextColor(LJI.intValue());
            }
            textView.setBackground(C04270Et.LIZIZ(context, com.zhiliaoapp.musically.R.drawable.ckn));
        }
    }

    @Override // X.InterfaceC80659Vl9
    public final void LIZJ(C80654Vl4 c80654Vl4) {
        TextView textView;
        Context context;
        View view = c80654Vl4.LJ;
        if (view != null && (textView = (TextView) view.findViewById(R.id.text1)) != null && (context = this.LIZ.getContext()) != null) {
            Integer LJI = C79045V0n.LJI(com.zhiliaoapp.musically.R.attr.gp, context);
            if (LJI != null) {
                textView.setTextColor(LJI.intValue());
            }
            textView.setBackground(C04270Et.LIZIZ(context, com.zhiliaoapp.musically.R.drawable.ckm));
        }
    }
}
