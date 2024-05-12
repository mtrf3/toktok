package X;

import com.ss.android.ugc.aweme.discover.model.FeedbackContents;
import defpackage.b0;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Jp1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50323Jp1 implements KK7 {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final List<FeedbackContents> LJLJJL;
    public final HashMap<String, Object> LJLJJLL;
    public final int LJLJL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50323Jp1)) {
            return false;
        }
        C50323Jp1 c50323Jp1 = (C50323Jp1) obj;
        return o.LJ(this.LJLIL, c50323Jp1.LJLIL) && o.LJ(this.LJLILLLLZI, c50323Jp1.LJLILLLLZI) && o.LJ(this.LJLJI, c50323Jp1.LJLJI) && o.LJ(this.LJLJJI, c50323Jp1.LJLJJI) && o.LJ(this.LJLJJL, c50323Jp1.LJLJJL) && o.LJ(this.LJLJJLL, c50323Jp1.LJLJJLL) && this.LJLJL == c50323Jp1.LJLJL;
    }

    @Override // X.KK7
    public final boolean isLog() {
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LJLJJI, C79062V1e.LJ(this.LJLJI, C79062V1e.LJ(this.LJLILLLLZI, this.LJLIL.hashCode() * 31, 31), 31), 31);
        List<FeedbackContents> list = this.LJLJJL;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return ((this.LJLJJLL.hashCode() + ((LJ + hashCode) * 31)) * 31) + this.LJLJL;
    }

    static {
        C17N.LJJJJLI().If().LIZIZ(C65352Pkq.LIZ(C50323Jp1.class), C50325Jp3.LJLIL);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NewSearchRequestAction(searchKeyword=");
        LIZ.append(this.LJLIL);
        LIZ.append(", searchId=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", tnsBanType=");
        LIZ.append(this.LJLJI);
        LIZ.append(", useScenario=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", feedbackSurvey=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", feelGoodToken=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", maskOriginType=");
        return b0.LIZJ(LIZ, this.LJLJL, ')', LIZ);
    }

    public C50323Jp1(String str, String str2) {
        this(str, str2, "normal", "normal", C61878OQg.INSTANCE, new HashMap(), 0);
    }

    public C50323Jp1(String searchKeyword, String searchId, String tnsBanType, String useScenario, List<FeedbackContents> list, HashMap<String, Object> feelGoodToken, int i) {
        o.LJIIIZ(searchKeyword, "searchKeyword");
        o.LJIIIZ(searchId, "searchId");
        o.LJIIIZ(tnsBanType, "tnsBanType");
        o.LJIIIZ(useScenario, "useScenario");
        o.LJIIIZ(feelGoodToken, "feelGoodToken");
        this.LJLIL = searchKeyword;
        this.LJLILLLLZI = searchId;
        this.LJLJI = tnsBanType;
        this.LJLJJI = useScenario;
        this.LJLJJL = list;
        this.LJLJJLL = feelGoodToken;
        this.LJLJL = i;
    }
}
