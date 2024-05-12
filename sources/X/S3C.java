package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S3C implements S3A<ConstraintLayout> {
    public S3B LJLIL = new C53646L3q();

    @Override // X.S3A
    public final void LIZIZ(S3B style) {
        o.LJIIIZ(style, "style");
        this.LJLIL = style;
    }

    @Override // X.S3A
    public final SmartImageView LIZJ(ConstraintLayout constraintLayout) {
        ConstraintLayout containerView = constraintLayout;
        o.LJIIIZ(containerView, "containerView");
        return (SmartImageView) containerView.findViewById(R.id.cmp);
    }

    @Override // X.S3A
    public final TuxTextView LIZLLL(ConstraintLayout constraintLayout) {
        ConstraintLayout containerView = constraintLayout;
        o.LJIIIZ(containerView, "containerView");
        Context context = containerView.getContext();
        o.LJIIIIZZ(context, "containerView.context");
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setId(R.id.cmm);
        tuxTextView.setTextColorRes(R.attr.dj);
        tuxTextView.setTuxFont(92);
        tuxTextView.setMaxLines(1);
        tuxTextView.setGravity(17);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setBackground(C04270Et.LIZIZ(tuxTextView.getContext(), R.drawable.apx));
        C018905p c018905p = new C018905p(-2, this.LJLIL.LJFF());
        c018905p.startToStart = 0;
        c018905p.topToTop = 0;
        c018905p.constrainedWidth = true;
        containerView.addView(tuxTextView, c018905p);
        return tuxTextView;
    }

    @Override // X.S3A
    public final SmartImageView LJII(ConstraintLayout constraintLayout) {
        ConstraintLayout containerView = constraintLayout;
        o.LJIIIZ(containerView, "containerView");
        View findViewById = containerView.findViewById(R.id.cms);
        SmartImageView smartImageView = (SmartImageView) findViewById;
        if (this.LJLIL.LIZJ()) {
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.awt);
            c110614Vt.LIZJ = Float.valueOf(this.LJLIL.LIZ());
            Context context = smartImageView.getContext();
            o.LJIIIIZZ(context, "context");
            smartImageView.setPlaceholderImage(c110614Vt.LIZ(context));
        }
        Integer bgColor = this.LJLIL.getBgColor();
        if (bgColor != null) {
            int intValue = bgColor.intValue();
            Context context2 = smartImageView.getContext();
            o.LJIIIIZZ(context2, "context");
            Integer LJI = C79045V0n.LJI(intValue, context2);
            if (LJI != null) {
                smartImageView.setColorFilter(LJI.intValue());
            }
        }
        o.LJIIIIZZ(findViewById, "containerView.findViewBy…          }\n            }");
        return (SmartImageView) findViewById;
    }

    @Override // X.S3A
    public final TuxTextView LJIIIIZZ(ConstraintLayout constraintLayout) {
        ConstraintLayout containerView = constraintLayout;
        o.LJIIIZ(containerView, "containerView");
        Context context = containerView.getContext();
        o.LJIIIIZZ(context, "containerView.context");
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setId(R.id.cmn);
        tuxTextView.setTextColorRes(R.attr.dj);
        tuxTextView.setTuxFont(91);
        tuxTextView.setGravity(17);
        tuxTextView.setMaxLines(1);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LJIIJJI = Float.valueOf(this.LJLIL.LJIIIIZZ());
        c110614Vt.LIZIZ = Integer.valueOf(this.LJLIL.LJIIJJI());
        Context context2 = tuxTextView.getContext();
        o.LJIIIIZZ(context2, "context");
        tuxTextView.setBackground(c110614Vt.LIZ(context2));
        tuxTextView.setPadding(O6R.LJJIIZ(C32151Nz.LJIIZILJ(2)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(1)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(2)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(1)));
        C018905p c018905p = new C018905p(-2, this.LJLIL.LJFF());
        c018905p.endToEnd = 0;
        c018905p.startToEnd = R.id.cmm;
        c018905p.topToTop = 0;
        c018905p.horizontalBias = 0.0f;
        c018905p.constrainedWidth = true;
        containerView.addView(tuxTextView, c018905p);
        return tuxTextView;
    }

    @Override // X.S3A
    public final AppCompatImageView LJIIJ(ConstraintLayout constraintLayout) {
        ConstraintLayout containerView = constraintLayout;
        o.LJIIIZ(containerView, "containerView");
        AppCompatImageView appCompatImageView = new AppCompatImageView(containerView.getContext());
        appCompatImageView.setId(R.id.cmq);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.iz);
        c110614Vt.LIZJ = Float.valueOf(this.LJLIL.LIZ());
        Context context = containerView.getContext();
        o.LJIIIIZZ(context, "containerView.context");
        appCompatImageView.setBackground(c110614Vt.LIZ(context));
        C018905p c018905p = new C018905p(0, 0);
        c018905p.endToEnd = 0;
        c018905p.startToStart = 0;
        c018905p.topToTop = 0;
        c018905p.bottomToBottom = 0;
        c018905p.constrainedWidth = true;
        containerView.addView(appCompatImageView, c018905p);
        return appCompatImageView;
    }
}
