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

/* renamed from: X.JEx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48843JEx extends FrameLayout {
    public Bitmap LJLIL;
    public final java.util.Map<Integer, View> LJLILLLLZI;

    public final View LIZ(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLILLLLZI;
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
        if (IPZ.LIZ == IPX.PLAYER_IDLE) {
            return this.LJLIL;
        }
        return ((TextureView) LIZ(R.id.n8n)).getBitmap();
    }

    public final void setCoverImage(Bitmap bitmap) {
        this.LJLIL = bitmap;
        if (bitmap != null) {
            ((ImageView) LIZ(R.id.cover)).setImageBitmap(bitmap);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48843JEx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLILLLLZI = C62850Ola.LJFF(context, "context");
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.dsi, this, true);
    }
}
