package X;

import org.json.JSONObject;

/* renamed from: X.ExX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38111ExX extends C38131Exr {
    public final /* synthetic */ InterfaceC60761Nsz LJFF;

    public C38111ExX(InterfaceC60761Nsz interfaceC60761Nsz) {
        this.LJFF = interfaceC60761Nsz;
    }

    @Override // X.C38131Exr
    public final void LIZ(Object obj, String str) {
        InterfaceC60761Nsz interfaceC60761Nsz;
        if ((obj instanceof JSONObject) && (interfaceC60761Nsz = this.LJFF) != null) {
            interfaceC60761Nsz.LJIIJ(str, C47261Igj.LJJIJ(obj));
        }
    }
}
