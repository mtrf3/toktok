package X;

import com.ss.android.ugc.aweme.services.watermark.WaterMarkListener;

/* renamed from: X.Hk9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44925Hk9 implements WaterMarkListener {
    public final /* synthetic */ C44923Hk7 LIZ;

    @Override // com.ss.android.ugc.aweme.services.watermark.WaterMarkListener
    public final void onStart() {
    }

    @Override // com.ss.android.ugc.aweme.services.watermark.WaterMarkListener
    public final void onCancel() {
        InterfaceC44926HkA interfaceC44926HkA = this.LIZ.LJLJL;
        if (interfaceC44926HkA != null) {
            interfaceC44926HkA.onCancel();
        }
        C44938HkM.LIZJ = false;
    }

    public C44925Hk9(C44923Hk7 c44923Hk7) {
        this.LIZ = c44923Hk7;
    }

    @Override // com.ss.android.ugc.aweme.services.watermark.WaterMarkListener
    public final void onError(int i) {
        InterfaceC44926HkA interfaceC44926HkA = this.LIZ.LJLJL;
        if (interfaceC44926HkA != null) {
            interfaceC44926HkA.onError(i);
        }
        C44938HkM.LIZJ = false;
    }

    @Override // com.ss.android.ugc.aweme.services.watermark.WaterMarkListener
    public final void onProgress(int i) {
        InterfaceC44926HkA interfaceC44926HkA = this.LIZ.LJLJL;
        if (interfaceC44926HkA != null) {
            interfaceC44926HkA.onProgress(i);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.watermark.WaterMarkListener
    public final void onSuccess(String str) {
        InterfaceC44926HkA interfaceC44926HkA = this.LIZ.LJLJL;
        if (interfaceC44926HkA != null) {
            interfaceC44926HkA.onSuccess();
        }
        C44938HkM.LIZJ = false;
    }
}
