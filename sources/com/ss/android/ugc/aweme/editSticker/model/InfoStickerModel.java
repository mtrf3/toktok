package com.ss.android.ugc.aweme.editSticker.model;

import X.C16880lQ;
import X.C1NE;
import X.C78886Uxe;
import X.InterfaceC65349Pkn;
import X.Q89;
import X.X1D;
import Y.IDCreatorS47S0000000_2;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.i0;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class InfoStickerModel implements Parcelable, Serializable, Cloneable {
    public static final Parcelable.Creator<InfoStickerModel> CREATOR = new IDCreatorS47S0000000_2(0);

    @InterfaceC65349Pkn("sticker_dir")
    public String infoStickerDraftDir;

    @InterfaceC65349Pkn("text_align")
    public int mAlign;

    @InterfaceC65349Pkn("bg_mode")
    public int mBgMode;

    @InterfaceC65349Pkn("bg_color")
    public int mColor;

    @InterfaceC65349Pkn("text_font_id")
    public String mFontId;

    @InterfaceC65349Pkn("text_font_path")
    public String mFontPath;

    @InterfaceC65349Pkn("text_font")
    public String mFontType;

    @InterfaceC65349Pkn("text_audio_length")
    public int mTextAudioLength;

    @InterfaceC65349Pkn("stickers")
    public List<StickerItemModel> stickers;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void clearInfoSticker() {
        Iterator<StickerItemModel> it = this.stickers.iterator();
        while (it.hasNext()) {
            StickerItemModel next = it.next();
            if (next.isImageSticker() || next.isLyric() || next.isNormalInfoSticker()) {
                it.remove();
            }
        }
    }

    public void clearSticker() {
        this.stickers.clear();
    }

    public void clearTextStickers() {
        Iterator<StickerItemModel> it = this.stickers.iterator();
        while (it.hasNext()) {
            if (it.next().isNormalTextSticker()) {
                it.remove();
            }
        }
    }

    public String getInfoStickerIds() {
        if (C78886Uxe.LJJIJ(this.stickers)) {
            return "";
        }
        return getNotEmptyInfoStickerIds();
    }

    public StickerItemModel getLyricStickerModel() {
        if (C78886Uxe.LJJIJ(this.stickers)) {
            return null;
        }
        for (StickerItemModel stickerItemModel : this.stickers) {
            if (stickerItemModel != null && stickerItemModel.isLyric()) {
                return stickerItemModel;
            }
        }
        return null;
    }

    public String getNotEmptyInfoStickerIds() {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (StickerItemModel stickerItemModel : this.stickers) {
            if (stickerItemModel != null && !TextUtils.isEmpty(stickerItemModel.stickerId) && stickerItemModel.type != 2) {
                if (z) {
                    z = false;
                } else {
                    sb.append(',');
                }
                sb.append(stickerItemModel.stickerId);
            }
        }
        return sb.toString();
    }

    public String getOtherEffect() {
        if (C78886Uxe.LJJIJ(this.stickers)) {
            return "[]";
        }
        JSONArray jSONArray = new JSONArray();
        for (StickerItemModel stickerItemModel : this.stickers) {
            try {
                if (stickerItemModel != null && stickerItemModel.type == 10) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("id", stickerItemModel.stickerId);
                    jSONObject.put("type", "giphy");
                    jSONArray.put(jSONObject);
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return jSONArray.toString();
    }

    public int getSubtitleRule() {
        if (C78886Uxe.LJJIJ(this.stickers)) {
            return -1;
        }
        for (int i = 0; i < this.stickers.size(); i++) {
            StickerItemModel stickerItemModel = (StickerItemModel) ListProtector.get(this.stickers, i);
            if (stickerItemModel != null && stickerItemModel.isSubtitleRule()) {
                return i;
            }
        }
        return -1;
    }

    public boolean hasAnimTimestampSticker() {
        if (C78886Uxe.LJJIJ(this.stickers)) {
            return false;
        }
        for (StickerItemModel stickerItemModel : this.stickers) {
            if (stickerItemModel != null && stickerItemModel.isAnimTimestampSticker()) {
                return true;
            }
        }
        return false;
    }

    public boolean hasImageSticker() {
        if (C78886Uxe.LJJIJ(this.stickers)) {
            return false;
        }
        for (StickerItemModel stickerItemModel : this.stickers) {
            if (stickerItemModel != null && stickerItemModel.isImageSticker()) {
                return true;
            }
        }
        return false;
    }

    public boolean hasLocalHashTagSticker() {
        if (C78886Uxe.LJJIJ(this.stickers)) {
            return false;
        }
        for (StickerItemModel stickerItemModel : this.stickers) {
            if (stickerItemModel != null && stickerItemModel.isLocalHashTagSticker()) {
                return true;
            }
        }
        return false;
    }

    public boolean hasLyricSticker() {
        if (C78886Uxe.LJJIJ(this.stickers)) {
            return false;
        }
        for (StickerItemModel stickerItemModel : this.stickers) {
            if (stickerItemModel != null && stickerItemModel.isLyric()) {
                return true;
            }
        }
        return false;
    }

    public boolean hasSubtitle() {
        if (C78886Uxe.LJJIJ(this.stickers)) {
            return false;
        }
        for (StickerItemModel stickerItemModel : this.stickers) {
            if (stickerItemModel != null && stickerItemModel.isSubtitle()) {
                return true;
            }
        }
        return false;
    }

    public InfoStickerModel() {
        this.mColor = -1;
        this.mBgMode = 1;
        this.mAlign = 2;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public InfoStickerModel m109clone() {
        try {
            InfoStickerModel infoStickerModel = (InfoStickerModel) super.clone();
            ArrayList arrayList = new ArrayList();
            for (StickerItemModel stickerItemModel : infoStickerModel.stickers) {
                if (stickerItemModel != null) {
                    arrayList.add(stickerItemModel.clone());
                }
            }
            infoStickerModel.stickers = arrayList;
            return infoStickerModel;
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InfoStickerModel@");
        LIZ.append(Integer.toHexString(hashCode()));
        LIZ.append("{infoStickerDraftDir='");
        Q89.LIZIZ(LIZ, this.infoStickerDraftDir, '\'', ", stickers=");
        return C1NE.LIZIZ(LIZ, this.stickers, '}', LIZ);
    }

    public InfoStickerModel(Parcel parcel) {
        this.mColor = -1;
        this.mBgMode = 1;
        this.mAlign = 2;
        this.infoStickerDraftDir = parcel.readString();
        this.stickers = parcel.createTypedArrayList(StickerItemModel.CREATOR);
        this.mFontType = parcel.readString();
        this.mFontId = parcel.readString();
        this.mFontPath = parcel.readString();
        this.mColor = parcel.readInt();
        this.mBgMode = parcel.readInt();
        this.mAlign = parcel.readInt();
        this.mTextAudioLength = parcel.readInt();
    }

    public void addSticker(StickerItemModel stickerItemModel) {
        this.stickers.add(stickerItemModel);
    }

    public void removeSticker(StickerItemModel stickerItemModel) {
        this.stickers.remove(stickerItemModel);
    }

    public InfoStickerModel(InfoStickerModel infoStickerModel) {
        this.mColor = -1;
        this.mBgMode = 1;
        this.mAlign = 2;
        this.infoStickerDraftDir = infoStickerModel.infoStickerDraftDir;
        this.stickers = new ArrayList(infoStickerModel.stickers);
        this.mFontType = infoStickerModel.mFontType;
        this.mFontId = infoStickerModel.mFontId;
        this.mFontPath = infoStickerModel.mFontPath;
        this.mColor = infoStickerModel.mColor;
        this.mBgMode = infoStickerModel.mBgMode;
        this.mAlign = infoStickerModel.mAlign;
        this.mTextAudioLength = infoStickerModel.mTextAudioLength;
    }

    public InfoStickerModel(String str) {
        this.mColor = -1;
        this.mBgMode = 1;
        this.mAlign = 2;
        String str2 = File.separator;
        if (str.endsWith(str2)) {
            this.infoStickerDraftDir = str;
        } else {
            this.infoStickerDraftDir = i0.LJFF(str, str2);
        }
        this.stickers = new ArrayList();
    }

    public void addSticker(int i, StickerItemModel stickerItemModel) {
        ListProtector.add(this.stickers, i, stickerItemModel);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.infoStickerDraftDir);
        parcel.writeTypedList(this.stickers);
        parcel.writeString(this.mFontType);
        parcel.writeString(this.mFontId);
        parcel.writeString(this.mFontPath);
        parcel.writeInt(this.mColor);
        parcel.writeInt(this.mBgMode);
        parcel.writeInt(this.mAlign);
        parcel.writeInt(this.mTextAudioLength);
    }
}
