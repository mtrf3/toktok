package X;

import com.bytedance.pitaya.api.PitayaApplogProxy;
import com.bytedance.pitaya.api.PitayaProxy;

/* renamed from: X.F6q, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38436F6q implements InterfaceC66829QKr {
    public static final C38436F6q LIZ = new C38436F6q();

    @Override // X.InterfaceC66829QKr
    public final void onEvent(String str, String str2) {
        PitayaApplogProxy pitayaApplogProxy;
        if (str != null && (pitayaApplogProxy = PitayaProxy.applogProxy) != null) {
            pitayaApplogProxy.onEvent(str, str2);
        }
    }
}
