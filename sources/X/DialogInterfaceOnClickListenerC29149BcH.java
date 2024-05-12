package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.livesdk.broadcast.GameLandScapeOrientationChannel;
import com.bytedance.android.livesdk.broadcast.StartLiveSuccessChannel;
import com.bytedance.android.livesdk.comp.api.linkcore.model.BroadcastResumeInfo;
import com.bytedance.android.livesdk.dataChannel.PreviewStartLiveContinueMsgChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.google.gson.internal.b;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.BcH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC29149BcH implements DialogInterface.OnClickListener {
    public final /* synthetic */ LiveMode LJLIL;
    public final /* synthetic */ DataChannel LJLILLLLZI;
    public final /* synthetic */ C34K LJLJI;
    public final /* synthetic */ Room LJLJJI;
    public final /* synthetic */ Context LJLJJL;
    public final /* synthetic */ BroadcastResumeInfo LJLJJLL;
    public final /* synthetic */ Integer LJLJL;
    public final /* synthetic */ Fragment LJLJLJ;

    public DialogInterfaceOnClickListenerC29149BcH(LiveMode liveMode, DataChannel dataChannel, C34K c34k, Room room, Context context, BroadcastResumeInfo broadcastResumeInfo, Integer num, Fragment fragment) {
        this.LJLIL = liveMode;
        this.LJLILLLLZI = dataChannel;
        this.LJLJI = c34k;
        this.LJLJJI = room;
        this.LJLJJL = context;
        this.LJLJJLL = broadcastResumeInfo;
        this.LJLJL = num;
        this.LJLJLJ = fragment;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.android.livesdkapi.depend.model.live.Room, O] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Integer, O] */
    /* JADX WARN: Type inference failed for: r1v31, types: [java.lang.Boolean, O] */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        LiveMode liveMode;
        String str;
        LiveMode liveMode2;
        Boolean bool;
        InterfaceC30359Bvn LJIILIIL;
        long j;
        InterfaceC30359Bvn LJIILIIL2;
        boolean z;
        long j2;
        C29689Bkz c29689Bkz = C29689Bkz.LIZ;
        c29689Bkz.LJIIJ(this.LJLIL);
        c29689Bkz.LJIIJJI(this.LJLIL);
        c29689Bkz.LJIIL(C29150BcI.LJLIL);
        C0N7.LJIJJLI(this.LJLILLLLZI, "back_to_live");
        if (this.LJLJI.element) {
            Room room = this.LJLJJI;
            if (room != null) {
                j2 = room.getId();
            } else {
                j2 = 0;
            }
            C0N7.LJII("click", "resume", j2, this.LJLILLLLZI);
            ((C32537Cpp) DataChannelGlobal.LJLJJI.gv0(C29065Bav.class)).LIZ = Boolean.TRUE;
        }
        if (Room.isValid(this.LJLJJI)) {
            C32019ChT.LIZJ();
            Room room2 = this.LJLJJI;
            if (room2 != null) {
                LiveMode liveMode3 = this.LJLIL;
                C0N7.LJI(room2, liveMode3, this.LJLILLLLZI, 1, false);
                if (C28509BGv.LJ(liveMode3)) {
                    b.LJIIIIZZ();
                }
            }
            C29697Bl7.LJIILL(1);
            Room room3 = this.LJLJJI;
            if (room3 != null) {
                c29689Bkz.LJIIL(new AqS171S0100000_5(room3, 864));
            }
            ((C32537Cpp) DataChannelGlobal.LJLJJI.gv0(C29044Baa.class)).LIZ = this.LJLJJI;
            Room room4 = this.LJLJJI;
            LiveMode liveMode4 = null;
            if (room4 != null) {
                liveMode = room4.getStreamType();
            } else {
                liveMode = null;
            }
            Intent createStartBroadcastIntent = C7N.LJIIJJI().createStartBroadcastIntent(C29306Beo.LIZIZ(this.LJLJJL), C29152BcK.LIZ(liveMode));
            RoomCreateInfo roomCreateInfo = (RoomCreateInfo) this.LJLILLLLZI.kv0(RoomCreateInfoChannel.class);
            if (roomCreateInfo != null) {
                str = roomCreateInfo.mAdditionalPrompt;
            } else {
                str = null;
            }
            createStartBroadcastIntent.putExtra("live.intent.extra.LIVE_PC_TIPS", str);
            createStartBroadcastIntent.putExtra("live.intent.extra.IS_CONTINUE_LIVE", true);
            Room room5 = this.LJLJJI;
            if (room5 != null) {
                liveMode2 = room5.getStreamType();
            } else {
                liveMode2 = null;
            }
            if (liveMode2 == LiveMode.SCREEN_RECORD || liveMode2 == LiveMode.LIVE_STUDIO || liveMode2 == LiveMode.THIRD_PARTY) {
                DataChannel dataChannel = this.LJLILLLLZI;
                if (dataChannel != null) {
                    bool = (Boolean) dataChannel.kv0(GameLandScapeOrientationChannel.class);
                } else {
                    bool = null;
                }
                createStartBroadcastIntent.putExtra("hotsoon.intent.extra.IS_LANDSCAPE", bool);
            } else {
                Room room6 = this.LJLJJI;
                if (C29137Bc5.LJFF(room6) || C29137Bc5.LIZIZ(room6)) {
                    createStartBroadcastIntent.putExtra("interact_resume_scene", this.LJLJJLL.getRealScene());
                    if (this.LJLJJLL.getLinkMicUserNum() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    createStartBroadcastIntent.putExtra("interact_is_only_push_rtc", z);
                }
            }
            if (C1XY.LJJIII(C29306Beo.LIZIZ(this.LJLJJL)) && C29137Bc5.LJFF(this.LJLJJI)) {
                Integer num = this.LJLJL;
                if (num != null && num.intValue() == 0 && (LJIILIIL2 = C87277YNd.LJIILIIL(this.LJLILLLLZI)) != null) {
                    LJIILIIL2.LJIILLIIL();
                }
                View view = this.LJLJLJ.getView();
                if (view != null) {
                    C29306Beo.LJIIIZ(view);
                }
                InterfaceC30359Bvn LJIILIIL3 = C87277YNd.LJIILIIL(this.LJLILLLLZI);
                if (LJIILIIL3 != null) {
                    LJIILIIL3.LJJIII(C16880lQ.LLJJIJI(createStartBroadcastIntent));
                }
                Room room7 = this.LJLJJI;
                if (room7 != null) {
                    liveMode4 = room7.getStreamType();
                }
                C29152BcK.LIZIZ(liveMode4, true);
                dialogInterface.dismiss();
            } else {
                if (C1XY.LJJIII(C29306Beo.LIZIZ(this.LJLJJL)) && !C29137Bc5.LJFF(this.LJLJJI) && (LJIILIIL = C87277YNd.LJIILIIL(this.LJLILLLLZI)) != null) {
                    LJIILIIL.LJIL();
                }
                C16880lQ.LIZJ(this.LJLJJL, createStartBroadcastIntent);
                ActivityC45651qj LIZIZ = C29306Beo.LIZIZ(this.LJLJJL);
                if (LIZIZ != null) {
                    LIZIZ.finish();
                }
                ActivityC45651qj LIZIZ2 = C29306Beo.LIZIZ(this.LJLJJL);
                if (LIZIZ2 != null) {
                    LIZIZ2.overridePendingTransition(0, 0);
                }
                Room room8 = this.LJLJJI;
                if (room8 != null) {
                    liveMode4 = room8.getStreamType();
                }
                C29152BcK.LIZIZ(liveMode4, false);
            }
            AnonymousClass030.LJFF(InterfaceC30442Bx8.LJIILIIL);
            Object value = C7N.LIZLLL.getValue();
            o.LJIIIIZZ(value, "<get-hostConfig>(...)");
            ((IHostConfig) value).qS().getClass();
            C48458J0c<Boolean> c48458J0c = InterfaceC29151BcJ.LIZ;
            Boolean bool2 = Boolean.TRUE;
            c48458J0c.LIZ(bool2);
            ((C29165BcX) C7N.LJ().startLiveManager()).onStartLive();
            ((C32537Cpp) this.LJLILLLLZI.gv0(BGE.class)).LIZ = 2;
            DataChannel dataChannel2 = this.LJLILLLLZI;
            Room room9 = this.LJLJJI;
            if (room9 != null) {
                j = room9.getId();
            } else {
                j = -1;
            }
            dataChannel2.rv0(StartLiveSuccessChannel.class, new OSZ(bool2, Long.valueOf(j)));
            C0N7.LJIIIIZZ(this.LJLILLLLZI, "golive_success");
            this.LJLILLLLZI.rv0(PreviewStartLiveContinueMsgChannel.class, Boolean.FALSE);
        }
        C29182Bco.LIZ().LIZLLL();
    }
}
