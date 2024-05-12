package com.ss.android.ugc.aweme.relation.auth.api;

import X.AbstractC73638SvC;
import X.C1NE;
import X.E8M;
import X.EJ6;
import X.InterfaceC195727mC;
import X.InterfaceC195757mF;
import X.InterfaceC195767mG;
import X.InterfaceC36229EJt;
import X.InterfaceC64985Pev;
import X.InterfaceC64986Pew;
import X.InterfaceC65349Pkn;
import X.InterfaceC67352kd;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.relation.auth.model.ContactUploadResponse;
import com.ss.android.ugc.aweme.relation.auth.model.EmailUploadResponse;
import com.ss.android.ugc.aweme.relation.auth.model.FriendsUploadResponse;
import com.ss.android.ugc.aweme.relation.auth.model.PsiUploadEncryptContactResponseV2;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public interface IAuthApi {
    @E8M("/tiktok/v2/upload/psihashcontacts/")
    @InterfaceC195757mF
    AbstractC73638SvC<PsiUploadEncryptContactResponseV2> psiFilterContactV2(@InterfaceC36229EJt Map<String, String> map, @InterfaceC64986Pew("scene") int i, @InterfaceC64986Pew("sync_only") boolean z);

    @E8M("/tiktok/user/relation/social/settings/update/v1")
    @InterfaceC195757mF
    Object syncSocialRelationStatus(@InterfaceC64985Pev("social_platform") int i, @InterfaceC64985Pev("sync_status") boolean z, @InterfaceC64985Pev("is_manual") boolean z2, @InterfaceC64985Pev("email_ads_disclosure") boolean z3, InterfaceC67352kd<? super BaseResponse> interfaceC67352kd);

    @E8M("/aweme/v1/social/friend/")
    @InterfaceC195757mF
    AbstractC73638SvC<FriendsUploadResponse> uploadFacebookToken(@InterfaceC64985Pev("scene") int i, @InterfaceC64985Pev("social") String str, @InterfaceC64985Pev("sync_only") boolean z, @InterfaceC64985Pev("secret_access_token") String str2, @InterfaceC64985Pev("access_token") String str3, @InterfaceC64985Pev("token_expiration_timestamp") Long l);

    @E8M("/aweme/v1/upload/hashcontacts/")
    @InterfaceC195757mF
    AbstractC73638SvC<ContactUploadResponse> uploadHashContact(@InterfaceC36229EJt Map<String, String> map, @InterfaceC64986Pew("scene") int i, @InterfaceC64986Pew("sync_only") boolean z);

    @E8M("/passport/identity/set_identity_info/")
    AbstractC73638SvC<EmailUploadResponse> uploadHashIdentityInfo(@InterfaceC195727mC IdentityBody identityBody, @InterfaceC195767mG List<EJ6> list, @InterfaceC64986Pew("user_identity_source") int i);

    /* loaded from: classes2.dex */
    public static final class IdentityBody {

        @InterfaceC65349Pkn("user_identity_type_list")
        public final List<Integer> identityList;

        @InterfaceC65349Pkn("user_identity_raw_value_list")
        public final List<String> identityValue;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IdentityBody)) {
                return false;
            }
            IdentityBody identityBody = (IdentityBody) obj;
            return o.LJ(this.identityValue, identityBody.identityValue) && o.LJ(this.identityList, identityBody.identityList);
        }

        public final int hashCode() {
            return this.identityList.hashCode() + (this.identityValue.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("IdentityBody(identityValue=");
            LIZ.append(this.identityValue);
            LIZ.append(", identityList=");
            return C1NE.LIZIZ(LIZ, this.identityList, ')', LIZ);
        }

        public IdentityBody(List<String> identityValue, List<Integer> identityList) {
            o.LJIIIZ(identityValue, "identityValue");
            o.LJIIIZ(identityList, "identityList");
            this.identityValue = identityValue;
            this.identityList = identityList;
        }
    }
}
