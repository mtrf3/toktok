package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.EOx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36363EOx implements Serializable {
    public static final long serialVersionUID = -6027923654002990158L;
    public final transient boolean LJLIL;
    public String LJLILLLLZI;
    public volatile boolean mDownloaded;
    public int mHeight;
    public boolean mIsGif;
    public boolean mIsVideo;
    public String mKey;
    public boolean mNeedAlpha;
    public String mOpenUrl;
    public String mUri;
    public String mUrlList;
    public int mWidth;

    public boolean isValid() {
        if (this.mWidth > 0 && this.mHeight > 0 && !TextUtils.isEmpty(this.mUri) && !TextUtils.isEmpty(this.mUrlList)) {
            return true;
        }
        return false;
    }

    public JSONObject toJsonObj() {
        if (TextUtils.isEmpty(this.mUri)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("uri", this.mUri);
            jSONObject.put("width", this.mWidth);
            jSONObject.put("height", this.mHeight);
            String str = this.mOpenUrl;
            if (str != null) {
                jSONObject.put("open_url", str);
            }
            if (!TextUtils.isEmpty(this.mUrlList)) {
                try {
                    jSONObject.put("url_list", new JSONArray(this.mUrlList));
                } catch (Exception unused) {
                }
            }
            return jSONObject;
        } catch (Exception unused2) {
            return null;
        }
    }

    public String getExtraKey() {
        return this.LJLILLLLZI;
    }

    public boolean isFixedDisplaySize() {
        return this.LJLIL;
    }

    public static C36363EOx fromJsonStr(String str) {
        return fromJsonStr(str, true);
    }

    public static boolean isHttpUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!str.startsWith("http://") && !str.startsWith("https://")) {
            return false;
        }
        return true;
    }

    public static JSONArray toJsonArray(List<C36363EOx> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<C36363EOx> it = list.iterator();
        while (it.hasNext()) {
            JSONObject jsonObj = it.next().toJsonObj();
            if (jsonObj != null) {
                jSONArray.put(jsonObj);
            }
        }
        return jSONArray;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C36363EOx.class != obj.getClass()) {
            return false;
        }
        C36363EOx c36363EOx = (C36363EOx) obj;
        if (this.mWidth != c36363EOx.mWidth || this.mHeight != c36363EOx.mHeight || this.mIsGif != c36363EOx.mIsGif || this.mDownloaded != c36363EOx.mDownloaded || this.mIsVideo != c36363EOx.mIsVideo || this.LJLIL != c36363EOx.LJLIL) {
            return false;
        }
        String str = this.mUri;
        if (str == null ? c36363EOx.mUri != null : !str.equals(c36363EOx.mUri)) {
            return false;
        }
        String str2 = this.mOpenUrl;
        if (str2 == null ? c36363EOx.mOpenUrl != null : !str2.equals(c36363EOx.mOpenUrl)) {
            return false;
        }
        String str3 = this.mUrlList;
        if (str3 == null ? c36363EOx.mUrlList != null : !str3.equals(c36363EOx.mUrlList)) {
            return false;
        }
        String str4 = this.LJLILLLLZI;
        if (str4 == null ? c36363EOx.LJLILLLLZI != null : !str4.equals(c36363EOx.LJLILLLLZI)) {
            return false;
        }
        String str5 = this.mKey;
        String str6 = c36363EOx.mKey;
        if (str5 != null) {
            if (str5.equals(str6)) {
                return true;
            }
        } else if (str6 == null) {
            return true;
        }
        return false;
    }

    public void setExtraKey(String str) {
        this.LJLILLLLZI = str;
    }

    public C36363EOx(String str, String str2) {
        this(str, str2, 0, 0, false);
    }

    public static List<C36364EOy> extractImageUrlList(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str2)) {
            try {
                JSONArray jSONArray = new JSONArray(str2);
                int length = jSONArray.length();
                if (length > 3) {
                    length = 3;
                }
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = JSONArrayProtectorUtils.getJSONObject(jSONArray, i);
                    String string = JSONObjectProtectorUtils.getString(jSONObject, "url");
                    if (!TextUtils.isEmpty(string)) {
                        C36364EOy c36364EOy = new C36364EOy(string);
                        arrayList.add(c36364EOy);
                        JSONObject optJSONObject = jSONObject.optJSONObject("header");
                        if (optJSONObject != null) {
                            Iterator<String> keys = optJSONObject.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                String string2 = JSONObjectProtectorUtils.getString(optJSONObject, next);
                                if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(string2)) {
                                    ((ArrayList) c36364EOy.LIZIZ).add(new C66619QCp(next, string2));
                                }
                            }
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
        if (arrayList.isEmpty() && !TextUtils.isEmpty(str) && isHttpUrl(str.toLowerCase())) {
            arrayList.add(new C36364EOy(str));
        }
        return arrayList;
    }

    public static C36363EOx fromJson(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("uri");
        String optString2 = jSONObject.optString("url_list");
        int optInt = jSONObject.optInt("width");
        int optInt2 = jSONObject.optInt("height");
        int optInt3 = jSONObject.optInt("r_width", -1);
        int optInt4 = jSONObject.optInt("r_height", -1);
        if (optInt3 != -1) {
            optInt = optInt3;
        }
        if (optInt4 != -1) {
            optInt2 = optInt4;
        }
        if (TextUtils.isEmpty(optString)) {
            return null;
        }
        if (z && (optInt <= 0 || optInt2 <= 0)) {
            return null;
        }
        C36363EOx c36363EOx = new C36363EOx(optString, optString2, optInt, optInt2);
        c36363EOx.mOpenUrl = jSONObject.optString("open_url", null);
        c36363EOx.mIsGif = jSONObject.optBoolean("is_gif");
        return c36363EOx;
    }

    public static C36363EOx fromJsonStr(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return fromJson(new JSONObject(str), z);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getUrlFromImageInfo(C36363EOx c36363EOx, boolean z) {
        String str;
        if (c36363EOx == null) {
            return null;
        }
        if (z) {
            str = c36363EOx.mUri;
        } else {
            str = null;
        }
        List<C36364EOy> extractImageUrlList = extractImageUrlList(str, c36363EOx.mUrlList);
        if (extractImageUrlList == null || extractImageUrlList.size() <= 0) {
            return null;
        }
        return ((C36364EOy) ListProtector.get(extractImageUrlList, 0)).LIZ;
    }

    public static ArrayList<C36363EOx> optImageList(JSONArray jSONArray, boolean z) {
        C36363EOx fromJson;
        ArrayList<C36363EOx> arrayList = null;
        if (jSONArray != null && jSONArray.length() != 0) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null && (fromJson = fromJson(optJSONObject, z)) != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(fromJson);
                }
            }
        }
        return arrayList;
    }

    public static List<C36363EOx> parseImageList(JSONArray jSONArray, boolean z) {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            C36363EOx fromJson = fromJson(JSONArrayProtectorUtils.getJSONObject(jSONArray, i), z);
            if (fromJson != null) {
                arrayList.add(fromJson);
            }
        }
        return arrayList;
    }

    public static ArrayList<C36363EOx> optImageList(JSONObject jSONObject, String str, boolean z) {
        if (jSONObject == null || str == null || str.length() == 0 || !jSONObject.has(str)) {
            return null;
        }
        return optImageList(jSONObject.optJSONArray(str), z);
    }

    public C36363EOx(String str, String str2, int i, int i2) {
        this(str, str2, i, i2, false);
    }

    public C36363EOx(String str, String str2, int i, int i2, boolean z) {
        this.mUri = str;
        this.mUrlList = str2;
        this.mKey = C38352F3k.LIZJ(str);
        this.mWidth = i;
        this.mHeight = i2;
        if (i > 0 && i2 > 0) {
            this.LJLIL = z;
        }
    }
}
