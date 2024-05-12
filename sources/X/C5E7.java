package X;

import android.graphics.Bitmap;
import kotlin.jvm.internal.o;

/* renamed from: X.5E7, reason: invalid class name */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5E7 extends TBS implements InterfaceC88471Ynr<String, Integer, Bitmap> {
    public C5E7(C5E5 c5e5) {
        super(2, c5e5, C5E5.class, "getFrameCache", "getFrameCache(Ljava/lang/String;I)Landroid/graphics/Bitmap;", 0);
    }

    @Override // X.InterfaceC88471Ynr
    public final Bitmap invoke(String str, Integer num) {
        String p0 = str;
        int intValue = num.intValue();
        o.LJIIIZ(p0, "p0");
        return ((C5E5) this.receiver).LJLZ(p0, intValue);
    }
}
