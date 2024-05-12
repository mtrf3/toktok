package X;

import Y.ARunnableS32S0200000_13;
import android.content.Context;
import com.bytedance.android.livesdk.comp.api.linkcore.ILinkCoreService;
import com.bytedance.android.livesdk.comp.impl.linkcore.LinkCoreService;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiguestExpandGuestCountVersionSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiguestExpandGuestCountVersionV2Setting;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostCrossRoomPushSDKSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestOptPanelFixLayoutConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestOptPanelFixLayoutEnabledSetting;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdk.sei.SeiDsl;
import com.bytedance.android.livesdk.sei.VoiceChatSeiAppData;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS102S0300000_13;
import kotlin.jvm.internal.AqS160S0200000_13;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.AqS37S0001000_13;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.U5a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76614U5a implements InterfaceC74805TXl, UBA {
    public final Context LIZ;
    public final Room LIZIZ;
    public final ILinkCoreService LIZJ;
    public final long LIZLLL;
    public final CopyOnWriteArrayList<InterfaceC75441TjB> LJ;
    public final CopyOnWriteArrayList<InterfaceC76620U5g> LJFF;

    @Override // X.InterfaceC74805TXl
    public final void dispose() {
        U4R.LIZLLL("LinkMicManager", "dispose start");
        this.LIZJ.Pi0(this);
        this.LIZJ.LIZIZ();
        C76616U5c c76616U5c = C76616U5c.LIZ;
        String key = String.valueOf(this.LIZLLL);
        synchronized (c76616U5c) {
            o.LJIIIZ(key, "key");
            C76616U5c.LIZIZ.remove(key);
        }
        U4R.LIZ = 0L;
        this.LJ.clear();
    }

    @Override // X.InterfaceC74805TXl
    public final boolean isActive() {
        boolean z;
        InterfaceC75441TjB interfaceC75441TjB;
        Iterator<InterfaceC75441TjB> it = this.LJ.iterator();
        while (true) {
            z = true;
            if (it.hasNext()) {
                interfaceC75441TjB = it.next();
                if (interfaceC75441TjB.scene() == 4) {
                    break;
                }
            } else {
                interfaceC75441TjB = null;
                break;
            }
        }
        InterfaceC75441TjB interfaceC75441TjB2 = interfaceC75441TjB;
        if (interfaceC75441TjB2 == null) {
            return false;
        }
        if (interfaceC75441TjB2.LIZIZ() != 5 || interfaceC75441TjB2.LLIIJI().LJJIIZI().size() <= 1) {
            z = false;
        }
        return z;
    }

    @Override // X.InterfaceC74805TXl
    public final int LIZ(int i) {
        if (i != 2) {
            if (i != 4) {
                return -1;
            }
            if (MultiGuestOptPanelFixLayoutEnabledSetting.INSTANCE.getValue()) {
                return MultiGuestOptPanelFixLayoutConfigSetting.INSTANCE.getValue().version;
            }
            LiveSdkMultiguestExpandGuestCountVersionV2Setting liveSdkMultiguestExpandGuestCountVersionV2Setting = LiveSdkMultiguestExpandGuestCountVersionV2Setting.INSTANCE;
            if (liveSdkMultiguestExpandGuestCountVersionV2Setting.getValue() >= 4) {
                return liveSdkMultiguestExpandGuestCountVersionV2Setting.getValue();
            }
            return LiveSdkMultiguestExpandGuestCountVersionSetting.INSTANCE.getValue();
        }
        return 1;
    }

    @Override // X.UBA
    public final synchronized void LIZLLL(U6D linker) {
        o.LJIIIZ(linker, "linker");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLinkerCreated start linker=");
        LIZ.append(linker);
        U4R.LIZLLL("LinkMicManager", X1D.LIZIZ(LIZ));
        if (MtCoHostCrossRoomPushSDKSetting.isEnable()) {
            if (linker instanceof U7T) {
                U65 u65 = new U65(this.LIZ, linker.getScene(), LIZ(linker.getScene()), this.LIZIZ, linker);
                ORS.LJJLIL(new AqS179S0100000_13(linker, 509), this.LJ);
                this.LJ.add(u65);
                Iterator<InterfaceC76620U5g> it = this.LJFF.iterator();
                while (it.hasNext()) {
                    it.next().LLJILJIL(u65);
                }
            } else if (linker instanceof U7F) {
                U64 u64 = new U64(this.LIZ, 2, LIZ(2), this.LIZIZ, String.valueOf(linker.LJJLI()), this.LIZJ, this);
                ORS.LJJLIL(C76618U5e.LJLIL, this.LJ);
                this.LJ.add(u64);
                u64.LLJIJIL(linker);
                Iterator<InterfaceC76620U5g> it2 = this.LJFF.iterator();
                while (it2.hasNext()) {
                    it2.next().LLJILJIL(u64);
                }
            }
        } else if (linker.getScene() == 4) {
            int scene = linker.getScene();
            U65 u652 = new U65(this.LIZ, scene, LIZ(scene), this.LIZIZ, linker);
            ORS.LJJLIL(new AqS37S0001000_13(scene, 8), this.LJ);
            this.LJ.add(u652);
            Iterator<InterfaceC76620U5g> it3 = this.LJFF.iterator();
            while (it3.hasNext()) {
                it3.next().LLJILJIL(u652);
            }
        } else {
            U64 u642 = new U64(this.LIZ, 2, LIZ(2), this.LIZIZ, String.valueOf(linker.LJJLI()), this.LIZJ, this);
            ORS.LJJLIL(C76619U5f.LJLIL, this.LJ);
            this.LJ.add(u642);
            u642.LLJIJIL(linker);
            Iterator<InterfaceC76620U5g> it4 = this.LJFF.iterator();
            while (it4.hasNext()) {
                it4.next().LLJILJIL(u642);
            }
        }
    }

    @Override // X.InterfaceC74805TXl
    public final synchronized InterfaceC75441TjB LJ(String str) {
        InterfaceC75441TjB interfaceC75441TjB;
        InterfaceC75441TjB interfaceC75441TjB2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("obtainOldMultiHostSession start channelId=");
        LIZ.append(str);
        U4R.LIZLLL("LinkMicManager", X1D.LIZIZ(LIZ));
        Iterator<InterfaceC75441TjB> it = this.LJ.iterator();
        while (true) {
            if (it.hasNext()) {
                interfaceC75441TjB = it.next();
                if (interfaceC75441TjB instanceof U64) {
                    break;
                }
            } else {
                interfaceC75441TjB = null;
                break;
            }
        }
        interfaceC75441TjB2 = interfaceC75441TjB;
        if (interfaceC75441TjB2 == null) {
            interfaceC75441TjB2 = new U64(this.LIZ, 2, LIZ(2), this.LIZIZ, str, this.LIZJ, this);
            this.LJ.add(interfaceC75441TjB2);
        }
        return interfaceC75441TjB2;
    }

    @Override // X.InterfaceC74805TXl
    public final void LJIIIIZZ(InterfaceC76620U5g listener) {
        o.LJIIIZ(listener, "listener");
        this.LJFF.remove(listener);
    }

    @Override // X.InterfaceC74805TXl
    public final void LJIIIZ(InterfaceC76620U5g listener) {
        o.LJIIIZ(listener, "listener");
        this.LJFF.add(listener);
    }

    @Override // X.InterfaceC74805TXl
    public final void X6(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setDisableSDK start scene=");
        LIZ.append(2);
        LIZ.append(" disable=");
        LIZ.append(z);
        U4R.LIZLLL("LinkMicManager", X1D.LIZIZ(LIZ));
        this.LIZJ.X6(z);
    }

    @Override // X.UBA
    public final synchronized void LIZIZ(U66 linker, Long l) {
        InterfaceC75441TjB interfaceC75441TjB;
        o.LJIIIZ(linker, "linker");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLinkerDestroyed start linker=");
        LIZ.append(linker);
        U4R.LIZLLL("LinkMicManager", X1D.LIZIZ(LIZ));
        long LJJLI = linker.LJJLI();
        Iterator<InterfaceC75441TjB> it = this.LJ.iterator();
        while (true) {
            if (it.hasNext()) {
                interfaceC75441TjB = it.next();
                if (o.LJ(interfaceC75441TjB.LLLLLLIL(), String.valueOf(LJJLI))) {
                    break;
                }
            } else {
                interfaceC75441TjB = null;
                break;
            }
        }
        InterfaceC75441TjB interfaceC75441TjB2 = interfaceC75441TjB;
        if (interfaceC75441TjB2 != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onLinkerDestroyed remove sessionList channelId:");
            LIZ2.append(interfaceC75441TjB2.LLLLLLIL());
            U4R.LIZLLL("LinkMicManager", X1D.LIZIZ(LIZ2));
            this.LJ.remove(interfaceC75441TjB2);
            interfaceC75441TjB2.LJJLI("dispose_on_linker_destroy");
            Iterator<InterfaceC76620U5g> it2 = this.LJFF.iterator();
            while (it2.hasNext()) {
                it2.next().LJJLIIIIJ(interfaceC75441TjB2, l);
            }
        }
    }

    @Override // X.InterfaceC74805TXl
    public final synchronized InterfaceC75441TjB LIZJ(int i, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("obtainSession start scene=");
        LIZ.append(i);
        LIZ.append(" channelId=");
        LIZ.append(str);
        U4R.LIZLLL("LinkMicManager", X1D.LIZIZ(LIZ));
        InterfaceC75441TjB interfaceC75441TjB = null;
        if (MtCoHostCrossRoomPushSDKSetting.isEnable() && i == 2) {
            Iterator<InterfaceC75441TjB> it = this.LJ.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                InterfaceC75441TjB next = it.next();
                InterfaceC75441TjB interfaceC75441TjB2 = next;
                if ((interfaceC75441TjB2 instanceof U65) && interfaceC75441TjB2.scene() == i) {
                    interfaceC75441TjB = next;
                    break;
                }
            }
            InterfaceC75441TjB interfaceC75441TjB3 = interfaceC75441TjB;
            if (interfaceC75441TjB3 != null) {
                return interfaceC75441TjB3;
            }
            U65 u65 = new U65(this.LIZ, 2, LIZ(i), this.LIZIZ, str, this.LIZJ);
            this.LJ.add(u65);
            if (o.LJ(C16880lQ.LLJJJJ().getThread(), C16880lQ.LLLLIIIILLL())) {
                Iterator<InterfaceC76620U5g> it2 = this.LJFF.iterator();
                while (it2.hasNext()) {
                    it2.next().LLJILJIL(u65);
                }
            } else {
                C15610jN.LIZIZ(new ARunnableS32S0200000_13(this, u65, 105));
            }
            return u65;
        }
        if (i == 2) {
            Iterator<InterfaceC75441TjB> it3 = this.LJ.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                InterfaceC75441TjB next2 = it3.next();
                if (next2.scene() == i) {
                    interfaceC75441TjB = next2;
                    break;
                }
            }
            InterfaceC75441TjB interfaceC75441TjB4 = interfaceC75441TjB;
            if (interfaceC75441TjB4 == null) {
                interfaceC75441TjB4 = LJIIJ(i, str);
            }
            return interfaceC75441TjB4;
        }
        Iterator<InterfaceC75441TjB> it4 = this.LJ.iterator();
        while (it4.hasNext()) {
            InterfaceC75441TjB next3 = it4.next();
            InterfaceC75441TjB interfaceC75441TjB5 = next3;
            if (interfaceC75441TjB5.scene() == i && (str == null || o.LJ(str, interfaceC75441TjB5.LLLLLLIL()))) {
                interfaceC75441TjB = next3;
                break;
            }
        }
        InterfaceC75441TjB interfaceC75441TjB6 = interfaceC75441TjB;
        if (interfaceC75441TjB6 == null) {
            interfaceC75441TjB6 = LJIIJ(i, str);
        }
        return interfaceC75441TjB6;
    }

    @Override // X.InterfaceC74805TXl
    public final void LJFF(C28272B7s c28272B7s, InterfaceC88472Yns<? super SeiAppData, C76800UCe> interfaceC88472Yns) {
        SeiAppData LJIIJ;
        InterfaceC75441TjB interfaceC75441TjB = null;
        if (MtCoHostCrossRoomPushSDKSetting.isEnable()) {
            if (c28272B7s != null && c28272B7s.LIZIZ != null) {
                String str = c28272B7s.LIZIZ;
                if (str != null && s.LJJLIIIJL(str, "ByteVC", 0, false, 6) == -1) {
                    SeiAppData LJIIJ2 = C75806Tp4.LJIIJ(c28272B7s);
                    if (LJIIJ2 != null) {
                        if (interfaceC88472Yns != null) {
                            interfaceC88472Yns.invoke(LJIIJ2);
                        }
                        Iterator<InterfaceC75441TjB> it = this.LJ.iterator();
                        while (it.hasNext()) {
                            InterfaceC75441TjB next = it.next();
                            SeiDsl seiDsl = LJIIJ2.dsl;
                            if (seiDsl != null && next.scene() == seiDsl.scene && o.LJ(next.LLLLLLIL(), LJIIJ2.channelId)) {
                                C29306Beo.LJJJ(new AqS102S0300000_13(next, c28272B7s, LJIIJ2, 19));
                            } else {
                                C29306Beo.LJJJ(new AqS163S0100000_13(next, 458));
                            }
                        }
                        return;
                    }
                    Iterator<InterfaceC75441TjB> it2 = this.LJ.iterator();
                    while (it2.hasNext()) {
                        C29306Beo.LJJJ(new AqS160S0200000_13(it2.next(), c28272B7s, 63));
                    }
                    return;
                }
                return;
            }
            Iterator<InterfaceC75441TjB> it3 = this.LJ.iterator();
            while (it3.hasNext()) {
                C29306Beo.LJJJ(new AqS163S0100000_13(it3.next(), 459));
            }
            return;
        }
        if (c28272B7s != null && (LJIIJ = C75806Tp4.LJIIJ(c28272B7s)) != null) {
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(LJIIJ);
            }
            Iterator<InterfaceC75441TjB> it4 = this.LJ.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                InterfaceC75441TjB next2 = it4.next();
                InterfaceC75441TjB interfaceC75441TjB2 = next2;
                SeiDsl seiDsl2 = LJIIJ.dsl;
                if (seiDsl2 != null && interfaceC75441TjB2.scene() == seiDsl2.scene && o.LJ(interfaceC75441TjB2.LLLLLLIL(), LJIIJ.channelId)) {
                    interfaceC75441TjB = next2;
                    break;
                }
            }
            InterfaceC75441TjB interfaceC75441TjB3 = interfaceC75441TjB;
            if (interfaceC75441TjB3 != null) {
                C29306Beo.LJJJ(new AqS102S0300000_13(interfaceC75441TjB3, c28272B7s, LJIIJ, 20));
            }
        }
    }

    public final InterfaceC75441TjB LJIIJ(int i, String str) {
        if (i != 2) {
            if (i == 4) {
                U65 u65 = new U65(this.LIZ, 4, LIZ(i), this.LIZIZ, str, this.LIZJ);
                ORS.LJJLIL(C76617U5d.LJLIL, this.LJ);
                this.LJ.add(u65);
                if (o.LJ(C16880lQ.LLJJJJ().getThread(), C16880lQ.LLLLIIIILLL())) {
                    Iterator<InterfaceC76620U5g> it = this.LJFF.iterator();
                    while (it.hasNext()) {
                        it.next().LLJILJIL(u65);
                    }
                    return u65;
                }
                C15610jN.LIZIZ(new ARunnableS32S0200000_13(this, u65, 104));
                return u65;
            }
            throw new IllegalArgumentException();
        }
        U64 u64 = new U64(this.LIZ, 2, LIZ(i), this.LIZIZ, str, this.LIZJ, this);
        this.LJ.add(u64);
        return u64;
    }

    public C76614U5a(Context context, Room room, LinkCoreService linkCoreService) {
        this.LIZ = context;
        this.LIZIZ = room;
        this.LIZJ = linkCoreService;
        long id = room.getId();
        this.LIZLLL = id;
        this.LJ = new CopyOnWriteArrayList<>();
        this.LJFF = new CopyOnWriteArrayList<>();
        U4R.LIZ = id;
        linkCoreService.LJII(this);
    }

    @Override // X.InterfaceC74805TXl
    public final void LJI(C28272B7s c28272B7s, InterfaceC88472Yns<? super SeiAppData, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super String, ? super C28272B7s, C76800UCe> interfaceC88471Ynr) {
        InterfaceC75441TjB interfaceC75441TjB;
        if (MtCoHostCrossRoomPushSDKSetting.isEnable()) {
            C31811Ce7.LIZLLL("LinkMicManager", "MtCoHostCrossRoomPushSDKSetting true");
            if (c28272B7s != null && c28272B7s.LIZIZ != null) {
                String str = c28272B7s.LIZIZ;
                if (str != null && s.LJJLIIIJL(str, "ByteVC", 0, false, 6) == -1) {
                    SeiAppData LJIIJ = C75806Tp4.LJIIJ(c28272B7s);
                    if (LJIIJ != null) {
                        interfaceC88472Yns.invoke(LJIIJ);
                        Iterator<InterfaceC75441TjB> it = this.LJ.iterator();
                        while (it.hasNext()) {
                            InterfaceC75441TjB next = it.next();
                            SeiDsl seiDsl = LJIIJ.dsl;
                            if (seiDsl != null && next.scene() == seiDsl.scene && o.LJ(next.LLLLLLIL(), LJIIJ.channelId)) {
                                C29306Beo.LJJJ(new AqS102S0300000_13(next, c28272B7s, LJIIJ, 21));
                            } else {
                                C29306Beo.LJJJ(new AqS163S0100000_13(next, 460));
                            }
                        }
                        return;
                    }
                    Iterator<InterfaceC75441TjB> it2 = this.LJ.iterator();
                    while (it2.hasNext()) {
                        C29306Beo.LJJJ(new AqS160S0200000_13(it2.next(), c28272B7s, 64));
                    }
                    String str2 = c28272B7s.LIZIZ;
                    if (str2 != null && !s.LJJJLZIJ(str2, "ktv_sei", false) && interfaceC88471Ynr != null) {
                        interfaceC88471Ynr.invoke("SeiHelper.parseSei(sei) failed with return null, may sei format not match linkMic biz", c28272B7s);
                        return;
                    }
                    return;
                }
                return;
            }
            Iterator<InterfaceC75441TjB> it3 = this.LJ.iterator();
            while (it3.hasNext()) {
                C29306Beo.LJJJ(new AqS163S0100000_13(it3.next(), 461));
            }
            return;
        }
        C31811Ce7.LIZLLL("LinkMicManager", "MtCoHostCrossRoomPushSDKSetting false");
        if (c28272B7s == null) {
            return;
        }
        SeiAppData LJIIJ2 = C75806Tp4.LJIIJ(c28272B7s);
        if (LJIIJ2 != null) {
            interfaceC88472Yns.invoke(LJIIJ2);
            Iterator<InterfaceC75441TjB> it4 = this.LJ.iterator();
            while (true) {
                if (it4.hasNext()) {
                    interfaceC75441TjB = it4.next();
                    InterfaceC75441TjB interfaceC75441TjB2 = interfaceC75441TjB;
                    SeiDsl seiDsl2 = LJIIJ2.dsl;
                    if (seiDsl2 != null && interfaceC75441TjB2.scene() == seiDsl2.scene && o.LJ(interfaceC75441TjB2.LLLLLLIL(), LJIIJ2.channelId)) {
                        break;
                    }
                } else {
                    interfaceC75441TjB = null;
                    break;
                }
            }
            InterfaceC75441TjB interfaceC75441TjB3 = interfaceC75441TjB;
            if (interfaceC75441TjB3 != null) {
                C29306Beo.LJJJ(new AqS102S0300000_13(interfaceC75441TjB3, c28272B7s, LJIIJ2, 22));
                if (C76800UCe.LIZ != null) {
                    return;
                }
            }
        }
        String str3 = c28272B7s.LIZIZ;
        if (str3 != null && !s.LJJJLZIJ(str3, "ktv_sei", false) && interfaceC88471Ynr != null) {
            interfaceC88471Ynr.invoke("SeiHelper.parseSei(sei) failed with return null, may sei format not match linkMic biz", c28272B7s);
        }
    }

    @Override // X.InterfaceC74805TXl
    public final void LJII(C28272B7s c28272B7s, AqS179S0100000_13 aqS179S0100000_13, C74806TXm c74806TXm) {
        InterfaceC75441TjB interfaceC75441TjB;
        if (c28272B7s == null) {
            return;
        }
        VoiceChatSeiAppData voiceChatSeiAppData = (VoiceChatSeiAppData) C75806Tp4.LJIIJJI(VoiceChatSeiAppData.class, c28272B7s.LIZIZ);
        if (voiceChatSeiAppData != null) {
            aqS179S0100000_13.invoke(voiceChatSeiAppData);
            Iterator<InterfaceC75441TjB> it = this.LJ.iterator();
            while (true) {
                interfaceC75441TjB = null;
                if (!it.hasNext()) {
                    break;
                }
                interfaceC75441TjB = it.next();
                InterfaceC75441TjB interfaceC75441TjB2 = interfaceC75441TjB;
                SeiDsl seiDsl = voiceChatSeiAppData.dsl;
                if (seiDsl != null && interfaceC75441TjB2.scene() == seiDsl.scene && o.LJ(interfaceC75441TjB2.LLLLLLIL(), voiceChatSeiAppData.channelId)) {
                    break;
                }
            }
            InterfaceC75441TjB interfaceC75441TjB3 = interfaceC75441TjB;
            if (interfaceC75441TjB3 != null) {
                C29306Beo.LJJJ(new AqS102S0300000_13(interfaceC75441TjB3, c28272B7s, voiceChatSeiAppData, 18));
                if (C76800UCe.LIZ != null) {
                    return;
                }
            }
        }
        if (c74806TXm != null) {
            c74806TXm.invoke("SeiHelper.parseSei(sei) failed with return null, may sei format not match linkMic biz");
        }
    }
}
