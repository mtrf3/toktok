package X;

import com.ss.mediakit.net.AVMDLNetClient;
import org.json.JSONObject;

/* renamed from: X.IjB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47413IjB extends AVMDLNetClient {
    public final InterfaceC47412IjA LIZ;

    @Override // com.ss.mediakit.net.AVMDLNetClient
    public final void cancel() {
        this.LIZ.cancel();
    }

    public C47413IjB(InterfaceC47412IjA interfaceC47412IjA) {
        this.LIZ = interfaceC47412IjA;
    }

    @Override // com.ss.mediakit.net.AVMDLNetClient
    public final void startTask(String str, AVMDLNetClient.CompletionListener completionListener) {
        this.LIZ.LIZ(str, new C47418IjG(completionListener));
    }

    @Override // com.ss.mediakit.net.AVMDLNetClient
    public final void startTask(String str, java.util.Map<String, String> map, AVMDLNetClient.CompletionListener completionListener) {
        this.LIZ.LIZIZ(str, map, new C47418IjG(completionListener));
    }

    @Override // com.ss.mediakit.net.AVMDLNetClient
    public final void startTask(String str, java.util.Map<String, String> map, JSONObject jSONObject, int i, AVMDLNetClient.CompletionListener completionListener) {
        this.LIZ.LIZJ(str, map, jSONObject, i, new C47418IjG(completionListener));
    }
}
