package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.a6Y, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92178a6Y implements Y6P {
    public final /* synthetic */ C92179a6Z LIZ;

    public C92178a6Y(C92179a6Z c92179a6Z) {
        this.LIZ = c92179a6Z;
    }

    @Override // X.Y6P
    public final void onEvent(String event, JSONObject jSONObject) {
        o.LJIIIZ(event, "event");
        this.LIZ.LIZIZ.invoke(event, jSONObject);
    }
}
