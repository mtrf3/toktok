package X;

import android.content.IntentFilter;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedThresholdSetting;
import com.ss.android.ugc.aweme.simkit.model.superresolution.SuperResolutionStrategyConfigV2;
import com.ss.android.ugc.aweme.video.simplayer.ISimPlayerService;
import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class IVD implements InterfaceC46631IRv {
    public volatile long LIZ;
    public volatile float LIZLLL;
    public volatile int LJFF;
    public final java.util.Map<String, Boolean> LJIIIIZZ;
    public final LinkedList<Boolean> LJIIIZ;
    public volatile float LJIIJ;
    public final Object LJIIJJI;
    public final java.util.Map<String, Boolean> LJIIL;
    public final java.util.Map<String, IYQ> LJIILIIL;
    public volatile double LIZIZ = 0.2d;
    public final LinkedList<Boolean> LIZJ = new LinkedList<>();
    public final Object LJ = new Object();
    public final C5H3 LJI = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, C46634IRy.LJLIL);
    public final Queue<C46635IRz> LJII = new ConcurrentLinkedQueue();

    @Override // X.InterfaceC46631IRv
    public final /* synthetic */ void LIZLLL() {
    }

    public final SuperResolutionStrategyConfigV2 LJIIIZ() {
        return (SuperResolutionStrategyConfigV2) this.LJI.getValue();
    }

    public final void LJIIJ() {
        Boolean bool;
        while (true) {
            Object poll = ((ConcurrentLinkedQueue) this.LJII).poll();
            if (poll == null) {
                return;
            }
            java.util.Map<String, Boolean> map = this.LJIIL;
            C46635IRz c46635IRz = (C46635IRz) poll;
            String str = c46635IRz.LIZ;
            if (map != null) {
                int i = 0;
                if (map.containsKey(str) && (bool = this.LJIIL.get(c46635IRz.LIZ)) != null) {
                    synchronized (this.LJIIJJI) {
                        this.LJIIIZ.offer(bool);
                        if (this.LJIIIZ.size() > 10) {
                            this.LJIIIZ.removeFirst();
                        }
                        Iterator<Boolean> it = this.LJIIIZ.iterator();
                        int i2 = 0;
                        int i3 = 0;
                        while (it.hasNext()) {
                            if (it.next().booleanValue()) {
                                i2++;
                            } else {
                                i3++;
                            }
                        }
                        int i4 = i3 + i2;
                        if (i4 > 0) {
                            this.LJIIJ = (i2 * 1.0f) / i4;
                        }
                    }
                }
                java.util.Map<String, Boolean> map2 = this.LJIIIIZZ;
                String str2 = c46635IRz.LIZ;
                if (map2 != null) {
                    if (map2.containsKey(str2) && c46635IRz.LIZLLL != -7892) {
                        synchronized (this.LJ) {
                            this.LIZJ.offer(Boolean.valueOf(((C46635IRz) poll).LIZIZ));
                            if (this.LIZJ.size() > 10) {
                                this.LIZJ.removeFirst();
                            }
                            Iterator<Boolean> it2 = this.LIZJ.iterator();
                            int i5 = 0;
                            while (it2.hasNext()) {
                                if (it2.next().booleanValue()) {
                                    i++;
                                } else {
                                    i5++;
                                }
                            }
                            int i6 = i5 + i;
                            if (i6 > 0) {
                                this.LIZLLL = (i * 1.0f) / i6;
                            }
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("updatePlayTime pendingPlayTimeMsg ");
                            LIZ.append(poll);
                            LIZ.append(" referSrCnt ");
                            LIZ.append(this.LIZJ);
                            LIZ.append(" currentPercent ");
                            LIZ.append(this.LIZLLL);
                            X1D.LIZIZ(LIZ);
                        }
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<K, *>");
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<K, *>");
            }
        }
    }

    public IVD() {
        java.util.Map<String, Boolean> synchronizedMap = Collections.synchronizedMap(new C46706IUs());
        o.LJIIIIZZ(synchronizedMap, "synchronizedMap(object :…         }\n            })");
        this.LJIIIIZZ = synchronizedMap;
        this.LJIIIZ = new LinkedList<>();
        this.LJIIJJI = new Object();
        java.util.Map<String, Boolean> synchronizedMap2 = Collections.synchronizedMap(new C46707IUt());
        o.LJIIIIZZ(synchronizedMap2, "synchronizedMap(object :…\n            }\n        })");
        this.LJIIL = synchronizedMap2;
        java.util.Map<String, IYQ> synchronizedMap3 = Collections.synchronizedMap(new C46705IUr());
        o.LJIIIIZZ(synchronizedMap3, "synchronizedMap(object :…ze > 100\n        }\n    })");
        this.LJIILIIL = synchronizedMap3;
    }

    @Override // X.InterfaceC46631IRv
    public final void LJFF() {
        if (LJIIIZ() != null && System.currentTimeMillis() - this.LIZ >= LivePreviewNetworkSpeedThresholdSetting.DEFAULT) {
            if (C16880lQ.LJJLIIIJ(C46982IcE.LIZ, null, new IntentFilter("android.intent.action.BATTERY_CHANGED")) != null) {
                Double valueOf = Double.valueOf(r3.getIntExtra("level", -1) / r3.getIntExtra("scale", -1));
                if (valueOf != null) {
                    this.LIZIZ = valueOf.doubleValue();
                }
            }
            this.LIZ = System.currentTimeMillis();
        }
    }

    public final int LJI(String str) {
        IVF forceSuperResolutionListener;
        Object value = IZ8.LJJJJLL.getValue();
        o.LJIIIIZZ(value, "<get-enableSrResultKeepForSameVideo>(...)");
        if (((Number) value).intValue() == 1 && str != null && o.LJ(this.LJIIIIZZ.get(str), Boolean.TRUE)) {
            LJIIJ();
            return 100;
        }
        Object value2 = IZ8.LJJJJLI.getValue();
        o.LJIIIIZZ(value2, "<get-srPredictMode>(...)");
        ((Number) value2).intValue();
        if (LJIIIZ() == null) {
            return 1;
        }
        LJIIJ();
        Object value3 = IZ8.LJIJJLI.getValue();
        o.LJIIIIZZ(value3, "<get-closeSrForFirstNVideos>(...)");
        int intValue = ((Number) value3).intValue();
        if (intValue > 0 && this.LJFF < intValue) {
            return 16;
        }
        double d = this.LIZIZ;
        o.LJI(LJIIIZ());
        if (d < r0.batteryPercentThreshold) {
            return 6;
        }
        SuperResolutionStrategyConfigV2 LJIIIZ = LJIIIZ();
        if (LJIIIZ == null || !LJIIIZ.adSr || (forceSuperResolutionListener = C1DG.LIZ().getConfig().getCommonConfig().getForceSuperResolutionListener()) == null || !forceSuperResolutionListener.LIZIZ(str)) {
            SuperResolutionStrategyConfigV2 LJIIIZ2 = LJIIIZ();
            o.LJI(LJIIIZ2);
            float f = LJIIIZ2.videoTimePercentThreshold;
            o.LJI(ISimPlayerService.LIZ.get().LIZJ());
            float f2 = f * 1.0f;
            if (f2 >= 1.0f || this.LIZLLL < f2) {
                return 100;
            }
            return 8;
        }
        java.util.Map<String, Boolean> map = this.LJIIIIZZ;
        o.LJI(str);
        map.put(str, Boolean.TRUE);
        return 100;
    }

    public static float LJIIIIZZ(SimBitRate simBitRate, int i) {
        float qualityScore = simBitRate.getQualityScore();
        float srTimeParam = C1DG.LIZ().getConfig().getCommonConfig().getSrTimeParam();
        if (i == 100) {
            if (srTimeParam == 1.5f) {
                return simBitRate.getQualityScoreSr1d5();
            }
            if (srTimeParam != 2.0f) {
                return qualityScore;
            }
            return simBitRate.getQualityScoreSr2();
        }
        return qualityScore;
    }

    @Override // X.InterfaceC46631IRv
    public final int LJ(String str, long j) {
        return LIZIZ(str, true, j, 0, "", 1.0f, 0, 0);
    }

    @Override // X.InterfaceC46631IRv
    public final void LIZ(int i, long j, String str, boolean z) {
        if (LJIIIZ() == null) {
            return;
        }
        ((ConcurrentLinkedQueue) this.LJII).add(new C46635IRz(i, j, str, z));
        this.LJFF++;
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x0260, code lost:
    
        if (r2 == (-1)) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0376, code lost:
    
        r6 = ((X.C46862IaI) r33).LIZ(r29, r30, null, r31, r32);
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0386, code lost:
    
        if (r6 != null) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0388, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0470, code lost:
    
        r10 = r0.size() - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0476, code lost:
    
        if (r10 < 0) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0478, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0479, code lost:
    
        r9 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x047f, code lost:
    
        if (com.bytedance.mt.protector.impl.collections.ListProtector.get(r30, r8) == null) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0481, code lost:
    
        r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r30, r8);
        kotlin.jvm.internal.o.LJI(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0494, code lost:
    
        if (((com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate) r0).getBitRate() != r6.LJLIL.getBitRate()) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0496, code lost:
    
        r7 = (com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate) com.bytedance.mt.protector.impl.collections.ListProtector.get(r30, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x049c, code lost:
    
        r18 = r29.getSourceId();
        r10 = (long) r29.getDuration();
        kotlin.jvm.internal.o.LJI(r7);
        r15 = LJIIIIZZ(r7, LJII(r18, r32, r10, r7.getQualityType(), r7.getGearName(), r29.getAspectRatio(), r7.getCodecType(), (int) r7.getFps()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x04cd, code lost:
    
        if (r2 <= r8) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x04cf, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x04d1, code lost:
    
        if (r8 > r2) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x04d3, code lost:
    
        r14 = r2 - 1;
        r7 = (com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate) com.bytedance.mt.protector.impl.collections.ListProtector.get(r30, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x04db, code lost:
    
        if (r7 != null) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x04dd, code lost:
    
        if (r2 != r8) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x04e0, code lost:
    
        r2 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x04e2, code lost:
    
        r10 = LJII(r29.getSourceId(), r32, (long) r29.getDuration(), r7.getQualityType(), r7.getGearName(), r29.getAspectRatio(), r7.getCodecType(), (int) r7.getFps());
        r1 = LJIIIIZZ(r7, r10);
        r0 = LJIIIZ();
        kotlin.jvm.internal.o.LJI(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x051b, code lost:
    
        if (r1 < (r15 - r0.maxQualityDiff)) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x051d, code lost:
    
        r3.LJLIL = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x051f, code lost:
    
        if (r10 != 100) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0522, code lost:
    
        if (r2 != (-1)) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0525, code lost:
    
        r16 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x04df, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0528, code lost:
    
        if (r9 <= r10) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x052d, code lost:
    
        r8 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x052a, code lost:
    
        r8 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x0178, code lost:
    
        if (r28.LJIIJ < r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0202, code lost:
    
        if (r0 > r13) goto L102;
     */
    /* JADX WARN: Removed duplicated region for block: B:177:0x034f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x02f9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // X.InterfaceC46631IRv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.IYQ LIZJ(com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel r29, java.util.List<? extends com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate> r30, int r31, boolean r32, X.InterfaceC46630IRu r33) {
        /*
            Method dump skipped, instructions count: 1373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IVD.LIZJ(com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel, java.util.List, int, boolean, X.IRu):X.IYQ");
    }

    @Override // X.InterfaceC46631IRv
    public final int LIZIZ(String str, boolean z, long j, int i, String str2, float f, int i2, int i3) {
        int LJII = LJII(str, z, j, i, str2, f, i2, i3);
        if (LJII != 100) {
            return LJII;
        }
        int LJI = LJI(str);
        if (LJI != 8) {
            if (LJI == 100) {
                java.util.Map<String, Boolean> map = this.LJIIIIZZ;
                o.LJI(str);
                map.put(str, Boolean.TRUE);
            }
        } else {
            java.util.Map<String, Boolean> map2 = this.LJIIIIZZ;
            o.LJI(str);
            map2.put(str, Boolean.FALSE);
        }
        return LJI;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0081, code lost:
    
        if (r9 > (r0.longValue() * 1000)) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00a1, code lost:
    
        if (r9 <= (r0.longValue() * 1000)) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJII(java.lang.String r7, boolean r8, long r9, int r11, java.lang.String r12, float r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IVD.LJII(java.lang.String, boolean, long, int, java.lang.String, float, int, int):int");
    }
}
