package Y;

import X.AnonymousClass745;
import X.C1794372l;
import X.C188067Zq;
import X.C219368jE;
import X.C41424GNo;
import X.C51029K0z;
import X.C73Z;
import X.C74V;
import X.C78886Uxe;
import X.C7HV;
import X.EF7;
import X.FMX;
import X.HG3;
import X.InterfaceC1797373p;
import X.RBX;
import X.V16;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.assem.share.VideoShareAssem;
import com.ss.android.ugc.aweme.feed.assem.share.VideoShareViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewListItemCell;
import com.ss.android.ugc.aweme.service.IAssistantService;
import com.ss.android.ugc.aweme.topic.review.list.TopicReviewCell;
import com.ss.android.ugc.aweme.watch.history.core.WatchHistoryListViewModel;
import com.ss.android.ugc.aweme.watch.history.ui.WatchHistoryItemCell;
import com.ss.android.ugc.tiktok.addyours.collection.AddYoursCollectionAbility;
import com.ss.android.ugc.tiktok.addyours.collection.AddYoursCollectionCellAssem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class IDCListenerS296S0100000_3 implements View.OnLongClickListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.$t) {
            case 0:
                return onLongClick$0(this, view);
            case 1:
                return onLongClick$1(this, view);
            case 2:
                return onLongClick$2(this, view);
            case 3:
                return onLongClick$3(this, view);
            case 4:
                return onLongClick$4(this, view);
            case 5:
                return onLongClick$5(this, view);
            case 6:
                return onLongClick$6(this, view);
            case 7:
                return onLongClick$7(this, view);
            case 8:
                return onLongClick$8(this, view);
            case 9:
                return onLongClick$9(this, view);
            case 10:
                return onLongClick$10(this, view);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return onLongClick$11(this, view);
            case 12:
                return onLongClick$12(this, view);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return onLongClick$13(this, view);
            default:
                return false;
        }
    }

    public IDCListenerS296S0100000_3(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onLongClick$0(IDCListenerS296S0100000_3 iDCListenerS296S0100000_3, View view) {
        ((TopicReviewCell) iDCListenerS296S0100000_3.l0).P();
        return true;
    }

    public static final boolean onLongClick$1(IDCListenerS296S0100000_3 iDCListenerS296S0100000_3, View view) {
        ((TopicReviewCell) iDCListenerS296S0100000_3.l0).P();
        return true;
    }

    public static final boolean onLongClick$10(IDCListenerS296S0100000_3 iDCListenerS296S0100000_3, View view) {
        ((PoiReviewListItemCell) iDCListenerS296S0100000_3.l0).Q();
        return true;
    }

    public static final boolean onLongClick$11(IDCListenerS296S0100000_3 iDCListenerS296S0100000_3, View view) {
        C73Z c73z = (C73Z) iDCListenerS296S0100000_3.l0;
        c73z.getClass();
        ArrayList arrayList = new ArrayList();
        if (!C78886Uxe.LJJJJJL(c73z.LJLLLL)) {
            String string = c73z.LJLILLLLZI.getString(R.string.dw4);
            o.LJIIIIZZ(string, "fragment.getString(R.string.copy)");
            arrayList.add(string);
        }
        String string2 = c73z.LJLILLLLZI.getString(R.string.efd);
        o.LJIIIIZZ(string2, "fragment.getString(R.string.delete)");
        arrayList.add(string2);
        if (TextUtils.equals(Comment.getAuthorUid(c73z.LJLLLL), ((RBX) HG3.LJIILL()).getCurUserId()) && V16.LJJIZ(c73z.LJLLLL)) {
            String string3 = c73z.LJLILLLLZI.getString(C7HV.LIZIZ.LJIIJ(R.string.ptn, R.string.q2m));
            o.LJIIIIZZ(string3, "fragment.getString(getUpvoteStringRes())");
            arrayList.add(string3);
        }
        C41424GNo c41424GNo = new C41424GNo(c73z.LJLILLLLZI.mo49getActivity());
        c41424GNo.LIZ((CharSequence[]) arrayList.toArray(new String[0]), new IDCListenerS47S0200000_3(arrayList, c73z, 10));
        c73z.LJLZ = c41424GNo.LIZIZ();
        return true;
    }

    public static final boolean onLongClick$12(IDCListenerS296S0100000_3 iDCListenerS296S0100000_3, View view) {
        Comment comment;
        AnonymousClass745 anonymousClass745 = (AnonymousClass745) iDCListenerS296S0100000_3.l0;
        InterfaceC1797373p interfaceC1797373p = anonymousClass745.LLF;
        if (interfaceC1797373p != null && (comment = anonymousClass745.LLFF) != null) {
            ((CommentListFragment) interfaceC1797373p).Cn(anonymousClass745.LLFFF, comment, null);
            return true;
        }
        return true;
    }

    public static final boolean onLongClick$13(IDCListenerS296S0100000_3 iDCListenerS296S0100000_3, View view) {
        IAssistantService iAssistantService = (IAssistantService) ServiceManager.get().getService(IAssistantService.class);
        if (iAssistantService != null) {
            Context context = ((C1794372l) iDCListenerS296S0100000_3.l0).LJLIL.getContext();
            o.LJIIIIZZ(context, "item.context");
            iAssistantService.openPage(context);
            return true;
        }
        return true;
    }

    public static final boolean onLongClick$2(IDCListenerS296S0100000_3 iDCListenerS296S0100000_3, View view) {
        ((PoiReviewListItemCell) iDCListenerS296S0100000_3.l0).Q();
        return true;
    }

    public static final boolean onLongClick$3(IDCListenerS296S0100000_3 iDCListenerS296S0100000_3, View view) {
        ((PoiReviewListItemCell) iDCListenerS296S0100000_3.l0).Q();
        return true;
    }

    public static final boolean onLongClick$4(IDCListenerS296S0100000_3 iDCListenerS296S0100000_3, View view) {
        ((PoiReviewListItemCell) iDCListenerS296S0100000_3.l0).Q();
        return true;
    }

    public static final boolean onLongClick$5(IDCListenerS296S0100000_3 iDCListenerS296S0100000_3, View view) {
        C188067Zq item = ((WatchHistoryItemCell) iDCListenerS296S0100000_3.l0).getItem();
        if (item != null) {
            WatchHistoryListViewModel watchHistoryListViewModel = (WatchHistoryListViewModel) ((WatchHistoryItemCell) iDCListenerS296S0100000_3.l0).LJLILLLLZI.getValue();
            if (!watchHistoryListViewModel.LJLJI) {
                watchHistoryListViewModel.setState(new AqS169S0100000_3(item, 722));
                return true;
            }
            return true;
        }
        return true;
    }

    public static final boolean onLongClick$6(IDCListenerS296S0100000_3 iDCListenerS296S0100000_3, View view) {
        AddYoursCollectionAbility addYoursCollectionAbility = (AddYoursCollectionAbility) ((AddYoursCollectionCellAssem) iDCListenerS296S0100000_3.l0).LLII.getValue();
        if (addYoursCollectionAbility != null) {
            addYoursCollectionAbility.ek0((C219368jE) C51029K0z.LJIILLIIL((AddYoursCollectionCellAssem) iDCListenerS296S0100000_3.l0));
            return true;
        }
        return true;
    }

    public static final boolean onLongClick$7(IDCListenerS296S0100000_3 iDCListenerS296S0100000_3, View view) {
        Aweme aweme;
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        DataCenter dataCenter = ((VideoItemParams) C51029K0z.LJIILLIIL((VideoShareAssem) iDCListenerS296S0100000_3.l0)).dataCenter;
        if (dataCenter != null) {
            dataCenter.jv0(iArr, "video_share_button_long_click");
        }
        VideoShareViewModel z4 = ((VideoShareAssem) iDCListenerS296S0100000_3.l0).z4();
        VideoItemParams gv0 = z4.gv0();
        if (gv0 == null || (aweme = gv0.getAweme()) == null) {
            return true;
        }
        EF7.LIZIZ();
        String aid = aweme.getAid();
        HashMap hashMap = new HashMap();
        String str = z4.LJLJI;
        if (str == null) {
            str = "";
        }
        hashMap.put("enter_from", str);
        hashMap.put("follow_status", String.valueOf(aweme.getFollowStatus()));
        String groupId = aweme.getGroupId();
        o.LJIIIIZZ(groupId, "aweme.groupId");
        hashMap.put("group_id", groupId);
        String authorUid = aweme.getAuthorUid();
        o.LJIIIIZZ(authorUid, "aweme.authorUid");
        hashMap.put("author_id", authorUid);
        FMX.LJI(0L, "long_press_more_button", "homepage_hot", aid, new JSONObject(hashMap));
        return true;
    }

    public static final boolean onLongClick$8(IDCListenerS296S0100000_3 iDCListenerS296S0100000_3, View view) {
        View view2 = ((C74V) iDCListenerS296S0100000_3.l0).LJIIIIZZ;
        if (view2 == null || !view2.performLongClick()) {
            return false;
        }
        return true;
    }

    public static final boolean onLongClick$9(IDCListenerS296S0100000_3 iDCListenerS296S0100000_3, View view) {
        ((PoiReviewListItemCell) iDCListenerS296S0100000_3.l0).Q();
        return true;
    }
}
