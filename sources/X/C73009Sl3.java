package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.Sl3, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73009Sl3 extends AbstractC030309z {
    public final Paint LJLIL;
    public final float LJLILLLLZI;
    public final float LJLJI;

    public C73009Sl3() {
        float LIZ;
        Paint paint = new Paint();
        paint.setColor(ColorProtector.parseColor("#99FFFFFF"));
        C23010vJ.LIZIZ(C15380j0.LIZLLL(), paint, 3, LiveChatShowDelayForHotLiveSetting.DEFAULT);
        paint.setTextAlign(Paint.Align.CENTER);
        this.LJLIL = paint;
        this.LJLILLLLZI = ((paint.getFontMetrics().bottom - paint.getFontMetrics().top) / 2) - paint.getFontMetrics().bottom;
        if (CCJ.LIZ(C15380j0.LIZLLL())) {
            LIZ = C15380j0.LJIIL() - C15380j0.LIZ(20.0f);
        } else {
            LIZ = C15380j0.LIZ(20.0f);
        }
        this.LJLJI = LIZ;
    }

    @Override // X.AbstractC030309z
    public final void LJI(Canvas c, RecyclerView parent, C0AC state) {
        o.LJIIIZ(c, "c");
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(state, "state");
        int childCount = parent.getChildCount();
        for (int i = 0; i < childCount; i++) {
            int LJJJJIZL = RecyclerView.LJJJJIZL(parent.getChildAt(i));
            if (LJJJJIZL != -1) {
                c.drawText(String.valueOf(LJJJJIZL + 1), this.LJLJI, ((r6.getBottom() + r6.getTop()) / 2.0f) + this.LJLILLLLZI, this.LJLIL);
            }
        }
    }
}
