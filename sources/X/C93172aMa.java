package X;

import org.json.JSONObject;

/* renamed from: X.aMa, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final /* synthetic */ class C93172aMa extends TBS implements InterfaceC88472Yns<Boolean, C76800UCe> {
    public C93172aMa(Object obj) {
        super(1, obj, C92283a8F.class, "clickSave", "clickSave(Z)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Boolean bool) {
        String objId;
        boolean booleanValue = bool.booleanValue();
        C92283a8F c92283a8F = (C92283a8F) this.receiver;
        c92283a8F.getClass();
        JSONObject jSONObject = new JSONObject();
        if (booleanValue) {
            objId = EnumC92042a4M.SaveForNextTime.getObjId();
        } else {
            objId = EnumC92042a4M.UnSaveForNextTime.getObjId();
        }
        jSONObject.put("obj_id", objId);
        c92283a8F.LJ(jSONObject);
        return C76800UCe.LIZ;
    }
}
