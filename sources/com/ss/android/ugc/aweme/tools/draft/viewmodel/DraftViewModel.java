package com.ss.android.ugc.aweme.tools.draft.viewmodel;

import X.C13I;
import X.C29901Fi;
import X.C3CS;
import X.C41360GLc;
import X.C41425GNp;
import X.C41426GNq;
import X.C41662GWs;
import X.C48841JEv;
import X.C60903NvH;
import X.C64962gm;
import X.C68395Qsp;
import X.C76800UCe;
import X.C78934UyQ;
import X.C78983UzD;
import X.C86580XyS;
import X.EXV;
import X.EnumC58928NAu;
import X.GP9;
import X.GPP;
import X.H78;
import X.InterfaceC41322GJq;
import X.InterfaceC88472Yns;
import X.OSZ;
import X.X1D;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import defpackage.g0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class DraftViewModel extends ViewModel {
    public static final /* synthetic */ int LLIFFJFJJ = 0;
    public int LJLLI;
    public int LJLLJ;
    public boolean LJLLL;
    public final MutableLiveData<Boolean> LJLLLLLL;
    public final MutableLiveData LJLZ;
    public final MutableLiveData<Integer> LJZ;
    public final MutableLiveData LJZI;
    public boolean LJZL;
    public final C29901Fi<C76800UCe> LL;
    public final C29901Fi LLD;
    public final MutableLiveData<Long> LLF;
    public final MutableLiveData LLFF;
    public final C29901Fi<Boolean> LLFFF;
    public final C29901Fi<List<C41426GNq>> LLFII;
    public final C29901Fi LLFZ;
    public final C64962gm LLI;
    public final String LJLIL = "DraftViewModel";
    public final Set<C41425GNp> LJLILLLLZI = new HashSet();
    public final Set<C41425GNp> LJLJI = new HashSet();
    public final List<C41426GNq> LJLJJI = new ArrayList();
    public final MutableLiveData<Boolean> LJLJJL = new MutableLiveData<>();
    public final MutableLiveData<OSZ<AwemeDraft, Boolean>> LJLJJLL = new MutableLiveData<>();
    public final MutableLiveData<AwemeDraft> LJLJL = new MutableLiveData<>();
    public final MutableLiveData<C41662GWs> LJLJLJ = new MutableLiveData<>();
    public final C13I LJLJLLL = new C13I();
    public final MutableLiveData<Boolean> LJLL = new MutableLiveData<>();
    public final int LJLLILLLL = 48;
    public long LJLLLL = -1;

    public final boolean kv0() {
        Iterator it = ((ArrayList) this.LJLJJI).iterator();
        while (it.hasNext()) {
            C41426GNq c41426GNq = (C41426GNq) it.next();
            if (c41426GNq.LIZ() == 101 || c41426GNq.LIZ() == 106 || c41426GNq.LIZ() == 109) {
                return false;
            }
        }
        return true;
    }

    public DraftViewModel() {
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>(Boolean.TRUE);
        this.LJLLLLLL = mutableLiveData;
        this.LJLZ = mutableLiveData;
        MutableLiveData<Integer> mutableLiveData2 = new MutableLiveData<>();
        this.LJZ = mutableLiveData2;
        this.LJZI = mutableLiveData2;
        C29901Fi<C76800UCe> c29901Fi = new C29901Fi<>();
        this.LL = c29901Fi;
        this.LLD = c29901Fi;
        MutableLiveData<Long> mutableLiveData3 = new MutableLiveData<>();
        this.LLF = mutableLiveData3;
        this.LLFF = mutableLiveData3;
        this.LLFFF = new C29901Fi<>();
        C29901Fi<List<C41426GNq>> c29901Fi2 = new C29901Fi<>();
        this.LLFII = c29901Fi2;
        this.LLFZ = c29901Fi2;
        this.LLI = C48841JEv.LIZ(EXV.LIZ);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLIL);
        LIZ.append(" -> onCleared: ");
        H78.LIZ(X1D.LIZIZ(LIZ));
    }

    public GP9 jv0() {
        return GP9.NORMAL;
    }

    public final void hv0(List<C41425GNp> list) {
        Iterator<C41425GNp> it = list.iterator();
        while (it.hasNext()) {
            ((ArrayList) this.LJLJJI).remove(it.next());
        }
        if (kv0()) {
            ((ArrayList) this.LJLJJI).clear();
        }
        g0.LJJIL(this.LJLJJL, Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object lv0(X.InterfaceC67352kd<? super X.C76800UCe> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.GNX
            if (r0 == 0) goto L6d
            r6 = r9
            X.GNX r6 = (X.GNX) r6
            int r2 = r6.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6d
            int r2 = r2 - r1
            r6.LJLJJI = r2
        L12:
            java.lang.Object r7 = r6.LJLILLLLZI
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJJI
            r4 = 2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L27
            if (r0 == r2) goto L53
            if (r0 != r4) goto L73
            X.C141335gf.LIZJ(r7)
        L24:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L27:
            X.C141335gf.LIZJ(r7)
            X.GP9 r1 = r8.jv0()
            X.GP9 r0 = X.GP9.POSTED
            if (r1 == r0) goto L3c
            java.util.List<X.GNq> r0 = r8.LJLJJI
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L3f
        L3c:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L3f:
            X.XIA r1 = X.C78613UtF.LIZJ
            X.GNY r0 = new X.GNY
            r0.<init>(r3)
            r6.LJLIL = r8
            r6.LJLJJI = r2
            java.lang.Object r7 = X.XKX.LJI(r1, r0, r6)
            if (r7 != r5) goto L51
            return r5
        L51:
            r2 = r8
            goto L58
        L53:
            com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel r2 = r6.LJLIL
            X.C141335gf.LIZJ(r7)
        L58:
            X.AVg r7 = (X.C26336AVg) r7
            X.UtN r1 = X.C36636EZk.LIZ
            X.EDE r0 = new X.EDE
            r0.<init>(r7, r2, r3)
            r6.LJLIL = r3
            r6.LJLJJI = r4
            java.lang.Object r0 = X.XKX.LJI(r1, r0, r6)
            if (r0 != r5) goto L24
            return r5
        L6d:
            X.GNX r6 = new X.GNX
            r6.<init>(r8, r9)
            goto L12
        L73:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel.lv0(X.2kd):java.lang.Object");
    }

    public final void nv0(boolean z) {
        Boolean value = this.LJLLLLLL.getValue();
        if (value == null || !o.LJ(value, Boolean.valueOf(z))) {
            this.LJLLLLLL.setValue(Boolean.valueOf(z));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object iv0(X.C41425GNp r7, X.InterfaceC67352kd<? super X.C76800UCe> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.GNW
            if (r0 == 0) goto L6e
            r4 = r8
            X.GNW r4 = (X.GNW) r4
            int r2 = r4.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6e
            int r2 = r2 - r1
            r4.LJLJJL = r2
        L12:
            java.lang.Object r5 = r4.LJLJI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJL
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 != r2) goto L74
            X.GNp r7 = r4.LJLILLLLZI
            com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel r1 = r4.LJLIL
            X.C141335gf.LIZJ(r5)
        L24:
            java.util.List r0 = X.C47261Igj.LJJIJ(r7)
            r1.hv0(r0)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L2e:
            X.C141335gf.LIZJ(r5)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = r6.LJLIL
            r1.append(r0)
            java.lang.String r0 = ": delete one draft: creationId = "
            r1.append(r0)
            java.lang.String r0 = r7.LJ
            r1.append(r0)
            java.lang.String r0 = "; draftList.size = "
            r1.append(r0)
            java.util.List<X.GNq> r0 = r6.LJLJJI
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.H78.LIZ(r0)
            java.lang.String r1 = r7.LJ
            r4.LJLIL = r6
            r4.LJLILLLLZI = r7
            r4.LJLJJL = r2
            X.GNc r0 = X.C41412GNc.LJLIL
            java.lang.Object r0 = r6.gv0(r1, r4, r0)
            if (r0 != r3) goto L6c
            return r3
        L6c:
            r1 = r6
            goto L24
        L6e:
            X.GNW r4 = new X.GNW
            r4.<init>(r6, r8)
            goto L12
        L74:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel.iv0(X.GNp, X.2kd):java.lang.Object");
    }

    public final Object gv0(String str, C3CS c3cs, InterfaceC88472Yns interfaceC88472Yns) {
        AwemeDraft LIZ = this.LJLJLLL.LIZ(str);
        if (LIZ == null) {
            H78.LIZ("deleteAwemeDraft -> draft ie null");
            C78983UzD.LJIILL("queryNull -> deleteAwemeDraft");
            return C76800UCe.LIZ;
        }
        if (((Boolean) interfaceC88472Yns.invoke(LIZ)).booleanValue()) {
            C13I c13i = this.LJLJLLL;
            c13i.getClass();
            ((Map) c13i.LIZ).remove(str);
            if (this.LJLLLL != 0) {
                if (LIZ.LJJ == 0) {
                    C68395Qsp c68395Qsp = new C68395Qsp(3);
                    c68395Qsp.LJLIL = LIZ;
                    LIZ.LJJ = c68395Qsp.LIZIZ();
                }
                this.LJLLLL -= LIZ.LJJ;
            }
            this.LJLLJ--;
            InterfaceC41322GJq businessGoodsService = C78934UyQ.LJLIL.getBusinessGoodsService();
            String LIZJ = LIZ.LIZJ();
            o.LJI(LIZJ);
            businessGoodsService.getClass();
            C86580XyS.LIZJ(LIZJ);
            Object LJFF = C60903NvH.LJIIJJI().LJJJI().LJFF().LJFF(new GPP(LIZ, new C41360GLc("user_click", "clickDeleteInDraft"), null, null, 60), c3cs);
            EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
            if (LJFF != enumC58928NAu) {
                LJFF = C76800UCe.LIZ;
            }
            if (LJFF == enumC58928NAu) {
                return LJFF;
            }
            return C76800UCe.LIZ;
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mv0(X.C41421GNl r9, android.content.Context r10, X.InterfaceC67352kd<? super X.C76800UCe> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof X.GNV
            if (r0 == 0) goto L6e
            r6 = r11
            X.GNV r6 = (X.GNV) r6
            int r2 = r6.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6e
            int r2 = r2 - r1
            r6.LJLJJL = r2
        L12:
            java.lang.Object r7 = r6.LJLJI
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJJL
            r4 = 2
            r2 = 1
            if (r0 == 0) goto L30
            if (r0 == r2) goto L26
            if (r0 != r4) goto L74
            X.C141335gf.LIZJ(r7)
        L23:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L26:
            java.lang.Object r10 = r6.LJLILLLLZI
            android.content.Context r10 = (android.content.Context) r10
            com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel r3 = r6.LJLIL
            X.C141335gf.LIZJ(r7)
            goto L47
        L30:
            X.C141335gf.LIZJ(r7)
            X.GPB r1 = X.GPB.LIZ
            X.GP9 r0 = r8.jv0()
            r6.LJLIL = r8
            r6.LJLILLLLZI = r10
            r6.LJLJJL = r2
            java.lang.Object r7 = r1.LIZIZ(r9, r0, r6)
            if (r7 != r5) goto L46
            return r5
        L46:
            r3 = r8
        L47:
            java.util.List r7 = (java.util.List) r7
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L59
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> r1 = r3.LJLJJL
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            defpackage.g0.LJJIL(r1, r0)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L59:
            X.XIF r2 = X.EXV.LIZ
            X.GNR r1 = new X.GNR
            r0 = 0
            r1.<init>(r3, r7, r10, r0)
            r6.LJLIL = r0
            r6.LJLILLLLZI = r0
            r6.LJLJJL = r4
            java.lang.Object r0 = X.XKX.LJI(r2, r1, r6)
            if (r0 != r5) goto L23
            return r5
        L6e:
            X.GNV r6 = new X.GNV
            r6.<init>(r8, r11)
            goto L12
        L74:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel.mv0(X.GNl, android.content.Context, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Type inference failed for: r0v10, types: [com.ss.android.ugc.aweme.draft.model.AwemeDraft, T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ov0(X.C41425GNp r10, X.C83309Wmn r11, android.content.Context r12, java.lang.String r13, X.InterfaceC67352kd<? super X.C76800UCe> r14) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel.ov0(X.GNp, X.Wmn, android.content.Context, java.lang.String, X.2kd):java.lang.Object");
    }
}
