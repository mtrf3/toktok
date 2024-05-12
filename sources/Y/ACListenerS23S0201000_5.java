package Y;

import X.B3P;
import X.B57;
import X.B9W;
import X.BCY;
import X.BFO;
import X.BFP;
import X.BV1;
import X.BV9;
import X.BVA;
import X.BZI;
import X.C1DH;
import X.C28207B5f;
import X.C28238B6k;
import X.C28239B6l;
import X.C28307B9b;
import X.C28389BCf;
import X.C28390BCg;
import X.C28391BCh;
import X.C28393BCj;
import X.C28407BCx;
import X.C28668BMy;
import X.C28777BRd;
import X.C28787BRn;
import X.C28863BUl;
import X.C28865BUn;
import X.C28866BUo;
import X.C28900BVw;
import X.C29306Beo;
import X.C29494Bhq;
import X.C30868C9o;
import X.C31061Ju;
import X.C32537Cpp;
import X.C47071t1;
import X.C48459J0d;
import X.C73943T0h;
import X.CK3;
import X.InterfaceC28240B6m;
import X.InterfaceC28308B9c;
import X.InterfaceC30442Bx8;
import X.InterfaceC65784Pro;
import X.ProgressDialogC173666ri;
import android.os.Handler;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.broadcast.api.blockword.model.BlockWordRecommend;
import com.bytedance.android.livesdk.chatroom.end.newaudienceend.LiveNewAudienceEndFragment;
import com.bytedance.android.livesdk.chatroom.ui.LiveEmojiInputDialogFragment;
import com.bytedance.android.livesdk.interaction.InteractionFeaturesDialog;
import com.bytedance.android.livesdk.model.BannerInRoom;
import com.bytedance.android.livesdk.qa.AskQuestionDialog;
import com.bytedance.android.livesdk.qa.AudienceSuggestedQuestionSelected;
import com.bytedance.android.livesdk.qa.CurrentQuestionChannel;
import com.bytedance.android.livesdk.qa.QuestionEx;
import com.bytedance.android.livesdk.qa.QuestionMoreOptionDialog;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class ACListenerS23S0201000_5 implements View.OnClickListener {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

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
            case 4:
                onClick$4(this, view);
                return;
            case 5:
                onClick$5(this, view);
                return;
            case 6:
                onClick$6(this, view);
                return;
            case 7:
                onClick$7(this, view);
                return;
            case 8:
                onClick$8(this, view);
                return;
            case 9:
                onClick$9(this, view);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$0(ACListenerS23S0201000_5 aCListenerS23S0201000_5, View view) {
        BFO bfo = (BFO) aCListenerS23S0201000_5.l0;
        bfo.LJLILLLLZI.invoke(ListProtector.get(bfo.LJLIL, aCListenerS23S0201000_5.i2), Integer.valueOf(aCListenerS23S0201000_5.i2));
        ((BFO) aCListenerS23S0201000_5.l0).LJLJJI = ((BFP) aCListenerS23S0201000_5.l1).getAbsoluteAdapterPosition();
        ((BFO) aCListenerS23S0201000_5.l0).notifyDataSetChanged();
    }

    public static final void onClick$1(ACListenerS23S0201000_5 aCListenerS23S0201000_5, View view) {
        LiveEmojiInputDialogFragment liveEmojiInputDialogFragment = (LiveEmojiInputDialogFragment) aCListenerS23S0201000_5.l0;
        liveEmojiInputDialogFragment.LLJLIL.LIZJ((C31061Ju) ListProtector.get((List) aCListenerS23S0201000_5.l1, aCListenerS23S0201000_5.i2));
        DataChannel dataChannel = liveEmojiInputDialogFragment.LJLJJI;
        BZI LIZ = C28787BRn.LIZ("livesdk_emoji_click");
        LIZ.LJIILLIIL(dataChannel);
        LIZ.LJIJJ("comment_panel", "position");
        LIZ.LJJIIJZLJL();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005b, code lost:
    
        if (r1 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x009e, code lost:
    
        if (r1 == null) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onClick$2(Y.ACListenerS23S0201000_5 r11, android.view.View r12) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS23S0201000_5.onClick$2(Y.ACListenerS23S0201000_5, android.view.View):void");
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Boolean, O] */
    public static final void onClick$3(ACListenerS23S0201000_5 aCListenerS23S0201000_5, View view) {
        C29306Beo.LJIIIZ(((View) aCListenerS23S0201000_5.l0).findViewById(R.id.isy));
        DataChannel dataChannel = ((InteractionFeaturesDialog) aCListenerS23S0201000_5.l1).dataChannel;
        if (dataChannel != null) {
            ((C32537Cpp) dataChannel.gv0(C28900BVw.class)).LIZ = Boolean.FALSE;
        }
        ((InteractionFeaturesDialog) aCListenerS23S0201000_5.l1).dismiss();
        ((InteractionFeaturesDialog) aCListenerS23S0201000_5.l1).Al(aCListenerS23S0201000_5.i2);
        BV1.LIZIZ(((InteractionFeaturesDialog) aCListenerS23S0201000_5.l1).dataChannel, "interaction_feature");
    }

    public static final void onClick$4(ACListenerS23S0201000_5 aCListenerS23S0201000_5, View view) {
        Handler handler;
        B9W b9w = (B9W) aCListenerS23S0201000_5.l0;
        List list = (List) aCListenerS23S0201000_5.l1;
        int i = aCListenerS23S0201000_5.i2;
        InterfaceC28240B6m interfaceC28240B6m = b9w.LJLJI;
        if (interfaceC28240B6m != null && (handler = ((LiveNewAudienceEndFragment) interfaceC28240B6m).LJLJJL) != null) {
            handler.removeCallbacksAndMessages(null);
        }
        Room room = (Room) ListProtector.get(list, i);
        b9w.getContext();
        DataChannel dataChannel = b9w.LJLIL;
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        enterRoomConfig.mLogData.logPb = room.getLog_pb();
        enterRoomConfig.mLogData.requestId = room.getRequestId();
        enterRoomConfig.mLogData.requestId = room.getRequestId();
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        roomsData.enterFromMerge = "live_end";
        roomsData.enterMethod = "live_cover";
        boolean z = true;
        enterRoomConfig.mLogData.fromEnd = 1;
        C28239B6l c28239B6l = (C28239B6l) dataChannel.kv0(C28407BCx.class);
        if (c28239B6l != null) {
            EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
            logData.endSourceEnterFromMerge = c28239B6l.LIZ;
            logData.endSourceEnterMethod = c28239B6l.LIZIZ;
            logData.endSourceActionType = c28239B6l.LIZJ;
            logData.endViewStatus = c28239B6l.LIZLLL;
        }
        EnterRoomConfig.LogData logData2 = enterRoomConfig.mLogData;
        if (((Integer) dataChannel.kv0(C28393BCj.class)).intValue() != 12) {
            z = false;
        }
        logData2.isPreLiveAccessRecall = z;
        enterRoomConfig.mLogData.liveEndExit = "rec_click";
        C28207B5f.LIZ(dataChannel, "rec_click");
        if (((Boolean) dataChannel.kv0(BCY.class)).booleanValue()) {
            enterRoomConfig.mRoomsData.fromNewStyle = ((Boolean) dataChannel.kv0(BCY.class)).booleanValue();
            enterRoomConfig.mRoomsData.fromDrawerStyle = (String) dataChannel.kv0(C28390BCg.class);
            enterRoomConfig.mRoomsData.enterLiveSource = (String) dataChannel.kv0(C28389BCf.class);
            EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
            roomsData2.windowMode = "full_screen";
            roomsData2.feedUrl = (String) dataChannel.kv0(C28391BCh.class);
        }
        enterRoomConfig.mRoomsData.roomId = room.getId();
        enterRoomConfig.mRoomsData.streamType = room.getStreamType();
        enterRoomConfig.mLogData.userFrom = room.getUserFrom();
        enterRoomConfig.mRoomsData.orientation = room.getOrientation();
        C28238B6k.LIZLLL(room, enterRoomConfig);
        long id = room.getId();
        EnterRoomConfig enterRoomConfig2 = B57.LIZ.LIZ().mEnterRoomConfig;
        BZI LIZ = C28787BRn.LIZ("livesdk_finish_rec_click");
        LIZ.LJIJJ(Long.valueOf(id), "rec_room_id");
        LIZ.LJIJJ(Long.valueOf(enterRoomConfig2.mRoomsData.roomId), "room_id");
        LIZ.LJIJJ(Long.valueOf(enterRoomConfig2.mRoomsData.enterUserId), "anchor_id");
        LIZ.LJIILLIIL(dataChannel);
        LIZ.LJJIIJZLJL();
        C73943T0h.LIZ().LIZIZ(new B3P(room.getId(), enterRoomConfig));
        C28668BMy.LJFF(4);
    }

    public static final void onClick$5(ACListenerS23S0201000_5 aCListenerS23S0201000_5, View view) {
        ((C28777BRd) aCListenerS23S0201000_5.l0).LJLIL.LIZ(aCListenerS23S0201000_5.i2, (BlockWordRecommend) aCListenerS23S0201000_5.l1);
    }

    public static final void onClick$6(ACListenerS23S0201000_5 aCListenerS23S0201000_5, View view) {
        DataChannel dataChannel = ((AskQuestionDialog) aCListenerS23S0201000_5.l0).dataChannel;
        if (dataChannel != null) {
            dataChannel.qv0(AudienceSuggestedQuestionSelected.class, (QuestionEx) aCListenerS23S0201000_5.l1);
        }
        AskQuestionDialog askQuestionDialog = (AskQuestionDialog) aCListenerS23S0201000_5.l0;
        askQuestionDialog.LJLL = aCListenerS23S0201000_5.i2;
        askQuestionDialog.LJLLI = false;
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Boolean, O] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, O] */
    public static final void onClick$7(ACListenerS23S0201000_5 aCListenerS23S0201000_5, View view) {
        switch (aCListenerS23S0201000_5.i2) {
            case 0:
                BVA bva = (BVA) aCListenerS23S0201000_5.l0;
                ?? r2 = aCListenerS23S0201000_5.l1;
                bva.getClass();
                BZI LIZ = C28787BRn.LIZ("livesdk_anchor_qa_more_click");
                LIZ.LJIILLIIL(bva.LJLJLJ.LL);
                LIZ.LJIJJ(Long.valueOf(bva.LJLIL.questionId), "question_id");
                LIZ.LJIJJ(bva.LJLJLJ.LLFFF, "sub_list");
                LIZ.LJIJJ(Integer.valueOf(bva.LJLIL.createFrom), "create_from");
                LIZ.LJIJJ(Integer.valueOf(bva.LJLIL.answerFrom), "answer_from");
                LIZ.LJIJJ(bva.LJLIL.recReqId, "rec_req_id");
                LIZ.LJJIIJZLJL();
                FragmentManager fragmentManager = (FragmentManager) bva.LJLJLJ.LL.kv0(C29494Bhq.class);
                if (fragmentManager != null) {
                    ((C32537Cpp) bva.LJLJLJ.LL.gv0(C28863BUl.class)).LIZ = "qa_board";
                    ((C32537Cpp) bva.LJLJLJ.LL.gv0(C28865BUn.class)).LIZ = r2;
                    ((C32537Cpp) bva.LJLJLJ.LL.gv0(C28866BUo.class)).LIZ = Boolean.TRUE;
                    QuestionMoreOptionDialog questionMoreOptionDialog = new QuestionMoreOptionDialog();
                    String subList = bva.LJLJLJ.LLFFF;
                    o.LJIIIZ(subList, "subList");
                    questionMoreOptionDialog.LJLJJLL = subList;
                    questionMoreOptionDialog.show(fragmentManager, "QuestionVieHolder");
                    return;
                }
                return;
            default:
                ProgressDialogC173666ri progressDialogC173666ri = (ProgressDialogC173666ri) aCListenerS23S0201000_5.l0;
                InterfaceC65784Pro cancelListener = (InterfaceC65784Pro) aCListenerS23S0201000_5.l1;
                o.LJIIIZ(cancelListener, "$cancelListener");
                progressDialogC173666ri.dismiss();
                cancelListener.invoke();
                return;
        }
    }

    public static final void onClick$8(ACListenerS23S0201000_5 aCListenerS23S0201000_5, View view) {
        BVA bva = (BVA) aCListenerS23S0201000_5.l0;
        QuestionEx questionEx = (QuestionEx) aCListenerS23S0201000_5.l1;
        int i = aCListenerS23S0201000_5.i2;
        BV9 bv9 = bva.LJLJLJ;
        if (!bv9.LJZ) {
            return;
        }
        if (C1DH.LJJIIJZLJL(bv9.LL)) {
            if (bva.LJLJLJ.LL.kv0(CurrentQuestionChannel.class) != null) {
                C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.LLJJI;
                if (c48459J0d.LIZJ().booleanValue() && bva.LJLJLJ.LL.kv0(CurrentQuestionChannel.class) != null && ((QuestionEx) bva.LJLJLJ.LL.kv0(CurrentQuestionChannel.class)).question.questionId != 0) {
                    Boolean bool = Boolean.FALSE;
                    c48459J0d.LIZ(bool);
                    InterfaceC30442Bx8.LLJJ.LIZ(bool);
                    C47071t1 c47071t1 = new C47071t1(bva.LJLILLLLZI);
                    c47071t1.LJIILL = true;
                    c47071t1.LJIILLIIL(R.string.mt5);
                    c47071t1.LJFF(R.string.mt4);
                    c47071t1.LJIIL(R.string.mt3, new IDcS93S0200000_5(bva, questionEx, i, 15));
                    c47071t1.LJIIIZ(R.string.osu, new CK3());
                    BVA.N(c47071t1.LIZ());
                    return;
                }
                bva.P(i, questionEx);
                return;
            }
            bva.P(i, questionEx);
            return;
        }
        C30868C9o.LIZJ(R.string.ofj);
    }

    public static final void onClick$9(ACListenerS23S0201000_5 aCListenerS23S0201000_5, View it) {
        InterfaceC28308B9c interfaceC28308B9c = ((C28307B9b) aCListenerS23S0201000_5.l0).LJLILLLLZI;
        if (interfaceC28308B9c != null) {
            o.LJIIIIZZ(it, "it");
            interfaceC28308B9c.LIZ(it, aCListenerS23S0201000_5.i2, (BannerInRoom) aCListenerS23S0201000_5.l1, ((C28307B9b) aCListenerS23S0201000_5.l0).LJLIL);
        }
    }

    public ACListenerS23S0201000_5(int i, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.i2 = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
