package com.bytedance.android.live.liveinteract;

import X.AbstractC32579CqV;
import X.B3G;
import X.B5Y;
import X.BAP;
import X.C73893SzJ;
import X.CN1;
import X.InterfaceC28235B6h;
import X.InterfaceC30069Br7;
import X.InterfaceC32187CkB;
import X.InterfaceC58334Muw;
import X.InterfaceC65784Pro;
import X.InterfaceC75238Tfu;
import X.InterfaceC75512TkK;
import X.TX0;
import Y.ARunnableS41S0100000_5;
import android.content.Context;
import android.graphics.Rect;
import android.view.SurfaceView;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostTopic;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import tikcast.linkmic.controller.LinkedUserInfo;

/* loaded from: classes6.dex */
public final class InteractServiceDel implements IInteractService {
    public static final InteractServiceDel LJLILLLLZI = new InteractServiceDel();
    public final /* synthetic */ IInteractService LJLIL = (IInteractService) CN1.LIZ(IInteractService.class);

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean Ao() {
        return this.LJLIL.Ao();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final String BF(boolean z, Room room) {
        return this.LJLIL.BF(z, room);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void BL(LifecycleOwner lifecycleOwner, DataChannel dataChannel) {
        this.LJLIL.BL(lifecycleOwner, dataChannel);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final SurfaceView Bo() {
        return this.LJLIL.Bo();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final Set<Long> DD() {
        return this.LJLIL.DD();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final LiveWidget EF() {
        return this.LJLIL.EF();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final int Ef() {
        return this.LJLIL.Ef();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final int Em() {
        return this.LJLIL.Em();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final String FZ() {
        return this.LJLIL.FZ();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void Fe(InterfaceC75512TkK interfaceC75512TkK) {
        this.LJLIL.Fe(interfaceC75512TkK);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final int Fy() {
        return this.LJLIL.Fy();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean GQ() {
        return this.LJLIL.GQ();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final int GR() {
        return this.LJLIL.GR();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean Hu0() {
        return this.LJLIL.Hu0();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean I80() {
        return this.LJLIL.I80();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void Jj() {
        this.LJLIL.Jj();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void Js0(InterfaceC75512TkK interfaceC75512TkK) {
        this.LJLIL.Js0(interfaceC75512TkK);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final String K9() {
        return this.LJLIL.K9();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final String KU(long j) {
        return this.LJLIL.KU(j);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final Map<String, String> L00() {
        return this.LJLIL.L00();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final long LJJLI() {
        return this.LJLIL.LJJLI();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean LLLLZLLIL() {
        return this.LJLIL.LLLLZLLIL();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final Set<Long> M10() {
        return this.LJLIL.M10();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final int MS(String str) {
        return this.LJLIL.MS(str);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final InterfaceC75238Tfu Mb(ViewGroup viewGroup, DataChannel dataChannel) {
        return this.LJLIL.Mb(viewGroup, dataChannel);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final String Ng(User user) {
        o.LJIIIZ(user, "user");
        return this.LJLIL.Ng(user);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final List<TeamUsersInfo> Nh0() {
        return this.LJLIL.Nh0();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean OB() {
        return this.LJLIL.OB();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final CohostTopic P20() {
        return this.LJLIL.P20();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void PO(TX0 tx0) {
        this.LJLIL.PO(tx0);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void PW(Boolean isAnchor, String str, JSONObject jSONObject) {
        o.LJIIIZ(isAnchor, "isAnchor");
        this.LJLIL.PW(isAnchor, str, jSONObject);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void Pb(Context context) {
        this.LJLIL.Pb(context);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final Class<? extends LiveRecyclableWidget> Pm() {
        return this.LJLIL.Pm();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final Rect Q00() {
        return this.LJLIL.Q00();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean QA() {
        return this.LJLIL.QA();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final List<Long> QD() {
        return this.LJLIL.QD();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean Qe0() {
        return this.LJLIL.Qe0();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean Qh(boolean z) {
        return this.LJLIL.Qh(z);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final Set<Long> Rt0() {
        return this.LJLIL.Rt0();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final long S6() {
        return this.LJLIL.S6();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void Ty(String str, WeakReference<InterfaceC58334Muw> weakReference) {
        this.LJLIL.Ty(str, weakReference);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean UX() {
        return this.LJLIL.UX();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void Uf(long j) {
        this.LJLIL.Uf(j);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean VY() {
        return this.LJLIL.VY();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean Vc() {
        return this.LJLIL.Vc();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final User Vp(Long l) {
        return this.LJLIL.Vp(l);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void WA(Map<String, String> map) {
        this.LJLIL.WA(map);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void Wb0() {
        this.LJLIL.Wb0();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final int Wd(User user) {
        return this.LJLIL.Wd(user);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void Wj() {
        this.LJLIL.Wj();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void Wx(DataChannel dataChannel) {
        this.LJLIL.Wx(dataChannel);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean Wy() {
        return this.LJLIL.Wy();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final long X90() {
        return this.LJLIL.X90();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean Xu0() {
        return this.LJLIL.Xu0();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean Y40() {
        return this.LJLIL.Y40();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void Yl0(BAP bap) {
        this.LJLIL.Yl0(bap);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final User Yt() {
        return this.LJLIL.Yt();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final int Yu0() {
        return this.LJLIL.Yu0();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean ZQ() {
        return this.LJLIL.ZQ();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean ZR() {
        return this.LJLIL.ZR();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean Zf() {
        return this.LJLIL.Zf();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean Zs0() {
        return this.LJLIL.Zs0();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void ad0(TX0 tx0) {
        this.LJLIL.ad0(tx0);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final String co0() {
        return this.LJLIL.co0();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean cx() {
        return this.LJLIL.cx();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean dX() {
        return this.LJLIL.dX();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void e1() {
        this.LJLIL.e1();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final AbstractC32579CqV e60(int i, Context context, DataChannel dataChannel, C73893SzJ c73893SzJ, ARunnableS41S0100000_5 aRunnableS41S0100000_5, boolean z) {
        return this.LJLIL.e60(i, context, dataChannel, c73893SzJ, aRunnableS41S0100000_5, z);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void eS() {
        this.LJLIL.eS();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final long eq() {
        return this.LJLIL.eq();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void fR(Room room) {
        this.LJLIL.fR(room);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final /* synthetic */ InterfaceC32187CkB fh() {
        return null;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final String gB() {
        return this.LJLIL.gB();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final Object gI() {
        return this.LJLIL.gI();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final String getConnectionType() {
        return this.LJLIL.getConnectionType();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final String getDebugInfo() {
        return this.LJLIL.getDebugInfo();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean gr0() {
        return this.LJLIL.gr0();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean gt(String str) {
        return this.LJLIL.gt(str);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final String h00() {
        return this.LJLIL.h00();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean h80() {
        return this.LJLIL.h80();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final long hV() {
        return this.LJLIL.hV();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean hw(User user) {
        return this.LJLIL.hw(user);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final Set<Long> iP() {
        return this.LJLIL.iP();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final /* synthetic */ void initPublicScreenConfiguration() {
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean isNeedPublishFrame() {
        return this.LJLIL.isNeedPublishFrame();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean kg(DataChannel dataChannel, boolean z) {
        return this.LJLIL.kg(dataChannel, z);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final InterfaceC30069Br7 lS() {
        return this.LJLIL.lS();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final long lt0() {
        return this.LJLIL.lt0();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean mT() {
        return this.LJLIL.mT();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean mr0() {
        return this.LJLIL.mr0();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final InterfaceC28235B6h n60(LiveMode liveMode) {
        return this.LJLIL.n60(liveMode);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean n8() {
        return this.LJLIL.n8();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final /* synthetic */ B3G nE(ViewGroup viewGroup, DataChannel dataChannel, LifecycleOwner lifecycleOwner) {
        return null;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void ns0(List<LinkedUserInfo> list) {
        this.LJLIL.ns0(list);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void od0(DataChannel dataChannel) {
        this.LJLIL.od0(dataChannel);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean on() {
        return this.LJLIL.on();
    }

    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean p00(User user) {
        return this.LJLIL.p00(user);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final Rect po0(long j) {
        return this.LJLIL.po0(j);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean q3() {
        return this.LJLIL.q3();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void rd(String str, Map<String, String> data) {
        o.LJIIIZ(data, "data");
        this.LJLIL.rd(str, data);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void sL() {
        this.LJLIL.sL();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean ta0() {
        return this.LJLIL.ta0();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void uX(String str) {
        this.LJLIL.uX(str);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void vs(Room room, InterfaceC65784Pro<Boolean> interfaceC65784Pro) {
        this.LJLIL.vs(room, interfaceC65784Pro);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void wN(Context context, boolean z) {
        this.LJLIL.wN(context, z);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final long xX() {
        return this.LJLIL.xX();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void xt() {
        this.LJLIL.xt();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final B5Y xz(long j) {
        return this.LJLIL.xz(j);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final boolean yA() {
        return this.LJLIL.yA();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void yW(Room room) {
        this.LJLIL.yW(room);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void yo0() {
        this.LJLIL.yo0();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final void yp0() {
        this.LJLIL.yp0();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public final int yr() {
        return this.LJLIL.yr();
    }
}
