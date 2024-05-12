package com.ss.android.ugc.aweme.tools.sticker.core.hashtag.single;

import X.C1554468e;
import X.EnumC157656Gr;
import X.F9E;
import X.InterfaceC65349Pkn;
import X.OSZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.sticker.data.HashtagStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.hashtag.single.SingleHashTagStickerModel;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class SingleHashTagStickerModel extends F9E implements StickerModel, Parcelable, Serializable {
    public static final Parcelable.Creator<SingleHashTagStickerModel> CREATOR = new Parcelable.Creator<SingleHashTagStickerModel>() { // from class: X.6TY
        @Override // android.os.Parcelable.Creator
        public final SingleHashTagStickerModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            o.LJIIIZ(parcel, "parcel");
            BaseStickerModel createFromParcel = BaseStickerModel.CREATOR.createFromParcel(parcel);
            long readLong = parcel.readLong();
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            return new SingleHashTagStickerModel(createFromParcel, readLong, readString, z, z2, z3);
        }

        @Override // android.os.Parcelable.Creator
        public final SingleHashTagStickerModel[] newArray(int i) {
            return new SingleHashTagStickerModel[i];
        }
    };

    @InterfaceC65349Pkn("base_sticker_model")
    public final BaseStickerModel baseStickerModel;

    @InterfaceC65349Pkn("clickable")
    public final boolean clickable;

    @InterfaceC65349Pkn("content_text")
    public final String contentText;

    @InterfaceC65349Pkn("editable")
    public final boolean editable;

    @InterfaceC65349Pkn("hashtag_id")
    public final long hashtagId;

    @InterfaceC65349Pkn("visible")
    public final boolean visible;

    public SingleHashTagStickerModel() {
        this(null, 0L, null, false, false, false, 63, null);
    }

    public static /* synthetic */ SingleHashTagStickerModel copy$default(SingleHashTagStickerModel singleHashTagStickerModel, BaseStickerModel baseStickerModel, long j, String str, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            baseStickerModel = singleHashTagStickerModel.baseStickerModel;
        }
        if ((i & 2) != 0) {
            j = singleHashTagStickerModel.hashtagId;
        }
        if ((i & 4) != 0) {
            str = singleHashTagStickerModel.contentText;
        }
        if ((i & 8) != 0) {
            z = singleHashTagStickerModel.editable;
        }
        if ((i & 16) != 0) {
            z2 = singleHashTagStickerModel.clickable;
        }
        if ((i & 32) != 0) {
            z3 = singleHashTagStickerModel.visible;
        }
        return singleHashTagStickerModel.copy(baseStickerModel, j, str, z, z2, z3);
    }

    public final SingleHashTagStickerModel copy(BaseStickerModel baseStickerModel, long j, String contentText, boolean z, boolean z2, boolean z3) {
        o.LJIIIZ(baseStickerModel, "baseStickerModel");
        o.LJIIIZ(contentText, "contentText");
        return new SingleHashTagStickerModel(baseStickerModel, j, contentText, z, z2, z3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public InteractStickerStruct getInteractStickerStruct() {
        InteractStickerStruct LIZIZ = C1554468e.LIZIZ(this, false);
        HashtagStruct hashtagStruct = new HashtagStruct();
        hashtagStruct.setHashtagId("test");
        hashtagStruct.setHashtagName(this.contentText);
        LIZIZ.setNoGlobal(true);
        LIZIZ.setHashtagInfo(hashtagStruct);
        return LIZIZ;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.baseStickerModel, Long.valueOf(this.hashtagId), this.contentText, Boolean.valueOf(this.editable), Boolean.valueOf(this.clickable), Boolean.valueOf(this.visible)};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        this.baseStickerModel.writeToParcel(out, i);
        out.writeLong(this.hashtagId);
        out.writeString(this.contentText);
        out.writeInt(this.editable ? 1 : 0);
        out.writeInt(this.clickable ? 1 : 0);
        out.writeInt(this.visible ? 1 : 0);
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public int getId() {
        return this.baseStickerModel.getId();
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public EnumC157656Gr getStickerType() {
        return this.baseStickerModel.getType();
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public boolean isNotEmptyModel() {
        return !ujb.o.LJJJJJL(this.contentText);
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public BaseStickerModel getBaseSticker() {
        return this.baseStickerModel;
    }

    public final BaseStickerModel getBaseStickerModel() {
        return this.baseStickerModel;
    }

    public final boolean getClickable() {
        return this.clickable;
    }

    public final String getContentText() {
        return this.contentText;
    }

    public final boolean getEditable() {
        return this.editable;
    }

    public final long getHashtagId() {
        return this.hashtagId;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public StickerModel updateMediaSize(OSZ<Integer, Integer> newMediaSize) {
        o.LJIIIZ(newMediaSize, "newMediaSize");
        return this;
    }

    public SingleHashTagStickerModel(BaseStickerModel baseStickerModel, long j, String contentText, boolean z, boolean z2, boolean z3) {
        o.LJIIIZ(baseStickerModel, "baseStickerModel");
        o.LJIIIZ(contentText, "contentText");
        this.baseStickerModel = baseStickerModel;
        this.hashtagId = j;
        this.contentText = contentText;
        this.editable = z;
        this.clickable = z2;
        this.visible = z3;
    }

    public /* synthetic */ SingleHashTagStickerModel(BaseStickerModel baseStickerModel, long j, String str, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new BaseStickerModel(0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, -1, null) : baseStickerModel, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? false : z, (i & 16) == 0 ? z2 : false, (i & 32) != 0 ? true : z3);
    }
}
