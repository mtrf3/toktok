package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.relation.ffp.ui.AnimationAuthFragment;
import com.ss.android.ugc.aweme.relation.ffp.ui.NeedAuthFragment;
import com.ss.android.ugc.aweme.relation.ffp.ui.RecEmptyFragment;
import com.ss.android.ugc.aweme.relation.ffp.ui.RecFriendsFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class P29 {
    public final P2A LIZ;
    public final P2A LIZIZ;
    public P2A LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public Boolean LJFF;
    public Boolean LJI;
    public String LJII;
    public String LJIIIIZZ;

    public static String LIZJ(boolean z) {
        return z ? "1" : CardStruct.IStatusCode.DEFAULT;
    }

    public final C58073Mqj LIZ() {
        if (o.LJ(this.LIZJ, this.LIZ)) {
            return this.LIZ.LIZIZ;
        }
        C58073Mqj c58073Mqj = this.LIZ.LIZIZ;
        if (c58073Mqj.LJLJI != EnumC58072Mqi.NONE) {
            return c58073Mqj;
        }
        return this.LIZIZ.LIZIZ;
    }

    public final C58073Mqj LIZIZ() {
        if (o.LJ(this.LIZJ, this.LIZ)) {
            return this.LIZ.LIZJ;
        }
        C58073Mqj c58073Mqj = this.LIZ.LIZJ;
        if (c58073Mqj.LJLJI != EnumC58072Mqi.NONE) {
            return c58073Mqj;
        }
        return this.LIZIZ.LIZJ;
    }

    public P29() {
        P2A p2a = new P2A("[ffp]_Monitor_first_enter");
        this.LIZ = p2a;
        this.LIZIZ = new P2A("[ffp]_Monitor_byAuth");
        this.LIZJ = p2a;
        this.LIZLLL = EnumC58046MqI.CONTACT.isGrant();
        this.LJ = EnumC58046MqI.FACEBOOK.isGrant();
        this.LJII = "";
        this.LJIIIIZZ = "";
    }

    public final void LJFF(InterfaceC65350Pko<? extends Fragment> cur) {
        String str;
        o.LJIIIZ(cur, "cur");
        this.LJII = this.LJIIIIZZ;
        if (o.LJ(cur, C65352Pkq.LIZ(AnimationAuthFragment.class))) {
            str = "animation";
        } else if (o.LJ(cur, C65352Pkq.LIZ(NeedAuthFragment.class))) {
            str = "noPermission";
        } else if (o.LJ(cur, C65352Pkq.LIZ(RecEmptyFragment.class))) {
            str = "empty";
        } else if (o.LJ(cur, C65352Pkq.LIZ(RecFriendsFragment.class))) {
            str = "loading";
        } else {
            str = "";
        }
        this.LJIIIIZZ = str;
        if (o.LJ(cur, C65352Pkq.LIZ(NeedAuthFragment.class))) {
            if (o.LJ(this.LIZJ, this.LIZ)) {
                P2A p2a = this.LIZJ;
                if (p2a != null) {
                    p2a.LIZ();
                }
                this.LIZJ = this.LIZIZ;
                return;
            }
            if (!o.LJ(this.LIZJ, this.LIZIZ)) {
                return;
            }
            P2A p2a2 = this.LIZJ;
            if (p2a2 != null) {
                p2a2.LIZ();
            }
            this.LIZJ = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0023 A[PHI: r4
      0x0023: PHI (r4v4 java.lang.Object) = (r4v2 java.lang.Object), (r4v0 java.lang.Object) binds: [B:18:0x0046, B:10:0x0020] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Type inference failed for: r7v3, types: [X.Yns] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.P22 r7, X.InterfaceC67352kd r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.P2H
            if (r0 == 0) goto L49
            r5 = r8
            X.P2H r5 = (X.P2H) r5
            int r2 = r5.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L49
            int r2 = r2 - r1
            r5.LJLJJI = r2
        L12:
            java.lang.Object r4 = r5.LJLILLLLZI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJI
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L24
            if (r0 == r1) goto L36
            if (r0 != r2) goto L4f
            X.C141335gf.LIZJ(r4)
        L23:
            return r4
        L24:
            X.C141335gf.LIZJ(r4)
            X.P2A r0 = r6.LIZJ
            if (r0 == 0) goto L3d
            r5.LJLIL = r7
            r5.LJLJJI = r1
            java.lang.Object r4 = r0.LIZIZ(r7, r5)
            if (r4 != r3) goto L3b
            return r3
        L36:
            X.Yns r7 = r5.LJLIL
            X.C141335gf.LIZJ(r4)
        L3b:
            if (r4 != 0) goto L57
        L3d:
            r0 = 0
            r5.LJLIL = r0
            r5.LJLJJI = r2
            java.lang.Object r4 = r7.invoke(r5)
            if (r4 != r3) goto L23
            return r3
        L49:
            X.P2H r5 = new X.P2H
            r5.<init>(r6, r8)
            goto L12
        L4f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L57:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P29.LIZLLL(X.P22, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0023 A[PHI: r4
      0x0023: PHI (r4v4 java.lang.Object) = (r4v2 java.lang.Object), (r4v0 java.lang.Object) binds: [B:18:0x0046, B:10:0x0020] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Type inference failed for: r7v3, types: [X.Yns] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.P24 r7, X.InterfaceC67352kd r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.P2I
            if (r0 == 0) goto L49
            r5 = r8
            X.P2I r5 = (X.P2I) r5
            int r2 = r5.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L49
            int r2 = r2 - r1
            r5.LJLJJI = r2
        L12:
            java.lang.Object r4 = r5.LJLILLLLZI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJI
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L24
            if (r0 == r1) goto L36
            if (r0 != r2) goto L4f
            X.C141335gf.LIZJ(r4)
        L23:
            return r4
        L24:
            X.C141335gf.LIZJ(r4)
            X.P2A r0 = r6.LIZJ
            if (r0 == 0) goto L3d
            r5.LJLIL = r7
            r5.LJLJJI = r1
            java.lang.Object r4 = r0.LIZJ(r7, r5)
            if (r4 != r3) goto L3b
            return r3
        L36:
            X.Yns r7 = r5.LJLIL
            X.C141335gf.LIZJ(r4)
        L3b:
            if (r4 != 0) goto L57
        L3d:
            r0 = 0
            r5.LJLIL = r0
            r5.LJLJJI = r2
            java.lang.Object r4 = r7.invoke(r5)
            if (r4 != r3) goto L23
            return r3
        L49:
            X.P2I r5 = new X.P2I
            r5.<init>(r6, r8)
            goto L12
        L4f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L57:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P29.LJ(X.P24, X.2kd):java.lang.Object");
    }
}
