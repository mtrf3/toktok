package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UZU extends UZN {
    @Override // X.AbstractC77394UZa
    public final void LIZIZ() {
    }

    @Override // X.UZN
    public final void LJII(W5F w5f) {
        w5f.LIZLLL = true;
        w5f.LJIJI = Bitmap.Config.ARGB_8888;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UZU(Context context, View view, SmartImageView smartImageView, SmartImageView smartImageView2, View view2, View view3, C77395UZb c77395UZb) {
        super(context, view, smartImageView, smartImageView2, view2, view3, c77395UZb);
        o.LJIIIZ(context, "context");
    }
}
