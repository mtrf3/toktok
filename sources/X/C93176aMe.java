package X;

import org.json.JSONObject;

/* renamed from: X.aMe, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final /* synthetic */ class C93176aMe extends TBS implements InterfaceC65784Pro<C76800UCe> {
    public C93176aMe(Object obj) {
        super(0, obj, C92283a8F.class, "clickOcrButton", "clickOcrButton()V", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        C92283a8F c92283a8F = (C92283a8F) this.receiver;
        c92283a8F.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("obj_id", EnumC92042a4M.OcrCardNumber.getObjId());
        c92283a8F.LJ(jSONObject);
        return C76800UCe.LIZ;
    }
}
