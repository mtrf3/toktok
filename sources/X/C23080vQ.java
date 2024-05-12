package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import kotlin.jvm.internal.o;

/* renamed from: X.0vQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23080vQ {
    public static final /* synthetic */ int LJ = 0;
    public volatile int LIZ;
    public final C23100vS LIZIZ;
    public final ConcurrentLinkedDeque<C23070vP> LIZJ;
    public final HashMap<Long, C23050vN> LIZLLL;

    public final List<OSZ<Long, Integer>> LIZJ() {
        Collection<C23050vN> values = this.LIZLLL.values();
        o.LJIIIIZZ(values, "listenerMap.values");
        ArrayList arrayList = new ArrayList(C32I.LJJL(values, 10));
        for (C23050vN c23050vN : values) {
            arrayList.add(new OSZ(Long.valueOf(c23050vN.LIZ), Integer.valueOf(Math.min(100, (c23050vN.LIZJ * 100) / c23050vN.LIZLLL))));
        }
        return arrayList;
    }

    public C23080vQ() {
        List<String> LIZJ = InterfaceC30442Bx8.z3.LIZJ();
        o.LJIIIIZZ(LIZJ, "KARAOKE_LOCAL_CACHE.value");
        C23100vS c23100vS = new C23100vS(LIZJ);
        c23100vS.registerOnEvictionListener(C529225w.LJLIL);
        this.LIZIZ = c23100vS;
        this.LIZJ = new ConcurrentLinkedDeque<>();
        this.LIZLLL = new HashMap<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.InterfaceC67352kd<? super X.OSZ<X.C279917z, ? extends X.EnumC23060vO>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C529325x
            if (r0 == 0) goto L68
            r4 = r7
            X.25x r4 = (X.C529325x) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L68
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r1 = r4.LJLILLLLZI
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJI
            r3 = 1
            if (r0 == 0) goto L28
            if (r0 != r3) goto L6e
            X.17z r2 = r4.LJLIL
            X.C141335gf.LIZJ(r1)
        L22:
            X.OSZ r3 = new X.OSZ
            r3.<init>(r2, r1)
        L27:
            return r3
        L28:
            X.C141335gf.LIZJ(r1)
            int r0 = r6.LIZ
            if (r0 >= 0) goto L32
            r0 = 0
            r6.LIZ = r0
        L32:
            int r2 = r6.LIZ
            com.bytedance.android.livesdk.livesetting.broadcast.LiveKaraokeMaxDownloadCount r0 = com.bytedance.android.livesdk.livesetting.broadcast.LiveKaraokeMaxDownloadCount.INSTANCE
            int r0 = r0.maxCount()
            r1 = 0
            if (r2 >= r0) goto L60
            java.util.concurrent.ConcurrentLinkedDeque<X.0vP> r0 = r6.LIZJ
            java.lang.Object r0 = r0.pollFirst()
            X.0vP r0 = (X.C23070vP) r0
            if (r0 == 0) goto L58
            X.17z r2 = r0.LIZ
            boolean r1 = r0.LIZJ
            X.Ynr<java.lang.Long, java.lang.Integer, X.UCe> r0 = r0.LIZIZ
            r4.LJLIL = r2
            r4.LJLJJI = r3
            java.lang.Object r1 = r6.LIZIZ(r2, r1, r0, r4)
            if (r1 != r5) goto L22
            return r5
        L58:
            X.0vO r0 = X.EnumC23060vO.FAIL
            X.OSZ r3 = new X.OSZ
            r3.<init>(r1, r0)
            goto L27
        L60:
            X.0vO r0 = X.EnumC23060vO.FAIL
            X.OSZ r3 = new X.OSZ
            r3.<init>(r1, r0)
            goto L27
        L68:
            X.25x r4 = new X.25x
            r4.<init>(r6, r7)
            goto L12
        L6e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23080vQ.LIZLLL(X.2kd):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    public final synchronized void LIZ(C279917z songInfo, boolean z) {
        ?? arrayList;
        o.LJIIIZ(songInfo, "songInfo");
        if (!z) {
            List LJJIJIIJI = C47261Igj.LJJIJIIJI(songInfo.LIZIZ, songInfo.LJIIIIZZ, songInfo.LJIIIZ);
            arrayList = new ArrayList(C32I.LJJL(LJJIJIIJI, 10));
            Iterator it = LJJIJIIJI.iterator();
            while (it.hasNext()) {
                arrayList.add(((AnonymousClass013) it.next()).LIZ);
            }
        } else {
            arrayList = C47261Igj.LJJIJIIJI("", "", songInfo.LJIIIZ.LIZ);
        }
        this.LIZIZ.put(Long.valueOf(songInfo.LIZ), arrayList);
    }

    public final Object LIZIZ(C279917z c279917z, boolean z, InterfaceC88471Ynr<? super Long, ? super Integer, C76800UCe> interfaceC88471Ynr, InterfaceC67352kd<? super EnumC23060vO> interfaceC67352kd) {
        return XKX.LJI(C78613UtF.LIZJ, new C2G2(this, c279917z, interfaceC88471Ynr, z, null), interfaceC67352kd);
    }
}
