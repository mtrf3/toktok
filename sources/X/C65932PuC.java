package X;

import org.json.JSONObject;

/* renamed from: X.PuC, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65932PuC extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ JSONObject LJLJJL;
    public final /* synthetic */ JSONObject LJLJJLL;
    public final /* synthetic */ JSONObject LJLJL;
    public final /* synthetic */ java.util.Set LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65932PuC(String str, boolean z, long j, long j2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, java.util.Set set) {
        super(0);
        this.LJLIL = str;
        this.LJLILLLLZI = z;
        this.LJLJI = j;
        this.LJLJJI = j2;
        this.LJLJJL = jSONObject;
        this.LJLJJLL = jSONObject2;
        this.LJLJL = jSONObject3;
        this.LJLJLJ = set;
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" \n========================================================SkynetServiceImpl(");
        LIZ.append(this.LJLIL);
        LIZ.append(")\nisAnalyze:");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(" (");
        C48339Iy7.LIZLLL(this.LJLJI, this.LJLJJI, LIZ, ")\ncategory:");
        LIZ.append(this.LJLJJL);
        LIZ.append("\nmetric:");
        LIZ.append(this.LJLJJLL);
        LIZ.append("\nlogExtra:");
        LIZ.append(this.LJLJL);
        LIZ.append("\noriginDomains:");
        LIZ.append(this.LJLJLJ);
        LIZ.append("\n========================================================");
        return X1D.LIZIZ(LIZ);
    }
}
