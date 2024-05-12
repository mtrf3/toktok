package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;

/* renamed from: X.2TP, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2TP extends FrameLayout {
    public final java.util.Map<Integer, View> LJLIL;

    public final View LIZ(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLIL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final Bitmap getVideoFrame() {
        return ((TextureView) LIZ(R.id.n8n)).getBitmap();
    }

    public final void setCoverImage(Bitmap bitmap) {
        if (bitmap != null) {
            ((ImageView) LIZ(R.id.cover)).setImageBitmap(bitmap);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2TP(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLIL = C62850Ola.LJFF(context, "context");
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.bqf, this, true);
    }
}
