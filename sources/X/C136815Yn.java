package X;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;

/* renamed from: X.5Yn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C136815Yn extends FrameLayout {
    public int bubbleColor;
    public int bubbleLegOffset;
    public EnumC136835Yp bubbleLegOrientation;
    public final Path bubbleLegPrototype;
    public int cornerRadius;
    public int legCornerRadius;
    public float legCurveRatio;
    public int legHalfBase;
    public int legPadding;
    public float minLegDistance;
    public final Paint paint;
    public final Path path;
    public final RectF rectF;
    public float strokeWidth;

    private void renderBubbleLegPrototype() {
        this.bubbleLegPrototype.moveTo(this.legPadding, (float) ((-this.legHalfBase) * 1.25d));
        this.bubbleLegPrototype.cubicTo(this.legPadding * this.legCurveRatio, -20.0f, 0.0f, (-r1) * 0.168f, 0.0f, 0.0f);
        Path path = this.bubbleLegPrototype;
        int i = this.legPadding;
        path.cubicTo(0.0f, i * 0.168f, i * this.legCurveRatio, 20.0f, i, (float) (this.legHalfBase * 1.25d));
        this.bubbleLegPrototype.close();
    }

    private void setPaddingBasedOnOrientation() {
        int i = C136825Yo.LIZ[this.bubbleLegOrientation.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                    setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom() + this.legPadding);
                    return;
                }
                setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight() + this.legPadding, getPaddingBottom());
                return;
            }
            setPadding(getPaddingLeft(), getPaddingTop() + this.legPadding, getPaddingRight(), getPaddingBottom());
            return;
        }
        setPadding(getPaddingLeft() + this.legPadding, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    public int getOrientedPadding() {
        int i = C136825Yo.LIZ[this.bubbleLegOrientation.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return 0;
                    }
                    return getPaddingBottom();
                }
                return getPaddingRight();
            }
            return getPaddingTop();
        }
        return getPaddingLeft();
    }

    public int getLegPadding() {
        return this.legPadding;
    }

    public C136815Yn(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        int i = this.cornerRadius;
        this.path.rewind();
        this.rectF.set(getPaddingLeft(), getPaddingTop(), width - getPaddingRight(), height - getPaddingBottom());
        this.path.addPath(this.bubbleLegPrototype, renderBubbleLegMatrix(width, height));
        this.path.addRoundRect(this.rectF, new float[]{i, i, i, i, i, i, i, i}, Path.Direction.CW);
        canvas.drawPath(this.path, this.paint);
    }

    public void setBubbleColor(int i) {
        this.bubbleColor = i;
        this.paint.setColor(i);
        invalidate();
    }

    public void setBubbleLegOffset(int i) {
        this.bubbleLegOffset = i;
        invalidate();
    }

    public C136815Yn(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private LinearGradient buildLinearGradient(int[] iArr, int i) {
        if (i == 4) {
            return new LinearGradient(getWidth(), 0.0f, 0.0f, getHeight(), iArr, (float[]) null, Shader.TileMode.MIRROR);
        }
        if (i == 2) {
            return new LinearGradient(0.0f, 0.0f, 0.0f, getHeight(), iArr, (float[]) null, Shader.TileMode.MIRROR);
        }
        if (i == 3) {
            return new LinearGradient(0.0f, 0.0f, getWidth(), getHeight(), iArr, (float[]) null, Shader.TileMode.MIRROR);
        }
        return new LinearGradient(0.0f, 0.0f, getWidth(), 0.0f, iArr, (float[]) null, Shader.TileMode.MIRROR);
    }

    private void init(Context context, AttributeSet attributeSet) {
        setWillNotDraw(false);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a01, R.attr.a05, R.attr.a07, R.attr.a7o, R.attr.af9, R.attr.ao4, R.attr.ao5, R.attr.ao6, R.attr.ao7});
            this.legPadding = obtainStyledAttributes.getDimensionPixelSize(8, this.legPadding);
            this.bubbleColor = obtainStyledAttributes.getColor(0, this.bubbleColor);
            this.strokeWidth = obtainStyledAttributes.getFloat(2, this.strokeWidth);
            this.cornerRadius = obtainStyledAttributes.getDimensionPixelSize(3, this.cornerRadius);
            this.bubbleLegOrientation = EnumC136835Yp.values()[obtainStyledAttributes.getInt(1, 0)];
            this.legHalfBase = obtainStyledAttributes.getDimensionPixelSize(4, this.legHalfBase);
            this.legCurveRatio = obtainStyledAttributes.getFloat(6, this.legCurveRatio);
            this.minLegDistance = this.legPadding + this.legHalfBase + this.cornerRadius;
            this.bubbleLegOffset = obtainStyledAttributes.getDimensionPixelSize(7, this.bubbleLegOffset);
            this.legCornerRadius = obtainStyledAttributes.getDimensionPixelSize(5, this.legCornerRadius);
            obtainStyledAttributes.recycle();
        }
        this.paint.setColor(this.bubbleColor);
        this.paint.setStyle(Paint.Style.FILL);
        this.paint.setStrokeCap(Paint.Cap.BUTT);
        this.paint.setStrokeWidth(this.strokeWidth);
        this.paint.setStrokeJoin(Paint.Join.MITER);
        this.paint.setAntiAlias(true);
        renderBubbleLegPrototype();
        setPaddingBasedOnOrientation();
    }

    private Matrix renderBubbleLegMatrix(float f, float f2) {
        float max = Math.max(this.bubbleLegOffset, this.minLegDistance);
        float paddingLeft = getPaddingLeft() - this.legPadding;
        float min = Math.min(max, f2 - this.minLegDistance);
        Matrix matrix = new Matrix();
        int i = C136825Yo.LIZ[this.bubbleLegOrientation.ordinal()];
        if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    paddingLeft = Math.min(max, f - this.minLegDistance);
                    min = (f2 - getPaddingBottom()) + this.legPadding;
                    matrix.postRotate(270.0f);
                }
            } else {
                paddingLeft = this.legPadding + (f - getPaddingRight());
                min = Math.min(max, f2 - this.minLegDistance);
                matrix.postRotate(180.0f);
            }
        } else {
            paddingLeft = Math.min(max, f - this.minLegDistance);
            min = getPaddingTop() - this.legPadding;
            matrix.postRotate(90.0f);
        }
        matrix.postTranslate(paddingLeft, min);
        return matrix;
    }

    public void setBubbleParams(EnumC136835Yp enumC136835Yp, int i) {
        this.bubbleLegOffset = i;
        this.bubbleLegOrientation = enumC136835Yp;
    }

    /* renamed from: setGradient, reason: merged with bridge method [inline-methods] */
    public void lambda$setGradient$0(final int[] iArr, final int i) {
        int width = getWidth();
        int height = getHeight();
        if (width > 0 && height > 0) {
            this.paint.setShader(buildLinearGradient(iArr, i));
            invalidate();
            return;
        }
        post(new Runnable(this) { // from class: X.0uU
            public final /* synthetic */ int LJLIL = 1;
            public final /* synthetic */ Object LJLJI;

            {
                this.LJLJI = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (this.LJLIL) {
                    case 0:
                        ((InterfaceC028009c) this.LJLJI).LJ(i, iArr);
                        return;
                    default:
                        ((C136815Yn) this.LJLJI).lambda$setGradient$0((int[]) iArr, i);
                        return;
                }
            }
        });
    }

    public C136815Yn(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.legPadding = 30;
        this.legHalfBase = 30;
        this.strokeWidth = 2.0f;
        this.cornerRadius = 8;
        this.legCornerRadius = 20;
        this.bubbleColor = -1;
        this.minLegDistance = 68;
        this.legCurveRatio = 0.25f;
        this.path = new Path();
        this.bubbleLegPrototype = new Path();
        this.paint = new Paint(5);
        this.bubbleLegOffset = 0;
        this.rectF = new RectF();
        init(context, attributeSet);
    }
}
