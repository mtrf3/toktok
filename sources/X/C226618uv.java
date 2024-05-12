package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.8uv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C226618uv extends LinearLayout {
    public int LJLIL;

    public final int getHeaderHeight() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C226618uv(Context context) {
        super(context);
        new LinkedHashMap();
        setOrientation(1);
    }

    public final void setHeaderHeight(int i) {
        this.LJLIL = i;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        setMinimumHeight(View.MeasureSpec.getSize(i2));
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
        this.LJLIL = 0;
        int childCount = getChildCount() - 1;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (!(childAt instanceof InterfaceC16600ky) || childAt.getMeasuredHeight() != getMinimumHeight()) {
                this.LJLIL = childAt.getMeasuredHeight() + this.LJLIL;
            } else {
                return;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        if (o.LJ(view, getChildAt(getChildCount() - 1))) {
            super.measureChildWithMargins(view, i, i2, View.MeasureSpec.makeMeasureSpec(getMinimumHeight(), LiveLayoutPreloadThreadPriority.DEFAULT), 0);
        } else {
            super.measureChildWithMargins(view, i, i2, i3, i4);
        }
    }
}
