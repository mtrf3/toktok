package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Spg, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C73296Spg extends FrameLayout {
    public View LJLIL;

    public final FrameLayout.LayoutParams getProgressLayoutParams() {
        ViewGroup.LayoutParams layoutParams;
        View view = this.LJLIL;
        ViewGroup.LayoutParams layoutParams2 = null;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            layoutParams2 = layoutParams;
        }
        return (FrameLayout.LayoutParams) layoutParams2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        View view;
        super.onAttachedToWindow();
        if (!C82894Wg6.LIZIZ.LIZIZ() && (view = this.LJLIL) != null) {
            view.setVisibility(getVisibility());
        }
    }

    public final View getProgress() {
        return this.LJLIL;
    }

    public final void setProgress(View view) {
        this.LJLIL = view;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.LJLIL;
        if (view != null) {
            view.setVisibility(i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C73296Spg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        o.LJIIIZ(context, "context");
        this.LJLIL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.cro, this, true).findViewById(R.id.cfh);
    }
}
