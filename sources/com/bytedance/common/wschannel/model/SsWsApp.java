package com.bytedance.common.wschannel.model;

import X.C16880lQ;
import X.QOY;
import Y.IDCreatorS54S0000000_11;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.common.wschannel.app.IWsApp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class SsWsApp implements IWsApp, Parcelable {
    public static final Parcelable.Creator<SsWsApp> CREATOR = new IDCreatorS54S0000000_11(7);
    public boolean LJLIL;
    public final List<Integer> LJLILLLLZI;
    public String LJLJI;
    public int LJLJJI;
    public boolean LJLJJL;
    public final List<Integer> LJLJJLL;
    public String appKey;
    public int channelId;
    public String extra;
    public int fPid;
    public Map<String, String> headers;
    public int mAppId;
    public int mAppVersion;
    public String mDeviceId;
    public String mInstallId;
    public int mPlatform;
    public List<String> urls;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public final JSONObject LJJIII() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("channel_id", this.channelId);
        jSONObject.put("app_id", this.mAppId);
        jSONObject.put("device_id", this.mDeviceId);
        jSONObject.put("install_id", this.mInstallId);
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.urls;
        if (list != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
        }
        Map<String, String> map = this.headers;
        JSONObject jSONObject2 = new JSONObject();
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (!TextUtils.isEmpty(entry.getKey())) {
                    try {
                        jSONObject2.put(entry.getKey(), entry.getValue());
                    } catch (JSONException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
            }
        }
        jSONObject.put("headers", jSONObject2);
        jSONObject.put("urls", jSONArray);
        jSONObject.put("app_version", this.mAppVersion);
        jSONObject.put("platform", this.mPlatform);
        jSONObject.put("fpid", this.fPid);
        jSONObject.put("app_kay", this.appKey);
        jSONObject.put("extra", this.extra);
        jSONObject.put("private_protocol_enable", this.LJLIL);
        JSONArray jSONArray2 = new JSONArray();
        List<Integer> list2 = this.LJLILLLLZI;
        if (list2 != null) {
            Iterator<Integer> it2 = list2.iterator();
            while (it2.hasNext()) {
                jSONArray2.put(it2.next());
            }
        }
        jSONObject.put("service_id_list", jSONArray2);
        jSONObject.put("private_protocol_url", this.LJLJI);
        jSONObject.put("transport_mode", this.LJLJJI);
        jSONObject.put("disable_fallback_websocket", this.LJLJJL);
        JSONArray jSONArray3 = new JSONArray();
        List<Integer> list3 = this.LJLJJLL;
        if (list3 != null) {
            Iterator<Integer> it3 = list3.iterator();
            while (it3.hasNext()) {
                jSONArray3.put(it3.next());
            }
        }
        jSONObject.put("monitor_service_id_list", jSONArray3);
        return jSONObject;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int hashCode = this.headers.hashCode() * 31;
        List<String> list = this.urls;
        int i5 = 0;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        int i6 = (((hashCode + i) * 31) + this.channelId) * 31;
        String str = this.extra;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (((i6 + i2) * 31) + this.mAppId) * 31;
        String str2 = this.mDeviceId;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        String str3 = this.mInstallId;
        if (str3 != null) {
            i4 = str3.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (((((((i8 + i4) * 31) + this.mAppVersion) * 31) + this.mPlatform) * 31) + this.fPid) * 31;
        String str4 = this.appKey;
        if (str4 != null) {
            i5 = str4.hashCode();
        }
        return i9 + i5;
    }

    public SsWsApp() {
        this.headers = new HashMap();
        this.urls = new ArrayList();
        this.LJLILLLLZI = new ArrayList();
        this.LJLJJLL = new ArrayList();
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public final String LIZJ() {
        return this.mInstallId;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public final Map<String, String> LJFF() {
        return this.headers;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public final int LJJLI() {
        return this.channelId;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public final List<Integer> LJLLL() {
        return this.LJLJJLL;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public final int LLJJJJLIIL() {
        return this.fPid;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public final boolean LLLIILIL() {
        return this.LJLJJL;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public final List<Integer> LLLLILI() {
        return this.LJLILLLLZI;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public final String LLLLLIL() {
        return this.LJLJI;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public final List<String> LLLLZ() {
        return this.urls;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public final int LLLZLL() {
        return this.LJLJJI;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public final boolean g() {
        return this.LJLIL;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public final int getAppId() {
        return this.mAppId;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public final String getAppKey() {
        return this.appKey;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public final int getAppVersion() {
        return this.mAppVersion;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public final String getDeviceId() {
        return this.mDeviceId;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public final String getExtra() {
        return this.extra;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public final int getPlatform() {
        return this.mPlatform;
    }

    public SsWsApp(Parcel parcel) {
        boolean z;
        this.headers = new HashMap();
        this.urls = new ArrayList();
        this.LJLILLLLZI = new ArrayList();
        this.LJLJJLL = new ArrayList();
        int readInt = parcel.readInt();
        this.headers = new HashMap(readInt);
        for (int i = 0; i < readInt; i++) {
            this.headers.put(parcel.readString(), parcel.readString());
        }
        this.urls = parcel.createStringArrayList();
        this.channelId = parcel.readInt();
        this.extra = parcel.readString();
        this.mAppId = parcel.readInt();
        this.mDeviceId = parcel.readString();
        this.mInstallId = parcel.readString();
        this.mAppVersion = parcel.readInt();
        this.mPlatform = parcel.readInt();
        this.fPid = parcel.readInt();
        this.appKey = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.LJLIL = z;
        int readInt2 = parcel.readInt();
        for (int i2 = 0; i2 < readInt2; i2++) {
            this.LJLILLLLZI.add(Integer.valueOf(parcel.readInt()));
        }
        this.LJLJI = parcel.readString();
        this.LJLJJI = parcel.readInt();
        this.LJLJJL = parcel.readByte() != 0;
        int readInt3 = parcel.readInt();
        for (int i3 = 0; i3 < readInt3; i3++) {
            this.LJLJJLL.add(Integer.valueOf(parcel.readInt()));
        }
    }

    public final void LIZ(JSONObject jSONObject) {
        String obj;
        if (jSONObject == null) {
            return;
        }
        this.channelId = jSONObject.optInt("channel_id");
        this.mAppId = jSONObject.optInt("app_id");
        this.mDeviceId = jSONObject.optString("device_id");
        this.mInstallId = jSONObject.optString("install_id");
        this.mAppVersion = jSONObject.optInt("app_version");
        this.mPlatform = jSONObject.optInt("platform");
        this.fPid = jSONObject.optInt("fpid");
        this.appKey = jSONObject.optString("app_kay");
        this.extra = jSONObject.optString("extra");
        JSONArray optJSONArray = jSONObject.optJSONArray("urls");
        this.urls.clear();
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                this.urls.add(optJSONArray.optString(i));
            }
        }
        this.LJLIL = jSONObject.optBoolean("private_protocol_enable");
        JSONArray optJSONArray2 = jSONObject.optJSONArray("service_id_list");
        this.LJLILLLLZI.clear();
        if (optJSONArray2 != null) {
            int length2 = optJSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                this.LJLILLLLZI.add(Integer.valueOf(optJSONArray2.optInt(i2)));
            }
        }
        this.LJLJI = jSONObject.optString("private_protocol_url");
        this.LJLJJI = jSONObject.optInt("transport_mode");
        this.LJLJJL = jSONObject.optBoolean("disable_fallback_websocket");
        JSONArray optJSONArray3 = jSONObject.optJSONArray("monitor_service_id_list");
        this.LJLJJLL.clear();
        if (optJSONArray3 != null) {
            int length3 = optJSONArray3.length();
            for (int i3 = 0; i3 < length3; i3++) {
                this.LJLJJLL.add(Integer.valueOf(optJSONArray3.optInt(i3)));
            }
        }
        this.headers.clear();
        Map<String, String> map = this.headers;
        JSONObject optJSONObject = jSONObject.optJSONObject("headers");
        HashMap hashMap = new HashMap();
        if (optJSONObject != null) {
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!TextUtils.isEmpty(next)) {
                    Object opt = optJSONObject.opt(next);
                    if (opt == null) {
                        obj = null;
                    } else {
                        obj = opt.toString();
                    }
                    hashMap.put(next, obj);
                }
            }
        }
        map.putAll(hashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SsWsApp ssWsApp = (SsWsApp) obj;
        if (this.channelId != ssWsApp.channelId || this.mAppId != ssWsApp.mAppId || this.mAppVersion != ssWsApp.mAppVersion || this.mPlatform != ssWsApp.mPlatform || this.fPid != ssWsApp.fPid || !this.headers.equals(ssWsApp.headers)) {
            return false;
        }
        List<String> list = this.urls;
        if (list == null ? ssWsApp.urls != null : !list.equals(ssWsApp.urls)) {
            return false;
        }
        String str = this.extra;
        if (str == null ? ssWsApp.extra != null : !str.equals(ssWsApp.extra)) {
            return false;
        }
        String str2 = this.mDeviceId;
        if (str2 == null ? ssWsApp.mDeviceId != null : !str2.equals(ssWsApp.mDeviceId)) {
            return false;
        }
        String str3 = this.mInstallId;
        if (str3 == null ? ssWsApp.mInstallId != null : !str3.equals(ssWsApp.mInstallId)) {
            return false;
        }
        String str4 = this.appKey;
        String str5 = ssWsApp.appKey;
        if (str4 != null) {
            return str4.equals(str5);
        }
        if (str5 == null) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.headers.size());
        for (Map.Entry<String, String> entry : this.headers.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
        parcel.writeStringList(this.urls);
        parcel.writeInt(this.channelId);
        parcel.writeString(this.extra);
        parcel.writeInt(this.mAppId);
        parcel.writeString(this.mDeviceId);
        parcel.writeString(this.mInstallId);
        parcel.writeInt(this.mAppVersion);
        parcel.writeInt(this.mPlatform);
        parcel.writeInt(this.fPid);
        parcel.writeString(this.appKey);
        parcel.writeByte(this.LJLIL ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.LJLILLLLZI.size());
        Iterator<Integer> it = this.LJLILLLLZI.iterator();
        while (it.hasNext()) {
            parcel.writeInt(it.next().intValue());
        }
        parcel.writeString(this.LJLJI);
        parcel.writeInt(this.LJLJJI);
        parcel.writeByte(this.LJLJJL ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.LJLJJLL.size());
        Iterator<Integer> it2 = this.LJLJJLL.iterator();
        while (it2.hasNext()) {
            parcel.writeInt(it2.next().intValue());
        }
    }

    public SsWsApp(int i, int i2, String str, String str2, List list, int i3, int i4, int i5, String str3, String str4, boolean z, List list2, String str5, int i6, boolean z2, List list3, QOY qoy) {
        this.headers = new HashMap();
        this.urls = new ArrayList();
        this.LJLILLLLZI = new ArrayList();
        this.LJLJJLL = new ArrayList();
        this.mAppId = i2;
        this.channelId = i;
        this.mDeviceId = str;
        this.mInstallId = str2;
        if (list != null) {
            this.urls.addAll(list);
        }
        this.mAppVersion = i3;
        this.mPlatform = i4;
        this.fPid = i5;
        this.appKey = str3;
        this.extra = str4;
        Map<String, String> map = qoy.LJIIJ;
        if (map != null) {
            this.headers.putAll(map);
        }
        this.LJLIL = z;
        this.LJLILLLLZI = list2;
        this.LJLJI = str5;
        this.LJLJJI = i6;
        this.LJLJJL = z2;
        this.LJLJJLL = list3;
    }
}
