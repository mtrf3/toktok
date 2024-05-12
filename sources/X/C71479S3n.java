package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.S3n, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71479S3n implements InterfaceC71445S2f<C119774mz> {
    public int LJLIL;
    public int LJLILLLLZI;
    public InterfaceC71480S3o LJLJI = new C53618L2o();

    @Override // X.InterfaceC71445S2f
    public final TuxTextView LIZ(C119774mz c119774mz) {
        C119774mz containerView = c119774mz;
        o.LJIIIZ(containerView, "containerView");
        this.LJLIL = 1;
        Context context = containerView.getContext();
        o.LJIIIIZZ(context, "containerView.context");
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setId(R.id.cmt);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setMaxLines(1);
        tuxTextView.setTextAlignment(5);
        tuxTextView.setGravity(this.LJLJI.LJIIIIZZ());
        containerView.addView(tuxTextView, 0, new ViewGroup.MarginLayoutParams(-2, this.LJLJI.LJIIL()));
        return tuxTextView;
    }

    @Override // X.InterfaceC71445S2f
    public final TuxTextView LIZIZ(C119774mz c119774mz) {
        C119774mz containerView = c119774mz;
        o.LJIIIZ(containerView, "containerView");
        this.LJLILLLLZI = 1;
        int i = this.LJLIL;
        if (i >= containerView.getChildCount()) {
            i = -1;
        }
        Context context = containerView.getContext();
        o.LJIIIIZZ(context, "containerView.context");
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setId(R.id.cml);
        tuxTextView.setMaxLines(1);
        tuxTextView.setTextAlignment(5);
        tuxTextView.setTuxFont(this.LJLJI.LJI());
        tuxTextView.setGravity(17);
        tuxTextView.setTextColorRes(this.LJLJI.LJIJI());
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        TextPaint paint = tuxTextView.getPaint();
        paint.setFlags(16);
        paint.setAntiAlias(true);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, this.LJLJI.LJII());
        marginLayoutParams.setMarginStart(tuxTextView.getContext().getResources().getDimensionPixelSize(R.dimen.p2));
        marginLayoutParams.topMargin = this.LJLJI.LJIJ();
        containerView.addView(tuxTextView, i, marginLayoutParams);
        return tuxTextView;
    }

    @Override // X.InterfaceC71445S2f
    public final TuxTextView LIZJ(C119774mz c119774mz) {
        int i;
        C119774mz containerView = c119774mz;
        o.LJIIIZ(containerView, "containerView");
        int i2 = this.LJLIL + this.LJLILLLLZI;
        if (i2 >= containerView.getChildCount()) {
            i2 = -1;
        }
        if (this.LJLJI.LJ() == EnumC53624L2u.NONE) {
            return null;
        }
        Context context = containerView.getContext();
        o.LJIIIIZZ(context, "containerView.context");
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setId(R.id.cm5);
        tuxTextView.setMaxLines(1);
        tuxTextView.setGravity(17);
        tuxTextView.setTextAlignment(5);
        if (C53626L2w.LIZ[this.LJLJI.LJ().ordinal()] == 1) {
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZJ = this.LJLJI.LIZJ();
            c110614Vt.LIZIZ = this.LJLJI.LIZIZ();
            Context context2 = tuxTextView.getContext();
            o.LJIIIIZZ(context2, "context");
            tuxTextView.setBackground(c110614Vt.LIZ(context2));
        }
        C26338AVi.LJIIIZ(tuxTextView, this.LJLJI.LJIJJ(), 0, this.LJLJI.LJIJJ(), 0, 16);
        Integer LJFF = this.LJLJI.LJFF();
        if (LJFF != null) {
            tuxTextView.setTuxFont(LJFF.intValue());
        }
        Integer LIZ = this.LJLJI.LIZ();
        if (LIZ != null) {
            tuxTextView.setTextColorRes(LIZ.intValue());
        }
        Integer LIZLLL = this.LJLJI.LIZLLL();
        if (LIZLLL != null) {
            i = LIZLLL.intValue();
        } else {
            i = -2;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, i);
        marginLayoutParams.setMarginStart(tuxTextView.getContext().getResources().getDimensionPixelSize(R.dimen.p2));
        Integer LJIILIIL = this.LJLJI.LJIILIIL();
        if (LJIILIIL != null) {
            marginLayoutParams.topMargin = LJIILIIL.intValue();
        }
        containerView.addView(tuxTextView, i2, marginLayoutParams);
        return tuxTextView;
    }

    @Override // X.InterfaceC71445S2f
    public final void LIZLLL(InterfaceC71480S3o style) {
        o.LJIIIZ(style, "style");
        this.LJLJI = style;
    }
}
