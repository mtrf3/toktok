package X;

import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ISessionAbility;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessageParam;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessageUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AqS144S0200000_13;
import kotlin.jvm.internal.AqS36S1000000_13;
import kotlin.jvm.internal.o;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.controller.ChangeStateReq;

/* renamed from: X.TpA, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75812TpA implements InterfaceC74626TQo {
    public final InterfaceC75817TpF LIZ;
    public ISessionAbility LIZIZ;

    public C75812TpA(InterfaceC75817TpF vmState) {
        o.LJIIIZ(vmState, "vmState");
        this.LIZ = vmState;
    }

    @Override // X.InterfaceC74626TQo
    public final void LIZ(LinkLayerRTCMessage linkLayerRTCMessage) {
        boolean z;
        LinkLayerRTCMessageParam param;
        ArrayList<LinkLayerRTCMessageUser> users;
        boolean z2;
        String layoutId;
        ArrayList<LinkLayerRTCMessageUser> users2;
        boolean z3;
        LinkLayerRTCMessageParam param2;
        ArrayList<LinkLayerRTCMessageUser> users3;
        if (linkLayerRTCMessage.getParam() == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z && ((param = linkLayerRTCMessage.getParam()) == null || !param.is_state_supported() || ((param2 = linkLayerRTCMessage.getParam()) != null && (users3 = param2.getUsers()) != null && users3.size() > 1))) {
            if (!o.LJ(linkLayerRTCMessage.getMethod(), "linkMicSDKLayoutChange") && !o.LJ(linkLayerRTCMessage.getMethod(), "linkMicSDKVideoMute") && !o.LJ(linkLayerRTCMessage.getMethod(), "linkMicSDKAudioMute")) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("RTC message method[");
                LIZ.append(linkLayerRTCMessage.getMethod());
                LIZ.append("] need not handle");
                UC0.LJJIZ(X1D.LIZIZ(LIZ), "RTCHandler");
                return;
            }
            String method = linkLayerRTCMessage.getMethod();
            int hashCode = method.hashCode();
            int i = 16;
            long j = 0;
            if (hashCode != -1609774425) {
                if (hashCode != 965604647) {
                    if (hashCode != 1540435074 || !method.equals("linkMicSDKAudioMute")) {
                        return;
                    }
                    Long timeStamp = linkLayerRTCMessage.getTimeStamp();
                    if (timeStamp != null) {
                        j = timeStamp.longValue();
                    }
                    LIZLLL(3, j, linkLayerRTCMessage.getOs());
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("received LINK_LAYER_MUTE_AUDIO Message param = ");
                    LIZ2.append(linkLayerRTCMessage.getParam());
                    UC0.LJJIZ(X1D.LIZIZ(LIZ2), "RTCHandler");
                    LinkLayerRTCMessageParam param3 = linkLayerRTCMessage.getParam();
                    if (param3 != null && (users2 = param3.getUsers()) != null) {
                        int LJJIIZ = C51029K0z.LJJIIZ(C32I.LJJL(users2, 10));
                        if (LJJIIZ >= 16) {
                            i = LJJIIZ;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                        Iterator<LinkLayerRTCMessageUser> it = users2.iterator();
                        while (it.hasNext()) {
                            LinkLayerRTCMessageUser next = it.next();
                            String linkMicId = next.getLinkMicId();
                            if (next.getAudioMute() == 1) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            OSZ osz = new OSZ(linkMicId, Boolean.valueOf(z3));
                            linkedHashMap.put(osz.getFirst(), osz.getSecond());
                        }
                        this.LIZ.hn(1, new AqS144S0200000_13(this, (C75812TpA) linkedHashMap, (java.util.Map<String, Boolean>) 45));
                        return;
                    }
                    return;
                }
                if (!method.equals("linkMicSDKLayoutChange")) {
                    return;
                }
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("onRoomMsgReceived LINK_LAYER_LAYOUT_CHANGE param = ");
                LIZ3.append(linkLayerRTCMessage.getParam());
                UC0.LJJIZ(X1D.LIZIZ(LIZ3), "RTCHandler");
                LinkLayerRTCMessageParam param4 = linkLayerRTCMessage.getParam();
                if (param4 == null || (layoutId = param4.getLayoutId()) == null) {
                    return;
                }
                this.LIZ.hn(1, new AqS36S1000000_13(layoutId, 1));
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("[fireEvent] received new Layout ");
                LIZ4.append(layoutId);
                UC0.LJJIZ(X1D.LIZIZ(LIZ4), "VMState");
                return;
            }
            if (!method.equals("linkMicSDKVideoMute")) {
                return;
            }
            Long timeStamp2 = linkLayerRTCMessage.getTimeStamp();
            if (timeStamp2 != null) {
                j = timeStamp2.longValue();
            }
            LIZLLL(4, j, linkLayerRTCMessage.getOs());
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("received LINK_LAYER_MUTE_VIDEO Message param = ");
            LIZ5.append(linkLayerRTCMessage.getParam());
            UC0.LJJIZ(X1D.LIZIZ(LIZ5), "RTCHandler");
            LinkLayerRTCMessageParam param5 = linkLayerRTCMessage.getParam();
            if (param5 == null || (users = param5.getUsers()) == null) {
                return;
            }
            int LJJIIZ2 = C51029K0z.LJJIIZ(C32I.LJJL(users, 10));
            if (LJJIIZ2 >= 16) {
                i = LJJIIZ2;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(i);
            Iterator<LinkLayerRTCMessageUser> it2 = users.iterator();
            while (it2.hasNext()) {
                LinkLayerRTCMessageUser next2 = it2.next();
                String linkMicId2 = next2.getLinkMicId();
                if (next2.getVideoMute() == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                OSZ osz2 = new OSZ(linkMicId2, Boolean.valueOf(z2));
                linkedHashMap2.put(osz2.getFirst(), osz2.getSecond());
            }
            this.LIZ.hn(1, new AqS144S0200000_13(this, (C75812TpA) linkedHashMap2, (java.util.Map<String, Boolean>) 44));
            return;
        }
        UC0.LJJIZ("RTC message is new version and need not to handle", "RTCHandler");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJ(ChangeStateReq stateReq) {
        String str;
        int i;
        int i2;
        LinkLayerRTCMessage linkLayerRTCMessage;
        ISessionAbility iSessionAbility;
        int i3;
        RtcUserInfo LLLLLJIL;
        String linkMicId;
        int i4;
        RtcUserInfo LLLLLJIL2;
        String linkMicId2;
        o.LJIIIZ(stateReq, "stateReq");
        int i5 = stateReq.stateType;
        if (i5 != 1) {
            String str2 = "";
            if (i5 != 3) {
                if (i5 != 4) {
                    return;
                }
                ISessionAbility iSessionAbility2 = this.LIZIZ;
                if (iSessionAbility2 != null && (LLLLLJIL2 = iSessionAbility2.LLLLLJIL()) != null && (linkMicId2 = LLLLLJIL2.getLinkMicId()) != null) {
                    str2 = linkMicId2;
                }
                int i6 = 0;
                int i7 = stateReq.videoMuted;
                if (i7 == 0 || i7 != 1) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                linkLayerRTCMessage = LIZIZ(new LinkLayerRTCMessageUser(str2, i6, i6, i4, 6, null), "linkMicSDKVideoMute");
            } else {
                ISessionAbility iSessionAbility3 = this.LIZIZ;
                if (iSessionAbility3 != null && (LLLLLJIL = iSessionAbility3.LLLLLJIL()) != null && (linkMicId = LLLLLJIL.getLinkMicId()) != null) {
                    str2 = linkMicId;
                }
                int i8 = stateReq.audioMuted;
                if (i8 == 0 || i8 != 1) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                int i9 = 0;
                linkLayerRTCMessage = LIZIZ(new LinkLayerRTCMessageUser(str2, i9, i3, i9, 10, null), "linkMicSDKAudioMute");
            }
            if (linkLayerRTCMessage == null) {
                return;
            }
        } else {
            LayoutState layoutState = stateReq.layoutState;
            if (layoutState == null || (str = layoutState.layoutId) == null) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            ISessionAbility iSessionAbility4 = this.LIZIZ;
            if (iSessionAbility4 != null) {
                i = iSessionAbility4.scene();
            } else {
                i = 4;
            }
            ISessionAbility iSessionAbility5 = this.LIZIZ;
            if (iSessionAbility5 != null) {
                i2 = iSessionAbility5.bo0();
            } else {
                i2 = 1;
            }
            linkLayerRTCMessage = new LinkLayerRTCMessage("linkMicSDKLayoutChange", new LinkLayerRTCMessageParam(str, i, i2, null, 0 == true ? 1 : 0, true, 24, 0 == true ? 1 : 0), 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0L, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 124, 0 == true ? 1 : 0);
        }
        linkLayerRTCMessage.generateId();
        if (C76800UCe.LIZ != null && (iSessionAbility = this.LIZIZ) != null) {
            iSessionAbility.Ui(linkLayerRTCMessage);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static LinkLayerRTCMessage LIZIZ(LinkLayerRTCMessageUser linkLayerRTCMessageUser, String str) {
        int i = 0;
        return new LinkLayerRTCMessage(str, new LinkLayerRTCMessageParam(null, i, i, C47261Igj.LJII(linkLayerRTCMessageUser), 0 == true ? 1 : 0, true, 23, 0 == true ? 1 : 0), null, 0 == true ? 1 : 0, 0L, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 124, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List LIZJ(java.util.Map map, int i, List list) {
        String str;
        int i2;
        UserState userState;
        int i3;
        RtcUserInfo LLLLLJIL = this.LIZ.LLLLLJIL();
        if (LLLLLJIL != null) {
            str = LLLLLJIL.getLinkMicId();
        } else {
            str = null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            String str2 = ((UserState) obj).linkMicId;
            if (str2 != null && str2.length() != 0) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(C32I.LJJL(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            UserState userState2 = (UserState) it.next();
            arrayList.add(userState2.linkMicId);
            if (!o.LJ(userState2.linkMicId, str) && map.containsKey(userState2.linkMicId)) {
                if (C29306Beo.LJJIFFI((Boolean) map.get(userState2.linkMicId))) {
                    i3 = 2;
                } else {
                    i3 = 1;
                }
                userState2 = i == 3 ? UserState.LIZ(userState2, 0, i3, 0, 0, 0, 0, 991) : UserState.LIZ(userState2, 0, 0, i3, 0, 0, 0, 959);
            }
            arrayList3.add(userState2);
        }
        java.util.Set keySet = map.keySet();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : keySet) {
            if (!o.LJ(obj2, str) && !arrayList.contains(obj2)) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList(C32I.LJJL(arrayList4, 10));
        Iterator it2 = arrayList4.iterator();
        while (it2.hasNext()) {
            String str3 = (String) it2.next();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("append userState[");
            LIZ.append(str3);
            LIZ.append(']');
            UC0.LJJIZ(X1D.LIZIZ(LIZ), "VMState");
            if (C29306Beo.LJJIFFI((Boolean) map.get(str3))) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            if (i == 3) {
                int i4 = 0;
                userState = new UserState(null, str3, 0 == true ? 1 : 0, 0L, i4, i2, i4, i4, i4, i4, 989, 0 == true ? 1 : 0);
            } else {
                int i5 = 0;
                userState = new UserState(null, str3, 0 == true ? 1 : 0, 0L, i5, i5, i2, i5, i5, i5, 957, 0 == true ? 1 : 0);
            }
            arrayList5.add(userState);
        }
        List LLIIIZ = ORZ.LLIIIZ(arrayList5, arrayList3);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("[fireEvent] from stateIds ");
        LIZ2.append(arrayList);
        LIZ2.append(" , \n resultState ");
        LIZ2.append(LLIIIZ);
        UC0.LJJIZ(X1D.LIZIZ(LIZ2), "VMState");
        return LLIIIZ;
    }

    public final void LIZLLL(int i, long j, String str) {
        String str2;
        String str3;
        ISessionAbility il = this.LIZ.il();
        if (il == null || (str2 = il.LLLLLLIL()) == null) {
            str2 = "";
        }
        String upperCase = str.toUpperCase(Locale.ROOT);
        o.LJIIIIZZ(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        if (o.LJ(upperCase, "ANDROID")) {
            str3 = "AtoA";
        } else if (o.LJ(upperCase, "IOS")) {
            str3 = "iOStoA";
        } else {
            str3 = null;
        }
        C75808Tp6.LIZJ(i, str2, str3, true, j);
    }
}
