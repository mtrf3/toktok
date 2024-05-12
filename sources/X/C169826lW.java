package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import java.util.ArrayList;

/* renamed from: X.6lW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C169826lW extends View {
    public float LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public Paint LJLJJI;
    public Paint LJLJJL;
    public ArrayList<EffectPointModel> LJLJJLL;
    public boolean LJLJL;
    public RectF LJLJLJ;
    public RectF LJLJLLL;
    public int LJLL;
    public int LJLLI;
    public int LJLLILLLL;
    public boolean LJLLJ;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.LJLLJ) {
            this.LJLJJI.setColor(this.LJLLILLLL);
            if (this.LJLLILLLL != 0) {
                this.LJLJJI.setAlpha(230);
            }
            canvas.drawRect(this.LJLJLJ, this.LJLJJI);
            return;
        }
        this.LJLJJI.setColor(this.LJLLI);
        RectF rectF = this.LJLJLJ;
        int i = this.LJLJI;
        canvas.drawRoundRect(rectF, i / 2, i / 2, this.LJLJJI);
        for (int i2 = 0; i2 < this.LJLJJLL.size(); i2++) {
            EffectPointModel effectPointModel = (EffectPointModel) ListProtector.get(this.LJLJJLL, i2);
            if (effectPointModel.getSelectedColor() != 0) {
                this.LJLJJL.setColor(effectPointModel.getSelectedColor());
                this.LJLJJL.setAlpha(230);
                int uiStartPoint = effectPointModel.getUiStartPoint();
                int uiEndPoint = effectPointModel.getUiEndPoint();
                boolean isFromEnd = (effectPointModel.isFromEnd() ^ this.LJLJL) ^ C173636rf.LIZIZ(getContext());
                this.LJLJLLL.set((isFromEnd ? this.LJLL - uiEndPoint : uiStartPoint) * this.LJLIL, 0.0f, (isFromEnd ? this.LJLL - uiStartPoint : uiEndPoint) * this.LJLIL, this.LJLJI);
                if (uiStartPoint == 0 && uiEndPoint == this.LJLL) {
                    RectF rectF2 = this.LJLJLLL;
                    int i3 = this.LJLJI;
                    canvas.drawRoundRect(rectF2, i3 / 2, i3 / 2, this.LJLJJL);
                } else {
                    canvas.drawRect(this.LJLJLLL, this.LJLJJL);
                }
            }
        }
    }

    public void setDuration(int i) {
        this.LJLL = i;
        this.LJLIL = this.LJLILLLLZI / i;
    }

    public void setNormalColor(int i) {
        this.LJLLI = i;
        if (!this.LJLLJ) {
            invalidate();
        }
    }

    public void setOverlayColor(int i) {
        if (this.LJLLILLLL != i) {
            this.LJLLILLLL = i;
            invalidate();
        }
    }

    public C169826lW(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLILLLLZI = C170236mB.LIZ;
        this.LJLJI = (int) KL2.LIZJ(getContext(), 5.0f);
        Paint paint = new Paint();
        this.LJLJJI = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.LJLJJL = paint2;
        paint2.setAntiAlias(true);
        this.LJLJJLL = new ArrayList<>();
        this.LJLJLLL = new RectF();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.LJLJI = View.MeasureSpec.getSize(i2);
        if (this.LJLJLJ == null) {
            this.LJLJLJ = new RectF();
        }
        this.LJLJLJ.set(0.0f, 0.0f, this.LJLILLLLZI, this.LJLJI);
    }
}
