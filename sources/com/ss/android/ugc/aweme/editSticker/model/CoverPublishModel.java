package com.ss.android.ugc.aweme.editSticker.model;

import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.ss.android.ugc.aweme.editSticker.model.RecCoverTitleBean;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class CoverPublishModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<CoverPublishModel> CREATOR = new Parcelable.Creator<CoverPublishModel>() { // from class: X.6Xy
        @Override // android.os.Parcelable.Creator
        public final CoverPublishModel createFromParcel(Parcel in) {
            boolean z;
            boolean z2;
            ArrayList arrayList;
            o.LJIIIZ(in, "in");
            EffectTextModel effectTextModel = (EffectTextModel) in.readParcelable(CoverPublishModel.class.getClassLoader());
            float readFloat = in.readFloat();
            float readFloat2 = in.readFloat();
            float readFloat3 = in.readFloat();
            String readString = in.readString();
            if (in.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            float readFloat4 = in.readFloat();
            int readInt = in.readInt();
            if (in.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (in.readInt() != 0) {
                int readInt2 = in.readInt();
                arrayList = new ArrayList(readInt2);
                while (readInt2 != 0) {
                    arrayList.add(RecCoverTitleBean.CREATOR.createFromParcel(in));
                    readInt2--;
                }
            } else {
                arrayList = null;
            }
            return new CoverPublishModel(effectTextModel, readFloat, readFloat2, readFloat3, readString, z, readFloat4, readInt, z2, arrayList, in.readString(), in.readInt(), in.readFloat(), in.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final CoverPublishModel[] newArray(int i) {
            return new CoverPublishModel[i];
        }
    };

    @InterfaceC65349Pkn("ai_cover_index")
    public int aiCoverIndex;

    @InterfaceC65349Pkn("ai_cover_start_time")
    public float aiCoverStartTime;

    @InterfaceC65349Pkn("effect_text_model")
    public final EffectTextModel effectTextModel;

    @InterfaceC65349Pkn("image_cover_view_trans_x")
    public float imageCoverViewTransX;

    @InterfaceC65349Pkn("image_cover_view_trans_y")
    public float imageCoverViewTransY;

    @InterfaceC65349Pkn("image_current_index")
    public int imageCurrentIndex;

    @InterfaceC65349Pkn("is_ai_recommend_cover")
    public boolean isAiRecommendCover;

    @InterfaceC65349Pkn("need_expand_compiled_size")
    public boolean needExpandCompiledSize;

    @InterfaceC65349Pkn("cover_recommend_title")
    public List<RecCoverTitleBean> recTitleList;

    @InterfaceC65349Pkn("save_rec_title_id")
    public String saveTitleId;

    @InterfaceC65349Pkn("video_cover_view_trans_x")
    public float videoCoverViewTransX;

    @InterfaceC65349Pkn("video_cover_view_trans_y")
    public float videoCoverViewTransY;

    @InterfaceC65349Pkn("video_cover_view_x")
    public float videoCoverViewX;

    @InterfaceC65349Pkn("video_cover_crop_path")
    public String videoCropCoverPath;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CoverPublishModel() {
        /*
            r17 = this;
            r1 = 0
            r2 = 0
            r6 = 0
            r15 = 16383(0x3fff, float:2.2957E-41)
            r0 = r17
            r3 = r2
            r4 = r2
            r5 = r1
            r7 = r2
            r8 = r6
            r9 = r6
            r10 = r1
            r11 = r1
            r12 = r6
            r13 = r2
            r14 = r2
            r16 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel.<init>():void");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeParcelable(this.effectTextModel, i);
        parcel.writeFloat(this.videoCoverViewX);
        parcel.writeFloat(this.videoCoverViewTransX);
        parcel.writeFloat(this.videoCoverViewTransY);
        parcel.writeString(this.videoCropCoverPath);
        parcel.writeInt(this.needExpandCompiledSize ? 1 : 0);
        parcel.writeFloat(this.aiCoverStartTime);
        parcel.writeInt(this.aiCoverIndex);
        parcel.writeInt(this.isAiRecommendCover ? 1 : 0);
        List<RecCoverTitleBean> list = this.recTitleList;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<RecCoverTitleBean> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.saveTitleId);
        parcel.writeInt(this.imageCurrentIndex);
        parcel.writeFloat(this.imageCoverViewTransX);
        parcel.writeFloat(this.imageCoverViewTransY);
    }

    public final int getAiCoverIndex() {
        return this.aiCoverIndex;
    }

    public final float getAiCoverStartTime() {
        return this.aiCoverStartTime;
    }

    public final EffectTextModel getEffectTextModel() {
        return this.effectTextModel;
    }

    public final float getImageCoverViewTransX() {
        return this.imageCoverViewTransX;
    }

    public final float getImageCoverViewTransY() {
        return this.imageCoverViewTransY;
    }

    public final int getImageCurrentIndex() {
        return this.imageCurrentIndex;
    }

    public final boolean getNeedExpandCompiledSize() {
        return this.needExpandCompiledSize;
    }

    public final List<RecCoverTitleBean> getRecTitleList() {
        return this.recTitleList;
    }

    public final String getSaveTitleId() {
        return this.saveTitleId;
    }

    public final float getVideoCoverViewTransX() {
        return this.videoCoverViewTransX;
    }

    public final float getVideoCoverViewTransY() {
        return this.videoCoverViewTransY;
    }

    public final float getVideoCoverViewX() {
        return this.videoCoverViewX;
    }

    public final String getVideoCropCoverPath() {
        return this.videoCropCoverPath;
    }

    public final boolean isAiRecommendCover() {
        return this.isAiRecommendCover;
    }

    public final void setAiCoverIndex(int i) {
        this.aiCoverIndex = i;
    }

    public final void setAiCoverStartTime(float f) {
        this.aiCoverStartTime = f;
    }

    public final void setAiRecommendCover(boolean z) {
        this.isAiRecommendCover = z;
    }

    public final void setImageCoverViewTransX(float f) {
        this.imageCoverViewTransX = f;
    }

    public final void setImageCoverViewTransY(float f) {
        this.imageCoverViewTransY = f;
    }

    public final void setImageCurrentIndex(int i) {
        this.imageCurrentIndex = i;
    }

    public final void setNeedExpandCompiledSize(boolean z) {
        this.needExpandCompiledSize = z;
    }

    public final void setRecTitleList(List<RecCoverTitleBean> list) {
        this.recTitleList = list;
    }

    public final void setSaveTitleId(String str) {
        this.saveTitleId = str;
    }

    public final void setVideoCoverViewTransX(float f) {
        this.videoCoverViewTransX = f;
    }

    public final void setVideoCoverViewTransY(float f) {
        this.videoCoverViewTransY = f;
    }

    public final void setVideoCoverViewX(float f) {
        this.videoCoverViewX = f;
    }

    public final void setVideoCropCoverPath(String str) {
        this.videoCropCoverPath = str;
    }

    public CoverPublishModel(EffectTextModel effectTextModel, float f, float f2, float f3, String str, boolean z, float f4, int i, boolean z2, List<RecCoverTitleBean> list, String str2, int i2, float f5, float f6) {
        o.LJIIIZ(effectTextModel, "effectTextModel");
        this.effectTextModel = effectTextModel;
        this.videoCoverViewX = f;
        this.videoCoverViewTransX = f2;
        this.videoCoverViewTransY = f3;
        this.videoCropCoverPath = str;
        this.needExpandCompiledSize = z;
        this.aiCoverStartTime = f4;
        this.aiCoverIndex = i;
        this.isAiRecommendCover = z2;
        this.recTitleList = list;
        this.saveTitleId = str2;
        this.imageCurrentIndex = i2;
        this.imageCoverViewTransX = f5;
        this.imageCoverViewTransY = f6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ CoverPublishModel(EffectTextModel effectTextModel, float f, float f2, float f3, String str, boolean z, float f4, int i, boolean z2, List list, String str2, int i2, float f5, float f6, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? new EffectTextModel(false, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0) : effectTextModel, (i3 & 2) != 0 ? -1.0f : f, (i3 & 4) != 0 ? 0.0f : f2, (i3 & 8) != 0 ? 0.0f : f3, (i3 & 16) != 0 ? null : str, (i3 & 32) != 0 ? false : z, (i3 & 64) == 0 ? f4 : 0.0f, (i3 & 128) != 0 ? -1 : i, (i3 & 256) != 0 ? false : z2, (i3 & 512) != 0 ? null : list, (i3 & 1024) == 0 ? str2 : null, (i3 & 2048) == 0 ? i2 : 0, (i3 & 4096) != 0 ? -1.0f : f5, (i3 & FileUtils.BUFFER_SIZE) == 0 ? f6 : -1.0f);
    }
}
