package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.3We, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85243We {
    public static final PThreadPoolExecutor LIZ;
    public static final C62822Ol8 LIZIZ;
    public static final C62822Ol8 LIZJ;
    public static final ConcurrentHashMap<String, CopyOnWriteArrayList<C3VZ>> LIZLLL;
    public static final java.util.Map<String, C3VZ> LJ;

    static {
        int max = Math.max(6, Runtime.getRuntime().availableProcessors());
        LIZ = new PThreadPoolExecutor(max, max, 30L, TimeUnit.SECONDS, new PriorityBlockingQueue(), new DefaultThreadFactory("ediaPreloader"));
        LIZIZ = C221108m2.LIZIZ(C85883Yq.LJLIL);
        LIZJ = C221108m2.LIZIZ(C85893Yr.LJLIL);
        LIZLLL = new ConcurrentHashMap<>();
        LJ = new ConcurrentHashMap();
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.3VO] */
    public static boolean LIZIZ(int i, final C3VZ c3vz) {
        C109544Rq c109544Rq = c3vz.LJLIL.get();
        if (c109544Rq == null) {
            return false;
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LJ;
        if (concurrentHashMap.get(c109544Rq.getUuid()) == null) {
            String uuid = c109544Rq.getUuid();
            o.LJIIIIZZ(uuid, "message.uuid");
            concurrentHashMap.put(uuid, c3vz);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("tryDownloadImage add to preloadJobs: ");
            LIZ2.append(c109544Rq.getUuid());
            C34B.LIZIZ("MediaPreloader", X1D.LIZIZ(LIZ2));
            LIZ.execute(new RunnableC85263Wg(c3vz, i, new InterfaceC85303Wk() { // from class: X.3VO
                @Override // X.InterfaceC85303Wk
                public final void LIZ(C3VP model) {
                    o.LJIIIZ(model, "model");
                    model.LJLILLLLZI = 2;
                    C3VZ c3vz2 = C3VZ.this;
                    C109544Rq c109544Rq2 = c3vz2.LJLIL.get();
                    if (c109544Rq2 == null) {
                        return;
                    }
                    List<C3VP> list = c3vz2.LJLILLLLZI;
                    ArrayList arrayList = new ArrayList();
                    for (C3VP c3vp : list) {
                        if (c3vp.LJLILLLLZI != 2) {
                            arrayList.add(c3vp);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        return;
                    }
                    ((ConcurrentHashMap) C85243We.LJ).remove(c109544Rq2.getUuid());
                    CopyOnWriteArrayList<C3VZ> copyOnWriteArrayList = C85243We.LIZLLL.get(c109544Rq2.getConversationId());
                    if (copyOnWriteArrayList != null) {
                        copyOnWriteArrayList.remove(c3vz2);
                    }
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("removeAndCheck preloadJobs remove: ");
                    LIZ3.append(c109544Rq2.getUuid());
                    C34B.LIZIZ("MediaPreloader", X1D.LIZIZ(LIZ3));
                }
            }));
            return true;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("tryDownloadImage ");
        LIZ3.append(c109544Rq.getUuid());
        LIZ3.append(" job exists");
        C34B.LIZIZ("MediaPreloader", X1D.LIZIZ(LIZ3));
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00bb A[LOOP:1: B:29:0x00b5->B:31:0x00bb, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(androidx.recyclerview.widget.RecyclerView r7, int r8, X.AbstractC1038245q r9) {
        /*
            java.lang.String r0 = "recyclerView"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            java.lang.String r0 = "adapter"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            if (r8 != 0) goto Ld7
            X.0A2 r0 = r7.getLayoutManager()
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            if (r0 == 0) goto L1a
            int r1 = r0.LLILLJJLI()
            if (r1 >= 0) goto L1b
        L1a:
            return
        L1b:
            java.util.List r9 = r9.getCurrentList()
            java.lang.String r0 = "adapter.currentList"
            kotlin.jvm.internal.o.LJIIIIZZ(r9, r0)
            int r0 = r9.size()
            if (r0 > 0) goto L2b
            return
        L2b:
            int r8 = r1 + 1
            X.Ol8 r0 = X.C85243We.LIZIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r7 = r0.intValue()
            int r7 = r7 + r8
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "onRecyclerViewScrollStateChanged from: "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = ", to: "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "MediaPreloader"
            X.C34B.LIZIZ(r0, r1)
        L57:
            if (r8 >= r7) goto Ld7
            if (r8 < 0) goto Ld4
            int r0 = r9.size()
            if (r8 >= r0) goto Ld4
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r9, r8)
            com.ss.android.ugc.aweme.im.sdk.chat.data.model.IMMessage r0 = (com.ss.android.ugc.aweme.im.sdk.chat.data.model.IMMessage) r0
            X.4Rq r2 = r0.getMessage()
            X.4Tx r0 = X.EnumC110124Tw.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent r3 = X.C110134Tx.LIZJ(r2)
            boolean r0 = r3 instanceof com.ss.android.ugc.aweme.im.sdk.chat.data.model.GifContent
            r6 = 0
            if (r0 == 0) goto Lca
            r1 = r3
            com.ss.android.ugc.aweme.im.sdk.chat.data.model.GifContent r1 = (com.ss.android.ugc.aweme.im.sdk.chat.data.model.GifContent) r1
            java.lang.String r0 = r1.getImageType()
            boolean r0 = X.C60903NvH.LJIJI(r0)
            if (r0 != 0) goto L90
            java.lang.String r0 = r1.getImageType()
            boolean r0 = X.C60903NvH.LJIJJLI(r0)
            if (r0 == 0) goto Lca
        L90:
            r5 = 1
        L91:
            if (r3 == 0) goto Ld4
            java.util.List r1 = r3.fetchPreload()
            if (r1 == 0) goto Ld4
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto Ld4
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r2)
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C32I.LJJL(r1, r0)
            r3.<init>(r0)
            java.util.Iterator r2 = r1.iterator()
        Lb5:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lcc
            java.lang.Object r1 = r2.next()
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = (com.ss.android.ugc.aweme.base.model.UrlModel) r1
            X.3VP r0 = new X.3VP
            r0.<init>(r1)
            r3.add(r0)
            goto Lb5
        Lca:
            r5 = 0
            goto L91
        Lcc:
            X.3VZ r0 = new X.3VZ
            r0.<init>(r4, r3, r5)
            LIZIZ(r6, r0)
        Ld4:
            int r8 = r8 + 1
            goto L57
        Ld7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C85243We.LIZ(androidx.recyclerview.widget.RecyclerView, int, X.45q):void");
    }
}
