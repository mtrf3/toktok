package X;

import com.ss.mediakit.net.AVMDLNetClient;
import com.ss.mediakit.net.Error;
import org.json.JSONObject;

/* renamed from: X.IjG, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47418IjG implements InterfaceC47416IjE {
    public final /* synthetic */ AVMDLNetClient.CompletionListener LIZ;

    public C47418IjG(AVMDLNetClient.CompletionListener completionListener) {
        this.LIZ = completionListener;
    }

    @Override // X.InterfaceC47416IjE
    public final void LIZ(JSONObject jSONObject, C47419IjH c47419IjH) {
        if (c47419IjH != null) {
            this.LIZ.onCompletion(null, new Error(c47419IjH.code, "", c47419IjH.toString()));
        } else {
            this.LIZ.onCompletion(jSONObject, null);
        }
    }
}
