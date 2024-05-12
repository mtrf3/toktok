package X;

import android.graphics.Bitmap;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.UvW, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C78754UvW extends C78732UvA {
    public final String LIZ;

    @Override // X.C78732UvA, X.AbstractC78749UvR, X.VA3
    public final C81392Vwy<Bitmap> process(Bitmap bitmap, AbstractC78853Ux7 abstractC78853Ux7) {
        ConcurrentHashMap<String, V9L> concurrentHashMap = C79285V9t.LJJIIJZLJL;
        if (!concurrentHashMap.containsKey(this.LIZ)) {
            concurrentHashMap.put(this.LIZ, new V9L(bitmap.getWidth(), bitmap.getHeight()));
        }
        return super.process(bitmap, abstractC78853Ux7);
    }

    public C78754UvW(String str, int i, int i2, int i3, int i4, int i5, int i6, float[] fArr, InterfaceC78716Uuu interfaceC78716Uuu, String str2, String str3, Bitmap.Config config) {
        super(str, i, i2, i3, i4, i5, i6, fArr, interfaceC78716Uuu, str2, str3, config);
        this.LIZ = str;
    }
}
