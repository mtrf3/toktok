package X;

import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.List;

/* renamed from: X.3Ql, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C83753Ql extends AbstractC113374cf<IMUser, IMContact> {
    public static final /* synthetic */ int LJIIL = 0;
    public InterfaceC65784Pro<? extends List<String>> LJII;
    public String LJIIIIZZ;
    public boolean LJIIIZ;
    public int LJIIJ;
    public final C83743Qk LJIIJJI = C83743Qk.LJLIL;

    @Override // X.AbstractC113374cf
    public final InterfaceC88472Yns<IMUser, IMContact> LJ() {
        return this.LJIIJJI;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    @Override // X.AbstractC113374cf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(X.InterfaceC67352kd<? super java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser>> r13) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C83753Ql.LJI(X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.AbstractC113374cf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(X.InterfaceC67352kd<? super java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser>> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof X.C83773Qn
            if (r0 == 0) goto Lba
            r9 = r11
            X.3Qn r9 = (X.C83773Qn) r9
            int r2 = r9.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lba
            int r2 = r2 - r1
            r9.LJLJJL = r2
        L12:
            java.lang.Object r4 = r9.LJLJI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r9.LJLJJL
            r2 = 1
            if (r0 == 0) goto L7e
            if (r0 != r2) goto Lc6
            int r6 = r9.LJLILLLLZI
            X.3Ql r2 = r9.LJLIL
            X.C141335gf.LIZJ(r4)
        L24:
            java.util.List r4 = (java.util.List) r4
            if (r4 != 0) goto L2d
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L2d:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "loadMoreInternal: "
            r1.append(r0)
            int r0 = r4.size()
            r1.append(r0)
            java.lang.String r0 = " pageIndex:"
            r1.append(r0)
            int r0 = r2.LJIIJ
            r1.append(r0)
            java.lang.String r0 = " pageSize:"
            r1.append(r0)
            r1.append(r6)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "FollowLoader"
            X.C34B.LJI(r0, r1)
            int r0 = r2.LJIIJ
            int r0 = r0 + 1
            r2.LJIIJ = r0
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r4.iterator()
        L67:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lc1
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = (com.ss.android.ugc.aweme.im.service.model.IMUser) r0
            boolean r0 = X.C76917UGr.LJJJJJL(r0)
            if (r0 != 0) goto L67
            r3.add(r1)
            goto L67
        L7e:
            X.C141335gf.LIZJ(r4)
            boolean r0 = r10.LJIIIZ
            if (r0 != 0) goto Ld4
            int r0 = r10.LJFF
            if (r0 >= 0) goto L8d
            r0 = 100
            r10.LJFF = r0
        L8d:
            int r0 = r10.LJFF
            int r6 = r0 + 5
            X.3Fk r4 = X.C80853Fh.LJ()
            X.Pro<? extends java.util.List<java.lang.String>> r0 = r10.LJII
            r1 = 0
            if (r0 == 0) goto La2
            java.lang.Object r5 = r0.invoke()
            java.util.List r5 = (java.util.List) r5
            if (r5 != 0) goto La3
        La2:
            r5 = r1
        La3:
            int r7 = r10.LJIIJ
            int r7 = r7 * r6
            java.lang.String r8 = r10.LJIIIIZZ
            if (r8 == 0) goto Lce
            r9.LJLIL = r10
            r9.LJLILLLLZI = r6
            r9.LJLJJL = r2
            java.lang.Object r4 = r4.LJIIIZ(r5, r6, r7, r8, r9)
            if (r4 != r3) goto Lb7
            return r3
        Lb7:
            r2 = r10
            goto L24
        Lba:
            X.3Qn r9 = new X.3Qn
            r9.<init>(r10, r11)
            goto L12
        Lc1:
            java.util.List r0 = X.ORZ.LLJILJILJ(r3)
            return r0
        Lc6:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lce:
            java.lang.String r0 = "querySql"
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r1
        Ld4:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Weight sort mode not support load more!"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C83753Ql.LJIIIIZZ(X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(X.InterfaceC67352kd<? super X.C76800UCe> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof X.C83783Qo
            if (r0 == 0) goto Lda
            r6 = r11
            X.3Qo r6 = (X.C83783Qo) r6
            int r2 = r6.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lda
            int r2 = r2 - r1
            r6.LJLJJL = r2
        L12:
            java.lang.Object r5 = r6.LJLJI
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJJL
            r9 = 1
            r3 = 2
            if (r0 == 0) goto Lb0
            if (r0 == r9) goto Laa
            if (r0 != r3) goto Le1
            boolean r1 = r6.LJLILLLLZI
            X.3Ql r2 = r6.LJLIL
            X.C141335gf.LIZJ(r5)
        L27:
            java.lang.Number r5 = (java.lang.Number) r5
            int r8 = r5.intValue()
            com.ss.android.ugc.aweme.profile.model.User r0 = X.C80763Ey.LIZJ()
            r4 = 0
            if (r0 == 0) goto La8
            int r7 = r0.getFollowingCount()
        L38:
            java.lang.StringBuilder r3 = X.X1D.LIZ()
            java.lang.String r0 = "DB: dbEmpty="
            r3.append(r0)
            r3.append(r1)
            java.lang.String r6 = ", dbCount="
            r3.append(r6)
            r3.append(r8)
            java.lang.String r5 = ", userCount="
            r3.append(r5)
            r3.append(r7)
            java.lang.String r3 = X.X1D.LIZIZ(r3)
            java.lang.String r0 = "msg"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            if (r1 != 0) goto L63
            int r0 = r8 + 1
            if (r0 >= r7) goto La3
        L63:
            r2.getClass()
            if (r1 == 0) goto La6
        L68:
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            java.lang.String r0 = "error"
            r3.put(r0, r2)
            java.lang.StringBuilder r2 = X.X1D.LIZ()
            java.lang.String r0 = "empty="
            r2.append(r0)
            r2.append(r1)
            r2.append(r6)
            r2.append(r8)
            r2.append(r5)
            r2.append(r7)
            java.lang.String r1 = X.X1D.LIZIZ(r2)
            java.lang.String r0 = "error_stack"
            r3.put(r0, r1)
            java.lang.String r0 = "follow_loader_data_error"
            X.C36L.LJ(r0, r3)
            X.3YC r1 = X.C3YC.LJLIL
            X.3YM r0 = X.C3YM.LOADER_DIFF
            r1.LJIIIZ(r0, r4)
        La3:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        La6:
            r9 = 2
            goto L68
        La8:
            r7 = 0
            goto L38
        Laa:
            X.3Ql r2 = r6.LJLIL
            X.C141335gf.LIZJ(r5)
            goto Lc3
        Lb0:
            X.C141335gf.LIZJ(r5)
            X.3Fk r0 = X.C80853Fh.LJ()
            r6.LJLIL = r10
            r6.LJLJJL = r9
            java.lang.Object r5 = r0.LJIILL(r6)
            if (r5 != r4) goto Lc2
            return r4
        Lc2:
            r2 = r10
        Lc3:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r1 = r5.booleanValue()
            X.3Fk r0 = X.C80853Fh.LJ()
            r6.LJLIL = r2
            r6.LJLILLLLZI = r1
            r6.LJLJJL = r3
            java.lang.Object r5 = r0.LJIILIIL(r6)
            if (r5 != r4) goto L27
            return r4
        Lda:
            X.3Qo r6 = new X.3Qo
            r6.<init>(r10, r11)
            goto L12
        Le1:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C83753Ql.LJIIJ(X.2kd):java.lang.Object");
    }
}
