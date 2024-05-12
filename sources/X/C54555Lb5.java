package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Lb5, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54555Lb5 implements InterfaceC71450S2k<ConstraintLayout> {
    public InterfaceC54556Lb6 LIZ = new L30();

    @Override // X.InterfaceC71450S2k
    public final void LIZ(InterfaceC54556Lb6 interfaceC54556Lb6) {
        this.LIZ = interfaceC54556Lb6;
    }

    @Override // X.InterfaceC71450S2k
    public final TuxTextView LIZIZ(ConstraintLayout constraintLayout) {
        int i;
        ConstraintLayout containerView = constraintLayout;
        o.LJIIIZ(containerView, "containerView");
        Context context = containerView.getContext();
        o.LJIIIIZZ(context, "containerView.context");
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setId(R.id.cm6);
        tuxTextView.setMaxLines(1);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setGravity(17);
        tuxTextView.setTextAlignment(4);
        if (C53625L2v.LIZ[this.LIZ.LJ().ordinal()] == 1) {
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZJ = this.LIZ.LIZJ();
            c110614Vt.LIZIZ = this.LIZ.LIZIZ();
            Context context2 = tuxTextView.getContext();
            o.LJIIIIZZ(context2, "context");
            tuxTextView.setBackground(c110614Vt.LIZ(context2));
        }
        Integer LJFF = this.LIZ.LJFF();
        if (LJFF != null) {
            tuxTextView.setTuxFont(LJFF.intValue());
        }
        Integer LIZ = this.LIZ.LIZ();
        if (LIZ != null) {
            tuxTextView.setTextColorRes(LIZ.intValue());
        }
        C26338AVi.LJIIIZ(tuxTextView, Integer.valueOf(tuxTextView.getContext().getResources().getDimensionPixelOffset(R.dimen.pd)), 0, Integer.valueOf(tuxTextView.getContext().getResources().getDimensionPixelOffset(R.dimen.pd)), 0, 16);
        Integer LIZLLL = this.LIZ.LIZLLL();
        if (LIZLLL != null) {
            i = LIZLLL.intValue();
        } else {
            i = -2;
        }
        C018905p c018905p = new C018905p(-2, i);
        c018905p.bottomToBottom = 0;
        c018905p.startToStart = 0;
        c018905p.endToEnd = 0;
        c018905p.setMarginStart(tuxTextView.getContext().getResources().getDimensionPixelOffset(R.dimen.pb));
        c018905p.setMarginEnd(tuxTextView.getContext().getResources().getDimensionPixelOffset(R.dimen.pb));
        ((ViewGroup.MarginLayoutParams) c018905p).bottomMargin = tuxTextView.getContext().getResources().getDimensionPixelOffset(R.dimen.pb);
        c018905p.horizontalBias = 0.0f;
        c018905p.constrainedWidth = true;
        containerView.addView(tuxTextView, c018905p);
        return tuxTextView;
    }
}
