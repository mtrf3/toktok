package X;

import android.graphics.Bitmap;
import android.util.LruCache;

/* renamed from: X.4K6, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4K6 extends AbstractC65781Prl implements InterfaceC65784Pro<LruCache<String, Bitmap>> {
    public static final C4K6 INSTANCE = new C4K6();

    public C4K6() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC65784Pro
    public final LruCache<String, Bitmap> invoke() {
        int i;
        if (C16880lQ.LLLZLL()) {
            i = 20;
        } else {
            i = 40;
        }
        return new LruCache<>(i);
    }
}
