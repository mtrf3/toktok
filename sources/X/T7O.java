package X;

import androidx.lifecycle.MutableLiveData;
import com.google.android.play.core.appupdate.h;
import com.ss.android.ugc.aweme.qna.api.QuestionCollectionRequest;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T7O {
    public final T7D LIZ;
    public final XKW LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public String LJ;
    public boolean LJFF;
    public final int LJI;
    public final int LJII;
    public Integer LJIIIIZZ;
    public final MutableLiveData<C74100T6i<List<C74125T7h>>> LJIIIZ;
    public final MutableLiveData LJIIJ;
    public final MutableLiveData<C74100T6i<C69606RTm>> LJIIJJI;
    public final MutableLiveData<C74100T6i<C69606RTm>> LJIIL;
    public final MutableLiveData<C74100T6i<KKR>> LJIILIIL;
    public final MutableLiveData<C74100T6i<KKR>> LJIILJJIL;
    public final MutableLiveData<C74100T6i<String>> LJIILL;
    public final MutableLiveData<C74100T6i<String>> LJIILLIIL;
    public final MutableLiveData<C74100T6i<Integer>> LJIIZILJ;
    public final MutableLiveData<C74100T6i<Integer>> LJIJ;
    public final MutableLiveData LJIJI;
    public final h LJIJJ;
    public final AtomicBoolean LJIJJLI;
    public final AtomicBoolean LJIL;
    public int LJJ;
    public MIL LJJI;

    public T7O(int i) {
        T7D t7d = new T7D();
        XIA dispatcher = C78613UtF.LIZJ;
        o.LJIIIZ(dispatcher, "dispatcher");
        this.LIZ = t7d;
        this.LIZIZ = dispatcher;
        this.LJFF = true;
        this.LJI = Q7K.LIZIZ("qna_api_max_query_limit", 30);
        this.LJII = 5;
        MutableLiveData<C74100T6i<List<C74125T7h>>> mutableLiveData = new MutableLiveData<>();
        this.LJIIIZ = mutableLiveData;
        this.LJIIJ = mutableLiveData;
        MutableLiveData<C74100T6i<C69606RTm>> mutableLiveData2 = new MutableLiveData<>();
        this.LJIIJJI = mutableLiveData2;
        this.LJIIL = mutableLiveData2;
        MutableLiveData<C74100T6i<KKR>> mutableLiveData3 = new MutableLiveData<>();
        this.LJIILIIL = mutableLiveData3;
        this.LJIILJJIL = mutableLiveData3;
        MutableLiveData<C74100T6i<String>> mutableLiveData4 = new MutableLiveData<>();
        this.LJIILL = mutableLiveData4;
        this.LJIILLIIL = mutableLiveData4;
        MutableLiveData<C74100T6i<Integer>> mutableLiveData5 = new MutableLiveData<>();
        this.LJIIZILJ = mutableLiveData5;
        this.LJIJ = mutableLiveData5;
        this.LJIJI = new MutableLiveData();
        this.LJIJJ = new h(2);
        this.LJIJJLI = new AtomicBoolean(false);
        this.LJIL = new AtomicBoolean(true);
        this.LJJI = MIL.STANDARD;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC67352kd<? super X.C76800UCe> r16) {
        /*
            r15 = this;
            r3 = r16
            boolean r0 = r3 instanceof X.T7T
            if (r0 == 0) goto L7d
            r4 = r3
            X.T7T r4 = (X.T7T) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7d
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L14:
            java.lang.Object r7 = r4.LJLILLLLZI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJI
            r2 = 2
            r6 = 1
            if (r0 == 0) goto L2e
            if (r0 == r6) goto L28
            if (r0 != r2) goto L83
            X.C141335gf.LIZJ(r7)
        L25:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L28:
            X.T7O r5 = r4.LJLIL
            X.C141335gf.LIZJ(r7)
            goto L69
        L2e:
            X.C141335gf.LIZJ(r7)
            com.google.android.play.core.appupdate.h r0 = r15.LJIJJ
            X.T7P r1 = X.T7P.RECOMMEND
            boolean r0 = r0.LIZIZ(r1)
            if (r0 == 0) goto L3e
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L3e:
            int r8 = r15.LIZLLL
            com.ss.android.ugc.aweme.qna.api.QuestionCollectionRequest r7 = new com.ss.android.ugc.aweme.qna.api.QuestionCollectionRequest
            int r9 = r15.LJII
            int r10 = r1.getValue()
            X.T7Z r0 = X.T7Z.DETAIL_PAGE_BANNER
            int r11 = r0.getValue()
            r12 = 0
            r13 = 16
            r14 = r12
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            java.util.List r5 = X.C47261Igj.LJJIJ(r7)
            X.2fm r1 = X.C64342fm.LIZ
            X.XKW r0 = r15.LIZIZ
            r4.LJLIL = r15
            r4.LJLJJI = r6
            java.lang.Object r7 = r1.LIZ(r0, r5, r4)
            if (r7 != r3) goto L68
            return r3
        L68:
            r5 = r15
        L69:
            java.lang.String r7 = (java.lang.String) r7
            X.T7P r0 = X.T7P.RECOMMEND
            java.util.List r1 = X.C47261Igj.LJJIJ(r0)
            r0 = 0
            r4.LJLIL = r0
            r4.LJLJJI = r2
            java.lang.Object r0 = LJI(r5, r7, r1, r0, r4)
            if (r0 != r3) goto L25
            return r3
        L7d:
            X.T7T r4 = new X.T7T
            r4.<init>(r15, r3)
            goto L14
        L83:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T7O.LIZIZ(X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.InterfaceC67352kd<? super X.C76800UCe> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.T7V
            if (r0 == 0) goto L75
            r4 = r9
            X.T7V r4 = (X.T7V) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L75
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r7 = r4.LJLILLLLZI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJI
            r5 = 2
            r6 = 1
            if (r0 == 0) goto L2c
            if (r0 == r6) goto L26
            if (r0 != r5) goto L7b
            X.C141335gf.LIZJ(r7)
        L23:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L26:
            X.T7O r6 = r4.LJLIL
            X.C141335gf.LIZJ(r7)
            goto L5f
        L2c:
            X.C141335gf.LIZJ(r7)
            com.google.android.play.core.appupdate.h r1 = r8.LJIJJ
            X.T7P r0 = X.T7P.INVITATION
            boolean r0 = r1.LIZIZ(r0)
            if (r0 == 0) goto L3c
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L3c:
            boolean r0 = r8.LJFF
            if (r0 != 0) goto L45
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r8.LJIIJJI(r0)
        L45:
            int r0 = r8.LIZJ
            com.ss.android.ugc.aweme.qna.api.QuestionCollectionRequest r0 = r8.LJIIIIZZ(r0)
            java.util.List r2 = X.C47261Igj.LJJIJ(r0)
            X.2fm r1 = X.C64342fm.LIZ
            X.XKW r0 = r8.LIZIZ
            r4.LJLIL = r8
            r4.LJLJJI = r6
            java.lang.Object r7 = r1.LIZ(r0, r2, r4)
            if (r7 != r3) goto L5e
            return r3
        L5e:
            r6 = r8
        L5f:
            java.lang.String r7 = (java.lang.String) r7
            X.T7P r0 = X.T7P.INVITATION
            java.util.List r2 = X.C47261Igj.LJJIJ(r0)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0 = 0
            r4.LJLIL = r0
            r4.LJLJJI = r5
            java.lang.Object r0 = LJI(r6, r7, r2, r1, r4)
            if (r0 != r3) goto L23
            return r3
        L75:
            X.T7V r4 = new X.T7V
            r4.<init>(r8, r9)
            goto L12
        L7b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T7O.LIZLLL(X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.InterfaceC67352kd<? super X.C76800UCe> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof X.T7W
            if (r0 == 0) goto L72
            r10 = r12
            X.T7W r10 = (X.T7W) r10
            int r2 = r10.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L72
            int r2 = r2 - r1
            r10.LJLJJI = r2
        L12:
            java.lang.Object r6 = r10.LJLILLLLZI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r10.LJLJJI
            r4 = 2
            r5 = 1
            if (r0 == 0) goto L2c
            if (r0 == r5) goto L26
            if (r0 != r4) goto L78
            X.C141335gf.LIZJ(r6)
        L23:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L26:
            X.T7O r5 = r10.LJLIL
            X.C141335gf.LIZJ(r6)
            goto L5d
        L2c:
            X.C141335gf.LIZJ(r6)
            com.google.android.play.core.appupdate.h r1 = r11.LJIJJ
            X.T7P r0 = X.T7P.MIXED
            boolean r0 = r1.LIZIZ(r0)
            if (r0 == 0) goto L3c
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L3c:
            java.lang.String r1 = r11.LJ
            if (r1 != 0) goto L42
            java.lang.String r1 = ""
        L42:
            com.ss.android.ugc.aweme.qna.api.QuestionCollectionMixedRequest r2 = new com.ss.android.ugc.aweme.qna.api.QuestionCollectionMixedRequest
            X.T7P r0 = X.T7P.RECOMMEND
            int r0 = r0.getValue()
            r2.<init>(r0, r1)
            X.2fm r1 = X.C64342fm.LIZ
            X.XKW r0 = r11.LIZIZ
            r10.LJLIL = r11
            r10.LJLJJI = r5
            java.lang.Object r6 = r1.LIZ(r0, r2, r10)
            if (r6 != r3) goto L5c
            return r3
        L5c:
            r5 = r11
        L5d:
            java.lang.String r6 = (java.lang.String) r6
            X.T7P r0 = X.T7P.MIXED
            java.util.List r7 = X.C47261Igj.LJJIJ(r0)
            r8 = 0
            r9 = 1
            r10.LJLIL = r8
            r10.LJLJJI = r4
            java.lang.Object r0 = r5.LJFF(r6, r7, r8, r9, r10)
            if (r0 != r3) goto L23
            return r3
        L72:
            X.T7W r10 = new X.T7W
            r10.<init>(r11, r12)
            goto L12
        L78:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T7O.LJ(X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(X.InterfaceC67352kd<? super X.C76800UCe> r16) {
        /*
            r15 = this;
            r3 = r16
            boolean r0 = r3 instanceof X.T7X
            if (r0 == 0) goto L7d
            r4 = r3
            X.T7X r4 = (X.T7X) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7d
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L14:
            java.lang.Object r7 = r4.LJLILLLLZI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJI
            r2 = 2
            r6 = 1
            if (r0 == 0) goto L2e
            if (r0 == r6) goto L28
            if (r0 != r2) goto L83
            X.C141335gf.LIZJ(r7)
        L25:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L28:
            X.T7O r5 = r4.LJLIL
            X.C141335gf.LIZJ(r7)
            goto L69
        L2e:
            X.C141335gf.LIZJ(r7)
            com.google.android.play.core.appupdate.h r0 = r15.LJIJJ
            X.T7P r1 = X.T7P.RECOMMEND
            boolean r0 = r0.LIZIZ(r1)
            if (r0 == 0) goto L3e
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L3e:
            int r8 = r15.LIZLLL
            com.ss.android.ugc.aweme.qna.api.QuestionCollectionRequest r7 = new com.ss.android.ugc.aweme.qna.api.QuestionCollectionRequest
            int r9 = r15.LJI
            int r10 = r1.getValue()
            X.T7Z r0 = X.T7Z.SUGGESTED_TAB
            int r11 = r0.getValue()
            r12 = 0
            r13 = 16
            r14 = r12
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            java.util.List r5 = X.C47261Igj.LJJIJ(r7)
            X.2fm r1 = X.C64342fm.LIZ
            X.XKW r0 = r15.LIZIZ
            r4.LJLIL = r15
            r4.LJLJJI = r6
            java.lang.Object r7 = r1.LIZ(r0, r5, r4)
            if (r7 != r3) goto L68
            return r3
        L68:
            r5 = r15
        L69:
            java.lang.String r7 = (java.lang.String) r7
            X.T7P r0 = X.T7P.RECOMMEND
            java.util.List r1 = X.C47261Igj.LJJIJ(r0)
            r0 = 0
            r4.LJLIL = r0
            r4.LJLJJI = r2
            java.lang.Object r0 = LJI(r5, r7, r1, r0, r4)
            if (r0 != r3) goto L25
            return r3
        L7d:
            X.T7X r4 = new X.T7X
            r4.<init>(r15, r3)
            goto L14
        L83:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T7O.LJII(X.2kd):java.lang.Object");
    }

    public final QuestionCollectionRequest LJIIIIZZ(int i) {
        int i2;
        if (this.LJFF) {
            i2 = 3;
        } else {
            i2 = 6;
        }
        return new QuestionCollectionRequest(i, i2, T7P.INVITATION.getValue(), T7Z.SUGGESTED_TAB.getValue(), null, 16, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(X.InterfaceC67352kd<? super X.C76800UCe> r18) {
        /*
            r17 = this;
            r3 = r18
            boolean r0 = r3 instanceof X.T7Y
            r7 = r17
            if (r0 == 0) goto L8c
            r5 = r3
            X.T7Y r5 = (X.T7Y) r5
            int r2 = r5.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8c
            int r2 = r2 - r1
            r5.LJLJJI = r2
        L16:
            java.lang.Object r9 = r5.LJLILLLLZI
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJI
            r8 = 0
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L31
            if (r0 == r2) goto L2b
            if (r0 != r3) goto L92
            X.C141335gf.LIZJ(r9)
        L28:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L2b:
            X.T7O r6 = r5.LJLIL
            X.C141335gf.LIZJ(r9)
            goto L6e
        L31:
            X.C141335gf.LIZJ(r9)
            com.ss.android.ugc.aweme.qna.api.QuestionCollectionRequest[] r1 = new com.ss.android.ugc.aweme.qna.api.QuestionCollectionRequest[r3]
            int r0 = r7.LIZJ
            com.ss.android.ugc.aweme.qna.api.QuestionCollectionRequest r0 = r7.LJIIIIZZ(r0)
            r1[r8] = r0
            int r10 = r7.LIZLLL
            com.ss.android.ugc.aweme.qna.api.QuestionCollectionRequest r9 = new com.ss.android.ugc.aweme.qna.api.QuestionCollectionRequest
            int r11 = r7.LJI
            X.T7P r0 = X.T7P.RECOMMEND
            int r12 = r0.getValue()
            X.T7Z r0 = X.T7Z.SUGGESTED_TAB
            int r13 = r0.getValue()
            r14 = 0
            r15 = 16
            r16 = r14
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r1[r2] = r9
            java.util.List r6 = X.C47261Igj.LJJIJIIJI(r1)
            X.2fm r1 = X.C64342fm.LIZ
            X.XKW r0 = r7.LIZIZ
            r5.LJLIL = r7
            r5.LJLJJI = r2
            java.lang.Object r9 = r1.LIZ(r0, r6, r5)
            if (r9 != r4) goto L6d
            return r4
        L6d:
            r6 = r7
        L6e:
            java.lang.String r9 = (java.lang.String) r9
            X.T7P[] r1 = new X.T7P[r3]
            X.T7P r0 = X.T7P.RECOMMEND
            r1[r8] = r0
            X.T7P r0 = X.T7P.INVITATION
            r1[r2] = r0
            java.util.List r2 = X.C47261Igj.LJJIJIIJI(r1)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0 = 0
            r5.LJLIL = r0
            r5.LJLJJI = r3
            java.lang.Object r0 = LJI(r6, r9, r2, r1, r5)
            if (r0 != r4) goto L28
            return r4
        L8c:
            X.T7Y r5 = new X.T7Y
            r5.<init>(r7, r3)
            goto L16
        L92:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T7O.LJIIIZ(X.2kd):java.lang.Object");
    }

    public final void LJIIJJI(Boolean bool) {
        if (bool != null) {
            this.LJIJJLI.set(bool.booleanValue());
        }
        MutableLiveData<C74100T6i<List<C74125T7h>>> mutableLiveData = this.LJIIIZ;
        ArrayList arrayList = new ArrayList();
        if (C34443DfT.LIZ && this.LJJI != MIL.FYP_BANNER && !C52201KeD.LIZ) {
            arrayList.add(new C74141T7x(7, null, null, null, null, null, null, null, null, false, null, 16382));
        }
        T7D t7d = this.LIZ;
        T7P qcRequestType = T7P.MIXED;
        t7d.getClass();
        o.LJIIIZ(qcRequestType, "qcRequestType");
        if (t7d.LIZJ(qcRequestType).size() > 0) {
            T7D t7d2 = this.LIZ;
            t7d2.getClass();
            ORS.LJJLIIIJILLIZJL(V1B.LJJIIZI(t7d2.LIZJ(qcRequestType), EnumC46460ILg.UNKNOWN), arrayList);
        } else {
            T7D t7d3 = this.LIZ;
            T7P qcRequestType2 = T7P.INVITATION;
            t7d3.getClass();
            o.LJIIIZ(qcRequestType2, "qcRequestType");
            if (t7d3.LIZJ(qcRequestType2).size() > 0) {
                T7D t7d4 = this.LIZ;
                t7d4.getClass();
                List<C74141T7x> LJJIIZI = V1B.LJJIIZI(t7d4.LIZJ(qcRequestType2), EnumC46460ILg.IS_INVITE);
                arrayList.add(new C74141T7x(1, "invitesTitle", null, null, null, null, null, EF7.LIZIZ().getString(R.string.pq3), null, false, null, 16124));
                for (C74141T7x c74141T7x : LJJIIZI) {
                    c74141T7x.LJIIJ = false;
                    c74141T7x.LJIIJJI = false;
                }
                ORS.LJJLIIIJILLIZJL(LJJIIZI, arrayList);
                T7D t7d5 = this.LIZ;
                T7P qcRequestType3 = T7P.RECOMMEND;
                t7d5.getClass();
                o.LJIIIZ(qcRequestType3, "qcRequestType");
                if (t7d5.LIZJ(qcRequestType3).size() > 0) {
                    if (this.LJIJJLI.get()) {
                        ((C74141T7x) AnonymousClass028.LIZIZ(arrayList, 1, arrayList)).LJIIJ = false;
                        ((C74141T7x) AnonymousClass028.LIZIZ(arrayList, 1, arrayList)).LJIIJJI = true;
                    } else {
                        ((C74141T7x) AnonymousClass028.LIZIZ(arrayList, 1, arrayList)).LJIIJ = this.LJIL.get();
                    }
                }
            }
            T7D t7d6 = this.LIZ;
            T7P qcRequestType4 = T7P.RECOMMEND;
            t7d6.getClass();
            o.LJIIIZ(qcRequestType4, "qcRequestType");
            if (t7d6.LIZJ(qcRequestType4).size() > 0) {
                T7D t7d7 = this.LIZ;
                t7d7.getClass();
                o.LJIIIZ(qcRequestType4, "qcRequestType");
                List LJJIIZI2 = V1B.LJJIIZI(t7d7.LIZJ(qcRequestType4), EnumC46460ILg.IS_NOT_INVITE);
                if (this.LJJI != MIL.FYP_BANNER) {
                    arrayList.add(new C74141T7x(1, "QnaSuggestedRepository", null, null, null, null, null, EF7.LIZIZ().getString(R.string.pq4), null, false, null, 16124));
                }
                ORS.LJJLIIIJILLIZJL(LJJIIZI2, arrayList);
            }
        }
        int i = this.LJJ + 1;
        this.LJJ = i;
        arrayList.add(new C74141T7x(0, String.valueOf(i), null, null, null, null, null, null, null, false, null, 16380));
        if (arrayList.size() > 1) {
            arrayList.add(new C74141T7x(6, "void", null, null, null, null, null, null, null, false, null, 16380));
        }
        mutableLiveData.setValue(new C74100T6i<>(arrayList));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(2:10|11)(2:20|21))(2:22|(3:24|15|16)(2:25|(2:27|28)(1:29)))|12|(3:14|15|16)(2:18|19)))|31|6|7|(0)(0)|12|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b8, code lost:
    
        X.C36922EeM.LIZLLL(4, "QnaSuggestedRepository", "Delete Invite Error");
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0096 A[Catch: Exception -> 0x00b8, TryCatch #0 {Exception -> 0x00b8, blocks: (B:11:0x008d, B:12:0x0090, B:14:0x0096, B:18:0x00b0, B:19:0x00b7, B:25:0x0071), top: B:7:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b0 A[Catch: Exception -> 0x00b8, TryCatch #0 {Exception -> 0x00b8, blocks: (B:11:0x008d, B:12:0x0090, B:14:0x0096, B:18:0x00b0, B:19:0x00b7, B:25:0x0071), top: B:7:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r10, X.InterfaceC67352kd<? super X.C76800UCe> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.T7S
            if (r0 == 0) goto L24
            r7 = r11
            X.T7S r7 = (X.T7S) r7
            int r2 = r7.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r7.LJLJJL = r2
        L12:
            java.lang.Object r1 = r7.LJLJI
            X.NAu r8 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLJJL
            r6 = 1
            if (r0 == 0) goto L32
            if (r0 != r6) goto L2a
            java.lang.Object r10 = r7.LJLILLLLZI
            java.lang.String r10 = (java.lang.String) r10
            X.T7O r3 = r7.LJLIL
            goto L8d
        L24:
            X.T7S r7 = new X.T7S
            r7.<init>(r9, r11)
            goto L12
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C141335gf.LIZJ(r1)
            java.lang.String r0 = "qna_suggested_repo"
            r5 = 0
            com.bytedance.keva.Keva r4 = com.bytedance.keva.KevaImpl.getRepo(r0, r5)
            java.lang.String r0 = "getRepo(QNA_SUGGESTED_RE…ants.MODE_SINGLE_PROCESS)"
            kotlin.jvm.internal.o.LJIIIIZZ(r4, r0)
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.HG3.LJIILL()
            X.RBX r0 = (X.RBX) r0
            java.lang.String r3 = r0.getCurUserId()
            java.lang.String r2 = "first_time_delete_invite"
            boolean r0 = defpackage.m0.LIZLLL(r2, r3, r4, r6)
            if (r0 == 0) goto L71
            androidx.lifecycle.MutableLiveData<X.T6i<java.lang.String>> r1 = r9.LJIILL
            X.T6i r0 = new X.T6i
            r0.<init>(r10)
            r1.setValue(r0)
            java.lang.StringBuilder r0 = X.X1D.LIZ()
            r0.append(r2)
            r0.append(r3)
            java.lang.String r0 = X.X1D.LIZIZ(r0)
            r4.storeBoolean(r0, r5)
        L6e:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L71:
            X.ECY r0 = com.ss.android.ugc.aweme.qna.api.QnaApiV2.LIZ     // Catch: java.lang.Exception -> Lb8
            r0.getClass()     // Catch: java.lang.Exception -> Lb8
            com.ss.android.ugc.aweme.qna.api.QnaApiV2 r2 = X.ECY.LIZIZ()     // Catch: java.lang.Exception -> Lb8
            long r0 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r10)     // Catch: java.lang.Exception -> Lb8
            r7.LJLIL = r9     // Catch: java.lang.Exception -> Lb8
            r7.LJLILLLLZI = r10     // Catch: java.lang.Exception -> Lb8
            r7.LJLJJL = r6     // Catch: java.lang.Exception -> Lb8
            java.lang.Object r1 = r2.deleteInviteQuestion(r0, r7)     // Catch: java.lang.Exception -> Lb8
            if (r1 != r8) goto L8b
            goto Lc1
        L8b:
            r3 = r9
            goto L90
        L8d:
            X.C141335gf.LIZJ(r1)     // Catch: java.lang.Exception -> Lb8
        L90:
            com.ss.android.ugc.aweme.qna.api.TiktokV1ForumInviteQuestionDeleteResponse r1 = (com.ss.android.ugc.aweme.qna.api.TiktokV1ForumInviteQuestionDeleteResponse) r1     // Catch: java.lang.Exception -> Lb8
            int r0 = r1.statusCode     // Catch: java.lang.Exception -> Lb8
            if (r0 != 0) goto Lb0
            X.T7D r0 = r3.LIZ     // Catch: java.lang.Exception -> Lb8
            r0.LIZLLL(r10)     // Catch: java.lang.Exception -> Lb8
            r1 = 0
            r3.LJIIJJI(r1)     // Catch: java.lang.Exception -> Lb8
            X.T7D r0 = r3.LIZ     // Catch: java.lang.Exception -> Lb8
            X.KKR r2 = r0.LIZIZ(r1)     // Catch: java.lang.Exception -> Lb8
            androidx.lifecycle.MutableLiveData<X.T6i<X.KKR>> r1 = r3.LJIILIIL     // Catch: java.lang.Exception -> Lb8
            X.T6i r0 = new X.T6i     // Catch: java.lang.Exception -> Lb8
            r0.<init>(r2)     // Catch: java.lang.Exception -> Lb8
            r1.setValue(r0)     // Catch: java.lang.Exception -> Lb8
            goto L6e
        Lb0:
            java.lang.Exception r1 = new java.lang.Exception     // Catch: java.lang.Exception -> Lb8
            java.lang.String r0 = "status code error"
            r1.<init>(r0)     // Catch: java.lang.Exception -> Lb8
            throw r1     // Catch: java.lang.Exception -> Lb8
        Lb8:
            java.lang.String r2 = "Delete Invite Error"
            r1 = 4
            java.lang.String r0 = "QnaSuggestedRepository"
            X.C36922EeM.LIZLLL(r1, r0, r2)
            goto L6e
        Lc1:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T7O.LIZ(java.lang.String, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.util.List<java.lang.Long> r14, X.InterfaceC67352kd<? super X.C76800UCe> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof X.T7U
            if (r0 == 0) goto L78
            r4 = r15
            X.T7U r4 = (X.T7U) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L78
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r7 = r4.LJLILLLLZI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJI
            r5 = 2
            r6 = 1
            if (r0 == 0) goto L2c
            if (r0 == r6) goto L26
            if (r0 != r5) goto L7e
            X.C141335gf.LIZJ(r7)
        L23:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L26:
            X.T7O r2 = r4.LJLIL
            X.C141335gf.LIZJ(r7)
            goto L64
        L2c:
            X.C141335gf.LIZJ(r7)
            com.google.android.play.core.appupdate.h r0 = r13.LJIJJ
            X.T7P r1 = X.T7P.RECOMMEND
            boolean r0 = r0.LIZIZ(r1)
            if (r0 == 0) goto L3c
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L3c:
            int r8 = r13.LIZLLL
            com.ss.android.ugc.aweme.qna.api.QuestionCollectionRequest r7 = new com.ss.android.ugc.aweme.qna.api.QuestionCollectionRequest
            int r9 = r13.LJI
            int r10 = r1.getValue()
            X.T7Z r0 = X.T7Z.FYP_BOTTOM_BAR
            int r11 = r0.getValue()
            r12 = r14
            r7.<init>(r8, r9, r10, r11, r12)
            java.util.List r2 = X.C47261Igj.LJJIJ(r7)
            X.2fm r1 = X.C64342fm.LIZ
            X.XKW r0 = r13.LIZIZ
            r4.LJLIL = r13
            r4.LJLJJI = r6
            java.lang.Object r7 = r1.LIZ(r0, r2, r4)
            if (r7 != r3) goto L63
            return r3
        L63:
            r2 = r13
        L64:
            java.lang.String r7 = (java.lang.String) r7
            X.T7P r0 = X.T7P.RECOMMEND
            java.util.List r1 = X.C47261Igj.LJJIJ(r0)
            r0 = 0
            r4.LJLIL = r0
            r4.LJLJJI = r5
            java.lang.Object r0 = LJI(r2, r7, r1, r0, r4)
            if (r0 != r3) goto L23
            return r3
        L78:
            X.T7U r4 = new X.T7U
            r4.<init>(r13, r15)
            goto L12
        L7e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T7O.LIZJ(java.util.List, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0082 A[Catch: Exception -> 0x009b, TryCatch #0 {Exception -> 0x009b, blocks: (B:11:0x0079, B:12:0x007c, B:14:0x0082, B:18:0x0092, B:19:0x0099), top: B:10:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0092 A[Catch: Exception -> 0x009b, TryCatch #0 {Exception -> 0x009b, blocks: (B:11:0x0079, B:12:0x007c, B:14:0x0082, B:18:0x0092, B:19:0x0099), top: B:10:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(java.lang.String r10, int r11, X.InterfaceC67352kd<? super X.C76800UCe> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof X.T7R
            if (r0 == 0) goto L2a
            r4 = r12
            X.T7R r4 = (X.T7R) r4
            int r2 = r4.LJLJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2a
            int r2 = r2 - r1
            r4.LJLJL = r2
        L12:
            java.lang.Object r1 = r4.LJLJJL
            X.NAu r8 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJL
            r5 = 0
            r7 = 1
            r6 = 0
            if (r0 == 0) goto L38
            if (r0 != r7) goto L30
            int r3 = r4.LJLJJI
            int r11 = r4.LJLJI
            java.lang.Object r10 = r4.LJLILLLLZI
            java.lang.String r10 = (java.lang.String) r10
            X.T7O r4 = r4.LJLIL
            goto L79
        L2a:
            X.T7R r4 = new X.T7R
            r4.<init>(r9, r12)
            goto L12
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L38:
            X.C141335gf.LIZJ(r1)
            if (r11 != 0) goto L57
            r3 = 1
        L3e:
            X.T7D r0 = r9.LIZ
            com.ss.android.ugc.aweme.question.ForumStruct r1 = r0.LJ(r3, r10)
            if (r1 == 0) goto L53
            X.7Pv r0 = new X.7Pv
            r0.<init>(r1)
            X.C2U8.LIZ(r0)
            X.0M6<java.lang.String, X.MI0> r0 = X.C56564MHw.LIZ
            r0.LIZLLL(r10)
        L53:
            r9.LJIIJJI(r5)
            goto L59
        L57:
            r3 = 0
            goto L3e
        L59:
            X.ECY r0 = com.ss.android.ugc.aweme.qna.api.QnaApiV2.LIZ     // Catch: java.lang.Exception -> L9a
            r0.getClass()     // Catch: java.lang.Exception -> L9a
            com.ss.android.ugc.aweme.qna.api.QnaApiV2 r2 = X.ECY.LIZIZ()     // Catch: java.lang.Exception -> L9a
            long r0 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r10)     // Catch: java.lang.Exception -> L9a
            r4.LJLIL = r9     // Catch: java.lang.Exception -> L9a
            r4.LJLILLLLZI = r10     // Catch: java.lang.Exception -> L9a
            r4.LJLJI = r11     // Catch: java.lang.Exception -> L9a
            r4.LJLJJI = r3     // Catch: java.lang.Exception -> L9a
            r4.LJLJL = r7     // Catch: java.lang.Exception -> L9a
            java.lang.Object r1 = r2.collectQuestion(r0, r3, r4)     // Catch: java.lang.Exception -> L9a
            if (r1 != r8) goto L77
            return r8
        L77:
            r4 = r9
            goto L7c
        L79:
            X.C141335gf.LIZJ(r1)     // Catch: java.lang.Exception -> L9b
        L7c:
            com.ss.android.ugc.aweme.qna.api.TiktokV1ForumQuestionCollectResponse r1 = (com.ss.android.ugc.aweme.qna.api.TiktokV1ForumQuestionCollectResponse) r1     // Catch: java.lang.Exception -> L9b
            int r0 = r1.statusCode     // Catch: java.lang.Exception -> L9b
            if (r0 != 0) goto L92
            androidx.lifecycle.MutableLiveData<X.T6i<X.RTm>> r2 = r4.LJIIJJI     // Catch: java.lang.Exception -> L9b
            X.T6i r1 = new X.T6i     // Catch: java.lang.Exception -> L9b
            X.RTm r0 = new X.RTm     // Catch: java.lang.Exception -> L9b
            r0.<init>(r10, r7, r3)     // Catch: java.lang.Exception -> L9b
            r1.<init>(r0)     // Catch: java.lang.Exception -> L9b
            r2.setValue(r1)     // Catch: java.lang.Exception -> L9b
            goto Lc3
        L92:
            java.lang.Exception r1 = new java.lang.Exception     // Catch: java.lang.Exception -> L9b
            java.lang.String r0 = "status code error"
            r1.<init>(r0)     // Catch: java.lang.Exception -> L9b
            throw r1     // Catch: java.lang.Exception -> L9b
        L9a:
            r4 = r9
        L9b:
            androidx.lifecycle.MutableLiveData<X.T6i<X.RTm>> r3 = r4.LJIIJJI
            X.T6i r2 = new X.T6i
            X.RTm r1 = new X.RTm
            r0 = -1
            r1.<init>(r10, r6, r0)
            r2.<init>(r1)
            r3.setValue(r2)
            X.T7D r0 = r4.LIZ
            com.ss.android.ugc.aweme.question.ForumStruct r1 = r0.LJ(r11, r10)
            if (r1 == 0) goto Lc0
            X.7Pv r0 = new X.7Pv
            r0.<init>(r1)
            X.C2U8.LIZ(r0)
            X.0M6<java.lang.String, X.MI0> r0 = X.C56564MHw.LIZ
            r0.LIZLLL(r10)
        Lc0:
            r4.LJIIJJI(r5)
        Lc3:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T7O.LJIIJ(java.lang.String, int, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:3|(8:5|6|7|(1:(1:(3:11|12|13)(2:58|59))(3:60|61|62))(3:63|64|(2:66|(1:68)(2:69|62))(2:70|(1:72)(2:73|13)))|14|(1:57)|16|(5:18|(3:20|21|(1:23))(2:28|(3:30|(10:33|(1:35)|36|(5:38|(1:40)|41|(1:43)|44)|45|(1:47)|48|(2:50|51)(1:53)|52|31)|54))|24|25|26)(2:55|56)))|7|(0)(0)|14|(0)|16|(0)(0)) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014e A[Catch: Exception -> 0x0157, all -> 0x016e, TryCatch #1 {Exception -> 0x0157, blocks: (B:12:0x0086, B:13:0x0089, B:14:0x0091, B:16:0x0098, B:21:0x0129, B:23:0x012d, B:24:0x013a, B:28:0x00b0, B:30:0x00b4, B:31:0x00b8, B:33:0x00be, B:35:0x00ce, B:36:0x00d2, B:38:0x00dc, B:40:0x00e6, B:41:0x00eb, B:43:0x00ef, B:44:0x00fa, B:45:0x0106, B:47:0x011b, B:48:0x011d, B:50:0x0123, B:52:0x0125, B:55:0x014e, B:56:0x0155, B:61:0x008c, B:62:0x008f), top: B:7:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(java.lang.String r9, java.util.List<? extends X.T7P> r10, java.lang.Boolean r11, boolean r12, X.InterfaceC67352kd<? super X.C76800UCe> r13) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T7O.LJFF(java.lang.String, java.util.List, java.lang.Boolean, boolean, X.2kd):java.lang.Object");
    }
}
