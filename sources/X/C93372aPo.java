package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import kotlin.jvm.internal.o;

/* renamed from: X.aPo, reason: case insensitive filesystem */
/* loaded from: classes32.dex */
public final class C93372aPo implements InterfaceC199707sc {
    @Override // X.InterfaceC199707sc
    public final Bitmap LIZ(View contentView) {
        o.LJIIIZ(contentView, "contentView");
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(536870912, LiveLayoutPreloadThreadPriority.DEFAULT);
        contentView.measure(ViewGroup.getChildMeasureSpec(makeMeasureSpec, 0, contentView.getLayoutParams().width), ViewGroup.getChildMeasureSpec(makeMeasureSpec, 0, contentView.getLayoutParams().height));
        contentView.layout(0, 0, contentView.getMeasuredWidth(), contentView.getMeasuredHeight());
        Bitmap createBitmap = Bitmap.createBitmap(contentView.getMeasuredWidth(), contentView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(0);
        Canvas canvas = new Canvas(createBitmap);
        C37203Eit.LIZJ.getClass();
        C39214FaE.LIZ(contentView, canvas);
        return createBitmap;
    }
}
