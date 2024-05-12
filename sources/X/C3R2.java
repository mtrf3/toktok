package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.sdk.relations.data.model.RelationTypeParameters;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS148S0200000_1;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.3R2, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3R2 extends AbstractC84083Rs {
    public final C62822Ol8 LJLLLL;
    public final C62822Ol8 LJLLLLLL;
    public final C83753Ql LJLZ;
    public final List<String> LJZ;
    public final List<IMContact> LJZI;
    public final C3RS LJZL;
    public final C3RS LL;
    public final C83753Ql LLD;
    public final C62822Ol8 LLF;
    public final C83943Re<IMContact> LLFF;
    public C3RZ<IMContact> LLFFF;

    @Override // X.AbstractC82553Lv
    public final boolean LIZJ() {
        return true;
    }

    @Override // X.AbstractC82553Lv
    public final C3RZ LJ() {
        C3RZ<IMContact> c3rz = this.LLFFF;
        if (c3rz != null) {
            return c3rz;
        }
        C3RF c3rf = new C3RF();
        C83943Re provider = this.LLFF;
        o.LJIIIZ(provider, "provider");
        c3rf.LIZ.LIZIZ = provider;
        c3rf.LIZ.LIZLLL = new C3RC(this);
        c3rf.LIZ.LJ = new C81013Fx(this);
        c3rf.LIZ(this);
        C3RZ c3rz2 = c3rf.LIZ;
        this.LLFFF = c3rz2;
        o.LJI(c3rz2);
        return c3rz2;
    }

    public final List<Integer> LJIIJ() {
        return (List) this.LJLLLL.getValue();
    }

    public final List<String> LJIIJJI() {
        return (List) this.LJLLLLLL.getValue();
    }

    public final boolean LJIIL() {
        if ((o.LJ(this.LJLIL.LIZJ, Boolean.TRUE) && o.LJ(this.LJLIL.LIZLLL, "aweme")) || this.LJLIL.LJIILL) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC82553Lv
    public final C3LJ LIZ() {
        if (C3UE.LIZ() && C3UE.LIZJ()) {
            final C3R9 parameters = this.LJLIL;
            o.LJIIIZ(parameters, "parameters");
            return new C3LJ(parameters) { // from class: X.3He
                public static final /* synthetic */ int LJLJL = 0;
                public final C3NZ LJLJJL;
                public final C62822Ol8 LJLJJLL;

                {
                    super(parameters);
                    this.LJLJJL = new C3NZ(parameters);
                    this.LJLJJLL = C221108m2.LIZIZ(C3G1.LJLIL);
                }

                @Override // X.C3LJ
                public final boolean LJIIL(IMContact obj) {
                    o.LJIIIZ(obj, "obj");
                    if (obj instanceof IMUser) {
                        IMUser iMUser = (IMUser) obj;
                        if (((List) this.LJLJJLL.getValue()).contains(iMUser.getUid())) {
                            if (iMUser.getShareStatus() == 2) {
                                return false;
                            }
                            return true;
                        }
                    }
                    if (!this.LJLJJL.LJIIL(obj)) {
                        return false;
                    }
                    return super.LJIIL(obj);
                }
            };
        }
        C3R9 parameters2 = this.LJLIL;
        o.LJIIIZ(parameters2, "parameters");
        return new C3LJ(parameters2);
    }

    @Override // X.AbstractC82553Lv
    public final void LIZLLL() {
        LJIIJJI().clear();
        LJIIJ().clear();
        super.LIZLLL();
    }

    public C3R2(C3R9 c3r9) {
        super(c3r9);
        String LIZLLL;
        this.LJLLLL = C221108m2.LIZIZ(C3RM.LJLIL);
        this.LJLLLLLL = C221108m2.LIZIZ(C3RN.LJLIL);
        C221108m2.LIZIZ(C3RL.LJLIL);
        if (c3r9.LIZIZ) {
            LIZLLL = C80853Fh.LIZIZ();
        } else {
            LIZLLL = C80853Fh.LIZLLL();
        }
        C82653Mf c82653Mf = new C82653Mf();
        c82653Mf.LIZ.LJIIIZ = true;
        c82653Mf.LIZ.LJIIIIZZ = LIZLLL;
        c82653Mf.LIZJ(-1);
        c82653Mf.LIZIZ().LIZLLL = new C3O2(c3r9, null);
        C83753Ql c83753Ql = c82653Mf.LIZ;
        this.LJLZ = c83753Ql;
        String LIZ = C80853Fh.LIZ();
        this.LJZ = new ArrayList();
        this.LJZI = new ArrayList();
        new ArrayList();
        C3RK c3rk = new C3RK();
        AqS151S0100000_1 aqS151S0100000_1 = new AqS151S0100000_1(this, 884);
        C3RS c3rs = c3rk.LIZ;
        c3rs.LJII = aqS151S0100000_1;
        RelationTypeParameters relationTypeParameters = C3RW.LIZIZ;
        c3rs.LJIIIZ = new RelationTypeParameters[]{relationTypeParameters};
        c3rk.LIZ.LJIIIIZZ = C80853Fh.LIZ();
        c3rk.LIZJ(-1);
        this.LJZL = c3rk.LIZ;
        C3RK c3rk2 = new C3RK();
        c3rk2.LIZ.LJIIIIZZ = C80853Fh.LIZJ();
        AqS151S0100000_1 aqS151S0100000_12 = new AqS151S0100000_1(this, 886);
        C3RS c3rs2 = c3rk2.LIZ;
        c3rs2.LJII = aqS151S0100000_12;
        c3rs2.LJIIIZ = new RelationTypeParameters[]{relationTypeParameters};
        c3rk2.LIZJ(-1);
        this.LL = c3rk2.LIZ;
        C82653Mf c82653Mf2 = new C82653Mf();
        C83753Ql c83753Ql2 = c82653Mf2.LIZ;
        c83753Ql2.LJIIIIZZ = LIZ;
        c83753Ql2.LJIIIZ = false;
        c82653Mf2.LIZ.LJII = new AqS151S0100000_1(this, 885);
        c82653Mf2.LIZJ(-1);
        C82653Mf c82653Mf3 = new C82653Mf();
        String LIZLLL2 = C80853Fh.LIZLLL();
        C83753Ql c83753Ql3 = c82653Mf3.LIZ;
        c83753Ql3.LJIIIIZZ = LIZLLL2;
        c83753Ql3.LJIIIZ = false;
        c82653Mf3.LIZ.LJII = new AqS148S0200000_1(c3r9, this, 39);
        c82653Mf3.LIZIZ().LIZLLL = new C3O1(c3r9, null);
        c82653Mf3.LIZJ(-1);
        this.LLD = c82653Mf3.LIZ;
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(C82763Mq.LJLIL);
        this.LLF = LIZIZ;
        C83943Re<IMContact> c83943Re = new C83943Re<>();
        int i = c3r9.LIZ;
        if (i == 1 || i == 2 || i == 3) {
            c83943Re.LIZ(this.LJLJL);
        }
        if (LJIIL()) {
            c83943Re.LIZ((AbstractC113374cf) LIZIZ.getValue());
        }
        c83943Re.LIZ(c83753Ql);
        this.LLFF = c83943Re;
    }

    public static List LJIILJJIL(List list) {
        int i;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = ListProtector.get(list, i2);
            o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser");
            IMUser iMUser = (IMUser) obj;
            if (iMUser.getFollowStatus() == 2) {
                IMUser clone = iMUser.m136clone();
                if (arrayList.isEmpty()) {
                    clone.setType(5);
                } else {
                    clone.setType(6);
                }
                o.LJIIIIZZ(clone, "clone");
                arrayList.add(clone);
            }
            if (i2 == 0) {
                i = 3;
            } else {
                i = 0;
            }
            iMUser.setType(i);
        }
        return arrayList;
    }

    public final void LJIILL(List<IMContact> list) {
        int size = list.size();
        String str = null;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = ListProtector.get(list, i2);
            o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser");
            String initialLetter = ((IMUser) obj).getInitialLetter();
            if (!TextUtils.isEmpty(initialLetter)) {
                if (str != null && !TextUtils.equals(initialLetter, str)) {
                    LJIIJJI().add(str);
                    LJIIJ().add(Integer.valueOf(i));
                    i = 1;
                } else {
                    i++;
                }
                if (i2 == list.size() - 1) {
                    LJIIJJI().add(initialLetter);
                    LJIIJ().add(Integer.valueOf(i));
                }
                str = initialLetter;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(java.util.List<com.ss.android.ugc.aweme.im.service.model.IMContact> r6, X.InterfaceC67352kd<? super java.util.List<com.ss.android.ugc.aweme.im.service.model.IMContact>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C3RB
            if (r0 == 0) goto L40
            r4 = r7
            X.3RB r4 = (X.C3RB) r4
            int r2 = r4.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L40
            int r2 = r2 - r1
            r4.LJLJI = r2
        L12:
            java.lang.Object r1 = r4.LJLIL
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJI
            r2 = 1
            if (r0 == 0) goto L22
            if (r0 != r2) goto L46
            X.C141335gf.LIZJ(r1)
        L20:
            r6 = r1
        L21:
            return r6
        L22:
            X.C141335gf.LIZJ(r1)
            X.3R9 r0 = r5.LJLIL
            java.lang.String r1 = r0.LJIJ
            if (r1 == 0) goto L21
            int r0 = r1.length()
            if (r0 != 0) goto L32
            goto L21
        L32:
            X.3EB r0 = new X.3EB
            r0.<init>(r1)
            r4.LJLJI = r2
            java.lang.Object r1 = r0.LIZ(r6, r4)
            if (r1 != r3) goto L20
            return r3
        L40:
            X.3RB r4 = new X.3RB
            r4.<init>(r5, r7)
            goto L12
        L46:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3R2.LJIIIZ(java.util.List, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0037, code lost:
    
        r1 = r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007b -> B:10:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILIIL(X.C3RY<com.ss.android.ugc.aweme.im.service.model.IMContact> r12, X.InterfaceC67352kd<? super java.lang.Boolean> r13) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3R2.LJIILIIL(X.3RY, X.2kd):java.lang.Object");
    }
}
