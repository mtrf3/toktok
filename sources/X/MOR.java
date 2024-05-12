package X;

import com.ss.android.ugc.aweme.inbox.api.MultiApiManager;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes10.dex */
public final class MOR implements InterfaceC88763e4 {
    public static AbstractC73672Svk LJJJLL() {
        int i;
        MultiApiManager.API LIZ = MultiApiManager.LIZ();
        java.util.Map<String, String> liveParams = LiveOuterService.LJJJLL().LJJIJIL().LJJIJLIJ(EF7.LIZIZ());
        if (o.LJ(Boolean.TRUE, a.LJFF().LJFF().getValue()) && C35971E9v.LIZ()) {
            o.LJIIIIZZ(liveParams, "liveParams");
            liveParams.put("is_non_personalized", "1");
        }
        if (INB.LIZIZ()) {
            i = 11;
        } else {
            i = 12;
        }
        boolean LIZ2 = C56630MKk.LIZ();
        return LIZ.fetchCombineNotice(5, "tiktok_message", 0L, 3, 81, 0, liveParams, i, false, LIZ2 ? 1 : 0, Integer.valueOf(C53272KvU.LIZ()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Type inference failed for: r0v14, types: [T, X.3C1] */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, X.33X] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJIL(X.InterfaceC67352kd<? super X.AbstractC72932td<com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineResponse>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.MOT
            if (r0 == 0) goto L20
            r5 = r7
            X.MOT r5 = (X.MOT) r5
            int r2 = r5.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r5.LJLJJI = r2
        L12:
            java.lang.Object r2 = r5.LJLILLLLZI
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJI
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L26
            X.2mC r3 = r5.LJLIL
            goto L45
        L20:
            X.MOT r5 = new X.MOT
            r5.<init>(r6, r7)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.2mC r3 = X.C793239k.LIZ(r2)
            X.33X r0 = X.C33X.LIZ
            r3.element = r0
            X.Svk r0 = LJJJLL()     // Catch: java.lang.Throwable -> L51
            r5.LJLIL = r3     // Catch: java.lang.Throwable -> L51
            r5.LJLJJI = r1     // Catch: java.lang.Throwable -> L51
            java.lang.Object r2 = X.C77318UWc.LIZIZ(r0, r5)     // Catch: java.lang.Throwable -> L51
            if (r2 != r4) goto L48
            goto L50
        L45:
            X.C141335gf.LIZJ(r2)     // Catch: java.lang.Throwable -> L4e
        L48:
            com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineResponse r2 = (com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineResponse) r2     // Catch: java.lang.Throwable -> L4e
            X.C3C5.m7constructorimpl(r2)     // Catch: java.lang.Throwable -> L4e
            goto L59
        L4e:
            r0 = move-exception
            goto L52
        L50:
            return r4
        L51:
            r0 = move-exception
        L52:
            X.3C4 r2 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r2)
        L59:
            java.lang.Throwable r1 = X.C3C5.m10exceptionOrNullimpl(r2)
            if (r1 == 0) goto L66
            X.3C1 r0 = new X.3C1
            r0.<init>(r1)
            r3.element = r0
        L66:
            boolean r0 = X.C3C5.m13isSuccessimpl(r2)
            if (r0 == 0) goto L7e
            com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineResponse r2 = (com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineResponse) r2
            if (r2 != 0) goto L81
            X.3C1 r0 = new X.3C1
            java.lang.Throwable r2 = new java.lang.Throwable
            java.lang.String r1 = "response is null"
            r2.<init>(r1)
            r0.<init>(r2)
        L7c:
            r3.element = r0
        L7e:
            T r0 = r3.element
            return r0
        L81:
            com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineDatas r0 = r2.getData()
            if (r0 != 0) goto L94
            X.3C1 r0 = new X.3C1
            java.lang.Throwable r2 = new java.lang.Throwable
            java.lang.String r1 = "response.data is null"
            r2.<init>(r1)
            r0.<init>(r2)
            goto L7c
        L94:
            X.2tb r0 = new X.2tb
            r0.<init>(r2)
            goto L7c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MOR.LJJJIL(X.2kd):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:1|(2:3|(11:5|6|(1:(3:9|10|11)(2:32|33))(12:34|35|36|(1:38)(1:56)|39|(1:41)(1:55)|42|(1:44)(1:54)|45|46|47|(2:49|50))|13|14|15|(1:17)|18|(3:20|(1:22)(1:24)|23)|25|26))|58|6|(0)(0)|13|14|15|(0)|18|(0)|25|26|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ef, code lost:
    
        r2 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r2v6, types: [T, X.3C1] */
    /* JADX WARN: Type inference failed for: r5v2, types: [T, X.33X] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LLIIIILZ(int r18, java.lang.String r19, java.util.List<com.ss.android.ugc.aweme.notification.creator.model.TabSortCacheModel> r20, java.util.List<java.lang.Integer> r21, java.lang.String r22, int r23, int r24, boolean r25, boolean r26, X.MT7 r27, X.InterfaceC67352kd<? super X.AbstractC72932td<com.ss.android.ugc.aweme.notification.creator.model.response.CreatorNoticeResponse>> r28) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MOR.LLIIIILZ(int, java.lang.String, java.util.List, java.util.List, java.lang.String, int, int, boolean, boolean, X.MT7, X.2kd):java.lang.Object");
    }
}
