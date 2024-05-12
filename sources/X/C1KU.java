package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.1KU, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1KU implements C0WS {
    public static final C1KU LIZ = new C1KU();

    public final void LIZ(DataChannel dataChannel) {
        if (dataChannel != null) {
            dataChannel.jv0(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00d2, code lost:
    
        if (X.C1XY.LJJIFFI(r12) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(com.bytedance.ies.sdk.datachannel.DataChannel r9, androidx.lifecycle.LifecycleOwner r10, boolean r11, X.ActivityC45651qj r12) {
        /*
            java.lang.String r0 = "dataChannel"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            java.lang.String r0 = "lifecycleOwner"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            com.bytedance.android.livesdk.livesetting.watchlive.TestEnableEffectSetting r0 = com.bytedance.android.livesdk.livesetting.watchlive.TestEnableEffectSetting.INSTANCE
            boolean r0 = r0.disable()
            if (r0 == 0) goto L13
            return
        L13:
            X.0TX r1 = X.C0TX.LIZ
            java.lang.String r0 = "LiveEffectRestoreManager"
            r1.LIZJ(r0)
            java.lang.String r0 = "restore"
            X.C0TX.LIZLLL = r0
            java.lang.String r0 = "try to restore beauty effect"
            X.C0TX.LIZIZ(r0)
            androidx.lifecycle.ViewModelProvider r3 = new androidx.lifecycle.ViewModelProvider
            X.C2o r6 = X.C30686C2o.LJLIL
            X.1dG r1 = new X.1dG
            X.1oL r0 = new X.1oL
            r2 = 0
            r0.<init>(r2)
            r1.<init>(r0)
            r3.<init>(r6, r1)
            java.lang.Class<com.bytedance.android.live.effect.smallitem.LiveSmallItemBeautyViewModel> r0 = com.bytedance.android.live.effect.smallitem.LiveSmallItemBeautyViewModel.class
            androidx.lifecycle.ViewModel r7 = r3.get(r0)
            com.bytedance.android.live.effect.smallitem.LiveSmallItemBeautyViewModel r7 = (com.bytedance.android.live.effect.smallitem.LiveSmallItemBeautyViewModel) r7
            X.1VM r3 = new X.1VM
            X.1VF r1 = new X.1VF
            r1.<init>()
            X.1n2 r0 = new X.1n2
            r0.<init>()
            r3.<init>(r1, r0)
            androidx.lifecycle.ViewModelProvider r1 = new androidx.lifecycle.ViewModelProvider
            r1.<init>(r6, r3)
            java.lang.Class<com.bytedance.android.live.effect.filter.composerfilter.ComposerFilterViewModel> r0 = com.bytedance.android.live.effect.filter.composerfilter.ComposerFilterViewModel.class
            androidx.lifecycle.ViewModel r5 = r1.get(r0)
            com.bytedance.android.live.effect.filter.composerfilter.ComposerFilterViewModel r5 = (com.bytedance.android.live.effect.filter.composerfilter.ComposerFilterViewModel) r5
            r8 = 1
            r4 = 3
            r3 = 0
            if (r11 == 0) goto Ld5
            androidx.lifecycle.LifecycleCoroutineScope r1 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r10)
            X.2Bl r0 = new X.2Bl
            r0.<init>(r7, r5, r9, r3)
            X.XKX.LIZLLL(r1, r3, r3, r0, r4)
            java.lang.Class<com.bytedance.android.live.effect.FilterPanelFetchSuccessChannel> r8 = com.bytedance.android.live.effect.FilterPanelFetchSuccessChannel.class
            kotlin.jvm.internal.IDqS416S0100000 r1 = new kotlin.jvm.internal.IDqS416S0100000
            r0 = 157(0x9d, float:2.2E-43)
            r1.<init>(r9, r0)
            r9.lv0(r10, r8, r1)
        L76:
            androidx.lifecycle.LifecycleCoroutineScope r1 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r10)
            X.2Bk r0 = new X.2Bk
            r0.<init>(r7, r3)
            X.XKX.LIZLLL(r1, r3, r3, r0, r4)
            if (r11 == 0) goto Lcc
            androidx.lifecycle.LifecycleCoroutineScope r1 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r10)
            X.2Bm r0 = new X.2Bm
            r0.<init>(r5, r3)
            X.XKX.LIZLLL(r1, r3, r3, r0, r4)
        L90:
            X.1lw r0 = X.C12890ez.LIZ()
            r0.LJIILIIL()
        L97:
            X.C32041No.LJIIIIZZ(r2)
            X.C32041No.LJIIZILJ(r9)
            X.C32041No.LJIILLIIL(r9)
            X.C32041No.LIZLLL()
            androidx.lifecycle.ViewModelProvider r5 = new androidx.lifecycle.ViewModelProvider
            X.1O2 r2 = new X.1O2
            X.1O0 r1 = new X.1O0
            r1.<init>()
            X.1l8 r0 = new X.1l8
            r0.<init>()
            r2.<init>(r1, r0)
            r5.<init>(r6, r2)
            java.lang.Class<com.bytedance.android.live.effect.voiceeffect.VoiceEffectViewModel> r0 = com.bytedance.android.live.effect.voiceeffect.VoiceEffectViewModel.class
            androidx.lifecycle.ViewModel r2 = r5.get(r0)
            com.bytedance.android.live.effect.voiceeffect.VoiceEffectViewModel r2 = (com.bytedance.android.live.effect.voiceeffect.VoiceEffectViewModel) r2
            androidx.lifecycle.LifecycleCoroutineScope r1 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r10)
            X.2Bn r0 = new X.2Bn
            r0.<init>(r2, r3)
            X.XKX.LIZLLL(r1, r3, r3, r0, r4)
            return
        Lcc:
            if (r12 == 0) goto L97
            boolean r0 = X.C1XY.LJJIFFI(r12)
            if (r0 == 0) goto L90
            goto L97
        Ld5:
            X.1Nm r1 = X.C32021Nm.LIZ
            java.lang.String r0 = "LiveEffectRestoreManager#logRestoreComposerFilter"
            r1.LIZJ(r0, r2)
            r1.LJI(r9, r0, r8, r8)
            X.C32021Nm.LJFF(r9, r0, r8, r8)
            X.C32021Nm.LIZ(r0)
            goto L76
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1KU.LIZIZ(com.bytedance.ies.sdk.datachannel.DataChannel, androidx.lifecycle.LifecycleOwner, boolean, X.1qj):void");
    }
}
