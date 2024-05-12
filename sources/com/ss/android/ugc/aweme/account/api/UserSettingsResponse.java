package com.ss.android.ugc.aweme.account.api;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import defpackage.s0;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class UserSettingsResponse implements Serializable {

    @InterfaceC65349Pkn("data")
    public final UserSettingsData data;

    @InterfaceC65349Pkn("message")
    public final String message;

    public static /* synthetic */ UserSettingsResponse copy$default(UserSettingsResponse userSettingsResponse, UserSettingsData userSettingsData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            userSettingsData = userSettingsResponse.data;
        }
        if ((i & 2) != 0) {
            str = userSettingsResponse.message;
        }
        return userSettingsResponse.copy(userSettingsData, str);
    }

    public final UserSettingsResponse copy(UserSettingsData userSettingsData, String str) {
        return new UserSettingsResponse(userSettingsData, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserSettingsResponse)) {
            return false;
        }
        UserSettingsResponse userSettingsResponse = (UserSettingsResponse) obj;
        return o.LJ(this.data, userSettingsResponse.data) && o.LJ(this.message, userSettingsResponse.message);
    }

    public int hashCode() {
        UserSettingsData userSettingsData = this.data;
        int hashCode = (userSettingsData == null ? 0 : userSettingsData.hashCode()) * 31;
        String str = this.message;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    /* loaded from: classes7.dex */
    public static final class UserSettingsData implements Serializable {

        @InterfaceC65349Pkn("business_account_2sv_upsell")
        public final Integer business_account_2sv_upsell;

        @InterfaceC65349Pkn("description")
        public final String description;

        @InterfaceC65349Pkn("error_code")
        public final Integer errorCode;

        @InterfaceC65349Pkn("follower_2sv_upsell")
        public final Integer follower_2sv_upsell;

        @InterfaceC65349Pkn("gen_pop_wallet_2sv_upsell")
        public final Integer gen_pop_wallet_2sv_upsell;

        @InterfaceC65349Pkn("managed_account_2sv_upsell")
        public final Integer managed_account_2sv_upsell;

        @InterfaceC65349Pkn("sync_nickname2username")
        public final String syncNickname2Username;

        @InterfaceC65349Pkn("sync_username2nickname")
        public final String syncUsername2Nickname;

        @InterfaceC65349Pkn("tt_live_2sv_upsell")
        public final Integer tt_live_2sv_upsell;

        @InterfaceC65349Pkn("tt_shop_2sv_upsell")
        public final Integer tt_shop_2sv_upsell;

        /* JADX WARN: Multi-variable type inference failed */
        public UserSettingsData() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 1023, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ UserSettingsData copy$default(UserSettingsData userSettingsData, String str, Integer num, Integer num2, String str2, String str3, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, int i, Object obj) {
            if ((i & 1) != 0) {
                str = userSettingsData.description;
            }
            if ((i & 2) != 0) {
                num = userSettingsData.errorCode;
            }
            if ((i & 4) != 0) {
                num2 = userSettingsData.follower_2sv_upsell;
            }
            if ((i & 8) != 0) {
                str2 = userSettingsData.syncUsername2Nickname;
            }
            if ((i & 16) != 0) {
                str3 = userSettingsData.syncNickname2Username;
            }
            if ((i & 32) != 0) {
                num3 = userSettingsData.tt_live_2sv_upsell;
            }
            if ((i & 64) != 0) {
                num4 = userSettingsData.tt_shop_2sv_upsell;
            }
            if ((i & 128) != 0) {
                num5 = userSettingsData.business_account_2sv_upsell;
            }
            if ((i & 256) != 0) {
                num6 = userSettingsData.managed_account_2sv_upsell;
            }
            if ((i & 512) != 0) {
                num7 = userSettingsData.gen_pop_wallet_2sv_upsell;
            }
            return userSettingsData.copy(str, num, num2, str2, str3, num3, num4, num5, num6, num7);
        }

        public final UserSettingsData copy(String str, Integer num, Integer num2, String str2, String str3, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7) {
            return new UserSettingsData(str, num, num2, str2, str3, num3, num4, num5, num6, num7);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UserSettingsData)) {
                return false;
            }
            UserSettingsData userSettingsData = (UserSettingsData) obj;
            return o.LJ(this.description, userSettingsData.description) && o.LJ(this.errorCode, userSettingsData.errorCode) && o.LJ(this.follower_2sv_upsell, userSettingsData.follower_2sv_upsell) && o.LJ(this.syncUsername2Nickname, userSettingsData.syncUsername2Nickname) && o.LJ(this.syncNickname2Username, userSettingsData.syncNickname2Username) && o.LJ(this.tt_live_2sv_upsell, userSettingsData.tt_live_2sv_upsell) && o.LJ(this.tt_shop_2sv_upsell, userSettingsData.tt_shop_2sv_upsell) && o.LJ(this.business_account_2sv_upsell, userSettingsData.business_account_2sv_upsell) && o.LJ(this.managed_account_2sv_upsell, userSettingsData.managed_account_2sv_upsell) && o.LJ(this.gen_pop_wallet_2sv_upsell, userSettingsData.gen_pop_wallet_2sv_upsell);
        }

        public int hashCode() {
            String str = this.description;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.errorCode;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.follower_2sv_upsell;
            int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str2 = this.syncUsername2Nickname;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.syncNickname2Username;
            int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num3 = this.tt_live_2sv_upsell;
            int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.tt_shop_2sv_upsell;
            int hashCode7 = (hashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Integer num5 = this.business_account_2sv_upsell;
            int hashCode8 = (hashCode7 + (num5 == null ? 0 : num5.hashCode())) * 31;
            Integer num6 = this.managed_account_2sv_upsell;
            int hashCode9 = (hashCode8 + (num6 == null ? 0 : num6.hashCode())) * 31;
            Integer num7 = this.gen_pop_wallet_2sv_upsell;
            return hashCode9 + (num7 != null ? num7.hashCode() : 0);
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("UserSettingsData(description=");
            LIZ.append(this.description);
            LIZ.append(", errorCode=");
            LIZ.append(this.errorCode);
            LIZ.append(", follower_2sv_upsell=");
            LIZ.append(this.follower_2sv_upsell);
            LIZ.append(", syncUsername2Nickname=");
            LIZ.append(this.syncUsername2Nickname);
            LIZ.append(", syncNickname2Username=");
            LIZ.append(this.syncNickname2Username);
            LIZ.append(", tt_live_2sv_upsell=");
            LIZ.append(this.tt_live_2sv_upsell);
            LIZ.append(", tt_shop_2sv_upsell=");
            LIZ.append(this.tt_shop_2sv_upsell);
            LIZ.append(", business_account_2sv_upsell=");
            LIZ.append(this.business_account_2sv_upsell);
            LIZ.append(", managed_account_2sv_upsell=");
            LIZ.append(this.managed_account_2sv_upsell);
            LIZ.append(", gen_pop_wallet_2sv_upsell=");
            return s0.LIZJ(LIZ, this.gen_pop_wallet_2sv_upsell, ')', LIZ);
        }

        public final Integer getBusiness_account_2sv_upsell() {
            return this.business_account_2sv_upsell;
        }

        public final String getDescription() {
            return this.description;
        }

        public final Integer getErrorCode() {
            return this.errorCode;
        }

        public final Integer getFollower_2sv_upsell() {
            return this.follower_2sv_upsell;
        }

        public final Integer getGen_pop_wallet_2sv_upsell() {
            return this.gen_pop_wallet_2sv_upsell;
        }

        public final Integer getManaged_account_2sv_upsell() {
            return this.managed_account_2sv_upsell;
        }

        public final String getSyncNickname2Username() {
            return this.syncNickname2Username;
        }

        public final String getSyncUsername2Nickname() {
            return this.syncUsername2Nickname;
        }

        public final Integer getTt_live_2sv_upsell() {
            return this.tt_live_2sv_upsell;
        }

        public final Integer getTt_shop_2sv_upsell() {
            return this.tt_shop_2sv_upsell;
        }

        public UserSettingsData(String str, Integer num, Integer num2, String str2, String str3, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7) {
            this.description = str;
            this.errorCode = num;
            this.follower_2sv_upsell = num2;
            this.syncUsername2Nickname = str2;
            this.syncNickname2Username = str3;
            this.tt_live_2sv_upsell = num3;
            this.tt_shop_2sv_upsell = num4;
            this.business_account_2sv_upsell = num5;
            this.managed_account_2sv_upsell = num6;
            this.gen_pop_wallet_2sv_upsell = num7;
        }

        public /* synthetic */ UserSettingsData(String str, Integer num, Integer num2, String str2, String str3, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? 0 : num2, (i & 8) != 0 ? null : str2, (i & 16) == 0 ? str3 : null, (i & 32) != 0 ? 0 : num3, (i & 64) != 0 ? 0 : num4, (i & 128) != 0 ? 0 : num5, (i & 256) != 0 ? 0 : num6, (i & 512) != 0 ? 0 : num7);
        }
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UserSettingsResponse(data=");
        LIZ.append(this.data);
        LIZ.append(", message=");
        return q.LIZIZ(LIZ, this.message, ')', LIZ);
    }

    public final UserSettingsData getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    public UserSettingsResponse(UserSettingsData userSettingsData, String str) {
        this.data = userSettingsData;
        this.message = str;
    }
}
