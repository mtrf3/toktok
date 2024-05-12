package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.QSv, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67041QSv implements InterfaceC64016PAm {
    public final /* synthetic */ C67040QSu LIZ;

    @Override // X.InterfaceC64016PAm
    public final String getSessionId() {
        return null;
    }

    @Override // X.InterfaceC64016PAm
    public final java.util.Map<String, String> getCommonParams() {
        String str;
        C67042QSw c67042QSw = this.LIZ.LIZIZ;
        o.LJFF(c67042QSw, "configuration.commonParamProvider");
        java.util.Map<String, String> commonParams = c67042QSw.getCommonParams();
        if (this.LIZ.LJIIIIZZ) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        commonParams.put("oversea", str);
        commonParams.remove("aid");
        commonParams.put("host_aid", this.LIZ.LIZ);
        return commonParams;
    }

    public C67041QSv(C67040QSu c67040QSu) {
        this.LIZ = c67040QSu;
    }
}
