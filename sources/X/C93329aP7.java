package X;

import com.bytedance.pitaya.feature.UserProfile;
import com.bytedance.pitaya.jniwrapper.CallCallbackInNative;
import java.io.File;

/* renamed from: X.aP7, reason: case insensitive filesystem */
/* loaded from: classes30.dex */
public final class C93329aP7 implements InterfaceC93314aOs {
    public final /* synthetic */ UserProfile LIZ;
    public final /* synthetic */ long LIZIZ;
    public final /* synthetic */ String LIZJ;

    @Override // X.InterfaceC93314aOs
    public final void LIZ(byte[] bArr) {
        try {
            C38485F8n.LLLI(new File(this.LIZJ), bArr);
            CallCallbackInNative.LIZ.LIZ(this.LIZIZ, true, null, null);
        } catch (Error e) {
            UserProfile userProfile = this.LIZ;
            CallCallbackInNative.LIZ.LIZ(this.LIZIZ, false, UserProfile.getError$default(userProfile, userProfile.getFileErrCode(), e.toString(), null, 4, null), null);
        }
    }

    @Override // X.InterfaceC93314aOs
    public final void onFailure(int i, String str) {
        UserProfile userProfile = this.LIZ;
        CallCallbackInNative.LIZ.LIZ(this.LIZIZ, false, UserProfile.getError$default(userProfile, userProfile.getNetworkErrCode(), "request error", null, 4, null), null);
    }

    public C93329aP7(UserProfile userProfile, long j, String str) {
        this.LIZ = userProfile;
        this.LIZIZ = j;
        this.LIZJ = str;
    }
}
