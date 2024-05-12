package com.ss.android.ugc.aweme.account.agegate.ftc;

import X.C1NE;
import X.C221108m2;
import X.C62822Ol8;
import X.C68967R4x;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class FtcCreateAccountModel {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C68967R4x.LJLIL);

    /* loaded from: classes2.dex */
    public static final class UserNameDataEntity {

        @InterfaceC65349Pkn("description")
        public final String description;

        @InterfaceC65349Pkn("error_code")
        public final int errorCode;

        @InterfaceC65349Pkn("login_name")
        public final String loginName;

        /* JADX WARN: Multi-variable type inference failed */
        public UserNameDataEntity() {
            this(0, null, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UserNameDataEntity)) {
                return false;
            }
            UserNameDataEntity userNameDataEntity = (UserNameDataEntity) obj;
            return this.errorCode == userNameDataEntity.errorCode && o.LJ(this.description, userNameDataEntity.description) && o.LJ(this.loginName, userNameDataEntity.loginName);
        }

        public final int hashCode() {
            return this.loginName.hashCode() + C79062V1e.LJ(this.description, this.errorCode * 31, 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("UserNameDataEntity(errorCode=");
            LIZ.append(this.errorCode);
            LIZ.append(", description=");
            LIZ.append(this.description);
            LIZ.append(", loginName=");
            return q.LIZIZ(LIZ, this.loginName, ')', LIZ);
        }

        public UserNameDataEntity(int i, String description, String loginName) {
            o.LJIIIZ(description, "description");
            o.LJIIIZ(loginName, "loginName");
            this.errorCode = i;
            this.description = description;
            this.loginName = loginName;
        }

        public /* synthetic */ UserNameDataEntity(int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2);
        }
    }

    /* loaded from: classes2.dex */
    public static final class LoginNameCheckData {

        @InterfaceC65349Pkn("description")
        public final String description;

        @InterfaceC65349Pkn("error_code")
        public final String error_code;

        @InterfaceC65349Pkn("login_name")
        public final String loginName;

        @InterfaceC65349Pkn("recommend_usernames")
        public final List<String> suggestions;

        /* JADX WARN: Multi-variable type inference failed */
        public LoginNameCheckData() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoginNameCheckData)) {
                return false;
            }
            LoginNameCheckData loginNameCheckData = (LoginNameCheckData) obj;
            return o.LJ(this.loginName, loginNameCheckData.loginName) && o.LJ(this.description, loginNameCheckData.description) && o.LJ(this.error_code, loginNameCheckData.error_code) && o.LJ(this.suggestions, loginNameCheckData.suggestions);
        }

        public final int hashCode() {
            String str = this.loginName;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.description;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.error_code;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            List<String> list = this.suggestions;
            return hashCode3 + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("LoginNameCheckData(loginName=");
            LIZ.append(this.loginName);
            LIZ.append(", description=");
            LIZ.append(this.description);
            LIZ.append(", error_code=");
            LIZ.append(this.error_code);
            LIZ.append(", suggestions=");
            return C1NE.LIZIZ(LIZ, this.suggestions, ')', LIZ);
        }

        public LoginNameCheckData(String str, String str2, String str3, List<String> list) {
            this.loginName = str;
            this.description = str2;
            this.error_code = str3;
            this.suggestions = list;
        }

        public /* synthetic */ LoginNameCheckData(String str, String str2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : list);
        }
    }

    /* loaded from: classes2.dex */
    public static final class UpdateUserNameNetworkEntity {

        @InterfaceC65349Pkn("data")
        public final UserNameDataEntity data;

        @InterfaceC65349Pkn("message")
        public final String message;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateUserNameNetworkEntity)) {
                return false;
            }
            UpdateUserNameNetworkEntity updateUserNameNetworkEntity = (UpdateUserNameNetworkEntity) obj;
            return o.LJ(this.message, updateUserNameNetworkEntity.message) && o.LJ(this.data, updateUserNameNetworkEntity.data);
        }

        public final int hashCode() {
            return this.data.hashCode() + (this.message.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("UpdateUserNameNetworkEntity(message=");
            LIZ.append(this.message);
            LIZ.append(", data=");
            LIZ.append(this.data);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }

        public UpdateUserNameNetworkEntity(String message, UserNameDataEntity data) {
            o.LJIIIZ(message, "message");
            o.LJIIIZ(data, "data");
            this.message = message;
            this.data = data;
        }

        public /* synthetic */ UpdateUserNameNetworkEntity(String str, UserNameDataEntity userNameDataEntity, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, userNameDataEntity);
        }
    }
}
