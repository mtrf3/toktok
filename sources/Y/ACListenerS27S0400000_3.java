package Y;

import X.ActivityC45651qj;
import X.C113554cx;
import X.C1794072i;
import X.C188727au;
import X.C223928qa;
import X.C223948qc;
import X.C34K;
import X.C78847Ux1;
import X.EnumC1806777f;
import X.FMX;
import X.InterfaceC178306zC;
import X.InterfaceC88472Yns;
import android.content.Context;
import android.view.View;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.WikipediaInfo;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.aweme.nows.service.NowsTabServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData;
import com.ss.android.ugc.now.interaction.assem.BubbleReactionCell;
import com.ss.android.ugc.now.interaction.assem.LikeItem;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class ACListenerS27S0400000_3 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            case 3:
                onClick$3(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS27S0400000_3 aCListenerS27S0400000_3, View view) {
        InterfaceC178306zC interfaceC178306zC = (InterfaceC178306zC) aCListenerS27S0400000_3.l0;
        if (interfaceC178306zC != null) {
            interfaceC178306zC.LIZIZ();
        }
        C188727au c188727au = (C188727au) aCListenerS27S0400000_3.l1;
        c188727au.LJFF(Boolean.valueOf(((C34K) aCListenerS27S0400000_3.l2).element), "if_click_cg");
        FMX.LJIIL("comment_rethink_post_ck", c188727au.LIZ);
        ((TuxSheet) aCListenerS27S0400000_3.l3).dismiss();
    }

    public static final void onClick$1(ACListenerS27S0400000_3 aCListenerS27S0400000_3, View view) {
        InterfaceC178306zC interfaceC178306zC = (InterfaceC178306zC) aCListenerS27S0400000_3.l0;
        if (interfaceC178306zC != null) {
            interfaceC178306zC.LIZ();
        }
        C188727au c188727au = (C188727au) aCListenerS27S0400000_3.l1;
        c188727au.LJFF(Boolean.valueOf(((C34K) aCListenerS27S0400000_3.l2).element), "if_click_cg");
        FMX.LJIIL("comment_rethink_edit_ck", c188727au.LIZ);
        ((TuxSheet) aCListenerS27S0400000_3.l3).dismiss();
    }

    public static final void onClick$2(ACListenerS27S0400000_3 aCListenerS27S0400000_3, View view) {
        String str;
        int i;
        NowPostInfo nowPostInfo;
        String str2 = null;
        int LJIIJ = NowsTabServiceImpl.LJJIIJ().LJIIJ((ActivityC45651qj) ((BubbleReactionCell) aCListenerS27S0400000_3.l0).itemView.getContext(), ((LikeItem) aCListenerS27S0400000_3.l1).getAweme(), (NowFeedMobHierarchyData) aCListenerS27S0400000_3.l2, EnumC1806777f.REACTION, null);
        NowFeedMobHierarchyData nowFeedMobHierarchyData = (NowFeedMobHierarchyData) aCListenerS27S0400000_3.l2;
        if (nowFeedMobHierarchyData != null) {
            str = nowFeedMobHierarchyData.getEnterFrom();
        } else {
            str = null;
        }
        String uid = ((User) aCListenerS27S0400000_3.l3).getUid();
        Aweme aweme = ((LikeItem) aCListenerS27S0400000_3.l1).getAweme();
        if (aweme != null && (nowPostInfo = aweme.nowPostInfo) != null) {
            str2 = nowPostInfo.getNowMediaType();
        }
        Aweme aweme2 = ((LikeItem) aCListenerS27S0400000_3.l1).getAweme();
        if (aweme2 != null) {
            i = C78847Ux1.LJJIJIIJI(aweme2);
        } else {
            i = 1;
        }
        C1794072i.LIZ(LJIIJ, i, str, uid, str2, "click_head", "reaction");
    }

    public static final void onClick$3(ACListenerS27S0400000_3 aCListenerS27S0400000_3, View view) {
        ((InterfaceC88472Yns) aCListenerS27S0400000_3.l0).invoke((WikipediaInfo) aCListenerS27S0400000_3.l1);
        Context context = ((C223948qc) aCListenerS27S0400000_3.l2).itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        C223928qa.LIZ(context, (WikipediaInfo) aCListenerS27S0400000_3.l1, (Map) aCListenerS27S0400000_3.l3, C113554cx.LJJJLIIL());
    }

    public ACListenerS27S0400000_3(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
