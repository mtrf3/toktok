package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Uti, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* synthetic */ class C78642Uti extends TBS implements InterfaceC88471Ynr<String, JSONObject, C76800UCe> {
    public C78642Uti(C78646Utm c78646Utm) {
        super(2, c78646Utm, C78646Utm.class, "reportEvent", "reportEvent(Ljava/lang/String;Lorg/json/JSONObject;)V", 0);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(String str, JSONObject jSONObject) {
        String p0 = str;
        JSONObject p1 = jSONObject;
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(p1, "p1");
        this.receiver.getClass();
        C78646Utm.LIZJ(p0, p1);
        return C76800UCe.LIZ;
    }
}
