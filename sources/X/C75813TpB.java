package X;

import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ISessionAbility;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState;
import com.bytedance.android.livesdk.comp.api.linkcore.ILinkCoreService;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicStateSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAckMessageSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiHostPauseLiveAnchorSkipEnableSetting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.AqS144S0200000_13;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import tikcast.linkmic.common.BackGroundImageState;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.common.LinkUserState;
import tikcast.linkmic.controller.ChangeStateReq;
import webcast.im.LinkStateMessage;

/* renamed from: X.TpB, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75813TpB implements InterfaceC75454TjO, InterfaceC70422pa {
    public final InterfaceC75817TpF LJLIL;
    public final AtomicLong LJLILLLLZI;
    public final C5H3 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final XIA LJLJJLL;

    @Override // X.InterfaceC70422pa
    public final MBA getCoroutineContext() {
        return this.LJLJJLL;
    }

    public C75813TpB(InterfaceC75817TpF vmState) {
        o.LJIIIZ(vmState, "vmState");
        this.LJLIL = vmState;
        this.LJLILLLLZI = new AtomicLong(0L);
        this.LJLJI = C78996UzQ.LJJIJIIJI(C75818TpG.LJLIL);
        this.LJLJJI = C221108m2.LIZIZ(new AqS163S0100000_13(this, 409));
        this.LJLJJL = C221108m2.LIZIZ(C75820TpI.LJLIL);
        this.LJLJJLL = C78613UtF.LIZJ;
    }

    public final void LIZ(C75814TpC c75814TpC) {
        Object obj;
        long j = this.LJLILLLLZI.get();
        long j2 = c75814TpC.LJLIL;
        if (j >= j2) {
            return;
        }
        this.LJLILLLLZI.set(j2);
        this.LJLIL.hn(0, new AqS144S0200000_13(c75814TpC, this, 43));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[fireEvent] received state ");
        LIZ.append(c75814TpC);
        UC0.LJJIZ(X1D.LIZIZ(LIZ), "VMState");
        InterfaceC75817TpF interfaceC75817TpF = this.LJLIL;
        Iterator<UserState> it = c75814TpC.LJLJI.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            UserState next = it.next();
            String str = next.linkMicId;
            RtcUserInfo LLLLLJIL = this.LJLIL.LLLLLJIL();
            if (LLLLLJIL != null) {
                obj = LLLLLJIL.getLinkMicId();
            }
            if (o.LJ(str, obj)) {
                obj = next;
                break;
            }
        }
        interfaceC75817TpF.ZI(0, obj);
    }

    @Override // X.InterfaceC75454TjO
    public final void LLFFF(LinkStateMessage message) {
        String str;
        o.LJIIIZ(message, "message");
        int i = message.stateType;
        ISessionAbility il = this.LJLIL.il();
        if (il == null || (str = il.LLLLLLIL()) == null) {
            str = "";
        }
        String str2 = null;
        C75808Tp6.LIZJ(i, str, null, false, message.clientSendTime);
        long j = message.version;
        LayoutState layoutState = message.layout;
        if (layoutState == null) {
            layoutState = this.LJLIL.getState().LJLILLLLZI;
        }
        List<LinkUserState> list = message.userStates;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator<LinkUserState> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C75811Tp9.LIZ(it.next()));
        }
        BackGroundImageState backGroundImageState = message.background;
        if (backGroundImageState != null) {
            str2 = backGroundImageState.stickerId;
        }
        C75814TpC c75814TpC = new C75814TpC(j, layoutState, arrayList, str2, 8);
        if (!MultiHostPauseLiveAnchorSkipEnableSetting.INSTANCE.isEnable()) {
            LIZ(c75814TpC);
        }
        if (message.needAck == 1 && !MultiGuestAckMessageSetting.INSTANCE.isEnable()) {
            XKX.LIZLLL(this, null, null, new C75824TpM(this, message, null), 3);
        }
        String LJJJLL = C78886Uxe.LJJJLL(C8E.LJ());
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null) {
            R6.scene();
        }
        if (!LinkMicStateSetting.INSTANCE.enableStatReport()) {
            JSONObject jSONObject = new JSONObject();
            C75808Tp6.LIZ(jSONObject, c75814TpC);
            String jSONObject2 = jSONObject.toString();
            o.LJIIIIZZ(jSONObject2, "JSONObject().appendLinkS…nkStatusState).toString()");
            UC0.LJJIZ(jSONObject2, "onStateResult");
            return;
        }
        ILinkCoreService iLinkCoreService = (ILinkCoreService) CN1.LIZ(ILinkCoreService.class);
        if (iLinkCoreService == null) {
            return;
        }
        iLinkCoreService.lf0(LJJJLL, new AqS179S0100000_13(c75814TpC, 450));
    }

    public static UserState LIZJ(UserState userState, UserState userState2) {
        boolean z;
        boolean z2 = false;
        if (userState.audioMuted == 0 && userState2.audioMuted != 0) {
            z = true;
        } else {
            z = false;
        }
        if (userState.videoMuted == 0 && userState2.videoMuted != 0) {
            z2 = true;
        }
        if (z) {
            if (z2) {
                return UserState.LIZ(userState, 0, userState2.audioMuted, userState2.videoMuted, 0, 0, 0, 927);
            }
            return UserState.LIZ(userState, 0, userState2.audioMuted, 0, 0, 0, 0, 991);
        }
        if (!z2) {
            return userState;
        }
        return UserState.LIZ(userState, 0, 0, userState2.videoMuted, 0, 0, 0, 959);
    }

    public final C75814TpC LIZIZ(C75814TpC c75814TpC, ChangeStateReq changeStateReq, C75814TpC c75814TpC2, Throwable th) {
        String str;
        UserState userState;
        String str2 = null;
        if (changeStateReq.stateType == 1) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("【RESET】trying to reset layout state [");
            LayoutState layoutState = changeStateReq.layoutState;
            if (layoutState != null) {
                str2 = layoutState.layoutId;
            }
            LIZ.append(str2);
            LIZ.append(']');
            UC0.LJJIZ(X1D.LIZIZ(LIZ), "StateApi");
            return C75814TpC.LIZ(c75814TpC, 0L, c75814TpC2.LJLILLLLZI, null, new C3C1(new J3J(changeStateReq.stateType, th)), null, 21);
        }
        RtcUserInfo LLLLLJIL = this.LJLIL.LLLLLJIL();
        if (LLLLLJIL != null) {
            str = LLLLLJIL.getLinkMicId();
        } else {
            str = null;
        }
        List<UserState> list = c75814TpC.LJLJI;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        for (UserState userState2 : list) {
            if (o.LJ(userState2.linkMicId, str)) {
                int i = changeStateReq.stateType;
                Iterator<UserState> it = c75814TpC2.LJLJI.iterator();
                while (true) {
                    if (it.hasNext()) {
                        userState = it.next();
                        if (o.LJ(userState.linkMicId, str)) {
                            break;
                        }
                    } else {
                        userState = null;
                        break;
                    }
                }
                UserState userState3 = userState;
                if (userState3 != null) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("【RESET】trying to reset user state [");
                    LIZ2.append(i);
                    LIZ2.append(']');
                    UC0.LJJIZ(X1D.LIZIZ(LIZ2), "StateApi");
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i != 5) {
                                    if (i == 6) {
                                        userState2 = UserState.LIZ(userState2, 0, 0, 0, 0, userState3.networkState, 0, 767);
                                    }
                                } else {
                                    userState2 = UserState.LIZ(userState2, 0, 0, 0, userState3.rtcConnection, 0, 0, 895);
                                }
                            } else {
                                userState2 = UserState.LIZ(userState2, 0, 0, userState3.videoMuted, 0, 0, 0, 959);
                            }
                        } else {
                            userState2 = UserState.LIZ(userState2, 0, userState3.audioMuted, 0, 0, 0, 0, 991);
                        }
                    } else {
                        userState2 = UserState.LIZ(userState2, userState3.onlineUserState, 0, 0, 0, 0, 0, 1007);
                    }
                }
            }
            arrayList.add(userState2);
        }
        return C75814TpC.LIZ(c75814TpC, 0L, null, arrayList, new C3C1(new J3J(changeStateReq.stateType, th)), null, 19);
    }
}
