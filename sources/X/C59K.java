package X;

import android.graphics.Bitmap;
import kotlin.jvm.internal.o;

/* renamed from: X.59K, reason: invalid class name */
/* loaded from: classes3.dex */
public final /* synthetic */ class C59K extends TBS implements InterfaceC88471Ynr<String, Integer, Bitmap> {
    public C59K(Object obj) {
        super(2, obj, C59O.class, "getFrameBitmap", "getFrameBitmap(Ljava/lang/String;I)Landroid/graphics/Bitmap;", 0);
    }

    @Override // X.InterfaceC88471Ynr
    public final Bitmap invoke(String str, Integer num) {
        String p0 = str;
        int intValue = num.intValue();
        o.LJIIIZ(p0, "p0");
        return ((C59O) this.receiver).LIZ(intValue, p0);
    }
}
