package X;

import com.bytedance.android.live.liveinteract.api.LinkReceiveEnlargeMessageEvent;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicLayoutTrackerEnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestV3LayoutQueryOptSetting;
import com.bytedance.android.livesdk.model.message.LinkerEnlargeStatusSynContent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;
import webcast.data.multilive_biz.BizChangeLayoutParams;

/* renamed from: X.Tbx, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74993Tbx extends C74995Tbz {
    public C74993Tbx(DataChannel dataChannel) {
        super(dataChannel);
    }

    @Override // X.C74995Tbz
    public final void LJIIJ(LinkerEnlargeStatusSynContent linkerEnlargeStatusSynContent) {
        String str;
        U8H u8h;
        Layout x1;
        int i;
        int LJJIFFI;
        InterfaceC76652U6m LJZL;
        if (C74998Tc2.LIZIZ() != EnumC75006TcA.ANCHOR) {
            return;
        }
        super.LJIIJ(linkerEnlargeStatusSynContent);
        String zoomLinkMicId = linkerEnlargeStatusSynContent.enlargeLinkmicId;
        int i2 = linkerEnlargeStatusSynContent.scene;
        int i3 = 1;
        String str2 = null;
        if (i2 != 1 && i2 != 2) {
            if (i2 == 3 || i2 == 4 || i2 == 5) {
                Layout LJ = LJ();
                if (LJ != null) {
                    str = LJ.getLayoutId();
                } else {
                    str = null;
                }
                C74995Tbz.LJIILLIIL(this, i2);
                InterfaceC75579TlP LJJIIJZLJL = C77412UZs.LJJIIJZLJL();
                if (LJJIIJZLJL != null) {
                    ((U8H) LJJIIJZLJL).A1(str, true);
                }
                InterfaceC75441TjB R6 = C8E.LJ().R6();
                if (R6 != null) {
                    u8h = R6.LJJZZI();
                } else {
                    u8h = null;
                }
                if (u8h != null && (x1 = u8h.x1()) != null && x1.isFloatType()) {
                    InterfaceC75441TjB R62 = C8E.LJ().R6();
                    if (R62 != null && (LJZL = R62.LJZL()) != null) {
                        i = LJZL.LJIIIIZZ();
                    } else {
                        i = 0;
                    }
                    InterfaceC75441TjB R63 = C8E.LJ().R6();
                    if (R63 != null) {
                        if (MultiGuestV3LayoutQueryOptSetting.INSTANCE.isEnable()) {
                            Layout x12 = u8h.x1();
                            if (x12 != null) {
                                LJJIFFI = x12.getMicCount();
                            } else {
                                LJJIFFI = 0;
                            }
                        } else {
                            String layoutBusinessType = u8h.LJJIII().getLayoutBusinessType();
                            if (layoutBusinessType == null) {
                                layoutBusinessType = EnumC74991Tbv.NORMAL.getBusinessType();
                            }
                            LJJIFFI = u8h.LJJIFFI(layoutBusinessType);
                        }
                        if (str == null) {
                            str = "";
                        }
                        BizChangeLayoutParams bizChangeLayoutParams = new BizChangeLayoutParams();
                        if (i > 1) {
                            i3 = 3;
                        }
                        bizChangeLayoutParams.displayId = i3;
                        R63.LJJIIJZLJL(new C76606U4s(LJJIFFI, str, bizChangeLayoutParams), null);
                    }
                }
                if (LinkmicLayoutTrackerEnableSetting.INSTANCE.enable()) {
                    C74979Tbj.LIZ.LJI(false);
                }
            }
        } else {
            Layout LJ2 = LJ();
            if (LJ2 != null) {
                str2 = LJ2.getLayoutId();
            }
            o.LJIIIIZZ(zoomLinkMicId, "zoomLinkMicId");
            C74995Tbz.LJIILJJIL(this, zoomLinkMicId, LJ(), C74995Tbz.LJIIIZ(this, zoomLinkMicId), i2);
            InterfaceC75579TlP LJJIIJZLJL2 = C77412UZs.LJJIIJZLJL();
            if (LJJIIJZLJL2 != null) {
                ((U8H) LJJIIJZLJL2).A1(str2, true);
            }
            if (LinkmicLayoutTrackerEnableSetting.INSTANCE.enable()) {
                C74979Tbj.LIZ.LJI(true);
            }
        }
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null) {
            dataChannel.qv0(LinkReceiveEnlargeMessageEvent.class, linkerEnlargeStatusSynContent);
        }
    }
}
