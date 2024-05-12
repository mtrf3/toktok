package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.CurrentAccessTokenExpirationBroadcastReceiver;
import com.facebook.GraphRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;
import m43.u;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Q3x, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66393Q3x {
    public static final Q45 LJFF = new Q45();
    public static C66393Q3x LJI;
    public final C10760bY LIZ;
    public final Q4L LIZIZ;
    public AccessToken LIZJ;
    public final AtomicBoolean LIZLLL = new AtomicBoolean(false);
    public Date LJ = new Date(0);

    public final void LIZ() {
        Q49 q4a;
        final AccessToken accessToken = this.LIZJ;
        if (accessToken == null || !this.LIZLLL.compareAndSet(false, true)) {
            return;
        }
        this.LJ = new Date();
        final HashSet hashSet = new HashSet();
        final HashSet hashSet2 = new HashSet();
        final HashSet hashSet3 = new HashSet();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final Q46 q46 = new Q46();
        GraphRequest[] graphRequestArr = new GraphRequest[2];
        BMV bmv = new BMV() { // from class: X.Q3y
            @Override // X.BMV
            public final void LIZ(C66381Q3l c66381Q3l) {
                JSONArray optJSONArray;
                AtomicBoolean permissionsCallSucceeded = atomicBoolean;
                java.util.Set permissions = hashSet;
                java.util.Set declinedPermissions = hashSet2;
                java.util.Set expiredPermissions = hashSet3;
                o.LJIIIZ(permissionsCallSucceeded, "$permissionsCallSucceeded");
                o.LJIIIZ(permissions, "$permissions");
                o.LJIIIZ(declinedPermissions, "$declinedPermissions");
                o.LJIIIZ(expiredPermissions, "$expiredPermissions");
                JSONObject jSONObject = c66381Q3l.LJ;
                if (jSONObject == null || (optJSONArray = jSONObject.optJSONArray("data")) == null) {
                    return;
                }
                permissionsCallSucceeded.set(true);
                int length = optJSONArray.length();
                if (length <= 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        String optString = optJSONObject.optString(OHQ.LIZ);
                        String status = optJSONObject.optString("status");
                        if (!C66373Q3d.LJIJJ(optString) && !C66373Q3d.LJIJJ(status)) {
                            o.LJIIIIZZ(status, "status");
                            Locale locale = Locale.US;
                            String LIZIZ = C141415gn.LIZIZ(locale, "US", status, locale, "(this as java.lang.String).toLowerCase(locale)");
                            int hashCode = LIZIZ.hashCode();
                            if (hashCode != -1309235419) {
                                if (hashCode != 280295099) {
                                    if (hashCode == 568196142 && LIZIZ.equals("declined")) {
                                        declinedPermissions.add(optString);
                                    }
                                } else if (LIZIZ.equals("granted")) {
                                    permissions.add(optString);
                                }
                            } else if (LIZIZ.equals("expired")) {
                                expiredPermissions.add(optString);
                            }
                        }
                    }
                    if (i2 >= length) {
                        return;
                    } else {
                        i = i2;
                    }
                }
            }
        };
        Bundle LIZ = C0H1.LIZ("fields", "permission,status");
        GraphRequest LJI2 = C66388Q3s.LJI(accessToken, "me/permissions", bmv);
        LJI2.LIZJ = LIZ;
        EnumC66377Q3h enumC66377Q3h = EnumC66377Q3h.GET;
        LJI2.LJIIIZ(enumC66377Q3h);
        graphRequestArr[0] = LJI2;
        BMV bmv2 = new BMV() { // from class: X.Q40
            @Override // X.BMV
            public final void LIZ(C66381Q3l c66381Q3l) {
                Q46 refreshResult = Q46.this;
                o.LJIIIZ(refreshResult, "$refreshResult");
                JSONObject jSONObject = c66381Q3l.LJ;
                if (jSONObject == null) {
                    return;
                }
                refreshResult.LIZ = jSONObject.optString("access_token");
                refreshResult.LIZIZ = jSONObject.optInt("expires_at");
                refreshResult.LIZJ = jSONObject.optInt("expires_in");
                refreshResult.LIZLLL = Long.valueOf(jSONObject.optLong("data_access_expiration_time"));
                refreshResult.LJ = jSONObject.optString("graph_domain", null);
            }
        };
        String str = accessToken.graphDomain;
        if (str == null) {
            str = "facebook";
        }
        if (o.LJ(str, "instagram")) {
            q4a = new Q4B();
        } else {
            q4a = new Q4A();
        }
        Bundle bundle = new Bundle();
        bundle.putString("grant_type", q4a.LIZIZ());
        bundle.putString("client_id", accessToken.applicationId);
        bundle.putString("fields", "access_token,expires_at,expires_in,data_access_expiration_time,graph_domain");
        GraphRequest LJI3 = C66388Q3s.LJI(accessToken, q4a.LIZ(), bmv2);
        LJI3.LIZJ = bundle;
        LJI3.LJIIIZ(enumC66377Q3h);
        graphRequestArr[1] = LJI3;
        C66390Q3u c66390Q3u = new C66390Q3u(graphRequestArr);
        BMW bmw = new BMW() { // from class: X.Q3w
            @Override // X.BMW
            public final void LIZ(C66390Q3u c66390Q3u2) {
                String str2;
                Date date;
                Q46 refreshResult = Q46.this;
                AccessToken accessToken2 = accessToken;
                AtomicBoolean permissionsCallSucceeded = atomicBoolean;
                java.util.Set<String> permissions = hashSet;
                java.util.Set<String> declinedPermissions = hashSet2;
                java.util.Set<String> expiredPermissions = hashSet3;
                C66393Q3x this$0 = this;
                o.LJIIIZ(refreshResult, "$refreshResult");
                o.LJIIIZ(permissionsCallSucceeded, "$permissionsCallSucceeded");
                o.LJIIIZ(permissions, "$permissions");
                o.LJIIIZ(declinedPermissions, "$declinedPermissions");
                o.LJIIIZ(expiredPermissions, "$expiredPermissions");
                o.LJIIIZ(this$0, "this$0");
                String str3 = refreshResult.LIZ;
                int i = refreshResult.LIZIZ;
                Long l = refreshResult.LIZLLL;
                String str4 = refreshResult.LJ;
                try {
                    Q45 q45 = C66393Q3x.LJFF;
                    if (q45.LIZ().LIZJ != null) {
                        AccessToken accessToken3 = q45.LIZ().LIZJ;
                        if (accessToken3 == null) {
                            str2 = null;
                        } else {
                            str2 = accessToken3.userId;
                        }
                        if (str2 == accessToken2.userId) {
                            if (!permissionsCallSucceeded.get() && str3 == null && i == 0) {
                                this$0.LIZLLL.set(false);
                                return;
                            }
                            Date date2 = accessToken2.expires;
                            if (refreshResult.LIZIZ != 0) {
                                date2 = new Date(refreshResult.LIZIZ * 1000);
                            } else if (refreshResult.LIZJ != 0) {
                                date2 = new Date((refreshResult.LIZJ * 1000) + new Date().getTime());
                            }
                            if (str3 == null) {
                                str3 = accessToken2.token;
                            }
                            String str5 = accessToken2.applicationId;
                            String str6 = accessToken2.userId;
                            if (!permissionsCallSucceeded.get()) {
                                permissions = accessToken2.permissions;
                            }
                            if (!permissionsCallSucceeded.get()) {
                                declinedPermissions = accessToken2.declinedPermissions;
                            }
                            if (!permissionsCallSucceeded.get()) {
                                expiredPermissions = accessToken2.expiredPermissions;
                            }
                            EnumC66385Q3p enumC66385Q3p = accessToken2.source;
                            Date date3 = new Date();
                            if (l != null) {
                                date = new Date(l.longValue() * 1000);
                            } else {
                                date = accessToken2.dataAccessExpirationTime;
                            }
                            if (str4 == null) {
                                str4 = accessToken2.graphDomain;
                            }
                            q45.LIZ().LIZJ(new AccessToken(str3, str5, str6, permissions, declinedPermissions, expiredPermissions, enumC66385Q3p, date2, date3, date, str4), true);
                        }
                    }
                    this$0.LIZLLL.set(false);
                } catch (Throwable th) {
                    this$0.LIZLLL.set(false);
                    throw th;
                }
            }
        };
        if (!((ArrayList) c66390Q3u.LJLJJI).contains(bmw)) {
            ((ArrayList) c66390Q3u.LJLJJI).add(bmw);
        }
        Q4J.LJ(c66390Q3u);
        new AsyncTaskC66391Q3v(c66390Q3u).executeOnExecutor(u.LJ(), new Void[0]);
    }

    public C66393Q3x(C10760bY c10760bY, Q4L q4l) {
        this.LIZ = c10760bY;
        this.LIZIZ = q4l;
    }

    public final void LIZIZ(AccessToken accessToken, AccessToken accessToken2) {
        Intent intent = new Intent(u.LIZJ(), (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", accessToken);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", accessToken2);
        this.LIZ.LIZJ(intent);
    }

    public final void LIZJ(AccessToken accessToken, boolean z) {
        PendingIntent broadcast;
        AccessToken accessToken2 = this.LIZJ;
        this.LIZJ = accessToken;
        this.LIZLLL.set(false);
        this.LJ = new Date(0L);
        if (z) {
            if (accessToken != null) {
                Q4L q4l = this.LIZIZ;
                q4l.getClass();
                try {
                    q4l.LIZ.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", accessToken.LIZ().toString()).apply();
                } catch (JSONException unused) {
                }
            } else {
                this.LIZIZ.LIZ.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
                C16880lQ.LLIILII(u.LIZJ());
            }
        }
        if (accessToken2 == null) {
            if (accessToken == null) {
                return;
            }
        } else if (o.LJ(accessToken2, accessToken)) {
            return;
        }
        LIZIZ(accessToken2, accessToken);
        Context LIZJ = u.LIZJ();
        AccessToken.Companion.getClass();
        AccessToken LIZIZ = C66382Q3m.LIZIZ();
        AlarmManager alarmManager = (AlarmManager) C16880lQ.LLILL(LIZJ, "alarm");
        if (!C66382Q3m.LIZJ() || LIZIZ == null || LIZIZ.expires == null || alarmManager == null) {
            return;
        }
        Intent intent = new Intent(LIZJ, (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        if (Build.VERSION.SDK_INT >= 23) {
            broadcast = PendingIntent.getBroadcast(LIZJ, 0, intent, 67108864);
        } else {
            broadcast = PendingIntent.getBroadcast(LIZJ, 0, intent, 0);
        }
        try {
            alarmManager.set(1, LIZIZ.expires.getTime(), broadcast);
        } catch (Exception unused2) {
        }
    }
}
