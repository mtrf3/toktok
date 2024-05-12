package X;

import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.831, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass831 implements InterfaceC207018An {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final LogPbBean LJLJJLL;
    public final int LJLJL;
    public final String LJLJLJ;
    public final String LJLJLLL;
    public final long LJLL;
    public final HashMap<String, String> LJLLI;
    public final String LJLLILLLL;

    public AnonymousClass831() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass831)) {
            return false;
        }
        AnonymousClass831 anonymousClass831 = (AnonymousClass831) obj;
        return o.LJ(this.LJLIL, anonymousClass831.LJLIL) && o.LJ(this.LJLILLLLZI, anonymousClass831.LJLILLLLZI) && o.LJ(this.LJLJI, anonymousClass831.LJLJI) && o.LJ(this.LJLJJI, anonymousClass831.LJLJJI) && o.LJ(this.LJLJJL, anonymousClass831.LJLJJL) && o.LJ(this.LJLJJLL, anonymousClass831.LJLJJLL) && this.LJLJL == anonymousClass831.LJLJL && o.LJ(this.LJLJLJ, anonymousClass831.LJLJLJ) && o.LJ(this.LJLJLLL, anonymousClass831.LJLJLLL) && this.LJLL == anonymousClass831.LJLL && o.LJ(this.LJLLI, anonymousClass831.LJLLI);
    }

    public final String toString() {
        return "DisappearExploreCardET(enterFrom=" + this.LJLIL + ", cardPosition=" + this.LJLILLLLZI + ", groupId=" + this.LJLJI + ", authorId=" + this.LJLJJI + ", requestId=" + this.LJLJJL + ", logPb=" + this.LJLJJLL + ", awemeType=" + this.LJLJL + ", displayedTitle=" + this.LJLJLJ + ", modifiedTitle=" + this.LJLJLLL + ", duration=" + this.LJLL + ", showTitleParams=" + this.LJLLI + ')';
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
        c188727au.LJ(this.LJLL, "duration");
        c188727au.LJII(this.LJLLI);
        java.util.Map<String, String> map = c188727au.LIZ;
        o.LJIIIIZZ(map, "newBuilder()\n           …s)\n            .builder()");
        return map;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8 = this.LJLIL.hashCode() * 31;
        String str = this.LJLILLLLZI;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode8 + hashCode) * 31;
        String str2 = this.LJLJI;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.LJLJJI;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.LJLJJL;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        LogPbBean logPbBean = this.LJLJJLL;
        if (logPbBean == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = logPbBean.hashCode();
        }
        int i6 = (((i5 + hashCode5) * 31) + this.LJLJL) * 31;
        String str5 = this.LJLJLJ;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        String str6 = this.LJLJLLL;
        if (str6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str6.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.LJLL, (i7 + hashCode7) * 31, 31);
        HashMap<String, String> hashMap = this.LJLLI;
        if (hashMap != null) {
            i = hashMap.hashCode();
        }
        return LIZJ + i;
    }

    @Override // X.InterfaceC207018An
    public final String getEventName() {
        return this.LJLLILLLL;
    }

    public AnonymousClass831(String str, String str2, String str3, String str4, LogPbBean logPbBean, int i, String str5, String str6, long j, HashMap hashMap) {
        this.LJLIL = "homepage_explore";
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = str3;
        this.LJLJJL = str4;
        this.LJLJJLL = logPbBean;
        this.LJLJL = i;
        this.LJLJLJ = str5;
        this.LJLJLLL = str6;
        this.LJLL = j;
        this.LJLLI = hashMap;
        this.LJLLILLLL = "disappear_explore_card";
    }
}
