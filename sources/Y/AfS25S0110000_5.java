package Y;

import X.BCC;
import X.BMB;
import X.BPP;
import X.BR4;
import X.BZI;
import X.C025908h;
import X.C15380j0;
import X.C18210nZ;
import X.C28635BLr;
import X.C28787BRn;
import X.C28959BYd;
import X.C29306Beo;
import X.C2NU;
import X.C30840C8m;
import X.C30868C9o;
import X.C51029K0z;
import X.C73943T0h;
import X.CE9;
import X.CN1;
import X.CVT;
import X.EnumC28634BLq;
import X.InterfaceC28456BEu;
import X.InterfaceC28631BLn;
import X.InterfaceC30442Bx8;
import X.InterfaceC64592gB;
import com.bytedance.android.feed.api.ILiveFeedApiService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.adminsetting.LiveCommentSettingFragment;
import com.bytedance.android.livesdk.adminsetting.LiveCommentSettingFragmentSheet;
import com.bytedance.android.livesdk.dataChannel.InitGoodyBagChannel;
import com.bytedance.android.livesdk.drawerfeed.LiveDrawerDialogV3;
import com.bytedance.android.livesdk.drawerfeed.tab.DrawerTabsItem;
import com.bytedance.android.livesdk.feed.repository.BaseFeedRepository;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.viewmodel.GiftPrivilegeCenterViewModel;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.setting.SubscriptionSettingFragmentNew;
import com.bytedance.android.livesdk.model.message.Question;
import com.bytedance.android.livesdk.mvp.PaidRoomCheckDialog;
import com.bytedance.android.livesdk.qa.QuestionBatchRemoveQuestionEvent;
import com.bytedance.android.livesdk.qa.QuestionEx;
import com.bytedance.android.livesdk.qa.QuestionMoreOptionDialog;
import com.bytedance.android.livesdk.qa.QuestionRemoveQuestionChannel;
import com.bytedance.android.livesdk.subscribe.model.GetSubInfoResponse;
import com.bytedance.android.livesdk.subscribe.model.SubDataItemView;
import com.bytedance.android.livesdk.subscribe.model.SubDataOverview;
import com.bytedance.android.livesdk.subscribe.model.gift.SubGifInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import tikcast.api.privilege.QueryUserPrivilegesResponse;
import webcast.api.goody_bag.GetRoomGoodyBagResponse;

/* loaded from: classes6.dex */
public class AfS25S0110000_5 implements InterfaceC64592gB {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            case 3:
                accept$3(this, obj);
                return;
            case 4:
                accept$4(this, obj);
                return;
            case 5:
                accept$5(this, obj);
                return;
            case 6:
                accept$6(this, obj);
                return;
            case 7:
                accept$7(this, obj);
                return;
            case 8:
                accept$8(this, obj);
                return;
            case 9:
                accept$9(this, obj);
                return;
            case 10:
                accept$10(this, obj);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$0(AfS25S0110000_5 afS25S0110000_5, Object obj) {
        BaseResponse baseResponse = (BaseResponse) obj;
        DataChannel dataChannel = (DataChannel) afS25S0110000_5.l0;
        if (dataChannel != null) {
            dataChannel.rv0(InitGoodyBagChannel.class, baseResponse.data);
        }
        BR4.LJI(Integer.valueOf(baseResponse.statusCode), afS25S0110000_5.z1, (GetRoomGoodyBagResponse.ResponseData) baseResponse.data);
    }

    public static final void accept$1(AfS25S0110000_5 afS25S0110000_5, Object obj) {
        LiveDrawerDialogV3 liveDrawerDialogV3 = (LiveDrawerDialogV3) afS25S0110000_5.l0;
        List list = ((BaseListResponse) obj).data;
        liveDrawerDialogV3.LJLLL = list;
        boolean z = afS25S0110000_5.z1;
        if (!z) {
            liveDrawerDialogV3.Jl(list, z);
        } else {
            if (list == null || !(!list.isEmpty()) || !o.LJ("game", ((DrawerTabsItem) ListProtector.get(list, 0)).tabType)) {
                return;
            }
            ((ILiveFeedApiService) CN1.LIZ(ILiveFeedApiService.class)).lu(liveDrawerDialogV3.mo49getActivity(), "game");
        }
    }

    public static final void accept$10(AfS25S0110000_5 afS25S0110000_5, Object obj) {
        Object obj2;
        if (((BaseResponse) obj).statusCode == 0) {
            LiveCommentSettingFragmentSheet liveCommentSettingFragmentSheet = (LiveCommentSettingFragmentSheet) afS25S0110000_5.l0;
            boolean z = afS25S0110000_5.z1;
            liveCommentSettingFragmentSheet.getClass();
            HashMap hashMap = new HashMap();
            String str = "open";
            if (z) {
                obj2 = "open";
            } else {
                obj2 = "close";
            }
            hashMap.put("status", obj2);
            hashMap.put("situation", "comment_setting");
            BZI LIZ = C28787BRn.LIZ("livesdk_set_comment_status");
            if (!z) {
                str = "close";
            }
            LIZ.LJIJJ(str, "status");
            LIZ.LJIJJ("comment_setting", "situation");
            LIZ.LJIILLIIL(C51029K0z.LJIILIIL(liveCommentSettingFragmentSheet));
            LIZ.LJIIJJI("live_detail");
            LIZ.LJJIIJZLJL();
            InterfaceC30442Bx8.LLF.LIZ(Boolean.valueOf(afS25S0110000_5.z1));
            C73943T0h.LIZ().LIZIZ(new BCC(afS25S0110000_5.z1));
            return;
        }
        C30868C9o.LIZJ(R.string.mg2);
    }

