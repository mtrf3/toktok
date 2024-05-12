package com.ss.android.ugc.aweme.shortvideo.eventtrack;

import X.C00F;
import X.C32I;
import X.C42310Gj4;
import X.C42802Gr0;
import X.C44172HVg;
import X.C76W;
import X.FMX;
import X.G9Z;
import X.GVN;
import androidx.lifecycle.ViewModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.creative.model.common.LogPbBean;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.model.RecommendWordMob;
import com.ss.android.ugc.aweme.video.hashtag.helper.BaseTitleHelper;
import com.ss.android.ugc.gamora.editor.recommendhashtag.RecommendHashtag;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HashTagMobHelper extends ViewModel {
    public String LJLIL;
    public LogPbBean LJLILLLLZI;
    public RecommendWordMob LJLJI;
    public String LJLJJI;
    public BaseTitleHelper LJLJJL;
    public List<? extends C42802Gr0> LJLJJLL;
    public boolean LJLJL;
    public String LJLJLJ;

    public static String gv0(List list) {
        Object next;
        if (list != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((RecommendHashtag) it.next()).getChallengeName());
            }
            Iterator it2 = arrayList.iterator();
            if (!it2.hasNext()) {
                next = null;
            } else {
                next = it2.next();
                while (it2.hasNext()) {
                    next = C00F.LIZIZ((String) next, ',', (String) it2.next());
                }
            }
            String str = (String) next;
            if (str != null) {
                return str;
            }
        }
        return "";
    }

    public final void iv0(C42310Gj4 c42310Gj4) {
        String str;
        String str2;
        Integer num;
        C76W c76w = new C76W();
        String str3 = c42310Gj4.LIZJ;
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        c76w.LIZ("enter_method", str3);
        String str5 = c42310Gj4.LIZLLL;
        if (str5 == null) {
            str5 = "";
        }
        c76w.LIZ("tag_id", str5);
        c76w.LIZ("tag_source", c42310Gj4.LJFF);
        c76w.LIZ("tag_content", c42310Gj4.LIZ);
        c76w.LIZ("rank", String.valueOf(c42310Gj4.LIZIZ));
        c76w.LIZ("creation_id", this.LJLIL);
        String str6 = c42310Gj4.LJ;
        if (str6 == null) {
            str6 = "";
        }
        c76w.LIZ("query_id", str6);
        BaseTitleHelper baseTitleHelper = this.LJLJJL;
        if (baseTitleHelper != null) {
            str = baseTitleHelper.LJLIL;
        } else {
            str = null;
        }
        c76w.LIZ("title", str);
        c76w.LIZ("log_id", c42310Gj4.LJI);
        if (G9Z.LIZ != null) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c76w.LIZ("after_post", str2);
        GVN gvn = G9Z.LIZ;
        if (gvn != null && (num = gvn.LIZLLL) != null) {
            c76w.LIZ("aweme_type", String.valueOf(num.intValue()));
        }
        String str7 = this.LJLJJI;
        if (str7 == null) {
            str7 = "";
        }
        c76w.LIZ("search_keyword", str7);
        LogPbBean logPbBean = this.LJLILLLLZI;
        if (logPbBean != null) {
            str4 = GsonProtectorUtils.toJson(C44172HVg.LIZIZ, logPbBean);
        }
        c76w.LIZ("log_pb", str4);
        FMX.LJIILJJIL("add_tag", c76w.LIZIZ());
    }

    public final void jv0(String str) {
        String str2;
        if (o.LJ(str, "click_tag_button")) {
            this.LJLJL = true;
        } else if (this.LJLJL) {
            this.LJLJL = false;
            return;
        }
        BaseTitleHelper baseTitleHelper = this.LJLJJL;
        if (baseTitleHelper != null) {
            baseTitleHelper.gv0();
        }
        this.LJLJLJ = str;
        C76W c76w = new C76W();
        BaseTitleHelper baseTitleHelper2 = this.LJLJJL;
        if (baseTitleHelper2 != null) {
            str2 = baseTitleHelper2.LJLIL;
        } else {
            str2 = null;
        }
        c76w.LIZ("title", str2);
        c76w.LIZ("creation_id", this.LJLIL);
        c76w.LIZ("enter_method", str);
        FMX.LJIILJJIL("show_tag", c76w.LIZIZ());
    }

    public final void kv0(C42310Gj4 c42310Gj4) {
        String str;
        C76W c76w = new C76W();
        c76w.LIZ("enter_method", c42310Gj4.LIZJ);
        c76w.LIZ("tag_id", c42310Gj4.LIZLLL);
        c76w.LIZ("tag_source", c42310Gj4.LJFF);
        c76w.LIZ("tag_content", c42310Gj4.LIZ);
        c76w.LIZ("rank", String.valueOf(c42310Gj4.LIZIZ));
        c76w.LIZ("creation_id", this.LJLIL);
        String str2 = c42310Gj4.LJ;
        if (str2 == null) {
            str2 = "";
        }
        c76w.LIZ("query_id", str2);
        BaseTitleHelper baseTitleHelper = this.LJLJJL;
        if (baseTitleHelper != null) {
            str = baseTitleHelper.LJLIL;
        } else {
            str = null;
        }
        c76w.LIZ("title", str);
        c76w.LIZ("log_id", c42310Gj4.LJI);
        FMX.LJIILJJIL("show_tag_words", c76w.LIZIZ());
    }

    public final void hv0(String str, C42802Gr0 c42802Gr0, Integer num, String str2) {
        String str3 = str2;
        if (c42802Gr0 != null && num != null) {
            num.intValue();
            String cid = c42802Gr0.LIZ.getCid();
            String str4 = c42802Gr0.LIZ.challengeName;
            if (str4 == null) {
                str4 = "";
            }
            if (str3 == null) {
                str3 = c42802Gr0.LJFF;
            }
            o.LJIIIIZZ(str3, "tagSource ?: item.tagSource");
            iv0(new C42310Gj4(str4, str, cid, str3, num));
        }
    }
}
