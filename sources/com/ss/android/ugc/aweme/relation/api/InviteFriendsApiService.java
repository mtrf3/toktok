package com.ss.android.ugc.aweme.relation.api;

import X.AbstractC73638SvC;
import X.AbstractC73672Svk;
import X.C790838m;
import X.E4Q;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import X.InterfaceC64989Pez;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.ExposeSharerData;
import com.ss.android.ugc.aweme.friends.model.ShortenUrlModel;
import com.ss.android.ugc.aweme.relation.model.LinkPrivacyPopupStatusResponse;
import com.ss.android.ugc.aweme.relation.model.SmgSettingsModel;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class InviteFriendsApiService implements IInviteFriendsApi {
    public static final InviteFriendsApiService LIZIZ = new InviteFriendsApiService();
    public final /* synthetic */ IInviteFriendsApi LIZ = (IInviteFriendsApi) C790838m.LIZIZ.create(IInviteFriendsApi.class);

    @Override // com.ss.android.ugc.aweme.relation.api.IInviteFriendsApi
    @E4Q("/ug/social/invite/msg/settings/")
    public AbstractC73638SvC<SmgSettingsModel> getInviteFriendsSettings() {
        return this.LIZ.getInviteFriendsSettings();
    }

    @Override // com.ss.android.ugc.aweme.relation.api.IInviteFriendsApi
    @E4Q("/tiktok/v1/link/privacy/popup/status/")
    public AbstractC73638SvC<LinkPrivacyPopupStatusResponse> getLinkPrivacyPopupStatus() {
        return this.LIZ.getLinkPrivacyPopupStatus();
    }

    @Override // com.ss.android.ugc.aweme.relation.api.IInviteFriendsApi
    @E4Q("/tiktok/v1/sharer/info/")
    public AbstractC73672Svk<ExposeSharerData> getSharerInfo(@InterfaceC64989Pez("link_id") String str, @InterfaceC64989Pez("share_type") int i, @InterfaceC64989Pez("share_source") String str2, @InterfaceC64989Pez("from_uid") String str3, @InterfaceC64989Pez("sec_from_uid") String str4, @InterfaceC64989Pez("item_id") String str5, @InterfaceC64989Pez("checksum") String str6, @InterfaceC64989Pez("timestamp") String str7, @InterfaceC64989Pez("invitation_scene") String str8, @InterfaceC64989Pez("share_url") String str9, @InterfaceC64989Pez("share_link_mode") int i2) {
        return this.LIZ.getSharerInfo(str, i, str2, str3, str4, str5, str6, str7, str8, str9, i2);
    }

    @Override // com.ss.android.ugc.aweme.relation.api.IInviteFriendsApi
    @E4Q("/tiktok/v1/now/friend/invite")
    public Object inviteFriend(@InterfaceC64989Pez("user_id") String str, @InterfaceC64989Pez("sec_user_id") String str2, InterfaceC67352kd<? super BaseResponse> interfaceC67352kd) {
        return this.LIZ.inviteFriend(str, str2, interfaceC67352kd);
    }

    @Override // com.ss.android.ugc.aweme.relation.api.IInviteFriendsApi
    @InterfaceC195787mI
    @E4T("/tiktok/privacy/setting/suggestion/update/v1")
    public AbstractC73638SvC<BaseResponse> setSuggestPrivacySettings(@InterfaceC64987Pex("field") String field, @InterfaceC64987Pex("value") int i) {
        o.LJIIIZ(field, "field");
        return this.LIZ.setSuggestPrivacySettings(field, i);
    }

    @Override // com.ss.android.ugc.aweme.relation.api.IInviteFriendsApi
    @InterfaceC195787mI
    @E4T("/ug/social/invite/msg/short_url/")
    public AbstractC73638SvC<ShortenUrlModel> shortenUrl(@InterfaceC64987Pex("url") String url) {
        o.LJIIIZ(url, "url");
        return this.LIZ.shortenUrl(url);
    }

    @Override // com.ss.android.ugc.aweme.relation.api.IInviteFriendsApi
    @InterfaceC195787mI
    @E4T("/tiktok/v1/link/privacy/popup/status/update/")
    public AbstractC73638SvC<BaseResponse> updateLinkPrivacyPopupStatus(@InterfaceC64987Pex("displayed") boolean z) {
        return this.LIZ.updateLinkPrivacyPopupStatus(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.C55773Luj r18, X.EnumC57171McB r19, X.InterfaceC67352kd<? super com.ss.android.ugc.aweme.feed.model.ExposeSharerData> r20) {
        /*
            r17 = this;
            r4 = r20
            boolean r0 = r4 instanceof X.C55779Lup
            if (r0 == 0) goto L6a
            r3 = r4
            X.Lup r3 = (X.C55779Lup) r3
            int r2 = r3.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6a
            int r2 = r2 - r1
            r3.LJLJI = r2
        L14:
            java.lang.Object r4 = r3.LJLIL
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r3.LJLJI
            r1 = 1
            if (r0 == 0) goto L2d
            if (r0 != r1) goto L72
            X.C141335gf.LIZJ(r4)
        L22:
            X.Ee8 r4 = (X.AbstractC36908Ee8) r4
            r4.checkValid()
            java.lang.String r0 = "InviteFriendsApiService.…awaitFirst().checkValid()"
            kotlin.jvm.internal.o.LJIIIIZZ(r4, r0)
            return r4
        L2d:
            X.C141335gf.LIZJ(r4)
            com.ss.android.ugc.aweme.relation.api.InviteFriendsApiService r5 = com.ss.android.ugc.aweme.relation.api.InviteFriendsApiService.LIZIZ
            r4 = r18
            java.lang.String r6 = r4.LIZLLL
            X.McB r0 = r4.LIZ
            if (r0 != 0) goto L3c
            r0 = r19
        L3c:
            int r7 = r0.getRawValue()
            java.lang.String r8 = r4.LIZJ
            java.lang.String r9 = r4.LJ
            java.lang.String r10 = ""
            if (r9 != 0) goto L49
            r9 = r10
        L49:
            java.lang.String r0 = r4.LJFF
            if (r0 != 0) goto L68
        L4d:
            java.lang.String r11 = r4.LIZIZ
            java.lang.String r12 = r4.LJII
            java.lang.String r13 = r4.LJIIIIZZ
            java.lang.String r14 = r4.LJIIIZ
            java.lang.String r15 = r4.LJIIJJI
            int r0 = r4.LJIIL
            r16 = r0
            X.Svk r0 = r5.getSharerInfo(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r3.LJLJI = r1
            java.lang.Object r4 = X.C77318UWc.LIZIZ(r0, r3)
            if (r4 != r2) goto L22
            return r2
        L68:
            r10 = r0
            goto L4d
        L6a:
            X.Lup r3 = new X.Lup
            r0 = r17
            r3.<init>(r0, r4)
            goto L14
        L72:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.api.InviteFriendsApiService.LIZ(X.Luj, X.McB, X.2kd):java.lang.Object");
    }
}
