package X;

import X.InterfaceC71482rI;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.2rp */
/* loaded from: classes2.dex */
public abstract class AbstractC71812rp<DATA, RESP extends BaseResponse, KEY, OBSERVER extends InterfaceC71482rI> {
    public final ConcurrentHashMap<KEY, DATA> LIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<KEY, EnumC71872rv> LIZIZ = new ConcurrentHashMap<>();
    public C64962gm LIZJ = C48841JEv.LIZ(C78613UtF.LIZJ);
    public final CopyOnWriteArrayList<OBSERVER> LIZLLL = new CopyOnWriteArrayList<>();
    public int LJ;
    public long LJFF;
    public boolean LJI;

    public abstract KEY LJ();

    public abstract List<KEY> LJFF();

    public abstract InterfaceC71482rI LJI(List list, C84654XKg c84654XKg);

    public abstract Object LJII(RESP resp, InterfaceC67352kd<? super List<? extends OSZ<? extends KEY, ? extends DATA>>> interfaceC67352kd);

    public abstract String LJIIIIZZ();

    public abstract String LJIIIZ(List<? extends KEY> list);

    public abstract void LJIILJJIL(List<? extends KEY> list, OBSERVER observer);

    public void LJIILL() {
    }

    public abstract Object LJIILLIIL(List<? extends KEY> list, InterfaceC67352kd<? super RESP> interfaceC67352kd);

    public abstract Object LJIIZILJ(Object obj);

    public abstract void LJIJJ(KEY key, DATA data);

    public abstract void LJIJJLI(KEY key, DATA data);

    public abstract void LJIL(List<? extends KEY> list);

