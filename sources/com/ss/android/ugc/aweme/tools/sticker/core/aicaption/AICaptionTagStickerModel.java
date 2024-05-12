package com.ss.android.ugc.aweme.tools.sticker.core.aicaption;

import X.EnumC157656Gr;
import X.F9E;
import X.InterfaceC65349Pkn;
import X.OSZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.aicaption.AICaptionTagStickerModel;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class AICaptionTagStickerModel extends F9E implements StickerModel, Parcelable, Serializable {
    public static final Parcelable.Creator<AICaptionTagStickerModel> CREATOR = new Parcelable.Creator<AICaptionTagStickerModel>() { // from class: X.6Nc
        @Override // android.os.Parcelable.Creator
        public final AICaptionTagStickerModel createFromParcel(Parcel parcel) {
            boolean z;
            o.LJIIIZ(parcel, "parcel");
            BaseStickerModel createFromParcel = BaseStickerModel.CREATOR.createFromParcel(parcel);
            boolean z2 = false;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            }
            return new AICaptionTagStickerModel(createFromParcel, z, z2);
        }

        @Override // android.os.Parcelable.Creator
        public final AICaptionTagStickerModel[] newArray(int i) {
            return new AICaptionTagStickerModel[i];
        }
    };

    @InterfaceC65349Pkn("base_sticker_model")
    public final BaseStickerModel baseStickerModel;

    @InterfaceC65349Pkn("is_edited")
    public final boolean isEdited;

    @InterfaceC65349Pkn("visible")
    public final boolean visible;

    public AICaptionTagStickerModel() {
        this(null, false, false, 7, null);
    }

    public static /* synthetic */ AICaptionTagStickerModel copy$default(AICaptionTagStickerModel aICaptionTagStickerModel, BaseStickerModel baseStickerModel, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            baseStickerModel = aICaptionTagStickerModel.baseStickerModel;
        }
        if ((i & 2) != 0) {
            z = aICaptionTagStickerModel.isEdited;
        }
        if ((i & 4) != 0) {
            z2 = aICaptionTagStickerModel.visible;
        }
        return aICaptionTagStickerModel.copy(baseStickerModel, z, z2);
    }

    public final AICaptionTagStickerModel copy(BaseStickerModel baseStickerModel, boolean z, boolean z2) {
        o.LJIIIZ(baseStickerModel, "baseStickerModel");
        return new AICaptionTagStickerModel(baseStickerModel, z, z2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.baseStickerModel, Boolean.valueOf(this.isEdited), Boolean.valueOf(this.visible)};
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public boolean isNotEmptyModel() {
        return true;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        this.baseStickerModel.writeToParcel(out, i);
        out.writeInt(this.isEdited ? 1 : 0);
        out.writeInt(this.visible ? 1 : 0);
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public int getId() {
        return this.baseStickerModel.getId();
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public InteractStickerStruct getInteractStickerStruct() {
        return new InteractStickerStruct();
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public EnumC157656Gr getStickerType() {
        return this.baseStickerModel.getType();
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public BaseStickerModel getBaseSticker() {
        return this.baseStickerModel;
    }

    public final BaseStickerModel getBaseStickerModel() {
        return this.baseStickerModel;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public final boolean isEdited() {
        return this.isEdited;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public StickerModel updateMediaSize(OSZ<Integer, Integer> newMediaSize) {
        o.LJIIIZ(newMediaSize, "newMediaSize");
        return this;
    }

    public AICaptionTagStickerModel(BaseStickerModel baseStickerModel, boolean z, boolean z2) {
        o.LJIIIZ(baseStickerModel, "baseStickerModel");
        this.baseStickerModel = baseStickerModel;
        this.isEdited = z;
        this.visible = z2;
    }

    public /* synthetic */ AICaptionTagStickerModel(BaseStickerModel baseStickerModel, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new BaseStickerModel(0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, -1, null) : baseStickerModel, (i & 2) != 0 ? false : z, (i & 4) != 0 ? true : z2);
    }
}
