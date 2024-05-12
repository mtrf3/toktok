package com.bytedance.lobby.google;

import X.AbstractC73638SvC;
import X.C65083PgV;
import X.C65148PhY;
import X.C65238Pj0;
import X.C77800Ug8;
import X.E8L;
import X.EKC;
import X.InterfaceC36348EOi;
import X.InterfaceC65349Pkn;
import X.Q89;
import X.X1D;

/* loaded from: classes12.dex */
public final class LobbyGoogleApi {
    public static final GoogleApi LIZ = (GoogleApi) C65083PgV.LJI(C65083PgV.LJ("https://www.googleapis.com", null, C65238Pj0.LJFF(), new C65148PhY(false), null), GoogleApi.class);

    /* loaded from: classes12.dex */
    public interface GoogleApi {
        @E8L("/userinfo/v2/me")
        @EKC({"x-tt-dataflow-id: 671088897"})
        AbstractC73638SvC<UserInfoResponse> getUserInfo(@InterfaceC36348EOi("Authorization") String str);
    }

    /* loaded from: classes12.dex */
    public static class UserInfoResponse {

        @InterfaceC65349Pkn("family_name")
        public String familyName;

        @InterfaceC65349Pkn("given_name")
        public String givenName;

        @InterfaceC65349Pkn("id")
        public String id;

        @InterfaceC65349Pkn("locale")
        public String locale;

        @InterfaceC65349Pkn("name")
        public String name;

        @InterfaceC65349Pkn("picture")
        public String picture;

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("UserInfoResponse{id='");
            Q89.LIZIZ(LIZ, this.id, '\'', ", name='");
            Q89.LIZIZ(LIZ, this.name, '\'', ", givenName='");
            Q89.LIZIZ(LIZ, this.givenName, '\'', ", familyName='");
            Q89.LIZIZ(LIZ, this.familyName, '\'', ", picture='");
            Q89.LIZIZ(LIZ, this.picture, '\'', ", locale='");
            return C77800Ug8.LIZJ(LIZ, this.locale, '\'', '}', LIZ);
        }
    }
}
