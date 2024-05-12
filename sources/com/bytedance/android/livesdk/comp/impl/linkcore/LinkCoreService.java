package com.bytedance.android.livesdk.comp.impl.linkcore;

import X.AbstractC73672Svk;
import X.B83;
import X.C113554cx;
import X.C15610jN;
import X.C17M;
import X.C221108m2;
import X.C29374Bfu;
import X.C32014ChO;
import X.C62822Ol8;
import X.C73318Sq2;
import X.C73969T1h;
import X.C76129TuH;
import X.C76762UAs;
import X.C76766UAw;
import X.C77800Ug8;
import X.CN1;
import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC88471Ynr;
import X.InterfaceC92693kP;
import X.OSZ;
import X.U44;
import X.U4R;
import X.U66;
import X.U6D;
import X.U71;
import X.U76;
import X.U7F;
import X.U7T;
import X.U7V;
import X.U9H;
import X.UA9;
import X.UBA;
import X.UBL;
import X.UC0;
import X.X1D;
import Y.ARunnableS16S0400000_13;
import Y.ARunnableS24S0300000_13;
import Y.ARunnableS32S0200000_13;
import Y.AfS62S0200000_13;
import Y.AfS65S0100000_13;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.comp.api.linkcore.ILinkCoreService;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostCrossRoomPushSDKSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostRtcReplyMsgSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestUseLinkmicAloggerSetting;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.message.IMessageService;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class LinkCoreService implements ILinkCoreService, OnMessageListener {
    public static final /* synthetic */ int LJLL = 0;
    public volatile boolean LJLIL;
    public long LJLILLLLZI;
    public Room LJLJI;
    public final CopyOnWriteArrayList<U66> LJLJJI = new CopyOnWriteArrayList<>();
    public final C73318Sq2 LJLJJL = new C73318Sq2();
    public final CopyOnWriteArrayList<UBA> LJLJJLL = new CopyOnWriteArrayList<>();
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 219));
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(new AqS163S0100000_13(this, 220));
    public final HashMap<Integer, Boolean> LJLJLLL = new HashMap<>(C113554cx.LJJL(new OSZ(4, Boolean.FALSE), new OSZ(2, Boolean.TRUE)));

    @Override // com.bytedance.android.livesdk.comp.api.linkcore.ILinkCoreService
    public final synchronized U7F iE() {
        U7F u7f;
        u7f = new U7F(2, this.LJLJI);
        U9H listener = (U9H) this.LJLJLJ.getValue();
        o.LJIIIZ(listener, "listener");
        u7f.LJIILL.add(listener);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getCoLinker get and add Linker ");
        LIZ.append(u7f);
        LIZ.append(' ');
        U4R.LIZLLL("LinkCoreService", X1D.LIZIZ(LIZ));
        this.LJLJJI.add(u7f);
        return u7f;
    }

    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    static {
        new UBL();
    }

    @Override // com.bytedance.android.livesdk.comp.api.linkcore.ILinkCoreService
    public final boolean LIZIZ() {
        U4R.LIZLLL("LinkCoreService", "unbind start");
        C76129TuH.LIZJ();
        if (!this.LJLIL) {
            C32014ChO.LIZJ(LJFF(149), "unbind mIsInitialized == false ", null);
            return false;
        }
        this.LJLIL = false;
        IMessageManager iMessageManager = ((IMessageService) CN1.LIZ(IMessageService.class)).get(this.LJLILLLLZI);
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        if (!this.LJLJJL.LJLILLLLZI) {
            this.LJLJJL.dispose();
        }
        U7V.LJIILJJIL(new AqS163S0100000_13(this, 412));
        return true;
    }

    @Override // com.bytedance.android.livesdk.comp.api.linkcore.ILinkCoreService
    public final List<U66> vd() {
        return this.LJLJJI;
    }

    public final void LIZ(Room room) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("bindRoom start room=");
        LIZ.append(room.getId());
        U4R.LIZLLL("LinkCoreService", X1D.LIZIZ(LIZ));
        if (this.LJLIL) {
            return;
        }
        this.LJLIL = true;
        this.LJLJI = room;
        this.LJLILLLLZI = room.getId();
        room.getOwnerUserId();
        room.getOwnerUserId();
        ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
        IMessageManager iMessageManager = ((IMessageService) CN1.LIZ(IMessageService.class)).get(this.LJLILLLLZI);
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(EnumC31509CYf.BASE_LINK_LAYER_MESSAGE.getIntType(), this);
            iMessageManager.addMessageListener(EnumC31509CYf.MEMBER.getIntType(), this);
            iMessageManager.addMessageListener(EnumC31509CYf.LINK_MESSAGE.getIntType(), this);
        }
    }

    public final U66 LJ(long j) {
        U66 u66;
        Iterator<U66> it = this.LJLJJI.iterator();
        while (true) {
            if (it.hasNext()) {
                u66 = it.next();
                if (u66.LJJLI() == j) {
                    break;
                }
            } else {
                u66 = null;
                break;
            }
        }
        return u66;
    }

    public final String LJFF(int i) {
        if (MultiGuestUseLinkmicAloggerSetting.INSTANCE.isEnable()) {
            StackTraceElement LJ = C32014ChO.LJ();
            StringBuilder LIZ = X1D.LIZ();
            return C77800Ug8.LIZLLL(U44.LINKER, LIZ, "_LinkCoreService_", LJ, LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        return C17M.LIZ(U44.LINKER, LIZ2, "_LinkCoreService_", i, LIZ2);
    }

    public final void LJI(LinkLayerMessage linkLayerMessage) {
        InterfaceC92693kP LJJJLIIL = AbstractC73672Svk.LJJIJIL(1).LJJJ(C73969T1h.LIZ(C76766UAw.LIZJ.LIZIZ())).LJJJLIIL(new AfS62S0200000_13(linkLayerMessage, this, 12), new AfS65S0100000_13(this, 81));
        C73318Sq2 compositeDisposable = this.LJLJJL;
        o.LJIIIZ(compositeDisposable, "compositeDisposable");
        compositeDisposable.LIZ(LJJJLIIL);
    }

    public final void LJII(UBA uba) {
        if (uba != null) {
            this.LJLJJLL.add(uba);
        }
    }

    @Override // com.bytedance.android.livesdk.comp.api.linkcore.ILinkCoreService
    public final void Pi0(UBA uba) {
        U4R.LIZLLL("LinkCoreService", "removeLinkerLiveCycleCallback start");
        if (uba != null) {
            this.LJLJJLL.remove(uba);
        }
    }

    @Override // com.bytedance.android.livesdk.comp.api.linkcore.ILinkCoreService
    public final void X6(boolean z) {
        this.LJLJLLL.put(2, Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.livesdk.comp.api.linkcore.ILinkCoreService
    public final synchronized U6D ZH(int i) {
        U7F u7f;
        if (MtCoHostCrossRoomPushSDKSetting.isEnable()) {
            if (i != 2 && i != 4) {
                throw new IllegalArgumentException();
            }
            U7T u7t = new U7T(i, this.LJLJI);
            u7t.LJJJJL((U76) this.LJLJL.getValue());
            this.LJLJJI.add(u7t);
            return u7t;
        }
        if (i != 2) {
            if (i == 4) {
                U7T u7t2 = new U7T(i, this.LJLJI);
                u7t2.LJJJJL((U76) this.LJLJL.getValue());
                this.LJLJJI.add(u7t2);
                u7f = u7t2;
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            U7F u7f2 = new U7F(i, this.LJLJI);
            U9H listener = (U9H) this.LJLJLJ.getValue();
            o.LJIIIZ(listener, "listener");
            u7f2.LJIILL.add(listener);
            this.LJLJJI.add(u7f2);
            u7f = u7f2;
        }
        return u7f;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        Long l;
        long j;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onMessage start messageId=");
        if (iMessage != null) {
            l = Long.valueOf(iMessage.getMessageId());
        } else {
            l = null;
        }
        LIZ.append(l);
        U4R.LIZLLL("LinkCoreService", X1D.LIZIZ(LIZ));
        if (iMessage instanceof LinkLayerMessage) {
            if (MtCoHostCrossRoomPushSDKSetting.isEnable()) {
                LinkLayerMessage linkLayerMessage = (LinkLayerMessage) iMessage;
                if ((linkLayerMessage.scene == 2 && !o.LJ(this.LJLJLLL.get(2), Boolean.TRUE)) || (linkLayerMessage.scene == 4 && !o.LJ(this.LJLJLLL.get(4), Boolean.TRUE))) {
                    LJI(linkLayerMessage);
                    return;
                } else {
                    U4R.LIZIZ("LinkCoreService", "onMessage sdk is disabled, not to handle message");
                    return;
                }
            }
            if (!o.LJ(this.LJLJLLL.get(4), Boolean.TRUE)) {
                LJI((LinkLayerMessage) iMessage);
                return;
            } else {
                C32014ChO.LIZJ(LJFF(198), "onMessage sdk is disabled, not to handle message", null);
                return;
            }
        }
        if (iMessage instanceof LinkMessage) {
            LinkMessage linkMessage = (LinkMessage) iMessage;
            if (linkMessage.scene != 2) {
                return;
            }
            if (!o.LJ(this.LJLJLLL.get(2), Boolean.TRUE)) {
                InterfaceC92693kP LJJJLIIL = AbstractC73672Svk.LJJIJIL(1).LJJJ(C73969T1h.LIZ(C76766UAw.LIZJ.LIZIZ())).LJJJLIIL(new AfS62S0200000_13(linkMessage, this, 34), new AfS65S0100000_13(this, 153));
                C73318Sq2 compositeDisposable = this.LJLJJL;
                o.LJIIIZ(compositeDisposable, "compositeDisposable");
                compositeDisposable.LIZ(LJJJLIIL);
                return;
            }
            C32014ChO.LIZJ(LJFF(206), "onMessage sdk is disabled, not to handle multi host message", null);
            return;
        }
        if (!(iMessage instanceof MemberMessage)) {
            return;
        }
        Iterator<U66> it = this.LJLJJI.iterator();
        while (it.hasNext()) {
            U66 next = it.next();
            if ((next instanceof U7T) && next.getScene() == 4) {
                U71 LJJIJIIJIL = ((U7T) next).LJJIJIIJIL();
                User user = ((MemberMessage) iMessage).user;
                if (user != null) {
                    j = user.getId();
                } else {
                    j = 0;
                }
                LJJIJIIJIL.LJJLI(j, true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [X.UBA] */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.U66, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [X.U7F, X.U6D, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [X.U66] */
    public final U66 LIZLLL(CR6 cr6, InterfaceC88471Ynr interfaceC88471Ynr) {
        if (cr6 instanceof LinkLayerMessage) {
            LinkLayerMessage linkLayerMessage = (LinkLayerMessage) cr6;
            U66 LJ = LJ(linkLayerMessage.channelId);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("findAndCreateTargetLinker target linker ");
            LIZ.append(LJ);
            U4R.LIZLLL("LinkCoreService", X1D.LIZIZ(LIZ));
            if (LJ == null) {
                U7T u7t = new U7T(linkLayerMessage.scene, this.LJLJI);
                u7t.g(String.valueOf(linkLayerMessage.channelId));
                u7t.LJJJJL((U76) this.LJLJL.getValue());
                this.LJLJJI.add(u7t);
                C15610jN.LIZIZ(new ARunnableS32S0200000_13(this, u7t, 78));
                return u7t;
            }
            return LJ;
        }
        if (cr6 instanceof LinkMessage) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("findAndCreateTargetLinker,scene:");
            LinkMessage linkMessage = (LinkMessage) cr6;
            LIZ2.append(linkMessage.scene);
            LIZ2.append(", message.channelId:");
            LIZ2.append(linkMessage.channelId);
            LIZ2.append(", messageType:");
            LIZ2.append(linkMessage.messageType);
            U4R.LIZLLL("LinkCoreService", X1D.LIZIZ(LIZ2));
            ?? LJ2 = LJ(linkMessage.channelId);
            if (LJ2 != 0) {
                if (interfaceC88471Ynr != null) {
                    interfaceC88471Ynr.invoke(LJ2, cr6);
                }
            } else {
                LJ2 = new U7F(linkMessage.scene, this.LJLJI);
                Object listener = this.LJLJLJ.getValue();
                o.LJIIIZ(listener, "listener");
                LJ2.LJIILL.add(listener);
                LJ2.g(String.valueOf(linkMessage.channelId));
                this.LJLJJI.add(LJ2);
                if (MtCoHostRtcReplyMsgSetting.INSTANCE.isEnable()) {
                    Iterator<UBA> it = this.LJLJJLL.iterator();
                    while (it.hasNext()) {
                        it.next().LIZLLL(LJ2);
                    }
                } else {
                    C15610jN.LIZIZ(new ARunnableS16S0400000_13(this, interfaceC88471Ynr, (Object) LJ2, cr6, 2));
                }
            }
            return LJ2;
        }
        throw new IllegalArgumentException();
    }

    @Override // com.bytedance.android.livesdk.comp.api.linkcore.ILinkCoreService
    public final void lf0(String str, AqS179S0100000_13 aqS179S0100000_13) {
        CopyOnWriteArrayList<U66> copyOnWriteArrayList = this.LJLJJI;
        U66 u66 = null;
        if (copyOnWriteArrayList != null) {
            Iterator<U66> it = copyOnWriteArrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                U66 next = it.next();
                if (o.LJ(String.valueOf(next.LJJLI()), str)) {
                    u66 = next;
                    break;
                }
            }
            u66 = u66;
        }
        C76762UAs LIZJ = UA9.LIZJ();
        LIZJ.getClass();
        UC0.LJJLIIIIJ(new ARunnableS24S0300000_13(u66, LIZJ, aqS179S0100000_13, 40));
    }

    public static void LJIIIIZZ(LinkCoreService linkCoreService, U66 u66, boolean z, String str, Long l, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            l = null;
        }
        linkCoreService.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("removeTargetLinker remove target linker ");
        LIZ.append(u66);
        LIZ.append(" isFromDestroyMessage=");
        LIZ.append(z);
        LIZ.append(" source=");
        LIZ.append(str);
        U4R.LIZLLL("LinkCoreService", X1D.LIZIZ(LIZ));
        if (linkCoreService.LJLJJI.contains(u66)) {
            linkCoreService.LJLJJI.remove(u66);
            if (!(u66 instanceof U7F)) {
                u66.LJIIJJI(str, !z);
            }
            Iterator<UBA> it = linkCoreService.LJLJJLL.iterator();
            while (it.hasNext()) {
                it.next().LIZIZ(u66, l);
            }
        }
    }
}
