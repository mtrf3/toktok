package X;

import android.content.Intent;
import com.bytedance.router.AbsOpenResultCallback;
import org.json.JSONObject;

/* renamed from: X.JeU, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49670JeU extends AbsOpenResultCallback {
    public final /* synthetic */ InterfaceC37146Ehy LIZ;

    public C49670JeU(InterfaceC37146Ehy interfaceC37146Ehy) {
        this.LIZ = interfaceC37146Ehy;
    }

    @Override // com.bytedance.router.AbsOpenResultCallback, com.bytedance.router.OpenResultCallback
    public final void onSuccess(Intent intent) {
        this.LIZ.onSuccess(new JSONObject());
    }

    @Override // com.bytedance.router.AbsOpenResultCallback, com.bytedance.router.OpenResultCallback
    public final void onFail(String str, String str2) {
        InterfaceC37146Ehy interfaceC37146Ehy = this.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("open url ");
        if (str == null) {
            str = "";
        }
        LIZ.append(str);
        LIZ.append(" with error: ");
        if (str2 == null) {
            str2 = "";
        }
        LIZ.append(str2);
        interfaceC37146Ehy.LIZ(0, X1D.LIZIZ(LIZ));
    }
}
