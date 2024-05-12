package Y;

import X.AbstractC28377BBt;
import X.AbstractC34571Xh;
import X.BAF;
import X.BUT;
import X.BVA;
import X.C06900Ow;
import X.C0NB;
import X.C15380j0;
import X.C15420j4;
import X.C19030ot;
import X.C28467BFf;
import X.C28708BOm;
import X.C28709BOn;
import X.C28881BVd;
import X.C29018BaA;
import X.C29180Bcm;
import X.C29352BfY;
import X.C29401Dk;
import X.C30868C9o;
import X.C31319CQx;
import X.C32537Cpp;
import X.C34K;
import X.C46104I7o;
import X.C55077LjV;
import X.C68322mC;
import X.C76907UGh;
import X.CN1;
import X.CRD;
import X.EnumC76908UGi;
import X.HandlerC29100BbU;
import X.InterfaceC116954iR;
import X.InterfaceC29405BgP;
import X.InterfaceC64592gB;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.T4Y;
import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.user.CoverImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.BroadcastSettingResponse;
import com.bytedance.android.live.broadcast.model.LivePermissionApplyResponse;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.gift.model.CpcPromptResponse;
import com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessWord;
import com.bytedance.android.livesdk.interaction.drawguess.network.StartDrawGuessResponse;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.model.message.Question;
import com.bytedance.android.livesdk.qa.QuestionEx;
import com.bytedance.android.livesdk.qa.QuestionListResponse;
import com.bytedance.android.livesdk.usercard.profilev3.TryModeLiveProfileDialog;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.live.feedpage.LiveStateResponse;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostWatch;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class AfS44S0300000_5 implements InterfaceC64592gB {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                accept$11(this, obj);
                return;
            case 12:
                accept$12(this, obj);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                accept$13(this, obj);
                return;
            case 14:
                accept$14(this, obj);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.CountDownTimer, T] */
    public static final void accept$0(AfS44S0300000_5 afS44S0300000_5, Object obj) {
        CpcPromptResponse cpcPromptResponse = (CpcPromptResponse) obj;
        ((C68322mC) afS44S0300000_5.l0).element = C76907UGh.LIZ((T4Y) afS44S0300000_5.l1, EnumC76908UGi.SCENE_3_LIVE_GOAL, cpcPromptResponse.prompt, cpcPromptResponse.redirectLinkText, cpcPromptResponse.giftFaq, false, null, (InterfaceC65784Pro) afS44S0300000_5.l2);
        C46104I7o.LJJJJLL(cpcPromptResponse);
    }

    public static final void accept$1(AfS44S0300000_5 afS44S0300000_5, Object obj) {
        ((C29352BfY) afS44S0300000_5.l0).LJJIFFI((FollowPair) afS44S0300000_5.l1, (Context) afS44S0300000_5.l2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$10(AfS44S0300000_5 afS44S0300000_5, Object obj) {
        if (obj != 0) {
            C0NB.LIZIZ("PortalLeaf", "loadAvartarSuccess");
            ((C34K) afS44S0300000_5.l0).element = true;
        }
        ((C68322mC) afS44S0300000_5.l1).element = obj;
        ((CountDownLatch) afS44S0300000_5.l2).countDown();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$11(AfS44S0300000_5 afS44S0300000_5, Object obj) {
        boolean z;
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse.statusCode == 0 && baseResponse.data != 0) {
            ArrayList arrayList = new ArrayList();
            C28881BVd c28881BVd = (C28881BVd) afS44S0300000_5.l0;
            if (c28881BVd.LJIIL || (c28881BVd.LJIIJJI && (!c28881BVd.LIZLLL || !c28881BVd.LIZJ))) {
                arrayList.add(new QuestionEx(new Question(0L, "", 11, 0L, new User()), 0L, 0, false, false, false, 0L, 0, 0, 504, null));
            }
            C28881BVd c28881BVd2 = (C28881BVd) afS44S0300000_5.l0;
            QuestionListResponse questionListResponse = (QuestionListResponse) baseResponse.data;
            c28881BVd2.LJJ = questionListResponse.unansweredList.hasMore;
            c28881BVd2.LJJI = questionListResponse.answeredList.hasMore;
            c28881BVd2.LJJIFFI = questionListResponse.invitedList.hasMore;
            if (!r4.questionExList.isEmpty()) {
                C28881BVd c28881BVd3 = (C28881BVd) afS44S0300000_5.l0;
                c28881BVd3.LJIILIIL += c28881BVd3.LJJ ? 1L : 0L;
                ArrayList<QuestionEx> arrayList2 = ((QuestionListResponse) baseResponse.data).unansweredList.questionExList;
                arrayList.addAll(arrayList2);
                ((ArrayList) c28881BVd3.LJIIZILJ).clear();
                ((ArrayList) c28881BVd3.LJIIZILJ).addAll(arrayList2);
            }
            if (!((C28881BVd) afS44S0300000_5.l0).LJJ && (!((QuestionListResponse) baseResponse.data).answeredList.questionExList.isEmpty())) {
                C28881BVd c28881BVd4 = (C28881BVd) afS44S0300000_5.l0;
                if (!c28881BVd4.LJIIJJI || !c28881BVd4.LIZJ) {
                    arrayList.add(new QuestionEx(new Question(0L, "", 12, 0L, new User()), 0L, 0, false, false, false, 0L, 0, 0, 504, null));
                }
                C28881BVd c28881BVd5 = (C28881BVd) afS44S0300000_5.l0;
                c28881BVd5.LJIJJ = true;
                c28881BVd5.LJIILJJIL += c28881BVd5.LJJI ? 1L : 0L;
                ArrayList<QuestionEx> arrayList3 = ((QuestionListResponse) baseResponse.data).answeredList.questionExList;
                arrayList.addAll(arrayList3);
                ((ArrayList) c28881BVd5.LJIJ).clear();
                ((ArrayList) c28881BVd5.LJIJ).addAll(arrayList3);
            }
            C28881BVd c28881BVd6 = (C28881BVd) afS44S0300000_5.l0;
            if (!c28881BVd6.LJJ && !c28881BVd6.LJJI && (!((QuestionListResponse) baseResponse.data).invitedList.questionExList.isEmpty())) {
                if (arrayList.isEmpty()) {
                    arrayList.add(new QuestionEx(new Question(0L, "", 14, 0L, new User()), 0L, 0, false, false, false, 0L, 0, 0, 504, null));
                }
                arrayList.add(new QuestionEx(new Question(0L, "", 13, 0L, new User()), 0L, 0, false, false, false, 0L, 0, 0, 504, null));
                C28881BVd c28881BVd7 = (C28881BVd) afS44S0300000_5.l0;
                c28881BVd7.LJIJJLI = true;
                c28881BVd7.LJIILL += c28881BVd7.LJJIFFI ? 1L : 0L;
                ArrayList arrayList4 = new ArrayList();
                Iterator<QuestionEx> it = ((QuestionListResponse) baseResponse.data).invitedList.questionExList.iterator();
                while (it.hasNext()) {
                    QuestionEx next = it.next();
                    next.LJLJI = true;
                    arrayList4.add(next);
                }
                arrayList.addAll(arrayList4);
                ((ArrayList) ((C28881BVd) afS44S0300000_5.l0).LJIJI).clear();
                ((ArrayList) ((C28881BVd) afS44S0300000_5.l0).LJIJI).addAll(arrayList4);
            }
            C28881BVd c28881BVd8 = (C28881BVd) afS44S0300000_5.l0;
            MutableLiveData<Boolean> mutableLiveData = c28881BVd8.LJIIIIZZ;
            if (c28881BVd8.LJJI || c28881BVd8.LJJ || c28881BVd8.LJJIFFI) {
                z = true;
            } else {
                z = false;
            }
            mutableLiveData.postValue(Boolean.valueOf(z));
            if (arrayList.size() != 0) {
                C28881BVd c28881BVd9 = (C28881BVd) afS44S0300000_5.l0;
                if ((!c28881BVd9.LJIIL && (!c28881BVd9.LJIIJJI || c28881BVd9.LIZJ)) || arrayList.size() != 1) {
                    ((C28881BVd) afS44S0300000_5.l0).LJII.postValue(Boolean.FALSE);
                    ((ArrayList) ((C28881BVd) afS44S0300000_5.l0).LJIILLIIL).clear();
                    ((ArrayList) ((C28881BVd) afS44S0300000_5.l0).LJIILLIIL).addAll(arrayList);
                    ((AbstractC34571Xh) afS44S0300000_5.l1).LIZIZ(arrayList.size(), arrayList);
                    MutableLiveData<C06900Ow> mutableLiveData2 = ((C28881BVd) afS44S0300000_5.l0).LJI;
                    C06900Ow c06900Ow = C06900Ow.LIZJ;
                    mutableLiveData2.postValue(c06900Ow);
                    ((C28881BVd) afS44S0300000_5.l0).LJFF.postValue(c06900Ow);
                    return;
                }
            }
            ((ArrayList) ((C28881BVd) afS44S0300000_5.l0).LJIILLIIL).clear();
            ((C28881BVd) afS44S0300000_5.l0).LJII.postValue(Boolean.TRUE);
            ((AbstractC34571Xh) afS44S0300000_5.l1).LIZ(new ArrayList());
            MutableLiveData<C06900Ow> mutableLiveData22 = ((C28881BVd) afS44S0300000_5.l0).LJI;
            C06900Ow c06900Ow2 = C06900Ow.LIZJ;
            mutableLiveData22.postValue(c06900Ow2);
            ((C28881BVd) afS44S0300000_5.l0).LJFF.postValue(c06900Ow2);
            return;
        }
        ((C28881BVd) afS44S0300000_5.l0).LJIILJJIL(new Exception(), (C19030ot) afS44S0300000_5.l2, (AbstractC34571Xh) afS44S0300000_5.l1);
    }

    public static final void accept$12(AfS44S0300000_5 afS44S0300000_5, Object obj) {
        Throwable throwable = (Throwable) obj;
        C28881BVd c28881BVd = (C28881BVd) afS44S0300000_5.l0;
        o.LJIIIIZZ(throwable, "throwable");
        c28881BVd.LJIILJJIL(throwable, (C19030ot) afS44S0300000_5.l1, (AbstractC34571Xh) afS44S0300000_5.l2);
    }

    public static final void accept$13(AfS44S0300000_5 afS44S0300000_5, Object obj) {
        BVA bva = (BVA) afS44S0300000_5.l0;
        ImageView imageView = (ImageView) afS44S0300000_5.l1;
        TextView textView = (TextView) afS44S0300000_5.l2;
        Throwable th = (Throwable) obj;
        bva.getClass();
        if (th instanceof C29401Dk) {
            C29401Dk c29401Dk = (C29401Dk) th;
            if (!TextUtils.isEmpty(c29401Dk.getPrompt())) {
                C30868C9o.LJI(c29401Dk.getPrompt());
            }
        }
        if (bva.LJLJJI.booleanValue()) {
            long j = bva.LJLJJL + 1;
            bva.LJLJJL = j;
            BVA.M(imageView, textView, R.drawable.d_k, R.attr.bnd, j);
        } else {
            long j2 = bva.LJLJJL - 1;
            bva.LJLJJL = j2;
            BVA.M(imageView, textView, R.drawable.cz7, R.attr.bnz, j2);
        }
        bva.LJLJJLL = false;
    }

    public static final void accept$14(AfS44S0300000_5 afS44S0300000_5, Object obj) {
        C55077LjV c55077LjV = (C55077LjV) afS44S0300000_5.l0;
        InterfaceC64592gB interfaceC64592gB = (InterfaceC64592gB) afS44S0300000_5.l1;
        List<com.ss.android.ugc.aweme.profile.model.User> list = (List) afS44S0300000_5.l2;
        LiveStateResponse liveStateResponse = (LiveStateResponse) obj;
        c55077LjV.getClass();
        if (liveStateResponse != null && interfaceC64592gB != null) {
            Map<Long, Long> map = liveStateResponse.mapUserIdRoomId.userRoomIdMap;
            if (map == null) {
                map = new HashMap<>(0);
            }
            c55077LjV.LIZIZ(list, map);
            interfaceC64592gB.accept(map);
        }
    }

    public static final void accept$2(AfS44S0300000_5 afS44S0300000_5, Object obj) {
        ((TryModeLiveProfileDialog) afS44S0300000_5.l0).LJLILLLLZI = ((InterfaceC29405BgP) afS44S0300000_5.l1).LJ();
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) afS44S0300000_5.l2;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public static final void accept$3(AfS44S0300000_5 afS44S0300000_5, Object obj) {
        User user = (User) obj;
        o.LJIIIZ(user, "user");
        long liveRoomId = user.getLiveRoomId();
        if (liveRoomId > 0) {
            EnterRoomConfig enterRoomConfig = (EnterRoomConfig) afS44S0300000_5.l0;
            enterRoomConfig.mRoomsData.roomId = liveRoomId;
            enterRoomConfig.mLogData.userFrom = liveRoomId;
            ((LiveHostWatch) afS44S0300000_5.l1).watchLiveFromSchema((Context) afS44S0300000_5.l2, enterRoomConfig);
            return;
        }
        String string = C15380j0.LIZLLL().getString(R.string.sv6);
        o.LJIIIIZZ(string, "getContext()\n           …tification_title_stopped)");
        C30868C9o.LJFF((Context) afS44S0300000_5.l2, string);
    }

    public static final void accept$4(AfS44S0300000_5 afS44S0300000_5, Object obj) {
        RoomCreateInfo roomCreateInfo;
        BroadcastSettingResponse broadcastSettingResponse;
        C29018BaA c29018BaA = (C29018BaA) obj;
        try {
            HandlerC29100BbU handlerC29100BbU = (HandlerC29100BbU) afS44S0300000_5.l0;
            C28467BFf<RoomCreateInfo> c28467BFf = c29018BaA.LIZ;
            LivePermissionApplyResponse livePermissionApplyResponse = null;
            if (c28467BFf != null) {
                roomCreateInfo = c28467BFf.data;
            } else {
                roomCreateInfo = null;
            }
            handlerC29100BbU.LJII = roomCreateInfo;
            C28467BFf<LivePermissionApplyResponse> c28467BFf2 = c29018BaA.LIZIZ;
            if (c28467BFf2 != null) {
                livePermissionApplyResponse = c28467BFf2.data;
            }
            handlerC29100BbU.LJIIIIZZ = livePermissionApplyResponse;
            C28467BFf<BroadcastSettingResponse> c28467BFf3 = c29018BaA.LIZJ;
            if (c28467BFf3 != null && (broadcastSettingResponse = c28467BFf3.data) != null) {
                handlerC29100BbU.LJIIJJI = broadcastSettingResponse.giftFeature;
                handlerC29100BbU.LJIIL = broadcastSettingResponse.giftRankSwitchStatus;
                handlerC29100BbU.LJIILIIL = broadcastSettingResponse.ecRankSwitchStatus;
            }
            boolean LJIILJJIL = handlerC29100BbU.LJIILJJIL(roomCreateInfo);
            HandlerC29100BbU handlerC29100BbU2 = (HandlerC29100BbU) afS44S0300000_5.l0;
            boolean LJIILIIL = handlerC29100BbU2.LJIILIIL(handlerC29100BbU2.LJIIIIZZ, (C29180Bcm) afS44S0300000_5.l1, (BUT) afS44S0300000_5.l2);
            if (LJIILJJIL && LJIILIIL) {
                ((HandlerC29100BbU) afS44S0300000_5.l0).LJIILLIIL();
            } else {
                ((HandlerC29100BbU) afS44S0300000_5.l0).LJII();
            }
        } catch (Throwable unused) {
            ((HandlerC29100BbU) afS44S0300000_5.l0).LJII();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$5(AfS44S0300000_5 afS44S0300000_5, Object obj) {
        StartDrawGuessResponse startDrawGuessResponse = (StartDrawGuessResponse) ((BaseResponse) obj).data;
        if (startDrawGuessResponse == null) {
            ((InterfaceC88472Yns) afS44S0300000_5.l0).invoke(Boolean.FALSE);
            return;
        }
        BAF.LJIJ(startDrawGuessResponse.pictionaryId, startDrawGuessResponse.sessionId, (DrawGuessWord) afS44S0300000_5.l2, (DataChannel) afS44S0300000_5.l1, false);
        ((InterfaceC88472Yns) afS44S0300000_5.l0).invoke(Boolean.TRUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Long, O] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.String, O] */
    public static final void accept$6(AfS44S0300000_5 afS44S0300000_5, Object obj) {
        BaseResponse baseResponse = (BaseResponse) obj;
        T t = baseResponse.data;
        if (t != 0) {
            CoverImageModel coverImageModel = (CoverImageModel) t;
            if (coverImageModel.urlList != null) {
                InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) afS44S0300000_5.l0;
                if (interfaceC88472Yns != null) {
                    interfaceC88472Yns.invoke(coverImageModel.uri);
                }
                DataChannel dataChannel = (DataChannel) afS44S0300000_5.l1;
                if (dataChannel != null) {
                    ((C32537Cpp) dataChannel.gv0(C28709BOn.class)).LIZ = ((CoverImageModel) baseResponse.data).uri;
                }
                DataChannel dataChannel2 = (DataChannel) afS44S0300000_5.l1;
                if (dataChannel2 != null) {
                    ((C32537Cpp) dataChannel2.gv0(C28708BOm.class)).LIZ = BAF.LJIJJ(dataChannel2);
                }
                C15420j4.LIZLLL(((File) afS44S0300000_5.l2).getPath());
            }
        }
    }

    public static final void accept$7(AfS44S0300000_5 afS44S0300000_5, Object obj) {
        C31319CQx c31319CQx = (C31319CQx) afS44S0300000_5.l0;
        CRD crd = (CRD) afS44S0300000_5.l1;
        ChatMessage chatMessage = (ChatMessage) afS44S0300000_5.l2;
        c31319CQx.getClass();
        crd.LJJIIZI().LIZ = true;
        chatMessage.communityflaggedStatus = 2;
        ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).ue0(c31319CQx.LLIILZL.LJIIJJI, crd.getToken(), chatMessage);
    }

    public static final void accept$8(AfS44S0300000_5 afS44S0300000_5, Object obj) {
        InterfaceC116954iR interfaceC116954iR = (InterfaceC116954iR) afS44S0300000_5.l0;
        if (interfaceC116954iR != null) {
            interfaceC116954iR.onNext(Boolean.TRUE);
        }
        ((AbstractC28377BBt) afS44S0300000_5.l1).LIZ = (HashMap) afS44S0300000_5.l2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$9(AfS44S0300000_5 afS44S0300000_5, Object obj) {
        if (obj != 0) {
            C0NB.LIZIZ("PortalLeaf", "loadCoverSuccess");
            ((C34K) afS44S0300000_5.l0).element = true;
        }
        ((C68322mC) afS44S0300000_5.l1).element = obj;
        ((CountDownLatch) afS44S0300000_5.l2).countDown();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS44S0300000_5(X.AbstractC34571Xh r2, X.C19030ot r3, X.C28881BVd r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            switch(r5) {
                case 11: goto L10;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r4
            r0.l1 = r3
            r0.l2 = r2
        Lc:
            r0.<init>()
            return
        L10:
            r0 = r1
            r0.l0 = r4
            r0.l1 = r2
            r0.l2 = r3
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS44S0300000_5.<init>(X.1Xh, X.0ot, X.BVd, int):void");
    }

    public AfS44S0300000_5(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj3;
        this.l2 = obj;
    }
}
