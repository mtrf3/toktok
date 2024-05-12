package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AqS46S1000000_8;
import org.json.JSONObject;

/* renamed from: X.IwP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48233IwP implements OnUIPlayListener {
    public final C48780JCm LJLIL;
    public long LJLJJLL;
    public final C0M6<String, Long> LJLILLLLZI = new C0M6<>(100);
    public final java.util.Map<String, Long> LJLJI = new LinkedHashMap();
    public final CopyOnWriteArraySet<InterfaceC48234IwQ> LJLJJI = new CopyOnWriteArraySet<>();
    public String LJLJJL = "";
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(C48235IwR.LJLIL);
    public final C64962gm LJLJLJ = C48841JEv.LIZ(C78613UtF.LIZJ);
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(new AqS46S1000000_8("AnalyticsController", 1));

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ OnUIPlayListener getWrapperedListener() {
        return C222688oa.LIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBufferedPercent(String str, long j, int i) {
        C222688oa.LIZIZ(this, str, j, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBufferedTimeMs(String str, long j) {
        C222688oa.LIZJ(this, str, j);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBuffering(String str, boolean z) {
        C222688oa.LIZLLL(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBuffering(String str, boolean z, IPH iph) {
        C222688oa.LJ(this, str, z, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBuffering(boolean z) {
        C222688oa.LJFF(this, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onCompleteLoaded(String str, boolean z) {
        C222688oa.LJI(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onDecoderBuffering(String str, boolean z) {
        C222688oa.LJII(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onDecoderBuffering(String str, boolean z, IPH iph) {
        C222688oa.LJIIIIZZ(this, str, z, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onDecoderBuffering(boolean z) {
        C222688oa.LJIIIZ(this, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onFrameAboutToBeRendered(int i, long j, long j2, java.util.Map map) {
        C222688oa.LJIIJ(this, i, j, j2, map);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onMaskInfoCallback(String str, ITW itw) {
        C222688oa.LJIIJJI(this, str, itw);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPausePlay(String str) {
        C222688oa.LJIIL(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompleted(String str, int i) {
        C222688oa.LJIILL(this, str, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompletedFirstTime(String str) {
        C222688oa.LJIILLIIL(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayFailed(IPG ipg) {
        C222688oa.LJIJJ(this, ipg);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayFailed(String str, IPG ipg) {
        C222688oa.LJIJ(this, str, ipg);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayPause(String str) {
        C222688oa.LJIJJLI(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayPrepare(String str) {
        C222688oa.LJIL(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayPrepared(String str) {
        C222688oa.LJJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayProgressChange(float f) {
        C222688oa.LJJI(this, f);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayProgressChange(String str, long j, long j2) {
        C222688oa.LJJIFFI(this, str, j, j2);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayRelease(String str) {
        C222688oa.LJJII(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayStop(String str) {
        C222688oa.LJJIII(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayStop(String str, JSONObject jSONObject) {
        C222688oa.LJJIIJ(this, str, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayStop(String str, JSONObject jSONObject, IPH iph) {
        C222688oa.LJJIIJZLJL(this, str, jSONObject, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayStop(String str, boolean z) {
        C222688oa.LJJIIZ(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
        C222688oa.LJJIIZI(this, str, i, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlaying(String str) {
        C222688oa.LJJIJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlaying(String str, IPH iph) {
        C222688oa.LJJIJIIJI(this, str, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPreRenderSessionMissed(String str) {
        C222688oa.LJJIJIIJIL(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPreparePlay(String str) {
        C222688oa.LJJIJIL(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderFirstFrame(IT4 it4) {
        C222688oa.LJJIL(this, it4);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderFirstFrameFromResume(String str) {
        C222688oa.LJJIZ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderReady(IPH iph) {
        C222688oa.LJJJ(this, iph);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onResumePlay(String str) {
        C222688oa.LJJJI(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRetryOnError(IPG ipg) {
        C222688oa.LJJJJI(this, ipg);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRetryOnError(String str, IPG ipg) {
        C222688oa.LJJJJ(this, str, ipg);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onSeekEnd(String str, boolean z) {
        C222688oa.LJJJJIZL(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onSeekStart(String str, int i, float f) {
        C222688oa.LJJJJJ(this, str, i, f);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onSpeedChanged(String str, float f) {
        C222688oa.LJJJJJL(this, str, f);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onVideoBitrateChanged(String str, EnumC47177IfN enumC47177IfN, int i) {
        C222688oa.LJJJJL(this, str, enumC47177IfN, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onVideoSizeChanged(String str, int i, int i2) {
        C222688oa.LJJJJLI(this, str, i, i2);
    }

    public final IAwemeService LIZIZ() {
        return (IAwemeService) this.LJLJL.getValue();
    }

    public final long LIZJ() {
        Object next;
        java.util.Map<String, Long> map = this.LJLJI;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator it = ((LinkedHashMap) map).entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((Number) ((Map.Entry) it.next()).getValue()).longValue()));
        }
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            next = null;
        } else {
            next = it2.next();
            while (it2.hasNext()) {
                next = Long.valueOf(((Number) next).longValue() + ((Number) it2.next()).longValue());
            }
        }
        Long l = (Long) next;
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public C48233IwP(C48780JCm c48780JCm) {
        this.LJLIL = c48780JCm;
    }

    public static java.util.Map LIZ(Aweme aweme) {
        return C113554cx.LJJL(new OSZ("author_id", aweme.getAuthorUid()), new OSZ("group_id", aweme.getGroupId()), new OSZ("log_pb", aweme.getLogPbString()));
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        if (str != null) {
            LIZLLL(str, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0083, code lost:
    
        if (r3 == null) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(java.lang.String r8, X.IPH r9) {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r0 = r7.LIZIZ()
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r0.i6(r8)
            if (r3 != 0) goto Lb
            return
        Lb:
            X.JCm r2 = r7.LJLIL
            if (r2 != 0) goto L10
            return
        L10:
            X.0M6<java.lang.String, java.lang.Long> r0 = r7.LJLILLLLZI
            java.lang.Object r0 = r0.LIZIZ(r8)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 != 0) goto L1b
            return
        L1b:
            long r0 = r0.longValue()
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r5 = r5 - r0
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.Map r0 = LIZ(r3)
            r4.putAll(r0)
            java.lang.String r1 = r2.LIZ
            if (r1 == 0) goto L39
            java.lang.String r0 = "enter_from"
            r4.put(r0, r1)
        L39:
            java.util.concurrent.CopyOnWriteArraySet<X.IwQ> r0 = r7.LJLJJI
            java.util.Iterator r1 = r0.iterator()
        L3f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L53
            java.lang.Object r0 = r1.next()
            X.IwQ r0 = (X.InterfaceC48234IwQ) r0
            java.util.Map r0 = r0.LJ(r3, r2)
            r4.putAll(r0)
            goto L3f
        L53:
            java.lang.String r1 = "duration"
            java.lang.String r0 = java.lang.String.valueOf(r5)
            r4.put(r1, r0)
            X.Yp3 r3 = X.C88545Yp3.LIZIZ
            java.lang.String r2 = ""
            if (r3 == 0) goto L68
            java.lang.String r1 = r3.LJ()
            if (r1 != 0) goto L6b
        L68:
            r1 = r2
            if (r3 == 0) goto Lb5
        L6b:
            boolean r0 = r3.isConnected()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L73:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r4.put(r1, r0)
            if (r3 == 0) goto L82
            java.lang.String r1 = r3.LIZIZ()
            if (r1 != 0) goto L85
        L82:
            r1 = r2
            if (r3 == 0) goto L8b
        L85:
            java.lang.String r0 = r3.LJIILJJIL()
            if (r0 != 0) goto Lb3
        L8b:
            r4.put(r1, r2)
            java.lang.String r0 = "play_time"
            X.FMX.LJIIL(r0, r4)
            X.0M6<java.lang.String, java.lang.Long> r0 = r7.LJLILLLLZI
            r0.LIZLLL(r8)
            java.lang.Long r4 = java.lang.Long.valueOf(r5)
            java.util.Map<java.lang.String, java.lang.Long> r3 = r7.LJLJI
            r0 = 95
            java.lang.StringBuilder r2 = X.C72972SkS.LJFF(r8, r0)
            long r0 = java.lang.System.currentTimeMillis()
            r2.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r2)
            r3.put(r0, r4)
            return
        Lb3:
            r2 = r0
            goto L8b
        Lb5:
            r0 = 0
            goto L73
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48233IwP.LIZLLL(java.lang.String, X.IPH):void");
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str, IPH iph) {
        C48780JCm c48780JCm;
        C222688oa.LJIILIIL(this, str, iph);
        if (str != null) {
            LIZLLL(str, iph);
            Aweme i6 = LIZIZ().i6(str);
            if (i6 == null || (c48780JCm = this.LJLIL) == null) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.putAll(LIZ(i6));
            String str2 = c48780JCm.LIZ;
            if (str2 != null) {
                hashMap.put("enter_from", str2);
            }
            Iterator<InterfaceC48234IwQ> it = this.LJLJJI.iterator();
            while (it.hasNext()) {
                hashMap.putAll(it.next().LIZLLL(i6, c48780JCm));
            }
            FMX.LJIIL("video_pause", hashMap);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006b, code lost:
    
        if (r3 == null) goto L32;
     */
    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPlayCompletedFirstTime(java.lang.String r6, X.IPH r7) {
        /*
            r5 = this;
            X.C222688oa.LJIIZILJ(r5, r6, r7)
            if (r6 == 0) goto Lf
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r0 = r5.LIZIZ()
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r0.i6(r6)
            if (r3 != 0) goto L10
        Lf:
            return
        L10:
            X.JCm r2 = r5.LJLIL
            if (r2 != 0) goto L15
            goto Lf
        L15:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.Map r0 = LIZ(r3)
            r4.putAll(r0)
            java.lang.String r1 = r2.LIZ
            if (r1 == 0) goto L2a
            java.lang.String r0 = "enter_from"
            r4.put(r0, r1)
        L2a:
            java.util.concurrent.CopyOnWriteArraySet<X.IwQ> r0 = r5.LJLJJI
            java.util.Iterator r1 = r0.iterator()
        L30:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L44
            java.lang.Object r0 = r1.next()
            X.IwQ r0 = (X.InterfaceC48234IwQ) r0
            java.util.Map r0 = r0.LJFF(r3, r2)
            r4.putAll(r0)
            goto L30
        L44:
            X.Yp3 r3 = X.C88545Yp3.LIZIZ
            java.lang.String r2 = ""
            if (r3 == 0) goto L50
            java.lang.String r1 = r3.LJ()
            if (r1 != 0) goto L53
        L50:
            r1 = r2
            if (r3 == 0) goto L7e
        L53:
            boolean r0 = r3.isConnected()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L5b:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r4.put(r1, r0)
            if (r3 == 0) goto L6a
            java.lang.String r1 = r3.LIZIZ()
            if (r1 != 0) goto L6d
        L6a:
            r1 = r2
            if (r3 == 0) goto L73
        L6d:
            java.lang.String r0 = r3.LJIILJJIL()
            if (r0 != 0) goto L7c
        L73:
            r4.put(r1, r2)
            java.lang.String r0 = "video_play_finish"
            X.FMX.LJIIL(r0, r4)
            goto Lf
        L7c:
            r2 = r0
            goto L73
        L7e:
            r0 = 0
            goto L5b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48233IwP.onPlayCompletedFirstTime(java.lang.String, X.IPH):void");
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str, IPH iph) {
        C48780JCm c48780JCm;
        C222688oa.LJJIJL(this, str, iph);
        this.LJLJJLL = SystemClock.elapsedRealtime();
        Aweme i6 = LIZIZ().i6(str);
        if (i6 == null || (c48780JCm = this.LJLIL) == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.putAll(LIZ(i6));
        String str2 = c48780JCm.LIZ;
        if (str2 != null) {
            hashMap.put("enter_from", str2);
        }
        Iterator<InterfaceC48234IwQ> it = this.LJLJJI.iterator();
        while (it.hasNext()) {
            hashMap.putAll(it.next().LIZJ(i6, c48780JCm));
        }
        FMX.LJIIL("video_request", hashMap);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(String str, IT4 it4) {
        C48780JCm c48780JCm;
        String str2;
        Aweme i6;
        C48780JCm c48780JCm2;
        C222688oa.LJJIJLIJ(this, str, it4);
        if (str != null) {
            this.LJLILLLLZI.LIZJ(str, Long.valueOf(SystemClock.elapsedRealtime()));
            this.LJLJJL = str;
            Aweme i62 = LIZIZ().i6(str);
            if (i62 != null && (c48780JCm = this.LJLIL) != null) {
                HashMap hashMap = new HashMap();
                hashMap.putAll(LIZ(i62));
                if (C227768wm.LJJIII(i62)) {
                    str2 = "1";
                } else {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
                hashMap.put("is_landscape_portrait", str2);
                Video video = i62.getVideo();
                if (video != null) {
                    hashMap.put("video_duration", String.valueOf(video.getDuration()));
                }
                String str3 = c48780JCm.LIZ;
                if (str3 != null) {
                    hashMap.put("enter_from", str3);
                }
                Iterator<InterfaceC48234IwQ> it = this.LJLJJI.iterator();
                while (true) {
                    if (it.hasNext()) {
                        OSZ LIZ = it.next().LIZ(i62, c48780JCm);
                        if (!((Boolean) LIZ.getFirst()).booleanValue()) {
                            break;
                        } else {
                            hashMap.putAll((java.util.Map) LIZ.getSecond());
                        }
                    } else {
                        C60903NvH.LJJIJIL("video_play", hashMap);
                        hashMap.put("duration", String.valueOf(SystemClock.elapsedRealtime() - this.LJLJJLL));
                        C60903NvH.LJJIJIL("video_play_quality", hashMap);
                        break;
                    }
                }
            }
            if (it4 == null || (i6 = LIZIZ().i6(str)) == null || (c48780JCm2 = this.LJLIL) == null) {
                return;
            }
            XKX.LIZLLL(this.LJLJLJ, null, null, new C48791JCx(this, str, c48780JCm2, it4, i6, null), 3);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str, IPH iph) {
        C222688oa.LJJJIL(this, str, iph);
        if (str != null) {
            this.LJLILLLLZI.LIZJ(str, Long.valueOf(SystemClock.elapsedRealtime()));
            this.LJLJJL = str;
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(String str, IPG ipg, IPH iph) {
        C48780JCm c48780JCm;
        C222688oa.LJIJI(this, str, ipg, iph);
        this.LJLJJLL = 0L;
        if (str != null) {
            LIZLLL(str, iph);
            Aweme i6 = LIZIZ().i6(str);
            if (i6 == null || (c48780JCm = this.LJLIL) == null) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.putAll(LIZ(i6));
            String str2 = c48780JCm.LIZ;
            if (str2 != null) {
                hashMap.put("enter_from", str2);
            }
            Iterator<InterfaceC48234IwQ> it = this.LJLJJI.iterator();
            while (it.hasNext()) {
                hashMap.putAll(it.next().LIZIZ(i6, c48780JCm));
            }
            FMX.LJIIL("video_play_fail", hashMap);
        }
    }
}
