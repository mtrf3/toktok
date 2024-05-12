package X;

import org.json.JSONObject;

/* renamed from: X.Eke, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37312Eke extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ JSONObject LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37312Eke(String str, String str2, String str3, JSONObject jSONObject) {
        super(0);
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = jSONObject;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        String str = this.LJLIL;
        if (str == null) {
            str = "";
        }
        C79605VMb c79605VMb = new C79605VMb(this.LJLILLLLZI);
        c79605VMb.LIZIZ = "tiktok_hybrid_default";
        c79605VMb.LIZ = this.LJLJI;
        c79605VMb.LIZLLL = this.LJLJJI;
        c79605VMb.LIZIZ(0);
        FD5.LJ(str, c79605VMb.LIZ());
        return C76800UCe.LIZ;
    }
}
