package X;

import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7ah, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C188597ah {
    public static final void LIZ(Aweme aweme, String str) {
        Object obj;
        if (aweme == null) {
            return;
        }
        boolean z = false;
        if ((o.LJ(str, "homepage_hot") || o.LJ(str, "homepage_follow") || o.LJ(str, "homepage_popular") || o.LJ(str, "homepage_nearby") || o.LJ(str, "homepage_friends")) && !C188587ag.LJFF(aweme)) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", str);
            c188727au.LJIIIZ("group_id", aweme.getAid());
            c188727au.LJIIIZ("author_id", aweme.getAuthorUid());
            c188727au.LJIIIZ("rec_type", C188587ag.LIZLLL(aweme));
            c188727au.LJIIIZ("label_text", "");
            if (!C188587ag.LJI(aweme)) {
                c188727au.LJIIIZ("is_avatar", C182617Er.LIZ());
                MutualStruct LIZIZ = C188587ag.LIZIZ(aweme);
                if (LIZIZ != null) {
                    obj = Integer.valueOf(LIZIZ.getTotal());
                } else {
                    obj = Boolean.FALSE;
                }
                c188727au.LJFF(obj, "maf_num");
            }
            FMX.LJIIL("show_label", c188727au.LIZ);
            return;
        }
        RelationDynamicLabel relationLabel = aweme.getRelationLabel();
        if (relationLabel != null) {
            z = relationLabel.isValid();
        }
        if (aweme.getRelationLabel() == null || !z) {
            return;
        }
        MobClick LIZLLL = C1I1.LIZLLL("show", "like_banner");
        LIZLLL.setValue(aweme.getAid());
        LIZLLL.setExtValueString(((RBX) HG3.LJIILL()).getCurUserId());
        FMX.onEvent(LIZLLL);
    }

    public static final void LIZIZ(String str, Aweme aweme, List<String> tags) {
        String abstractCollection;
        String str2;
        String LLD;
        String str3;
        o.LJIIIZ(tags, "tags");
        if (aweme == null) {
            return;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LJIIIZ("group_id", aweme.getAid());
        c188727au.LJIIIZ("author_id", aweme.getAuthorUid());
        c188727au.LJIIIZ("aweme_type", String.valueOf(aweme.getAwemeType()));
        if (aweme.isLive()) {
            abstractCollection = CardStruct.IStatusCode.DEFAULT;
        } else {
            ArrayList arrayList = new ArrayList(C32I.LJJL(tags, 10));
            Iterator<String> it = tags.iterator();
            while (it.hasNext()) {
                C188607ai c188607ai = C8QB.LIZ.get(it.next());
                if (c188607ai != null) {
                    str2 = c188607ai.LIZIZ;
                } else {
                    str2 = null;
                }
                arrayList.add(str2);
            }
            abstractCollection = arrayList.toString();
        }
        c188727au.LJIIIZ("tag_code", abstractCollection);
        if (aweme.isLive()) {
            LLD = "relationship";
        } else {
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(tags, 10));
            Iterator<String> it2 = tags.iterator();
            while (it2.hasNext()) {
                C188607ai c188607ai2 = C8QB.LIZ.get(it2.next());
                if (c188607ai2 != null) {
                    str3 = c188607ai2.LIZ;
                } else {
                    str3 = null;
                }
                arrayList2.add(str3);
            }
            LLD = ORZ.LLD(arrayList2, null, null, null, null, 63);
        }
        c188727au.LJIIIZ("tag_type", LLD);
        c188727au.LJIIIZ("tag_number", String.valueOf(tags.size()));
        FMX.LJIIL("show_core_fdmt_tag", c188727au.LIZ);
    }
}
