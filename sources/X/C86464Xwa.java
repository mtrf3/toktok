package X;

import Y.ACListenerS35S0100000_15;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Xwa, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86464Xwa extends RecyclerView.ViewHolder implements Observer<Boolean> {
    public final ActivityC45651qj LJLIL;
    public final TextView LJLILLLLZI;
    public final C62846OlW LJLJI;
    public final FrameLayout LJLJJI;
    public final TextView LJLJJL;
    public final TextView LJLJJLL;
    public final InterfaceC54056LJk LJLJL;
    public final InterfaceC86353Xun LJLJLJ;

    public final void L() {
        M(new View[]{this.LJLILLLLZI, this.LJLJJI, this.LJLJJL}, C86469Xwf.LJLIL);
        M(new View[]{this.LJLJI, this.LJLJJLL}, C86470Xwg.LJLIL);
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Boolean bool) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86464Xwa(ActivityC45651qj activity, View itemView) {
        super(itemView);
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(activity, "activity");
        this.LJLIL = activity;
        View findViewById = itemView.findViewById(R.id.moj);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.tv_top)");
        this.LJLILLLLZI = (TextView) findViewById;
        View findViewById2 = itemView.findViewById(R.id.j3i);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.riv_cover)");
        this.LJLJI = (C62846OlW) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.dei);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.fl_live_container)");
        this.LJLJJI = (FrameLayout) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.mqm);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.tv_watch_people_count)");
        this.LJLJJL = (TextView) findViewById4;
        View findViewById5 = itemView.findViewById(R.id.d_u);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.finished_status)");
        this.LJLJJLL = (TextView) findViewById5;
        this.LJLJL = C87030YDq.LIZIZ.mainAnimViewModel(activity);
        C16880lQ.LJIIJ(new ACListenerS35S0100000_15(this, 266), itemView);
        this.LJLJLJ = LiveOuterService.LJJJLL().LJJJJZI(new C86465Xwb(this), EnumC72797Shd.NORMAL);
    }

    public static void M(View[] viewArr, InterfaceC88472Yns interfaceC88472Yns) {
        for (View view : viewArr) {
            interfaceC88472Yns.invoke(view);
        }
    }
}
