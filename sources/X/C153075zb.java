package X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.zhiliaoapp.musically.R;

/* renamed from: X.5zb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C153075zb implements Cloneable, InterfaceC1549166d<C153085zc> {
    public static final float LJLLL = KL2.LIZJ(C60903NvH.LJ, 44.0f);
    public static final int LJLLLL = (int) KL2.LIZJ(C60903NvH.LJ, 12.0f);
    public float LJLIL = 0.15f;
    public float LJLILLLLZI = 3.0f;
    public final StickerItemModel LJLJI;
    public final C153065za LJLJJI;
    public boolean LJLJJL;
    public final Paint LJLJJLL;
    public final PointF[] LJLJL;
    public RectF LJLJLJ;
    public RectF LJLJLLL;
    public final Matrix LJLL;
    public final PointF[] LJLLI;
    public float LJLLILLLL;
    public boolean LJLLJ;

    @Override // X.InterfaceC1549166d
    public final C153085zc LJIJ() {
        StickerItemModel stickerItemModel = this.LJLJI;
        return new C153085zc(stickerItemModel.rotateAngle, stickerItemModel.scale, stickerItemModel.currentOffsetX, stickerItemModel.currentOffsetY, stickerItemModel.startTime, stickerItemModel.endTime);
    }

    @Override // X.InterfaceC1549166d
    public final int LJJJJI() {
        return this.LJLJI.uiStartTime;
    }

    public final int hashCode() {
        return this.LJLJI.hashCode();
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public final PointF[] LIZ(float f) {
        RectF rectF = this.LJLJLJ;
        if (rectF == null) {
            return null;
        }
        PointF[] pointFArr = this.LJLJL;
        PointF pointF = pointFArr[0];
        float f2 = rectF.left;
        pointF.x = f2;
        float f3 = rectF.top;
        pointF.y = f3;
        PointF pointF2 = pointFArr[1];
        float f4 = rectF.right;
        pointF2.x = f4;
        pointF2.y = f3;
        PointF pointF3 = pointFArr[2];
        pointF3.x = f4;
        float f5 = rectF.bottom;
        pointF3.y = f5;
        PointF pointF4 = pointFArr[3];
        pointF4.x = f2;
        pointF4.y = f5;
        for (PointF pointF5 : pointFArr) {
            C77119UOl.LJJIII(pointF5, this.LJLJLJ.centerX(), this.LJLJLJ.centerY(), (float) Math.toRadians(this.LJLJI.rotateAngle));
        }
        PointF[] pointFArr2 = this.LJLJL;
        pointFArr2[0].x -= f;
        pointFArr2[1].x -= f;
        pointFArr2[2].x -= f;
        pointFArr2[3].x -= f;
        return pointFArr2;
    }

    public final void LIZJ(float f) {
        RectF rectF;
        if (f == 0.0f || (rectF = this.LJLJLJ) == null) {
            return;
        }
        this.LJLL.postRotate(f, rectF.centerX(), this.LJLJLJ.centerY());
    }

    public final void LIZLLL(float f) {
        RectF rectF = this.LJLJLJ;
        if (rectF == null) {
            return;
        }
        this.LJLLILLLL *= f;
        this.LJLL.postScale(f, f, rectF.centerX(), this.LJLJLJ.centerY());
        C77119UOl.LJJIIZ(this.LJLJLJ, f);
        RectF rectF2 = this.LJLJLLL;
        if (rectF2 != null) {
            rectF2.set(this.LJLJLJ);
            RectF rectF3 = this.LJLJLLL;
            float f2 = rectF3.left;
            float f3 = LJLLLL;
            rectF3.left = f2 - f3;
            rectF3.right += f3;
            rectF3.top -= f3;
            rectF3.bottom += f3;
        }
    }

    @Override // X.InterfaceC1549166d
    public final int LJIIZILJ(int i) {
        return this.LJLJI.uiEndTime;
    }

    @Override // X.InterfaceC1549166d
    public final int LJJII(int i) {
        return this.LJLJI.startTime;
    }

    @Override // X.InterfaceC1549166d
    public final int LJJJZ(int i) {
        return this.LJLJI.endTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C153075zb)) {
            return false;
        }
        return this.LJLJI.equals(((C153075zb) obj).LJLJI);
    }

    @Override // X.InterfaceC1549166d
    public final void setAlpha(boolean z) {
        if (z) {
            this.LJLJJI.LJIILIIL(this);
            return;
        }
        C153065za c153065za = this.LJLJJI;
        if (c153065za.LJFF.LJLILLLLZI != null) {
            return;
        }
        C122034qd LJJI = C17N.LJJI(c153065za.LJ);
        C122024qc LJJJJLI = LJJI.LJIIIIZZ().LJJJJLI(this.LJLJI.uuid);
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LJII = 0.3137255f;
        LJJI.LJIIIIZZ().LJIIJ(LJJJJLI);
    }

    public C153075zb(Context context, StickerItemModel stickerItemModel, C153065za c153065za) {
        Paint paint = new Paint();
        this.LJLJJLL = paint;
        this.LJLJL = new PointF[]{new PointF(), new PointF(), new PointF(), new PointF()};
        this.LJLL = new Matrix();
        this.LJLLI = new PointF[4];
        this.LJLLILLLL = 1.0f;
        this.LJLLJ = false;
        this.LJLJI = stickerItemModel;
        this.LJLJJI = c153065za;
        paint.setColor(AnonymousClass636.LJIIIIZZ(R.attr.cl, context));
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(2.0f);
    }

    @Override // X.InterfaceC1549166d
    public final void LJJJJLI(C153085zc c153085zc, int i, int i2) {
        C153085zc c153085zc2 = c153085zc;
        C153065za c153065za = this.LJLJJI;
        c153065za.LJIJI(this, c153085zc2.LJLIL, c153085zc2.LJLILLLLZI);
        StickerItemModel stickerItemModel = this.LJLJI;
        C153085zc c153085zc3 = new C153085zc(stickerItemModel.rotateAngle, stickerItemModel.scale, stickerItemModel.currentOffsetX, stickerItemModel.currentOffsetY, stickerItemModel.startTime, stickerItemModel.endTime);
        c153065za.LJII(this, (c153085zc2.LJLJJL - c153085zc3.LJLJJL) * i, (c153085zc2.LJLJJLL - c153085zc3.LJLJJLL) * i2);
        c153065za.LJIIIIZZ(this, c153085zc2.LJLJI - c153085zc3.LJLJI);
        c153065za.LJIIIZ(this, c153085zc2.LJLJJI / c153085zc3.LJLJJI);
    }

    public final void LIZIZ(float f, float f2, int i, int i2, int i3, int i4) {
        float f3 = i;
        StickerItemModel stickerItemModel = this.LJLJI;
        float f4 = stickerItemModel.initWidth;
        float f5 = ((f * f3) - (f4 / 2.0f)) + i3;
        float f6 = stickerItemModel.initHeight;
        float f7 = ((i2 * f2) - (f6 / 2.0f)) + i4;
        this.LJLJLJ = new RectF(f5, f7, f4 + f5, f6 + f7);
        float f8 = LJLLL;
        StickerItemModel stickerItemModel2 = this.LJLJI;
        this.LJLIL = Math.max(f8 / stickerItemModel2.initWidth, f8 / stickerItemModel2.initHeight);
        if (this.LJLJI.isMagnifier()) {
            StickerItemModel stickerItemModel3 = this.LJLJI;
            this.LJLIL = Math.max(f8 / stickerItemModel3.initWidth, f8 / stickerItemModel3.initHeight);
            this.LJLILLLLZI = f3 / this.LJLJI.initWidth;
        } else {
            StickerItemModel stickerItemModel4 = this.LJLJI;
            this.LJLIL = Math.max(f8 / stickerItemModel4.initWidth, f8 / stickerItemModel4.initHeight);
        }
        RectF rectF = new RectF(this.LJLJLJ);
        this.LJLJLLL = rectF;
        float f9 = rectF.left;
        float f10 = LJLLLL;
        rectF.left = f9 - f10;
        rectF.right += f10;
        rectF.top -= f10;
        rectF.bottom += f10;
        int i5 = 0;
        do {
            this.LJLLI[i5] = new PointF();
            i5++;
        } while (i5 < 4);
    }
}
