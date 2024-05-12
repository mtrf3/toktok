package X;

import android.os.Bundle;
import android.util.Base64;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes12.dex */
public final class Q4R {
    public static AuthenticationToken LIZJ(Bundle bundle, String str) {
        o.LJIIIZ(bundle, "bundle");
        String string = bundle.getString("id_token");
        if (string == null || string.length() == 0 || str == null || str.length() == 0) {
            return null;
        }
        try {
            return new AuthenticationToken(string, str);
        } catch (Exception e) {
            throw new Q4W(e.getMessage(), e);
        }
    }

    public static AccessToken LIZ(Bundle bundle, EnumC66385Q3p enumC66385Q3p, String applicationId) {
        String string;
        o.LJIIIZ(bundle, "bundle");
        o.LJIIIZ(applicationId, "applicationId");
        Date LJIIJJI = C66373Q3d.LJIIJJI(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0L));
        ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
        String string2 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
        Date LJIIJJI2 = C66373Q3d.LJIIJJI(bundle, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0L));
        if (string2 == null || string2.length() == 0 || (string = bundle.getString("com.facebook.platform.extra.USER_ID")) == null || string.length() == 0) {
            return null;
        }
        return new AccessToken(string2, applicationId, string, stringArrayList, null, null, enumC66385Q3p, LJIIJJI, new Date(), LJIIJJI2, bundle.getString("graph_domain"));
    }

    public static AccessToken LIZIZ(Collection collection, Bundle bundle, EnumC66385Q3p enumC66385Q3p, String applicationId) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Object[] array;
        Collection collection2 = collection;
        o.LJIIIZ(bundle, "bundle");
        o.LJIIIZ(applicationId, "applicationId");
        Date LJIIJJI = C66373Q3d.LJIIJJI(bundle, "expires_in", new Date());
        String string = bundle.getString("access_token");
        if (string == null) {
            return null;
        }
        Date LJIIJJI2 = C66373Q3d.LJIIJJI(bundle, "data_access_expiration_time", new Date(0L));
        String string2 = bundle.getString("granted_scopes");
        if (string2 != null && string2.length() > 0) {
            Object[] array2 = s.LJLJJL(string2, new String[]{","}, 0, 6).toArray(new String[0]);
            if (array2 != null) {
                String[] strArr = (String[]) array2;
                collection2 = C47261Igj.LJII(Arrays.copyOf(strArr, strArr.length));
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        }
        String string3 = bundle.getString("denied_scopes");
        if (string3 != null && string3.length() > 0) {
            Object[] array3 = s.LJLJJL(string3, new String[]{","}, 0, 6).toArray(new String[0]);
            if (array3 != null) {
                String[] strArr2 = (String[]) array3;
                arrayList = C47261Igj.LJII(Arrays.copyOf(strArr2, strArr2.length));
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        } else {
            arrayList = null;
        }
        String string4 = bundle.getString("expired_scopes");
        if (string4 != null && string4.length() > 0) {
            Object[] array4 = s.LJLJJL(string4, new String[]{","}, 0, 6).toArray(new String[0]);
            if (array4 != null) {
                String[] strArr3 = (String[]) array4;
                arrayList2 = C47261Igj.LJII(Arrays.copyOf(strArr3, strArr3.length));
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        } else {
            arrayList2 = null;
        }
        if (C66373Q3d.LJIJJ(string)) {
            return null;
        }
        String string5 = bundle.getString("graph_domain");
        String string6 = bundle.getString("signed_request");
        if (string6 == null || string6.length() == 0) {
            throw new Q4W("Authorization response does not contain the signed_request");
        }
        try {
            array = s.LJLJJL(string6, new String[]{"."}, 0, 6).toArray(new String[0]);
        } catch (UnsupportedEncodingException | JSONException unused) {
        }
        if (array != null) {
            String[] strArr4 = (String[]) array;
            if (strArr4.length == 2) {
                byte[] data = Base64.decode(strArr4[1], 0);
                o.LJIIIIZZ(data, "data");
                String string7 = new JSONObject(new String(data, PVC.LIZ)).getString("user_id");
                o.LJIIIIZZ(string7, "jsonObject.getString(\"user_id\")");
                return new AccessToken(string, applicationId, string7, collection2, arrayList, arrayList2, enumC66385Q3p, LJIIJJI, new Date(), LJIIJJI2, string5);
            }
            throw new Q4W("Failed to retrieve user_id from signed_request");
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
