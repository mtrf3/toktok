package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class O0F extends FrameLayout {
    public ImageView LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0F(Context context) {
        super(context);
        new LinkedHashMap();
        ImageView imageView = new ImageView(getContext());
        this.LJLIL = imageView;
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(this.LJLIL);
    }

    public final void setImageBitmap(Bitmap bitmap) {
        o.LJIIIZ(bitmap, "bitmap");
        ImageView imageView = this.LJLIL;
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
        }
    }
}
