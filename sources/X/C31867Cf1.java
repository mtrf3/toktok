package X;

import Y.AfS54S0200000_5;
import Y.AfS57S0100000_5;
import Y.IDhS68S0200000_5;
import Y.IDuS76S0200000_5;
import android.content.Intent;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.EncryptedUploadMethod;

/* renamed from: X.Cf1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31867Cf1 implements InterfaceC78910Uy2 {
    public final /* synthetic */ byte[] LIZ;
    public final /* synthetic */ Intent LIZIZ;
    public final /* synthetic */ EncryptedUploadMethod LIZJ;

    @Override // X.InterfaceC78910Uy2
    public final /* synthetic */ void LIZ(String... strArr) {
    }

    @Override // X.InterfaceC78910Uy2
    public final /* synthetic */ void LIZJ(String... strArr) {
    }

    @Override // X.InterfaceC78910Uy2
    public final /* synthetic */ void LJ(String str, String... strArr) {
    }

    @Override // X.InterfaceC78910Uy2
    public final /* synthetic */ void LJFF(String... strArr) {
    }

    @Override // X.InterfaceC78910Uy2
    public final void LIZIZ(String... strArr) {
        C0NB.LIZIZ("EncryptedUploadMethod", "onPermissionDenied: ");
    }

    @Override // X.InterfaceC78910Uy2
    public final void LIZLLL(String... strArr) {
        EncryptedUploadMethod encryptedUploadMethod = this.LIZJ;
        byte[] bArr = this.LIZ;
        android.net.Uri data = this.LIZIZ.getData();
        encryptedUploadMethod.getClass();
        AbstractC73672Svk.LJIIJ(new IDuS76S0200000_5(encryptedUploadMethod, data, 1)).LJJIII(new IDhS68S0200000_5(encryptedUploadMethod, bArr, 1), false).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLL(new AfS54S0200000_5(data, encryptedUploadMethod, 10), new AfS57S0100000_5(encryptedUploadMethod, 57), new C31868Cf2());
    }

    public C31867Cf1(EncryptedUploadMethod encryptedUploadMethod, byte[] bArr, Intent intent) {
        this.LIZJ = encryptedUploadMethod;
        this.LIZ = bArr;
        this.LIZIZ = intent;
    }
}
