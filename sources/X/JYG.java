package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.model.FeedbackMultipleChoice;
import defpackage.q;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JYG implements Serializable {
    public String LJLIL;
    public UrlModel LJLILLLLZI;
    public String LJLJI;
    public List<FeedbackMultipleChoice> LJLJJI;
    public java.util.Map<String, String> LJLJJL;
    public String LJLJJLL;
    public String LJLJL;

    /* JADX WARN: Multi-variable type inference failed */
    public JYG() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ JYG copy$default(JYG jyg, String str, UrlModel urlModel, String str2, List list, java.util.Map map, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = jyg.LJLIL;
        }
        if ((i & 2) != 0) {
            urlModel = jyg.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            str2 = jyg.LJLJI;
        }
        if ((i & 8) != 0) {
            list = jyg.LJLJJI;
        }
        if ((i & 16) != 0) {
            map = jyg.LJLJJL;
        }
        if ((i & 32) != 0) {
            str3 = jyg.LJLJJLL;
        }
        if ((i & 64) != 0) {
            str4 = jyg.LJLJL;
        }
        return jyg.copy(str, urlModel, str2, list, map, str3, str4);
    }

    public final JYG copy(String str, UrlModel urlModel, String str2, List<FeedbackMultipleChoice> list, java.util.Map<String, String> map, String str3, String str4) {
        return new JYG(str, urlModel, str2, list, map, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JYG)) {
            return false;
        }
        JYG jyg = (JYG) obj;
        return o.LJ(this.LJLIL, jyg.LJLIL) && o.LJ(this.LJLILLLLZI, jyg.LJLILLLLZI) && o.LJ(this.LJLJI, jyg.LJLJI) && o.LJ(this.LJLJJI, jyg.LJLJJI) && o.LJ(this.LJLJJL, jyg.LJLJJL) && o.LJ(this.LJLJJLL, jyg.LJLJJLL) && o.LJ(this.LJLJL, jyg.LJLJL);
    }

    public int hashCode() {
        String str = this.LJLIL;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        UrlModel urlModel = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        String str2 = this.LJLJI;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<FeedbackMultipleChoice> list = this.LJLJJI;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        java.util.Map<String, String> map = this.LJLJJL;
        int hashCode5 = (hashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        String str3 = this.LJLJJLL;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJLJL;
        return hashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchFeedbackModel(feedbackType=");
        LIZ.append(this.LJLIL);
        LIZ.append(", imgCover=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", title=");
        LIZ.append(this.LJLJI);
        LIZ.append(", multipleChoices=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", logParams=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", awemeId=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", authorId=");
        return q.LIZIZ(LIZ, this.LJLJL, ')', LIZ);
    }

    public final String getAuthorId() {
        return this.LJLJL;
    }

    public final String getAwemeId() {
        return this.LJLJJLL;
    }

    public final String getFeedbackType() {
        return this.LJLIL;
    }

    public final UrlModel getImgCover() {
        return this.LJLILLLLZI;
    }

    public final java.util.Map<String, String> getLogParams() {
        return this.LJLJJL;
    }

    public final List<FeedbackMultipleChoice> getMultipleChoices() {
        return this.LJLJJI;
    }

    public final String getTitle() {
        return this.LJLJI;
    }

    public final void setAuthorId(String str) {
        this.LJLJL = str;
    }

    public final void setAwemeId(String str) {
        this.LJLJJLL = str;
    }

    public final void setFeedbackType(String str) {
        this.LJLIL = str;
    }

    public final void setImgCover(UrlModel urlModel) {
        this.LJLILLLLZI = urlModel;
    }

    public final void setLogParams(java.util.Map<String, String> map) {
        this.LJLJJL = map;
    }

    public final void setMultipleChoices(List<FeedbackMultipleChoice> list) {
        this.LJLJJI = list;
    }

    public final void setTitle(String str) {
        this.LJLJI = str;
    }

    public JYG(String str, UrlModel urlModel, String str2, List<FeedbackMultipleChoice> list, java.util.Map<String, String> map, String str3, String str4) {
        this.LJLIL = str;
        this.LJLILLLLZI = urlModel;
        this.LJLJI = str2;
        this.LJLJJI = list;
        this.LJLJJL = map;
        this.LJLJJLL = str3;
        this.LJLJL = str4;
    }

    public /* synthetic */ JYG(String str, UrlModel urlModel, String str2, List list, java.util.Map map, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : urlModel, (i & 4) == 0 ? str2 : "", (i & 8) != 0 ? null : list, (i & 16) != 0 ? new LinkedHashMap() : map, (i & 32) != 0 ? null : str3, (i & 64) == 0 ? str4 : null);
    }
}
