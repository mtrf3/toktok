package com.ss.android.ugc.aweme.editSticker.model;

import X.C1FJ;
import X.C38891fp;
import X.C42299Git;
import X.InterfaceC65349Pkn;
import X.OSZ;
import X.OUP;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.editSticker.model.CreateAwemeCoverInfo;
import com.ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class EffectTextModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<EffectTextModel> CREATOR = new Parcelable.Creator<EffectTextModel>() { // from class: X.6Xz
        @Override // android.os.Parcelable.Creator
        public final EffectTextModel createFromParcel(Parcel in) {
            boolean z;
            CreateAwemeCoverInfo createAwemeCoverInfo;
            o.LJIIIZ(in, "in");
            if (in.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            StickerItemModel stickerItemModel = (StickerItemModel) in.readParcelable(EffectTextModel.class.getClassLoader());
            Integer num = null;
            if (in.readInt() != 0) {
                createAwemeCoverInfo = CreateAwemeCoverInfo.CREATOR.createFromParcel(in);
            } else {
                createAwemeCoverInfo = null;
            }
            String readString = in.readString();
            if (in.readInt() != 0) {
                num = Integer.valueOf(in.readInt());
            }
            return new EffectTextModel(z, stickerItemModel, createAwemeCoverInfo, readString, num);
        }

        @Override // android.os.Parcelable.Creator
        public final EffectTextModel[] newArray(int i) {
            return new EffectTextModel[i];
        }
    };

    @InterfaceC65349Pkn("cover_frame_index")
    public Integer coverFrameIndex;

    @InterfaceC65349Pkn("cover_select_from")
    public String coverSelectedFrom;

    @InterfaceC65349Pkn("create_aweme_cover_info")
    public CreateAwemeCoverInfo createAwemeCoverInfo;

    @InterfaceC65349Pkn("has_cover_text")
    public boolean hasCoverText;

    @InterfaceC65349Pkn("text_sticker")
    public StickerItemModel textSticker;

    /* JADX WARN: Multi-variable type inference failed */
    public EffectTextModel() {
        this(false, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final void reset() {
        this.hasCoverText = false;
        this.textSticker = null;
        this.createAwemeCoverInfo = null;
    }

    public final boolean isCoverTextValid() {
        StickerItemModel stickerItemModel;
        String str;
        if (!this.hasCoverText || (stickerItemModel = this.textSticker) == null || (str = stickerItemModel.path) == null || str.length() == 0) {
            return false;
        }
        return true;
    }

    public final Integer getCoverFrameIndex() {
        return this.coverFrameIndex;
    }

    public final String getCoverSelectedFrom() {
        return this.coverSelectedFrom;
    }

    public final CreateAwemeCoverInfo getCreateAwemeCoverInfo() {
        return this.createAwemeCoverInfo;
    }

    public final boolean getHasCoverText() {
        return this.hasCoverText;
    }

    public final StickerItemModel getTextSticker() {
        return this.textSticker;
    }

    public final Bitmap mergeCoverText(Bitmap coverBitmap) {
        StickerItemModel stickerItemModel;
        boolean z;
        Bitmap mergeBitmap;
        o.LJIIIZ(coverBitmap, "coverBitmap");
        if (this.hasCoverText && (stickerItemModel = this.textSticker) != null) {
            try {
                int width = coverBitmap.getWidth();
                OSZ LJIJJ = C38891fp.LJIJJ(stickerItemModel.path);
                if (coverBitmap.getWidth() > coverBitmap.getHeight() && ((Number) LJIJJ.getSecond()).intValue() > ((Number) LJIJJ.getFirst()).intValue()) {
                    z = true;
                } else {
                    z = false;
                }
                if (((Number) LJIJJ.getFirst()).intValue() != 0 && ((Number) LJIJJ.getSecond()).intValue() != 0 && z) {
                    int intValue = (int) ((width * ((Number) LJIJJ.getSecond()).intValue()) / ((Number) LJIJJ.getFirst()).floatValue());
                    String str = stickerItemModel.path;
                    o.LJIIIIZZ(str, "it.path");
                    Bitmap LJIILIIL = C38891fp.LJIILIIL(width, intValue, str);
                    if (LJIILIIL != null) {
                        mergeBitmap = OUP.LJJIJIL(coverBitmap, LJIILIIL);
                    } else {
                        mergeBitmap = coverBitmap;
                    }
                    C42299Git.LJ(LJIILIIL);
                } else {
                    String str2 = stickerItemModel.path;
                    o.LJIIIIZZ(str2, "it.path");
                    Bitmap LJIILIIL2 = C38891fp.LJIILIIL(width, coverBitmap.getHeight(), str2);
                    mergeBitmap = C42299Git.LIZLLL(coverBitmap, LJIILIIL2);
                    C42299Git.LJ(LJIILIIL2);
                    o.LJIIIIZZ(mergeBitmap, "mergeBitmap");
                }
                return mergeBitmap;
            } catch (Exception unused) {
                return coverBitmap;
            }
        }
        return coverBitmap;
    }

    public final void setCoverFrameIndex(Integer num) {
        this.coverFrameIndex = num;
    }

    public final void setCoverSelectedFrom(String str) {
        this.coverSelectedFrom = str;
    }

    public final void setCreateAwemeCoverInfo(CreateAwemeCoverInfo createAwemeCoverInfo) {
        this.createAwemeCoverInfo = createAwemeCoverInfo;
    }

    public final void setHasCoverText(boolean z) {
        this.hasCoverText = z;
    }

    public final void setTextSticker(StickerItemModel stickerItemModel) {
        this.textSticker = stickerItemModel;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeInt(this.hasCoverText ? 1 : 0);
        parcel.writeParcelable(this.textSticker, i);
        CreateAwemeCoverInfo createAwemeCoverInfo = this.createAwemeCoverInfo;
        if (createAwemeCoverInfo != null) {
            parcel.writeInt(1);
            createAwemeCoverInfo.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.coverSelectedFrom);
        Integer num = this.coverFrameIndex;
        if (num != null) {
            C1FJ.LJ(parcel, 1, num);
        } else {
            parcel.writeInt(0);
        }
    }

    public EffectTextModel(boolean z, StickerItemModel stickerItemModel, CreateAwemeCoverInfo createAwemeCoverInfo, String str, Integer num) {
        this.hasCoverText = z;
        this.textSticker = stickerItemModel;
        this.createAwemeCoverInfo = createAwemeCoverInfo;
        this.coverSelectedFrom = str;
        this.coverFrameIndex = num;
    }

    public /* synthetic */ EffectTextModel(boolean z, StickerItemModel stickerItemModel, CreateAwemeCoverInfo createAwemeCoverInfo, String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : stickerItemModel, (i & 4) != 0 ? null : createAwemeCoverInfo, (i & 8) != 0 ? null : str, (i & 16) == 0 ? num : null);
    }
}
