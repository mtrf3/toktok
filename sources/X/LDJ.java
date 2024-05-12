package X;

import Y.AUListenerS97S0100000_9;
import Y.IDAListenerS77S0100000_9;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.infoSticker.customsticker.helper.Coordinate;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LDJ extends View {
    public final ArrayList<Path> LJLIL;
    public final ArrayList<Path> LJLILLLLZI;
    public final ArrayList<PathMeasure> LJLJI;
    public final Paint LJLJJI;
    public float LJLJJL;
    public float LJLJJLL;
    public LDK LJLJL;
    public List<? extends List<Coordinate>> LJLJLJ;
    public boolean LJLJLLL;
    public ValueAnimator LJLL;
    public int LJLLI;
    public float LJLLILLLL;
    public boolean LJLLJ;

    public final boolean LIZ() {
        if (this.LJLL.isRunning() || this.LJLL.isStarted()) {
            return true;
        }
        return false;
    }

    public final ValueAnimator getAnimator() {
        return this.LJLL;
    }

    public final LDK getCompleteListener() {
        return this.LJLJL;
    }

    public final boolean getDynamicLength() {
        return this.LJLLJ;
    }

    public final float getLength() {
        return this.LJLJJL;
    }

    public final List<List<Coordinate>> getPoints() {
        return this.LJLJLJ;
    }

    public final float getRatio() {
        return this.LJLLILLLL;
    }

    public final int getRepeatCount() {
        return this.LJLLI;
    }

    public final boolean getShowAnimation() {
        return this.LJLJLLL;
    }

    public final float getValue() {
        return this.LJLJJLL;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        List<? extends List<Coordinate>> list;
        float f;
        super.onDraw(canvas);
        if (this.LJLJLLL && (list = this.LJLJLJ) != null) {
            int i = 0;
            for (List<Coordinate> list2 : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    List<Coordinate> list3 = list2;
                    Object obj = ListProtector.get(this.LJLIL, i);
                    o.LJIIIIZZ(obj, "paths[index]");
                    Path path = (Path) obj;
                    Object obj2 = ListProtector.get(this.LJLILLLLZI, i);
                    o.LJIIIIZZ(obj2, "dstPaths[index]");
                    Path path2 = (Path) obj2;
                    Object obj3 = ListProtector.get(this.LJLJI, i);
                    o.LJIIIIZZ(obj3, "pathMeasures[index]");
                    PathMeasure pathMeasure = (PathMeasure) obj3;
                    path.moveTo(((Coordinate) ListProtector.get(list3, 0)).getX(), ((Coordinate) ListProtector.get(list3, 0)).getY());
                    for (Coordinate coordinate : list3) {
                        path.lineTo(coordinate.getX(), coordinate.getY());
                    }
                    path.close();
                    pathMeasure.setPath(path, true);
                    this.LJLJJL = pathMeasure.getLength();
                    path2.reset();
                    path2.lineTo(0.0f, 0.0f);
                    float f2 = 0.2f;
                    if (this.LJLLJ) {
                        float f3 = this.LJLJJL;
                        float f4 = this.LJLJJLL;
                        float f5 = f3 * f4;
                        if (0.0f <= f4 && f4 <= 0.2f) {
                            f = f4 * 2;
                        } else if (0.2f <= f4 && f4 <= 0.4f) {
                            f = 0.4f;
                        } else {
                            f = ((1 - f4) * 2.0f) / 3.0f;
                        }
                        pathMeasure.getSegment(f5, (f3 * f) + f5, path2, true);
                    } else {
                        float f6 = this.LJLJJL;
                        float f7 = this.LJLJJLL;
                        float f8 = f6 * f7;
                        if (0.0f <= f7 && f7 <= 0.2f) {
                            f2 = f7;
                        } else if (0.2f > f7 || f7 > 0.8f) {
                            f2 = 1.0f - f7;
                        }
                        pathMeasure.getSegment(f8, (f6 * f2) + f8, path2, true);
                    }
                    if (canvas != null) {
                        canvas.drawPath(path2, this.LJLJJI);
                    }
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
    }

    public final void setAnimator(ValueAnimator valueAnimator) {
        o.LJIIIZ(valueAnimator, "<set-?>");
        this.LJLL = valueAnimator;
    }

    public final void setCompleteListener(LDK ldk) {
        this.LJLJL = ldk;
    }

    public final void setDynamicLength(boolean z) {
        this.LJLLJ = z;
    }

    public final void setLength(float f) {
        this.LJLJJL = f;
    }

    public final void setPoints(List<? extends List<Coordinate>> list) {
        this.LJLJLJ = list;
        if (list != null) {
            this.LJLIL.clear();
            this.LJLILLLLZI.clear();
            this.LJLJI.clear();
            int size = list.size();
            if (size >= 0) {
                int i = 0;
                while (true) {
                    this.LJLIL.add(new Path());
                    this.LJLILLLLZI.add(new Path());
                    this.LJLJI.add(new PathMeasure());
                    if (i != size) {
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void setRatio(float f) {
        this.LJLLILLLL = f;
        this.LJLJJI.setStrokeWidth(SFS.LJI(2.0d) / f);
    }

    public final void setRepeatCount(int i) {
        this.LJLLI = i;
        this.LJLL.setRepeatCount(i);
    }

    public final void setShowAnimation(boolean z) {
        this.LJLJLLL = z;
        if (z) {
            this.LJLL.start();
            H7B.LJ("AnimationPathView# Start animation");
        } else {
            this.LJLL.cancel();
            H7B.LJ("AnimationPathView# cancel animation");
        }
        invalidate();
    }

    public final void setValue(float f) {
        this.LJLJJLL = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LDJ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = new ArrayList<>();
        this.LJLILLLLZI = new ArrayList<>();
        this.LJLJI = new ArrayList<>();
        Paint paint = new Paint();
        this.LJLJJI = paint;
        this.LJLLILLLL = 1.0f;
        paint.setAntiAlias(true);
        paint.setColor(AnonymousClass636.LJIIIIZZ(R.attr.cl, context));
        paint.setStrokeWidth(SFS.LJI(2.0d));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        o.LJIIIIZZ(ofFloat, "ofFloat(0f, 1f)");
        this.LJLL = ofFloat;
        ofFloat.addUpdateListener(new AUListenerS97S0100000_9(this, 52));
        this.LJLL.setDuration(1200L);
        this.LJLL.setInterpolator(new AccelerateDecelerateInterpolator());
        this.LJLL.setRepeatCount(this.LJLLI);
        this.LJLL.addListener(new IDAListenerS77S0100000_9(this, 16));
    }
}
