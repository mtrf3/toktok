package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.By5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30501By5 implements InterfaceC12590eV {
    public static final C30501By5 LIZ = new C30501By5();
    public static Long LIZIZ;
    public static DataChannel LIZJ;
    public static boolean LIZLLL;

    @Override // X.InterfaceC12590eV
    public final boolean LIZ() {
        Integer LIZJ2 = InterfaceC30442Bx8.LLLLIIIILLL.LIZJ();
        int ordinal = EnumC30502By6.ON.ordinal();
        if (LIZJ2 == null || LIZJ2.intValue() != ordinal) {
            return false;
        }
        return true;
    }

    public final void LIZLLL() {
        if (C30545Byn.LIZIZ() && !C30545Byn.LIZJ() && LIZ()) {
            LIZJ(true, false);
        } else {
            LIZJ(false, false);
        }
    }

    @Override // X.InterfaceC12590eV
    public final boolean LIZIZ() {
        return LIZLLL;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        if (X.C30545Byn.LIZIZ() != false) goto L18;
     */
    @Override // X.InterfaceC12590eV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(boolean r8, boolean r9) {
        /*
            r7 = this;
            boolean r0 = X.C30501By5.LIZLLL
            if (r0 == r8) goto L13
            r2 = 0
            if (r8 == 0) goto L30
            boolean r0 = X.C30545Byn.LIZJ()
            if (r0 == 0) goto L2a
            r0 = 2131838962(0x7f1147f2, float:1.9311162E38)
            X.C30868C9o.LIZJ(r0)
        L13:
            if (r9 == 0) goto L26
            X.J0d<java.lang.Integer> r1 = X.InterfaceC30442Bx8.LLLLIIIILLL
            if (r8 == 0) goto L27
            X.By6 r0 = X.EnumC30502By6.ON
        L1b:
            int r0 = r0.ordinal()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.LIZ(r0)
        L26:
            return
        L27:
            X.By6 r0 = X.EnumC30502By6.OFF
            goto L1b
        L2a:
            boolean r0 = X.C30545Byn.LIZIZ()
            if (r0 == 0) goto L13
        L30:
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r1 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LJLJJI
            java.lang.Class<X.2Dv> r0 = X.C54992Dv.class
            java.lang.Object r0 = r1.mv0(r0)
            X.0s6 r0 = (X.InterfaceC21020s6) r0
            if (r0 == 0) goto L77
            com.ss.ttlivestreamer.livestreamv2.filter.IAudioFilterManager r3 = r0.getAudioFilterMgr()
            if (r3 == 0) goto L77
            X.C30501By5.LIZLLL = r8
            if (r8 == 0) goto L88
            X.C30355Bvj.LJIIJJI()
            boolean r2 = X.C32141Ny.LIZIZ()
            r0 = r2 ^ 1
            r3.setEchoMode(r0)
            com.ss.ttlivestreamer.core.effect.IAudioStrangeVoice r1 = r3.getAudioStrangeVoice()
            if (r1 == 0) goto L61
            com.bytedance.android.livesdk.livesetting.broadcast.LiveVoiceEffectUseVoipModeSetting r0 = com.bytedance.android.livesdk.livesetting.broadcast.LiveVoiceEffectUseVoipModeSetting.INSTANCE
            boolean r0 = r0.getValue()
            r1.enablePlayerMode(r2, r0)
        L61:
            X.C30355Bvj.LJIIJJI()
            kotlin.jvm.internal.AqS171S0100000_5 r1 = new kotlin.jvm.internal.AqS171S0100000_5
            r0 = 633(0x279, float:8.87E-43)
            r1.<init>(r3, r0)
            X.C32141Ny.LJIIIZ = r1
            long r0 = android.os.SystemClock.uptimeMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            X.C30501By5.LIZIZ = r0
        L77:
            java.lang.StringBuilder r2 = X.X1D.LIZ()
            java.lang.String r0 = "change echo state, echo state: "
            r2.append(r0)
            boolean r1 = X.C30501By5.LIZLLL
            java.lang.String r0 = "EchoHelper"
            X.FT5.LJ(r2, r1, r2, r0)
            goto L13
        L88:
            X.C30355Bvj.LJIIJJI()
            r0 = 0
            X.C32141Ny.LJIIIZ = r0
            r3.setEchoMode(r2)
            X.C30355Bvj.LJIIJJI()
            boolean r0 = X.C32141Ny.LJIIJ
            if (r0 != 0) goto La7
            com.ss.ttlivestreamer.core.effect.IAudioStrangeVoice r1 = r3.getAudioStrangeVoice()
            if (r1 == 0) goto La7
            com.bytedance.android.livesdk.livesetting.broadcast.LiveVoiceEffectUseVoipModeSetting r0 = com.bytedance.android.livesdk.livesetting.broadcast.LiveVoiceEffectUseVoipModeSetting.INSTANCE
            boolean r0 = r0.getValue()
            r1.enablePlayerMode(r2, r0)
        La7:
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = X.C30501By5.LIZJ
            java.lang.Long r0 = X.C30501By5.LIZIZ
            if (r0 == 0) goto L77
            long r5 = r0.longValue()
            java.lang.String r0 = "livesdk_earphone_monitor_use_time"
            X.BZI r4 = X.C28787BRn.LIZ(r0)
            r4.LJIILLIIL(r1)
            long r2 = android.os.SystemClock.uptimeMillis()
            long r2 = r2 - r5
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0
            long r2 = r2 / r0
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            java.lang.String r0 = "use_time"
            r4.LJIJJ(r1, r0)
            r4.LJJIIJZLJL()
            goto L77
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30501By5.LIZJ(boolean, boolean):void");
    }
}
