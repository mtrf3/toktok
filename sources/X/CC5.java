package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.interaction.poll.ui.PollManageDialog;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CC5 implements LHW {
    public final /* synthetic */ PollManageDialog LJLIL;

    @Override // X.InterfaceC54357LUz
    public final void LIZJ(C78856UxA tab) {
        o.LJIIIZ(tab, "tab");
    }

    public CC5(PollManageDialog pollManageDialog) {
        this.LJLIL = pollManageDialog;
    }

    @Override // X.InterfaceC54357LUz
    public final void LIZ(C78856UxA tab) {
        View view;
        TextView textView;
        o.LJIIIZ(tab, "tab");
        if (this.LJLIL.getContext() != null && (view = tab.LJFF) != null && (textView = (TextView) view.findViewById(R.id.kyq)) != null) {
            Context context = this.LJLIL.getContext();
            o.LJI(context);
            textView.setTextColor(C04330Ez.LIZIZ(context, R.color.cu));
        }
    }

    @Override // X.InterfaceC54357LUz
    public final void LIZIZ(C78856UxA tab) {
        View view;
        TextView textView;
        o.LJIIIZ(tab, "tab");
        if (this.LJLIL.getContext() != null && (view = tab.LJFF) != null && (textView = (TextView) view.findViewById(R.id.kyq)) != null) {
            Context context = this.LJLIL.getContext();
            o.LJI(context);
            textView.setTextColor(C04330Ez.LIZIZ(context, R.color.ck));
        }
        Object obj = tab.LIZ;
        CCC ccc = CCC.GIFT;
        if (o.LJ(obj, Integer.valueOf(ccc.ordinal()))) {
            this.LJLIL.wl(ccc);
            return;
        }
        CCC ccc2 = CCC.NORMAL;
        if (!o.LJ(obj, Integer.valueOf(ccc2.ordinal()))) {
            return;
        }
        this.LJLIL.wl(ccc2);
    }
}
