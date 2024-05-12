package Y;

import X.ActivityC45651qj;
import X.C120974ov;
import X.C1794072i;
import X.C1806477c;
import X.C1806677e;
import X.C45804HyK;
import X.C78847Ux1;
import X.C7BQ;
import X.C7DS;
import X.ORZ;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.aweme.nows.service.NowsTabServiceImpl;
import com.ss.android.ugc.aweme.service.INowsTabService;
import com.ss.android.ugc.aweme.tag.FeedTaggedListCell;
import com.ss.android.ugc.aweme.tag.viewmodel.FeedTaggedListViewModel;
import com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AqS57S1100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class IDCListenerS114S0200000_3 implements View.OnAttachStateChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewAttachedToWindow$0(this, view);
                return;
            case 1:
                onViewAttachedToWindow$1(this, view);
                return;
            default:
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.$t) {
            case 0:
                o.LJIIIZ(view, "v");
                return;
            case 1:
                o.LJIIIZ(view, "v");
                return;
            default:
                return;
        }
    }

    public static final void onViewAttachedToWindow$0(IDCListenerS114S0200000_3 iDCListenerS114S0200000_3, View v) {
        o.LJIIIZ(v, "v");
        FeedTaggedListViewModel M = ((FeedTaggedListCell) iDCListenerS114S0200000_3.l0).M();
        String uid = ((C7BQ) iDCListenerS114S0200000_3.l1).LJLIL.getUid();
        o.LJIIIIZZ(uid, "item.user.uid");
        M.getClass();
        if (!M.LJLILLLLZI.contains(uid)) {
            M.LJLILLLLZI.add(uid);
            C7DS.LIZIZ("show_tagged_user", new AqS57S1100000_3(uid, M, 27));
        }
    }

    public static final void onViewAttachedToWindow$1(IDCListenerS114S0200000_3 iDCListenerS114S0200000_3, View v) {
        ActivityC45651qj activityC45651qj;
        String str;
        String str2;
        String str3;
        int i;
        String aid;
        String str4;
        NowPostInfo nowPostInfo;
        Context context;
        o.LJIIIZ(v, "v");
        INowsTabService LJJIIJ = NowsTabServiceImpl.LJJIIJ();
        View view = ((C1806677e) iDCListenerS114S0200000_3.l0).LIZLLL;
        String str5 = null;
        if (view != null && (context = view.getContext()) != null) {
            activityC45651qj = C45804HyK.LJJIFFI(context);
        } else {
            activityC45651qj = null;
        }
        int LJFF = LJJIIJ.LJFF(activityC45651qj, ((C1806477c) iDCListenerS114S0200000_3.l1).LJLIL);
        C1806477c c1806477c = (C1806477c) iDCListenerS114S0200000_3.l1;
        Aweme aweme = c1806477c.LJLIL;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        NowFeedMobHierarchyData nowFeedMobHierarchyData = ((C1806477c) iDCListenerS114S0200000_3.l1).LJLILLLLZI;
        if (nowFeedMobHierarchyData == null || (str2 = nowFeedMobHierarchyData.getEnterFrom()) == null) {
            str2 = "";
        }
        Aweme aweme2 = ((C1806477c) iDCListenerS114S0200000_3.l1).LJLIL;
        if (aweme2 != null && (nowPostInfo = aweme2.nowPostInfo) != null) {
            str3 = nowPostInfo.getNowMediaType();
        } else {
            str3 = null;
        }
        Aweme aweme3 = ((C1806477c) iDCListenerS114S0200000_3.l1).LJLIL;
        if (aweme3 != null) {
            i = C78847Ux1.LJJIJIIJI(aweme3);
        } else {
            i = 1;
        }
        Map<String, Set<String>> map = C120974ov.LIZ;
        Iterable iterable = (Iterable) ((LinkedHashMap) map).get(str);
        if (iterable != null) {
            Aweme aweme4 = c1806477c.LJLIL;
            if (aweme4 != null) {
                str4 = aweme4.getAid();
            } else {
                str4 = null;
            }
            if (ORZ.LJLJJI(str4, iterable)) {
                return;
            }
        }
        if (!map.containsKey(str)) {
            map.put(str, new LinkedHashSet());
        }
        Set set = (Set) ((LinkedHashMap) map).get(str);
        Aweme aweme5 = c1806477c.LJLIL;
        if (aweme5 != null) {
            str5 = aweme5.getAuthorUid();
        }
        C1794072i.LJIIIIZZ(str2, "caption", LJFF, i, str5, str3);
        Aweme aweme6 = c1806477c.LJLIL;
        if (aweme6 == null || (aid = aweme6.getAid()) == null || set == null) {
            return;
        }
        set.add(aid);
    }

    public IDCListenerS114S0200000_3(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
