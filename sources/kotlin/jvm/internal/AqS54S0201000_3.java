package kotlin.jvm.internal;

import X.AbstractC175586uo;
import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C174366sq;
import X.C175486ue;
import X.C175536uj;
import X.C175596up;
import X.C175886vI;
import X.C177616y5;
import X.C177916yZ;
import X.C178296zB;
import X.C181847Bs;
import X.C198807rA;
import X.C2050482y;
import X.C212428Vi;
import X.C25909AEv;
import X.C34K;
import X.C38306F1q;
import X.C43I;
import X.C62819Ol5;
import X.C72808Sho;
import X.C73969T1h;
import X.C74Z;
import X.C76732zl;
import X.C76800UCe;
import X.C77321UWf;
import X.C7HV;
import X.C7MK;
import X.C8HZ;
import X.EnumC177746yI;
import X.InterfaceC194547kI;
import X.InterfaceC65784Pro;
import X.InterfaceC73463SsN;
import X.InterfaceC88472Yns;
import X.M7C;
import X.T16;
import X.V16;
import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.comment.commentlist.api.CommentBatchManagementApi;
import com.ss.android.ugc.aweme.comment.commentlist.api.UserBatchBlockResponse;
import com.ss.android.ugc.aweme.comment.commentlist.managementv2.CommentManagementAssemVM;
import com.ss.android.ugc.aweme.comment.commentlist.managementv2.CommentManagementBottomBarAssem;
import com.ss.android.ugc.aweme.comment.commentpage.ui.CommentListPageFragment;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomInputPriorityComponent;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.CommonCommentKeyboard;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.api.response.MixVideosResponse;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.aweme.poi.detail.reviews.PoiDetailReviewsViewModel;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AqS107S0300000_3;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class AqS54S0201000_3 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case 9:
                return invoke$9(this, obj);
            case 10:
                return invoke$10(this, obj);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS54S0201000_3 aqS54S0201000_3, Object obj) {
        C175886vI setState = (C175886vI) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C175886vI.LIZ(setState, null, null, null, null, new C43I(new C175596up(aqS54S0201000_3.i2, ((C76732zl) aqS54S0201000_3.l1).element, (Set) aqS54S0201000_3.l0)), false, 47);
    }

    public static final Object invoke$1(AqS54S0201000_3 aqS54S0201000_3, Object obj) {
        C175886vI setState = (C175886vI) obj;
        o.LJIIIZ(setState, "$this$setState");
        Set set = (Set) aqS54S0201000_3.l0;
        return C175886vI.LIZ(setState, null, null, new C43I(new C175486ue(aqS54S0201000_3.i2, (Map) aqS54S0201000_3.l1, set)), null, null, false, 59);
    }

    public static final Object invoke$10(AqS54S0201000_3 aqS54S0201000_3, Object obj) {
        M7C setState = (M7C) obj;
        o.LJIIIZ(setState, "$this$setState");
        MixVideosViewModel mixVideosViewModel = (MixVideosViewModel) aqS54S0201000_3.l0;
        List<Aweme> list = setState.LJLIL;
        List list2 = (List) aqS54S0201000_3.l1;
        mixVideosViewModel.getClass();
        return M7C.LIZ(setState, MixVideosViewModel.gv0(list, list2), null, null, aqS54S0201000_3.i2, false, 0, null, null, new C43I(Boolean.TRUE), 502);
    }

    public static final Object invoke$11(AqS54S0201000_3 aqS54S0201000_3, Object it) {
        o.LJIIIZ(it, "it");
        List<? extends Aweme> list = ((MixVideosResponse) aqS54S0201000_3.l0).mixVideos;
        ArrayList arrayList = new ArrayList();
        MixVideosViewModel mixVideosViewModel = (MixVideosViewModel) aqS54S0201000_3.l1;
        MixVideosResponse mixVideosResponse = (MixVideosResponse) aqS54S0201000_3.l0;
        mixVideosViewModel.LJLLI = mixVideosResponse.minCursor;
        mixVideosViewModel.LJLJLLL = mixVideosResponse.hasMore;
        if (list != null) {
            mixVideosViewModel.setState(new AqS29S0301000_3((List) arrayList, (List<Aweme>) list, (List<? extends Aweme>) mixVideosViewModel, (MixVideosViewModel) aqS54S0201000_3.i2, 6));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS54S0201000_3 aqS54S0201000_3, Object it) {
        String str;
        C174366sq c174366sq;
        o.LJIIIZ(it, "it");
        final CommentManagementAssemVM I3 = ((CommentManagementBottomBarAssem) aqS54S0201000_3.l0).I3();
        final Set<String> uids = ((C175596up) ((AbstractC175586uo) aqS54S0201000_3.l1)).LIZ;
        I3.getClass();
        o.LJIIIZ(uids, "uids");
        CommentBatchManagementApi.LIZ.getClass();
        C25909AEv.LIZ().userBatchBlock(TextUtils.join(",", uids)).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LIZ(new InterfaceC73463SsN<UserBatchBlockResponse>() { // from class: X.6vD
            @Override // X.InterfaceC73463SsN
            public final void onSubscribe(InterfaceC92693kP d) {
                o.LJIIIZ(d, "d");
            }

            @Override // X.InterfaceC73463SsN
            public final void onError(Throwable e) {
                o.LJIIIZ(e, "e");
                if (e instanceof C38333F2r) {
                    CommentManagementAssemVM commentManagementAssemVM = CommentManagementAssemVM.this;
                    commentManagementAssemVM.setState(new AqS107S0300000_3(commentManagementAssemVM, e, uids, 0));
                } else {
                    CommentManagementAssemVM commentManagementAssemVM2 = CommentManagementAssemVM.this;
                    commentManagementAssemVM2.setState(new AqS107S0300000_3(commentManagementAssemVM2, e, uids, 1));
                }
            }

            @Override // X.InterfaceC73463SsN
            public final void onSuccess(UserBatchBlockResponse t) {
                o.LJIIIZ(t, "t");
                CommentManagementAssemVM commentManagementAssemVM = CommentManagementAssemVM.this;
                commentManagementAssemVM.setState(new AqS134S0200000_3(commentManagementAssemVM.LJLIL, uids, 2));
            }
        });
        C175596up c175596up = (C175596up) ((AbstractC175586uo) aqS54S0201000_3.l1);
        int i = c175596up.LIZIZ;
        int size = c175596up.LIZ.size();
        int i2 = aqS54S0201000_3.i2;
        C175536uj H3 = ((CommentManagementBottomBarAssem) aqS54S0201000_3.l0).H3();
        if (H3 == null || (c174366sq = H3.LJLIL) == null || (str = c174366sq.getEnterFrom()) == null) {
            str = "";
        }
        C74Z.LJIIJJI(i, size, i2, str);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS54S0201000_3 aqS54S0201000_3, Object obj) {
        C177616y5 it = (C177616y5) obj;
        o.LJIIIZ(it, "it");
        if (it.LLD && aqS54S0201000_3.i2 == 4) {
            ((CommonCommentKeyboard) aqS54S0201000_3.l0).I3().iv0(C177916yZ.LIZ, false);
            ((C34K) aqS54S0201000_3.l1).element = true;
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS54S0201000_3 aqS54S0201000_3, Object it) {
        o.LJIIIZ(it, "it");
        MixVideosResponse mixVideosResponse = (MixVideosResponse) aqS54S0201000_3.l0;
        List<? extends Aweme> list = mixVideosResponse.mixVideos;
        int i = aqS54S0201000_3.i2;
        if (i == 4) {
            MixVideosViewModel mixVideosViewModel = (MixVideosViewModel) aqS54S0201000_3.l1;
            mixVideosViewModel.LJLJLLL = mixVideosResponse.hasMoreLadBefore;
            mixVideosViewModel.LJLL = mixVideosResponse.hasMoreLoadMore;
        } else if (i == 1) {
            ((MixVideosViewModel) aqS54S0201000_3.l1).LJLL = mixVideosResponse.hasMore;
        }
        MixVideosViewModel mixVideosViewModel2 = (MixVideosViewModel) aqS54S0201000_3.l1;
        mixVideosViewModel2.LJLLI = mixVideosResponse.minCursor;
        mixVideosViewModel2.LJLLILLLL = mixVideosResponse.maxCursor;
        if (list != null) {
            mixVideosViewModel2.setState(new AqS93S0101000_3(list, (List<? extends Aweme>) i, 5));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS54S0201000_3 aqS54S0201000_3, Object it) {
        o.LJIIIZ(it, "it");
        List<? extends Aweme> list = ((MixVideosResponse) aqS54S0201000_3.l0).mixVideos;
        ArrayList arrayList = new ArrayList();
        MixVideosViewModel mixVideosViewModel = (MixVideosViewModel) aqS54S0201000_3.l1;
        MixVideosResponse mixVideosResponse = (MixVideosResponse) aqS54S0201000_3.l0;
        mixVideosViewModel.LJLLILLLL = mixVideosResponse.maxCursor;
        mixVideosViewModel.LJLL = mixVideosResponse.hasMore;
        if (list != null) {
            mixVideosViewModel.setState(new AqS29S0301000_3((List) arrayList, (List<Aweme>) list, (List<? extends Aweme>) mixVideosViewModel, (MixVideosViewModel) aqS54S0201000_3.i2, 0));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS54S0201000_3 aqS54S0201000_3, Object obj) {
        C8HZ c8hz;
        C198807rA it = (C198807rA) obj;
        o.LJIIIZ(it, "it");
        PoiDetailReviewsViewModel poiDetailReviewsViewModel = (PoiDetailReviewsViewModel) aqS54S0201000_3.l0;
        C72808Sho<PoiReviewsApi.PoiReviewModel> c72808Sho = poiDetailReviewsViewModel.LJLIL;
        if (c72808Sho != null) {
            c72808Sho.LJIILL(aqS54S0201000_3.i2, (PoiReviewsApi.PoiReviewModel) aqS54S0201000_3.l1);
            C8HZ<PoiReviewsApi.PoiReviewModel> c8hz2 = it.LJLIL;
            if (c8hz2 != null) {
                c8hz = C8HZ.LIZIZ(c8hz2, null, null, null, c72808Sho.LJII(), 7);
            } else {
                c8hz = null;
            }
            poiDetailReviewsViewModel.setState(new AqS169S0100000_3(c8hz, (C8HZ<C2050482y>) 684));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS54S0201000_3 aqS54S0201000_3, Object it) {
        o.LJIIIZ(it, "it");
        C77321UWf.LJ(aqS54S0201000_3.i2, (Fragment) aqS54S0201000_3.l0);
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aqS54S0201000_3.l1;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS54S0201000_3 aqS54S0201000_3, Object obj) {
        String str;
        JSONObject sendEventTrackingAsync = (JSONObject) obj;
        o.LJIIIZ(sendEventTrackingAsync, "$this$sendEventTrackingAsync");
        sendEventTrackingAsync.put("action_type", "show");
        sendEventTrackingAsync.put("enter_from", C7MK.LIZLLL(((C181847Bs) aqS54S0201000_3.l0).LJLILLLLZI, (InterfaceC194547kI) aqS54S0201000_3.l1));
        sendEventTrackingAsync.put("group_id", ((InterfaceC194547kI) aqS54S0201000_3.l1).getAweme().getAid());
        sendEventTrackingAsync.put("author_id", ((InterfaceC194547kI) aqS54S0201000_3.l1).getAweme().getAuthorUid());
        sendEventTrackingAsync.put("follow_status", ((InterfaceC194547kI) aqS54S0201000_3.l1).getAweme().getFollowStatus());
        NowPostInfo nowPostInfo = ((InterfaceC194547kI) aqS54S0201000_3.l1).getAweme().nowPostInfo;
        if (nowPostInfo == null || (str = nowPostInfo.getNowMediaType()) == null) {
            str = "post";
        }
        sendEventTrackingAsync.put("now_type", str);
        sendEventTrackingAsync.put("is_now_clear", aqS54S0201000_3.i2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS54S0201000_3 aqS54S0201000_3, Object obj) {
        int i;
        CommentListPageFragment LJJIJIIJI;
        AbstractBottomInputPriorityComponent it = (AbstractBottomInputPriorityComponent) obj;
        o.LJIIIZ(it, "it");
        Exception e = (Exception) aqS54S0201000_3.l0;
        int i2 = aqS54S0201000_3.i2;
        Comment comment = (Comment) aqS54S0201000_3.l1;
        o.LJIIIZ(e, "e");
        o.LJIIIZ(comment, "comment");
        if (V16.LJJIZ(comment)) {
            Context context = it.getContext();
            if (context != null) {
                String awemeId = comment.getAwemeId();
                C7HV c7hv = C7HV.LIZIZ;
                if (c7hv.LJIILJJIL().LJIIIZ(e)) {
                    c7hv.LJIILJJIL().LJII(awemeId, EnumC177746yI.PERMISSION_DENIED);
                } else if (C178296zB.LIZLLL(context, e, R.string.djs, false, false)) {
                    c7hv.LJIILJJIL().LJII(awemeId, EnumC177746yI.DEFAULT);
                }
            }
        } else if (comment.getPublishScenario() != 1) {
            C178296zB.LJ(it.getContext(), e, R.string.djs, 24);
        }
        ActivityC45651qj LIZ = C212428Vi.LIZ(it);
        if (LIZ != null && (LJJIJIIJI = C62819Ol5.LJJIJIIJI(LIZ)) != null) {
            comment.setIgnoreToast(true);
            LJJIJIIJI.xk(e, i2, comment);
        }
        if (comment.getFakeGiftId() != 0) {
            try {
                i = ((C38306F1q) e).getErrorCode();
            } catch (Exception unused) {
                i = 0;
            }
            it.N3(i, comment, false);
        }
        return C76800UCe.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS54S0201000_3(int r3, com.ss.android.ugc.aweme.mix.api.response.MixVideosResponse r4, com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            switch(r6) {
                case 4: goto L11;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r5
            r1.i2 = r3
            r0 = 1
        Ld:
            r1.<init>(r0)
            return
        L11:
            r1 = r2
            r1.l0 = r4
            r1.i2 = r3
            r1.l1 = r5
            r0 = 1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS54S0201000_3.<init>(int, com.ss.android.ugc.aweme.mix.api.response.MixVideosResponse, com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS54S0201000_3(int i, InterfaceC194547kI interfaceC194547kI, C181847Bs c181847Bs, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c181847Bs;
        this.l1 = interfaceC194547kI;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS54S0201000_3(int i, CommonCommentKeyboard commonCommentKeyboard, C34K c34k, int i2) {
        super(1);
        this.$t = i2;
        this.i2 = i;
        this.l0 = commonCommentKeyboard;
        this.l1 = c34k;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS54S0201000_3(Fragment fragment, Fragment fragment2, int i, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(1);
        this.$t = interfaceC65784Pro;
        this.l0 = fragment;
        this.i2 = fragment2;
        this.l1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS54S0201000_3(CommentManagementBottomBarAssem commentManagementBottomBarAssem, AbstractC175586uo abstractC175586uo, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = commentManagementBottomBarAssem;
        this.l1 = abstractC175586uo;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS54S0201000_3(MixVideosViewModel mixVideosViewModel, MixVideosViewModel mixVideosViewModel2, List<? extends Aweme> list, int i) {
        super(1);
        this.$t = i;
        this.l0 = mixVideosViewModel;
        this.l1 = mixVideosViewModel2;
        this.i2 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS54S0201000_3(PoiDetailReviewsViewModel poiDetailReviewsViewModel, int i, PoiReviewsApi.PoiReviewModel poiReviewModel, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = poiDetailReviewsViewModel;
        this.i2 = i;
        this.l1 = poiReviewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS54S0201000_3(Exception exc, int i, Comment comment, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = exc;
        this.i2 = i;
        this.l1 = comment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS54S0201000_3(Set set, Set<String> set2, int i, C76732zl c76732zl) {
        super(1);
        this.$t = c76732zl;
        this.l0 = set;
        this.i2 = set2;
        this.l1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS54S0201000_3(Set set, Set<String> set2, Map<String, ? extends Comment> map, int i) {
        super(1);
        this.$t = i;
        this.l0 = set;
        this.l1 = set2;
        this.i2 = map;
    }
}
