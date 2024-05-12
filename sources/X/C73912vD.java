package X;

import Y.ARunnableS50S0100000_14;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.2vD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C73912vD extends LinearLayout {
    public static final /* synthetic */ int LJLJJI = 0;
    public final TuxTextView LJLIL;
    public final TuxTextView LJLILLLLZI;
    public final LinearLayout LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C73912vD(ActivityC45651qj activityC45651qj) {
        super(activityC45651qj, null, 0);
        new LinkedHashMap();
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(activityC45651qj), R.layout.bre, this, true);
        View findViewById = findViewById(R.id.m2v);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.tv_content)");
        TuxTextView tuxTextView = (TuxTextView) findViewById;
        this.LJLIL = tuxTextView;
        tuxTextView.setVisibility(4);
        View findViewById2 = findViewById(R.id.mo6);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.tv_title)");
        TuxTextView tuxTextView2 = (TuxTextView) findViewById2;
        this.LJLILLLLZI = tuxTextView2;
        Context context = tuxTextView2.getContext();
        o.LJIIIIZZ(context, "titleTv.context");
        C26338AVi.LJI(tuxTextView2, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)) + C63081OpJ.LJJJJLI(context)), null, null, false, 29);
        setOnClickListener(new ViewOnClickListenerC13880ga(new View.OnClickListener() { // from class: X.2vC
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewParent parent = view.getParent();
                o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                C16880lQ.LJLLL(view, (ViewGroup) parent);
            }
        }));
        tuxTextView2.setVisibility(4);
        View findViewById3 = findViewById(R.id.g1u);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.ll_background)");
        LinearLayout linearLayout = (LinearLayout) findViewById3;
        this.LJLJI = linearLayout;
        linearLayout.setVisibility(4);
        post(new ARunnableS50S0100000_14(this, 186));
    }
}
