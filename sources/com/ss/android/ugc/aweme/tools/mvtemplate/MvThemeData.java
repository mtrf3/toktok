package com.ss.android.ugc.aweme.tools.mvtemplate;

import X.C16880lQ;
import X.C44172HVg;
import X.C77413UZt;
import X.EnumC43998HOo;
import X.InterfaceC65349Pkn;
import X.InterfaceC82548WaW;
import X.X1D;
import Y.IDCreatorS51S0000000_7;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class MvThemeData implements Parcelable, InterfaceC82548WaW {
    public static final Parcelable.Creator<MvThemeData> CREATOR = new IDCreatorS51S0000000_7(22);

    @InterfaceC65349Pkn("algorithmKeyForSave")
    public List<String> algorithmKeyForSave;

    @InterfaceC65349Pkn("effect")
    public Effect effect;

    @InterfaceC65349Pkn("hasCommerceMusic")
    public boolean hasCommerceMusic;

    @InterfaceC65349Pkn("imgMd5")
    public String imgMd5;

    @InterfaceC65349Pkn("isDefaultType")
    public boolean isDefaultType;

    @InterfaceC65349Pkn("is_mv_anchor")
    public int isMvAnchor;

    @InterfaceC65349Pkn("maxCount")
    public int maxCount;

    @InterfaceC65349Pkn("minCount")
    public int minCount;

    @InterfaceC65349Pkn("mvAlgorithmHint")
    public String mvAlgorithmHint;

    @InterfaceC65349Pkn("mvAutoSaveToast")
    public String mvAutoSaveToast;

    @InterfaceC65349Pkn("mvType")
    public int mvType;

    @InterfaceC65349Pkn("needServerExecute")
    public boolean needServerExecute;

    @InterfaceC65349Pkn("resFillMode")
    public String resFillMode;

    @InterfaceC65349Pkn("resHeight")
    public int resHeight;

    @InterfaceC65349Pkn("resWidth")
    public int resWidth;

    @InterfaceC65349Pkn("source_id")
    public int sourceId;

    @InterfaceC65349Pkn("srcLimitHeight")
    public int srcLimitHeight;

    @InterfaceC65349Pkn("srcLimitToast")
    public String srcLimitToast;

    @InterfaceC65349Pkn("srcLimitWidth")
    public int srcLimitWidth;

    @InterfaceC65349Pkn("urlPrefixList")
    public List<String> urlPrefixList;

    @InterfaceC65349Pkn("videoMd5")
    public String videoMd5;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.InterfaceC82548WaW
    public final String LIZ() {
        if (TextUtils.isEmpty(this.imgMd5) || C77413UZt.LJIILL(this.urlPrefixList)) {
            return null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append((String) ListProtector.get(this.urlPrefixList, 0));
        LIZ.append(this.imgMd5);
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC82548WaW
    public final VideoUrlModel LJ() {
        VideoUrlModel videoUrlModel = new VideoUrlModel();
        videoUrlModel.setBytevc1(false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(LJIILIIL());
        videoUrlModel.setUrlList(arrayList);
        videoUrlModel.setUrlKey(this.videoMd5);
        videoUrlModel.setUri(this.videoMd5);
        return videoUrlModel;
    }

    @Override // X.InterfaceC82548WaW
    public final String LJIIIIZZ() {
        Effect effect = this.effect;
        if (effect == null || effect.getName() == null) {
            return "";
        }
        return this.effect.getName();
    }

    public final String LJIIIZ() {
        Effect effect = this.effect;
        if (effect != null) {
            return effect.getUnzipPath();
        }
        return null;
    }

    public final String LJIIJ() {
        UrlModel fileUrl;
        Effect effect = this.effect;
        if (effect != null && (fileUrl = effect.getFileUrl()) != null && !C77413UZt.LJIILL(fileUrl.getUrlList())) {
            return (String) ListProtector.get(fileUrl.getUrlList(), 0);
        }
        return null;
    }

    public final String LJIIJJI() {
        Effect effect = this.effect;
        if (effect != null) {
            return effect.getEffectId();
        }
        return null;
    }

    public final String LJIIL() {
        String str = this.mvAlgorithmHint;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String LJIILIIL() {
        if (TextUtils.isEmpty(this.videoMd5) || C77413UZt.LJIILL(this.urlPrefixList)) {
            return null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append((String) ListProtector.get(this.urlPrefixList, 0));
        LIZ.append(this.videoMd5);
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC82548WaW
    public final boolean isValid() {
        if (this.effect != null && !TextUtils.isEmpty(LJIILIIL()) && !TextUtils.isEmpty(this.videoMd5) && !TextUtils.isEmpty(LIZIZ())) {
            return true;
        }
        return false;
    }

    public MvThemeData() {
        this.sourceId = 1;
    }

    @Override // X.InterfaceC82548WaW
    public final String LIZIZ() {
        String LJIIJJI = LJIIJJI();
        if (LJIIJJI == null) {
            return "";
        }
        return LJIIJJI;
    }

    @Override // X.InterfaceC82548WaW
    public final boolean LJI() {
        return this.hasCommerceMusic;
    }

    @Override // X.InterfaceC82548WaW
    public final EnumC43998HOo LJII() {
        return EnumC43998HOo.MV_TEMPLATE;
    }

    public MvThemeData(Parcel parcel) {
        boolean z;
        boolean z2;
        this.sourceId = 1;
        this.effect = (Effect) parcel.readParcelable(Effect.class.getClassLoader());
        this.urlPrefixList = parcel.createStringArrayList();
        this.minCount = parcel.readInt();
        this.maxCount = parcel.readInt();
        this.videoMd5 = parcel.readString();
        this.imgMd5 = parcel.readString();
        this.resFillMode = parcel.readString();
        this.resWidth = parcel.readInt();
        this.resHeight = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isDefaultType = z;
        this.mvType = parcel.readInt();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.needServerExecute = z2;
        this.mvAlgorithmHint = parcel.readString();
        this.mvAutoSaveToast = parcel.readString();
        this.algorithmKeyForSave = parcel.createStringArrayList();
        this.hasCommerceMusic = parcel.readByte() != 0;
        this.sourceId = parcel.readInt();
        this.isMvAnchor = parcel.readInt();
    }

    @Override // X.InterfaceC82548WaW
    public final String LIZLLL(Context context) {
        Effect effect = this.effect;
        if (effect != null) {
            return effect.getHint();
        }
        return "";
    }

    public final void LJIILJJIL(Effect effect) {
        this.effect = effect;
        if (effect != null) {
            try {
                JSONObject jSONObject = new JSONObject(this.effect.getExtra());
                this.minCount = jSONObject.optInt("template_min_material", 0);
                this.maxCount = jSONObject.optInt("template_max_material", 0);
                this.videoMd5 = jSONObject.optString("template_video_cover", "");
                this.imgMd5 = jSONObject.optString("template_picture_cover", "");
                this.resFillMode = jSONObject.optString("template_pic_fill_mode", "AspectFit");
                this.resWidth = jSONObject.optInt("template_pic_input_width", 720);
                this.resHeight = jSONObject.optInt("template_pic_input_height", 1280);
                this.mvType = jSONObject.optInt("template_type", 0);
                this.mvAlgorithmHint = jSONObject.optString("mv_algorithm_hint");
                this.mvAutoSaveToast = jSONObject.optString("mv_auto_save_toast");
                this.srcLimitToast = jSONObject.optString("mv_resolution_limited_toast");
                this.srcLimitWidth = jSONObject.optInt("mv_resolution_limited_width");
                this.srcLimitHeight = jSONObject.optInt("mv_resolution_limited_height");
                this.algorithmKeyForSave = (List) C44172HVg.LIZIZ.LJII(jSONObject.optString("mv_server_algorithm_result_save_keys"), new TypeToken<List<String>>() { // from class: X.2ZJ
                }.getType());
                this.hasCommerceMusic = jSONObject.optBoolean("is_commerce_music", false);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.effect, i);
        parcel.writeStringList(this.urlPrefixList);
        parcel.writeInt(this.minCount);
        parcel.writeInt(this.maxCount);
        parcel.writeString(this.videoMd5);
        parcel.writeString(this.imgMd5);
        parcel.writeString(this.resFillMode);
        parcel.writeInt(this.resWidth);
        parcel.writeInt(this.resHeight);
        parcel.writeByte(this.isDefaultType ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.mvType);
        parcel.writeByte(this.needServerExecute ? (byte) 1 : (byte) 0);
        parcel.writeString(this.mvAlgorithmHint);
        parcel.writeString(this.mvAutoSaveToast);
        parcel.writeStringList(this.algorithmKeyForSave);
        parcel.writeByte(this.hasCommerceMusic ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.sourceId);
        parcel.writeInt(this.isMvAnchor);
    }
}
