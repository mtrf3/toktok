package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.YMg, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87254YMg extends AbstractC65781Prl implements InterfaceC88473Ynt<String, JSONObject, java.util.Map<String, String>, EnumC87257YMj> {
    public static final C87254YMg LJLIL = new C87254YMg();

    public C87254YMg() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final EnumC87257YMj invoke(String eventName, JSONObject jSONObject, java.util.Map<String, String> map) {
        o.LJIIIZ(eventName, "eventName");
        C87256YMi.LIZ.getClass();
        return C87256YMi.LIZJ.get(eventName);
    }
}
