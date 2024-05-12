package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/* renamed from: X.Cbr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31671Cbr implements InterfaceC48038ItG<InterfaceC81378Vwk, Bitmap> {
    @Override // X.InterfaceC48038ItG
    public final Bitmap apply(InterfaceC81378Vwk interfaceC81378Vwk) {
        return BitmapFactory.decodeStream(new C81377Vwj(interfaceC81378Vwk));
    }
}
