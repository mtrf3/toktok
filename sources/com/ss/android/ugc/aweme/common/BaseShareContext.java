package com.ss.android.ugc.aweme.common;

import X.C16880lQ;
import X.C69432nz;
import X.C78886Uxe;
import X.EnumC43698HDa;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public abstract class BaseShareContext implements Serializable {

    @InterfaceC65349Pkn("callerLocalEntry")
    public String callerLocalEntry;

    @InterfaceC65349Pkn("creativeInitModelJson")
    public String creativeInitModelJson;

    @InterfaceC65349Pkn("mAnchorInfo")
    public String mAnchorInfo;

    @InterfaceC65349Pkn("mAnchorSourceType")
    public String mAnchorSourceType;

    @InterfaceC65349Pkn("mAppName")
    public String mAppName;

    @InterfaceC65349Pkn("mApplyEffectResourceId")
    public String mApplyEffectResourceId;

    @InterfaceC65349Pkn("mCallerPackage")
    public String mCallerPackage;

    @InterfaceC65349Pkn("mChallengeName")
    public String mChallengeName;

    @InterfaceC65349Pkn("mClientKey")
    public String mClientKey;

    @InterfaceC65349Pkn("mCurrentPage")
    public String mCurrentPage;

    @InterfaceC65349Pkn("mExtraShareOptions")
    public HashMap<String, Integer> mExtraShareOptions;

    @InterfaceC65349Pkn("mExtras")
    public String mExtras;

    @InterfaceC65349Pkn("mHashTags")
    public ArrayList<String> mHashTags;

    @InterfaceC65349Pkn("mIsFromDraft")
    public boolean mIsFromDraft;

    @InterfaceC65349Pkn("mMusicContent")
    public MusicContent mMusicContent;

    @InterfaceC65349Pkn("mNeedShowDialog")
    public boolean mNeedShowDialog;

    @InterfaceC65349Pkn("mOpenPlatformExtra")
    public String mOpenPlatformExtra;

    @InterfaceC65349Pkn("mPublishSettings")
    public PublishSettings mPublishSettings;

    @InterfaceC65349Pkn("mSdkName")
    public String mSdkName;

    @InterfaceC65349Pkn("mSdkVersion")
    public String mSdkVersion;

    @InterfaceC65349Pkn("mShareFormat")
    public EnumC43698HDa mShareFormat;

    @InterfaceC65349Pkn("mShareKitPanel")
    public ShareKitPanel mShareKitPanel;

    @InterfaceC65349Pkn("mShareMediaType")
    public int mShareMediaType;

    @InterfaceC65349Pkn("mShareModel")
    public BaseShareContext mShareModel;

    @InterfaceC65349Pkn("mSharePanelOption")
    public String mSharePanelOption;

    @InterfaceC65349Pkn("mState")
    public String mState;

    @InterfaceC65349Pkn("mTargetSceneType")
    public int mTargetSceneType;

    @InterfaceC65349Pkn("oldHashTag")
    public String oldHashTag;

    @InterfaceC65349Pkn("photoMode")
    public boolean photoMode;

    public Bundle getShareRequestBundle() {
        Bundle bundle = new Bundle();
        bundle.putString("_aweme_open_sdk_params_caller_local_entry", this.callerLocalEntry);
        bundle.putString("_aweme_open_sdk_params_caller_package", this.mCallerPackage);
        bundle.putString("_aweme_open_sdk_params_client_key", this.mClientKey);
        bundle.putString("_aweme_params_caller_open_sdk_name", this.mSdkName);
        bundle.putString("_aweme_open_sdk_params_state", this.mState);
        bundle.putStringArrayList("_aweme_open_sdk_params_hashtag_list", this.mHashTags);
        bundle.putInt("_aweme_open_sdk_params_target_landpage_scene", this.mTargetSceneType);
        bundle.putString("_aweme_open_sdk_params_anchor_info", this.mAnchorInfo);
        bundle.putString("extra", this.mOpenPlatformExtra);
        bundle.putString("anchor_source_type", this.mAnchorSourceType);
        bundle.putSerializable("_aweme_open_sdk_extra_share_options", this.mExtraShareOptions);
        bundle.putSerializable("publish_settings", this.mPublishSettings);
        bundle.putString("_aweme_apply_effect_resource_id", this.mApplyEffectResourceId);
        bundle.putString("_aweme_share_panel_option", this.mSharePanelOption);
        bundle.putInt("_aweme_share_media_type", this.mShareMediaType);
        EnumC43698HDa enumC43698HDa = this.mShareFormat;
        if (enumC43698HDa != null) {
            bundle.putInt("_aweme_open_sdk_params_share_format", enumC43698HDa.getValue());
        }
        bundle.putParcelable("share_kit_panel", this.mShareKitPanel);
        bundle.putSerializable("share_model", this.mShareModel);
        bundle.putString("creative_initial_model", this.creativeInitModelJson);
        bundle.putBoolean("photo_mode", this.photoMode);
        String str = this.mExtras;
        if (str != null && !str.isEmpty()) {
            Bundle bundle2 = new Bundle();
            try {
                String str2 = (String) new JSONObject(this.mExtras).get("style_id");
                if (!str2.isEmpty()) {
                    bundle2.putString("style_id", str2);
                }
                bundle.putBundle("_bytedance_params_extra", bundle2);
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return bundle;
    }

    public BaseShareContext() {
        this.mHashTags = new ArrayList<>();
        this.mNeedShowDialog = true;
        this.mTargetSceneType = 0;
        this.mApplyEffectResourceId = null;
        this.mSharePanelOption = "";
        this.mShareMediaType = 0;
    }

    public String getChallengeName() {
        return this.mChallengeName;
    }

    public BaseShareContext(Bundle bundle) {
        EnumC43698HDa enumC43698HDa;
        this.mHashTags = new ArrayList<>();
        this.mNeedShowDialog = true;
        this.mTargetSceneType = 0;
        this.mApplyEffectResourceId = null;
        this.mSharePanelOption = "";
        this.mShareMediaType = 0;
        this.mCallerPackage = bundle.getString("_aweme_open_sdk_params_caller_package");
        this.callerLocalEntry = bundle.getString("_aweme_open_sdk_params_caller_local_entry");
        this.mSdkName = bundle.getString("_aweme_params_caller_open_sdk_name");
        this.mSdkVersion = bundle.getString("_aweme_params_caller_open_sdk_version", "");
        this.mState = bundle.getString("_aweme_open_sdk_params_state");
        this.mClientKey = bundle.getString("_aweme_open_sdk_params_client_key");
        this.oldHashTag = bundle.getString("_aweme_open_sdk_params_target_scene");
        if (bundle.containsKey("_aweme_open_sdk_params_hashtag_list")) {
            this.mHashTags = bundle.getStringArrayList("_aweme_open_sdk_params_hashtag_list");
        }
        if (C78886Uxe.LJJIJ(this.mHashTags)) {
            if (!TextUtils.isEmpty(this.oldHashTag)) {
                ArrayList<String> arrayList = new ArrayList<>();
                this.mHashTags = arrayList;
                arrayList.add(this.oldHashTag.trim());
            }
        } else {
            for (int i = 0; i < this.mHashTags.size(); i++) {
                ArrayList<String> arrayList2 = this.mHashTags;
                ListProtector.set(arrayList2, i, ((String) ListProtector.get(arrayList2, i)).trim());
            }
        }
        this.mAnchorInfo = bundle.getString("_aweme_open_sdk_params_anchor_info");
        this.mExtras = LIZ(bundle.getBundle("_bytedance_params_extra"));
        this.mTargetSceneType = bundle.getInt("_aweme_open_sdk_params_target_landpage_scene");
        this.mOpenPlatformExtra = bundle.getString("extra");
        this.mAnchorSourceType = bundle.getString("anchor_source_type");
        this.mExtraShareOptions = (HashMap) bundle.getSerializable("_aweme_open_sdk_extra_share_options");
        if (bundle.containsKey("publish_settings")) {
            this.mPublishSettings = (PublishSettings) GsonProtectorUtils.fromJson(C69432nz.LIZ(), bundle.getString("publish_settings"), PublishSettings.class);
        }
        this.mApplyEffectResourceId = bundle.getString("_aweme_apply_effect_resource_id");
        this.mSharePanelOption = bundle.getString("_aweme_share_panel_option");
        this.mShareMediaType = bundle.getInt("_aweme_share_media_type");
        int i2 = bundle.getInt("_aweme_open_sdk_params_share_format");
        EnumC43698HDa.Companion.getClass();
        if (i2 == 1) {
            enumC43698HDa = EnumC43698HDa.GREEN_SCREEN;
        } else {
            enumC43698HDa = EnumC43698HDa.DEFAULT;
        }
        this.mShareFormat = enumC43698HDa;
        this.mShareKitPanel = (ShareKitPanel) bundle.getParcelable("share_kit_panel");
        this.mShareModel = (BaseShareContext) bundle.getSerializable("share_model");
        if (bundle.containsKey("music_content")) {
            this.mMusicContent = (MusicContent) GsonProtectorUtils.fromJson(C69432nz.LIZ(), bundle.getString("music_content"), MusicContent.class);
        }
        try {
            if (this.mExtras != null) {
                this.creativeInitModelJson = new JSONObject(this.mExtras).optString("creative_initial_model");
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        this.photoMode = bundle.getBoolean("photo_mode", false);
    }

    public static String LIZ(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            try {
                jSONObject.put(str, wrap(C16880lQ.LLJJIII(bundle, str)));
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return jSONObject.toString();
    }

    public static String getCreativeInitialModelJson(Bundle bundle) {
        String str = null;
        if (bundle == null) {
            return null;
        }
        try {
            str = new JSONObject(LIZ(bundle.getBundle("_bytedance_params_extra"))).optString("creative_initial_model");
            return str;
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
            return str;
        }
    }

    public static JSONArray toJSONArray(Object obj) {
        JSONArray jSONArray = new JSONArray();
        if (obj.getClass().isArray()) {
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                jSONArray.put(wrap(Array.get(obj, i)));
            }
            return jSONArray;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Not a primitive array: ");
        LIZ.append(obj.getClass());
        throw new JSONException(X1D.LIZIZ(LIZ));
    }

    public static Object wrap(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject)) {
            return obj;
        }
        if (obj.equals(JSONObject.NULL)) {
            return obj;
        }
        if (obj instanceof Collection) {
            return new JSONArray((Collection) obj);
        }
        if (obj.getClass().isArray()) {
            return toJSONArray(obj);
        }
        if (obj instanceof Map) {
            return new JSONObject((Map) obj);
        }
        if (!(obj instanceof Boolean) && !(obj instanceof Byte) && !(obj instanceof Character) && !(obj instanceof Double) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Short) && !(obj instanceof String)) {
            if (obj.getClass().getPackage().getName().startsWith("java.")) {
                return obj.toString();
            }
            return null;
        }
        return obj;
    }

    public void setChallengeName(String str) {
        this.mChallengeName = str;
    }
}
