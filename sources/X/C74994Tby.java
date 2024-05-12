package X;

import com.bytedance.android.live.liveinteract.api.LinkReceiveEnlargeMessageEvent;
import com.bytedance.android.livesdk.comp.api.linkcore.api.ILinkMicService;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestUseLinkmicAloggerSetting;
import com.bytedance.android.livesdk.model.message.LinkerEnlargeStatusSynContent;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdk.sei.SeiDsl;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AqS35S1300000_13;
import kotlin.jvm.internal.o;
import org.json.JSONException;

/* renamed from: X.Tby, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74994Tby extends C74995Tbz {
    public static final /* synthetic */ int LJIIZILJ = 0;
    public String LJIILL;
    public String LJIILLIIL;

    @Override // X.C74995Tbz
    public final boolean LJFF() {
        if (C29306Beo.LJIJJLI(this.LJIILLIIL)) {
            return true;
        }
        return super.LJFF();
    }

    @Override // X.C74995Tbz
    public final void LIZJ() {
        super.LIZJ();
    }

    public C74994Tby(DataChannel dataChannel) {
        super(dataChannel);
    }

    @Override // X.C74995Tbz
    public final boolean LJI(String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
        String str = this.LJIILL;
        if (str != null) {
            return o.LJ(linkMicId, str);
        }
        return C74947TbD.LJIIZILJ(Long.valueOf(C74998Tc2.LIZJ(linkMicId)));
    }

    @Override // X.C74995Tbz
    public final void LJIIJ(LinkerEnlargeStatusSynContent linkerEnlargeStatusSynContent) {
        DataChannel dataChannel;
        super.LJIIJ(linkerEnlargeStatusSynContent);
        String str = linkerEnlargeStatusSynContent.enlargeLinkmicId;
        if (str == null) {
            str = "";
        }
        this.LJIILLIIL = str;
        int i = linkerEnlargeStatusSynContent.scene;
        if (i == 3 || i == 4) {
            C74995Tbz.LJIILLIIL(this, i);
        }
        if (C74998Tc2.LIZIZ() == EnumC75006TcA.AUDIENCE && (dataChannel = this.LIZ) != null) {
            dataChannel.qv0(LinkReceiveEnlargeMessageEvent.class, linkerEnlargeStatusSynContent);
        }
    }

    @Override // X.C74995Tbz
    public final int LJIIIIZZ(String linkMicId, InterfaceC75579TlP interfaceC75579TlP) {
        java.util.Map<String, OnLineMicInfo> LIZLLL;
        OnLineMicInfo onLineMicInfo;
        MicPositionInfo micPositionData;
        o.LJIIIZ(linkMicId, "linkMicId");
        if (interfaceC75579TlP != null && (LIZLLL = interfaceC75579TlP.LIZLLL()) != null && (onLineMicInfo = LIZLLL.get(linkMicId)) != null && (micPositionData = onLineMicInfo.getMicPositionData()) != null) {
            return micPositionData.getPosition();
        }
        C74995Tbz.LJII.getClass();
        return C74995Tbz.LJIIIZ;
    }

    public final void LJIIZILJ(SeiAppData seiAppData, InterfaceC75579TlP interfaceC75579TlP) {
        String str;
        String str2;
        String LIZ;
        InterfaceC75011TcF interfaceC75011TcF;
        String str3;
        int i;
        if (seiAppData != null) {
            str = seiAppData.zoomedLinkmicId;
            str2 = seiAppData.anchorLinkMicId;
        } else {
            str = null;
            str2 = null;
        }
        this.LJIILL = str2;
        if (str == null || str.length() == 0) {
            this.LJ = 0;
            if (interfaceC75579TlP != null) {
                interfaceC75579TlP.s1(null, C113554cx.LJJJLIIL());
            }
            this.LIZJ = null;
            this.LIZIZ = null;
            return;
        }
        try {
            if (!o.LJ(this.LIZJ, str)) {
                if (seiAppData == null) {
                    return;
                }
                if (interfaceC75579TlP != null) {
                    interfaceC75579TlP.LJIIJ(seiAppData);
                    interfaceC75579TlP.LJ(seiAppData);
                }
                AqS35S1300000_13 aqS35S1300000_13 = new AqS35S1300000_13(this, str, seiAppData, interfaceC75579TlP, 1);
                ILinkMicService iLinkMicService = (ILinkMicService) CN1.LIZ(ILinkMicService.class);
                if (iLinkMicService != null) {
                    interfaceC75011TcF = iLinkMicService.JR();
                } else {
                    interfaceC75011TcF = null;
                }
                SeiDsl seiDsl = seiAppData.dsl;
                if (seiDsl == null || (str3 = seiDsl.syncLayoutId) == null || interfaceC75011TcF == null) {
                    return;
                }
                if (seiDsl == null) {
                    i = -1;
                } else {
                    i = seiDsl.version;
                }
                interfaceC75011TcF.LJIIZILJ(i, str3, new C75003Tc7(seiAppData, aqS35S1300000_13, interfaceC75011TcF));
                return;
            }
            Layout LJ = LJ();
            LJIIIIZZ(str, interfaceC75579TlP);
            LJIILIIL(str, LJ, 0, interfaceC75579TlP);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
            if (MultiGuestUseLinkmicAloggerSetting.INSTANCE.isEnable()) {
                StackTraceElement LJ2 = C32014ChO.LJ();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ = C77800Ug8.LIZLLL(U44.BIZ, LIZ2, "_ZoomAudienceModel_", LJ2, LIZ2);
            } else {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ = C17M.LIZ(U44.BIZ, LIZ3, "_ZoomAudienceModel_", 130, LIZ3);
            }
            C32014ChO.LIZJ(LIZ, "parse zoom linkMicId from sei failed", null);
        }
    }
}