    public static final void accept$2(AfS25S0110000_5 afS25S0110000_5, Object obj) {
        boolean z = afS25S0110000_5.z1;
        if (!z) {
            ((LiveDrawerDialogV3) afS25S0110000_5.l0).Jl(null, z);
        }
    }

    public static final void accept$3(AfS25S0110000_5 afS25S0110000_5, Object obj) {
        QueryUserPrivilegesResponse.Data data = ((QueryUserPrivilegesResponse) obj).data;
        if (data != null) {
            boolean z = data.showEntrance;
            boolean z2 = afS25S0110000_5.z1;
            GiftPrivilegeCenterViewModel giftPrivilegeCenterViewModel = (GiftPrivilegeCenterViewModel) afS25S0110000_5.l0;
            if (z == z2) {
                return;
            }
            giftPrivilegeCenterViewModel.LJLIL.postValue(Boolean.valueOf(z));
            InterfaceC30442Bx8.B2.LIZJ(Boolean.valueOf(z));
        }
    }

    public static final void accept$4(AfS25S0110000_5 afS25S0110000_5, Object obj) {
        int i;
        Integer num;
        SubGifInfo subGifInfo;
        SubDataOverview subDataOverview;
        SubDataItemView subDataItemView;
        String str;
        Integer LJJJJJ;
        CE9 ce9 = (CE9) obj;
        SubscriptionSettingFragmentNew subscriptionSettingFragmentNew = (SubscriptionSettingFragmentNew) afS25S0110000_5.l0;
        GetSubInfoResponse getSubInfoResponse = ce9.LJLIL;
        subscriptionSettingFragmentNew.LJLJJL = getSubInfoResponse;
        if (getSubInfoResponse != null && (subDataOverview = getSubInfoResponse.subOverview) != null && (subDataItemView = subDataOverview.activeSubscribersCount) != null && (str = subDataItemView.value) != null && (LJJJJJ = C29306Beo.LJJJJJ(str)) != null) {
            i = LJJJJJ.intValue();
        } else {
            i = 0;
        }
        C28959BYd.LIZIZ = i;
        GetSubInfoResponse getSubInfoResponse2 = subscriptionSettingFragmentNew.LJLJJL;
        if (getSubInfoResponse2 != null && (subGifInfo = getSubInfoResponse2.subGiftInfo) != null) {
            num = Integer.valueOf(subGifInfo.subGiftNum);
        } else {
            num = null;
        }
        long LIZ = C025908h.LIZ();
        Map<Long, Integer> LIZJ = InterfaceC30442Bx8.K0.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_SUB_GIFT_COUNT.value");
        LIZJ.put(Long.valueOf(LIZ), num);
        C30840C8m.LIZ = getSubInfoResponse;
        ((SubscriptionSettingFragmentNew) afS25S0110000_5.l0).LLFF = Boolean.valueOf(ce9.LJLILLLLZI);
        if (((SubscriptionSettingFragmentNew) afS25S0110000_5.l0).isViewValid()) {
            ((SubscriptionSettingFragmentNew) afS25S0110000_5.l0).lm(afS25S0110000_5.z1);
        }
    }

    public static final void accept$5(AfS25S0110000_5 afS25S0110000_5, Object obj) {
        ((CVT) ((PaidRoomCheckDialog) afS25S0110000_5.l0)._$_findCachedViewById(R.id.g94)).setVisibility(8);
        if (!afS25S0110000_5.z1) {
            ((PaidRoomCheckDialog) afS25S0110000_5.l0).loadError();
        }
        ((PaidRoomCheckDialog) afS25S0110000_5.l0).loadErrorMsg();
    }

    public static final void accept$6(AfS25S0110000_5 afS25S0110000_5, Object obj) {
        long j;
        User user;
        if (afS25S0110000_5.z1) {
            QuestionMoreOptionDialog questionMoreOptionDialog = (QuestionMoreOptionDialog) afS25S0110000_5.l0;
            DataChannel dataChannel = questionMoreOptionDialog.dataChannel;
            if (dataChannel != null) {
                Question question = questionMoreOptionDialog.LJLJI;
                if (question != null && (user = question.user) != null) {
                    j = user.getId();
                } else {
                    j = -1;
                }
                dataChannel.qv0(QuestionBatchRemoveQuestionEvent.class, Long.valueOf(j));
                return;
            }
            return;
        }
        QuestionMoreOptionDialog questionMoreOptionDialog2 = (QuestionMoreOptionDialog) afS25S0110000_5.l0;
        DataChannel dataChannel2 = questionMoreOptionDialog2.dataChannel;
        if (dataChannel2 == null) {
            return;
        }
        QuestionEx questionEx = questionMoreOptionDialog2.LJLIL;
        if (questionEx == null) {
            Question question2 = questionMoreOptionDialog2.LJLJI;
            o.LJI(question2);
            questionEx = new QuestionEx(question2, 0L, 0, false, false, false, 0L, 0, 0, 510, null);
        }
        dataChannel2.rv0(QuestionRemoveQuestionChannel.class, questionEx);
    }

