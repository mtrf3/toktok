package kotlin.jvm.internal;

import X.ARI;
import X.ARN;
import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C107064Ic;
import X.C113554cx;
import X.C188727au;
import X.C243079gN;
import X.C29822Bn8;
import X.C34B;
import X.C40342FsQ;
import X.C40343FsR;
import X.C40658FxW;
import X.C41835GbP;
import X.C42193GhB;
import X.C4MW;
import X.C4R2;
import X.C61295O3v;
import X.C73849Syb;
import X.C74189T9t;
import X.C76800UCe;
import X.C781935b;
import X.C88903eI;
import X.C89303ew;
import X.C89313ex;
import X.C89333ez;
import X.C91843j2;
import X.C97863sk;
import X.FMX;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC92803ka;
import X.KNV;
import X.OSZ;
import X.TA5;
import X.X1D;
import X.XKX;
import android.content.Context;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.activitystatus.ActivityStatusViewModelImpl;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.TextContent;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.videosticker.stickerlist.VideoStickerContentCell;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.singlechat.ChatBusinessAccountViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.FakeMessageViewModel;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.assems.MessageRequestDeleteAllBtnAssem;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui.MessageRequestViewModel;
import com.ss.android.ugc.aweme.im.service.model.ActivityStatus;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.prop.mobileefffect.EffectEditVM;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class AqS55S1100000_1 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l1;
    public String s0;

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
            case 12:
                return invoke$12(this, obj);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return invoke$16(this, obj);
            case 17:
                return invoke$17(this, obj);
            case 18:
                return invoke$18(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke$0(android.view.View r15) {
        /*
            r14 = this;
            java.lang.String r0 = "it"
            r1 = r15
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            X.3eF r2 = X.C88873eF.LIZ
            r3 = r14
            java.lang.Object r0 = r3.l1
            com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.videosticker.stickerlist.VideoStickerContentCell r0 = (com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.videosticker.stickerlist.VideoStickerContentCell) r0
            com.ss.android.ugc.aweme.emoji.stickerstore.model.VideoSticker r1 = r0.LJLJLLL
            java.lang.String r0 = r3.s0
            com.ss.android.ugc.aweme.sharer.model.SharePackage r4 = r2.LIZLLL(r1, r0)
            java.lang.String r7 = r3.s0
            java.lang.String r8 = "click"
            java.lang.Object r0 = r3.l1
            com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.videosticker.stickerlist.VideoStickerContentCell r0 = (com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.videosticker.stickerlist.VideoStickerContentCell) r0
            com.ss.android.ugc.aweme.emoji.stickerstore.model.VideoSticker r0 = r0.LJLJLLL
            r10 = 0
            if (r0 == 0) goto L79
            java.lang.Long r0 = r0.getVideoStickerId()
            if (r0 == 0) goto L79
            java.lang.String r9 = r0.toString()
        L2c:
            java.lang.Object r0 = r3.l1
            com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.videosticker.stickerlist.VideoStickerContentCell r0 = (com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.videosticker.stickerlist.VideoStickerContentCell) r0
            com.ss.android.ugc.aweme.emoji.stickerstore.model.VideoSticker r0 = r0.LJLJLLL
            if (r0 == 0) goto L3e
            java.lang.Long r0 = r0.getOriginVideoId()
            if (r0 == 0) goto L3e
            java.lang.String r10 = r0.toString()
        L3e:
            java.lang.Object r0 = r3.l1
            com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.videosticker.stickerlist.VideoStickerContentCell r0 = (com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.videosticker.stickerlist.VideoStickerContentCell) r0
            com.ss.android.ugc.aweme.emoji.stickerstore.model.VideoSticker r0 = r0.LJLJLLL
            if (r0 == 0) goto L52
            java.lang.Integer r2 = r0.getStatus()
            X.3bk r0 = X.EnumC87323bk.IN_STORE
            int r1 = r0.getStatus()
            if (r2 != 0) goto L71
        L52:
            r0 = 0
        L53:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r0)
            java.lang.String r12 = "send_to_friends"
            r6 = 0
            X.C87393br.LJIL(r7, r8, r9, r10, r11, r12)
            java.lang.String r5 = "chat_merge"
            r13 = 4080(0xff0, float:5.717E-42)
            r7 = r6
            r8 = r6
            r9 = r6
            r10 = r6
            r11 = r6
            r12 = r6
            X.C87393br.LJJIFFI(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            android.app.Activity r1 = com.ss.android.ugc.aweme.utils.ActivityStack.getValidTopActivity()
            if (r1 != 0) goto L7b
            return
        L71:
            int r0 = r2.intValue()
            if (r0 != r1) goto L52
            r0 = 1
            goto L53
        L79:
            r9 = r10
            goto L2c
        L7b:
            boolean r9 = X.C3UE.LIZ()
            r8 = 1
            X.4NH r0 = new X.4NH
            r2 = r6
            r3 = r6
            r4 = r4
            r5 = r6
            r6 = r6
            r7 = r6
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            X.C16880lQ.LIZ(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS55S1100000_1.invoke$0(android.view.View):void");
    }

    public static final Object invoke$0(AqS55S1100000_1 aqS55S1100000_1, Object obj) {
        C74189T9t it = (C74189T9t) obj;
        o.LJIIIZ(it, "it");
        XKX.LIZLLL(((EffectEditVM) aqS55S1100000_1.l1).getAssemVMScope(), null, null, new TA5(it, (EffectEditVM) aqS55S1100000_1.l1, aqS55S1100000_1.s0, null), 3);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AqS55S1100000_1 aqS55S1100000_1, Object obj) {
        aqS55S1100000_1.invoke$0((View) obj);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AqS55S1100000_1 aqS55S1100000_1, Object it) {
        o.LJIIIZ(it, "it");
        ((List) aqS55S1100000_1.l1).add(new OSZ(aqS55S1100000_1.s0, it));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(AqS55S1100000_1 aqS55S1100000_1, Object obj) {
        C91843j2 setState = (C91843j2) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C91843j2.LIZ(setState, null, null, new OSZ(C40658FxW.LJJZZIII((List) aqS55S1100000_1.l1, IMUser.class), aqS55S1100000_1.s0), 3);
    }

    public static final Object invoke$12(AqS55S1100000_1 aqS55S1100000_1, Object obj) {
        String str;
        String str2;
        String str3;
        User author;
        JSONObject sendEventTrackingAsync = (JSONObject) obj;
        o.LJIIIZ(sendEventTrackingAsync, "$this$sendEventTrackingAsync");
        Aweme aweme = (Aweme) aqS55S1100000_1.l1;
        Integer num = null;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        sendEventTrackingAsync.put("group_id", str);
        Aweme aweme2 = (Aweme) aqS55S1100000_1.l1;
        if (aweme2 != null) {
            str2 = aweme2.getAuthorUid();
        } else {
            str2 = null;
        }
        sendEventTrackingAsync.put("author_id", str2);
        Aweme aweme3 = (Aweme) aqS55S1100000_1.l1;
        if (aweme3 != null) {
            str3 = aweme3.getRequestId();
        } else {
            str3 = null;
        }
        sendEventTrackingAsync.put("req_id", str3);
        sendEventTrackingAsync.put("enter_from", aqS55S1100000_1.s0);
        sendEventTrackingAsync.put("enter_method", "story_card");
        Aweme aweme4 = (Aweme) aqS55S1100000_1.l1;
        if (aweme4 != null && (author = aweme4.getAuthor()) != null) {
            num = Integer.valueOf(author.getFollowStatus());
        }
        sendEventTrackingAsync.put("follow_status", num);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$13(AqS55S1100000_1 aqS55S1100000_1, Object it) {
        o.LJIIIZ(it, "it");
        ((MessageRequestViewModel) ((MessageRequestDeleteAllBtnAssem) aqS55S1100000_1.l1).LJLIL.getValue()).hv0().LIZLLL();
        C97863sk.LIZIZ(aqS55S1100000_1.s0, "delete");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$14(AqS55S1100000_1 aqS55S1100000_1, Object obj) {
        C89313ex it = (C89313ex) obj;
        o.LJIIIZ(it, "it");
        if (!it.LJLILLLLZI && it.LJLIL != null) {
            ((ChatBusinessAccountViewModel) aqS55S1100000_1.l1).setState(C89303ew.LJLIL);
            final ChatBusinessAccountViewModel chatBusinessAccountViewModel = (ChatBusinessAccountViewModel) aqS55S1100000_1.l1;
            String str = aqS55S1100000_1.s0;
            final String str2 = it.LJLIL;
            chatBusinessAccountViewModel.getClass();
            TextContent obtain$default = TextContent.Companion.obtain$default(TextContent.Companion, str, null, null, 6, null);
            obtain$default.type = 706;
            C4MW c4mw = (C4MW) C88903eI.LIZ();
            c4mw.LIZ.LIZIZ = ((C89333ez) chatBusinessAccountViewModel.LJLIL.getValue()).LJLIL.getConversationId();
            c4mw.LIZLLL(obtain$default);
            c4mw.LIZ("ttba_qa");
            c4mw.LIZ.LJII = C113554cx.LJJLIIIIJ(new OSZ("enter_method", "click_get_started_button"));
            c4mw.LJII(new InterfaceC92803ka() { // from class: X.2xw
                @Override // X.InterfaceC92793kZ
                public final void LIZ(C63120Opw c63120Opw, List<? extends C109544Rq> list) {
                }

                @Override // X.InterfaceC92803ka
                public final void LIZIZ(C63120Opw c63120Opw, C109544Rq c109544Rq) {
                }

                @Override // X.InterfaceC92793kZ
                public final void LIZJ(C63120Opw c63120Opw, C109544Rq c109544Rq) {
                }

                @Override // X.InterfaceC92803ka
                public final void LIZLLL(C63120Opw c63120Opw, List<C109544Rq> list, java.util.Map<C109544Rq, C63623Oy3> map) {
                }

                @Override // X.InterfaceC92803ka
                public final void LJ(C63120Opw c63120Opw, C109544Rq c109544Rq, C63623Oy3 c63623Oy3) {
                }

                @Override // X.InterfaceC92803ka
                public final void LJFF(C63120Opw c63120Opw, C109544Rq c109544Rq) {
                    XKX.LIZLLL(ChatBusinessAccountViewModel.this.getAssemVMScope(), null, null, new C75592xv(str2, null), 3);
                }
            });
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$15(AqS55S1100000_1 aqS55S1100000_1, Object obj) {
        C41835GbP param = (C41835GbP) obj;
        o.LJIIIZ(param, "param");
        int bindingAdapterPosition = ((C4R2) aqS55S1100000_1.l1).getBindingAdapterPosition() + 1;
        String enterFrom = ((C4R2) aqS55S1100000_1.l1).LJLIL.LJFF();
        String str = ((C4R2) aqS55S1100000_1.l1).LJLJLLL;
        o.LJIIIIZZ(enterFrom, "enterFrom");
        return C41835GbP.L(param, enterFrom, aqS55S1100000_1.s0, bindingAdapterPosition, "dm", str, 365);
    }

    public static final Object invoke$16(AqS55S1100000_1 aqS55S1100000_1, Object it) {
        o.LJIIIZ(it, "it");
        String str = aqS55S1100000_1.s0;
        C188727au LIZLLL = KNV.LIZLLL(str, "enterFrom");
        LIZLLL.LJIIIZ("enter_from", str);
        FMX.LJIIL("deny_avatar_camera", LIZLLL.LIZ);
        ((InterfaceC88472Yns) aqS55S1100000_1.l1).invoke(Boolean.FALSE);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$17(AqS55S1100000_1 aqS55S1100000_1, Object $receiver) {
        o.LJIIIZ($receiver, "$this$$receiver");
        C73849Syb<ActivityStatus> c73849Syb = ((ActivityStatusViewModelImpl) aqS55S1100000_1.l1).LJLJJLL.get(aqS55S1100000_1.s0);
        if (c73849Syb != null && c73849Syb.LJLILLLLZI.get().length == 0) {
            ActivityStatusViewModelImpl activityStatusViewModelImpl = (ActivityStatusViewModelImpl) aqS55S1100000_1.l1;
            activityStatusViewModelImpl.LJLJJLL.remove(aqS55S1100000_1.s0);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$18(AqS55S1100000_1 aqS55S1100000_1, Object obj) {
        ((FakeMessageViewModel) aqS55S1100000_1.l1).LJLJJL.remove(aqS55S1100000_1.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS55S1100000_1 aqS55S1100000_1, Object obj) {
        ARN it = (ARN) obj;
        o.LJIIIZ(it, "it");
        it.LIZJ = true;
        LiveOuterService.LJJJLL().LJJIJIL().LJJJIL((ActivityC45651qj) aqS55S1100000_1.l1, UriProtector.parse(aqS55S1100000_1.s0));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS55S1100000_1 aqS55S1100000_1, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI(R.string.spn, C781935b.LJLIL);
        actionGroup.LJIIIIZZ(R.string.tq8, new AqS55S1100000_1((ActivityC45651qj) aqS55S1100000_1.l1, aqS55S1100000_1.s0, 2));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS55S1100000_1 aqS55S1100000_1, Object obj) {
        C61295O3v response = (C61295O3v) obj;
        o.LJIIIZ(response, "response");
        if (!response.LJZL || response.getFilePath() == null) {
            C34B.LIZJ("ChatRoomAnimationResHelper", response.LL.toString());
            InterfaceC88471Ynr interfaceC88471Ynr = (InterfaceC88471Ynr) aqS55S1100000_1.l1;
            if (interfaceC88471Ynr != null) {
                interfaceC88471Ynr.invoke(Boolean.FALSE, response.LL.toString());
            }
        } else {
            Map<String, String> map = C107064Ic.LIZ;
            String str = aqS55S1100000_1.s0;
            String filePath = response.getFilePath();
            if (filePath == null) {
                filePath = "";
            }
            map.put(str, filePath);
            C34B.LIZIZ("ChatRoomAnimationResHelper", String.valueOf(response.LLD));
            C34B.LIZIZ("ChatRoomAnimationResHelper", String.valueOf(response.getFilePath()));
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("is cache: ");
            LIZ.append(response.LLFF);
            C34B.LIZIZ("ChatRoomAnimationResHelper", X1D.LIZIZ(LIZ));
            InterfaceC88471Ynr interfaceC88471Ynr2 = (InterfaceC88471Ynr) aqS55S1100000_1.l1;
            if (interfaceC88471Ynr2 != null) {
                interfaceC88471Ynr2.invoke(Boolean.TRUE, response.getFilePath());
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS55S1100000_1 aqS55S1100000_1, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJII(C29822Bn8.LIZ((Context) aqS55S1100000_1.l1, R.string.p3y, "context.resources.getStr…ring.poistore_cta_switch)"), new AqS55S1100000_1((Context) aqS55S1100000_1.l1, aqS55S1100000_1.s0, 6));
        actionGroup.LJIIIZ(C29822Bn8.LIZ((Context) aqS55S1100000_1.l1, R.string.p3x, "context.resources.getStr…string.poistore_cta_cncl)"), new AqS26S1000000_1(aqS55S1100000_1.s0, 2));
        actionGroup.LJI = true;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS55S1100000_1 aqS55S1100000_1, Object it) {
        o.LJIIIZ(it, "it");
        String LIZ = C243079gN.LIZ(0, "claim_store");
        C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
        Context context = (Context) aqS55S1100000_1.l1;
        SparkContext LIZIZ = C42193GhB.LIZIZ(LIZ);
        c40342FsQ.getClass();
        C40342FsQ.LIZ(context, LIZIZ).LIZIZ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", aqS55S1100000_1.s0);
        linkedHashMap.put("action", "switch");
        FMX.LJIIL("claim_store_popup_result", linkedHashMap);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS55S1100000_1 aqS55S1100000_1, Object it) {
        o.LJIIIZ(it, "it");
        ((List) aqS55S1100000_1.l1).add(new OSZ(aqS55S1100000_1.s0, it));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS55S1100000_1 aqS55S1100000_1, Object it) {
        o.LJIIIZ(it, "it");
        ((List) aqS55S1100000_1.l1).add(new OSZ(aqS55S1100000_1.s0, it));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS55S1100000_1 aqS55S1100000_1, Object it) {
        o.LJIIIZ(it, "it");
        ((List) aqS55S1100000_1.l1).add(new OSZ(aqS55S1100000_1.s0, it));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS55S1100000_1(ActivityC45651qj activityC45651qj, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = activityC45651qj;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS55S1100000_1(C4R2 c4r2, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c4r2;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS55S1100000_1(InterfaceC88471Ynr interfaceC88471Ynr, InterfaceC88471Ynr<? super Boolean, ? super String, C76800UCe> interfaceC88471Ynr2, String str) {
        super(1);
        this.$t = str;
        this.l1 = interfaceC88471Ynr;
        this.s0 = interfaceC88471Ynr2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS55S1100000_1(Context context, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = context;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS55S1100000_1(Aweme aweme, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = aweme;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS55S1100000_1(ActivityStatusViewModelImpl activityStatusViewModelImpl, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = activityStatusViewModelImpl;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS55S1100000_1(VideoStickerContentCell videoStickerContentCell, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = videoStickerContentCell;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS55S1100000_1(ChatBusinessAccountViewModel chatBusinessAccountViewModel, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = chatBusinessAccountViewModel;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS55S1100000_1(FakeMessageViewModel fakeMessageViewModel, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = fakeMessageViewModel;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS55S1100000_1(MessageRequestDeleteAllBtnAssem messageRequestDeleteAllBtnAssem, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = messageRequestDeleteAllBtnAssem;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS55S1100000_1(EffectEditVM effectEditVM, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = effectEditVM;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS55S1100000_1(String str, String str2, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        super(1);
        this.$t = interfaceC88472Yns;
        this.s0 = str;
        this.l1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS55S1100000_1(List list, List<OSZ<String, String>> list2, String str) {
        super(1);
        this.$t = str;
        this.l1 = list;
        this.s0 = list2;
    }
}
