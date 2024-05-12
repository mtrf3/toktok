package com.ss.android.ugc.aweme.feed.assem.music.mute;

import X.AV1;
import X.C16880lQ;
import X.C188727au;
import X.C1DH;
import X.C250929t2;
import X.C2U8;
import X.C36922EeM;
import X.C58096Mr6;
import X.C86550Xxy;
import X.EF7;
import X.FMX;
import X.IFM;
import X.IWF;
import X.J1G;
import X.J1J;
import X.J1M;
import X.J1N;
import X.J1O;
import X.J1P;
import X.JYH;
import X.MS5;
import X.X1D;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.view.KeyEvent;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.utils.IVolumeKeyUnmuteRunnerSpi;
import com.ss.android.ugc.aweme.launcher.service.sound.IOpenOnMuteSpi;
import com.ss.android.ugc.aweme.port.in.IToolsVolumeKeydownRunnerSpi;
import com.ss.android.ugc.governance.eventbus.IEvent;
import com.ss.ttvideoengine.TTVideoEngine;
import kotlin.jvm.internal.AqS104S0101000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class OpenOnMuteImpl implements IOpenOnMuteSpi, IVolumeKeyUnmuteRunnerSpi, IToolsVolumeKeydownRunnerSpi {
    public static IOpenOnMuteSpi LJIILL() {
        Object LIZ = C58096Mr6.LIZ(IOpenOnMuteSpi.class, false);
        if (LIZ != null) {
            return (IOpenOnMuteSpi) LIZ;
        }
        if (C58096Mr6.B0 == null) {
            synchronized (IOpenOnMuteSpi.class) {
                if (C58096Mr6.B0 == null) {
                    C58096Mr6.B0 = new OpenOnMuteImpl();
                }
            }
        }
        return C58096Mr6.B0;
    }

    public static void LJIILLIIL() {
        boolean LJIIJ = JYH.LIZIZ.LJIIJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateVideoEngineMuteState: ");
        LIZ.append(LJIIJ ? 1 : 0);
        C36922EeM.LIZLLL(2, "OpenOnMute", X1D.LIZIZ(LIZ));
        TTVideoEngine.LJLLLLLL(961, LJIIJ ? 1 : 0);
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.sound.IOpenOnMuteSpi
    public final void LJIIIZ() {
        Object LLILL = C16880lQ.LLILL(EF7.LIZIZ(), "audio");
        o.LJII(LLILL, "null cannot be cast to non-null type android.media.AudioManager");
        C16880lQ.LJJLIIIJILLIZJL(new J1J((AudioManager) LLILL), EF7.LIZIZ(), new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
        TTVideoEngine.LJLLLLLL(960, 1);
        J1N.LIZJ = LJIIJJI();
        J1N.LJ = Boolean.TRUE;
        if (C250929t2.LIZIZ) {
            C86550Xxy c86550Xxy = C86550Xxy.LIZIZ;
            c86550Xxy.LIZ.LJIIJJI(new J1G());
            C1DH.LJJIJIIJIL(J1N.LIZIZ, new Runnable() { // from class: X.9uc
                @Override // java.lang.Runnable
                public final void run() {
                    boolean LIZ;
                    try {
                        J1N.LJIIIZ = false;
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
        LJIILLIIL();
        if (JYH.LIZIZ.LJIIJ()) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("is_launch_on_mute", null);
            FMX.LJIIL("launch_on_mute", c188727au.LIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.sound.IOpenOnMuteSpi
    public final boolean LJIIJ() {
        if (IFM.LIZ && J1N.LIZJ) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.sound.IOpenOnMuteSpi
    public final void LJ() {
        new J1P(IWF.LJJLIIIIJ()).start();
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.sound.IOpenOnMuteSpi
    public final boolean LJIIJJI() {
        return J1N.LIZ().getBoolean("setting_state", false);
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.sound.IOpenOnMuteSpi
    public final void LJIIL() {
        J1N.LIZ().storeInt("capsule_count", J1N.LIZ().getInt("capsule_count", 0) + 1);
        J1N.LJ = Boolean.FALSE;
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.sound.IOpenOnMuteSpi
    public final boolean LJIILIIL() {
        Boolean bool;
        if (J1N.LIZ().getInt("capsule_count", 0) >= 3 || (bool = J1N.LJ) == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.sound.IOpenOnMuteSpi
    public final void LJIILJJIL() {
        boolean z;
        Keva LIZ = J1N.LIZ();
        if (!AV1.LJIILLIIL() && LJIIJJI()) {
            z = true;
        } else {
            z = false;
        }
        LIZ.storeBoolean("setting_state", z);
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.sound.IOpenOnMuteSpi
    public final boolean LJFF() {
        return J1N.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.sound.IOpenOnMuteSpi
    public final void LIZ(J1O j1o) {
        String str;
        if (J1N.LIZLLL) {
            J1N.LIZLLL = false;
            if (j1o != null) {
                J1N.LJIIIIZZ = j1o;
            }
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", J1N.LJI);
            J1M j1m = J1N.LJII;
            Integer num = null;
            if (j1m != null) {
                str = j1m.getValue();
            } else {
                str = null;
            }
            c188727au.LJIIIZ("unmute_method", str);
            J1O j1o2 = J1N.LJIIIIZZ;
            if (j1o2 != null) {
                num = Integer.valueOf(j1o2.getValue());
            }
            c188727au.LJFF(num, "button_unfold");
            FMX.LJIIL("video_unmute", c188727au.LIZ);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006f, code lost:
    
        if (r1.equals("homepage_hot") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0076, code lost:
    
        if (r1.equals("others_homepage") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007d, code lost:
    
        if (r1.equals("personal_homepage") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0086, code lost:
    
        if (r1.equals("homepage_friends") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008f, code lost:
    
        if (r1.equals("homepage_follow") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0098, code lost:
    
        if (r1.equals("notification_page") != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d4, code lost:
    
        if (r1.equals("a2270.b5171.c0.d0") == false) goto L22;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:34:0x005e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:65:0x00c9. Please report as an issue. */
    @Override // com.ss.android.ugc.aweme.launcher.service.sound.IOpenOnMuteSpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZIZ(java.lang.Object r6) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.music.mute.OpenOnMuteImpl.LIZIZ(java.lang.Object):java.lang.String");
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.sound.IOpenOnMuteSpi
    public final void LJII(boolean z) {
        if (z) {
            J1N.LJFF++;
        } else {
            J1N.LJFF--;
        }
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.sound.IOpenOnMuteSpi
    public final void LJIIIIZZ(boolean z) {
        J1N.LIZ().storeBoolean("setting_state", z);
        J1N.LIZ().storeBoolean("setting_never_enable", false);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("enterFrom: settings_page / settings_name：open_tiktok_on_mute / status_before_change: ");
        int i = !z ? 1 : 0;
        LIZ.append(i);
        LIZ.append(" / status_after_change: ");
        LIZ.append(z ? 1 : 0);
        X1D.LIZIZ(LIZ);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "settings_page");
        c188727au.LJIIIZ("settings_name", "open_tiktok_on_mute");
        c188727au.LIZLLL(i, "status_before_change");
        c188727au.LIZLLL(z ? 1 : 0, "status_after_change");
        FMX.LJIIL("profile_settings_change", c188727au.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.port.in.IToolsVolumeKeydownRunnerSpi
    public final void LIZJ(int i, KeyEvent event) {
        o.LJIIIZ(event, "event");
        LJIIZILJ(i, J1O.STYLE_NO_BUTTON);
    }

    public final void LJIIZILJ(int i, J1O j1o) {
        J1M j1m;
        JYH jyh = JYH.LIZIZ;
        if (jyh.LJIIJ()) {
            if (i == 24 || i == 25) {
                String LIZIZ = LIZIZ(null);
                if (i == 24) {
                    j1m = J1M.TURN_UP_VOLUME;
                } else {
                    j1m = J1M.TURN_DOWN_VOLUME;
                }
                jyh.LIZLLL(LIZIZ, j1m, j1o);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.sound.IOpenOnMuteSpi
    public final void LIZLLL(String str, J1M j1m, J1O j1o) {
        J1N.LJI = str;
        J1N.LJII = j1m;
        J1N.LJIIIIZZ = j1o;
        J1N.LIZJ = false;
        LJIILLIIL();
        if (J1N.LJFF <= 0) {
            LIZ(null);
        }
        C2U8.LIZ(new IEvent() { // from class: X.7qL
            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent post() {
                C2U8.LIZ(this);
                return this;
            }

            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent postSticky() {
                C2U8.LIZIZ(this);
                return this;
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.feed.utils.IVolumeKeyUnmuteRunnerSpi
    public final void LJI(int i, KeyEvent keyEvent, Object obj) {
        LIZIZ(obj);
        LJIIZILJ(i, J1O.STYLE_NO_BUTTON);
        if (IFM.LIZ && C250929t2.LIZIZ) {
            MS5.LIZ(new AqS104S0101000_4(this, i, 0));
        }
    }
}
