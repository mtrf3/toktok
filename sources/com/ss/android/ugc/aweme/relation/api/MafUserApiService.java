package com.ss.android.ugc.aweme.relation.api;

import X.AbstractC73638SvC;
import X.C790938n;
import X.E4Q;
import X.HH1;
import X.InterfaceC64989Pez;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.relation.model.MaFListResponse;
import com.ss.android.ugc.aweme.relation.model.MaFUserVideoListResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MafUserApiService implements IMafUserApi {
    public static final MafUserApiService LIZIZ = new MafUserApiService();
    public final /* synthetic */ IMafUserApi LIZ = (IMafUserApi) C790938n.LIZIZ.create(IMafUserApi.class);

    @Override // com.ss.android.ugc.aweme.relation.api.IMafUserApi
    @E4Q("/aweme/v1/recommend/user/dislike/")
    public Object dislikeUser(@InterfaceC64989Pez("user_id") String str, @InterfaceC64989Pez("sec_user_id") String str2, @InterfaceC64989Pez("scene") Integer num, @InterfaceC64989Pez("action_type") Integer num2, @InterfaceC64989Pez("maf_scene") Integer num3, InterfaceC67352kd<? super BaseResponse> interfaceC67352kd) {
        return this.LIZ.dislikeUser(str, str2, num, num2, num3, interfaceC67352kd);
    }

    @Override // com.ss.android.ugc.aweme.relation.api.IMafUserApi
    @E4Q("tiktok/user/relation/maf/items/v1")
    public AbstractC73638SvC<MaFUserVideoListResponse> getMaFVideoList(@InterfaceC64989Pez("scene") int i, @InterfaceC64989Pez("sec_target_user_id") String secTargetUid, @InterfaceC64989Pez("count") int i2, @InterfaceC64989Pez("page_token") String pageToken) {
        o.LJIIIZ(secTargetUid, "secTargetUid");
        o.LJIIIZ(pageToken, "pageToken");
        return this.LIZ.getMaFVideoList(i, secTargetUid, i2, pageToken);
    }

    @Override // com.ss.android.ugc.aweme.relation.api.IMafUserApi
    @E4Q("/tiktok/user/relation/maf/list/v1")
    public Object getRelatedUserList(@InterfaceC64989Pez("scene") int i, @InterfaceC64989Pez("count") int i2, @InterfaceC64989Pez("maf_type") Integer num, @InterfaceC64989Pez("target_user_ids") String str, InterfaceC67352kd<? super MaFListResponse> interfaceC67352kd) {
        return this.LIZ.getRelatedUserList(i, i2, num, str, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(com.ss.android.ugc.aweme.profile.model.User r12, X.EnumC57876MnY r13, int r14, int r15, X.InterfaceC67352kd<? super X.C76800UCe> r16) {
        /*
            r11 = this;
            r3 = r16
            boolean r0 = r3 instanceof X.C58026Mpy
            r4 = r11
            if (r0 == 0) goto L5f
            r10 = r3
            X.Mpy r10 = (X.C58026Mpy) r10
            int r2 = r10.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5f
            int r2 = r2 - r1
            r10.LJLJI = r2
        L15:
            java.lang.Object r3 = r10.LJLIL
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r10.LJLJI
            r1 = 1
            if (r0 == 0) goto L2b
            if (r0 != r1) goto L65
            X.C141335gf.LIZJ(r3)
        L23:
            X.Ee8 r3 = (X.AbstractC36908Ee8) r3
            r3.checkValid()
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L2b:
            X.C141335gf.LIZJ(r3)
            java.lang.String r5 = r12.getUid()
            java.lang.String r6 = ""
            if (r5 != 0) goto L37
            r5 = r6
        L37:
            java.lang.String r0 = r12.getSecUid()
            if (r0 != 0) goto L5d
        L3d:
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r14)
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r15)
            if (r13 == 0) goto L5b
            int r0 = r13.getValue()
        L4d:
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r0)
            r10.LJLJI = r1
            java.lang.Object r3 = r4.dislikeUser(r5, r6, r7, r8, r9, r10)
            if (r3 != r2) goto L23
            return r2
        L5b:
            r0 = -1
            goto L4d
        L5d:
            r6 = r0
            goto L3d
        L5f:
            X.Mpy r10 = new X.Mpy
            r10.<init>(r4, r3)
            goto L15
        L65:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.api.MafUserApiService.LIZ(com.ss.android.ugc.aweme.profile.model.User, X.MnY, int, int, X.2kd):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.relation.api.IMafUserApi
    @E4Q("/tiktok/user/relation/maf/list/v1")
    public AbstractC73638SvC<MaFListResponse> getMaFUserList(@InterfaceC64989Pez("scene") int i, @InterfaceC64989Pez("count") int i2, @InterfaceC64989Pez("page_token") String str, @InterfaceC64989Pez("rec_impr_users") String str2, @InterfaceC64989Pez("platforms") String str3, @InterfaceC64989Pez("sec_target_user_id") String str4, @InterfaceC64989Pez("maf_type") Integer num, @InterfaceC64989Pez("sec_target_user_ids") String str5, @InterfaceC64989Pez("new_maf_count") int i3, @InterfaceC64989Pez("is_non_personalized") boolean z) {
        HH1.LIZ(str, "pageToken", str2, "recImprUserIds", str3, "platforms");
        return this.LIZ.getMaFUserList(i, i2, str, str2, str3, str4, num, str5, i3, z);
    }
}
