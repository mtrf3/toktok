package com.ss.android.ugc.aweme.relation.auth.api;

import X.AbstractC73638SvC;
import X.C55690LtO;
import X.E8M;
import X.EJ6;
import X.InterfaceC195727mC;
import X.InterfaceC195757mF;
import X.InterfaceC195767mG;
import X.InterfaceC36229EJt;
import X.InterfaceC64985Pev;
import X.InterfaceC64986Pew;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.relation.auth.api.IAuthApi;
import com.ss.android.ugc.aweme.relation.auth.model.ContactUploadResponse;
import com.ss.android.ugc.aweme.relation.auth.model.EmailUploadResponse;
import com.ss.android.ugc.aweme.relation.auth.model.FriendsUploadResponse;
import com.ss.android.ugc.aweme.relation.auth.model.PsiUploadEncryptContactResponseV2;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class AuthApiService implements IAuthApi {
    public static final AuthApiService LIZIZ = new AuthApiService();
    public final /* synthetic */ IAuthApi LIZ = (IAuthApi) C55690LtO.LIZIZ.create(IAuthApi.class);

    @Override // com.ss.android.ugc.aweme.relation.auth.api.IAuthApi
    @E8M("/tiktok/v2/upload/psihashcontacts/")
    @InterfaceC195757mF
    public AbstractC73638SvC<PsiUploadEncryptContactResponseV2> psiFilterContactV2(@InterfaceC36229EJt Map<String, String> contactMap, @InterfaceC64986Pew("scene") int i, @InterfaceC64986Pew("sync_only") boolean z) {
        o.LJIIIZ(contactMap, "contactMap");
        return this.LIZ.psiFilterContactV2(contactMap, i, z);
    }

    @Override // com.ss.android.ugc.aweme.relation.auth.api.IAuthApi
    @E8M("/tiktok/user/relation/social/settings/update/v1")
    @InterfaceC195757mF
    public Object syncSocialRelationStatus(@InterfaceC64985Pev("social_platform") int i, @InterfaceC64985Pev("sync_status") boolean z, @InterfaceC64985Pev("is_manual") boolean z2, @InterfaceC64985Pev("email_ads_disclosure") boolean z3, InterfaceC67352kd<? super BaseResponse> interfaceC67352kd) {
        return this.LIZ.syncSocialRelationStatus(i, z, z2, z3, interfaceC67352kd);
    }

    @Override // com.ss.android.ugc.aweme.relation.auth.api.IAuthApi
    @E8M("/aweme/v1/social/friend/")
    @InterfaceC195757mF
    public AbstractC73638SvC<FriendsUploadResponse> uploadFacebookToken(@InterfaceC64985Pev("scene") int i, @InterfaceC64985Pev("social") String platform, @InterfaceC64985Pev("sync_only") boolean z, @InterfaceC64985Pev("secret_access_token") String str, @InterfaceC64985Pev("access_token") String str2, @InterfaceC64985Pev("token_expiration_timestamp") Long l) {
        o.LJIIIZ(platform, "platform");
        return this.LIZ.uploadFacebookToken(i, platform, z, str, str2, l);
    }

    @Override // com.ss.android.ugc.aweme.relation.auth.api.IAuthApi
    @E8M("/aweme/v1/upload/hashcontacts/")
    @InterfaceC195757mF
    public AbstractC73638SvC<ContactUploadResponse> uploadHashContact(@InterfaceC36229EJt Map<String, String> contactMap, @InterfaceC64986Pew("scene") int i, @InterfaceC64986Pew("sync_only") boolean z) {
        o.LJIIIZ(contactMap, "contactMap");
        return this.LIZ.uploadHashContact(contactMap, i, z);
    }

    @Override // com.ss.android.ugc.aweme.relation.auth.api.IAuthApi
    @E8M("/passport/identity/set_identity_info/")
    public AbstractC73638SvC<EmailUploadResponse> uploadHashIdentityInfo(@InterfaceC195727mC IAuthApi.IdentityBody identityInfo, @InterfaceC195767mG List<EJ6> list, @InterfaceC64986Pew("user_identity_source") int i) {
        o.LJIIIZ(identityInfo, "identityInfo");
        return this.LIZ.uploadHashIdentityInfo(identityInfo, list, i);
    }
}
