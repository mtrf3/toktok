package X;

import android.graphics.Bitmap;

/* renamed from: X.MAm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56372MAm implements InterfaceC78660Uu0 {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ InterfaceC67352kd<C76800UCe> LJLILLLLZI;

    @Override // X.InterfaceC78660Uu0
    public final void onProgress(float f) {
    }

    @Override // X.InterfaceC78660Uu0
    public final void LIZ() {
        MCT.LIZ("StoryWidgetResMgr", "refreshWidget downloadPicture");
        InterfaceC67352kd<C76800UCe> interfaceC67352kd = this.LJLILLLLZI;
        C3C4 LIZ = C141335gf.LIZ(new C36355EOp("download picture cancel", null, 2, null));
        C3C5.m7constructorimpl(LIZ);
        interfaceC67352kd.resumeWith(LIZ);
    }

    @Override // X.InterfaceC78660Uu0
    public final void LIZIZ(Bitmap bitmap) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("downloadPicture onCompleted url = ");
        LIZ.append(this.LJLIL);
        MCT.LIZ("StoryWidgetResMgr", X1D.LIZIZ(LIZ));
        MB4 mb4 = (MB4) this.LJLILLLLZI.getContext().get(MB4.LJLJI);
        if (mb4 != null) {
            mb4.LJLILLLLZI = bitmap;
        }
        InterfaceC67352kd<C76800UCe> interfaceC67352kd = this.LJLILLLLZI;
        C76800UCe c76800UCe = C76800UCe.LIZ;
        C3C5.m7constructorimpl(c76800UCe);
        interfaceC67352kd.resumeWith(c76800UCe);
    }

    @Override // X.InterfaceC78660Uu0
    public final void onFailed(Throwable th) {
        MCT.LIZ("StoryWidgetResMgr", "refreshWidget downloadPicture");
        InterfaceC67352kd<C76800UCe> interfaceC67352kd = this.LJLILLLLZI;
        C3C4 LIZ = C141335gf.LIZ(new C36355EOp("download picture error", th));
        C3C5.m7constructorimpl(LIZ);
        interfaceC67352kd.resumeWith(LIZ);
    }

    public C56372MAm(String str, C84654XKg c84654XKg) {
        this.LJLIL = str;
        this.LJLILLLLZI = c84654XKg;
    }
}
