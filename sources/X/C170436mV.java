package X;

import Y.ACListenerS37S0200000_2;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.6mV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C170436mV extends RecyclerView.ViewHolder {
    public final View LJLIL;
    public final InterfaceC165006dk LJLILLLLZI;
    public C72790ShW LJLJI;
    public TuxTextView LJLJJI;
    public View LJLJJL;
    public EffectModel LJLJJLL;
    public final /* synthetic */ C170416mT LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C170436mV(C170416mT c170416mT, View view, InterfaceC165006dk interfaceC165006dk) {
        super(view);
        this.LJLJL = c170416mT;
        this.LJLIL = view;
        this.LJLILLLLZI = interfaceC165006dk;
        ViewGroup.LayoutParams layoutParams = view.findViewById(R.id.etn).getLayoutParams();
        C164926dc c164926dc = c170416mT.LJLILLLLZI;
        layoutParams.width = c164926dc.LJJIFFI + c164926dc.LJJI;
        C72790ShW c72790ShW = (C72790ShW) view.findViewById(R.id.f2e);
        int min = Math.min(SFS.LJI(60.0d), (int) (C143205jg.LJ() * 0.14d));
        c72790ShW.getLayoutParams().width = min;
        c72790ShW.getLayoutParams().height = min;
        this.LJLJI = c72790ShW;
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.m64);
        tuxTextView.setHorizontalFadingEdgeEnabled(true);
        tuxTextView.setFadingEdgeLength((int) KL2.LIZJ(tuxTextView.getContext(), 4.0f));
        tuxTextView.getLayoutParams().width = c170416mT.LJLILLLLZI.LJJIFFI;
        this.LJLJJI = tuxTextView;
        C72790ShW c72790ShW2 = this.LJLJI;
        if (c72790ShW2 != null) {
            c72790ShW2.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS37S0200000_2(c170416mT, this, 13)));
        }
        View it = view.findViewById(R.id.kgn);
        C72790ShW c72790ShW3 = this.LJLJI;
        if (c72790ShW3 != null) {
            o.LJIIIIZZ(it, "it");
            c72790ShW3.setOnTouchListener(new ViewOnTouchListenerC170476mZ(1.2f, 100L, it));
        }
        it.getLayoutParams().width = SFS.LJI(8.0d) + min;
        it.getLayoutParams().height = it.getLayoutParams().width;
        this.LJLJJL = it;
    }
}
