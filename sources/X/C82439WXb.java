package X;

import android.graphics.Bitmap;
import kotlin.jvm.internal.o;

/* renamed from: X.WXb, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82439WXb implements InterfaceC63955P8d {
    public final /* synthetic */ InterfaceC88472Yns<Bitmap, C76800UCe> LIZ;
    public final /* synthetic */ WXZ LIZIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C82439WXb(InterfaceC88472Yns<? super Bitmap, C76800UCe> interfaceC88472Yns, WXZ wxz) {
        this.LIZ = interfaceC88472Yns;
        this.LIZIZ = wxz;
    }

    @Override // X.InterfaceC63955P8d
    public final void LIZ(int i, Bitmap bitmap) {
        InterfaceC88472Yns<Bitmap, C76800UCe> interfaceC88472Yns = this.LIZ;
        o.LJIIIIZZ(bitmap, "bitmap");
        interfaceC88472Yns.invoke(bitmap);
        this.LIZIZ.LJZ = false;
    }
}
