package com.ss.android.ugc.aweme.editSticker.text.bean;

import X.F9E;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.editSticker.text.bean.InteractTextStructWrap;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextUnderlineIndexRange;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class InteractTextStructWrap extends F9E implements Parcelable {
    public static final Parcelable.Creator<InteractTextStructWrap> CREATOR = new Parcelable.Creator<InteractTextStructWrap>() { // from class: X.68Z
        @Override // android.os.Parcelable.Creator
        public final InteractTextStructWrap createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new InteractTextStructWrap(TextStickerTextUnderlineIndexRange.CREATOR.createFromParcel(parcel), (CreateAnchorInfo) parcel.readParcelable(InteractTextStructWrap.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final InteractTextStructWrap[] newArray(int i) {
            return new InteractTextStructWrap[i];
        }
    };
    public final TextStickerTextUnderlineIndexRange range;
    public final CreateAnchorInfo struct;

    public static /* synthetic */ InteractTextStructWrap copy$default(InteractTextStructWrap interactTextStructWrap, TextStickerTextUnderlineIndexRange textStickerTextUnderlineIndexRange, CreateAnchorInfo createAnchorInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            textStickerTextUnderlineIndexRange = interactTextStructWrap.range;
        }
        if ((i & 2) != 0) {
            createAnchorInfo = interactTextStructWrap.struct;
        }
        return interactTextStructWrap.copy(textStickerTextUnderlineIndexRange, createAnchorInfo);
    }

    public final InteractTextStructWrap copy(TextStickerTextUnderlineIndexRange range, CreateAnchorInfo struct) {
        o.LJIIIZ(range, "range");
        o.LJIIIZ(struct, "struct");
        return new InteractTextStructWrap(range, struct);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.range, this.struct};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        this.range.writeToParcel(out, i);
        out.writeParcelable(this.struct, i);
    }

    public final TextStickerTextUnderlineIndexRange getRange() {
        return this.range;
    }

    public final CreateAnchorInfo getStruct() {
        return this.struct;
    }

    public final boolean isValid(int i) {
        return this.range.isValid(i);
    }

    public InteractTextStructWrap(TextStickerTextUnderlineIndexRange range, CreateAnchorInfo struct) {
        o.LJIIIZ(range, "range");
        o.LJIIIZ(struct, "struct");
        this.range = range;
        this.struct = struct;
    }
}
