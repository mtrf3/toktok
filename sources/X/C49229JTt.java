package X;

import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.JTt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49229JTt implements InterfaceC49224JTo, InterfaceC49220JTk {
    public final RecyclerView LJLIL;
    public final /* synthetic */ JU8 LJLILLLLZI = new JU8();
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(C49230JTu.LJLIL);
    public JQX LJLJJI;

    @Override // X.InterfaceC49220JTk
    public final MutableLiveData<Integer> LIZ() {
        return (MutableLiveData) this.LJLJI.getValue();
    }

    @Override // X.InterfaceC49224JTo
    public final void LLLLLILLIL() {
        this.LJLILLLLZI.LJLIL = null;
    }

    @Override // X.InterfaceC49220JTk
    public final boolean isEnable() {
        return C49221JTl.LIZ(this);
    }

    public C49229JTt(RecyclerView recyclerView) {
        this.LJLIL = recyclerView;
    }

    @Override // X.InterfaceC49224JTo
    public final void LLIIJI(JU3 eventDispatcher) {
        o.LJIIIZ(eventDispatcher, "eventDispatcher");
        JU8 ju8 = this.LJLILLLLZI;
        ju8.getClass();
        ju8.LJLIL = eventDispatcher;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List, java.util.Collection, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(java.lang.String r8, boolean r9) {
        /*
            r7 = this;
            X.JU8 r0 = r7.LJLILLLLZI
            r0.LIZ()
            androidx.recyclerview.widget.RecyclerView r6 = r7.LJLIL
            r5 = 0
            if (r6 == 0) goto Lb7
            X.0A2 r1 = r6.getLayoutManager()
        Le:
            boolean r0 = r1 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r0 == 0) goto L25
            androidx.recyclerview.widget.LinearLayoutManager r1 = (androidx.recyclerview.widget.LinearLayoutManager) r1
            r0 = -1
            if (r1 == 0) goto L25
            int r3 = r1.LLILL()
            int r2 = r1.LLILLJJLI()
            if (r3 == r0) goto L25
            if (r2 == r0) goto L25
            if (r2 >= r3) goto L99
        L25:
            X.OQg r4 = X.C61878OQg.INSTANCE
        L27:
            java.util.Iterator r1 = r4.iterator()
        L2b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L97
            java.lang.Object r2 = r1.next()
            r0 = r2
            X.JQX r0 = (X.JQX) r0
            X.JP7 r0 = r0.LLLLIIL()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getCurrentAweme()
            if (r0 == 0) goto L95
            java.lang.String r0 = r0.getAid()
        L46:
            boolean r0 = kotlin.jvm.internal.o.LJ(r8, r0)
            if (r0 == 0) goto L2b
        L4c:
            X.JQX r2 = (X.JQX) r2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "real find by aid is "
            r1.<init>(r0)
            r1.append(r2)
            r3 = 1
            if (r2 != 0) goto L89
            boolean r0 = r4.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L6e
            if (r9 == 0) goto L6e
            r0 = 0
            java.lang.Object r2 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r4, r0)
            X.JQX r2 = (X.JQX) r2
            if (r2 != 0) goto L89
        L6e:
            r7.LJLJJI = r5
            X.Ol8 r0 = r7.LJLJI
            java.lang.Object r1 = r0.getValue()
            androidx.lifecycle.LiveData r1 = (androidx.lifecycle.LiveData) r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.setValue(r0)
            X.JQX r1 = r7.LJLJJI
            if (r1 == 0) goto L88
            X.JU8 r0 = r7.LJLILLLLZI
            r0.LIZJ(r1)
        L88:
            return
        L89:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "final to find is "
            r1.<init>(r0)
            r1.append(r2)
            r5 = r2
            goto L6e
        L95:
            r0 = r5
            goto L46
        L97:
            r2 = r5
            goto L4c
        L99:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            if (r3 > r2) goto L27
        La0:
            if (r6 == 0) goto Lb5
            androidx.recyclerview.widget.RecyclerView$ViewHolder r1 = r6.LJJIZ(r3)
        La6:
            boolean r0 = r1 instanceof X.JQX
            if (r0 != 0) goto Laf
        Laa:
            if (r3 == r2) goto L27
            int r3 = r3 + 1
            goto La0
        Laf:
            if (r1 == 0) goto Laa
            r4.add(r1)
            goto Laa
        Lb5:
            r1 = r5
            goto La6
        Lb7:
            r1 = r5
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49229JTt.LIZIZ(java.lang.String, boolean):void");
    }
}
