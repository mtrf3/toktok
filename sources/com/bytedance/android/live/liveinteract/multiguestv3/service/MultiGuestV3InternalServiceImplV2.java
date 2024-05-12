package com.bytedance.android.live.liveinteract.multiguestv3.service;

import X.B83;
import X.C0NB;
import X.C29374Bfu;
import X.C75745To5;
import X.C76614U5a;
import X.C76615U5b;
import X.CN1;
import X.InterfaceC74695TTf;
import X.InterfaceC74805TXl;
import X.InterfaceC75441TjB;
import X.InterfaceC76112Tu0;
import X.InterfaceC76620U5g;
import X.JBR;
import X.N39;
import X.N3Y;
import X.TWV;
import X.TWW;
import X.TWX;
import X.TWY;
import X.U62;
import X.U8H;
import X.X1D;
import android.content.Context;
import com.bytedance.android.livesdk.comp.api.linkcore.api.ILinkMicService;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MixInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrl;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class MultiGuestV3InternalServiceImplV2 implements IMultiGuestV3InternalServiceV2, InterfaceC76620U5g {
    public Room LJLIL;
    public InterfaceC74805TXl LJLILLLLZI;
    public InterfaceC75441TjB LJLJI;
    public DataChannel LJLJJI;
    public final ArrayList<U62> LJLJJL = new ArrayList<>();
    public final ArrayList<InterfaceC76112Tu0> LJLJJLL = new ArrayList<>();

    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    static {
        new TWY();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2
    public final InterfaceC74805TXl C4() {
        InterfaceC74805TXl interfaceC74805TXl = this.LJLILLLLZI;
        if (interfaceC74805TXl != null) {
            return interfaceC74805TXl;
        }
        o.LJIJI("linkMicManager");
        throw null;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2
    public final void LJJIIJZLJL() {
        C0NB.LJIIIZ("MultiGuestV3InternalServiceImplV2", "detach");
        LIZLLL(this.LJLJI, "dispose_MultiGuestV3InternalService_detach");
        this.LJLJI = null;
        InterfaceC74805TXl interfaceC74805TXl = this.LJLILLLLZI;
        if (interfaceC74805TXl != null) {
            interfaceC74805TXl.LJIIIIZZ(this);
            InterfaceC74805TXl interfaceC74805TXl2 = this.LJLILLLLZI;
            if (interfaceC74805TXl2 != null) {
                interfaceC74805TXl2.dispose();
                synchronized (this.LJLJJL) {
                    this.LJLJJL.clear();
                }
                synchronized (this.LJLJJLL) {
                    this.LJLJJLL.clear();
                }
                return;
            }
            o.LJIJI("linkMicManager");
            throw null;
        }
        o.LJIJI("linkMicManager");
        throw null;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2
    public final InterfaceC75441TjB R6() {
        return this.LJLJI;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2
    public final void Aq(InterfaceC76112Tu0 listener) {
        U8H LJJZZI;
        o.LJIIIZ(listener, "listener");
        synchronized (this.LJLJJLL) {
            if (!this.LJLJJLL.contains(listener)) {
                this.LJLJJLL.add(listener);
            }
        }
        InterfaceC75441TjB interfaceC75441TjB = this.LJLJI;
        if (interfaceC75441TjB != null && (LJJZZI = interfaceC75441TjB.LJJZZI()) != null) {
            LJJZZI.m1(listener);
        }
    }

    public final void LIZ(InterfaceC75441TjB interfaceC75441TjB) {
        String str;
        boolean z;
        String str2;
        U8H LJJZZI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("initLinkMicSession, channelId = ");
        if (interfaceC75441TjB != null) {
            str = interfaceC75441TjB.LLLLLLIL();
        } else {
            str = null;
        }
        JBR.LJIIJ(LIZ, str, LIZ, "MultiGuestV3InternalServiceImplV2");
        synchronized (this.LJLJJL) {
            Iterator<U62> it = this.LJLJJL.iterator();
            while (it.hasNext()) {
                U62 next = it.next();
                if (interfaceC75441TjB != null) {
                    interfaceC75441TjB.LJJJIL(next);
                }
            }
        }
        synchronized (this.LJLJJLL) {
            Iterator<InterfaceC76112Tu0> it2 = this.LJLJJLL.iterator();
            while (it2.hasNext()) {
                InterfaceC76112Tu0 next2 = it2.next();
                if (interfaceC75441TjB != null && (LJJZZI = interfaceC75441TjB.LJJZZI()) != null) {
                    LJJZZI.m1(next2);
                }
            }
        }
        Room room = this.LJLIL;
        if (room != null) {
            if (room.getOwnerUserId() == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
                z = true;
            } else {
                z = false;
            }
            MixInfo.Builder builder = new MixInfo.Builder();
            Room room2 = this.LJLIL;
            if (room2 != null) {
                StreamUrl streamUrl = room2.getStreamUrl();
                if (streamUrl != null) {
                    str2 = streamUrl.LIZ();
                } else {
                    str2 = null;
                }
                builder.setStreamUrl(str2);
                builder.setStreamMixer(null);
                C75745To5 c75745To5 = new C75745To5(z, builder.build(), new TWV(), false, false, "#2F173A", new N3Y(this), true, null, null, 1816);
                if (interfaceC75441TjB != null) {
                    interfaceC75441TjB.LLLLLIL(new N39(0L, TWW.LJLIL, TWX.LJLIL, this.LJLJJI));
                    InterfaceC74695TTf LLIIJLIL = interfaceC75441TjB.LLIIJLIL();
                    if (LLIIJLIL != null) {
                        LLIIJLIL.LIZ(c75745To5);
                        return;
                    }
                    return;
                }
                return;
            }
            o.LJIJI("room");
            throw null;
        }
        o.LJIJI("room");
        throw null;
    }

    @Override // X.InterfaceC76620U5g
    public final void LLJILJIL(InterfaceC75441TjB session) {
        o.LJIIIZ(session, "session");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onSessionCreate, ");
        LIZ.append(session.LLLLLLIL());
        C0NB.LJIIIZ("MultiGuestV3InternalServiceImplV2", X1D.LIZIZ(LIZ));
        if (!o.LJ(this.LJLJI, session) && session.scene() == 4) {
            this.LJLJI = session;
            LIZ(session);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2
    public final void X3(U62 listener) {
        o.LJIIIZ(listener, "listener");
        synchronized (this.LJLJJL) {
            this.LJLJJL.remove(listener);
        }
        InterfaceC75441TjB interfaceC75441TjB = this.LJLJI;
        if (interfaceC75441TjB != null) {
            interfaceC75441TjB.LLIILII(listener);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2
    public final void e3(U62 listener) {
        o.LJIIIZ(listener, "listener");
        synchronized (this.LJLJJL) {
            if (!this.LJLJJL.contains(listener)) {
                this.LJLJJL.add(listener);
            }
        }
        InterfaceC75441TjB interfaceC75441TjB = this.LJLJI;
        if (interfaceC75441TjB != null) {
            interfaceC75441TjB.LJJJIL(listener);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2
    public final void zF(InterfaceC76112Tu0 listener) {
        U8H LJJZZI;
        o.LJIIIZ(listener, "listener");
        synchronized (this.LJLJJLL) {
            this.LJLJJLL.remove(listener);
        }
        InterfaceC75441TjB interfaceC75441TjB = this.LJLJI;
        if (interfaceC75441TjB != null && (LJJZZI = interfaceC75441TjB.LJJZZI()) != null) {
            LJJZZI.p1(listener);
        }
    }

    public final void LIZLLL(InterfaceC75441TjB interfaceC75441TjB, String str) {
        String str2;
        U8H LJJZZI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("releaseLinkMicSession, channelId = ");
        if (interfaceC75441TjB != null) {
            str2 = interfaceC75441TjB.LLLLLLIL();
        } else {
            str2 = null;
        }
        LIZ.append(str2);
        LIZ.append(", source=");
        LIZ.append(str);
        C0NB.LJIIIZ("MultiGuestV3InternalServiceImplV2", X1D.LIZIZ(LIZ));
        synchronized (this.LJLJJL) {
            Iterator<U62> it = this.LJLJJL.iterator();
            while (it.hasNext()) {
                U62 next = it.next();
                if (interfaceC75441TjB != null) {
                    interfaceC75441TjB.LLIILII(next);
                }
            }
        }
        synchronized (this.LJLJJLL) {
            Iterator<InterfaceC76112Tu0> it2 = this.LJLJJLL.iterator();
            while (it2.hasNext()) {
                InterfaceC76112Tu0 next2 = it2.next();
                if (interfaceC75441TjB != null && (LJJZZI = interfaceC75441TjB.LJJZZI()) != null) {
                    LJJZZI.p1(next2);
                }
            }
        }
        if (interfaceC75441TjB != null) {
            interfaceC75441TjB.LJJLI(str);
        }
    }

    @Override // X.InterfaceC76620U5g
    public final void LJJLIIIIJ(InterfaceC75441TjB interfaceC75441TjB, Long l) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onSessionDestroy, ");
        LIZ.append(interfaceC75441TjB.LLLLLLIL());
        C0NB.LJIIIZ("MultiGuestV3InternalServiceImplV2", X1D.LIZIZ(LIZ));
        LIZLLL(interfaceC75441TjB, "dispose_on_session_destroy");
        if (o.LJ(this.LJLJI, interfaceC75441TjB)) {
            this.LJLJI = null;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2
    public final void tr0(Context context, Room room, DataChannel dataChannel, String str) {
        o.LJIIIZ(room, "room");
        o.LJIIIZ(context, "context");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("init, roomId = ");
        LIZ.append(room.getId());
        LIZ.append(", channelId = ");
        LIZ.append(str);
        C0NB.LJIIIZ("MultiGuestV3InternalServiceImplV2", X1D.LIZIZ(LIZ));
        this.LJLIL = room;
        this.LJLJJI = dataChannel;
        C76615U5b builder = ((ILinkMicService) CN1.LIZ(ILinkMicService.class)).builder();
        if (builder == null) {
            return;
        }
        builder.LIZ = room;
        C76614U5a LIZ2 = builder.LIZ(context);
        this.LJLILLLLZI = LIZ2;
        InterfaceC75441TjB LIZJ = LIZ2.LIZJ(4, str);
        this.LJLJI = LIZJ;
        LIZ(LIZJ);
        InterfaceC74805TXl interfaceC74805TXl = this.LJLILLLLZI;
        if (interfaceC74805TXl != null) {
            interfaceC74805TXl.LJIIIZ(this);
        } else {
            o.LJIJI("linkMicManager");
            throw null;
        }
    }
}
