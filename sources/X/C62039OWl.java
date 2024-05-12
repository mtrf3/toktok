package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bytedance.tux.input.TuxTextView;

/* renamed from: X.OWl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62039OWl implements InterfaceC82810Wek<Bitmap> {
    public final /* synthetic */ ImageView LIZ;
    public final /* synthetic */ TuxTextView LIZIZ;

    @Override // X.InterfaceC82810Wek
    public final void LIZ(Bitmap bitmap) {
        this.LIZ.setImageBitmap(bitmap);
        this.LIZIZ.setVisibility(8);
    }

    public C62039OWl(ImageView imageView, TuxTextView tuxTextView) {
        this.LIZ = imageView;
        this.LIZIZ = tuxTextView;
    }
}
