package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S3H implements S3A<ConstraintLayout> {
    public final boolean LJLIL;

    @Override // X.S3A
    public final void LIZIZ(S3B style) {
        o.LJIIIZ(style, "style");
    }

    public S3H(boolean z) {
        this.LJLIL = z;
    }

    @Override // X.S3A
    public final SmartImageView LIZJ(ConstraintLayout containerView) {
        o.LJIIIZ(containerView, "containerView");
        return null;
    }

    @Override // X.S3A
    public final TuxTextView LIZLLL(ConstraintLayout constraintLayout) {
        ConstraintLayout containerView = constraintLayout;
        o.LJIIIZ(containerView, "containerView");
        Context context = containerView.getContext();
        o.LJIIIIZZ(context, "containerView.context");
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setId(R.id.cmm);
        Resources resources = tuxTextView.getContext().getResources();
        tuxTextView.setTextColorRes(R.attr.dj);
        if (this.LJLIL) {
            tuxTextView.setTuxFont(52);
            tuxTextView.setPadding(resources.getDimensionPixelSize(R.dimen.pd), resources.getDimensionPixelSize(R.dimen.p9), resources.getDimensionPixelSize(R.dimen.pd), resources.getDimensionPixelSize(R.dimen.pd));
        } else {
            tuxTextView.setTuxFont(92);
            tuxTextView.setPadding(resources.getDimensionPixelSize(R.dimen.p9), resources.getDimensionPixelSize(R.dimen.p1), resources.getDimensionPixelSize(R.dimen.p9), resources.getDimensionPixelSize(R.dimen.p1));
        }
        tuxTextView.setMaxLines(1);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setBackground(C04270Et.LIZIZ(tuxTextView.getContext(), R.drawable.apw));
        C018905p c018905p = new C018905p(-2, -2);
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
        S3I s3i = new S3I();
        float f = 4;
        s3i.LIZLLL = C45804HyK.LJJ(f);
        int i = 0;
        s3i.LIZ = false;
        smartImageView.setCircleOptions(new S3L(s3i));
        Context context = smartImageView.getContext();
        o.LJIIIIZZ(context, "context");
        Integer LJI = C79045V0n.LJI(R.attr.cj, context);
        if (LJI != null) {
            int intValue = LJI.intValue();
            float[] fArr = new float[8];
            do {
                fArr[i] = C45804HyK.LJJ(f);
                i++;
            } while (i < 8);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
            Paint paint = shapeDrawable.getPaint();
            if (paint != null) {
                paint.setColor(intValue);
            }
            smartImageView.setBackground(shapeDrawable);
        }
        Context context2 = smartImageView.getContext();
        o.LJIIIIZZ(context2, "context");
        S3J s3j = new S3J(context2);
        Context context3 = smartImageView.getContext();
        o.LJIIIIZZ(context3, "context");
        s3j.LJFF(R.attr.dn, context3);
        s3j.LJI(smartImageView.getContext().getResources().getDimensionPixelOffset(R.dimen.p5));
        s3j.LIZLLL(smartImageView.getContext().getResources().getDimensionPixelOffset(R.dimen.p5));
        smartImageView.setPlaceholderImage(s3j);
        o.LJIIIIZZ(findViewById, "containerView.findViewBy…erDefault))\n            }");
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
        Resources resources = tuxTextView.getContext().getResources();
        tuxTextView.setTextColor(R.attr.dj);
        tuxTextView.setTuxFont(91);
        tuxTextView.setMaxLines(1);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setPadding(resources.getDimensionPixelSize(R.dimen.oj), resources.getDimensionPixelSize(R.dimen.oi), resources.getDimensionPixelSize(R.dimen.oj), resources.getDimensionPixelSize(R.dimen.oi));
        tuxTextView.setBackground(C04270Et.LIZIZ(tuxTextView.getContext(), R.drawable.apx));
        C018905p c018905p = new C018905p(-2, -2);
        c018905p.endToEnd = 0;
        c018905p.startToEnd = R.id.cmm;
        c018905p.topToTop = 0;
        c018905p.horizontalBias = 0.0f;
        c018905p.constrainedWidth = true;
        containerView.addView(tuxTextView, c018905p);
        return tuxTextView;
    }

    @Override // X.S3A
    public final AppCompatImageView LJIIJ(ConstraintLayout containerView) {
        o.LJIIIZ(containerView, "containerView");
        return null;
    }
}
