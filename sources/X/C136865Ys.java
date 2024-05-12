package X;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.5Ys, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C136865Ys extends LinearLayout {
    public static int LLFFF;
    public static int LLFII;
    public static float LLFZ;
    public static float LLI;
    public static float LLIFFJFJJ;
    public static int LLII;
    public static int LLIIII;
    public float LJLIL;
    public Paint LJLILLLLZI;
    public Path LJLJI;
    public Path LJLJJI;
    public RectF LJLJJL;
    public float LJLJJLL;
    public float LJLJL;
    public Path LJLJLJ;
    public RectF LJLJLLL;
    public int LJLL;
    public Matrix LJLLI;
    public Bitmap LJLLILLLL;
    public Canvas LJLLJ;
    public int LJLLL;
    public int LJLLLL;
    public int LJLLLLLL;
    public boolean LJLZ;
    public float LJZ;
    public int LJZI;
    public boolean LJZL;
    public boolean LL;
    public boolean LLD;
    public boolean LLF;
    public boolean LLFF;

    public final float getBubbleOffset() {
        float f;
        float f2 = this.LJZ;
        float f3 = LLIFFJFJJ;
        if (f2 < f3) {
            f2 = f3;
        }
        int i = this.LJZI;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return 0.0f;
                    }
                    f = this.LJLJJLL - f3;
                    if (f2 <= f) {
                        return f2;
                    }
                } else {
                    f = this.LJLJL - f3;
                    if (f2 <= f) {
                        return f2;
                    }
                }
            } else {
                f = this.LJLJL - f3;
                if (f2 <= f) {
                    return f2;
                }
            }
        } else {
            f = this.LJLJJLL - f3;
            if (f2 <= f) {
                return f2;
            }
        }
        return f;
    }

    public final Path getMBorderBubbleArrowPath() {
        Path path = this.LJLJLJ;
        if (path != null) {
            return path;
        }
        o.LJIJI("mBorderBubbleArrowPath");
        throw null;
    }

    public final Matrix getMBorderMatrix() {
        Matrix matrix = this.LJLLI;
        if (matrix != null) {
            return matrix;
        }
        o.LJIJI("mBorderMatrix");
        throw null;
    }

    public final RectF getMBorderRoundRect() {
        RectF rectF = this.LJLJLLL;
        if (rectF != null) {
            return rectF;
        }
        o.LJIJI("mBorderRoundRect");
        throw null;
    }

    public final Path getMBubbleArrowPath() {
        Path path = this.LJLJJI;
        if (path != null) {
            return path;
        }
        o.LJIJI("mBubbleArrowPath");
        throw null;
    }

    public final Paint getMFillPaint() {
        Paint paint = this.LJLILLLLZI;
        if (paint != null) {
            return paint;
        }
        o.LJIJI("mFillPaint");
        throw null;
    }

    public final Path getMPath() {
        Path path = this.LJLJI;
        if (path != null) {
            return path;
        }
        o.LJIJI("mPath");
        throw null;
    }

    public final int getPADDING() {
        return LLFFF / 2;
    }

    public final int getMBgColor() {
        return this.LJLLL;
    }

    public final int getMBorderColor() {
        return this.LJLLLL;
    }

    public final int getMBorderWidth() {
        return this.LJLL;
    }

    public final float getMHeight() {
        return this.LJLJL;
    }

    public final boolean getMNeedAddColor() {
        return this.LLF;
    }

    public final boolean getMNeedArrow() {
        return this.LLD;
    }

    public final boolean getMNeedPath() {
        return this.LJZL;
    }

    public final boolean getMNeedPressFade() {
        return this.LL;
    }

    public final boolean getMNeedShadow() {
        return this.LJLZ;
    }

    public final float getMPadding() {
        return this.LJLIL;
    }

    public final int getMShadowColor() {
        return this.LJLLLLLL;
    }

    public final float getMWidth() {
        return this.LJLJJLL;
    }

    public final boolean getUseDefaultView() {
        return this.LLFF;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C136865Ys(Context context) {
        super(context, null, 0);
        o.LJIIIZ(context, "context");
        this.LJLIL = 12.0f;
        this.LJLLLLLL = -16777216;
        this.LJZ = 0.75f;
        this.LJZI = 1;
        this.LJZL = true;
        this.LLD = true;
        this.LLF = true;
        this.LLFF = true;
        this.LJLL = (int) C74275TDb.LIZIZ(context, 0.7f);
        LLFFF = (int) C74275TDb.LIZIZ(context, 7.0f);
        LLFZ = 2.0f;
        LLI = C74275TDb.LIZIZ(context, 8.0f);
        LLIFFJFJJ = C74275TDb.LIZIZ(context, 3.0f);
        LLII = (int) C74275TDb.LIZIZ(context, 50.0f);
        LLIIII = (int) C74275TDb.LIZIZ(context, 56.0f);
        this.LJLILLLLZI = new Paint();
        this.LJLJI = new Path();
        this.LJLJLJ = new Path();
        this.LJLJJI = new Path();
        Paint paint = this.LJLILLLLZI;
        if (paint != null) {
            paint.setStyle(Paint.Style.FILL);
            Paint paint2 = this.LJLILLLLZI;
            if (paint2 != null) {
                paint2.setStrokeCap(Paint.Cap.BUTT);
                Paint paint3 = this.LJLILLLLZI;
                if (paint3 != null) {
                    paint3.setAntiAlias(true);
                    Paint paint4 = this.LJLILLLLZI;
                    if (paint4 != null) {
                        paint4.setStrokeWidth(LLFZ);
                        Paint paint5 = this.LJLILLLLZI;
                        if (paint5 != null) {
                            paint5.setStrokeJoin(Paint.Join.MITER);
                            this.LJLLL = getResources().getColor(R.color.x7);
                            this.LJLLLL = getResources().getColor(R.color.rq);
                            Paint paint6 = this.LJLILLLLZI;
                            if (paint6 != null) {
                                paint6.setColor(this.LJLLL);
                                Paint paint7 = this.LJLILLLLZI;
                                if (paint7 != null) {
                                    setLayerType(1, paint7);
                                    if (this.LJLZ) {
                                        Paint paint8 = this.LJLILLLLZI;
                                        if (paint8 != null) {
                                            paint8.setShadowLayer(2.0f, 2.0f, 5.0f, this.LJLLLLLL);
                                        } else {
                                            o.LJIJI("mFillPaint");
                                            throw null;
                                        }
                                    }
                                    Path path = this.LJLJJI;
                                    if (path != null) {
                                        path.moveTo(0.0f, 0.0f);
                                        Path path2 = this.LJLJJI;
                                        if (path2 != null) {
                                            path2.lineTo(LLFFF, -r0);
                                            Path path3 = this.LJLJJI;
                                            if (path3 != null) {
                                                float f = LLFFF;
                                                path3.lineTo(f, f);
                                                Path path4 = this.LJLJJI;
                                                if (path4 != null) {
                                                    path4.close();
                                                    Path path5 = this.LJLJLJ;
                                                    if (path5 != null) {
                                                        path5.moveTo(0.0f, 0.0f);
                                                        Path path6 = this.LJLJLJ;
                                                        if (path6 != null) {
                                                            path6.lineTo((float) ((Math.sqrt(2.0d) * this.LJLL) + LLFFF), (float) ((-LLFFF) - (Math.sqrt(2.0d) * this.LJLL)));
                                                            Path path7 = this.LJLJLJ;
                                                            if (path7 != null) {
                                                                path7.lineTo((float) ((Math.sqrt(2.0d) * this.LJLL) + LLFFF), (float) ((Math.sqrt(2.0d) * this.LJLL) + LLFFF));
                                                                Path path8 = this.LJLJLJ;
                                                                if (path8 != null) {
                                                                    path8.close();
                                                                    setBackgroundColor(0);
                                                                    setClipChildren(false);
                                                                    return;
                                                                }
                                                                o.LJIJI("mBorderBubbleArrowPath");
                                                                throw null;
                                                            }
                                                            o.LJIJI("mBorderBubbleArrowPath");
                                                            throw null;
                                                        }
                                                        o.LJIJI("mBorderBubbleArrowPath");
                                                        throw null;
                                                    }
                                                    o.LJIJI("mBorderBubbleArrowPath");
                                                    throw null;
                                                }
                                                o.LJIJI("mBubbleArrowPath");
                                                throw null;
                                            }
                                            o.LJIJI("mBubbleArrowPath");
                                            throw null;
                                        }
                                        o.LJIJI("mBubbleArrowPath");
                                        throw null;
                                    }
                                    o.LJIJI("mBubbleArrowPath");
                                    throw null;
                                }
                                o.LJIJI("mFillPaint");
                                throw null;
                            }
                            o.LJIJI("mFillPaint");
                            throw null;
                        }
                        o.LJIJI("mFillPaint");
                        throw null;
                    }
                    o.LJIJI("mFillPaint");
                    throw null;
                }
                o.LJIJI("mFillPaint");
                throw null;
            }
            o.LJIJI("mFillPaint");
            throw null;
        }
        o.LJIJI("mFillPaint");
        throw null;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        Bitmap bitmap = this.LJLLILLLL;
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            this.LJLLILLLL = bitmap;
            this.LJLLJ = new Canvas(bitmap);
        }
        float f = this.LJLJJLL;
        float f2 = this.LJLJL;
        float max = Math.max(this.LJZ, LLIFFJFJJ);
        Matrix matrix = new Matrix();
        this.LJLLI = new Matrix();
        int i = this.LJZI;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        float min = Math.min(max, f - LLIFFJFJJ);
                        matrix.postRotate(270.0f);
                        Matrix matrix2 = this.LJLLI;
                        if (matrix2 != null) {
                            matrix2.postRotate(270.0f);
                            Matrix matrix3 = this.LJLLI;
                            if (matrix3 != null) {
                                int i2 = this.LJLL;
                                matrix3.postTranslate((((i2 * 3) / 2) + min) - ((LLFFF * 3) / 2), (i2 * 2) + f2);
                                setPadding(0, 0, 0, LLFFF);
                                setGravity(17);
                                this.LJLJJL = new RectF(0.0f, 0.0f, this.LJLJJLL, this.LJLJL - LLFFF);
                                float f3 = (this.LJLL * 3) / 2;
                                matrix.postTranslate((min + f3) - ((LLFFF * 3) / 2), f2 + f3);
                            } else {
                                o.LJIJI("mBorderMatrix");
                                throw null;
                            }
                        } else {
                            o.LJIJI("mBorderMatrix");
                            throw null;
                        }
                    }
                } else {
                    float min2 = Math.min(max, f2 - LLIFFJFJJ);
                    matrix.postRotate(180.0f);
                    Matrix matrix4 = this.LJLLI;
                    if (matrix4 != null) {
                        matrix4.postRotate(180.0f);
                        Matrix matrix5 = this.LJLLI;
                        if (matrix5 != null) {
                            float f4 = this.LJLL * 2;
                            matrix5.postTranslate(f4 + f, (f4 + min2) - ((LLFFF * 3) / 2));
                            setPadding(0, 0, LLFFF, 0);
                            setGravity(17);
                            this.LJLJJL = new RectF(0.0f, 0.0f, this.LJLJJLL - LLFFF, this.LJLJL);
                            int i3 = this.LJLL;
                            matrix.postTranslate(f + ((i3 * 3) / 2), (min2 + (i3 * 2)) - ((LLFFF * 3) / 2));
                        } else {
                            o.LJIJI("mBorderMatrix");
                            throw null;
                        }
                    } else {
                        o.LJIJI("mBorderMatrix");
                        throw null;
                    }
                }
            } else {
                float min3 = Math.min(max, f2 - LLIFFJFJJ);
                setPadding(LLFFF, 0, 0, 0);
                setGravity(17);
                Matrix matrix6 = this.LJLLI;
                if (matrix6 != null) {
                    matrix6.postTranslate(this.LJLL + 0.0f, ((r0 * 2) + min3) - ((LLFFF * 3) / 2));
                    this.LJLJJL = new RectF(LLFFF, 0.0f, this.LJLJJLL, this.LJLJL);
                    int i4 = this.LJLL;
                    matrix.postTranslate(((i4 * 3) / 2) + 0.0f, (min3 + (i4 * 2)) - ((LLFFF * 3) / 2));
                } else {
                    o.LJIJI("mBorderMatrix");
                    throw null;
                }
            }
        } else {
            float min4 = Math.min(max, f - LLIFFJFJJ);
            matrix.postRotate(90.0f);
            Matrix matrix7 = this.LJLLI;
            if (matrix7 != null) {
                matrix7.postRotate(90.0f);
                Matrix matrix8 = this.LJLLI;
                if (matrix8 != null) {
                    matrix8.postTranslate((((r12 * 3) / 2) + min4) - ((LLFFF * 3) / 2), this.LJLL + 0.0f);
                    setPadding(0, LLFFF, 0, 0);
                    setGravity(17);
                    this.LJLJJL = new RectF(0.0f, LLFFF, this.LJLJJLL, this.LJLJL);
                    float f5 = (this.LJLL * 3) / 2;
                    matrix.postTranslate((min4 + f5) - ((LLFFF * 3) / 2), f5 + 0.0f);
                } else {
                    o.LJIJI("mBorderMatrix");
                    throw null;
                }
            } else {
                o.LJIJI("mBorderMatrix");
                throw null;
            }
        }
        RectF rectF = this.LJLJJL;
        if (rectF != null) {
            float f6 = rectF.left;
            float f7 = (this.LJLL * 3) / 2;
            rectF.left = f6 + f7;
            rectF.top += f7;
            rectF.right += f7;
            rectF.bottom += f7;
            RectF rectF2 = new RectF();
            this.LJLJLLL = rectF2;
            RectF rectF3 = this.LJLJJL;
            if (rectF3 != null) {
                float f8 = rectF3.left;
                float f9 = this.LJLL / 2;
                rectF2.left = f8 - f9;
                rectF2.top = rectF3.top - f9;
                rectF2.right = rectF3.right + f9;
                rectF2.bottom = rectF3.bottom + f9;
                if (this.LJLZ) {
                    Paint paint = this.LJLILLLLZI;
                    if (paint != null) {
                        paint.setShadowLayer(2.0f, 2.0f, 5.0f, this.LJLLLLLL);
                    } else {
                        o.LJIJI("mFillPaint");
                        throw null;
                    }
                }
                if (this.LJZL) {
                    Paint paint2 = this.LJLILLLLZI;
                    if (paint2 != null) {
                        paint2.setColor(this.LJLLLL);
                        Paint paint3 = this.LJLILLLLZI;
                        if (paint3 != null) {
                            paint3.setStyle(Paint.Style.STROKE);
                            Paint paint4 = this.LJLILLLLZI;
                            if (paint4 != null) {
                                paint4.setStrokeWidth(this.LJLL);
                                Path path = this.LJLJI;
                                if (path != null) {
                                    path.reset();
                                    Path path2 = this.LJLJI;
                                    if (path2 != null) {
                                        RectF rectF4 = this.LJLJLLL;
                                        if (rectF4 != null) {
                                            float f10 = LLI;
                                            int i5 = this.LJLL;
                                            path2.addRoundRect(rectF4, (i5 / 2) + f10, f10 + (i5 / 2), Path.Direction.CW);
                                            if (this.LLD) {
                                                Path path3 = this.LJLJI;
                                                if (path3 != null) {
                                                    Path path4 = this.LJLJLJ;
                                                    if (path4 != null) {
                                                        Matrix matrix9 = this.LJLLI;
                                                        if (matrix9 != null) {
                                                            path3.addPath(path4, matrix9);
                                                        } else {
                                                            o.LJIJI("mBorderMatrix");
                                                            throw null;
                                                        }
                                                    } else {
                                                        o.LJIJI("mBorderBubbleArrowPath");
                                                        throw null;
                                                    }
                                                } else {
                                                    o.LJIJI("mPath");
                                                    throw null;
                                                }
                                            }
                                            Canvas canvas2 = this.LJLLJ;
                                            if (canvas2 != null) {
                                                Path path5 = this.LJLJI;
                                                if (path5 != null) {
                                                    Paint paint5 = this.LJLILLLLZI;
                                                    if (paint5 != null) {
                                                        canvas2.drawPath(path5, paint5);
                                                        if (this.LLF) {
                                                            Paint paint6 = this.LJLILLLLZI;
                                                            if (paint6 != null) {
                                                                paint6.setColor(getResources().getColor(R.color.uf));
                                                                Paint paint7 = this.LJLILLLLZI;
                                                                if (paint7 != null) {
                                                                    paint7.setStyle(Paint.Style.STROKE);
                                                                    Path path6 = this.LJLJI;
                                                                    if (path6 != null) {
                                                                        path6.reset();
                                                                        if (this.LLD) {
                                                                            Path path7 = this.LJLJI;
                                                                            if (path7 != null) {
                                                                                Path path8 = this.LJLJLJ;
                                                                                if (path8 != null) {
                                                                                    Matrix matrix10 = this.LJLLI;
                                                                                    if (matrix10 != null) {
                                                                                        path7.addPath(path8, matrix10);
                                                                                    } else {
                                                                                        o.LJIJI("mBorderMatrix");
                                                                                        throw null;
                                                                                    }
                                                                                } else {
                                                                                    o.LJIJI("mBorderBubbleArrowPath");
                                                                                    throw null;
                                                                                }
                                                                            } else {
                                                                                o.LJIJI("mPath");
                                                                                throw null;
                                                                            }
                                                                        }
                                                                        Path path9 = this.LJLJI;
                                                                        if (path9 != null) {
                                                                            RectF rectF5 = this.LJLJLLL;
                                                                            if (rectF5 != null) {
                                                                                float f11 = LLI;
                                                                                int i6 = this.LJLL;
                                                                                path9.addRoundRect(rectF5, (i6 / 2) + f11, f11 + (i6 / 2), Path.Direction.CW);
                                                                                Canvas canvas3 = this.LJLLJ;
                                                                                if (canvas3 != null) {
                                                                                    Path path10 = this.LJLJI;
                                                                                    if (path10 != null) {
                                                                                        Paint paint8 = this.LJLILLLLZI;
                                                                                        if (paint8 != null) {
                                                                                            canvas3.drawPath(path10, paint8);
                                                                                        } else {
                                                                                            o.LJIJI("mFillPaint");
                                                                                            throw null;
                                                                                        }
                                                                                    } else {
                                                                                        o.LJIJI("mPath");
                                                                                        throw null;
                                                                                    }
                                                                                } else {
                                                                                    o.LJIJI("mCanvas");
                                                                                    throw null;
                                                                                }
                                                                            } else {
                                                                                o.LJIJI("mBorderRoundRect");
                                                                                throw null;
                                                                            }
                                                                        } else {
                                                                            o.LJIJI("mPath");
                                                                            throw null;
                                                                        }
                                                                    } else {
                                                                        o.LJIJI("mPath");
                                                                        throw null;
                                                                    }
                                                                } else {
                                                                    o.LJIJI("mFillPaint");
                                                                    throw null;
                                                                }
                                                            } else {
                                                                o.LJIJI("mFillPaint");
                                                                throw null;
                                                            }
                                                        }
                                                    } else {
                                                        o.LJIJI("mFillPaint");
                                                        throw null;
                                                    }
                                                } else {
                                                    o.LJIJI("mPath");
                                                    throw null;
                                                }
                                            } else {
                                                o.LJIJI("mCanvas");
                                                throw null;
                                            }
                                        } else {
                                            o.LJIJI("mBorderRoundRect");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("mPath");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("mPath");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("mFillPaint");
                                throw null;
                            }
                        } else {
                            o.LJIJI("mFillPaint");
                            throw null;
                        }
                    } else {
                        o.LJIJI("mFillPaint");
                        throw null;
                    }
                }
                Paint paint9 = this.LJLILLLLZI;
                if (paint9 != null) {
                    paint9.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
                    Paint paint10 = this.LJLILLLLZI;
                    if (paint10 != null) {
                        paint10.setColor(this.LJLLL);
                        Paint paint11 = this.LJLILLLLZI;
                        if (paint11 != null) {
                            paint11.setStyle(Paint.Style.FILL);
                            Path path11 = this.LJLJI;
                            if (path11 != null) {
                                path11.reset();
                                Path path12 = this.LJLJI;
                                if (path12 != null) {
                                    RectF rectF6 = this.LJLJJL;
                                    if (rectF6 != null) {
                                        float f12 = LLI;
                                        path12.addRoundRect(rectF6, f12, f12, Path.Direction.CW);
                                        if (this.LLD) {
                                            Path path13 = this.LJLJI;
                                            if (path13 != null) {
                                                Path path14 = this.LJLJJI;
                                                if (path14 != null) {
                                                    path13.addPath(path14, matrix);
                                                } else {
                                                    o.LJIJI("mBubbleArrowPath");
                                                    throw null;
                                                }
                                            } else {
                                                o.LJIJI("mPath");
                                                throw null;
                                            }
                                        }
                                        Canvas canvas4 = this.LJLLJ;
                                        if (canvas4 != null) {
                                            Path path15 = this.LJLJI;
                                            if (path15 != null) {
                                                Paint paint12 = this.LJLILLLLZI;
                                                if (paint12 != null) {
                                                    canvas4.drawPath(path15, paint12);
                                                    Paint paint13 = this.LJLILLLLZI;
                                                    if (paint13 != null) {
                                                        paint13.setXfermode(null);
                                                        float f13 = LLFFF;
                                                        Context context = getContext();
                                                        o.LJIIIIZZ(context, "context");
                                                        float LIZIZ = f13 - C74275TDb.LIZIZ(context, 1.4f);
                                                        float f14 = LLFFF;
                                                        Context context2 = getContext();
                                                        o.LJIIIIZZ(context2, "context");
                                                        canvas.drawBitmap(bitmap, LIZIZ, f14 - C74275TDb.LIZIZ(context2, 1.3f), (Paint) null);
                                                        return;
                                                    }
                                                    o.LJIJI("mFillPaint");
                                                    throw null;
                                                }
                                                o.LJIJI("mFillPaint");
                                                throw null;
                                            }
                                            o.LJIJI("mPath");
                                            throw null;
                                        }
                                        o.LJIJI("mCanvas");
                                        throw null;
                                    }
                                    o.LJIJI("mRoundRect");
                                    throw null;
                                }
                                o.LJIJI("mPath");
                                throw null;
                            }
                            o.LJIJI("mPath");
                            throw null;
                        }
                        o.LJIJI("mFillPaint");
                        throw null;
                    }
                    o.LJIJI("mFillPaint");
                    throw null;
                }
                o.LJIJI("mFillPaint");
                throw null;
            }
            o.LJIJI("mRoundRect");
            throw null;
        }
        o.LJIJI("mRoundRect");
        throw null;
    }

    public final void setBubbleOrientation(int i) {
        this.LJZI = i;
    }

    public final void setMBgColor(int i) {
        this.LJLLL = i;
    }

    public final void setMBorderBubbleArrowPath(Path path) {
        o.LJIIIZ(path, "<set-?>");
        this.LJLJLJ = path;
    }

    public final void setMBorderColor(int i) {
        this.LJLLLL = i;
    }

    public final void setMBorderMatrix(Matrix matrix) {
        o.LJIIIZ(matrix, "<set-?>");
        this.LJLLI = matrix;
    }

    public final void setMBorderRoundRect(RectF rectF) {
        o.LJIIIZ(rectF, "<set-?>");
        this.LJLJLLL = rectF;
    }

    public final void setMBorderWidth(int i) {
        this.LJLL = i;
    }

    public final void setMBubbleArrowPath(Path path) {
        o.LJIIIZ(path, "<set-?>");
        this.LJLJJI = path;
    }

    public final void setMFillPaint(Paint paint) {
        o.LJIIIZ(paint, "<set-?>");
        this.LJLILLLLZI = paint;
    }

    public final void setMHeight(float f) {
        this.LJLJL = f;
    }

    public final void setMNeedAddColor(boolean z) {
        this.LLF = z;
    }

    public final void setMNeedArrow(boolean z) {
        this.LLD = z;
    }

    public final void setMNeedPath(boolean z) {
        this.LJZL = z;
    }

    public final void setMNeedPressFade(boolean z) {
        this.LL = z;
    }

    public final void setMNeedShadow(boolean z) {
        this.LJLZ = z;
    }

    public final void setMPadding(float f) {
        this.LJLIL = f;
    }

    public final void setMPath(Path path) {
        o.LJIIIZ(path, "<set-?>");
        this.LJLJI = path;
    }

    public final void setMShadowColor(int i) {
        this.LJLLLLLL = i;
    }

    public final void setMWidth(float f) {
        this.LJLJJLL = f;
    }

    public final void setNeedAddColor(boolean z) {
        this.LLF = z;
    }

    public final void setUseDefaultView(boolean z) {
        this.LLFF = z;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        TextView textView;
        char c;
        int measuredWidth;
        int measuredHeight;
        super.onMeasure(i, i2);
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        LLFII = (int) C74275TDb.LIZIZ(context, this.LJLIL + 5.0f);
        if (getChildAt(0) instanceof TextView) {
            View childAt = getChildAt(0);
            if (childAt != null) {
                textView = (TextView) childAt;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
        } else {
            textView = null;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int measuredWidth2 = getMeasuredWidth();
        if (textView != null) {
            float measureText = (int) textView.getPaint().measureText(textView.getText().toString());
            Context context2 = getContext();
            o.LJIIIIZZ(context2, "context");
            if (measureText > C74275TDb.LIZIZ(context2, 197.0f)) {
                Context context3 = getContext();
                o.LJIIIIZZ(context3, "context");
                C74275TDb.LIZIZ(context3, 197.0f);
                c = 2;
            } else {
                textView.getPaint().measureText(textView.getText().toString());
                c = 1;
            }
            textView.getPaddingLeft();
            textView.getPaddingRight();
        } else {
            c = 0;
        }
        if (this.LLFF) {
            measuredWidth = LLII;
            if (measuredWidth2 > measuredWidth) {
                measuredWidth = (LLFII * 2) + measuredWidth2;
            }
            int i3 = this.LJZI;
            if (i3 == 2 || i3 == 1) {
                measuredWidth += LLFFF;
            }
            if (c == 1) {
                measuredHeight = LLIIII;
            } else {
                measuredHeight = LLIIII + 19;
            }
        } else {
            PopupWindow popupWindow = new PopupWindow(getChildAt(0), -2, -2, true);
            popupWindow.getContentView().measure(0, 0);
            View contentView = popupWindow.getContentView();
            o.LJIIIIZZ(contentView, "pop.contentView");
            measuredWidth = LLFII + (LLFFF * 3) + contentView.getMeasuredWidth();
            View contentView2 = popupWindow.getContentView();
            o.LJIIIIZZ(contentView2, "pop.contentView");
            measuredHeight = LLFII + (LLFFF * 3) + contentView2.getMeasuredHeight();
        }
        int i4 = this.LJLL;
        int i5 = (i4 * 3) + measuredWidth;
        int i6 = (i4 * 3) + measuredHeight;
        if (mode == Integer.MIN_VALUE) {
            if (mode2 == Integer.MIN_VALUE) {
                setMeasuredDimension(i5, i6);
            }
            setMeasuredDimension(i5, size2);
        } else {
            if (mode != Integer.MIN_VALUE) {
                if (mode2 == Integer.MIN_VALUE) {
                    setMeasuredDimension(size, i6);
                }
            }
            setMeasuredDimension(i5, size2);
        }
        this.LJLJJLL = getMeasuredWidth() - (LLFFF * 2);
        this.LJLJL = getMeasuredHeight() - (LLFFF * 2);
    }
}
