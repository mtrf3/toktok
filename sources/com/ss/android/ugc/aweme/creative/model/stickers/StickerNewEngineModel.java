package com.ss.android.ugc.aweme.creative.model.stickers;

import X.C1FL;
import X.C61878OQg;
import X.GPV;
import X.InterfaceC65349Pkn;
import X.UC7;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.stickers.AddYoursStickerExtras;
import com.ss.android.ugc.aweme.creative.model.stickers.StickerNewEngineModel;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.aicaption.AICaptionTagStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class StickerNewEngineModel implements Parcelable {
    public static final Parcelable.Creator<StickerNewEngineModel> CREATOR = new Parcelable.Creator<StickerNewEngineModel>() { // from class: X.6Ui
        @Override // android.os.Parcelable.Creator
        public final StickerNewEngineModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            Boolean valueOf;
            o.LJIIIZ(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            boolean z3 = false;
            int i = 0;
            while (i != readInt) {
                i = C5YW.LIZ(StickerNewEngineModel.class, parcel, arrayList, i, 1);
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = C279117r.LIZIZ(AddYoursStickerExtras.CREATOR, parcel, arrayList2, i2, 1);
            }
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            String readString = parcel.readString();
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                valueOf = Boolean.valueOf(z2);
            }
            int readInt3 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt3);
            int i3 = 0;
            while (i3 != readInt3) {
                i3 = C5YW.LIZ(StickerNewEngineModel.class, parcel, arrayList3, i3, 1);
            }
            int readInt4 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(readInt4);
            int i4 = 0;
            while (i4 != readInt4) {
                i4 = C5YW.LIZ(StickerNewEngineModel.class, parcel, arrayList4, i4, 1);
            }
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            int readInt5 = parcel.readInt();
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z3 = true;
                }
                bool = Boolean.valueOf(z3);
            }
            return new StickerNewEngineModel(arrayList, arrayList2, z, readString, valueOf, arrayList3, arrayList4, createStringArrayList, readInt5, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final StickerNewEngineModel[] newArray(int i) {
            return new StickerNewEngineModel[i];
        }
    };

    @InterfaceC65349Pkn("add_your_enter_from")
    public String addYoursEnterFrom;

    @InterfaceC65349Pkn("add_yours_sticker_extras")
    public List<AddYoursStickerExtras> addYoursStickerExtras;

    @InterfaceC65349Pkn("add_yours_sticker_model")
    public List<AddYoursStickerModel> addYoursStickerModels;

    @InterfaceC65349Pkn("ai_caption_shuffle_index")
    public int aiCaptionShuffleIndex;

    @InterfaceC65349Pkn("ai_caption_shuffle_texts")
    public List<String> aiCaptionShuffleTexts;

    @InterfaceC65349Pkn("ai_caption_tag_stickers")
    public List<AICaptionTagStickerModel> aiCaptionTagStickers;

    @InterfaceC65349Pkn("is_from_follow_add_yours")
    public boolean isFromFollowAddYours;

    @GPV
    public Boolean isQADraft;

    @InterfaceC65349Pkn("text_sticker_model")
    public List<TextStickerModel> textStickerModels;

    @GPV
    public Boolean textUseNewEngine;

    public StickerNewEngineModel() {
        this(null, null, false, null, null, null, null, null, 0, null, 1023, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Iterator LIZJ = UC7.LIZJ(this.addYoursStickerModels, out);
        while (LIZJ.hasNext()) {
            out.writeParcelable((Parcelable) LIZJ.next(), i);
        }
        Iterator LIZJ2 = UC7.LIZJ(this.addYoursStickerExtras, out);
        while (LIZJ2.hasNext()) {
            ((AddYoursStickerExtras) LIZJ2.next()).writeToParcel(out, i);
        }
        out.writeInt(this.isFromFollowAddYours ? 1 : 0);
        out.writeString(this.addYoursEnterFrom);
        Boolean bool = this.isQADraft;
        if (bool == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool);
        }
        Iterator LIZJ3 = UC7.LIZJ(this.textStickerModels, out);
        while (LIZJ3.hasNext()) {
            out.writeParcelable((Parcelable) LIZJ3.next(), i);
        }
        Iterator LIZJ4 = UC7.LIZJ(this.aiCaptionTagStickers, out);
        while (LIZJ4.hasNext()) {
            out.writeParcelable((Parcelable) LIZJ4.next(), i);
        }
        out.writeStringList(this.aiCaptionShuffleTexts);
        out.writeInt(this.aiCaptionShuffleIndex);
        Boolean bool2 = this.textUseNewEngine;
        if (bool2 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool2);
        }
    }

    public StickerNewEngineModel(List<AddYoursStickerModel> addYoursStickerModels, List<AddYoursStickerExtras> addYoursStickerExtras, boolean z, String addYoursEnterFrom, Boolean bool, List<TextStickerModel> textStickerModels, List<AICaptionTagStickerModel> aiCaptionTagStickers, List<String> aiCaptionShuffleTexts, int i, Boolean bool2) {
        o.LJIIIZ(addYoursStickerModels, "addYoursStickerModels");
        o.LJIIIZ(addYoursStickerExtras, "addYoursStickerExtras");
        o.LJIIIZ(addYoursEnterFrom, "addYoursEnterFrom");
        o.LJIIIZ(textStickerModels, "textStickerModels");
        o.LJIIIZ(aiCaptionTagStickers, "aiCaptionTagStickers");
        o.LJIIIZ(aiCaptionShuffleTexts, "aiCaptionShuffleTexts");
        this.addYoursStickerModels = addYoursStickerModels;
        this.addYoursStickerExtras = addYoursStickerExtras;
        this.isFromFollowAddYours = z;
        this.addYoursEnterFrom = addYoursEnterFrom;
        this.isQADraft = bool;
        this.textStickerModels = textStickerModels;
        this.aiCaptionTagStickers = aiCaptionTagStickers;
        this.aiCaptionShuffleTexts = aiCaptionShuffleTexts;
        this.aiCaptionShuffleIndex = i;
        this.textUseNewEngine = bool2;
    }

    public StickerNewEngineModel(List list, List list2, boolean z, String str, Boolean bool, List list3, List list4, List list5, int i, Boolean bool2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new ArrayList() : list, (i2 & 2) != 0 ? new ArrayList() : list2, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? "" : str, (i2 & 16) != 0 ? null : bool, (i2 & 32) != 0 ? new ArrayList() : list3, (i2 & 64) != 0 ? new ArrayList() : list4, (i2 & 128) != 0 ? C61878OQg.INSTANCE : list5, (i2 & 256) == 0 ? i : 0, (i2 & 512) == 0 ? bool2 : null);
    }
}
