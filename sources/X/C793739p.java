package X;

import android.app.Activity;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.ss.android.ugc.aweme.im.sdk.common.data.api.ImApi;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.services.RetrofitService;
import kotlin.jvm.internal.o;

/* renamed from: X.39p, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C793739p {
    public static final C793739p LIZ = new C793739p();
    public static final ImApi LIZIZ;

    static {
        Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(C30Y.LIZ).create(ImApi.class);
        o.LJIIIIZZ(create, "get().getService(IRetrof…create(ImApi::class.java)");
        LIZIZ = (ImApi) create;
    }

    public static final void LIZ(Activity activity, IMUser iMUser, int i, String origin) {
        o.LJIIIZ(origin, "origin");
        if (iMUser == null) {
            return;
        }
        C784636c c784636c = new C784636c(activity, iMUser, origin, null, null, null, null, LiveTryModeCountDownThresholdSetting.DEFAULT);
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (z != c784636c.LJLILLLLZI.isBlock()) {
            c784636c.LJI();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r6, java.lang.String r7, int r8, X.InterfaceC67352kd<? super com.ss.android.ugc.aweme.im.service.model.IMUser> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof X.C793839q
            if (r0 == 0) goto L3d
            r4 = r9
            X.39q r4 = (X.C793839q) r4
            int r2 = r4.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3d
            int r2 = r2 - r1
            r4.LJLJI = r2
        L12:
            java.lang.Object r3 = r4.LJLIL
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJI
            r1 = 1
            if (r0 == 0) goto L2f
            if (r0 != r1) goto L43
            X.C141335gf.LIZJ(r3)
        L20:
            com.ss.android.ugc.aweme.im.sdk.common.data.model.UserOtherResponse r3 = (com.ss.android.ugc.aweme.im.sdk.common.data.model.UserOtherResponse) r3
            if (r3 == 0) goto L2d
            com.ss.android.ugc.aweme.profile.model.User r0 = r3.getUser()
        L28:
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = com.ss.android.ugc.aweme.im.service.model.IMUser.fromUser(r0)
            return r0
        L2d:
            r0 = 0
            goto L28
        L2f:
            X.C141335gf.LIZJ(r3)
            com.ss.android.ugc.aweme.im.sdk.common.data.api.ImApi r0 = X.C793739p.LIZIZ
            r4.LJLJI = r1
            java.lang.Object r3 = r0.fetchUserOther(r6, r7, r8, r4)
            if (r3 != r2) goto L20
            return r2
        L3d:
            X.39q r4 = new X.39q
            r4.<init>(r5, r9)
            goto L12
        L43:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C793739p.LIZIZ(java.lang.String, java.lang.String, int, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r6, java.lang.String r7, int r8, X.InterfaceC67352kd<? super com.ss.android.ugc.aweme.im.service.model.IMUser> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof X.C793939r
            if (r0 == 0) goto L3d
            r4 = r9
            X.39r r4 = (X.C793939r) r4
            int r2 = r4.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3d
            int r2 = r2 - r1
            r4.LJLJI = r2
        L12:
            java.lang.Object r3 = r4.LJLIL
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJI
            r1 = 1
            if (r0 == 0) goto L2f
            if (r0 != r1) goto L43
            X.C141335gf.LIZJ(r3)
        L20:
            com.ss.android.ugc.aweme.im.sdk.common.data.model.UserSelfResponse r3 = (com.ss.android.ugc.aweme.im.sdk.common.data.model.UserSelfResponse) r3
            if (r3 == 0) goto L2d
            com.ss.android.ugc.aweme.profile.model.User r0 = r3.getUser()
        L28:
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = com.ss.android.ugc.aweme.im.service.model.IMUser.fromUser(r0)
            return r0
        L2d:
            r0 = 0
            goto L28
        L2f:
            X.C141335gf.LIZJ(r3)
            com.ss.android.ugc.aweme.im.sdk.common.data.api.ImApi r0 = X.C793739p.LIZIZ
            r4.LJLJI = r1
            java.lang.Object r3 = r0.fetchUserSelf(r6, r7, r8, r4)
            if (r3 != r2) goto L20
            return r2
        L3d:
            X.39r r4 = new X.39r
            r4.<init>(r5, r9)
            goto L12
        L43:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C793739p.LIZJ(java.lang.String, java.lang.String, int, X.2kd):java.lang.Object");
    }
}
