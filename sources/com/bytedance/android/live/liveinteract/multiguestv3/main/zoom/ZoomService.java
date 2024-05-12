package com.bytedance.android.live.liveinteract.multiguestv3.main.zoom;

import X.AbstractC75001Tc5;
import X.C162476Zf;
import X.C1EW;
import X.C29044Baa;
import X.C29306Beo;
import X.C65814PsI;
import X.C73318Sq2;
import X.C74645TRh;
import X.C74992Tbw;
import X.C74993Tbx;
import X.C74994Tby;
import X.C74995Tbz;
import X.C74996Tc0;
import X.C74997Tc1;
import X.C74998Tc2;
import X.C75002Tc6;
import X.C75005Tc9;
import X.C78886Uxe;
import X.C8E;
import X.EnumC74929Tav;
import X.EnumC74949TbF;
import X.InterfaceC74935Tb1;
import X.InterfaceC75014TcI;
import X.InterfaceC75560Tl6;
import X.InterfaceC92693kP;
import X.WM7;
import Y.AfS65S0100000_13;
import android.text.TextUtils;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiLiveApi;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;
import kotlin.jvm.internal.o;

@InterfaceC75560Tl6(name = "ZOOM_SERVICE")
/* loaded from: classes14.dex */
public final class ZoomService implements InterfaceC74935Tb1 {
    public final C74996Tc0 LIZ;
    public final C74997Tc1 LIZIZ;
    public final C75002Tc6 LIZJ;

    public ZoomService() {
        this(null);
    }

    @Override // X.InterfaceC74935Tb1
    public final EnumC74949TbF LIZ() {
        return LJIIJJI().LIZ();
    }

    @Override // X.InterfaceC74935Tb1
    public final boolean LIZJ() {
        return LJIIJJI().LIZJ();
    }

    @Override // X.InterfaceC74935Tb1
    public final String LJFF() {
        return LJIIJJI().LIZ.LIZJ;
    }

    public final boolean LJI() {
        AbstractC75001Tc5 LJIIJJI = LJIIJJI();
        if (!TextUtils.isEmpty(LJIIJJI.LIZ.LIZJ)) {
            C74995Tbz c74995Tbz = LJIIJJI.LIZ;
            String str = c74995Tbz.LIZJ;
            if (str == null) {
                str = "";
            }
            if (c74995Tbz.LJI(str)) {
                return true;
            }
        }
        return false;
    }

    public final boolean LJII() {
        return LJIIJJI().LJI();
    }

    public final String LJIIIZ() {
        LJIIJJI().LIZ.getClass();
        return C74995Tbz.LJII();
    }

    public final void LJIIJ() {
        Long l;
        C74995Tbz c74995Tbz = LJIIJJI().LIZ;
        c74995Tbz.getClass();
        HashMap hashMap = new HashMap();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            l = Long.valueOf(room.getId());
        } else {
            l = null;
        }
        hashMap.put("room_id", String.valueOf(l));
        hashMap.put(WM7.SCENE_SERVICE, "6");
        hashMap.put("channel_id", C78886Uxe.LJJJLL(C8E.LJ()));
        C65814PsI.LIZ().getClass();
        InterfaceC92693kP LJJJLIIL = C1EW.LIZ(((MultiLiveApi) C65814PsI.LIZJ(MultiLiveApi.class)).zoom(hashMap)).LJJJLIIL(new AfS65S0100000_13(c74995Tbz, 173), C74645TRh.LJLIL);
        C73318Sq2 cb = (C73318Sq2) c74995Tbz.LJI.getValue();
        o.LJIIIZ(cb, "cb");
        cb.LIZ(LJJJLIIL);
    }

    public final AbstractC75001Tc5 LJIIJJI() {
        int i = C75005Tc9.LIZ[C74998Tc2.LIZIZ().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return this.LIZJ;
                }
                throw new C162476Zf();
            }
            return this.LIZIZ;
        }
        return this.LIZ;
    }

    @Override // X.InterfaceC74935Tb1
    public final void destroy() {
        LJIIJJI().destroy();
    }

    public ZoomService(DataChannel dataChannel) {
        this.LIZ = new C74996Tc0(new C74993Tbx(dataChannel));
        this.LIZIZ = new C74997Tc1(new C74992Tbw(dataChannel));
        this.LIZJ = new C75002Tc6(new C74994Tby(dataChannel));
    }

    @Override // X.InterfaceC74935Tb1
    public final void LIZIZ(SeiAppData seiAppData) {
        LJIIJJI().LIZIZ(seiAppData);
    }

    @Override // X.InterfaceC74935Tb1
    public final EnumC74949TbF LIZLLL(String str) {
        return LJIIJJI().LIZLLL(str);
    }

    public final boolean LJIIIIZZ(String str) {
        AbstractC75001Tc5 LJIIJJI = LJIIJJI();
        if (C29306Beo.LJIJJLI(LJIIJJI.LIZ.LIZJ) && o.LJ(LJIIJJI.LIZ.LIZJ, str)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC74935Tb1
    public final void LJ(String linkMicId, InterfaceC75014TcI interfaceC75014TcI, boolean z, boolean z2, EnumC74929Tav zoomSource) {
        o.LJIIIZ(linkMicId, "linkMicId");
        o.LJIIIZ(zoomSource, "zoomSource");
        LJIIJJI().LJ(linkMicId, interfaceC75014TcI, z, z2, zoomSource);
    }
}
