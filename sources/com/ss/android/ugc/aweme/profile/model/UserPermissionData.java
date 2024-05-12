package com.ss.android.ugc.aweme.profile.model;

import X.InterfaceC65349Pkn;
import X.JBR;
import X.OHQ;
import X.V0N;
import X.X1D;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import defpackage.q;
import java.io.Serializable;
import java.util.HashMap;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class UserPermissionData {

    /* loaded from: classes5.dex */
    public static final class UserPermissionInfo implements Serializable {

        @InterfaceC65349Pkn("age_gate_region")
        public String ageGateRegion = "";

        @InterfaceC65349Pkn(OHQ.LIZIZ)
        public String permissions = "";

        public final HashMap<String, Boolean> permissionsMap() {
            Object fromJson = GsonProtectorUtils.fromJson(new Gson(), this.permissions, (Class<Object>) new HashMap().getClass());
            o.LJIIIIZZ(fromJson, "Gson().fromJson(permissions, map.javaClass)");
            return (HashMap) fromJson;
        }

        public String toString() {
            String str;
            String str2;
            if (!(!ujb.o.LJJJJJL(this.ageGateRegion))) {
                str = "";
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("age_gate_region=");
                str = q.LIZIZ(LIZ, this.ageGateRegion, ',', LIZ);
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append('{');
            LIZ2.append(str);
            LIZ2.append("permissions=\"");
            String str3 = this.permissions;
            if (str3 != null) {
                str2 = ujb.o.LJJJJZ(str3, "\"", "", false);
            } else {
                str2 = null;
            }
            return JBR.LJFF(LIZ2, str2, "\"}", LIZ2);
        }

        public final String getAgeGateRegion() {
            return this.ageGateRegion;
        }

        public final String getPermissions() {
            return this.permissions;
        }

        public final void setAgeGateRegion(String str) {
            o.LJIIIZ(str, "<set-?>");
            this.ageGateRegion = str;
        }

        public final void setPermissions(String str) {
            this.permissions = str;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes16.dex */
    public static final class UserPermissionRequestType {
        public int type;
        public static final UserPermissionRequestType DEFAULT_TYPE = new DEFAULT_TYPE("DEFAULT_TYPE", 0);
        public static final UserPermissionRequestType COLLECTION_POPUP = new COLLECTION_POPUP("COLLECTION_POPUP", 1);
        public static final UserPermissionRequestType CONFIRM_PROMPT = new CONFIRM_PROMPT("CONFIRM_PROMPT", 2);
        public static final UserPermissionRequestType COLLECTION_CHECKBOX = new COLLECTION_CHECKBOX("COLLECTION_CHECKBOX", 3);
        public static final /* synthetic */ UserPermissionRequestType[] $VALUES = $values();
        public static final Companion Companion = new Companion();

        public static final /* synthetic */ UserPermissionRequestType[] $values() {
            return new UserPermissionRequestType[]{DEFAULT_TYPE, COLLECTION_POPUP, CONFIRM_PROMPT, COLLECTION_CHECKBOX};
        }

        public /* synthetic */ UserPermissionRequestType(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, i2);
        }

        public static UserPermissionRequestType valueOf(String str) {
            return (UserPermissionRequestType) V0N.LJJJ(UserPermissionRequestType.class, str);
        }

        public static UserPermissionRequestType[] values() {
            return (UserPermissionRequestType[]) $VALUES.clone();
        }

        /* loaded from: classes16.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public Companion() {
            }

            public final UserPermissionRequestType fromInt(int i) {
                for (UserPermissionRequestType userPermissionRequestType : UserPermissionRequestType.values()) {
                    if (userPermissionRequestType.getType() == i) {
                        return userPermissionRequestType;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }

        public final int getType() {
            return this.type;
        }

        public final void setType(int i) {
            this.type = i;
        }

        /* loaded from: classes16.dex */
        public static final class COLLECTION_CHECKBOX extends UserPermissionRequestType {
            @Override // java.lang.Enum
            public String toString() {
                return "passport_pii_collection_checkbox";
            }

            public COLLECTION_CHECKBOX(String str, int i) {
                super(str, i, 3, null);
            }
        }

        /* loaded from: classes16.dex */
        public static final class COLLECTION_POPUP extends UserPermissionRequestType {
            @Override // java.lang.Enum
            public String toString() {
                return "passport_pii_collection_popup";
            }

            public COLLECTION_POPUP(String str, int i) {
                super(str, i, 1, null);
            }
        }

        /* loaded from: classes16.dex */
        public static final class CONFIRM_PROMPT extends UserPermissionRequestType {
            @Override // java.lang.Enum
            public String toString() {
                return "passport_pii_confirm_prompt";
            }

            public CONFIRM_PROMPT(String str, int i) {
                super(str, i, 2, null);
            }
        }

        /* loaded from: classes16.dex */
        public static final class DEFAULT_TYPE extends UserPermissionRequestType {
            @Override // java.lang.Enum
            public String toString() {
                return "DEFAULT_TYPE";
            }

            public DEFAULT_TYPE(String str, int i) {
                super(str, i, 0, null);
            }
        }

        public UserPermissionRequestType(String str, int i, int i2) {
            this.type = i2;
        }
    }
}
