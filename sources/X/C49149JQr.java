package X;

import Y.ARunnableS44S0100000_8;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.JQr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49149JQr implements JSL {
    public boolean LIZ;
    public RecyclerView LIZIZ;
    public InterfaceC49148JQq LIZJ;

    @Override // X.JSL
    public final void LIZJ() {
    }

    @Override // X.JSL
    public final void LIZLLL(JU3 ju3) {
    }

    @Override // X.JSL
    public final void LJ() {
        this.LIZ = true;
        InterfaceC49148JQq interfaceC49148JQq = this.LIZJ;
        if (interfaceC49148JQq != null) {
            interfaceC49148JQq.y(150L);
        } else {
            LJII(0, null);
        }
    }

    @Override // X.JSL
    public final void LJFF() {
    }

    @Override // X.JSL
    public final void LJI() {
        C49133JQb.LIZ("SCA", new Object[0]);
        this.LIZ = false;
        InterfaceC49148JQq interfaceC49148JQq = this.LIZJ;
        if (interfaceC49148JQq != null) {
            interfaceC49148JQq.LLLLLIL();
        }
    }

    @Override // X.JSL
    public final Boolean isActive() {
        return Boolean.valueOf(this.LIZ);
    }

    @Override // X.JSL
    public final void LIZIZ(int i, InterfaceC49186JSc interfaceC49186JSc) {
        LJII(0, interfaceC49186JSc);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0028 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(int r7, X.InterfaceC49186JSc r8) {
        /*
            r6 = this;
            androidx.recyclerview.widget.RecyclerView r5 = r6.LIZIZ
            r1 = 0
            if (r5 == 0) goto L54
            X.0A2 r1 = r5.getLayoutManager()
            boolean r0 = r1 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r0 == 0) goto L20
            androidx.recyclerview.widget.LinearLayoutManager r1 = (androidx.recyclerview.widget.LinearLayoutManager) r1
            r0 = -1
            if (r1 == 0) goto L20
            int r4 = r1.LLILL()
            int r3 = r1.LLILLJJLI()
            if (r4 == r0) goto L20
            if (r3 == r0) goto L20
            if (r3 >= r4) goto L29
        L20:
            X.OQg r2 = X.C61878OQg.INSTANCE
        L22:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L43
            return
        L29:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            if (r4 > r3) goto L22
        L30:
            androidx.recyclerview.widget.RecyclerView$ViewHolder r1 = r5.LJJIZ(r4)
            boolean r0 = r1 instanceof X.InterfaceC49148JQq
            if (r0 != 0) goto L3d
        L38:
            if (r4 == r3) goto L22
            int r4 = r4 + 1
            goto L30
        L3d:
            if (r1 == 0) goto L38
            r2.add(r1)
            goto L38
        L43:
            r0 = 0
            java.lang.Object r2 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r2, r0)
            X.JQq r2 = (X.InterfaceC49148JQq) r2
            r6.LIZJ = r2
            if (r2 == 0) goto L53
            r0 = 150(0x96, double:7.4E-322)
            r2.y(r0)
        L53:
            return
        L54:
            java.lang.String r0 = "listView"
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49149JQr.LJII(int, X.JSc):void");
    }

    @Override // X.JSL
    public final void LJIJJLI(Aweme aweme, C49196JSm c49196JSm) {
        o.LJIIIZ(aweme, "aweme");
        LJII(0, c49196JSm);
    }

    @Override // X.JSL
    public final void LIZ(RecyclerView listView, InterfaceC49154JQw interfaceC49154JQw, int i, boolean z) {
        o.LJIIIZ(listView, "listView");
        this.LIZIZ = listView;
        listView.post(new ARunnableS44S0100000_8(this, 207));
    }
}
