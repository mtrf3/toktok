package com.facebook;

import X.C66382Q3m;
import X.C66384Q3o;
import X.C770830u;
import X.C79062V1e;
import X.EnumC66383Q3n;
import X.EnumC66385Q3p;
import X.HH1;
import X.HXX;
import X.OHQ;
import X.Q4J;
import Y.IDCreatorS54S0000000_11;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.o;
import m43.u;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class AccessToken implements Parcelable {
    public static final Parcelable.Creator<AccessToken> CREATOR;
    public static final C66382Q3m Companion = new C66382Q3m();
    public static final EnumC66385Q3p DEFAULT_ACCESS_TOKEN_SOURCE;
    public static final Date DEFAULT_EXPIRATION_TIME;
    public static final Date DEFAULT_LAST_REFRESH_TIME;
    public static final Date MAX_DATE;
    public final String applicationId;
    public final Date dataAccessExpirationTime;
    public final Set<String> declinedPermissions;
    public final Set<String> expiredPermissions;
    public final Date expires;
    public final String graphDomain;
    public final Date lastRefresh;
    public final Set<String> permissions;
    public final EnumC66385Q3p source;
    public final String token;
    public final String userId;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        Date date = new Date(Long.MAX_VALUE);
        MAX_DATE = date;
        DEFAULT_EXPIRATION_TIME = date;
        DEFAULT_LAST_REFRESH_TIME = new Date();
        DEFAULT_ACCESS_TOKEN_SOURCE = EnumC66385Q3p.FACEBOOK_APPLICATION_WEB;
        CREATOR = new IDCreatorS54S0000000_11(12);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.dataAccessExpirationTime.hashCode() + C79062V1e.LJ(this.userId, C79062V1e.LJ(this.applicationId, (this.lastRefresh.hashCode() + ((this.source.hashCode() + C79062V1e.LJ(this.token, HXX.LIZ(this.expiredPermissions, HXX.LIZ(this.declinedPermissions, HXX.LIZ(this.permissions, (this.expires.hashCode() + 527) * 31, 31), 31), 31), 31)) * 31)) * 31, 31), 31)) * 31;
        String str = this.graphDomain;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{AccessToken token:ACCESS_TOKEN_REMOVED permissions:[");
        u.LJIIIIZZ(EnumC66383Q3n.INCLUDE_ACCESS_TOKENS);
        sb.append(TextUtils.join(", ", this.permissions));
        sb.append("]}");
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "builder.toString()");
        return sb2;
    }

    public final JSONObject LIZ() {
        JSONObject LIZLLL = C770830u.LIZLLL("version", 1);
        LIZLLL.put("token", this.token);
        LIZLLL.put("expires_at", this.expires.getTime());
        LIZLLL.put(OHQ.LIZIZ, new JSONArray((Collection) this.permissions));
        LIZLLL.put("declined_permissions", new JSONArray((Collection) this.declinedPermissions));
        LIZLLL.put("expired_permissions", new JSONArray((Collection) this.expiredPermissions));
        LIZLLL.put("last_refresh", this.lastRefresh.getTime());
        LIZLLL.put("source", this.source.name());
        LIZLLL.put("application_id", this.applicationId);
        LIZLLL.put("user_id", this.userId);
        LIZLLL.put("data_access_expiration_time", this.dataAccessExpirationTime.getTime());
        String str = this.graphDomain;
        if (str != null) {
            LIZLLL.put("graph_domain", str);
        }
        return LIZLLL;
    }

    public AccessToken(Parcel parcel) {
        EnumC66385Q3p enumC66385Q3p;
        o.LJIIIZ(parcel, "parcel");
        this.expires = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        Set<String> unmodifiableSet = Collections.unmodifiableSet(new HashSet(arrayList));
        o.LJIIIIZZ(unmodifiableSet, "unmodifiableSet(HashSet(permissionsList))");
        this.permissions = unmodifiableSet;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set<String> unmodifiableSet2 = Collections.unmodifiableSet(new HashSet(arrayList));
        o.LJIIIIZZ(unmodifiableSet2, "unmodifiableSet(HashSet(permissionsList))");
        this.declinedPermissions = unmodifiableSet2;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set<String> unmodifiableSet3 = Collections.unmodifiableSet(new HashSet(arrayList));
        o.LJIIIIZZ(unmodifiableSet3, "unmodifiableSet(HashSet(permissionsList))");
        this.expiredPermissions = unmodifiableSet3;
        String readString = parcel.readString();
        Q4J.LJFF(readString, "token");
        this.token = readString;
        String readString2 = parcel.readString();
        if (readString2 != null) {
            enumC66385Q3p = EnumC66385Q3p.valueOf(readString2);
        } else {
            enumC66385Q3p = DEFAULT_ACCESS_TOKEN_SOURCE;
        }
        this.source = enumC66385Q3p;
        this.lastRefresh = new Date(parcel.readLong());
        String readString3 = parcel.readString();
        Q4J.LJFF(readString3, "applicationId");
        this.applicationId = readString3;
        String readString4 = parcel.readString();
        Q4J.LJFF(readString4, "userId");
        this.userId = readString4;
        this.dataAccessExpirationTime = new Date(parcel.readLong());
        this.graphDomain = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessToken)) {
            return false;
        }
        AccessToken accessToken = (AccessToken) obj;
        if (o.LJ(this.expires, accessToken.expires) && o.LJ(this.permissions, accessToken.permissions) && o.LJ(this.declinedPermissions, accessToken.declinedPermissions) && o.LJ(this.expiredPermissions, accessToken.expiredPermissions) && o.LJ(this.token, accessToken.token) && this.source == accessToken.source && o.LJ(this.lastRefresh, accessToken.lastRefresh) && o.LJ(this.applicationId, accessToken.applicationId) && o.LJ(this.userId, accessToken.userId) && o.LJ(this.dataAccessExpirationTime, accessToken.dataAccessExpirationTime)) {
            String str = this.graphDomain;
            String str2 = accessToken.graphDomain;
            if (str == null) {
                if (str2 == null) {
                    return true;
                }
            } else if (o.LJ(str, str2)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        o.LJIIIZ(dest, "dest");
        dest.writeLong(this.expires.getTime());
        dest.writeStringList(new ArrayList(this.permissions));
        dest.writeStringList(new ArrayList(this.declinedPermissions));
        dest.writeStringList(new ArrayList(this.expiredPermissions));
        dest.writeString(this.token);
        dest.writeString(this.source.name());
        dest.writeLong(this.lastRefresh.getTime());
        dest.writeString(this.applicationId);
        dest.writeString(this.userId);
        dest.writeLong(this.dataAccessExpirationTime.getTime());
        dest.writeString(this.graphDomain);
    }

    public /* synthetic */ AccessToken(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, EnumC66385Q3p enumC66385Q3p, Date date, Date date2, Date date3) {
        this(str, str2, str3, collection, collection2, collection3, enumC66385Q3p, date, date2, date3, "facebook");
    }

    public AccessToken(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, EnumC66385Q3p enumC66385Q3p, Date date, Date date2, Date date3, String str4) {
        HashSet hashSet;
        HashSet hashSet2;
        HashSet hashSet3;
        EnumC66385Q3p enumC66385Q3p2 = enumC66385Q3p;
        Date date4 = date2;
        Date date5 = date;
        String str5 = str4;
        Date date6 = date3;
        HH1.LIZ(str, "accessToken", str2, "applicationId", str3, "userId");
        Q4J.LIZLLL(str, "accessToken");
        Q4J.LIZLLL(str2, "applicationId");
        Q4J.LIZLLL(str3, "userId");
        this.expires = date5 == null ? DEFAULT_EXPIRATION_TIME : date5;
        if (collection != null) {
            hashSet = new HashSet(collection);
        } else {
            hashSet = new HashSet();
        }
        Set<String> unmodifiableSet = Collections.unmodifiableSet(hashSet);
        o.LJIIIIZZ(unmodifiableSet, "unmodifiableSet(if (permissions != null) HashSet(permissions) else HashSet())");
        this.permissions = unmodifiableSet;
        if (collection2 != null) {
            hashSet2 = new HashSet(collection2);
        } else {
            hashSet2 = new HashSet();
        }
        Set<String> unmodifiableSet2 = Collections.unmodifiableSet(hashSet2);
        o.LJIIIIZZ(unmodifiableSet2, "unmodifiableSet(\n            if (declinedPermissions != null) HashSet(declinedPermissions) else HashSet())");
        this.declinedPermissions = unmodifiableSet2;
        if (collection3 != null) {
            hashSet3 = new HashSet(collection3);
        } else {
            hashSet3 = new HashSet();
        }
        Set<String> unmodifiableSet3 = Collections.unmodifiableSet(hashSet3);
        o.LJIIIIZZ(unmodifiableSet3, "unmodifiableSet(\n            if (expiredPermissions != null) HashSet(expiredPermissions) else HashSet())");
        this.expiredPermissions = unmodifiableSet3;
        this.token = str;
        enumC66385Q3p2 = enumC66385Q3p2 == null ? DEFAULT_ACCESS_TOKEN_SOURCE : enumC66385Q3p2;
        if (str5 != null && str5.equals("instagram")) {
            int i = C66384Q3o.LIZ[enumC66385Q3p2.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        enumC66385Q3p2 = EnumC66385Q3p.INSTAGRAM_WEB_VIEW;
                    }
                } else {
                    enumC66385Q3p2 = EnumC66385Q3p.INSTAGRAM_CUSTOM_CHROME_TAB;
                }
            } else {
                enumC66385Q3p2 = EnumC66385Q3p.INSTAGRAM_APPLICATION_WEB;
            }
        }
        this.source = enumC66385Q3p2;
        this.lastRefresh = date4 == null ? DEFAULT_LAST_REFRESH_TIME : date4;
        this.applicationId = str2;
        this.userId = str3;
        this.dataAccessExpirationTime = (date6 == null || date6.getTime() == 0) ? DEFAULT_EXPIRATION_TIME : date6;
        this.graphDomain = str5 == null ? "facebook" : str5;
    }
}
