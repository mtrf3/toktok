package X;

import com.ss.android.ugc.aweme.dsp.common.model.DspDetailListResponse;
import com.ss.android.ugc.aweme.dsp.common.model.DspMusicStruct;
import com.ss.android.ugc.aweme.dsp.common.model.DspStruct;
import com.ss.android.ugc.aweme.dsp.playerservice.plugin.expired.ExpiredPlayableManager;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* renamed from: X.Zqu, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91208Zqu {
    public static final C91208Zqu LIZ;
    public static final C0M6<String, DspDetailListResponse> LIZIZ;
    public static final ConcurrentHashMap<String, Boolean> LIZJ;

    static {
        C91208Zqu c91208Zqu = new C91208Zqu();
        LIZ = c91208Zqu;
        LIZIZ = new C0M6<>(10);
        LIZJ = new ConcurrentHashMap<>();
        EventBus.LIZJ().LJIILJJIL(c91208Zqu);
    }

    public final synchronized DspDetailListResponse LIZ(String fullClipId) {
        o.LJIIIZ(fullClipId, "fullClipId");
        return LIZIZ.LIZIZ(fullClipId);
    }

    public final DspDetailListResponse LIZIZ(String fullClipId) {
        o.LJIIIZ(fullClipId, "fullClipId");
        if (fullClipId.length() == 0 || ExpiredPlayableManager.INSTANCE.isPlayableExpiredTodayByClipId(fullClipId)) {
            return null;
        }
        return LIZ(fullClipId);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        if (X.YBM.LIZIZ() == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(java.lang.String r4) {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.dsp.common.model.DspDetailListResponse r0 = r3.LIZ(r4)
            if (r0 != 0) goto L36
            com.ss.android.ugc.aweme.dsp.playerservice.plugin.expired.ExpiredPlayableManager r2 = com.ss.android.ugc.aweme.dsp.playerservice.plugin.expired.ExpiredPlayableManager.INSTANCE
            boolean r0 = r2.isTodayPlayableLimited()
            if (r0 == 0) goto L39
            X.YBM r0 = X.YBM.LIZ
            r0.getClass()
            boolean r0 = X.YBM.LIZJ()
            if (r0 != 0) goto L39
            r1 = 1
        L1a:
            boolean r0 = r2.isPlayableExpiredTodayByClipId(r4)
            if (r0 != 0) goto L31
            boolean r0 = r2.isPreviewPlayableExpiredTodayByClipId(r4)
            if (r0 == 0) goto L37
            X.YBM r0 = X.YBM.LIZ
            r0.getClass()
            boolean r0 = X.YBM.LIZIZ()
            if (r0 != 0) goto L37
        L31:
            r0 = 1
        L32:
            if (r1 != 0) goto L36
            if (r0 == 0) goto L3b
        L36:
            return
        L37:
            r0 = 0
            goto L32
        L39:
            r1 = 0
            goto L1a
        L3b:
            X.YBK r0 = X.YBK.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.dsp.experiment.MusicDspConfig r0 = X.YBK.LIZ()
            com.ss.android.ugc.aweme.dsp.experiment.UgcCollect r0 = r0.ugcCollect
            boolean r0 = r0.getEnableApiPreload()
            if (r0 != 0) goto L4d
            return
        L4d:
            android.content.Context r0 = X.EF7.LIZIZ()
            boolean r0 = X.C48207Ivz.LIZ(r0)
            if (r0 != 0) goto L64
            com.ss.android.ugc.aweme.dsp.experiment.MusicDspConfig r0 = X.YBK.LIZ()
            com.ss.android.ugc.aweme.dsp.experiment.UgcCollect r0 = r0.ugcCollect
            boolean r0 = r0.getEnableMobileApiPreload()
            if (r0 != 0) goto L64
            return
        L64:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Boolean> r2 = X.C91208Zqu.LIZJ
            java.lang.Object r0 = r2.get(r4)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r1)
            if (r0 == 0) goto L73
            return
        L73:
            r2.put(r4, r1)
            com.ss.android.ugc.aweme.dsp.common.api.MusicDspApi$MusicDspOperatorApi r2 = X.C91086Zow.LIZ()
            X.YBM r0 = X.YBM.LIZ
            r0.getClass()
            boolean r1 = X.YBM.LIZLLL()
            com.ss.android.ugc.aweme.dsp.experiment.DspClipConfig r0 = X.YBM.LIZ()
            int r0 = r0.getDspClipShowStrategy()
            X.Svk r1 = r2.getDspDetail(r4, r1, r0)
            X.T0k r0 = X.T16.LIZ()
            X.Sro r1 = r1.LJJL(r0)
            X.T0k r0 = X.C73969T1h.LIZIZ()
            X.SsE r1 = r1.LJJJ(r0)
            X.Zu1<T, R> r0 = X.C91401Zu1.LJLIL
            X.Sxt r1 = r1.LJJIJL(r0)
            X.Zu2 r0 = new X.Zu2
            r0.<init>(r4)
            X.Srp r2 = r1.LJIILLIIL(r0)
            X.Zu3 r1 = new X.Zu3
            r1.<init>(r4)
            X.Zu4<T> r0 = X.C91404Zu4.LJLIL
            r2.LJJJLIIL(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91208Zqu.LIZJ(java.lang.String):void");
    }

    @QD3
    public final void onSongCollectEvent(C57292Mr event) {
        DspDetailListResponse LIZ2;
        List<DspStruct> dspList;
        DspStruct dspStruct;
        DspMusicStruct dspMusic;
        com.ss.android.ugc.aweme.music.model.Dsp musicDspInfo;
        String str;
        o.LJIIIZ(event, "event");
        if (event.LJLJJI && (LIZ2 = LIZ(event.LJLILLLLZI)) != null && (dspList = LIZ2.getDspList()) != null) {
            Iterator<DspStruct> it = dspList.iterator();
            while (true) {
                if (it.hasNext()) {
                    dspStruct = it.next();
                    com.ss.android.ugc.aweme.music.model.Dsp musicDspInfo2 = dspStruct.getDspMusic().getMusicDspInfo();
                    if (musicDspInfo2 != null) {
                        str = musicDspInfo2.getFullClipId();
                    } else {
                        str = null;
                    }
                    if (o.LJ(str, event.LJLILLLLZI)) {
                        break;
                    }
                } else {
                    dspStruct = null;
                    break;
                }
            }
            DspStruct dspStruct2 = dspStruct;
            if (dspStruct2 == null || (dspMusic = dspStruct2.getDspMusic()) == null || (musicDspInfo = dspMusic.getMusicDspInfo()) == null) {
                return;
            }
            musicDspInfo.setCollectStatus(event.LJLJI);
        }
    }
}
