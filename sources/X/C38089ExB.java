package X;

import org.json.JSONObject;

/* renamed from: X.ExB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38089ExB extends C38131Exr {
    public final /* synthetic */ InterfaceC60761Nsz LJFF;

    public C38089ExB(InterfaceC60761Nsz interfaceC60761Nsz) {
        this.LJFF = interfaceC60761Nsz;
    }

    @Override // X.C38131Exr
    public final void LIZ(Object obj, String str) {
        if (obj instanceof JSONObject) {
            this.LJFF.LJIIIZ(str, (JSONObject) obj);
        }
    }
}
