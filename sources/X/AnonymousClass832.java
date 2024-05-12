package X;

import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.832, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass832 implements InterfaceC207018An {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final LogPbBean LJLJJLL;
    public final int LJLJL;
    public final String LJLJLJ;
    public final String LJLJLLL;
    public final HashMap<String, String> LJLL;
    public final String LJLLI;

    public AnonymousClass832() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass832)) {
            return false;
        }
        AnonymousClass832 anonymousClass832 = (AnonymousClass832) obj;
        return o.LJ(this.LJLIL, anonymousClass832.LJLIL) && o.LJ(this.LJLILLLLZI, anonymousClass832.LJLILLLLZI) && o.LJ(this.LJLJI, anonymousClass832.LJLJI) && o.LJ(this.LJLJJI, anonymousClass832.LJLJJI) && o.LJ(this.LJLJJL, anonymousClass832.LJLJJL) && o.LJ(this.LJLJJLL, anonymousClass832.LJLJJLL) && this.LJLJL == anonymousClass832.LJLJL && o.LJ(this.LJLJLJ, anonymousClass832.LJLJLJ) && o.LJ(this.LJLJLLL, anonymousClass832.LJLJLLL) && o.LJ(this.LJLL, anonymousClass832.LJLL);
    }

    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        String str = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJLJI;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJLJJI;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJLJJL;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        LogPbBean logPbBean = this.LJLJJLL;
        int hashCode6 = (((hashCode5 + (logPbBean == null ? 0 : logPbBean.hashCode())) * 31) + this.LJLJL) * 31;
        String str5 = this.LJLJLJ;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LJLJLLL;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        HashMap<String, String> hashMap = this.LJLL;
        return hashCode8 + (hashMap != null ? hashMap.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShowExploreCardET(enterFrom=");
        LIZ.append(this.LJLIL);
        LIZ.append(", cardPosition=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", groupId=");
        LIZ.append(this.LJLJI);
        LIZ.append(", authorId=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", requestId=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", logPb=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", awemeType=");
        LIZ.append(this.LJLJL);
        LIZ.append(", displayedTitle=");
        LIZ.append(this.LJLJLJ);
        LIZ.append(", modifiedTitle=");
        LIZ.append(this.LJLJLLL);
        LIZ.append(", showTitleParams=");
        LIZ.append(this.LJLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC207018An
    public final java.util.Map<String, String> LLIL() {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", this.LJLIL);
        c188727au.LJIIIZ("card_position", this.LJLILLLLZI);
        c188727au.LJIIIZ("group_id", this.LJLJI);
        c188727au.LJIIIZ("author_id", this.LJLJJI);
        c188727au.LJIIIZ("request_id", this.LJLJJL);
        c188727au.LJFF(this.LJLJJLL, "log_pb");
        c188727au.LIZLLL(this.LJLJL, "aweme_type");
        c188727au.LJIIIZ("displayed_title", this.LJLJLJ);
        c188727au.LJIIIZ("modified_title", this.LJLJLLL);
        c188727au.LJII(this.LJLL);
        java.util.Map<String, String> map = c188727au.LIZ;
        o.LJIIIIZZ(map, "newBuilder()\n           …s)\n            .builder()");
        return map;
    }

    @Override // X.InterfaceC207018An
    public final String getEventName() {
        return this.LJLLI;
    }

    public AnonymousClass832(String str, String str2, String str3, String str4, LogPbBean logPbBean, int i, String str5, String str6, HashMap hashMap) {
        this.LJLIL = "homepage_explore";
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = str3;
        this.LJLJJL = str4;
        this.LJLJJLL = logPbBean;
        this.LJLJL = i;
        this.LJLJLJ = str5;
        this.LJLJLLL = str6;
        this.LJLL = hashMap;
        this.LJLLI = "show_explore_card";
    }
}
