package X;

import org.json.JSONObject;

/* renamed from: X.PuH, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65937PuH extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ JSONObject LJLJI;
    public final /* synthetic */ JSONObject LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65937PuH(String str, JSONObject jSONObject, JSONObject jSONObject2, boolean z) {
        super(0);
        this.LJLIL = str;
        this.LJLILLLLZI = z;
        this.LJLJI = jSONObject;
        this.LJLJJI = jSONObject2;
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" \n========================================================SkynetServiceImpl(DNS fuse: ");
        LIZ.append(this.LJLIL);
        LIZ.append(", isSampleRate:");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(")\ncategory:");
        LIZ.append(this.LJLJI);
        LIZ.append("\nlogExtra:");
        LIZ.append(this.LJLJJI);
        LIZ.append("\n========================================================");
        return X1D.LIZIZ(LIZ);
    }
}
