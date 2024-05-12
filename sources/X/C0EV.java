package X;

import Y.IDRunnableS29S0200000;
import com.bytedance.android.livesdk.model.KaraokeSong;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;
import tikcast.api.anchor.KaraokeTab;

/* renamed from: X.0EV, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0EV {
    public final int LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public final DataChannel LIZLLL;
    public final ConcurrentHashMap<Long, C0EY> LJ;
    public final List<AnonymousClass015> LJFF;
    public final C07500Re LJI;
    public List<? extends LiveEffect> LJII;
    public final C0M6<String, C0EY> LJIIIIZZ;
    public long LJIIIZ;
    public volatile long LJIIJ;

    public final boolean LJIILIIL() {
        if (this.LIZ == 1) {
            return true;
        }
        return false;
    }

    public final void LJIJJLI() {
        Enumeration<Long> keys = this.LJ.keys();
        o.LJIIIIZZ(keys, "songListMap.keys()");
        ArrayList list = Collections.list(keys);
        o.LJIIIIZZ(list, "list(this)");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Long tabId = (Long) it.next();
            o.LJIIIIZZ(tabId, "tabId");
            LJ(tabId.longValue(), C46301rm.LJLIL, C46311rn.LJLIL);
        }
        for (String keyword : ORZ.LLJI(((LinkedHashMap) this.LJIIIIZZ.LJII()).keySet())) {
            o.LJIIIIZZ(keyword, "keyword");
            LIZJ(keyword, C46321ro.LJLIL, C46331rp.LJLIL);
        }
    }

    public final void LJIL() {
        boolean z;
        boolean z2;
        ConcurrentHashMap<Long, C0EY> concurrentHashMap = this.LJ;
        if (this.LIZ == 1) {
            z = true;
        } else {
            z = false;
        }
        C61878OQg c61878OQg = C61878OQg.INSTANCE;
        concurrentHashMap.put(-999L, C0EX.LIZ(0, !z, c61878OQg));
        ConcurrentHashMap<Long, C0EY> concurrentHashMap2 = this.LJ;
        if (this.LIZ == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        concurrentHashMap2.put(-998L, C0EX.LIZ(0, !z2, c61878OQg));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005e A[Catch: all -> 0x00e6, TryCatch #0 {all -> 0x00e6, blocks: (B:11:0x0053, B:12:0x0056, B:14:0x005e, B:16:0x0069, B:20:0x0076, B:22:0x0087, B:23:0x0092, B:25:0x0098, B:29:0x00ac, B:34:0x00bb, B:41:0x00bf, B:42:0x00c3, B:44:0x00c9, B:46:0x00e3, B:53:0x0031), top: B:7:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(X.InterfaceC67352kd<? super java.util.List<X.AnonymousClass015>> r11) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EV.LJII(X.2kd):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.List<? extends com.bytedance.android.livesdkapi.depend.model.LiveEffect>] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(X.InterfaceC67352kd<? super java.util.List<? extends com.bytedance.android.livesdkapi.depend.model.LiveEffect>> r11) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EV.LJIIIZ(X.2kd):java.lang.Object");
    }

    public final synchronized C0EY LJIIJ(long j) {
        return this.LJ.get(Long.valueOf(j));
    }

    public final boolean LJIIJJI(long j) {
        C0EY c0ey = this.LJ.get(Long.valueOf(j));
        if (c0ey == null || !(!c0ey.LIZJ.isEmpty()) || !c0ey.LIZIZ) {
            return false;
        }
        return true;
    }

    public final boolean LJIIL(String str) {
        C0EY LIZIZ = this.LJIIIIZZ.LIZIZ(str);
        if (LIZIZ == null || !(!LIZIZ.LIZJ.isEmpty()) || !LIZIZ.LIZIZ) {
            return false;
        }
        return true;
    }

    public final synchronized void LJIILJJIL(C279917z songInfo) {
        o.LJIIIZ(songInfo, "songInfo");
        C0EY c0ey = this.LJ.get(-999L);
        if (c0ey == null) {
            return;
        }
        C0EY LIZIZ = c0ey.LIZIZ(songInfo);
        this.LJ.put(-999L, LIZIZ);
        o.LJ(LIZIZ, c0ey);
    }

    public final void LJJI(Exception exc) {
        C15610jN.LIZ().post(new IDRunnableS29S0200000(exc, this, 14));
    }

    public final void LJJIIJZLJL(KaraokeTab karaokeTab) {
        ConcurrentHashMap<Long, C0EY> concurrentHashMap = this.LJ;
        Long valueOf = Long.valueOf(karaokeTab.id);
        int i = (int) karaokeTab.offset;
        boolean z = karaokeTab.hasMore;
        List<KaraokeSong> list = karaokeTab.songList;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator<KaraokeSong> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C78926UyI.LJJJJL(it.next(), null));
        }
        concurrentHashMap.put(valueOf, C0EX.LIZ(i, z, arrayList));
    }

    public final synchronized boolean LIZ(long j, C279917z songInfo) {
        o.LJIIIZ(songInfo, "songInfo");
        C0EY c0ey = this.LJ.get(Long.valueOf(j));
        if (c0ey == null) {
            return false;
        }
        if (c0ey.LIZIZ) {
            return false;
        }
        if (j == -999 && c0ey.LIZJ.isEmpty()) {
            songInfo = songInfo.LIZLLL(AnonymousClass017.PLAYING);
        }
        this.LJ.put(Long.valueOf(j), C0EX.LIZ(c0ey.LIZ, c0ey.LIZIZ, ORZ.LLIIJI(songInfo, c0ey.LIZJ)));
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(7:5|6|(1:(4:9|10|11|12)(2:29|30))(6:31|32|33|35|36|(1:38)(1:39))|13|14|15|16))|45|6|(0)(0)|13|14|15|16|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
    
        r3 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008f, code lost:
    
        r4.LIZ(r0, r13);
        r4.LJJIII(r13.LIZ, X.AnonymousClass010.ADDED);
        r4.LJIJ(-998, r13);
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C279917z r13, X.InterfaceC67352kd<? super java.lang.Boolean> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof X.C46201rc
            if (r0 == 0) goto L22
            r11 = r14
            X.1rc r11 = (X.C46201rc) r11
            int r2 = r11.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r11.LJLJJL = r2
        L12:
            java.lang.Object r3 = r11.LJLJI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r11.LJLJJL
            r8 = 1
            if (r0 == 0) goto L3b
            if (r0 != r8) goto L33
            X.17z r13 = r11.LJLILLLLZI
            X.0EV r4 = r11.LJLIL
            goto L28
        L22:
            X.1rc r11 = new X.1rc
            r11.<init>(r12, r14)
            goto L12
        L28:
            X.C141335gf.LIZJ(r3)     // Catch: java.lang.Exception -> L2c
            goto L30
        L2c:
            r3 = move-exception
            r0 = -999(0xfffffffffffffc19, double:NaN)
            goto L7d
        L30:
            r0 = -999(0xfffffffffffffc19, double:NaN)
            goto L63
        L33:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L3b:
            X.C141335gf.LIZJ(r3)
            X.PsI r1 = X.C65814PsI.LIZ()     // Catch: java.lang.Exception -> L77
            java.lang.Class<com.bytedance.android.live.effect.karaoke.api.KaraokeApi> r0 = com.bytedance.android.live.effect.karaoke.api.KaraokeApi.class
            r1.getClass()     // Catch: java.lang.Exception -> L77
            java.lang.Object r3 = X.C65814PsI.LIZJ(r0)     // Catch: java.lang.Exception -> L77
            com.bytedance.android.live.effect.karaoke.api.KaraokeApi r3 = (com.bytedance.android.live.effect.karaoke.api.KaraokeApi) r3     // Catch: java.lang.Exception -> L77
            long r4 = r12.LIZIZ     // Catch: java.lang.Exception -> L77
            long r6 = r13.LIZ     // Catch: java.lang.Exception -> L77
            r11.LJLIL = r12     // Catch: java.lang.Exception -> L77
            r11.LJLILLLLZI = r13     // Catch: java.lang.Exception -> L77
            r11.LJLJJL = r8     // Catch: java.lang.Exception -> L77
            r0 = -999(0xfffffffffffffc19, double:NaN)
            r9 = 0
            java.lang.Object r3 = r3.updateQueueList(r4, r6, r8, r9, r11)     // Catch: java.lang.Exception -> L75
            if (r3 != r2) goto L62
            return r2
        L62:
            r4 = r12
        L63:
            X.BFf r3 = (X.C28467BFf) r3     // Catch: java.lang.Exception -> L7c
            r4.LIZ(r0, r13)     // Catch: java.lang.Exception -> L7c
            long r2 = r13.LIZ     // Catch: java.lang.Exception -> L7c
            X.010 r5 = X.AnonymousClass010.ADDED     // Catch: java.lang.Exception -> L7c
            r4.LJJIII(r2, r5)     // Catch: java.lang.Exception -> L7c
            r2 = -998(0xfffffffffffffc1a, double:NaN)
            r4.LJIJ(r2, r13)     // Catch: java.lang.Exception -> L7c
            goto L9e
        L75:
            r3 = move-exception
            goto L7a
        L77:
            r3 = move-exception
            r0 = -999(0xfffffffffffffc19, double:NaN)
        L7a:
            r4 = r12
            goto L7d
        L7c:
            r3 = move-exception
        L7d:
            r4.LJJI(r3)
            boolean r2 = r3 instanceof X.C29401Dk
            if (r2 == 0) goto La3
            X.16r r3 = (X.C276516r) r3
            int r3 = r3.getErrorCode()
            r2 = 4033007(0x3d89ef, float:5.651447E-39)
            if (r3 != r2) goto La3
            r4.LIZ(r0, r13)
            long r0 = r13.LIZ
            X.010 r2 = X.AnonymousClass010.ADDED
            r4.LJJIII(r0, r2)
            r0 = -998(0xfffffffffffffc1a, double:NaN)
            r4.LJIJ(r0, r13)
        L9e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            return r0
        La3:
            long r1 = r13.LIZ
            X.010 r0 = X.AnonymousClass010.UN_ADD
            r4.LJJIII(r1, r0)
            r8 = 0
            goto L9e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EV.LIZIZ(X.17z, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065 A[Catch: Exception -> 0x00d3, TryCatch #1 {Exception -> 0x00d3, blocks: (B:11:0x0059, B:12:0x005c, B:14:0x0065, B:15:0x0067, B:17:0x006c, B:18:0x006e, B:20:0x0073, B:22:0x0077, B:23:0x0086, B:25:0x008c, B:27:0x00a1, B:36:0x00cd, B:44:0x00d0, B:45:0x00d1, B:46:0x009f, B:29:0x00a2, B:34:0x00b7, B:35:0x00c3, B:42:0x00bf), top: B:10:0x0059, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006c A[Catch: Exception -> 0x00d3, TryCatch #1 {Exception -> 0x00d3, blocks: (B:11:0x0059, B:12:0x005c, B:14:0x0065, B:15:0x0067, B:17:0x006c, B:18:0x006e, B:20:0x0073, B:22:0x0077, B:23:0x0086, B:25:0x008c, B:27:0x00a1, B:36:0x00cd, B:44:0x00d0, B:45:0x00d1, B:46:0x009f, B:29:0x00a2, B:34:0x00b7, B:35:0x00c3, B:42:0x00bf), top: B:10:0x0059, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r4v8, types: [X.0EY] */
    /* JADX WARN: Type inference failed for: r8v3, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(int r14, X.InterfaceC67352kd<? super X.C0EY> r15) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EV.LJI(int, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0072 A[Catch: Exception -> 0x0133, TryCatch #1 {Exception -> 0x0133, blocks: (B:11:0x0067, B:12:0x006a, B:14:0x0072, B:15:0x0074, B:17:0x007d, B:18:0x007f, B:20:0x0084, B:21:0x0086, B:23:0x008b, B:24:0x008d, B:70:0x012d, B:81:0x0130, B:82:0x0131, B:27:0x0099, B:29:0x00ac, B:31:0x00b0, B:32:0x00bf, B:34:0x00c5, B:36:0x00cd, B:38:0x00d1, B:39:0x00d5, B:41:0x00db, B:43:0x00e6, B:50:0x00f8, B:52:0x00fc, B:54:0x00fe, B:68:0x0113, B:69:0x0121, B:77:0x011d, B:79:0x0106), top: B:10:0x0067, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d A[Catch: Exception -> 0x0133, TryCatch #1 {Exception -> 0x0133, blocks: (B:11:0x0067, B:12:0x006a, B:14:0x0072, B:15:0x0074, B:17:0x007d, B:18:0x007f, B:20:0x0084, B:21:0x0086, B:23:0x008b, B:24:0x008d, B:70:0x012d, B:81:0x0130, B:82:0x0131, B:27:0x0099, B:29:0x00ac, B:31:0x00b0, B:32:0x00bf, B:34:0x00c5, B:36:0x00cd, B:38:0x00d1, B:39:0x00d5, B:41:0x00db, B:43:0x00e6, B:50:0x00f8, B:52:0x00fc, B:54:0x00fe, B:68:0x0113, B:69:0x0121, B:77:0x011d, B:79:0x0106), top: B:10:0x0067, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0084 A[Catch: Exception -> 0x0133, TryCatch #1 {Exception -> 0x0133, blocks: (B:11:0x0067, B:12:0x006a, B:14:0x0072, B:15:0x0074, B:17:0x007d, B:18:0x007f, B:20:0x0084, B:21:0x0086, B:23:0x008b, B:24:0x008d, B:70:0x012d, B:81:0x0130, B:82:0x0131, B:27:0x0099, B:29:0x00ac, B:31:0x00b0, B:32:0x00bf, B:34:0x00c5, B:36:0x00cd, B:38:0x00d1, B:39:0x00d5, B:41:0x00db, B:43:0x00e6, B:50:0x00f8, B:52:0x00fc, B:54:0x00fe, B:68:0x0113, B:69:0x0121, B:77:0x011d, B:79:0x0106), top: B:10:0x0067, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008b A[Catch: Exception -> 0x0133, TryCatch #1 {Exception -> 0x0133, blocks: (B:11:0x0067, B:12:0x006a, B:14:0x0072, B:15:0x0074, B:17:0x007d, B:18:0x007f, B:20:0x0084, B:21:0x0086, B:23:0x008b, B:24:0x008d, B:70:0x012d, B:81:0x0130, B:82:0x0131, B:27:0x0099, B:29:0x00ac, B:31:0x00b0, B:32:0x00bf, B:34:0x00c5, B:36:0x00cd, B:38:0x00d1, B:39:0x00d5, B:41:0x00db, B:43:0x00e6, B:50:0x00f8, B:52:0x00fc, B:54:0x00fe, B:68:0x0113, B:69:0x0121, B:77:0x011d, B:79:0x0106), top: B:10:0x0067, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0134 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r10v1, types: [X.0EY] */
    /* JADX WARN: Type inference failed for: r3v4, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(int r21, X.InterfaceC67352kd<? super X.C0EY> r22) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EV.LJIIIIZZ(int, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22)(1:23))|12|13|14))|26|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
    
        X.BPP.LIZIZ(X.C15380j0.LIZLLL(), X.C15380j0.LJIILJJIL(com.zhiliaoapp.musically.R.string.jwv), r2);
        r2 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILLIIL(X.C279917z r14, X.InterfaceC67352kd<? super java.lang.Boolean> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof X.C46271rj
            if (r0 == 0) goto L22
            r12 = r15
            X.1rj r12 = (X.C46271rj) r12
            int r2 = r12.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r12.LJLJJL = r2
        L12:
            java.lang.Object r1 = r12.LJLJI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r12.LJLJJL
            r2 = 1
            if (r0 == 0) goto L30
            if (r0 != r2) goto L28
            X.17z r14 = r12.LJLILLLLZI
            X.0EV r0 = r12.LJLIL
            goto L58
        L22:
            X.1rj r12 = new X.1rj
            r12.<init>(r13, r15)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C141335gf.LIZJ(r1)
            X.PsI r1 = X.C65814PsI.LIZ()     // Catch: java.lang.Exception -> L61
            java.lang.Class<com.bytedance.android.live.effect.karaoke.api.KaraokeApi> r0 = com.bytedance.android.live.effect.karaoke.api.KaraokeApi.class
            r1.getClass()     // Catch: java.lang.Exception -> L61
            java.lang.Object r4 = X.C65814PsI.LIZJ(r0)     // Catch: java.lang.Exception -> L61
            com.bytedance.android.live.effect.karaoke.api.KaraokeApi r4 = (com.bytedance.android.live.effect.karaoke.api.KaraokeApi) r4     // Catch: java.lang.Exception -> L61
            long r5 = r13.LIZIZ     // Catch: java.lang.Exception -> L61
            long r7 = r14.LIZ     // Catch: java.lang.Exception -> L61
            r9 = 3
            r10 = 0
            r12.LJLIL = r13     // Catch: java.lang.Exception -> L61
            r12.LJLILLLLZI = r14     // Catch: java.lang.Exception -> L61
            r12.LJLJJL = r2     // Catch: java.lang.Exception -> L61
            java.lang.Object r1 = r4.updateQueueList(r5, r7, r9, r10, r12)     // Catch: java.lang.Exception -> L61
            if (r1 != r3) goto L56
            return r3
        L56:
            r0 = r13
            goto L5b
        L58:
            X.C141335gf.LIZJ(r1)     // Catch: java.lang.Exception -> L61
        L5b:
            X.BFf r1 = (X.C28467BFf) r1     // Catch: java.lang.Exception -> L61
            r0.LJIILJJIL(r14)     // Catch: java.lang.Exception -> L61
            goto L71
        L61:
            r2 = move-exception
            android.content.Context r1 = X.C15380j0.LIZLLL()
            r0 = 2131835131(0x7f1138fb, float:1.9303392E38)
            java.lang.String r0 = X.C15380j0.LJIILJJIL(r0)
            X.BPP.LIZIZ(r1, r0, r2)
            r2 = 0
        L71:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EV.LJIILLIIL(X.17z, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22)(1:23))|12|13|14))|26|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        X.BPP.LIZIZ(X.C15380j0.LIZLLL(), X.C15380j0.LJIILJJIL(com.zhiliaoapp.musically.R.string.jwv), r2);
        r3 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIZILJ(X.C279917z r14, X.InterfaceC67352kd<? super java.lang.Boolean> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof X.C46281rk
            if (r0 == 0) goto L22
            r12 = r15
            X.1rk r12 = (X.C46281rk) r12
            int r2 = r12.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r12.LJLJJL = r2
        L12:
            java.lang.Object r1 = r12.LJLJI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r12.LJLJJL
            r3 = 1
            if (r0 == 0) goto L30
            if (r0 != r3) goto L28
            X.17z r14 = r12.LJLILLLLZI
            X.0EV r4 = r12.LJLIL
            goto L58
        L22:
            X.1rk r12 = new X.1rk
            r12.<init>(r13, r15)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C141335gf.LIZJ(r1)
            X.PsI r1 = X.C65814PsI.LIZ()     // Catch: java.lang.Exception -> L6a
            java.lang.Class<com.bytedance.android.live.effect.karaoke.api.KaraokeApi> r0 = com.bytedance.android.live.effect.karaoke.api.KaraokeApi.class
            r1.getClass()     // Catch: java.lang.Exception -> L6a
            java.lang.Object r4 = X.C65814PsI.LIZJ(r0)     // Catch: java.lang.Exception -> L6a
            com.bytedance.android.live.effect.karaoke.api.KaraokeApi r4 = (com.bytedance.android.live.effect.karaoke.api.KaraokeApi) r4     // Catch: java.lang.Exception -> L6a
            long r5 = r13.LIZIZ     // Catch: java.lang.Exception -> L6a
            long r7 = r14.LIZ     // Catch: java.lang.Exception -> L6a
            r9 = 2
            r10 = 0
            r12.LJLIL = r13     // Catch: java.lang.Exception -> L6a
            r12.LJLILLLLZI = r14     // Catch: java.lang.Exception -> L6a
            r12.LJLJJL = r3     // Catch: java.lang.Exception -> L6a
            java.lang.Object r1 = r4.updateQueueList(r5, r7, r9, r10, r12)     // Catch: java.lang.Exception -> L6a
            if (r1 != r2) goto L56
            return r2
        L56:
            r4 = r13
            goto L5b
        L58:
            X.C141335gf.LIZJ(r1)     // Catch: java.lang.Exception -> L6a
        L5b:
            X.BFf r1 = (X.C28467BFf) r1     // Catch: java.lang.Exception -> L6a
            r0 = -999(0xfffffffffffffc19, double:NaN)
            r4.LJIJ(r0, r14)     // Catch: java.lang.Exception -> L6a
            long r1 = r14.LIZ     // Catch: java.lang.Exception -> L6a
            X.010 r0 = X.AnonymousClass010.UN_ADD     // Catch: java.lang.Exception -> L6a
            r4.LJJIII(r1, r0)     // Catch: java.lang.Exception -> L6a
            goto L7a
        L6a:
            r2 = move-exception
            android.content.Context r1 = X.C15380j0.LIZLLL()
            r0 = 2131835131(0x7f1138fb, float:1.9303392E38)
            java.lang.String r0 = X.C15380j0.LJIILJJIL(r0)
            X.BPP.LIZIZ(r1, r0, r2)
            r3 = 0
        L7a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EV.LJIIZILJ(X.17z, X.2kd):java.lang.Object");
    }

    public final synchronized void LJIJ(long j, C279917z songInfo) {
        o.LJIIIZ(songInfo, "songInfo");
        C0EY c0ey = this.LJ.get(Long.valueOf(j));
        if (c0ey == null) {
            return;
        }
        C0EY LIZ = c0ey.LIZ(songInfo);
        this.LJ.put(Long.valueOf(j), LIZ);
        o.LJ(LIZ, c0ey);
    }

    public final synchronized boolean LJIJI(long j, long j2) {
        C279917z c279917z;
        C0EY LIZ;
        C0EY c0ey = this.LJ.get(Long.valueOf(j));
        if (c0ey == null) {
            return false;
        }
        Iterator<C279917z> it = c0ey.LIZJ.iterator();
        while (true) {
            if (it.hasNext()) {
                c279917z = it.next();
                if (c279917z.LIZ == j2) {
                    break;
                }
            } else {
                c279917z = null;
                break;
            }
        }
        C279917z c279917z2 = c279917z;
        if (c279917z2 == null) {
            LIZ = c0ey;
        } else {
            LIZ = c0ey.LIZ(c279917z2);
        }
        this.LJ.put(Long.valueOf(j), LIZ);
        return !o.LJ(LIZ, c0ey);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIJJ(X.C279917z r12, X.InterfaceC67352kd<? super java.lang.Boolean> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof X.C46291rl
            if (r0 == 0) goto L22
            r10 = r13
            X.1rl r10 = (X.C46291rl) r10
            int r2 = r10.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r10.LJLJJL = r2
        L12:
            java.lang.Object r1 = r10.LJLJI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r10.LJLJJL
            r6 = 1
            if (r0 == 0) goto L30
            if (r0 != r6) goto L28
            X.17z r12 = r10.LJLILLLLZI
            X.0EV r4 = r10.LJLIL
            goto L57
        L22:
            X.1rl r10 = new X.1rl
            r10.<init>(r11, r13)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C141335gf.LIZJ(r1)
            X.PsI r1 = X.C65814PsI.LIZ()     // Catch: java.lang.Exception -> L6f
            java.lang.Class<com.bytedance.android.live.effect.karaoke.api.KaraokeApi> r0 = com.bytedance.android.live.effect.karaoke.api.KaraokeApi.class
            r1.getClass()     // Catch: java.lang.Exception -> L6f
            java.lang.Object r3 = X.C65814PsI.LIZJ(r0)     // Catch: java.lang.Exception -> L6f
            com.bytedance.android.live.effect.karaoke.api.KaraokeApi r3 = (com.bytedance.android.live.effect.karaoke.api.KaraokeApi) r3     // Catch: java.lang.Exception -> L6f
            long r4 = r12.LIZ     // Catch: java.lang.Exception -> L6f
            long r7 = r11.LIZIZ     // Catch: java.lang.Exception -> L6f
            java.lang.String r9 = r11.LIZJ     // Catch: java.lang.Exception -> L6f
            r10.LJLIL = r11     // Catch: java.lang.Exception -> L6f
            r10.LJLILLLLZI = r12     // Catch: java.lang.Exception -> L6f
            r10.LJLJJL = r6     // Catch: java.lang.Exception -> L6f
            java.lang.Object r1 = r3.requestSong(r4, r6, r7, r9, r10)     // Catch: java.lang.Exception -> L6f
            if (r1 != r2) goto L55
            return r2
        L55:
            r4 = r11
            goto L5a
        L57:
            X.C141335gf.LIZJ(r1)     // Catch: java.lang.Exception -> L6d
        L5a:
            X.BFf r1 = (X.C28467BFf) r1     // Catch: java.lang.Exception -> L6d
            long r0 = r12.LIZ     // Catch: java.lang.Exception -> L6d
            r4.getClass()     // Catch: java.lang.Exception -> L6d
            kotlin.jvm.internal.IDqS0S0010000 r3 = new kotlin.jvm.internal.IDqS0S0010000     // Catch: java.lang.Exception -> L6d
            r2 = 1
            r3.<init>(r6, r2)     // Catch: java.lang.Exception -> L6d
            r4.LJJIIJ(r0, r3)     // Catch: java.lang.Exception -> L6d
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L6d
            return r0
        L6d:
            r2 = move-exception
            goto L71
        L6f:
            r2 = move-exception
            r4 = r11
        L71:
            int r0 = r4.LIZ
            if (r0 != r6) goto L96
            r0 = 1
        L76:
            if (r0 != 0) goto L98
            boolean r0 = r2 instanceof X.C29401Dk
            if (r0 == 0) goto L98
            r0 = r2
            X.16r r0 = (X.C276516r) r0
            int r1 = r0.getErrorCode()
            r0 = 4033020(0x3d89fc, float:5.651465E-39)
            if (r1 != r0) goto L98
            long r2 = r12.LIZ
            kotlin.jvm.internal.IDqS0S0010000 r1 = new kotlin.jvm.internal.IDqS0S0010000
            r0 = 1
            r1.<init>(r6, r0)
            r4.LJJIIJ(r2, r1)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L96:
            r0 = 0
            goto L76
        L98:
            r4.LJJI(r2)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EV.LJIJJ(X.17z, X.2kd):java.lang.Object");
    }

    public final void LJJIII(long j, AnonymousClass010 value) {
        o.LJIIIZ(value, "value");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("update add status ");
        LIZ.append(j);
        LIZ.append(' ');
        LIZ.append(value);
        C0NB.LIZIZ("KaraokeViewModel", X1D.LIZIZ(LIZ));
        LJJIIJ(j, new IDqS416S0100000(value, 12));
    }

    public final void LJJIIJ(long j, InterfaceC88472Yns<? super C279917z, C279917z> interfaceC88472Yns) {
        Enumeration<Long> keys = this.LJ.keys();
        o.LJIIIIZZ(keys, "songListMap.keys()");
        ArrayList list = Collections.list(keys);
        o.LJIIIIZZ(list, "list(this)");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Long tabId = (Long) it.next();
            o.LJIIIIZZ(tabId, "tabId");
            LJ(tabId.longValue(), new C46361rs(j), interfaceC88472Yns);
        }
        for (String keyword : ORZ.LLJI(((LinkedHashMap) this.LJIIIIZZ.LJII()).keySet())) {
            o.LJIIIIZZ(keyword, "keyword");
            LIZJ(keyword, new C46371rt(j), interfaceC88472Yns);
        }
    }

    public static List LIZLLL(C0EY c0ey, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2) {
        Iterator<C279917z> it = c0ey.LIZJ.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C279917z next = it.next();
            if (((Boolean) interfaceC88472Yns.invoke(next)).booleanValue()) {
                if (next != null) {
                    AnonymousClass011 anonymousClass011 = (AnonymousClass011) interfaceC88472Yns2.invoke(next);
                    ArrayList arrayList = new ArrayList(c0ey.LIZJ.size());
                    for (C279917z c279917z : c0ey.LIZJ) {
                        if (c279917z.LIZ == anonymousClass011.LIZ) {
                            arrayList.add(anonymousClass011);
                        } else {
                            arrayList.add(c279917z);
                        }
                    }
                    return arrayList;
                }
            }
        }
        return c0ey.LIZJ;
    }

    public final synchronized void LIZJ(String str, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2) {
        C0EY LIZIZ = this.LJIIIIZZ.LIZIZ(str);
        if (LIZIZ == null) {
            return;
        }
        this.LJIIIIZZ.LIZJ(str, C0EX.LIZ(LIZIZ.LIZ, LIZIZ.LIZIZ, LIZLLL(LIZIZ, interfaceC88472Yns, interfaceC88472Yns2)));
    }

    public final synchronized void LJ(long j, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2) {
        C0EY c0ey = this.LJ.get(Long.valueOf(j));
        if (c0ey == null) {
            return;
        }
        List LIZLLL = LIZLLL(c0ey, interfaceC88472Yns, interfaceC88472Yns2);
        this.LJ.put(Long.valueOf(j), C0EX.LIZ(c0ey.LIZ, c0ey.LIZIZ, LIZLLL));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d A[Catch: Exception -> 0x00db, TryCatch #1 {Exception -> 0x00db, blocks: (B:11:0x0061, B:12:0x0064, B:14:0x006d, B:15:0x006f, B:17:0x0076, B:18:0x0078, B:20:0x007c, B:22:0x0080, B:23:0x008f, B:25:0x0095, B:27:0x00aa, B:36:0x00d5, B:44:0x00d8, B:45:0x00d9, B:46:0x00a8, B:29:0x00ab, B:34:0x00bf, B:35:0x00cb, B:42:0x00c7), top: B:10:0x0061, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0076 A[Catch: Exception -> 0x00db, TryCatch #1 {Exception -> 0x00db, blocks: (B:11:0x0061, B:12:0x0064, B:14:0x006d, B:15:0x006f, B:17:0x0076, B:18:0x0078, B:20:0x007c, B:22:0x0080, B:23:0x008f, B:25:0x0095, B:27:0x00aa, B:36:0x00d5, B:44:0x00d8, B:45:0x00d9, B:46:0x00a8, B:29:0x00ab, B:34:0x00bf, B:35:0x00cb, B:42:0x00c7), top: B:10:0x0061, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r0v19, types: [X.0EY] */
    /* JADX WARN: Type inference failed for: r4v3, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(long r15, int r17, X.InterfaceC67352kd<? super X.C0EY> r18) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EV.LJFF(long, int, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(7:5|6|7|(1:(1:(3:11|12|13)(2:19|20))(3:21|22|23))(3:24|25|(2:27|(1:29)(2:30|23))(2:31|(1:33)(2:34|13)))|14|15|16))|39|6|7|(0)(0)|14|15|16|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ab, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v9, types: [X.0EV] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILL(X.C279917z r19, X.C279917z r20, X.InterfaceC67352kd<? super java.lang.Boolean> r21) {
        /*
            r18 = this;
            r1 = r19
            r6 = r21
            boolean r0 = r6 instanceof X.C46261ri
            r3 = r18
            if (r0 == 0) goto L2b
            r0 = r6
            X.1ri r0 = (X.C46261ri) r0
            int r5 = r0.LJLJJL
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r5 & r4
            if (r2 == 0) goto L2b
            int r5 = r5 - r4
            r0.LJLJJL = r5
        L18:
            java.lang.Object r6 = r0.LJLJI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r5 = r0.LJLJJL
            r7 = 2
            r4 = 1
            if (r5 == 0) goto L3e
            if (r5 == r4) goto L39
            if (r5 != r7) goto L31
            X.17z r1 = r0.LJLILLLLZI
            X.0EV r5 = r0.LJLIL
            goto L93
        L2b:
            X.1ri r0 = new X.1ri
            r0.<init>(r3, r6)
            goto L18
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L39:
            X.17z r1 = r0.LJLILLLLZI
            X.0EV r5 = r0.LJLIL
            goto L99
        L3e:
            X.C141335gf.LIZJ(r6)
            r8 = r20
            if (r8 == 0) goto L6c
            X.PsI r6 = X.C65814PsI.LIZ()     // Catch: java.lang.Exception -> Lad
            java.lang.Class<com.bytedance.android.live.effect.karaoke.api.KaraokeApi> r5 = com.bytedance.android.live.effect.karaoke.api.KaraokeApi.class
            r6.getClass()     // Catch: java.lang.Exception -> Lad
            java.lang.Object r9 = X.C65814PsI.LIZJ(r5)     // Catch: java.lang.Exception -> Lad
            com.bytedance.android.live.effect.karaoke.api.KaraokeApi r9 = (com.bytedance.android.live.effect.karaoke.api.KaraokeApi) r9     // Catch: java.lang.Exception -> Lad
            long r10 = r3.LIZIZ     // Catch: java.lang.Exception -> Lad
            long r12 = r1.LIZ     // Catch: java.lang.Exception -> Lad
            r14 = 4
            long r15 = r8.LIZ     // Catch: java.lang.Exception -> Lad
            r0.LJLIL = r3     // Catch: java.lang.Exception -> Lad
            r0.LJLILLLLZI = r1     // Catch: java.lang.Exception -> Lad
            r0.LJLJJL = r4     // Catch: java.lang.Exception -> Lad
            r17 = r0
            java.lang.Object r6 = r9.updateQueueList(r10, r12, r14, r15, r17)     // Catch: java.lang.Exception -> Lad
            if (r6 != r2) goto L6a
            return r2
        L6a:
            r5 = r3
            goto L9c
        L6c:
            X.PsI r6 = X.C65814PsI.LIZ()     // Catch: java.lang.Exception -> Lad
            java.lang.Class<com.bytedance.android.live.effect.karaoke.api.KaraokeApi> r5 = com.bytedance.android.live.effect.karaoke.api.KaraokeApi.class
            r6.getClass()     // Catch: java.lang.Exception -> Lad
            java.lang.Object r8 = X.C65814PsI.LIZJ(r5)     // Catch: java.lang.Exception -> Lad
            com.bytedance.android.live.effect.karaoke.api.KaraokeApi r8 = (com.bytedance.android.live.effect.karaoke.api.KaraokeApi) r8     // Catch: java.lang.Exception -> Lad
            long r9 = r3.LIZIZ     // Catch: java.lang.Exception -> Lad
            long r11 = r1.LIZ     // Catch: java.lang.Exception -> Lad
            r13 = 4
            r14 = 0
            r0.LJLIL = r3     // Catch: java.lang.Exception -> Lad
            r0.LJLILLLLZI = r1     // Catch: java.lang.Exception -> Lad
            r0.LJLJJL = r7     // Catch: java.lang.Exception -> Lad
            r16 = r0
            java.lang.Object r6 = r8.updateQueueList(r9, r11, r13, r14, r16)     // Catch: java.lang.Exception -> Lad
            if (r6 != r2) goto L91
            return r2
        L91:
            r5 = r3
            goto L96
        L93:
            X.C141335gf.LIZJ(r6)     // Catch: java.lang.Exception -> Lab
        L96:
            X.BFf r6 = (X.C28467BFf) r6     // Catch: java.lang.Exception -> Lab
            goto L9e
        L99:
            X.C141335gf.LIZJ(r6)     // Catch: java.lang.Exception -> Lab
        L9c:
            X.BFf r6 = (X.C28467BFf) r6     // Catch: java.lang.Exception -> Lab
        L9e:
            r2 = -999(0xfffffffffffffc19, double:NaN)
            r5.LJIJ(r2, r1)     // Catch: java.lang.Exception -> Lab
            long r1 = r1.LIZ     // Catch: java.lang.Exception -> Lab
            X.010 r0 = X.AnonymousClass010.UN_ADD     // Catch: java.lang.Exception -> Lab
            r5.LJJIII(r1, r0)     // Catch: java.lang.Exception -> Lab
            goto Lb3
        Lab:
            r0 = move-exception
            goto Laf
        Lad:
            r0 = move-exception
            r5 = r3
        Laf:
            r5.LJJI(r0)
            r4 = 0
        Lb3:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EV.LJIILL(X.17z, X.17z, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063 A[Catch: Exception -> 0x00dd, TryCatch #0 {Exception -> 0x00dd, blocks: (B:11:0x005b, B:12:0x005e, B:14:0x0063, B:18:0x006c, B:20:0x0073, B:21:0x0075, B:23:0x007b, B:24:0x007d, B:26:0x0081, B:28:0x0085, B:29:0x0094, B:31:0x009a, B:33:0x00af, B:42:0x00d7, B:51:0x00da, B:52:0x00db, B:53:0x00ad, B:35:0x00b0, B:40:0x00c0, B:41:0x00d2, B:48:0x00c9), top: B:10:0x005b, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c A[Catch: Exception -> 0x00dd, TryCatch #0 {Exception -> 0x00dd, blocks: (B:11:0x005b, B:12:0x005e, B:14:0x0063, B:18:0x006c, B:20:0x0073, B:21:0x0075, B:23:0x007b, B:24:0x007d, B:26:0x0081, B:28:0x0085, B:29:0x0094, B:31:0x009a, B:33:0x00af, B:42:0x00d7, B:51:0x00da, B:52:0x00db, B:53:0x00ad, B:35:0x00b0, B:40:0x00c0, B:41:0x00d2, B:48:0x00c9), top: B:10:0x005b, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Type inference failed for: r0v17, types: [X.0EY] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.bytedance.android.live.effect.karaoke.api.KaraokeApi] */
    /* JADX WARN: Type inference failed for: r4v4, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJ(java.lang.String r12, int r13, X.InterfaceC67352kd<? super X.C0EY> r14) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EV.LJJ(java.lang.String, int, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIFFI(X.C279917z r9, boolean r10, X.InterfaceC67352kd<? super java.lang.Boolean> r11) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EV.LJJIFFI(X.17z, boolean, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:13)(2:10|11))(4:18|(1:20)(1:24)|21|(1:23))|14|15|16))|27|6|7|(0)(0)|14|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
    
        X.C0NB.LJII(r0);
        r2 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJII(int r12, X.InterfaceC67352kd r13, boolean r14) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof X.C46381ru
            if (r0 == 0) goto L1e
            r10 = r13
            X.1ru r10 = (X.C46381ru) r10
            int r2 = r10.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r10.LJLJI = r2
        L12:
            java.lang.Object r1 = r10.LJLIL
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r10.LJLJI
            r2 = 1
            if (r0 == 0) goto L30
            if (r0 != r2) goto L28
            goto L24
        L1e:
            X.1ru r10 = new X.1ru
            r10.<init>(r11, r13)
            goto L12
        L24:
            X.C141335gf.LIZJ(r1)     // Catch: java.lang.Exception -> L55
            goto L5a
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C141335gf.LIZJ(r1)
            if (r14 == 0) goto L37
            r8 = 1
            goto L38
        L37:
            r8 = 2
        L38:
            X.PsI r1 = X.C65814PsI.LIZ()     // Catch: java.lang.Exception -> L55
            java.lang.Class<com.bytedance.android.live.effect.karaoke.api.KaraokeApi> r0 = com.bytedance.android.live.effect.karaoke.api.KaraokeApi.class
            r1.getClass()     // Catch: java.lang.Exception -> L55
            java.lang.Object r4 = X.C65814PsI.LIZJ(r0)     // Catch: java.lang.Exception -> L55
            com.bytedance.android.live.effect.karaoke.api.KaraokeApi r4 = (com.bytedance.android.live.effect.karaoke.api.KaraokeApi) r4     // Catch: java.lang.Exception -> L55
            long r5 = r11.LIZIZ     // Catch: java.lang.Exception -> L55
            java.lang.String r9 = r11.LIZJ     // Catch: java.lang.Exception -> L55
            r10.LJLJI = r2     // Catch: java.lang.Exception -> L55
            r7 = r12
            java.lang.Object r0 = r4.updateKaraokeState(r5, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L55
            if (r0 != r3) goto L5a
            return r3
        L55:
            r0 = move-exception
            X.C0NB.LJII(r0)
            r2 = 0
        L5a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EV.LJJII(int, X.2kd, boolean):java.lang.Object");
    }

    public C0EV(int i, long j, DataChannel dataChannel, String hostId) {
        o.LJIIIZ(hostId, "hostId");
        o.LJIIIZ(dataChannel, "dataChannel");
        this.LIZ = i;
        this.LIZIZ = j;
        this.LIZJ = hostId;
        this.LIZLLL = dataChannel;
        this.LJ = new ConcurrentHashMap<>();
        this.LJFF = new CopyOnWriteArrayList();
        this.LJI = new C07500Re();
        this.LJII = C61878OQg.INSTANCE;
        this.LJIIIIZZ = new C0M6<>(20);
        this.LJIIIZ = -1L;
        this.LJIIJ = -1L;
        LJIL();
    }
}
