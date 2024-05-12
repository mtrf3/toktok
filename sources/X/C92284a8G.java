package X;

import org.json.JSONObject;

/* renamed from: X.a8G, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92284a8G extends C92048a4S {
    public C92284a8G() {
        super(EnumC92050a4U.PiCCDCBind.getPageID());
    }

    public final void LJ(EnumC92042a4M enumC92042a4M) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("obj_id", enumC92042a4M.getObjId());
        LIZ(EnumC92044a4O.PiBindClick.getEventName(), jSONObject);
    }
}
