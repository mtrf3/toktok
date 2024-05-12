package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import com.ss.android.ugc.aweme.experiment.CommentPreloadExperiment;

/* renamed from: X.6vl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C176176vl extends C51031K1b<C176376w5> {
    public boolean LJLJJL;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    @Override // X.C51031K1b, X.C8BR, X.C8BT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSuccess() {
        /*
            r5 = this;
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "CommentFetchPresenter: onSuccess(): aid = "
            r1.append(r0)
            T extends X.8BS r0 = r5.LJLIL
            if (r0 != 0) goto Lcf
            r0 = 0
        Le:
            r1.append(r0)
            java.lang.String r0 = " logPb: impr_id = "
            r1.append(r0)
            T extends X.8BS r0 = r5.LJLIL
            X.6w5 r0 = (X.C176376w5) r0
            java.lang.String r0 = LJJIIZ(r0)
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C176186vm.LIZ(r0)
            T extends X.8BS r1 = r5.LJLIL
            X.6w5 r1 = (X.C176376w5) r1
            r1.getClass()
            com.ss.android.ugc.aweme.experiment.CommentPreloadExperiment$Meta r0 = com.ss.android.ugc.aweme.experiment.CommentPreloadExperiment.LIZ()
            boolean r0 = r0.isEnable()
            r4 = 1
            if (r0 == 0) goto Lc6
            boolean r0 = r1.LJLJL
            if (r0 == 0) goto Lc6
        L3e:
            T extends X.8BS r0 = r5.LJLIL
            if (r0 == 0) goto L51
            X.K1g r0 = (X.AbstractC51036K1g) r0
            int r1 = r0.mListQueryType
            r0 = 4
            if (r1 != r0) goto L51
            X.6vg r2 = X.C176096vd.LIZ
            long r0 = java.lang.System.currentTimeMillis()
            r2.LJ = r0
        L51:
            X.Ol8 r0 = X.C7CA.LJFF
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 500(0x1f4, double:2.47E-321)
            if (r0 == 0) goto L6c
            X.FNH r1 = X.FNH.LIZ
            java.lang.String r0 = "start_jit_block"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r1.LIZ(r2, r0)
        L6c:
            boolean r0 = X.C7CA.LIZIZ()
            if (r0 == 0) goto L7d
            X.FNH r1 = X.FNH.LIZ
            java.lang.String r0 = "start_boot_finish"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r1.LIZ(r2, r0)
        L7d:
            r5.LJLJJL = r4
            T extends X.8BS r1 = r5.LJLIL
            if (r1 == 0) goto L9b
            K extends X.2K3 r0 = r5.LJLILLLLZI
            if (r0 == 0) goto L9b
            X.K1g r1 = (X.AbstractC51036K1g) r1
            int r0 = r1.mListQueryType
            if (r0 != r4) goto L9b
            T r0 = r1.mData
            com.ss.android.ugc.aweme.comment.model.CommentItemList r0 = (com.ss.android.ugc.aweme.comment.model.CommentItemList) r0
            java.util.List<com.ss.android.ugc.aweme.comment.model.CommentGiftStruct> r0 = r0.topGiftList
            if (r0 == 0) goto L9b
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lae
        L9b:
            super.onSuccess()
        L9e:
            T extends X.8BS r0 = r5.LJLIL
            if (r0 == 0) goto Lad
            X.6w5 r0 = (X.C176376w5) r0
            java.lang.String r2 = r0.LJLJI
            long r0 = r0.LJIILIIL()
            X.C178406zM.LJIIL(r0, r2)
        Lad:
            return
        Lae:
            K extends X.2K3 r2 = r5.LJLILLLLZI
            X.8pR r2 = (X.InterfaceC223218pR) r2
            T extends X.8BS r0 = r5.LJLIL
            X.K1g r0 = (X.AbstractC51036K1g) r0
            java.util.List r1 = r0.getItems()
            T extends X.8BS r0 = r5.LJLIL
            X.K1g r0 = (X.AbstractC51036K1g) r0
            boolean r0 = r0.isHasMore()
            r2.J5(r1, r0)
            goto L9e
        Lc6:
            java.lang.String r1 = "comment"
            java.lang.String r0 = "info"
            X.C48027It5.LJ(r1, r0)
            goto L3e
        Lcf:
            X.6w5 r0 = (X.C176376w5) r0
            java.lang.String r0 = r0.LJLJI
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C176176vl.onSuccess():void");
    }

    public static String LJJIIZ(C176376w5 c176376w5) {
        if (c176376w5 == null || c176376w5.getData() == null || c176376w5.getData().logPd == null) {
            return null;
        }
        return c176376w5.getData().logPd.getImprId();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C8BR
    public final boolean LJIILL(Object... objArr) {
        T t = this.LJLIL;
        if (t != 0) {
            AbstractC51036K1g abstractC51036K1g = (AbstractC51036K1g) t;
            if (abstractC51036K1g.mListQueryType == 4) {
                int i = 1;
                if (((CommentItemList) abstractC51036K1g.getData()) != null) {
                    i = 1 + ((int) Math.ceil(r0.cursor / 20));
                }
                C176126vg c176126vg = C176096vd.LIZ;
                c176126vg.LJI = i;
                c176126vg.LJII = 20;
                c176126vg.LJFF = C176096vd.LIZIZ();
                c176126vg.LIZLLL = System.currentTimeMillis();
            }
        }
        return super.LJIILL(objArr);
    }

    @Override // X.C51031K1b, X.C8BR, X.C8BT
    public final void onFailed(Exception exc) {
        String str;
        String message;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CommentFetchPresenter: onFailed() => aid = ");
        T t = this.LJLIL;
        if (t == 0) {
            str = null;
        } else {
            str = ((C176376w5) t).LJLJI;
        }
        LIZ.append(str);
        LIZ.append(" logPb: impr_id = ");
        LIZ.append(LJJIIZ((C176376w5) this.LJLIL));
        LIZ.append(" exceptionType = ");
        LIZ.append(C64920Pds.LIZ(EF7.LIZIZ(), exc));
        LIZ.append(" ");
        LIZ.append(exc.getMessage());
        C36922EeM.LIZLLL(6, "CommentLog", X1D.LIZIZ(LIZ));
        C176376w5 c176376w5 = (C176376w5) this.LJLIL;
        c176376w5.getClass();
        boolean z = false;
        if (!CommentPreloadExperiment.LIZ().isEnable() || !c176376w5.LJLJL) {
            C48027It5.LIZIZ(C64920Pds.LIZ(EF7.LIZIZ(), exc), "comment", "info");
        }
        T t2 = this.LJLIL;
        if (t2 != 0 && ((AbstractC51036K1g) t2).mListQueryType == 4) {
            C176096vd.LIZ.LJ = System.currentTimeMillis();
        }
        if (((Boolean) C7CA.LJFF.getValue()).booleanValue()) {
            FNH.LIZ.LIZ(500L, new String[]{"start_jit_block"});
        }
        if (C7CA.LIZIZ()) {
            FNH.LIZ.LIZ(500L, new String[]{"start_boot_finish"});
        }
        T t3 = this.LJLIL;
        if (t3 != 0) {
            C176376w5 c176376w52 = (C176376w5) t3;
            if (TextUtils.equals(c176376w52.LJLJJI, "v1") || TextUtils.equals(c176376w52.LJLJJI, "v2")) {
                EF7.LIZIZ();
                try {
                    z = C2NU.LIZ.LIZIZ();
                } catch (Exception unused) {
                }
                if (z) {
                    C176376w5 c176376w53 = (C176376w5) this.LJLIL;
                    String str2 = c176376w53.LJLJJI;
                    String str3 = c176376w53.LJLJI;
                    long j = c176376w53.LJLL;
                    String name = exc.getClass().getName();
                    Throwable cause = exc.getCause();
                    if ((cause == null || (message = cause.getMessage()) == null) && (message = exc.getMessage()) == null) {
                        message = "";
                    }
                    C176546wM.LIZ(201, str2, str3, j, name, message);
                }
            }
        }
        this.LJLJJL = true;
        super.onFailed(exc);
        C16880lQ.LLLLIIL(exc);
        T t4 = this.LJLIL;
        if (t4 != 0) {
            ((AbstractC176576wP) t4).LJLILLLLZI.LJI(C64920Pds.LIZ(EF7.LIZIZ(), exc));
        }
    }
}
