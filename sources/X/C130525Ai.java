package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.ugc.android.editor.core.EditorProContext;
import com.ss.ugc.android.editor.track.TrackState;
import com.ss.ugc.android.editor.track.viewmodels.TTrackPanelViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5Ai, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C130525Ai extends AbstractC130625As implements InterfaceC70422pa {
    public static final int LLILL = ColorProtector.parseColor("#5E76EE");
    public static final int LLILLIZIL = ColorProtector.parseColor("#5E76EE");
    public static final int LLILLJJLI = ColorProtector.parseColor("#514EFB");
    public static final int LLILLL = ColorProtector.parseColor("#E5674E");
    public String LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public float LJLL;
    public RectF LJLLI;
    public float LJLLILLLL;
    public int LJLLJ;
    public int LJLLL;
    public String LJLLLL;
    public C5BJ LJLLLLLL;
    public final RectF LJLZ;
    public final Paint LJZ;
    public final TextPaint LJZI;
    public long LJZL;
    public long LL;
    public long LLD;
    public long LLF;
    public boolean LLFF;
    public final Path LLFFF;
    public final float LLFII;
    public final Rect LLFZ;
    public final Path LLI;
    public Bitmap LLIFFJFJJ;
    public final XIA LLII;
    public boolean LLIIII;
    public final Paint LLIIIILZ;
    public final C62822Ol8 LLIIIJ;
    public boolean LLIIIL;
    public boolean LLIIIZ;
    public Bitmap LLIIJI;
    public final List<OSZ<Long, Float>> LLIIJLIL;
    public final C62822Ol8 LLIIL;
    public final C62822Ol8 LLIILII;
    public final C62822Ol8 LLIILZL;
    public String LLIIZ;
    public C5AI LLIL;
    public final C62822Ol8 LLILII;
    public final C62822Ol8 LLILIL;

    private final EditorProContext getEditorContext() {
        return (EditorProContext) this.LLILIL.getValue();
    }

    private final float getLineHeight() {
        return C134845Qy.LIZ(7.0f);
    }

    private final TTrackPanelViewModel getTrackViewModel() {
        return (TTrackPanelViewModel) this.LLILII.getValue();
    }

    public final boolean LJIIJ() {
        return ((Boolean) this.LLIIL.getValue()).booleanValue();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        if (this.LLIFFJFJJ != null) {
            this.LLIFFJFJJ = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // X.C5BC
    public final boolean LIZLLL() {
        return this.LJLJLLL;
    }

    @Override // X.AbstractC130625As, X.C5BC
    public int getBgColor() {
        return this.LJLLJ;
    }

    @Override // X.AbstractC130625As
    public int getBgRadius() {
        return this.LJLLL;
    }

    @Override // X.AbstractC130625As
    public float getClipLength() {
        return this.LJLL;
    }

    @Override // X.AbstractC130625As, X.C5BC
    public RectF getClipRectF() {
        return this.LJLLI;
    }

    public final String getContentText() {
        return this.LLIIZ;
    }

    @Override // X.InterfaceC70422pa
    public MBA getCoroutineContext() {
        return this.LLII;
    }

    @Override // X.AbstractC130625As, X.C5BC
    public boolean getDrawDivider() {
        return this.LJLJLJ;
    }

    public final boolean getHasLine$editor_trackpanel_release() {
        return this.LLIIIL;
    }

    public final C5AI getLabelPainter$editor_trackpanel_release() {
        return this.LLIL;
    }

    public final boolean getShouldDrawTextFlag$editor_trackpanel_release() {
        return this.LLIIIZ;
    }

    public final String getText() {
        return this.LLIIZ;
    }

    @Override // X.AbstractC130625As
    public float getTimelineScale() {
        return this.LJLLILLLL;
    }

    public final String getTtsAudioPath() {
        return this.LJLLLL;
    }

    public final C5BJ getTtsWavePainter() {
        return this.LJLLLLLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C130525Ai(C29S activity) {
        super(activity, null, 0);
        o.LJIIIZ(activity, "activity");
        new LinkedHashMap();
        this.LJLJLJ = true;
        this.LJLLI = new RectF();
        this.LJLLILLLL = C1300758p.LIZIZ();
        this.LJLLJ = ColorProtector.parseColor("#51c7b1");
        this.LJLLLL = "";
        this.LJLLLLLL = new C130715Bb();
        this.LJLZ = new RectF();
        this.LJZ = C6D8.LIZIZ(true);
        TextPaint textPaint = new TextPaint();
        textPaint.setColor(-1);
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(C130905Bu.LIZ);
        textPaint.setStrokeWidth(C134845Qy.LIZ(1.0f));
        textPaint.setStyle(Paint.Style.FILL);
        this.LJZI = textPaint;
        this.LLFFF = new Path();
        this.LLFII = C134845Qy.LIZ(2.0f);
        this.LLFZ = new Rect();
        this.LLI = new Path();
        this.LLII = C78613UtF.LIZJ;
        this.LLIIIILZ = new Paint();
        this.LLIIIJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 984));
        this.LLIIJLIL = new ArrayList();
        this.LLIIL = C221108m2.LIZIZ(C127564zY.LJLIL);
        this.LLIILII = C221108m2.LIZIZ(C127534zV.LJLIL);
        this.LLIILZL = C221108m2.LIZIZ(C127524zU.LJLIL);
        this.LLIIZ = "";
        this.LLIL = new C5AI(this) { // from class: X.5B2
            public final TextPaint LIZ;
            public final float LIZIZ;

            {
                o.LJIIIZ(this, "view");
                TextPaint textPaint2 = new TextPaint();
                textPaint2.setColor(-1);
                textPaint2.setAntiAlias(true);
                textPaint2.setTextSize(C134845Qy.LIZ(10.0f));
                textPaint2.setStrokeWidth(C134845Qy.LIZ(1.0f));
                textPaint2.setStyle(Paint.Style.FILL);
                this.LIZ = textPaint2;
                this.LIZIZ = C134845Qy.LIZ(4.0f);
            }

            @Override // X.C5AI
            public final void LIZ(C5BC trackItemView, NLETrackSlot nLETrackSlot, RectF drawRect, Canvas canvas, int i, long j) {
                C130525Ai c130525Ai;
                int LIZ;
                o.LJIIIZ(trackItemView, "trackItemView");
                o.LJIIIZ(drawRect, "drawRect");
                o.LJIIIZ(canvas, "canvas");
                if ((trackItemView instanceof C130525Ai) && (c130525Ai = (C130525Ai) trackItemView) != null) {
                    float f = this.LIZIZ;
                    if (!(!((ArrayList) c130525Ai.LLIIJLIL).isEmpty())) {
                        LIZ = 0;
                    } else {
                        LIZ = C134845Qy.LIZ(19.0f);
                    }
                    canvas.drawText(c130525Ai.getContentText(), f + LIZ, ((this.LIZ.getTextSize() + c130525Ai.getMeasuredHeight()) / 2.0f) - C134845Qy.LIZ(2.0f), this.LIZ);
                }
            }
        };
        this.LLILII = C221108m2.LIZIZ(C130865Bq.LJLIL);
        this.LLILIL = C221108m2.LIZIZ(C123644tE.LJLIL);
    }

    @Override // X.AbstractC130625As, X.C5BC
    public final void LIZJ(Canvas canvas) {
        int bgColor;
        int LIZ;
        String str;
        float clipLength;
        float clipStart;
        int i;
        float f;
        float width;
        View view;
        int i2;
        View view2;
        o.LJIIIZ(canvas, "canvas");
        canvas.getClipBounds(this.LLFZ);
        Paint paint = this.LJZ;
        Integer num = C1291054w.LJ().LJIILJJIL;
        if (num != null) {
            bgColor = num.intValue();
        } else {
            bgColor = getBgColor();
        }
        paint.setColor(bgColor);
        canvas.drawRoundRect(new RectF(this.LLFZ), getBgRadius(), getBgRadius(), this.LJZ);
        if (!this.LJLJLLL) {
            Rect rect = this.LLFZ;
            int i3 = rect.left;
            int i4 = rect.right - C130675Ax.LJLJL;
            Rect rect2 = this.LLFZ;
            RectF rectF = new RectF(i3 + r1, rect2.top, i4, rect2.bottom);
            this.LLI.reset();
            this.LLI.addRoundRect(rectF, getBgRadius(), getBgRadius(), Path.Direction.CCW);
            canvas.clipPath(this.LLI);
        }
        this.LJZ.setColor(getBgColor());
        if (getBgRadius() > 0) {
            canvas.drawRoundRect(new RectF(this.LLFZ), getBgRadius(), getBgRadius(), this.LJZ);
        } else {
            canvas.drawRect(this.LLFZ, this.LJZ);
        }
        NLETrackSlot nleTrackSlot$editor_trackpanel_release = getNleTrackSlot$editor_trackpanel_release();
        if (nleTrackSlot$editor_trackpanel_release != null) {
            String imagePath = nleTrackSlot$editor_trackpanel_release.getExtra("previewIconPath");
            o.LJIIIIZZ(imagePath, "imagePath");
            if (imagePath.length() == 0 && (str = this.LJLJL) != null) {
                imagePath = str;
            }
            if (!TextUtils.isEmpty(imagePath)) {
                Bitmap bitmap = this.LLIFFJFJJ;
                if (bitmap == null || bitmap.isRecycled()) {
                    if (!this.LLIIII && this.LLIFFJFJJ == null) {
                        this.LLIIII = true;
                        XKX.LIZLLL(this, null, null, new C67222kQ(this, imagePath, null), 3);
                    }
                } else {
                    int save = canvas.save();
                    if (this.LLF > 0 || this.LL > 0 || this.LLD > 0) {
                        LIZ = C134845Qy.LIZ(3.0f);
                    } else {
                        LIZ = 0;
                    }
                    Bitmap bitmap2 = this.LLIFFJFJJ;
                    o.LJI(bitmap2);
                    float f2 = C130905Bu.LIZIZ;
                    canvas.drawBitmap(bitmap2, f2, LIZ + f2, this.LJZ);
                    canvas.restoreToCount(save);
                }
            }
        }
        this.LLIIIL = false;
        if (!this.LJLJJI) {
            if (getMeasuredWidth() > V2B.LJIIIZ(this) + V2B.LJIIJ(this)) {
                if (this.LLFF) {
                    if (this.LLF > 0) {
                        this.LLIIIL = true;
                        float f3 = 2;
                        float LJIIJ = (this.LLFII * f3) + V2B.LJIIJ(this);
                        float lineHeight = getLineHeight();
                        Paint.Style style = this.LJZI.getStyle();
                        if (getMeasuredWidth() > f3 * LJIIJ) {
                            canvas.drawLine(LJIIJ, lineHeight, getMeasuredWidth() - LJIIJ, lineHeight, this.LJZI);
                        }
                        this.LJZI.setStyle(Paint.Style.STROKE);
                        float LJIIJ2 = V2B.LJIIJ(this);
                        float f4 = this.LLFII;
                        canvas.drawCircle(LJIIJ2 + f4, lineHeight, f4, this.LJZI);
                        float LJIIJ3 = V2B.LJIIJ(this);
                        float f5 = this.LLFII;
                        float f6 = 1;
                        canvas.drawCircle(LJIIJ3 + f5, lineHeight, f5 + f6, this.LJZI);
                        float measuredWidth = getMeasuredWidth() - V2B.LJIIIZ(this);
                        float f7 = this.LLFII;
                        canvas.drawCircle(measuredWidth - f7, lineHeight, f7, this.LJZI);
                        float measuredWidth2 = getMeasuredWidth() - V2B.LJIIIZ(this);
                        float f8 = this.LLFII;
                        canvas.drawCircle(measuredWidth2 - f8, lineHeight, f8 + f6, this.LJZI);
                        this.LJZI.setStyle(style);
                    }
                } else {
                    long j = this.LL;
                    if (j > 0) {
                        this.LLIIIL = true;
                        LJIIIZ(canvas, ((float) j) / ((float) this.LJZL), true);
                    }
                    long j2 = this.LLD;
                    if (j2 > 0) {
                        this.LLIIIL = true;
                        LJIIIZ(canvas, ((float) j2) / ((float) this.LJZL), false);
                    }
                }
            }
        }
        if (this.LLIIIZ) {
            if (this.LLIIJI == null) {
                this.LLIIJI = BitmapFactory.decodeResource(getContext().getResources(), R.drawable.c70);
            }
            Bitmap bitmap3 = this.LLIIJI;
            if (bitmap3 != null) {
                canvas.drawBitmap(bitmap3, C134845Qy.LIZ(4.0f), C134845Qy.LIZ(4.0f), this.LJZ);
            }
        }
        if (!((ArrayList) this.LLIIJLIL).isEmpty()) {
            if (getClipStart() == 0.0f && getClipLength() == 0.0f) {
                clipLength = getMeasuredWidth();
                clipStart = 0.0f;
            } else {
                clipLength = getClipLength() - getClipStart();
                clipStart = getClipStart();
            }
            this.LJLLLLLL.LIZ((getTimelineScale() * 0) + clipStart, 0.0f, 1.0f);
            Object parent = getParent();
            if ((parent instanceof C1303859u) && (view = (View) parent) != null) {
                i = view.getScrollX();
            } else {
                i = 0;
            }
            float f9 = i;
            float f10 = (C1303859u.LLJJI + f9) - clipStart;
            float translationX = getTranslationX() + getLeft() + clipStart;
            if (f9 > translationX) {
                f = f9 - translationX;
            } else {
                f = 0.0f;
            }
            if (f10 < clipLength) {
                clipLength = f10;
            }
            if (((Boolean) this.LLIIIJ.getValue()).booleanValue()) {
                if (getClipLength() == 0.0f) {
                    width = this.LLFZ.right;
                } else {
                    width = getClipRectF().width();
                }
                this.LJLZ.set(this.LLFZ.left, 0.0f, width, getMeasuredHeight());
            } else {
                this.LJLZ.set(f, 0.0f, clipLength, getMeasuredHeight());
            }
            this.LJLLLLLL.LIZIZ(canvas, this.LJLZ, this.LLIIJLIL, getTimelineScale(), this.LLFZ, C5BH.TEXT_TO_SPEECH, getClipRectF().width());
            if (LJIIJ()) {
                int LIZIZ = C04330Ez.LIZIZ(getContext(), R.color.kh);
                int LIZIZ2 = C04330Ez.LIZIZ(getContext(), R.color.kg);
                Rect rect3 = this.LLFZ;
                this.LLIIIILZ.setShader(new LinearGradient(rect3.left, 0.0f, rect3.right, 0.0f, LIZIZ, LIZIZ2, Shader.TileMode.CLAMP));
                if (getBgRadius() > 0) {
                    canvas.drawRoundRect(new RectF(this.LLFZ), getBgRadius(), getBgRadius(), this.LLIIIILZ);
                } else {
                    canvas.drawRect(this.LLFZ, this.LLIIIILZ);
                }
            }
        }
        NLETrackSlot nleTrackSlot$editor_trackpanel_release2 = getNleTrackSlot$editor_trackpanel_release();
        if (nleTrackSlot$editor_trackpanel_release2 != null) {
            Object parent2 = getParent();
            if ((parent2 instanceof C1303859u) && (view2 = (View) parent2) != null) {
                i2 = view2.getScrollX();
            } else {
                i2 = 0;
            }
            C5AI c5ai = this.LLIL;
            Rect rect4 = this.LLFZ;
            o.LJIIIZ(rect4, "<this>");
            C5AG.LIZ(c5ai, this, nleTrackSlot$editor_trackpanel_release2, new RectF(rect4), canvas, i2);
        }
        super.LIZJ(canvas);
    }

    @Override // X.AbstractC130625As, android.view.View
    public final void onDraw(Canvas canvas) {
        int LIZ;
        if (canvas != null && !this.LJLJLLL) {
            if (((Boolean) this.LLIILII.getValue()).booleanValue()) {
                if (LJIIJ()) {
                    if (getTrackViewModel().jv0() == TrackState.NORMAL) {
                        LIZ = C134845Qy.LIZ(4.0f);
                    } else {
                        LIZ = C134845Qy.LIZ(5.0f);
                    }
                } else {
                    LIZ = C134845Qy.LIZ(6.0f);
                }
            } else if (LJIIJ()) {
                C5A5.LJJJJZ.getClass();
                LIZ = (int) C5BD.LIZJ;
            } else {
                LIZ = C134845Qy.LIZ(1.0f);
            }
            setBgRadius(LIZ);
            LIZJ(canvas);
        }
    }

    @Override // X.AbstractC130625As, X.C5BC
    public void setBgColor(int i) {
        this.LJLLJ = i;
    }

    @Override // X.AbstractC130625As, X.C5BC
    public void setBgRadius(int i) {
        this.LJLLL = i;
    }

    @Override // X.AbstractC130625As, X.C5BC
    public void setClipLength(float f) {
        this.LJLL = f;
    }

    @Override // X.AbstractC130625As, X.C5BC
    public void setClipRectF(RectF rectF) {
        o.LJIIIZ(rectF, "<set-?>");
        this.LJLLI = rectF;
    }

    @Override // X.AbstractC130625As, X.C5BC
    public void setDrawDivider(boolean z) {
        if (this.LJLJLJ != z) {
            this.LJLJLJ = z;
            invalidate();
        }
    }

    public final void setHasLine$editor_trackpanel_release(boolean z) {
        this.LLIIIL = z;
    }

    @Override // X.AbstractC130625As, X.C5BC
    public void setItemSelected(boolean z) {
        this.LJLJLLL = z;
    }

    public final void setLabelPainter$editor_trackpanel_release(C5AI c5ai) {
        o.LJIIIZ(c5ai, "<set-?>");
        this.LLIL = c5ai;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0134, code lost:
    
        if ((X.C124574uj.LJJIII(X.C79057V0z.LJJI(getEditorContext())) - X.C79057V0z.LJJI(getEditorContext()).getTrackBySlot(r12).LJIILL().size()) > 0) goto L51;
     */
    @Override // X.AbstractC130625As, X.C5BC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setSegment(com.bytedance.ies.nle.editor_jni.NLETrackSlot r12) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C130525Ai.setSegment(com.bytedance.ies.nle.editor_jni.NLETrackSlot):void");
    }

    public final void setShouldDrawTextFlag$editor_trackpanel_release(boolean z) {
        if (z != this.LLIIIZ) {
            this.LLIIIZ = z;
            invalidate();
        }
    }

    public final void setText(String value) {
        o.LJIIIZ(value, "value");
        if (!o.LJ(value, this.LLIIZ)) {
            this.LLIIZ = value;
            invalidate();
        }
    }

    @Override // X.AbstractC130625As, X.C5BC
    public void setTimelineScale(float f) {
        this.LJLLILLLL = f;
    }

    public final void setTtsAudioPath(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLLLL = str;
    }

    public final void setTtsWavePainter(C5BJ c5bj) {
        o.LJIIIZ(c5bj, "<set-?>");
        this.LJLLLLLL = c5bj;
    }

    public final void LJIIIZ(Canvas canvas, float f, boolean z) {
        float measuredWidth;
        float f2;
        int LIZ = C134845Qy.LIZ(4.0f);
        float max = Math.max(f * (getMeasuredWidth() - (V2B.LJIIIZ(this) + V2B.LJIIJ(this))), 0.0f);
        if (z) {
            measuredWidth = V2B.LJIIJ(this);
            f2 = max + measuredWidth;
        } else {
            measuredWidth = getMeasuredWidth() - V2B.LJIIJ(this);
            f2 = measuredWidth - max;
        }
        float lineHeight = getLineHeight();
        int color = this.LJZI.getColor();
        Paint.Style style = this.LJZI.getStyle();
        this.LJZI.getStrokeWidth();
        TextPaint textPaint = this.LJZI;
        textPaint.setStyle(Paint.Style.STROKE);
        textPaint.setStrokeJoin(Paint.Join.MITER);
        int save = canvas.save();
        int LIZ2 = C134845Qy.LIZ(3.0f);
        this.LLFFF.reset();
        this.LLFFF.moveTo(measuredWidth, lineHeight);
        this.LLFFF.lineTo(f2, lineHeight);
        if (z) {
            this.LLFFF.lineTo(f2 - LIZ, lineHeight - LIZ2);
        } else {
            this.LLFFF.lineTo(f2 + LIZ, lineHeight - LIZ2);
        }
        canvas.drawPath(this.LLFFF, textPaint);
        canvas.restoreToCount(save);
        this.LJZI.setColor(color);
        this.LJZI.setStyle(style);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LJZI.setTextSize(C134845Qy.LIZ(10.0f));
        int LIZ = C134845Qy.LIZ(8.0f);
        V2B.LJIILL(this, LIZ, 0, LIZ, 0);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(8:5|6|7|(1:(1:13)(2:10|11))(3:22|23|(2:25|(1:27))(4:28|15|16|(1:18)(2:19|20)))|14|15|16|(0)(0)))|31|6|7|(0)(0)|14|15|16|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0068, code lost:
    
        r1 = X.C141335gf.LIZ(r0);
        X.C3C5.m7constructorimpl(r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0075 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJJI(android.content.Context r8, java.lang.String r9, int r10, int r11, X.InterfaceC67352kd<? super android.graphics.Bitmap> r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof X.C67242kS
            if (r0 == 0) goto L1f
            r6 = r12
            X.2kS r6 = (X.C67242kS) r6
            int r2 = r6.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1f
            int r2 = r2 - r1
            r6.LJLJI = r2
        L12:
            java.lang.Object r1 = r6.LJLIL
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJI
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L2d
            if (r0 != r3) goto L25
            goto L5e
        L1f:
            X.2kS r6 = new X.2kS
            r6.<init>(r7, r12)
            goto L12
        L25:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2d:
            X.C141335gf.LIZJ(r1)
            X.5qj r0 = X.C1280550v.LIZ()     // Catch: java.lang.Throwable -> L67
            X.6n1 r0 = r0.LIZ()     // Catch: java.lang.Throwable -> L67
            X.5CH r2 = r0.LIZJ     // Catch: java.lang.Throwable -> L67
            if (r2 == 0) goto L5c
            X.5CV r1 = new X.5CV     // Catch: java.lang.Throwable -> L67
            r1.<init>()     // Catch: java.lang.Throwable -> L67
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L67
            r1.LIZ = r0     // Catch: java.lang.Throwable -> L67
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> L67
            r1.LIZIZ = r0     // Catch: java.lang.Throwable -> L67
            X.5CW r0 = new X.5CW     // Catch: java.lang.Throwable -> L67
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L67
            r6.LJLJI = r3     // Catch: java.lang.Throwable -> L67
            java.lang.Object r1 = r2.LIZIZ(r8, r9, r0, r6)     // Catch: java.lang.Throwable -> L67
            if (r1 != r5) goto L61
            return r5
        L5c:
            r1 = r4
            goto L63
        L5e:
            X.C141335gf.LIZJ(r1)     // Catch: java.lang.Throwable -> L67
        L61:
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1     // Catch: java.lang.Throwable -> L67
        L63:
            X.C3C5.m7constructorimpl(r1)     // Catch: java.lang.Throwable -> L67
            goto L6f
        L67:
            r0 = move-exception
            X.3C4 r1 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r1)
        L6f:
            boolean r0 = X.C3C5.m12isFailureimpl(r1)
            if (r0 == 0) goto L76
        L75:
            return r4
        L76:
            r4 = r1
            goto L75
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C130525Ai.LJIIJJI(android.content.Context, java.lang.String, int, int, X.2kd):java.lang.Object");
    }
}
