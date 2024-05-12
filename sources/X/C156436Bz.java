package X;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.6Bz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C156436Bz extends C156426By {
    public static final int LLILLJJLI;
    public static final int LLILLL;
    public static final int LLILZ;
    public static final float LLILZIL;
    public static final int LLILZLL;
    public static final float LLIZ;
    public final TuxTextView LLIIIZ;
    public int LLIIJI;
    public boolean LLIIJLIL;
    public final C39661h4 LLIIL;
    public AnonymousClass672 LLIILII;
    public boolean LLIILZL;
    public VideoPublishEditModel LLIIZ;
    public float LLIL;
    public float LLILII;
    public float LLILIL;
    public float LLILL;
    public final ViewGroup LLILLIZIL;

    @Override // X.C156426By
    public final boolean LIZIZ() {
        return true;
    }

    @Override // X.C156426By
    public final boolean LIZJ() {
        return true;
    }

    @Override // X.C156426By
    public final C6DA LIZLLL() {
        boolean z;
        C6BP c6bp = new C6BP(this);
        if (this.LLIILZL || !C6AI.LIZ()) {
            z = true;
        } else {
            z = false;
        }
        return new C89461Z9d(this, c6bp, z);
    }

    @Override // X.C156426By
    public final boolean LJII() {
        if (this.LLIIIZ.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // X.C156426By
    public final void LJIIL() {
        if (Math.abs(this.LLILIL - this.LLIL) < ViewConfiguration.get(getContext()).getScaledTouchSlop() && Math.abs(this.LLILL - this.LLILII) < ViewConfiguration.get(getContext()).getScaledTouchSlop()) {
            LJFF(false);
            LJIJ();
        }
    }

    @Override // X.C156426By
    public final void LJIIZILJ() {
        VideoPublishEditModel videoPublishEditModel = this.LLIIZ;
        if (videoPublishEditModel != null) {
            boolean z = true;
            if ((C44384HbQ.LJLJJI(videoPublishEditModel) || videoPublishEditModel.hasRecord()) && (videoPublishEditModel.hasRecord() || videoPublishEditModel.voiceVolume != 0.0f)) {
                z = false;
            }
            if (z != this.LLIILZL) {
                this.LLIILZL = z;
                this.LLIIIILZ = LIZLLL();
            }
            FMX.LJIIL("click_subtitle_menu", H8F.LJIILJJIL(0, videoPublishEditModel, "").LIZ);
        }
        super.LJIIZILJ();
    }

    @Override // X.C156426By
    public PointF[] getFourAnglePoint() {
        float measuredWidth = this.LJLJL.getMeasuredWidth();
        float measuredHeight = this.LJLJL.getMeasuredHeight();
        float x = this.LJLJL.getX();
        float y = this.LJLJL.getY();
        float f = measuredWidth + x;
        float f2 = y + measuredHeight;
        return new PointF[]{new PointF(x, y), new PointF(f, y), new PointF(x, f2), new PointF(f, f2)};
    }

    static {
        float LIZJ = KL2.LIZJ(C5L7.LIZ(), 44.0f);
        LLILLJJLI = (int) KL2.LIZJ(C5L7.LIZ(), 200.0f);
        LLILLL = (int) (LIZJ + C63081OpJ.LJJJJLI(C5L7.LIZ()));
        LLILZ = (int) KL2.LIZJ(C5L7.LIZ(), 16.0f);
        float LIZJ2 = KL2.LIZJ(C5L7.LIZ(), 56.0f);
        LLILZIL = LIZJ2;
        LLILZLL = (int) Math.min(KL2.LIZJ(C5L7.LIZ(), 320.0f), (C60996Nwm.LJII() - r3) - LIZJ2);
        LLIZ = KL2.LIZJ(C5L7.LIZ(), 76.0f);
    }

    public final VideoPublishEditModel getPublishEditModel() {
        return this.LLIIZ;
    }

    @Override // X.C156426By, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C156436Bz(Context context) {
        super(context, null);
        a1.LJFF(context, "context");
        int LJ = C60996Nwm.LJ(context);
        int i = LLILLL;
        int i2 = LLILLJJLI;
        this.LLIIJI = (LJ - i) - i2;
        this.LLIIJLIL = true;
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.bn0, C16880lQ.LLZIL(context), this);
        o.LJII(LLLZIIL, "null cannot be cast to non-null type android.view.ViewGroup");
        this.LLILLIZIL = (ViewGroup) LLLZIIL;
        View findViewById = LLLZIIL.findViewById(R.id.m1n);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.tv_caption)");
        TuxTextView tuxTextView = (TuxTextView) findViewById;
        this.LLIIIZ = tuxTextView;
        C6C1 c6c1 = (C6C1) LLLZIIL.findViewById(R.id.khw);
        this.LJLJJLL = c6c1;
        c6c1.setHelpBoxColor(0);
        this.LJLJL = tuxTextView;
        C39661h4 c39661h4 = new C39661h4(tuxTextView, C17T.LJIILIIL, 0.0f);
        c39661h4.LJIL.LIZIZ(300.0f);
        c39661h4.LJIL.LIZ(0.86f);
        this.LLIIL = c39661h4;
        c39661h4.LIZIZ(new C00O() { // from class: X.6C9
            @Override // X.C00O
            public final void LIZ() {
                C156436Bz.this.LJIJJLI();
            }
        });
        ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.topMargin = i;
        layoutParams2.bottomMargin = i2;
        layoutParams2.gravity = 8388611;
        if (C53379KxD.LIZ()) {
            tuxTextView.setTuxFont(42);
            tuxTextView.setPaddingRelative((int) KL2.LIZJ(context, 6.0f), (int) KL2.LIZJ(context, 4.0f), (int) KL2.LIZJ(context, 4.0f), (int) KL2.LIZJ(context, 4.0f));
            tuxTextView.setBackgroundResource(R.drawable.a9z);
        } else {
            tuxTextView.setTuxFont(32);
            tuxTextView.setPaddingRelative((int) KL2.LIZJ(context, 8.0f), (int) KL2.LIZJ(context, 8.0f), (int) KL2.LIZJ(context, 8.0f), (int) KL2.LIZJ(context, 8.0f));
            tuxTextView.setBackgroundResource(R.drawable.a3n);
        }
    }

    private final void setCaptionAlignMode(boolean z) {
        EnumC1551166x enumC1551166x;
        if (z) {
            ViewGroup.LayoutParams layoutParams = this.LLIIIZ.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = 80;
            this.LLIIIZ.setLayoutParams(layoutParams2);
        } else {
            ViewGroup.LayoutParams layoutParams3 = this.LLIIIZ.getLayoutParams();
            o.LJII(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
            layoutParams4.gravity = 48;
            this.LLIIIZ.setLayoutParams(layoutParams4);
        }
        this.LLIIJLIL = z;
        AnonymousClass672 anonymousClass672 = this.LLIILII;
        if (anonymousClass672 != null) {
            if (z) {
                enumC1551166x = EnumC1551166x.LEFT_BOTTOM;
            } else {
                enumC1551166x = EnumC1551166x.LEFT_TOP;
            }
            anonymousClass672.LIZ(enumC1551166x.getValue());
        }
        invalidate();
    }

    @Override // X.C156426By
    public final boolean LJIIJ(MotionEvent motionEvent) {
        float f;
        float f2 = 0.0f;
        if (motionEvent != null) {
            f = motionEvent.getX();
        } else {
            f = 0.0f;
        }
        this.LLIL = f;
        if (motionEvent != null) {
            f2 = motionEvent.getY();
        }
        this.LLILII = f2;
        LJIJJLI();
        this.LJLJJLL.LIZIZ();
        return super.LJIIJ(motionEvent);
    }

    @Override // X.C156426By
    public final boolean LJIIJJI(MotionEvent motionEvent) {
        float f;
        float f2;
        if (motionEvent != null) {
            f = motionEvent.getX();
        } else {
            f = 0.0f;
        }
        this.LLILIL = f;
        if (motionEvent != null) {
            f2 = motionEvent.getY();
        } else {
            f2 = 0.0f;
        }
        this.LLILL = f2;
        LJIJJLI();
        this.LJLJJLL.LIZIZ();
        boolean LJIIJJI = super.LJIIJJI(motionEvent);
        if (this.LJLJL.getTranslationY() != 0.0f) {
            this.LLIIL.LJIIIZ();
        }
        return LJIIJJI;
    }

    public final void setCaption(String str) {
        if (str == null || str.length() == 0) {
            this.LLIIIZ.setVisibility(4);
        } else {
            this.LLIIIZ.setVisibility(0);
            this.LLIIIZ.setText(str);
        }
    }

    public final void setCaptionLocation(int i) {
        this.LLIIIZ.setTranslationY(0.0f);
        if (i == EnumC1551166x.LEFT_BOTTOM.getValue()) {
            setCaptionAlignMode(true);
        } else {
            setCaptionAlignMode(false);
        }
    }

    public final void setOnCaptionStickerListener(AnonymousClass672 anonymousClass672) {
        this.LLIILII = anonymousClass672;
    }

    public final void setPublishEditModel(VideoPublishEditModel videoPublishEditModel) {
        this.LLIIZ = videoPublishEditModel;
    }

    @Override // X.C156426By
    public final void LJIILLIIL(int i, int i2) {
        this.LJLJJI = i;
        this.LJLJJL = i2;
        ViewGroup.LayoutParams layoutParams = this.LLIIIZ.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        int i3 = LLILZ;
        if (i < 0) {
            i3 -= i;
        }
        int i4 = (int) (LLILZIL - i);
        if (C173636rf.LIZIZ(getContext())) {
            layoutParams2.rightMargin = i3;
            layoutParams2.leftMargin = i4;
        } else {
            layoutParams2.leftMargin = i3;
            layoutParams2.rightMargin = i4;
        }
        int i5 = LLILLL;
        if (i2 < 0) {
            i5 -= i2;
        }
        layoutParams2.topMargin = i5;
        Object parent = getParent();
        o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        int i6 = ((View) parent).getLayoutParams().height;
        int tbMargin = C6B2.getTbMargin() + (i6 - C6B2.LJIIL(getContext()));
        layoutParams2.bottomMargin = tbMargin;
        this.LLIIJI = (i6 - layoutParams2.topMargin) - tbMargin;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    @Override // X.C156426By
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIL(float r7, float r8, java.lang.Boolean r9) {
        /*
            r6 = this;
            boolean r3 = r9.booleanValue()
            X.6BR r1 = r6.LJLL
            r4 = 0
            r2 = 1
            if (r1 == 0) goto L9e
            r0 = -1
            if (r3 == 0) goto L9e
            X.6BM r1 = (X.C6BM) r1
            int r3 = r1.LIZLLL(r4, r4, r2, r2)
            if (r0 == r3) goto L9e
            X.6BR r0 = r6.LJLL
            X.6BM r0 = (X.C6BM) r0
            android.graphics.PointF r1 = r0.LIZIZ(r7, r8, r2)
            r0 = 3
            if (r0 != r3) goto L9e
            if (r1 == 0) goto L9e
            float r5 = r1.y
        L24:
            android.view.View r0 = r6.LJLJL
            float r3 = r0.getTranslationY()
            float r3 = r3 + r5
            X.6BR r1 = r6.LJLL
            if (r1 == 0) goto L3c
            boolean r0 = r6.LLD
            if (r0 == 0) goto L3c
            X.6BM r1 = (X.C6BM) r1
            boolean r0 = r1.LIZ(r7, r8)
            if (r0 != 0) goto L3c
        L3b:
            return
        L3c:
            android.view.View r0 = r6.LJLJL
            r0.setTranslationY(r3)
            X.6C1 r1 = r6.LJLJJLL
            r0 = 0
            r1.LIZ(r0, r5)
            boolean r0 = r6.LLIIJLIL
            if (r0 == 0) goto L73
            android.view.View r0 = r6.LJLJL
            float r1 = r0.getTranslationY()
            int r0 = r6.LLIIJI
            int r0 = -r0
            int r0 = r0 / 2
            float r0 = (float) r0
            float r3 = X.C156436Bz.LLIZ
            float r0 = r0 + r3
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L73
            r6.setCaptionAlignMode(r4)
            android.view.View r2 = r6.LJLJL
            int r0 = r6.LLIIJI
            float r1 = (float) r0
            float r0 = r2.getTranslationY()
            float r0 = r0 + r1
            float r0 = r0 - r3
            r2.setTranslationY(r0)
            r6.LJIJJLI()
            goto L3b
        L73:
            boolean r0 = r6.LLIIJLIL
            if (r0 != 0) goto L3b
            android.view.View r0 = r6.LJLJL
            float r1 = r0.getTranslationY()
            int r0 = r6.LLIIJI
            int r0 = r0 / 2
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L3b
            r6.setCaptionAlignMode(r2)
            android.view.View r2 = r6.LJLJL
            int r0 = r6.LLIIJI
            int r0 = -r0
            float r1 = (float) r0
            float r0 = X.C156436Bz.LLIZ
            float r1 = r1 + r0
            float r0 = r2.getTranslationY()
            float r0 = r0 + r1
            r2.setTranslationY(r0)
            r6.LJIJJLI()
            goto L3b
        L9e:
            r5 = r8
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C156436Bz.LJIL(float, float, java.lang.Boolean):void");
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }
}
