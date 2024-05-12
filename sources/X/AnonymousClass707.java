package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.707, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass707 implements Serializable {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final Aweme LJLJJL;
    public final String LJLJJLL;
    public final Boolean LJLJL;
    public final String LJLJLJ;
    public final String LJLJLLL;
    public final String LJLL;
    public final String LJLLI;
    public final java.util.Map<String, Object> LJLLILLLL;

    /* JADX WARN: Multi-variable type inference failed */
    public AnonymousClass707() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 4095, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnonymousClass707 copy$default(AnonymousClass707 anonymousClass707, String str, String str2, String str3, String str4, Aweme aweme, String str5, Boolean bool, String str6, String str7, String str8, String str9, java.util.Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = anonymousClass707.LJLIL;
        }
        if ((i & 2) != 0) {
            str2 = anonymousClass707.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            str3 = anonymousClass707.LJLJI;
        }
        if ((i & 8) != 0) {
            str4 = anonymousClass707.LJLJJI;
        }
        if ((i & 16) != 0) {
            aweme = anonymousClass707.LJLJJL;
        }
        if ((i & 32) != 0) {
            str5 = anonymousClass707.LJLJJLL;
        }
        if ((i & 64) != 0) {
            bool = anonymousClass707.LJLJL;
        }
        if ((i & 128) != 0) {
            str6 = anonymousClass707.LJLJLJ;
        }
        if ((i & 256) != 0) {
            str7 = anonymousClass707.LJLJLLL;
        }
        if ((i & 512) != 0) {
            str8 = anonymousClass707.LJLL;
        }
        if ((i & 1024) != 0) {
            str9 = anonymousClass707.LJLLI;
        }
        if ((i & 2048) != 0) {
            map = anonymousClass707.LJLLILLLL;
        }
        return anonymousClass707.copy(str, str2, str3, str4, aweme, str5, bool, str6, str7, str8, str9, map);
    }

    public final AnonymousClass707 copy(String str, String str2, String str3, String str4, Aweme aweme, String str5, Boolean bool, String str6, String str7, String str8, String str9, java.util.Map<String, Object> map) {
        return new AnonymousClass707(str, str2, str3, str4, aweme, str5, bool, str6, str7, str8, str9, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass707)) {
            return false;
        }
        AnonymousClass707 anonymousClass707 = (AnonymousClass707) obj;
        return o.LJ(this.LJLIL, anonymousClass707.LJLIL) && o.LJ(this.LJLILLLLZI, anonymousClass707.LJLILLLLZI) && o.LJ(this.LJLJI, anonymousClass707.LJLJI) && o.LJ(this.LJLJJI, anonymousClass707.LJLJJI) && o.LJ(this.LJLJJL, anonymousClass707.LJLJJL) && o.LJ(this.LJLJJLL, anonymousClass707.LJLJJLL) && o.LJ(this.LJLJL, anonymousClass707.LJLJL) && o.LJ(this.LJLJLJ, anonymousClass707.LJLJLJ) && o.LJ(this.LJLJLLL, anonymousClass707.LJLJLLL) && o.LJ(this.LJLL, anonymousClass707.LJLL) && o.LJ(this.LJLLI, anonymousClass707.LJLLI) && o.LJ(this.LJLLILLLL, anonymousClass707.LJLLILLLL);
    }

    public int hashCode() {
        String str = this.LJLIL;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJLJI;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJLJJI;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Aweme aweme = this.LJLJJL;
        int hashCode5 = (hashCode4 + (aweme == null ? 0 : aweme.hashCode())) * 31;
        String str5 = this.LJLJJLL;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.LJLJL;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str6 = this.LJLJLJ;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.LJLJLLL;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.LJLL;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.LJLLI;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        java.util.Map<String, Object> map = this.LJLLILLLL;
        return hashCode11 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "CommentFragmentData(enterFrom=" + this.LJLIL + ", enterMethod=" + this.LJLILLLLZI + ", eventType=" + this.LJLJI + ", commentTag=" + this.LJLJJI + ", aweme=" + this.LJLJJL + ", pageType=" + this.LJLJJLL + ", isHotPlayer=" + this.LJLJL + ", lastGroupId=" + this.LJLJLJ + ", authorId=" + this.LJLJLLL + ", newsId=" + this.LJLL + ", videoFrom=" + this.LJLLI + ", additionalParams=" + this.LJLLILLLL + ')';
    }

    public final java.util.Map<String, Object> getAdditionalParams() {
        return this.LJLLILLLL;
    }

    public final String getAuthorId() {
        return this.LJLJLLL;
    }

    public final Aweme getAweme() {
        return this.LJLJJL;
    }

    public final String getCommentTag() {
        return this.LJLJJI;
    }

    public final String getEnterFrom() {
        return this.LJLIL;
    }

    public final String getEnterMethod() {
        return this.LJLILLLLZI;
    }

    public final String getEventType() {
        return this.LJLJI;
    }

    public final String getLastGroupId() {
        return this.LJLJLJ;
    }

    public final String getNewsId() {
        return this.LJLL;
    }

    public final String getPageType() {
        return this.LJLJJLL;
    }

    public final String getVideoFrom() {
        return this.LJLLI;
    }

    public final Boolean isHotPlayer() {
        return this.LJLJL;
    }

    public AnonymousClass707(String str, String str2, String str3, String str4, Aweme aweme, String str5, Boolean bool, String str6, String str7, String str8, String str9, java.util.Map<String, Object> map) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = str4;
        this.LJLJJL = aweme;
        this.LJLJJLL = str5;
        this.LJLJL = bool;
        this.LJLJLJ = str6;
        this.LJLJLLL = str7;
        this.LJLL = str8;
        this.LJLLI = str9;
        this.LJLLILLLL = map;
    }

    public /* synthetic */ AnonymousClass707(String str, String str2, String str3, String str4, Aweme aweme, String str5, Boolean bool, String str6, String str7, String str8, String str9, java.util.Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? null : aweme, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? "" : str6, (i & 256) != 0 ? "" : str7, (i & 512) != 0 ? "" : str8, (i & 1024) == 0 ? str9 : "", (i & 2048) == 0 ? map : null);
    }
}
