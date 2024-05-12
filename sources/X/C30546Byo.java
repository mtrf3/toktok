package X;

import android.app.Activity;
import android.os.Build;
import com.bytedance.android.live.LiveModeChannel;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import defpackage.g0;
import kotlin.jvm.internal.o;

/* renamed from: X.Byo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30546Byo implements InterfaceC28918BWo {
    @Override // X.InterfaceC28918BWo
    public final boolean LIZ() {
        return true;
    }

    @Override // X.InterfaceC28918BWo
    public final int getErrorCode() {
        return 202;
    }

    @Override // X.InterfaceC28918BWo
    public final Object LIZIZ(BIK bik, AbstractC65782Prm abstractC65782Prm) {
        String str;
        LiveMode liveMode;
        XKS xks = new XKS(1, C78555UsJ.LJJII(abstractC65782Prm));
        xks.LJIIL();
        Activity LJIILJJIL = g0.LJIILJJIL(bik.LIZ);
        if (Build.VERSION.SDK_INT >= 31 && LJIILJJIL != null && !C76944UHs.LIZIZ(LJIILJJIL, "android.permission.BLUETOOTH_CONNECT")) {
            C48459J0d<Integer> c48459J0d = InterfaceC30442Bx8.L;
            Integer LIZJ = c48459J0d.LIZJ();
            o.LJIIIIZZ(LIZJ, "BLUETOOTH_PERMISSION_HIN…IMES_IN_INTERCEPTOR.value");
            if (LIZJ.intValue() < 2) {
                boolean LIZJ2 = C76944UHs.LIZJ(LJIILJJIL, "android.permission.BLUETOOTH_CONNECT");
                Boolean LIZJ3 = InterfaceC30442Bx8.K.LIZJ();
                o.LJIIIIZZ(LIZJ3, "FIRST_TIME_APPLY_BLUETOO…SION_IN_INTERCEPTOR.value");
                if (LIZJ3.booleanValue() || LIZJ2) {
                    c48459J0d.LIZ(new Integer(c48459J0d.LIZJ().intValue() + 1));
                    C77276UUm c77276UUm = new C77276UUm(LJIILJJIL, TokenCert.Companion.with("bpea-bluetooth_connect_when_broadcast_intercept"));
                    c77276UUm.LIZLLL = new C30548Byq(xks);
                    c77276UUm.LIZJ = new C30549Byr(this, bik);
                    c77276UUm.LIZ(new C30547Byp(xks), "android.permission.BLUETOOTH_CONNECT");
                    DataChannel dataChannel = bik.LIZIZ;
                    BZI LIZ = C28787BRn.LIZ("livesdk_live_nearby_devices_popup_show");
                    LIZ.LJIILLIIL(dataChannel);
                    if (dataChannel != null && (liveMode = (LiveMode) dataChannel.kv0(LiveModeChannel.class)) != null) {
                        str = C28509BGv.LIZ(liveMode);
                    } else {
                        str = null;
                    }
                    LIZ.LJIJJ(str, "live_type");
                    LIZ.LJJIIJZLJL();
                    return xks.LJIIJJI();
                }
            }
        }
        if (xks._state instanceof InterfaceC30550Bys) {
            Boolean bool = Boolean.FALSE;
            C3C5.m7constructorimpl(bool);
            xks.resumeWith(bool);
        }
        return xks.LJIIJJI();
    }

    public final void LIZJ(DataChannel dataChannel, String str) {
        String str2;
        LiveMode liveMode;
        BZI LIZ = C28787BRn.LIZ("livesdk_live_nearby_devices_popup_click");
        LIZ.LJIILLIIL(dataChannel);
        if (dataChannel != null && (liveMode = (LiveMode) dataChannel.kv0(LiveModeChannel.class)) != null) {
            str2 = C28509BGv.LIZ(liveMode);
        } else {
            str2 = null;
        }
        C06490Nh.LIZLLL(LIZ, str2, "live_type", str, "btn_type");
    }
}
