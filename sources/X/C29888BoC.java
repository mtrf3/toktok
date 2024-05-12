package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.roomfunction.ToolBarButtonWithTextExperiment;
import com.bytedance.android.livesdk.livesetting.roomfunction.TtliveGameLandscapeDesignOptimizeSetting;
import com.zhiliaoapp.musically.R;
import defpackage.a1;

/* renamed from: X.BoC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29888BoC extends FrameLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29888BoC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        a1.LJFF(context, "context");
        if (!C15380j0.LJIILLIIL() ? !TtliveGameLandscapeDesignOptimizeSetting.INSTANCE.shouldAddIconBackground() : ToolBarButtonWithTextExperiment.hasText()) {
            i = 0;
        } else {
            i = R.drawable.cnj;
        }
        setBackgroundResource(i);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) KL2.LIZJ(getContext(), 36.0f), 1073741824), View.MeasureSpec.makeMeasureSpec((int) KL2.LIZJ(getContext(), 36.0f), 1073741824));
    }
}
