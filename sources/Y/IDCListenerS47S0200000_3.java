package Y;

import X.ARI;
import X.C174366sq;
import X.C175536uj;
import X.C175746v4;
import X.C175776v7;
import X.C175786v8;
import X.C176286vw;
import X.C178116yt;
import X.C187197Wh;
import X.C200207tQ;
import X.C26045AKb;
import X.C26227ARb;
import X.C26231ARf;
import X.C3AW;
import X.C50420Jqa;
import X.C58704N2e;
import X.C73Z;
import X.C74Z;
import X.C76732zl;
import X.C7C4;
import X.C7HV;
import X.C8BR;
import X.FMX;
import X.HG3;
import X.InterfaceC72642tA;
import X.InterfaceC88472Yns;
import X.NN1;
import X.OHI;
import X.RBX;
import X.X1D;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment;
import com.ss.android.ugc.aweme.comment.commentlist.api.CommentBatchManagementApi;
import com.ss.android.ugc.aweme.comment.commentlist.managementv2.CommentManagementAssemVM;
import com.ss.android.ugc.aweme.comment.commentlist.managementv2.CommentManagementBottomBarAssem;
import com.ss.android.ugc.aweme.comment.commentlist.viewmodel.CommentBatchManagementViewModel;
import com.ss.android.ugc.aweme.comment.detailpage.ui.CommentInputFragment;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.locationservices.GPSPermissionCell;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.locationservices.LocationServicesVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.DeleteFragment;
import com.ss.android.ugc.aweme.fullpagev3.assem.FullPageBottomActionBarAssem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AqS4S0002000_3;
import kotlin.jvm.internal.AqS54S0201000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class IDCListenerS47S0200000_3 implements DialogInterface.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.$t) {
            case 0:
                onClick$0(this, dialogInterface, i);
                return;
            case 1:
                onClick$1(this, dialogInterface, i);
                return;
            case 2:
                onClick$2(this, dialogInterface, i);
                return;
            case 3:
                onClick$3(this, dialogInterface, i);
                return;
            case 4:
                onClick$4(this, dialogInterface, i);
                return;
            case 5:
                onClick$5(this, dialogInterface, i);
                return;
            case 6:
                onClick$6(this, dialogInterface, i);
                return;
            case 7:
                onClick$7(this, dialogInterface, i);
                return;
            case 8:
                onClick$8(this, dialogInterface, i);
                return;
            case 9:
                onClick$9(this, dialogInterface, i);
                return;
            case 10:
                onClick$10(this, dialogInterface, i);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onClick$11(this, dialogInterface, i);
                return;
            default:
                return;
        }
    }

    public IDCListenerS47S0200000_3(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onClick$0(IDCListenerS47S0200000_3 iDCListenerS47S0200000_3, DialogInterface dialog, int i) {
        int i2;
        C174366sq c174366sq;
        String enterFrom;
        String uid;
        int i3;
        C174366sq c174366sq2;
        String enterFrom2;
        String uid2;
        o.LJIIIZ(dialog, "dialog");
        dialog.dismiss();
        String str = "";
        if (i == 0) {
            CommentManagementBottomBarAssem commentManagementBottomBarAssem = (CommentManagementBottomBarAssem) iDCListenerS47S0200000_3.l0;
            if (commentManagementBottomBarAssem.getContext() == null) {
                return;
            }
            CommentManagementAssemVM I3 = commentManagementBottomBarAssem.I3();
            C175536uj H3 = commentManagementBottomBarAssem.H3();
            I3.getClass();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            HashSet hashSet = new HashSet();
            String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
            Map<String, Comment> map = I3.LJLILLLLZI;
            Map<String, Comment> map2 = I3.LJLIL;
            HashMap hashMap = (HashMap) map;
            hashMap.clear();
            Iterator it = ((HashMap) map2).entrySet().iterator();
            int i4 = 0;
            while (it.hasNext()) {
                Comment comment = (Comment) ((Map.Entry) it.next()).getValue();
                if (comment.getUser() == null) {
                    uid2 = "";
                } else {
                    uid2 = comment.getUser().getUid();
                }
                String cid = comment.getCid();
                if (!TextUtils.equals(curUserId, uid2)) {
                    arrayList.add(cid);
                    arrayList2.add(uid2);
                    o.LJIIIIZZ(uid2, "uid");
                    hashSet.add(uid2);
                    o.LJIIIIZZ(cid, "cid");
                    hashMap.put(cid, comment);
                }
                if (comment.getAliasAweme() != null) {
                    i4++;
                }
            }
            if (hashMap.isEmpty()) {
                I3.setState(C175786v8.LJLIL);
                return;
            }
            int size = arrayList.size();
            int size2 = hashSet.size();
            if (H3 != null && (c174366sq2 = H3.LJLIL) != null && (enterFrom2 = c174366sq2.getEnterFrom()) != null) {
                str = enterFrom2;
            }
            C74Z.LJIILL(size, size2, i4, str);
            if (C176286vw.LIZ().length == 3) {
                i3 = C176286vw.LIZ()[1];
            } else {
                i3 = 100;
            }
            if (size > i3) {
                I3.setState(new AqS4S0002000_3(size, i3, 2));
                return;
            }
            if (size <= 0) {
                return;
            }
            HashSet hashSet2 = new HashSet();
            HashMap hashMap2 = new HashMap();
            int i5 = 0;
            for (Map.Entry entry : hashMap.entrySet()) {
                Object key = entry.getKey();
                Comment comment2 = (Comment) entry.getValue();
                if (comment2.getCommentType() == 1) {
                    hashSet2.add(key);
                    i5 += (int) (comment2.getReplyCommentTotal() + 1);
                } else if (comment2.getCommentType() == 2) {
                    String replyId = comment2.getReplyId();
                    o.LJIIIIZZ(replyId, "comment.replyId");
                    hashMap2.put(key, replyId);
                }
            }
            Iterator it2 = hashMap2.entrySet().iterator();
            while (it2.hasNext()) {
                if (!hashSet2.contains(((Map.Entry) it2.next()).getValue())) {
                    i5++;
                }
            }
            I3.LJLJI = i5;
            I3.setState(new C175746v4(arrayList, arrayList2, hashSet, size, i4));
            return;
        }
        CommentManagementBottomBarAssem commentManagementBottomBarAssem2 = (CommentManagementBottomBarAssem) iDCListenerS47S0200000_3.l0;
        if (commentManagementBottomBarAssem2.getContext() == null) {
            return;
        }
        CommentManagementAssemVM I32 = commentManagementBottomBarAssem2.I3();
        C175536uj H32 = commentManagementBottomBarAssem2.H3();
        Map<String, Comment> map3 = I32.LJLIL;
        HashSet hashSet3 = new HashSet();
        String curUserId2 = ((RBX) HG3.LJIILL()).getCurUserId();
        HashMap hashMap3 = (HashMap) I32.LJLILLLLZI;
        hashMap3.clear();
        C76732zl c76732zl = new C76732zl();
        Iterator it3 = ((HashMap) map3).entrySet().iterator();
        while (it3.hasNext()) {
            Comment comment3 = (Comment) ((Map.Entry) it3.next()).getValue();
            if (comment3.getUser() == null) {
                uid = "";
            } else {
                uid = comment3.getUser().getUid();
            }
            if (!TextUtils.equals(curUserId2, uid)) {
                o.LJIIIIZZ(uid, "uid");
                hashSet3.add(uid);
                String cid2 = comment3.getCid();
                o.LJIIIIZZ(cid2, "comment.cid");
                hashMap3.put(cid2, comment3);
            }
            if (comment3.getAliasAweme() != null) {
                c76732zl.element++;
            }
        }
        if (hashMap3.isEmpty()) {
            I32.setState(C175776v7.LJLIL);
            return;
        }
        int size3 = hashSet3.size();
        int size4 = hashSet3.size();
        int i6 = c76732zl.element;
        if (H32 != null && (c174366sq = H32.LJLIL) != null && (enterFrom = c174366sq.getEnterFrom()) != null) {
            str = enterFrom;
        }
        C74Z.LJIIJ(size3, size4, i6, str);
        if (C176286vw.LIZ().length == 3) {
            i2 = C176286vw.LIZ()[2];
        } else {
            i2 = 100;
        }
        if (size3 > i2) {
            I32.setState(new AqS4S0002000_3(size3, i2, 0));
        } else {
            if (hashSet3.size() <= 0) {
                return;
            }
            I32.setState(new AqS54S0201000_3((Set) hashSet3, (Set<String>) size3, (int) c76732zl, (C76732zl) 0));
            FMX.onEventV3("comment_batch_management_block_confirm_sw");
        }
    }

    public static final void onClick$1(IDCListenerS47S0200000_3 iDCListenerS47S0200000_3, DialogInterface dialogInterface, int i) {
        Context context = (Context) iDCListenerS47S0200000_3.l0;
        Aweme aweme = (Aweme) iDCListenerS47S0200000_3.l1;
        NN1.LJJJJI(context, "click_open_url_window_cancel", aweme, NN1.LJIIIZ(context, aweme));
        C58704N2e.LIZLLL("draw_ad", "click_open_url_window_cancel", aweme.getAwemeRawAd()).LJII();
        dialogInterface.dismiss();
    }

    public static final void onClick$10(IDCListenerS47S0200000_3 iDCListenerS47S0200000_3, DialogInterface dialogInterface, int i) {
        C73Z c73z;
        Comment comment;
        dialogInterface.dismiss();
        String str = (String) ListProtector.get((List) iDCListenerS47S0200000_3.l0, i);
        if (TextUtils.equals(str, ((C73Z) iDCListenerS47S0200000_3.l1).LJLILLLLZI.getString(R.string.dw4))) {
            C73Z c73z2 = (C73Z) iDCListenerS47S0200000_3.l1;
            Comment comment2 = c73z2.LJLLLL;
            if (comment2 != null) {
                ((CommentListFragment) c73z2.LJLJI).em(comment2);
                return;
            }
            return;
        }
        if (TextUtils.equals(str, ((C73Z) iDCListenerS47S0200000_3.l1).LJLILLLLZI.getString(R.string.efd))) {
            C73Z c73z3 = (C73Z) iDCListenerS47S0200000_3.l1;
            Comment comment3 = c73z3.LJLLLL;
            if (comment3 == null) {
                return;
            }
            ((CommentListFragment) c73z3.LJLJI).hm(comment3);
            return;
        }
        if (!TextUtils.equals(str, ((C73Z) iDCListenerS47S0200000_3.l1).LJLILLLLZI.getString(C7HV.LIZIZ.LJIIJ(R.string.ptn, R.string.q2m))) || (comment = (c73z = (C73Z) iDCListenerS47S0200000_3.l1).LJLLLL) == null) {
            return;
        }
        ((CommentListFragment) c73z.LJLJI).ao(comment);
    }

    public static final void onClick$11(IDCListenerS47S0200000_3 iDCListenerS47S0200000_3, DialogInterface dialogInterface, int i) {
        InterfaceC72642tA<C50420Jqa> interfaceC72642tA = ((DeleteFragment) iDCListenerS47S0200000_3.l0).LJLILLLLZI;
        if (interfaceC72642tA != null) {
            interfaceC72642tA.onInternalEvent(new C50420Jqa(2, (Aweme) iDCListenerS47S0200000_3.l1));
        }
    }

    public static final void onClick$2(IDCListenerS47S0200000_3 iDCListenerS47S0200000_3, DialogInterface dialogInterface, int i) {
        OHI ohi = OHI.LIZ;
        Context context = ((GPSPermissionCell) iDCListenerS47S0200000_3.l0).itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        ohi.getClass();
        OHI.LJIIIIZZ(context, "android.permission.ACCESS_COARSE_LOCATION");
        LocationServicesVM locationServicesVM = (LocationServicesVM) iDCListenerS47S0200000_3.l1;
        locationServicesVM.getClass();
        locationServicesVM.LJLJJI.put(locationServicesVM.LJLIL, "system_location_setting_off_result");
        locationServicesVM.LJLJJI.put(locationServicesVM.LJLILLLLZI, "click_gps_never");
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0181, code lost:
    
        if (android.text.TextUtils.equals(r2, r0) != false) goto L96;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onClick$3(Y.IDCListenerS47S0200000_3 r4, android.content.DialogInterface r5, int r6) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDCListenerS47S0200000_3.onClick$3(Y.IDCListenerS47S0200000_3, android.content.DialogInterface, int):void");
    }

    public static final void onClick$4(IDCListenerS47S0200000_3 iDCListenerS47S0200000_3, DialogInterface dialogInterface, int i) {
        C187197Wh c187197Wh = ((C200207tQ) iDCListenerS47S0200000_3.l0).LJLJLLL;
        if (c187197Wh != null) {
            c187197Wh.LJIILL(((Aweme) iDCListenerS47S0200000_3.l1).getAid(), 1);
        }
        MobClick mobClick = new MobClick();
        mobClick.setEventName("private_permission");
        mobClick.setLabelName("confirm");
        mobClick.setValue(((Aweme) iDCListenerS47S0200000_3.l1).getAid());
        FMX.onEvent(mobClick);
    }

    public static final void onClick$5(IDCListenerS47S0200000_3 iDCListenerS47S0200000_3, DialogInterface dialogInterface, int i) {
        C187197Wh c187197Wh = ((FullPageBottomActionBarAssem) iDCListenerS47S0200000_3.l0).LJLLILLLL;
        if (c187197Wh != null) {
            c187197Wh.LJIILL(((Aweme) iDCListenerS47S0200000_3.l1).getAid(), 1);
        }
        MobClick mobClick = new MobClick();
        mobClick.setEventName("private_permission");
        mobClick.setLabelName("confirm");
        mobClick.setValue(((Aweme) iDCListenerS47S0200000_3.l1).getAid());
        FMX.onEvent(mobClick);
    }

    public static final void onClick$6(IDCListenerS47S0200000_3 iDCListenerS47S0200000_3, DialogInterface dialogInterface, int i) {
        C7C4 c7c4 = (C7C4) iDCListenerS47S0200000_3.l0;
        Aweme aweme = (Aweme) iDCListenerS47S0200000_3.l1;
        C187197Wh c187197Wh = c7c4.LJLLILLLL;
        if (c187197Wh != null) {
            c187197Wh.LJIILL(aweme.getAid(), 1);
        }
        MobClick mobClick = new MobClick();
        mobClick.setEventName("private_permission");
        mobClick.setLabelName("confirm");
        mobClick.setValue(aweme.getAid());
        FMX.onEvent(mobClick);
    }

    public static final void onClick$7(IDCListenerS47S0200000_3 iDCListenerS47S0200000_3, DialogInterface dialogInterface, int i) {
        ((C8BR) ((C178116yt) iDCListenerS47S0200000_3.l0).LJLJLLL.getValue()).LJIILL(((Aweme) iDCListenerS47S0200000_3.l1).getAid(), 1);
        MobClick mobClick = new MobClick();
        mobClick.setEventName("private_permission");
        mobClick.setLabelName("confirm");
        mobClick.setValue(((Aweme) iDCListenerS47S0200000_3.l1).getAid());
        FMX.onEvent(mobClick);
    }

    public static final void onClick$8(IDCListenerS47S0200000_3 iDCListenerS47S0200000_3, DialogInterface dialogInterface, int i) {
        ((CommentInputFragment) iDCListenerS47S0200000_3.l1).LJZI.LJIILL(((Aweme) iDCListenerS47S0200000_3.l0).getAid(), 1);
        MobClick mobClick = new MobClick();
        mobClick.setEventName("private_permission");
        mobClick.setLabelName("confirm");
        mobClick.setValue(((Aweme) iDCListenerS47S0200000_3.l0).getAid());
        FMX.onEvent(mobClick);
    }

    public static final void onClick$9(IDCListenerS47S0200000_3 iDCListenerS47S0200000_3, DialogInterface dialogInterface, int i) {
        Map hashMap;
        int i2;
        String str;
        Map hashMap2;
        int i3;
        String str2;
        final CommentListFragment commentListFragment = (CommentListFragment) iDCListenerS47S0200000_3.l0;
        final Map map = (Map) iDCListenerS47S0200000_3.l1;
        commentListFragment.getClass();
        dialogInterface.dismiss();
        int i4 = 1;
        if (i == 0) {
            final ArrayList arrayList = new ArrayList();
            final ArrayList arrayList2 = new ArrayList();
            final HashSet hashSet = new HashSet();
            String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
            CommentBatchManagementViewModel commentBatchManagementViewModel = commentListFragment.LLLF;
            if (commentBatchManagementViewModel != null) {
                hashMap2 = commentBatchManagementViewModel.LJLJJL;
            } else {
                hashMap2 = new HashMap();
            }
            hashMap2.clear();
            Iterator it = map.entrySet().iterator();
            int i5 = 0;
            while (it.hasNext()) {
                Comment comment = (Comment) ((Map.Entry) it.next()).getValue();
                if (comment.getUser() == null) {
                    str2 = "";
                } else {
                    str2 = comment.getUser().getUid();
                }
                String cid = comment.getCid();
                if (!TextUtils.equals(curUserId, str2)) {
                    arrayList.add(cid);
                    arrayList2.add(str2);
                    hashSet.add(str2);
                    hashMap2.put(cid, comment);
                }
                if (comment.getAliasAweme() != null) {
                    i5++;
                }
            }
            if (hashMap2.size() == 0) {
                C26045AKb c26045AKb = new C26045AKb(commentListFragment);
                c26045AKb.LJIIIZ(commentListFragment.getString(R.string.dji));
                c26045AKb.LJIIJ();
                return;
            }
            final int size = arrayList.size();
            C74Z.LJIILL(size, hashSet.size(), i5, commentListFragment.LJLILLLLZI.getEnterFrom());
            if (C176286vw.LIZ().length == 3) {
                i3 = C176286vw.LIZ()[1];
            } else {
                i3 = 100;
            }
            if (size > i3) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(commentListFragment.getContext().getResources().getQuantityString(R.plurals.c3, size, Integer.valueOf(size)));
                LIZ.append(commentListFragment.getContext().getResources().getQuantityString(R.plurals.c4, i3, Integer.valueOf(i3)));
                String LIZIZ = X1D.LIZIZ(LIZ);
                C26045AKb c26045AKb2 = new C26045AKb(commentListFragment);
                c26045AKb2.LJIIIZ(LIZIZ);
                c26045AKb2.LJIIJ();
                return;
            }
            if (size <= 0) {
                return;
            }
            HashSet hashSet2 = new HashSet();
            HashMap hashMap3 = new HashMap();
            int i6 = 0;
            for (Map.Entry entry : hashMap2.entrySet()) {
                Object key = entry.getKey();
                Comment comment2 = (Comment) entry.getValue();
                if (comment2 != null) {
                    if (comment2.getCommentType() == i4) {
                        hashSet2.add(key);
                        i6 = (int) (comment2.getReplyCommentTotal() + 1 + i6);
                    } else if (comment2.getCommentType() == 2) {
                        hashMap3.put(key, comment2.getReplyId());
                    }
                }
                i4 = 1;
            }
            Iterator it2 = hashMap3.entrySet().iterator();
            while (it2.hasNext()) {
                if (!hashSet2.contains(((Map.Entry) it2.next()).getValue())) {
                    i6++;
                }
            }
            commentListFragment.LLLF.LJLJI = i6;
            ARI ari = new ARI(commentListFragment.getContext());
            final int i7 = i5;
            ari.LJI(R.string.djj, new InterfaceC88472Yns() { // from class: X.6tz
                @Override // X.InterfaceC88472Yns
                public final Object invoke(Object obj) {
                    CommentListFragment commentListFragment2 = CommentListFragment.this;
                    List list = arrayList;
                    List list2 = arrayList2;
                    int i8 = size;
                    java.util.Set set = hashSet;
                    int i9 = i7;
                    FrameLayout frameLayout = commentListFragment2.LLJLL;
                    if (frameLayout != null) {
                        int height = frameLayout.getHeight();
                        InterfaceC173976sD interfaceC173976sD = commentListFragment2.LLLILZJ;
                        if (interfaceC173976sD != null) {
                            height = interfaceC173976sD.Ed();
                        }
                        C7TY.LIZ(commentListFragment2.mo49getActivity(), commentListFragment2.LJLJI, TextUtils.join(",", list), TextUtils.join(",", list2), height);
                    }
                    C74Z.LJIILLIIL(i8, set.size(), i9, commentListFragment2.LJLILLLLZI.getEnterFrom());
                    return C76800UCe.LIZ;
                }
            });
            ari.LJIIIIZZ(R.string.dj7, new AObjectS9S0001000_3(0, 2));
            C26227ARb LIZ2 = C3AW.LIZ(commentListFragment.requireContext());
            LIZ2.LJFF(commentListFragment.mo49getActivity().getResources().getQuantityString(R.plurals.c7, size, Integer.valueOf(size)));
            LIZ2.LIZIZ(commentListFragment.mo49getActivity().getResources().getQuantityString(R.plurals.c6, size, Integer.valueOf(size)));
            LIZ2.LJIIL = ari;
            LIZ2.LJII = false;
            C26231ARf LJI = LIZ2.LJI();
            commentListFragment.LLLLLL = LJI;
            LJI.LIZLLL();
            FMX.onEventV3("comment_batch_management_report_confirm_sw");
            return;
        }
        final HashSet hashSet3 = new HashSet();
        String curUserId2 = ((RBX) HG3.LJIILL()).getCurUserId();
        CommentBatchManagementViewModel commentBatchManagementViewModel2 = commentListFragment.LLLF;
        if (commentBatchManagementViewModel2 != null) {
            hashMap = commentBatchManagementViewModel2.LJLJJL;
        } else {
            hashMap = new HashMap();
        }
        hashMap.clear();
        Iterator it3 = map.entrySet().iterator();
        final int i8 = 0;
        while (it3.hasNext()) {
            Comment comment3 = (Comment) ((Map.Entry) it3.next()).getValue();
            if (comment3.getUser() == null) {
                str = "";
            } else {
                str = comment3.getUser().getUid();
            }
            if (!TextUtils.equals(curUserId2, str)) {
                hashSet3.add(str);
                hashMap.put(comment3.getCid(), comment3);
            }
            if (comment3.getAliasAweme() != null) {
                i8++;
            }
        }
        if (hashMap.size() == 0) {
            C26045AKb c26045AKb3 = new C26045AKb(commentListFragment);
            c26045AKb3.LJIIIZ(commentListFragment.getString(R.string.dj5));
            c26045AKb3.LJIIJ();
            return;
        }
        int size2 = hashSet3.size();
        C74Z.LJIIJ(size2, hashSet3.size(), i8, commentListFragment.LJLILLLLZI.getEnterFrom());
        if (C176286vw.LIZ().length == 3) {
            i2 = C176286vw.LIZ()[2];
        } else {
            i2 = 100;
        }
        if (size2 > i2) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(commentListFragment.getContext().getResources().getQuantityString(R.plurals.bv, size2, Integer.valueOf(size2)));
            LIZ3.append(commentListFragment.getContext().getResources().getQuantityString(R.plurals.bw, i2, Integer.valueOf(i2)));
            String LIZIZ2 = X1D.LIZIZ(LIZ3);
            C26045AKb c26045AKb4 = new C26045AKb(commentListFragment);
            c26045AKb4.LJIIIZ(LIZIZ2);
            c26045AKb4.LJIIJ();
            return;
        }
        if (hashSet3.size() > 0) {
            ARI ari2 = new ARI(commentListFragment.getContext());
            ari2.LJI(R.string.dj3, new InterfaceC88472Yns() { // from class: X.6vS
                @Override // X.InterfaceC88472Yns
                public final Object invoke(Object obj) {
                    CommentListFragment commentListFragment2 = CommentListFragment.this;
                    java.util.Set set = hashSet3;
                    java.util.Map map2 = map;
                    int i9 = i8;
                    commentListFragment2.getClass();
                    CommentBatchManagementApi.LIZ.getClass();
                    C25909AEv.LIZ().userBatchBlock(TextUtils.join(",", set)).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LIZ(new C175066ty(commentListFragment2, set));
                    C74Z.LJIIJJI(map2.size(), set.size(), i9, commentListFragment2.LJLILLLLZI.getEnterFrom());
                    return C76800UCe.LIZ;
                }
            });
            ari2.LJIIIIZZ(R.string.dj7, new AObjectS9S0001000_3(0, 3));
            int size3 = hashSet3.size();
            C26227ARb LIZ4 = C3AW.LIZ(commentListFragment.requireContext());
            LIZ4.LJFF(commentListFragment.mo49getActivity().getResources().getQuantityString(R.plurals.by, size3, Integer.valueOf(size3)));
            LIZ4.LIZIZ(commentListFragment.mo49getActivity().getResources().getQuantityString(R.plurals.bx, size3, Integer.valueOf(size3)));
            LIZ4.LJIIL = ari2;
            LIZ4.LJII = false;
            C26231ARf LJI2 = LIZ4.LJI();
            commentListFragment.LLLLLL = LJI2;
            LJI2.LIZLLL();
            FMX.onEventV3("comment_batch_management_block_confirm_sw");
        }
    }
}
