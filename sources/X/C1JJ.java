package X;

import Y.ACListenerS34S0400000_13;
import android.content.Context;
import com.bytedance.android.live.broadcast.model.GameLiveInfo;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.message.RoomMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS175S0200000_13;
import kotlin.jvm.internal.AqS97S0300000_8;
import kotlin.jvm.internal.IDqS172S0200000;
import kotlin.jvm.internal.IDqS6S0400000;
import kotlin.jvm.internal.o;

/* renamed from: X.1JJ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1JJ implements FWB, InterfaceC2315796z {
    @Override // X.InterfaceC2315796z
    public void onAttachedToWindow() {
    }

    @Override // X.InterfaceC2315796z
    public void onDetachedFromWindow() {
    }

    public static final C07190Pz LJ(InterfaceC24520xk interfaceC24520xk) {
        interfaceC24520xk.LJJIIJ(353815743);
        interfaceC24520xk.LJJIIJ(-3687241);
        Object LJIILL = interfaceC24520xk.LJIILL();
        InterfaceC24520xk.LIZ.getClass();
        if (LJIILL == C24500xi.LIZIZ) {
            LJIILL = new C07190Pz();
            interfaceC24520xk.LJJIII(LJIILL);
        }
        interfaceC24520xk.LJJIJIIJIL();
        C07190Pz c07190Pz = (C07190Pz) LJIILL;
        c07190Pz.LIZ(interfaceC24520xk, 8);
        interfaceC24520xk.LJJIJIIJIL();
        return c07190Pz;
    }

    @Override // X.FWB
    public void invoke(Object... objArr) {
        try {
            OJY LJIL = C73340SqO.LJIL();
            Context LIZIZ = EF7.LIZIZ();
            Object obj = objArr[0];
            o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.AwemeRawAd");
            Object obj2 = objArr[1];
            o.LJII(obj2, "null cannot be cast to non-null type kotlin.String");
            LJIL.getClass();
            OJY.LJIIJJI(LIZIZ, (AwemeRawAd) obj, (String) obj2);
        } catch (Exception unused) {
        }
    }

    @Override // X.InterfaceC2315796z
    public void LIZ(MusNotice notice, C2315596x c2315596x) {
        o.LJIIIZ(notice, "notice");
        C2S9 positiveButton = c2315596x.getPositiveButton();
        User LJJJJ = C78977Uz7.LJJJJ(notice);
        if (LJJJJ != null) {
            java.util.Map<? extends String, ? extends String> LJJJJIZL = C78977Uz7.LJJJJIZL(notice);
            positiveButton.setVisibility(0);
            C226668v0 c226668v0 = new C226668v0();
            c226668v0.LIZ = LJJJJ;
            c226668v0.LIZIZ = false;
            c226668v0.LJ.putAll(LJJJJIZL);
            positiveButton.LLIIIJ.LJJJJJL(c226668v0.LIZ());
            String str = LJJJJIZL.get("video_link_share_type");
            if (str == null) {
                str = "";
            }
            positiveButton.setTracker(new AqS97S0300000_8(notice, (MusNotice) LJJJJIZL, (java.util.Map<String, String>) E2C.LIZJ("share_type", str), (java.util.Map<String, String>) 5));
        }
        positiveButton.setRequestListener(new AqS175S0200000_13(positiveButton, c2315596x, 9));
        C2S9 negativeButton = c2315596x.getNegativeButton();
        negativeButton.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS34S0400000_13(notice, C78977Uz7.LJJIJIIJIL(notice), c2315596x, negativeButton, 0)));
        negativeButton.setText(R.string.hsh);
        negativeButton.setButtonVariant(1);
    }

    public static final void LIZLLL(C37661dq c37661dq, DataChannel dataChannel, List list) {
        boolean z;
        long j;
        Boolean bool;
        o.LJIIIZ(c37661dq, "<this>");
        o.LJIIIZ(dataChannel, "dataChannel");
        o.LJIIIZ(list, "list");
        if (list.isEmpty()) {
            return;
        }
        GameLiveInfo gameLiveInfo = (GameLiveInfo) DataChannelGlobal.LJLJJI.mv0(C30385BwD.class);
        if (gameLiveInfo != null && (bool = gameLiveInfo.hasGameLive) != null) {
            z = bool.booleanValue();
        } else {
            z = true;
        }
        if (C30922CBq.LIZIZ) {
            C0RN.LIZLLL("handleFirstChatMessageTips. hadGameLive=", z, "GameUiStrategy");
        }
        if (!z && !c37661dq.LJI) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((CQO) it.next()).LJIJJLI.getMessageType() == EnumC31509CYf.CHAT) {
                    boolean isAppForeground = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isAppForeground();
                    if (C30922CBq.LIZIZ) {
                        C0RN.LIZLLL("handleFirstChatMessageTips. isForeground=", isAppForeground, "GameUiStrategy");
                    }
                    c37661dq.LJI = true;
                    if (isAppForeground) {
                        C78926UyI.LJJJJ(EnumC14070gt.FirstComment, EnumC14060gs.InApp);
                        IMessageManager iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class);
                        Room room = (Room) dataChannel.kv0(RoomChannel.class);
                        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.lel);
                        if (room != null) {
                            j = room.getId();
                        } else {
                            j = 0;
                        }
                        RoomMessage LJIJ = C31309CQn.LJIJ(j, LJIILJJIL);
                        if (iMessageManager != null) {
                            iMessageManager.insertMessage(LJIJ, true);
                            return;
                        }
                        return;
                    }
                    C78926UyI.LJJJJ(EnumC14070gt.FirstComment, EnumC14060gs.Hover);
                    int ordinal = EnumC264412a.LIVE_TIP_MESSAGE_FIRST_CHAT_MESSAGE.ordinal();
                    String LJIILJJIL2 = C15380j0.LJIILJJIL(R.string.lel);
                    o.LJIIIIZZ(LJIILJJIL2, "getString(R.string.pm_ga…live_guide_scene_comment)");
                    C12B.LIZ(c37661dq, true, ordinal, LJIILJJIL2, 8);
                    return;
                }
            }
        }
    }

    public static final C1JE LIZIZ(C07190Pz c07190Pz, float f, C1JB c1jb, InterfaceC24520xk interfaceC24520xk) {
        interfaceC24520xk.LJJIIJ(1399864148);
        C1JE LIZJ = LIZJ(c07190Pz, Float.valueOf(0.0f), Float.valueOf(f), C0QD.LIZ, c1jb, interfaceC24520xk);
        interfaceC24520xk.LJJIJIIJIL();
        return LIZJ;
    }

    public static final C1JE LIZJ(C07190Pz c07190Pz, Object obj, Object obj2, C1JR typeConverter, C1JB c1jb, InterfaceC24520xk interfaceC24520xk) {
        o.LJIIIZ(typeConverter, "typeConverter");
        interfaceC24520xk.LJJIIJ(1847699412);
        interfaceC24520xk.LJJIIJ(-3687241);
        Object LJIILL = interfaceC24520xk.LJIILL();
        InterfaceC24520xk.LIZ.getClass();
        if (LJIILL == C24500xi.LIZIZ) {
            LJIILL = new C1JE(c07190Pz, obj, obj2, typeConverter, c1jb);
            interfaceC24520xk.LJJIII(LJIILL);
        }
        interfaceC24520xk.LJJIJIIJIL();
        C1JE c1je = (C1JE) LJIILL;
        C24610xt.LJI(new IDqS6S0400000(obj, c1je, (C1JE<Object, Object>) obj2, c1jb, (C1JB<Object>) 0), interfaceC24520xk);
        C24610xt.LIZIZ(c1je, new IDqS172S0200000(c07190Pz, (C07190Pz) c1je, (C1JE<Object, Object>) 30), interfaceC24520xk);
        interfaceC24520xk.LJJIJIIJIL();
        return c1je;
    }
}
