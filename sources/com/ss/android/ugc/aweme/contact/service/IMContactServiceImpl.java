package com.ss.android.ugc.aweme.contact.service;

import X.C38350F3i;
import X.C3GG;
import X.C3GH;
import X.C3GK;
import X.C3GL;
import X.C3ZG;
import X.C48841JEv;
import X.C74352vv;
import X.C78613UtF;
import X.C85913Yt;
import X.EE1;
import X.EFM;
import X.HG3;
import X.RBX;
import X.T2R;
import X.XKX;
import com.ss.android.ugc.aweme.contact.bytesync.IMContactInitTask;
import com.ss.android.ugc.aweme.contact.helper.IMContactListRequest;
import com.ss.android.ugc.aweme.social.model.MAFIMUser;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class IMContactServiceImpl implements IIMContactService {
    @Override // com.ss.android.ugc.aweme.contact.service.IIMContactService
    public final EE1 LJ() {
        C3ZG.LIZ.LIZ().storeLong("key_cold_start_timestamp", System.currentTimeMillis());
        return new IMContactInitTask();
    }

    @Override // com.ss.android.ugc.aweme.contact.service.IIMContactService
    public final void LJI() {
        C3ZG.LIZ.LIZ().storeLong("key_spotlight_relation_timestamp", System.currentTimeMillis());
    }

    @Override // com.ss.android.ugc.aweme.contact.service.IIMContactService
    public final EFM LJIIIZ() {
        return new IMContactListRequest();
    }

    @Override // com.ss.android.ugc.aweme.contact.service.IIMContactService
    public final void LIZJ() {
        if (((RBX) HG3.LJIILL()).isLogin()) {
            C3ZG c3zg = C3ZG.LIZ;
            String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
            if (c3zg.LIZ().contains("key_login_uid") && !o.LJ(curUserId, c3zg.LIZ().getString("key_login_uid", ""))) {
                c3zg.LIZ().storeString("key_login_uid", curUserId);
                C85913Yt.LIZ.getClass();
                XKX.LIZLLL(C85913Yt.LIZIZ, null, null, new C3GG(null), 3);
                XKX.LIZLLL(C85913Yt.LIZIZ, null, null, new C74352vv(null), 3);
                return;
            }
            return;
        }
        C85913Yt.LIZ.getClass();
        C48841JEv.LIZJ(C85913Yt.LIZIZ, null);
        C85913Yt.LIZIZ = C48841JEv.LIZ(C78613UtF.LIZJ.plus(T2R.LJIIJJI()));
        C3ZG c3zg2 = C3ZG.LIZ;
        c3zg2.LIZ().erase("key_contact_list_fetch_timestamp");
        c3zg2.LIZ().erase("key_contact_list_completeness_timestamp");
        c3zg2.LIZ().erase("key_spotlight_relation_timestamp");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
    
        if (r3 == null) goto L14;
     */
    @Override // com.ss.android.ugc.aweme.contact.service.IIMContactService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.im.service.model.IMUser LIZLLL(java.lang.String r9) {
        /*
            r8 = this;
            boolean r0 = X.C3QM.LIZ()
            r1 = 0
            if (r0 == 0) goto L55
            r5 = 0
            if (r9 == 0) goto L52
            java.lang.Long r0 = X.C38350F3i.LJJIZ(r9)
            if (r0 == 0) goto L52
            long r1 = r0.longValue()
            X.3Yt r0 = X.C85913Yt.LIZ
            java.lang.Long r7 = java.lang.Long.valueOf(r1)
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r0.getClass()
            if (r7 == 0) goto L52
            r7.longValue()
            long r3 = r7.longValue()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L53
            long r2 = r7.longValue()
            X.3ZA r1 = X.C3GL.LIZ()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            com.ss.android.ugc.aweme.im.service.model.IMUser r3 = r1.LJI(r0)
            if (r3 != 0) goto L51
        L40:
            boolean r0 = kotlin.jvm.internal.o.LJ(r6, r6)
            if (r0 == 0) goto L51
            X.2gm r2 = X.C85913Yt.LIZIZ
            X.2vy r1 = new X.2vy
            r1.<init>(r7, r5)
            r0 = 3
            X.XKX.LIZLLL(r2, r5, r5, r1, r0)
        L51:
            r5 = r3
        L52:
            return r5
        L53:
            r3 = r5
            goto L40
        L55:
            com.ss.android.ugc.aweme.im.service.IIMService r0 = com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService.createIIMServicebyMonsterPlugin(r1)
            X.3Zl r0 = r0.getImMafService()
            com.ss.android.ugc.aweme.social.model.MAFIMUser r5 = r0.LIZLLL(r9)
            if (r5 != 0) goto L52
            com.ss.android.ugc.aweme.im.service.IIMService r0 = com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService.createIIMServicebyMonsterPlugin(r1)
            X.3GF r0 = r0.getImUserService()
            com.ss.android.ugc.aweme.im.service.model.IMUser r5 = r0.LJIIL(r9)
            goto L52
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.contact.service.IMContactServiceImpl.LIZLLL(java.lang.String):com.ss.android.ugc.aweme.im.service.model.IMUser");
    }

    @Override // com.ss.android.ugc.aweme.contact.service.IIMContactService
    public final MAFIMUser LJFF(String str) {
        Long LJJIZ;
        if (str == null || (LJJIZ = C38350F3i.LJJIZ(str)) == null) {
            return null;
        }
        long longValue = LJJIZ.longValue();
        C85913Yt c85913Yt = C85913Yt.LIZ;
        Long valueOf = Long.valueOf(longValue);
        c85913Yt.getClass();
        if (valueOf == null) {
            return null;
        }
        return C3GL.LIZ().LIZLLL(valueOf.longValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e A[LOOP:0: B:12:0x0038->B:14:0x003e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.Collection] */
    @Override // com.ss.android.ugc.aweme.contact.service.IIMContactService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(X.InterfaceC67352kd<? super java.util.List<com.ss.android.ugc.aweme.contact.model.IMUserBaseInfo>> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof X.C3GI
            if (r0 == 0) goto Lc4
            r7 = r11
            X.3GI r7 = (X.C3GI) r7
            int r2 = r7.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lc4
            int r2 = r2 - r1
            r7.LJLJJI = r2
        L12:
            java.lang.Object r2 = r7.LJLILLLLZI
            X.NAu r8 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLJJI
            r6 = 10
            r5 = 2
            r1 = 1
            if (r0 == 0) goto L5a
            if (r0 == r1) goto Lde
            if (r0 != r5) goto Ld6
            java.lang.Object r4 = r7.LJLIL
            java.util.Collection r4 = (java.util.Collection) r4
            X.C141335gf.LIZJ(r2)
        L29:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r5 = new java.util.ArrayList
            int r0 = X.C32I.LJJL(r2, r6)
            r5.<init>(r0)
            java.util.Iterator r3 = r2.iterator()
        L38:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Lcb
            java.lang.Object r0 = r3.next()
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = (com.ss.android.ugc.aweme.im.service.model.IMUser) r0
            com.ss.android.ugc.aweme.contact.model.IMUserBaseInfo r2 = X.C77125UOr.LJJI(r0)
            X.3GJ r0 = X.C3GJ.OFF
            int r1 = r0.getStatus()
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r1)
            r2.setMafStatus(r0)
            r5.add(r2)
            goto L38
        L5a:
            X.C141335gf.LIZJ(r2)
            boolean r0 = X.C3QM.LIZ()
            if (r0 == 0) goto L75
            X.3Yt r0 = X.C85913Yt.LIZ
            r7.LJLJJI = r1
            r0.getClass()
            X.3Z2 r0 = X.C3GK.LIZ()
            java.lang.Object r2 = r0.LJII(r7)
            if (r2 != r8) goto Le1
            return r8
        L75:
            r9 = 0
            com.ss.android.ugc.aweme.im.service.IIMService r0 = com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService.createIIMServicebyMonsterPlugin(r9)
            X.3Zl r0 = r0.getImMafService()
            java.util.List r1 = r0.LIZJ()
            java.util.ArrayList r4 = new java.util.ArrayList
            int r0 = X.C32I.LJJL(r1, r6)
            r4.<init>(r0)
            java.util.Iterator r3 = r1.iterator()
        L8f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Lb1
            java.lang.Object r0 = r3.next()
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = (com.ss.android.ugc.aweme.im.service.model.IMUser) r0
            com.ss.android.ugc.aweme.contact.model.IMUserBaseInfo r2 = X.C77125UOr.LJJI(r0)
            X.3GJ r0 = X.C3GJ.ON
            int r1 = r0.getStatus()
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r1)
            r2.setMafStatus(r0)
            r4.add(r2)
            goto L8f
        Lb1:
            com.ss.android.ugc.aweme.im.service.IIMService r0 = com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService.createIIMServicebyMonsterPlugin(r9)
            X.3GF r0 = r0.getImUserService()
            r7.LJLIL = r4
            r7.LJLJJI = r5
            java.lang.Object r2 = r0.LJIILJJIL(r7)
            if (r2 != r8) goto L29
            return r8
        Lc4:
            X.3GI r7 = new X.3GI
            r7.<init>(r10, r11)
            goto L12
        Lcb:
            java.util.List r1 = X.ORZ.LLJILJILJ(r5)
            r0 = r1
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.addAll(r4)
            return r1
        Ld6:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lde:
            X.C141335gf.LIZJ(r2)
        Le1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.contact.service.IMContactServiceImpl.LJII(X.2kd):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.contact.service.IIMContactService
    public final MAFIMUser LJIIIIZZ(String str) {
        Long LJJIZ;
        if (str == null || (LJJIZ = C38350F3i.LJJIZ(str)) == null) {
            return null;
        }
        long longValue = LJJIZ.longValue();
        C85913Yt c85913Yt = C85913Yt.LIZ;
        Long valueOf = Long.valueOf(longValue);
        c85913Yt.getClass();
        if (valueOf == null) {
            return null;
        }
        return C3GK.LIZ().LJ(valueOf.longValue());
    }

    @Override // com.ss.android.ugc.aweme.contact.service.IIMContactService
    public final void LIZIZ(int i, String str) {
        Long LJJIZ;
        if (str != null && (LJJIZ = C38350F3i.LJJIZ(str)) != null) {
            long longValue = LJJIZ.longValue();
            C85913Yt.LIZ.getClass();
            XKX.LIZLLL(C85913Yt.LIZIZ, null, null, new C3GH(longValue, i, null), 3);
        }
    }
}
