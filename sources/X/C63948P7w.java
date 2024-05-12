package X;

import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: X.P7w, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C63948P7w implements IVC {
    public final /* synthetic */ InterfaceC63853P4f LIZ;

    public C63948P7w(InterfaceC63853P4f interfaceC63853P4f) {
        this.LIZ = interfaceC63853P4f;
    }

    public final void LIZ(String str, String str2, JSONObject jSONObject) {
        InterfaceC63853P4f interfaceC63853P4f = this.LIZ;
        if (interfaceC63853P4f != null) {
            P80 p80 = (P80) interfaceC63853P4f;
            WeakReference<P83> weakReference = p80.LIZ.mVEApplogListener;
            if (weakReference != null && weakReference.get() != null) {
                p80.LIZ.mVEApplogListener.get().LIZ(str, jSONObject, str2);
            }
        }
    }
}