    public AbstractC71812rp() {
        HG3.LJIIL();
        HG3.LJLJL.LJIILJJIL(new LEA(this) { // from class: X.2rd
            public final /* synthetic */ AbstractC71812rp<DATA, RESP, KEY, OBSERVER> LJLIL;

            {
                this.LJLIL = this;
            }

            @Override // X.LEA
            public final void onAccountResult(int i, boolean z, int i2, User user) {
                if (z) {
                    if (i != 2 && i != 3) {
                        return;
                    }
                    AbstractC71812rp<DATA, RESP, KEY, OBSERVER> abstractC71812rp = this.LJLIL;
                    C48841JEv.LIZJ(abstractC71812rp.LIZJ, null);
                    abstractC71812rp.LIZJ = C48841JEv.LIZ(C78613UtF.LIZJ);
                    abstractC71812rp.LIZIZ.clear();
                    abstractC71812rp.LIZ.clear();
                    abstractC71812rp.LJ = 0;
                    abstractC71812rp.LJFF = 0L;
                    abstractC71812rp.LJI = false;
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C71882rw LJIILIIL(AbstractC71812rp abstractC71812rp) {
        return abstractC71812rp.LJIIL(abstractC71812rp.LJ());
    }

    public final void LIZ(OBSERVER observer) {
        o.LJIIIZ(observer, "observer");
        this.LIZLLL.add(observer);
    }

    public final C71882rw<DATA> LJIIL(KEY key) {
        o.LJIIIZ(key, "key");
        return new C71882rw<>(this.LIZ.get(key), this.LIZIZ.get(key));
    }

    public final void LJIJ(OBSERVER observer) {
        o.LJIIIZ(observer, "observer");
        this.LIZLLL.remove(observer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(KEY r6, X.InterfaceC67352kd<? super java.lang.Boolean> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C71832rr
            if (r0 == 0) goto L3e
            r4 = r7
            X.2rr r4 = (X.C71832rr) r4
            int r2 = r4.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3e
            int r2 = r2 - r1
            r4.LJLJJL = r2
        L12:
            java.lang.Object r3 = r4.LJLJI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r4.LJLJJL
            r0 = 1
            if (r1 == 0) goto L2c
            if (r1 != r0) goto L47
            java.lang.Object r6 = r4.LJLILLLLZI
            X.2rp r0 = r4.LJLIL
            X.C141335gf.LIZJ(r3)
        L24:
            if (r3 == 0) goto L44
            r0.LJIJJLI(r6, r3)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L2c:
            X.C141335gf.LIZJ(r3)
            r4.LJLIL = r5
            r4.LJLILLLLZI = r6
            r4.LJLJJL = r0
            java.lang.Object r3 = r5.LJIIZILJ(r6)
            if (r3 != r2) goto L3c
            return r2
        L3c:
            r0 = r5
            goto L24
        L3e:
            X.2rr r4 = new X.2rr
            r4.<init>(r5, r7)
            goto L12
        L44:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L47:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC71812rp.LIZJ(java.lang.Object, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.util.List<? extends KEY> r10, X.InterfaceC67352kd<? super java.lang.Boolean> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C71842rs
            if (r0 == 0) goto L61
            r8 = r11
            X.2rs r8 = (X.C71842rs) r8
            int r2 = r8.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L61
            int r2 = r2 - r1
            r8.LJLJJI = r2
        L12:
            java.lang.Object r7 = r8.LJLILLLLZI
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r8.LJLJJI
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L28
            if (r0 == r4) goto L3e
            if (r0 != r5) goto L67
            X.C141335gf.LIZJ(r7)
        L23:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        L28:
            X.C141335gf.LIZJ(r7)
            int r0 = r9.LJ
            int r0 = r0 + 1
            r9.LJ = r0
            r8.LJLIL = r9
            r8.LJLJJI = r4
            java.lang.Object r7 = r9.LJIILLIIL(r10, r8)
            if (r7 != r6) goto L3c
            return r6
        L3c:
            r3 = r9
            goto L43
        L3e:
            X.2rp r3 = r8.LJLIL
            X.C141335gf.LIZJ(r7)
        L43:
            com.ss.android.ugc.aweme.base.api.BaseResponse r7 = (com.ss.android.ugc.aweme.base.api.BaseResponse) r7
            if (r7 == 0) goto L6f
            int r0 = r7.status_code
            if (r0 != 0) goto L5f
        L4c:
            X.UtN r2 = X.C36636EZk.LIZ
            X.2rl r1 = new X.2rl
            r0 = 0
            r1.<init>(r3, r7, r0)
            r8.LJLIL = r0
            r8.LJLJJI = r5
            java.lang.Object r0 = X.XKX.LJI(r2, r1, r8)
            if (r0 != r6) goto L23
            return r6
        L5f:
            r4 = 0
            goto L23
        L61:
            X.2rs r8 = new X.2rs
            r8.<init>(r9, r11)
            goto L12
        L67:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L6f:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC71812rp.LIZLLL(java.util.List, X.2kd):java.lang.Object");
    }

    public final void LJIIJ(List<? extends KEY> keys, boolean z) {
        o.LJIIIZ(keys, "keys");
        if (C4LS.LIZ()) {
            return;
        }
        XKX.LIZLLL(this.LIZJ, null, null, new C71802ro(z, keys, this, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Type inference failed for: r13v0, types: [X.2rp, X.2rp<DATA, RESP extends com.ss.android.ugc.aweme.base.api.BaseResponse, KEY, OBSERVER extends X.2rI>] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIJI(java.util.List<? extends KEY> r14, X.InterfaceC67352kd<? super java.util.HashMap<KEY, DATA>> r15) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC71812rp.LJIJI(java.util.List, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void LJIIJJI(AbstractC71812rp abstractC71812rp, List list, boolean z, int i) {
        if ((i & 1) != 0) {
            list = abstractC71812rp.LJFF();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        abstractC71812rp.LJIIJ(list, z);
    }

    public final void LIZIZ(List<? extends KEY> list, List<? extends KEY> list2, List<? extends KEY> list3, List<? extends KEY> list4) {
        if (!list.isEmpty()) {
            C35U.LIZJ(LJIIIIZZ(), "cache_miss", LJIIIZ(list));
        }
        if (!list2.isEmpty()) {
            C35U.LIZJ(LJIIIIZZ(), "file_cache_hit", LJIIIZ(list2));
        }
        if (!((ArrayList) list3).isEmpty()) {
            C35U.LIZJ(LJIIIIZZ(), "memory_cache_hit", LJIIIZ(list3));
        }
        if (!((ArrayList) list4).isEmpty()) {
            C35U.LIZJ(LJIIIIZZ(), "cache_miss", LJIIIZ(list4));
        }
    }
}
