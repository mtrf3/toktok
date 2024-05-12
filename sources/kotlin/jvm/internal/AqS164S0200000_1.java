package kotlin.jvm.internal;

import X.AV1;
import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.AnonymousClass357;
import X.C025908h;
import X.C100193wV;
import X.C100323wi;
import X.C101043xs;
import X.C102303zu;
import X.C1040246k;
import X.C105814Dh;
import X.C107724Kq;
import X.C109764Sm;
import X.C109774Sn;
import X.C113554cx;
import X.C119354mJ;
import X.C162476Zf;
import X.C17N;
import X.C188727au;
import X.C2068389v;
import X.C26045AKb;
import X.C32I;
import X.C34B;
import X.C35564DxY;
import X.C3B2;
import X.C3B3;
import X.C3C8;
import X.C3L4;
import X.C3QD;
import X.C3T9;
import X.C3TO;
import X.C3TV;
import X.C40171ht;
import X.C43I;
import X.C45804HyK;
import X.C47261Igj;
import X.C49R;
import X.C4D6;
import X.C4E0;
import X.C4E3;
import X.C4E5;
import X.C4EF;
import X.C4EG;
import X.C4FY;
import X.C4TQ;
import X.C4TR;
import X.C4TS;
import X.C4TT;
import X.C4TU;
import X.C55888Lwa;
import X.C56916MVk;
import X.C59522Vg;
import X.C61878OQg;
import X.C63120Opw;
import X.C71172qn;
import X.C73305Spp;
import X.C73306Spq;
import X.C73312Spw;
import X.C76800UCe;
import X.C77266UUc;
import X.C78613UtF;
import X.C79045V0n;
import X.C7MY;
import X.C86393aF;
import X.C88913eJ;
import X.C91733ir;
import X.C93613lt;
import X.C93973mT;
import X.C95233oV;
import X.C95643pA;
import X.C95833pT;
import X.C96573qf;
import X.C98453th;
import X.C98593tv;
import X.C99033ud;
import X.EnumC112364b2;
import X.EnumC57435MgR;
import X.EnumC94093mf;
import X.EnumC95523oy;
import X.EnumC97443s4;
import X.FMX;
import X.InterfaceC100173wT;
import X.InterfaceC100183wU;
import X.InterfaceC101063xu;
import X.InterfaceC107424Jm;
import X.InterfaceC57106Mb8;
import X.InterfaceC79150V4o;
import X.InterfaceC82723Mm;
import X.InterfaceC82853Mz;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.MG5;
import X.MGN;
import X.OSZ;
import X.SYL;
import X.X1D;
import X.XKQ;
import X.XKX;
import Y.AObserverS69S0100000_1;
import Y.ARunnableS37S0100000_1;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.play.core.appupdate.u;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.UserRecommendationContent;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.titlebar.QuickTitleBarCenterSingleAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.view.TakoInputView;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.single.SingleChatNoticeAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.single.SingleChatNoticeViewModel;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.group.assem.GroupChatDetailAssem;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.group.assem.GroupChatNavAssem;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.group.functions.GroupDetailViewModel;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.group.header.GroupTitleCell;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.maf.ui.MafChatListWidget;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.assems.MessageRequestStatusAssem;
import com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.SessionListViewHolder;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.assem.SearchResultListAssem;
import com.ss.android.ugc.aweme.im.sdk.search.ui.assem.IMSearchAssem;
import com.ss.android.ugc.aweme.im.sdk.search.ui.assem.IMSearchDefaultAssem;
import com.ss.android.ugc.aweme.im.sdk.search.ui.assem.IMSearchResultAssem;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.model.ActivityStatus;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import com.ss.android.ugc.aweme.relation.mutual.MutualRelationEmptyCell;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class AqS164S0200000_1 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            case 7:
                return invoke$7(this, obj, obj2);
            case 8:
                return invoke$8(this, obj, obj2);
            case 9:
                return invoke$9(this, obj, obj2);
            case 10:
                return invoke$10(this, obj, obj2);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this, obj, obj2);
            case 12:
                return invoke$12(this, obj, obj2);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this, obj, obj2);
            case 14:
                return invoke$14(this, obj, obj2);
            case 15:
                return invoke$15(this, obj, obj2);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return invoke$16(this, obj, obj2);
            case 17:
                return invoke$17(this, obj, obj2);
            case 18:
                return invoke$18(this, obj, obj2);
            case 19:
                return invoke$19(this, obj, obj2);
            case 20:
                return invoke$20(this, obj, obj2);
            case 21:
                return invoke$21(this, obj, obj2);
            case 22:
                return invoke$22(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void invoke$0(C3C8 selectSubscribe, C43I<? extends C63120Opw> c43i) {
        C63120Opw c63120Opw;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null && (c63120Opw = (C63120Opw) c43i.LIZ) != null) {
            View view = (View) this.l0;
            Context context = (Context) this.l1;
            C34B.LJI("OutPushCompensate", "Group member header null conversation");
            TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.efo);
            String string = context.getString(R.string.gxy);
            o.LJIIIIZZ(string, "context.getString(R.stri…roup_chat_members_number)");
            C025908h.LJ(new Object[]{Integer.valueOf(c63120Opw.getMemberCount())}, 1, string, "format(format, *args)", tuxTextView);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS164S0200000_1(AnonymousClass357 anonymousClass357, UserRecommendationContent.RecUserInfo recUserInfo, int i) {
        super(2);
        this.$t = i;
        this.l0 = anonymousClass357;
        this.l1 = recUserInfo;
    }

    public static final Object invoke$0(AqS164S0200000_1 aqS164S0200000_1, Object itemId, Object error) {
        o.LJIIIZ(itemId, "itemId");
        o.LJIIIZ(error, "error");
        InterfaceC88471Ynr interfaceC88471Ynr = (InterfaceC88471Ynr) aqS164S0200000_1.l0;
        if (interfaceC88471Ynr != null) {
            interfaceC88471Ynr.invoke(itemId, error);
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("is_success", "2");
        FMX.LJIIL("collection_request_result", c188727au.LIZ);
        ((InterfaceC79150V4o) aqS164S0200000_1.l1).LIZIZ(null);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS164S0200000_1 aqS164S0200000_1, Object obj, Object obj2) {
        Integer LJI;
        Integer LJI2;
        final UIAssem selectSubscribe = (UIAssem) obj;
        C95833pT info = (C95833pT) obj2;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(info, "info");
        if (!info.LJLJI) {
            ((C101043xs) ((View) aqS164S0200000_1.l0)).setRightTextVisibility(8);
            ((C101043xs) ((View) aqS164S0200000_1.l0)).setOnTitlebarClickListener(new InterfaceC101063xu() { // from class: X.3pc
                @Override // X.InterfaceC101063xu
                public final void LIZ() {
                }

                @Override // X.InterfaceC101063xu
                public final void LIZIZ() {
                }

                @Override // X.InterfaceC101063xu
                public final void LIZJ(int i) {
                }

                @Override // X.InterfaceC101063xu
                public final void LIZLLL() {
                }

                @Override // X.InterfaceC101063xu
                public final void LJ() {
                    ActivityC45651qj LJIIIIZZ = C55096Ljo.LJIIIIZZ(UIAssem.this);
                    if (LJIIIIZZ != null) {
                        LJIIIIZZ.finish();
                    }
                }
            });
        } else {
            ((C101043xs) ((View) aqS164S0200000_1.l0)).setRightTextVisibility(0);
            ((C101043xs) ((View) aqS164S0200000_1.l0)).setRightTuxFont(42);
            if (info.LJLJJI) {
                Context context = selectSubscribe.getContext();
                if (context != null && (LJI2 = C79045V0n.LJI(R.attr.gp, context)) != null) {
                    ((C101043xs) ((View) aqS164S0200000_1.l0)).setRightTextColor(LJI2.intValue());
                }
                ((C101043xs) ((View) aqS164S0200000_1.l0)).setOnTitlebarClickListener(new InterfaceC101063xu() { // from class: X.3pd
                    @Override // X.InterfaceC101063xu
                    public final void LIZ() {
                    }

                    @Override // X.InterfaceC101063xu
                    public final void LIZIZ() {
                    }

                    @Override // X.InterfaceC101063xu
                    public final void LIZJ(int i) {
                    }

                    @Override // X.InterfaceC101063xu
                    public final void LIZLLL() {
                    }

                    @Override // X.InterfaceC101063xu
                    public final void LJ() {
                        ActivityC45651qj LJIIIIZZ = C55096Ljo.LJIIIIZZ(UIAssem.this);
                        if (LJIIIIZZ != null) {
                            LJIIIIZZ.finish();
                        }
                    }
                });
            } else {
                Context context2 = selectSubscribe.getContext();
                if (context2 != null && (LJI = C79045V0n.LJI(R.attr.eb, context2)) != null) {
                    ((C101043xs) ((View) aqS164S0200000_1.l0)).setRightTextColor(LJI.intValue());
                }
                C101043xs c101043xs = (C101043xs) ((View) aqS164S0200000_1.l0);
                final GroupChatNavAssem groupChatNavAssem = (GroupChatNavAssem) aqS164S0200000_1.l1;
                c101043xs.setOnTitlebarClickListener(new InterfaceC101063xu() { // from class: X.3pb
                    @Override // X.InterfaceC101063xu
                    public final void LIZ() {
                    }

                    @Override // X.InterfaceC101063xu
                    public final void LIZIZ() {
                    }

                    @Override // X.InterfaceC101063xu
                    public final void LIZLLL() {
                    }

                    @Override // X.InterfaceC101063xu
                    public final void LJ() {
                        ActivityC45651qj LJIIIIZZ = C55096Ljo.LJIIIIZZ(UIAssem.this);
                        if (LJIIIIZZ != null) {
                            LJIIIIZZ.finish();
                        }
                    }

                    @Override // X.InterfaceC101063xu
                    public final void LIZJ(int i) {
                        ((GroupDetailViewModel) groupChatNavAssem.LJLJI.getValue()).hv0();
                    }
                });
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AqS164S0200000_1 aqS164S0200000_1, Object subscribe, Object obj) {
        int i;
        String str;
        C86393aF it = (C86393aF) obj;
        o.LJIIIZ(subscribe, "$this$subscribe");
        o.LJIIIZ(it, "it");
        List list = it.LJLILLLLZI;
        if (list == null) {
            list = C61878OQg.INSTANCE;
        }
        boolean isEmpty = list.isEmpty();
        C98453th c98453th = (C98453th) ((IMSearchResultAssem) aqS164S0200000_1.l0).LJLILLLLZI.getValue();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("result data list update, size ");
        LIZ.append(list.size());
        c98453th.LJFF(X1D.LIZIZ(LIZ));
        View findViewById = ((View) aqS164S0200000_1.l1).findViewById(R.id.jh6);
        if (isEmpty) {
            i = 0;
        } else {
            i = 8;
        }
        findViewById.setVisibility(i);
        ((SYL) ((View) aqS164S0200000_1.l1).findViewById(R.id.jh7)).getState().LJIILLIIL(list);
        if (it.LJLIL) {
            long currentTimeMillis = System.currentTimeMillis() - it.LJLJI;
            int i2 = it.LJLJJI;
            if (isEmpty) {
                str = "empty";
            } else {
                str = "normal";
            }
            C3QD.LIZLLL("result", str, false, currentTimeMillis, null, null, null, null, null, null, null, Long.valueOf(currentTimeMillis), Integer.valueOf(i2), 10224);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(AqS164S0200000_1 aqS164S0200000_1, Object obj, Object obj2) {
        LifecycleCoroutineScope lifecycleScope;
        o.LJIIIZ(obj, "<anonymous parameter 0>");
        o.LJIIIZ(obj2, "<anonymous parameter 1>");
        C77266UUc c77266UUc = C77266UUc.LIZIZ;
        if (c77266UUc.LJ((User) aqS164S0200000_1.l0)) {
            if (C59522Vg.LIZ()) {
                C56916MVk c56916MVk = (C56916MVk) aqS164S0200000_1.l1;
                Context context = c56916MVk.mContext;
                o.LJIIIIZZ(context, "context");
                ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
                if (LJJIFFI != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(LJJIFFI)) != null) {
                    XKX.LIZLLL(lifecycleScope, C78613UtF.LIZJ, null, new C71172qn(c56916MVk, null), 2);
                }
            } else {
                Context context2 = ((C56916MVk) aqS164S0200000_1.l1).mContext;
                o.LJIIIIZZ(context2, "context");
                c77266UUc.LJFF(context2, "notification_page", 0, "follow");
            }
        }
        ((C56916MVk) aqS164S0200000_1.l1).LJLIL = true;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$12(AqS164S0200000_1 aqS164S0200000_1, Object selectSubscribe, Object obj) {
        Object obj2;
        C43I c43i = (C43I) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        Object obj3 = null;
        if (c43i != null) {
            obj2 = c43i.LIZ;
        } else {
            obj2 = null;
        }
        if (obj2 instanceof C105814Dh) {
            ((C4EF) aqS164S0200000_1.l0).LJI(C4EG.UN_RECOGNIZE_TIP);
            C4D6.LIZJ(((TakoInputView) aqS164S0200000_1.l1).LJLZ, "unrecognized");
            C4EF c4ef = (C4EF) aqS164S0200000_1.l0;
            c4ef.setState(C4E5.INITIATE);
            c4ef.setTalkState(C4E3.STOP);
            c4ef.LIZ(false);
        } else {
            if (c43i != null) {
                obj3 = c43i.LIZ;
            }
            if (obj3 instanceof C4E0) {
                ((C4EF) aqS164S0200000_1.l0).LJI(C4EG.MSG_TOO_SHORT_TIP);
                C4D6.LIZJ(((TakoInputView) aqS164S0200000_1.l1).LJLZ, "release_less_1s");
                C4EF c4ef2 = (C4EF) aqS164S0200000_1.l0;
                c4ef2.setState(C4E5.INITIATE);
                c4ef2.setTalkState(C4E3.STOP);
                c4ef2.LIZ(false);
            } else {
                ((C4EF) aqS164S0200000_1.l0).LIZLLL();
                ((C4EF) aqS164S0200000_1.l0).setTalkInterrupted(true);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$13(AqS164S0200000_1 aqS164S0200000_1, Object selectSubscribe, Object obj) {
        C63120Opw LIZLLL;
        ((Boolean) obj).booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (!C55888Lwa.LIZIZ.LJJI(true) || (LIZLLL = ((GroupDetailViewModel) aqS164S0200000_1.l0).LJLIL.LJLILLLLZI.LIZLLL()) == null || !u.LJJIII(LIZLLL)) {
            ((GroupChatDetailAssem) aqS164S0200000_1.l1).A3(EnumC95523oy.MUTE);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$14(AqS164S0200000_1 aqS164S0200000_1, Object selectSubscribe, Object obj) {
        C119354mJ c119354mJ;
        IMUser iMUser = (IMUser) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (iMUser != null) {
            final QuickTitleBarCenterSingleAssem quickTitleBarCenterSingleAssem = (QuickTitleBarCenterSingleAssem) aqS164S0200000_1.l0;
            boolean z = true;
            if (((C3B2) quickTitleBarCenterSingleAssem.LJLLL.getValue()).getSettings().LJFF() && iMUser.getUid() != null && iMUser.getFollowStatus() == 2) {
                ConstraintLayout constraintLayout = quickTitleBarCenterSingleAssem.LJLLLL;
                if (constraintLayout != null) {
                    ViewStub viewStub = (ViewStub) constraintLayout.findViewById(R.id.pe);
                    if (viewStub != null) {
                        View inflate = viewStub.inflate();
                        if (inflate instanceof C119354mJ) {
                            c119354mJ = (C119354mJ) inflate;
                        } else {
                            c119354mJ = null;
                        }
                        quickTitleBarCenterSingleAssem.LJZL = c119354mJ;
                    }
                    C1040246k H3 = quickTitleBarCenterSingleAssem.H3();
                    if (H3 != null) {
                        C119354mJ c119354mJ2 = quickTitleBarCenterSingleAssem.LJZL;
                        C100323wi c100323wi = H3.LIZIZ;
                        if (c100323wi != null) {
                            c100323wi.LIZ = c119354mJ2;
                        }
                    }
                    C1040246k H32 = quickTitleBarCenterSingleAssem.H3();
                    if (H32 != null) {
                        H32.LIZJ(false);
                    }
                    if (AV1.LJIJI(iMUser.getUid())) {
                        C1040246k H33 = quickTitleBarCenterSingleAssem.H3();
                        if (H33 != null) {
                            H33.LIZJ(true);
                        }
                        C119354mJ c119354mJ3 = quickTitleBarCenterSingleAssem.LJZL;
                        if (c119354mJ3 != null) {
                            c119354mJ3.LIZ(C49R.LIZ.LIZLLL);
                        }
                        TuxTextView tuxTextView = quickTitleBarCenterSingleAssem.LJLZ;
                        if (tuxTextView != null) {
                            tuxTextView.setVisibility(0);
                            TuxTextView tuxTextView2 = quickTitleBarCenterSingleAssem.LJLZ;
                            if (tuxTextView2 != null) {
                                tuxTextView2.setText(quickTitleBarCenterSingleAssem.getContainerView().getContext().getResources().getString(R.string.b7v));
                                IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusAnalytics().LIZLLL(quickTitleBarCenterSingleAssem.I3().getConversationId(), C4FY.ACTIVE_NOW);
                            } else {
                                o.LJIJI("hint");
                                throw null;
                            }
                        } else {
                            o.LJIJI("hint");
                            throw null;
                        }
                    } else {
                        C3B2 c3b2 = (C3B2) quickTitleBarCenterSingleAssem.LJLLL.getValue();
                        String uid = iMUser.getUid();
                        o.LJIIIIZZ(uid, "user.uid");
                        EnumC112364b2 enumC112364b2 = EnumC112364b2.CHAT_ROOM;
                        quickTitleBarCenterSingleAssem.LL = C3B3.LIZ(c3b2, uid, null, enumC112364b2.getValue(), 6);
                        IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusAnalytics().LIZLLL(quickTitleBarCenterSingleAssem.I3().getConversationId(), C4FY.NO_STATUS);
                        quickTitleBarCenterSingleAssem.getOwnLifecycleOwner();
                        LiveData<ActivityStatus> liveData = quickTitleBarCenterSingleAssem.LL;
                        if (liveData != null) {
                            liveData.observe(quickTitleBarCenterSingleAssem, new AObserverS69S0100000_1(quickTitleBarCenterSingleAssem, 94));
                        }
                        if (C35564DxY.LIZ() && quickTitleBarCenterSingleAssem.LLFF == null) {
                            InterfaceC100183wU activityStatusAccuracyAnalysis = IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusAccuracyAnalysis();
                            C119354mJ c119354mJ4 = quickTitleBarCenterSingleAssem.LJZL;
                            if (c119354mJ4 != null) {
                                quickTitleBarCenterSingleAssem.LLFF = C100193wV.LIZ(activityStatusAccuracyAnalysis, enumC112364b2, c119354mJ4, quickTitleBarCenterSingleAssem, quickTitleBarCenterSingleAssem.getContext());
                                quickTitleBarCenterSingleAssem.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.titlebar.QuickTitleBarCenterSingleAssem$handleAccuracyClient$1
                                    @Override // androidx.lifecycle.LifecycleEventObserver
                                    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                                        InterfaceC100173wT interfaceC100173wT;
                                        o.LJIIIZ(source, "source");
                                        o.LJIIIZ(event, "event");
                                        if (event == Lifecycle.Event.ON_RESUME) {
                                            InterfaceC100173wT interfaceC100173wT2 = QuickTitleBarCenterSingleAssem.this.LLFF;
                                            if (interfaceC100173wT2 != null) {
                                                interfaceC100173wT2.onVisible();
                                                return;
                                            }
                                            return;
                                        }
                                        if (event != Lifecycle.Event.ON_PAUSE || (interfaceC100173wT = QuickTitleBarCenterSingleAssem.this.LLFF) == null) {
                                            return;
                                        }
                                        interfaceC100173wT.onInvisible();
                                    }
                                });
                            }
                        }
                    }
                } else {
                    o.LJIJI("rootView");
                    throw null;
                }
            } else {
                C1040246k H34 = quickTitleBarCenterSingleAssem.H3();
                if (H34 != null) {
                    H34.LIZJ(false);
                }
                TuxTextView tuxTextView3 = quickTitleBarCenterSingleAssem.LJLZ;
                if (tuxTextView3 != null) {
                    tuxTextView3.setVisibility(8);
                } else {
                    o.LJIJI("hint");
                    throw null;
                }
            }
            LifecycleOwner lifecycleOwner = (LifecycleOwner) aqS164S0200000_1.l1;
            EnumC112364b2 entrance = EnumC112364b2.CHAT_ROOM;
            o.LJIIIZ(entrance, "entrance");
            InterfaceC107424Jm activityStatusAnalytics = IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusAnalytics();
            C107724Kq c107724Kq = new C107724Kq(lifecycleOwner);
            if (!AV1.LJIJI(iMUser.getUid()) && !iMUser.isOnline()) {
                z = false;
            }
            c107724Kq.LJI = Boolean.valueOf(z);
            c107724Kq.LIZIZ = entrance;
            c107724Kq.LIZJ = iMUser.getUid();
            activityStatusAnalytics.LJFF(c107724Kq);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$15(AqS164S0200000_1 aqS164S0200000_1, Object selectSubscribe, Object obj) {
        C43I c43i = (C43I) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null && c43i.LIZ != 0) {
            C34B.LJI("OutPushCompensate", "Group detail title");
            ((GroupTitleCell) aqS164S0200000_1.l0).T((C95233oV) aqS164S0200000_1.l1, (C63120Opw) c43i.LIZ);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$16(AqS164S0200000_1 aqS164S0200000_1, Object selectSubscribe, Object it) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(it, "it");
        if (it == EnumC94093mf.EMPTY) {
            MutualRelationEmptyCell mutualRelationEmptyCell = (MutualRelationEmptyCell) aqS164S0200000_1.l0;
            C93973mT c93973mT = (C93973mT) aqS164S0200000_1.l1;
            mutualRelationEmptyCell.getClass();
            MGN mgn = MGN.LJLILLLLZI;
            C73305Spp c73305Spp = (C73305Spp) mutualRelationEmptyCell.itemView.findViewById(R.id.kf_);
            o.LJIIIIZZ(c73305Spp, "itemView.status_view");
            mgn.setStatusView(c73305Spp, MG5.MUTUAL_RELATION_TAB, new AqS148S0200000_1(mutualRelationEmptyCell, c93973mT, 33), (Exception) null);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$17(AqS164S0200000_1 aqS164S0200000_1, Object obj, Object obj2) {
        ((Boolean) obj).booleanValue();
        SingleChatNoticeViewModel N3 = ((SingleChatNoticeAssem) aqS164S0200000_1.l0).N3();
        String uid = ((IMUser) aqS164S0200000_1.l1).getUid();
        o.LJIIIIZZ(uid, "fromUser.uid");
        Context context = ((SingleChatNoticeAssem) aqS164S0200000_1.l0).getContainerView().getContext();
        o.LJIIIIZZ(context, "containerView.context");
        N3.gv0(context, uid);
        SingleChatNoticeViewModel N32 = ((SingleChatNoticeAssem) aqS164S0200000_1.l0).N3();
        boolean z = true;
        if (((IMUser) aqS164S0200000_1.l1).getFollowerStatus() != 1) {
            z = false;
        }
        C102303zu c102303zu = N32.LJLJI;
        String enterMethod = ((C99033ud) N32.LJLJJL.getValue()).getEnterMethod();
        c102303zu.getClass();
        C102303zu.LIZLLL("chat", enterMethod, z);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$18(AqS164S0200000_1 aqS164S0200000_1, Object obj, Object obj2) {
        aqS164S0200000_1.invoke$0((C3C8) obj, (C43I) obj2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$19(AqS164S0200000_1 aqS164S0200000_1, Object obj, Object obj2) {
        EnumC57435MgR oldRelationStatusType = (EnumC57435MgR) obj;
        EnumC57435MgR newRelationStatusType = (EnumC57435MgR) obj2;
        o.LJIIIZ(oldRelationStatusType, "oldRelationStatusType");
        o.LJIIIZ(newRelationStatusType, "newRelationStatusType");
        ((AnonymousClass357) aqS164S0200000_1.l0).LIZLLL.invoke((UserRecommendationContent.RecUserInfo) aqS164S0200000_1.l1, Integer.valueOf(oldRelationStatusType.getValue()), Integer.valueOf(newRelationStatusType.getValue()));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS164S0200000_1 aqS164S0200000_1, Object obj, Object obj2) {
        String remarkName;
        ((Boolean) obj).booleanValue();
        MafChatListWidget mafChatListWidget = (MafChatListWidget) aqS164S0200000_1.l0;
        RecUser recUser = (RecUser) aqS164S0200000_1.l1;
        mafChatListWidget.getClass();
        IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
        o.LJIIIIZZ(createIIMServicebyMonsterPlugin, "get()");
        if (TextUtils.isEmpty(recUser.getRemarkName())) {
            remarkName = recUser.getNickname();
        } else {
            remarkName = recUser.getRemarkName();
        }
        C98593tv c98593tv = new C98593tv((Context) mafChatListWidget.LJLLL, IMUser.fromUser(recUser));
        c98593tv.setEnterFromForMob("notification_page");
        c98593tv.setEnterMethodForMob("guide_dm");
        Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("enter_from", "notification_page"), new OSZ("enter_method", "guide_dm"), new OSZ("message_type", "emoji"), new OSZ("message_from", "greeting_button"));
        InterfaceC57106Mb8 imSayHiService = createIIMServicebyMonsterPlugin.getImSayHiService();
        ActivityC45651qj activityC45651qj = mafChatListWidget.LJLLL;
        String uid = recUser.getUid();
        o.LJIIIIZZ(uid, "user.uid");
        imSayHiService.LJIIIZ(activityC45651qj, uid, remarkName, true, LJJLIIIIJ, new AqS153S0100000_3(mafChatListWidget, 1475), new AqS148S0200000_1(createIIMServicebyMonsterPlugin, c98593tv, 27));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$20(AqS164S0200000_1 aqS164S0200000_1, Object selectSubscribe, Object obj) {
        C43I it = (C43I) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(it, "it");
        if (((Boolean) it.LIZ).booleanValue()) {
            ((C95643pA) aqS164S0200000_1.l0).LIZIZ(0, (View) aqS164S0200000_1.l1);
        } else {
            ((C95643pA) aqS164S0200000_1.l0).LJFF().LJFF();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$21(AqS164S0200000_1 aqS164S0200000_1, Object obj, Object obj2) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (o.LJ(((InterfaceC82723Mm) aqS164S0200000_1.l0).getSessionId(), obj2)) {
            ((C3TO) ((InterfaceC82723Mm) aqS164S0200000_1.l0)).setShowCameraIcon(true);
            if (booleanValue) {
                C3T9 c3t9 = (C3T9) aqS164S0200000_1.l1;
                InterfaceC82723Mm interfaceC82723Mm = (InterfaceC82723Mm) aqS164S0200000_1.l0;
                c3t9.getClass();
                final String sessionId = interfaceC82723Mm.getSessionId();
                InterfaceC82853Mz interfaceC82853Mz = new InterfaceC82853Mz(sessionId) { // from class: X.3T8
                    public final String LIZ;
                    public final boolean LIZIZ;
                    public final String LIZJ;

                    @Override // X.InterfaceC82853Mz
                    public final String LIZ() {
                        return this.LIZJ;
                    }

                    @Override // X.InterfaceC82853Mz
                    public final String LIZIZ() {
                        return this.LIZ;
                    }

                    {
                        o.LJIIIZ(sessionId, "targetSessionId");
                        this.LIZ = sessionId;
                        this.LIZIZ = false;
                        this.LIZJ = "SessionVOCameraIconDecorator-Operation";
                    }

                    @Override // X.InterfaceC82853Mz
                    public final InterfaceC82723Mm LIZJ(InterfaceC82723Mm sessionVO) {
                        o.LJIIIZ(sessionVO, "sessionVO");
                        if (!(sessionVO instanceof C3TO)) {
                            return sessionVO;
                        }
                        ((C3TO) sessionVO).setShowCameraIcon(this.LIZIZ);
                        return sessionVO;
                    }
                };
                InterfaceC88472Yns<? super InterfaceC82853Mz, C76800UCe> interfaceC88472Yns = c3t9.LJLIL;
                if (interfaceC88472Yns != null) {
                    interfaceC88472Yns.invoke(interfaceC82853Mz);
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$22(AqS164S0200000_1 aqS164S0200000_1, Object obj, Object obj2) {
        ((Boolean) obj).booleanValue();
        BaseChatPanel baseChatPanel = (BaseChatPanel) aqS164S0200000_1.l0;
        String uid = ((IMUser) aqS164S0200000_1.l1).getUid();
        o.LJIIIIZZ(uid, "uid");
        baseChatPanel.LJIILJJIL(uid);
        boolean z = true;
        if (((IMUser) aqS164S0200000_1.l1).getFollowerStatus() != 1) {
            z = false;
        }
        C102303zu.LIZLLL("chat", ((BaseChatPanel) aqS164S0200000_1.l0).LJLJJI.getEnterMethod(), z);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS164S0200000_1 aqS164S0200000_1, Object obj, Object status) {
        int i;
        EnumC97443s4 type;
        int i2;
        int i3;
        int i4;
        UIAssem selectSubscribe = (UIAssem) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(status, "status");
        C73305Spp v3 = ((MessageRequestStatusAssem) aqS164S0200000_1.l0).v3();
        int i5 = 0;
        if (!o.LJ(status, C4TU.LIZ)) {
            i = 0;
        } else {
            i = 8;
        }
        v3.setVisibility(i);
        if (o.LJ(status, C4TQ.LIZ)) {
            C109774Sn c109774Sn = (C109774Sn) ((MessageRequestStatusAssem) aqS164S0200000_1.l0).LJLILLLLZI.getValue();
            if (c109774Sn == null || (type = c109774Sn.LJLIL) == null) {
                type = new C109774Sn(i5).LJLIL;
            }
            C73305Spp v32 = ((MessageRequestStatusAssem) aqS164S0200000_1.l0).v3();
            Context context = selectSubscribe.getContainerView().getContext();
            o.LJIIIIZZ(context, "containerView.context");
            o.LJIIIZ(type, "type");
            C73306Spq c73306Spq = new C73306Spq();
            C2068389v c2068389v = new C2068389v();
            int[] iArr = C109764Sm.LIZ;
            int i6 = iArr[type.ordinal()];
            if (i6 != 1) {
                if (i6 == 2 || i6 == 3) {
                    i2 = R.raw.icon_2pt_paperplane;
                } else {
                    throw new C162476Zf();
                }
            } else {
                i2 = R.raw.icon_large_inbox;
            }
            c2068389v.LIZ = i2;
            c2068389v.LJ = Integer.valueOf(R.attr.gp);
            c2068389v.LIZJ = C7MY.LIZIZ(70);
            c2068389v.LIZIZ = C7MY.LIZIZ(70);
            c73306Spq.LIZJ = 0;
            c73306Spq.LIZIZ = c2068389v;
            int i7 = iArr[type.ordinal()];
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 == 3) {
                        i3 = R.string.i3i;
                    } else {
                        throw new C162476Zf();
                    }
                } else {
                    i3 = R.string.i3g;
                }
            } else {
                i3 = R.string.h9i;
            }
            String string = context.getString(i3);
            o.LJIIIIZZ(string, "context.getString(type.getTitle())");
            c73306Spq.LJFF = string;
            int i8 = iArr[type.ordinal()];
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 == 3) {
                        i4 = R.string.i3h;
                    } else {
                        throw new C162476Zf();
                    }
                } else {
                    i4 = R.string.i3f;
                }
            } else {
                i4 = R.string.h9h;
            }
            String string2 = context.getString(i4);
            o.LJIIIIZZ(string2, "context.getString(type.getDesc())");
            c73306Spq.LJI = string2;
            v32.setStatus(c73306Spq);
        } else if (o.LJ(status, C4TS.LIZ)) {
            ((MessageRequestStatusAssem) aqS164S0200000_1.l0).v3().LJFF();
        } else if (o.LJ(status, C4TT.LIZ)) {
            C73305Spp v33 = ((MessageRequestStatusAssem) aqS164S0200000_1.l0).v3();
            C73306Spq c73306Spq2 = new C73306Spq();
            C73312Spw.LJI(c73306Spq2, new AqS148S0200000_1((MessageRequestStatusAssem) aqS164S0200000_1.l0, selectSubscribe, 14));
            v33.setStatus(c73306Spq2);
        } else if (o.LJ(status, C4TR.LIZ)) {
            C26045AKb c26045AKb = new C26045AKb((View) aqS164S0200000_1.l1);
            c26045AKb.LJIIIZ("");
            c26045AKb.LJIIJ();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS164S0200000_1 aqS164S0200000_1, Object obj, Object obj2) {
        TuxTextView tuxTextView;
        ViewGroup viewGroup;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (!((SessionListViewHolder) aqS164S0200000_1.l0).L() && o.LJ(((C3L4) aqS164S0200000_1.l1).LJFF(), obj2)) {
            TuxIconView tuxIconView = ((SessionListViewHolder) aqS164S0200000_1.l0).LLD;
            if (tuxIconView != null) {
                C17N.LJJLIIIJJI(tuxIconView);
            }
            if (booleanValue) {
                C3TV c3tv = C3TV.LIZ;
                C3L4 c3l4 = (C3L4) aqS164S0200000_1.l1;
                RelationButton relationButton = ((SessionListViewHolder) aqS164S0200000_1.l0).LJZ;
                boolean z = true;
                if ((relationButton == null || relationButton.getVisibility() != 0) && (tuxTextView = ((SessionListViewHolder) aqS164S0200000_1.l0).LJZI) != null && tuxTextView.getVisibility() == 0) {
                }
                TuxIconView tuxIconView2 = ((SessionListViewHolder) aqS164S0200000_1.l0).LLD;
                if (tuxIconView2 == null || tuxIconView2.getVisibility() != 0) {
                    z = false;
                }
                C3TV.LJI(c3tv, c3l4, z, ((SessionListViewHolder) aqS164S0200000_1.l0).LLIIJI);
                if (C96573qf.LJ() && (viewGroup = ((SessionListViewHolder) aqS164S0200000_1.l0).LJLLILLLL) != null) {
                    C17N.LJJLIIIJJI(viewGroup);
                }
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    public static final Object invoke$5(AqS164S0200000_1 aqS164S0200000_1, Object selectSubscribe, Object obj) {
        int i;
        ?? arrayList;
        OSZ osz = (OSZ) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(osz, "<name for destructuring parameter 0>");
        List list = (List) osz.getFirst();
        String str = (String) osz.getSecond();
        SearchResultListAssem searchResultListAssem = (SearchResultListAssem) aqS164S0200000_1.l0;
        View view = (View) aqS164S0200000_1.l1;
        SYL syl = searchResultListAssem.LJLILLLLZI;
        if (syl != null) {
            boolean z = true;
            if (str.length() > 0) {
                i = 0;
            } else {
                i = 8;
            }
            syl.setVisibility(i);
            SYL syl2 = searchResultListAssem.LJLILLLLZI;
            if (syl2 != null) {
                if (syl2.getVisibility() != 0) {
                    z = false;
                }
                syl2.setNestedScrollingEnabled(z);
                SYL syl3 = searchResultListAssem.LJLILLLLZI;
                if (syl3 != null) {
                    if (syl3.getVisibility() == 0) {
                        if (list.isEmpty()) {
                            arrayList = C47261Igj.LJJIJ(new C91733ir(C88913eJ.LIZ(view, R.string.h8v, "view.context.getString(R.string.im_search_empty)")));
                        } else {
                            arrayList = new ArrayList(C32I.LJJL(list, 10));
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(new C93613lt((IMUser) it.next(), str));
                            }
                        }
                        SYL syl4 = searchResultListAssem.LJLILLLLZI;
                        if (syl4 != null) {
                            syl4.getState().LJIILLIIL(arrayList);
                        } else {
                            o.LJIJI("searchResultPowerList");
                            throw null;
                        }
                    }
                    return C76800UCe.LIZ;
                }
                o.LJIJI("searchResultPowerList");
                throw null;
            }
            o.LJIJI("searchResultPowerList");
            throw null;
        }
        o.LJIJI("searchResultPowerList");
        throw null;
    }

    public static final Object invoke$6(AqS164S0200000_1 aqS164S0200000_1, Object selectSubscribe, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        C98453th c98453th = (C98453th) ((IMSearchAssem) aqS164S0200000_1.l0).LJLILLLLZI.getValue();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("isResultPageVisible ");
        LIZ.append(booleanValue);
        c98453th.LJFF(X1D.LIZIZ(LIZ));
        if (booleanValue) {
            C17N.LJJIIJZLJL(((View) aqS164S0200000_1.l1).findViewById(R.id.jex));
            C17N.LJJLIIIJJI(((View) aqS164S0200000_1.l1).findViewById(R.id.jh5));
        } else {
            C17N.LJJLIIIJJI(((View) aqS164S0200000_1.l1).findViewById(R.id.jex));
            C17N.LJJIIJZLJL(((View) aqS164S0200000_1.l1).findViewById(R.id.jh5));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS164S0200000_1 aqS164S0200000_1, Object selectSubscribe, Object obj) {
        ((Boolean) obj).booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        ((C98453th) ((IMSearchDefaultAssem) aqS164S0200000_1.l0).LJLJI.getValue()).LJFF("reset animator");
        RecyclerView recyclerView = (RecyclerView) ((View) aqS164S0200000_1.l1).findViewById(R.id.jey);
        C40171ht c40171ht = new C40171ht();
        c40171ht.LIZJ = 200L;
        c40171ht.LJ = 200L;
        c40171ht.LIZLLL = 200L;
        c40171ht.LJFF = 0L;
        recyclerView.setItemAnimator(c40171ht);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS164S0200000_1 aqS164S0200000_1, Object selectSubscribe, Object obj) {
        List list = (List) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (list == null) {
            list = C61878OQg.INSTANCE;
        }
        C98453th c98453th = (C98453th) ((IMSearchDefaultAssem) aqS164S0200000_1.l0).LJLJI.getValue();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("defaultContentList size ");
        LIZ.append(list.size());
        c98453th.LJFF(X1D.LIZIZ(LIZ));
        ((SYL) ((View) aqS164S0200000_1.l1).findViewById(R.id.jey)).getState().LJIIJJI(list);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS164S0200000_1 aqS164S0200000_1, Object selectSubscribe, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (booleanValue) {
            ((C98453th) ((IMSearchDefaultAssem) aqS164S0200000_1.l0).LJLJI.getValue()).LJFF("scroll to top");
            ((View) aqS164S0200000_1.l1).findViewById(R.id.jey).post(new ARunnableS37S0100000_1((View) aqS164S0200000_1.l1, 43));
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS164S0200000_1(InterfaceC82723Mm interfaceC82723Mm, C3T9 c3t9, int i) {
        super(2);
        this.$t = i;
        this.l0 = interfaceC82723Mm;
        this.l1 = c3t9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS164S0200000_1(C95643pA c95643pA, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = c95643pA;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS164S0200000_1(C4EF c4ef, TakoInputView takoInputView, int i) {
        super(2);
        this.$t = i;
        this.l0 = c4ef;
        this.l1 = takoInputView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS164S0200000_1(InterfaceC88471Ynr interfaceC88471Ynr, XKQ xkq, int i) {
        super(2);
        this.$t = i;
        this.l0 = interfaceC88471Ynr;
        this.l1 = xkq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS164S0200000_1(Context context, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = view;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS164S0200000_1(View view, GroupChatNavAssem groupChatNavAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = view;
        this.l1 = groupChatNavAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS164S0200000_1(View view, IMSearchAssem iMSearchAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = iMSearchAssem;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS164S0200000_1(QuickTitleBarCenterSingleAssem quickTitleBarCenterSingleAssem, LifecycleOwner lifecycleOwner, int i) {
        super(2);
        this.$t = i;
        this.l0 = quickTitleBarCenterSingleAssem;
        this.l1 = lifecycleOwner;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS164S0200000_1(BaseChatPanel baseChatPanel, IMUser iMUser, int i) {
        super(2);
        this.$t = i;
        this.l0 = baseChatPanel;
        this.l1 = iMUser;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS164S0200000_1(SingleChatNoticeAssem singleChatNoticeAssem, IMUser iMUser, int i) {
        super(2);
        this.$t = i;
        this.l0 = singleChatNoticeAssem;
        this.l1 = iMUser;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS164S0200000_1(GroupDetailViewModel groupDetailViewModel, GroupChatDetailAssem groupChatDetailAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = groupDetailViewModel;
        this.l1 = groupChatDetailAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS164S0200000_1(GroupTitleCell groupTitleCell, C95233oV c95233oV, int i) {
        super(2);
        this.$t = i;
        this.l0 = groupTitleCell;
        this.l1 = c95233oV;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS164S0200000_1(MafChatListWidget mafChatListWidget, RecUser recUser, int i) {
        super(2);
        this.$t = i;
        this.l0 = mafChatListWidget;
        this.l1 = recUser;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS164S0200000_1(MessageRequestStatusAssem messageRequestStatusAssem, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = messageRequestStatusAssem;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS164S0200000_1(SessionListViewHolder sessionListViewHolder, C3L4 c3l4, int i) {
        super(2);
        this.$t = i;
        this.l0 = sessionListViewHolder;
        this.l1 = c3l4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS164S0200000_1(SearchResultListAssem searchResultListAssem, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = searchResultListAssem;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS164S0200000_1(IMSearchDefaultAssem iMSearchDefaultAssem, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = iMSearchDefaultAssem;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS164S0200000_1(IMSearchResultAssem iMSearchResultAssem, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = iMSearchResultAssem;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS164S0200000_1(User user, C56916MVk c56916MVk, int i) {
        super(2);
        this.$t = i;
        this.l0 = user;
        this.l1 = c56916MVk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS164S0200000_1(MutualRelationEmptyCell mutualRelationEmptyCell, C93973mT c93973mT, int i) {
        super(2);
        this.$t = i;
        this.l0 = mutualRelationEmptyCell;
        this.l1 = c93973mT;
    }
}
