package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.commercialize.log.repo.adsession.SessionInfo;
import org.json.JSONObject;

/* renamed from: X.MyR, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58551MyR extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public final /* synthetic */ C58553MyT LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ JSONObject LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C58551MyR(C58553MyT c58553MyT, String str, String str2, JSONObject jSONObject) {
        super(0);
        this.LJLIL = c58553MyT;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = jSONObject;
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        SessionInfo LIZ = this.LJLIL.LIZ.LIZ(new M92(this.LJLILLLLZI, this.LJLJI, this.LJLJJI));
        if (LIZ != null) {
            return GsonProtectorUtils.toJson(this.LJLIL.LIZIZ, LIZ);
        }
        return null;
    }
}
