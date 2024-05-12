package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveKaraokeAccompanySetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveKaraokeVocalSetting;
import kotlin.jvm.internal.o;

/* renamed from: X.0sP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21210sP {
    public static boolean LIZ;

    public static int LIZLLL() {
        C48459J0d<Integer> c48459J0d = InterfaceC30442Bx8.D3;
        Integer LIZJ = c48459J0d.LIZJ();
        if (LIZJ != null && LIZJ.intValue() == -1) {
            c48459J0d.LIZ(Integer.valueOf(LiveKaraokeAccompanySetting.INSTANCE.uiDefault()));
        }
        Integer LIZJ2 = c48459J0d.LIZJ();
        o.LJIIIIZZ(LIZJ2, "KARAOKE_ACCOMPANIMENT_VOLUME.value");
        return LIZJ2.intValue();
    }

    public static int LJ() {
        C48459J0d<Integer> c48459J0d = InterfaceC30442Bx8.C3;
        Integer LIZJ = c48459J0d.LIZJ();
        if (LIZJ != null && LIZJ.intValue() == -1) {
            c48459J0d.LIZ(Integer.valueOf(LiveKaraokeVocalSetting.INSTANCE.uiDefault()));
        }
        Integer LIZJ2 = c48459J0d.LIZJ();
        o.LJIIIIZZ(LIZJ2, "KARAOKE_VOCAL_VOLUME.value");
        return LIZJ2.intValue();
    }

    public static float LIZ(int i) {
        LiveKaraokeAccompanySetting liveKaraokeAccompanySetting = LiveKaraokeAccompanySetting.INSTANCE;
        float max = liveKaraokeAccompanySetting.max();
        float min = liveKaraokeAccompanySetting.min();
        if (min >= max) {
            min = 0.0f;
            max = 1.0f;
        }
        return i * ((max - min) / 100);
    }

    public static float LIZIZ(int i) {
        LiveKaraokeVocalSetting liveKaraokeVocalSetting = LiveKaraokeVocalSetting.INSTANCE;
        float max = liveKaraokeVocalSetting.max();
        float min = liveKaraokeVocalSetting.min();
        if (min >= max) {
            min = 0.0f;
            max = 1.0f;
        }
        return i * ((max - min) / 100);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        if (r8 != null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel LIZJ(final com.bytedance.ies.sdk.datachannel.DataChannel r8) {
        /*
            r3 = 0
            r7 = r8
            if (r7 == 0) goto L4c
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.RoomChannel> r0 = com.bytedance.android.livesdk.dataChannel.RoomChannel.class
            java.lang.Object r2 = r7.kv0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r2 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r2
        Lc:
            boolean r0 = X.C29306Beo.LJIIJ(r7)
            if (r0 == 0) goto L4a
            r4 = 1
        L13:
            if (r7 == 0) goto L48
            androidx.lifecycle.LifecycleOwner r1 = r7.LJLJJI
        L17:
            boolean r0 = r1 instanceof androidx.fragment.app.Fragment
            if (r0 == 0) goto L4e
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L4e
            X.1KX r3 = new X.1KX
            if (r2 == 0) goto L45
            long r5 = r2.getId()
            com.bytedance.android.live.base.model.user.User r0 = r2.getOwner()
            if (r0 == 0) goto L33
            java.lang.String r8 = r0.getSecUid()
            if (r8 != 0) goto L35
        L33:
            java.lang.String r8 = ""
        L35:
            r3.<init>(r4, r5, r7, r8)
            androidx.lifecycle.ViewModelProvider r1 = androidx.lifecycle.ViewModelProviders.of(r1, r3)
            java.lang.Class<com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel> r0 = com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel.class
            androidx.lifecycle.ViewModel r0 = r1.get(r0)
            com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel r0 = (com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel) r0
            return r0
        L45:
            r5 = 0
            goto L33
        L48:
            r1 = r3
            goto L17
        L4a:
            r4 = 2
            goto L13
        L4c:
            r2 = r3
            goto Lc
        L4e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21210sP.LIZJ(com.bytedance.ies.sdk.datachannel.DataChannel):com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel");
    }
}