    public static final void accept$7(AfS25S0110000_5 afS25S0110000_5, Object obj) {
        Throwable th = (Throwable) obj;
        BPP.LIZLLL(C15380j0.LIZLLL(), th, R.string.svg);
        InterfaceC28456BEu interfaceC28456BEu = (InterfaceC28456BEu) ((WeakReference) afS25S0110000_5.l0).get();
        if (interfaceC28456BEu != null) {
            interfaceC28456BEu.Ze((Exception) th);
        }
        if (afS25S0110000_5.z1) {
            o.LJI(th);
            C18210nZ.LIZ("ttlive_add_admin", th).LJIIIZ();
        } else {
            o.LJI(th);
            C18210nZ.LIZ("ttlive_delete_admin", th).LJIIIZ();
        }
    }

    public static final void accept$8(AfS25S0110000_5 afS25S0110000_5, Object obj) {
        EnumC28634BLq enumC28634BLq;
        C28635BLr c28635BLr = (C28635BLr) afS25S0110000_5.l0;
        boolean z = afS25S0110000_5.z1;
        Throwable th = (Throwable) obj;
        InterfaceC28631BLn interfaceC28631BLn = c28635BLr.LJIIIIZZ;
        if (z) {
            enumC28634BLq = EnumC28634BLq.REFRESH;
        } else {
            enumC28634BLq = EnumC28634BLq.LOAD_MORE;
        }
        BaseFeedRepository baseFeedRepository = (BaseFeedRepository) interfaceC28631BLn;
        baseFeedRepository.getClass();
        boolean z2 = false;
        if (enumC28634BLq == EnumC28634BLq.REFRESH) {
            baseFeedRepository.LJLILLLLZI.onNext(BMB.FAIL);
            if (baseFeedRepository.LJLJJI != null) {
                C15380j0.LIZLLL();
                try {
                    z2 = C2NU.LIZ.LIZIZ();
                } catch (Exception unused) {
                }
                if (z2) {
                    baseFeedRepository.LJLJJI.LJIIIIZZ("refresh", th);
                    return;
                }
                return;
            }
            return;
        }
        if (enumC28634BLq == EnumC28634BLq.LOAD_MORE) {
            baseFeedRepository.LJLJI.onNext(BMB.FAIL);
            if (baseFeedRepository.LJLJJI != null) {
                C15380j0.LIZLLL();
                try {
                    z2 = C2NU.LIZ.LIZIZ();
                } catch (Exception unused2) {
                }
                if (z2) {
                    baseFeedRepository.LJLJJI.LJIIIIZZ("load_more", th);
                }
            }
        }
    }

    public static final void accept$9(AfS25S0110000_5 afS25S0110000_5, Object obj) {
        Object obj2;
        if (((BaseResponse) obj).statusCode == 0) {
            LiveCommentSettingFragment liveCommentSettingFragment = (LiveCommentSettingFragment) afS25S0110000_5.l0;
            boolean z = afS25S0110000_5.z1;
            liveCommentSettingFragment.getClass();
            HashMap hashMap = new HashMap();
            String str = "open";
            if (z) {
                obj2 = "open";
            } else {
                obj2 = "close";
            }
            hashMap.put("status", obj2);
            hashMap.put("situation", "comment_setting");
            BZI LIZ = C28787BRn.LIZ("livesdk_set_comment_status");
            if (!z) {
                str = "close";
            }
            LIZ.LJIJJ(str, "status");
            LIZ.LJIJJ("comment_setting", "situation");
            LIZ.LJIILLIIL(C51029K0z.LJIILIIL(liveCommentSettingFragment));
            LIZ.LJIIJJI("live_detail");
            LIZ.LJJIIJZLJL();
            InterfaceC30442Bx8.LLF.LIZ(Boolean.valueOf(afS25S0110000_5.z1));
            C73943T0h.LIZ().LIZIZ(new BCC(afS25S0110000_5.z1));
            return;
        }
        C30868C9o.LIZJ(R.string.mg2);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS25S0110000_5(com.bytedance.android.livesdk.drawerfeed.LiveDrawerDialogV3 r2, boolean r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 1: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.z1 = r3
            r0.l0 = r2
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.l0 = r2
            r0.z1 = r3
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS25S0110000_5.<init>(com.bytedance.android.livesdk.drawerfeed.LiveDrawerDialogV3, boolean, int):void");
    }

    public AfS25S0110000_5(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
