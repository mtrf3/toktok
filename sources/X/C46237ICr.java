package X;

import android.graphics.Bitmap;
import com.bytedance.ies.effecteditor.swig.UIAnnotationErrorCode;

/* renamed from: X.ICr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46237ICr implements C2V {
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLIL;
    public final /* synthetic */ Bitmap[] LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    @Override // X.InterfaceC30685C2n
    public final void onSuccess() {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLIL;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        for (Bitmap bitmap : this.LJLILLLLZI) {
            if (bitmap != null && !bitmap.isRecycled()) {
                bitmap.recycle();
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DiyPropParser#previewImages onSuccess:");
        LIZ.append(System.currentTimeMillis() - this.LJLJI);
        LIZ.append(" ms");
        H78.LIZIZ("DiyProp", X1D.LIZIZ(LIZ));
    }

    @Override // X.C2V
    public final void LIZIZ(UIAnnotationErrorCode uIAnnotationErrorCode) {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLIL;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        for (Bitmap bitmap : this.LJLILLLLZI) {
            if (bitmap != null && !bitmap.isRecycled()) {
                bitmap.recycle();
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DiyPropParser#previewImages errorCode:");
        LIZ.append(uIAnnotationErrorCode);
        LIZ.append(':');
        LIZ.append(System.currentTimeMillis() - this.LJLJI);
        LIZ.append(" ms");
        H78.LIZIZ("DiyProp", X1D.LIZIZ(LIZ));
    }

    public C46237ICr(C46223ICd c46223ICd, Bitmap[] bitmapArr, long j) {
        this.LJLIL = c46223ICd;
        this.LJLILLLLZI = bitmapArr;
        this.LJLJI = j;
    }
}
