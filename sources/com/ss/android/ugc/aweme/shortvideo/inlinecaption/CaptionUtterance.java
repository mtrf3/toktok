package com.ss.android.ugc.aweme.shortvideo.inlinecaption;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C47261Igj;
import X.C61878OQg;
import X.C68W;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionUtterance;
import com.ss.android.ugc.aweme.sticker.data.Utterance;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class CaptionUtterance implements Parcelable {
    public static final Parcelable.Creator<CaptionUtterance> CREATOR = new Parcelable.Creator<CaptionUtterance>() { // from class: X.69L
        @Override // android.os.Parcelable.Creator
        public final CaptionUtterance createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new CaptionUtterance((Utterance) parcel.readSerializable(), (TextStickerData) parcel.readParcelable(CaptionUtterance.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CaptionUtterance[] newArray(int i) {
            return new CaptionUtterance[i];
        }
    };
    public TextStickerData inlineUtterance;
    public Utterance utterance;

    public CaptionUtterance() {
        this((Utterance) null, 3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeSerializable(this.utterance);
        out.writeParcelable(this.inlineUtterance, i);
    }

    public final long LIZ() {
        if (this.inlineUtterance != null) {
            return r0.getEndTime();
        }
        Utterance utterance = this.utterance;
        if (utterance != null) {
            return utterance.getEndTime();
        }
        return 0L;
    }

    public final long LIZIZ() {
        if (this.inlineUtterance != null) {
            return r0.getStartTime();
        }
        Utterance utterance = this.utterance;
        if (utterance != null) {
            return utterance.getStartTime();
        }
        return 0L;
    }

    public final String LIZLLL() {
        String text;
        String textStr;
        TextStickerData textStickerData = this.inlineUtterance;
        if (textStickerData == null || (textStr = textStickerData.getTextStr()) == null) {
            Utterance utterance = this.utterance;
            if (utterance == null || (text = utterance.getText()) == null) {
                return "";
            }
            return text;
        }
        return textStr;
    }

    public final int hashCode() {
        long j = 31;
        return (int) ((((LIZIZ() * j) + C16880lQ.LLJIJIL(LIZ())) * j) + LIZLLL().hashCode());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CaptionUtterance(CaptionUtterance captionUtterance) {
        this((Utterance) (0 == true ? 1 : 0), 3);
        Utterance utterance;
        o.LJIIIZ(captionUtterance, "captionUtterance");
        Utterance utterance2 = captionUtterance.utterance;
        if (utterance2 != null) {
            utterance = new Utterance(utterance2);
        } else {
            utterance = null;
        }
        this.utterance = utterance;
        TextStickerData textStickerData = captionUtterance.inlineUtterance;
        this.inlineUtterance = textStickerData != null ? textStickerData.m110clone() : null;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        String str3;
        String str4;
        Integer num7;
        Integer num8;
        Integer num9;
        Integer num10;
        Integer num11;
        Integer num12;
        Integer num13;
        Integer num14;
        Integer num15;
        Integer num16;
        String str5;
        if (this == obj) {
            return true;
        }
        o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionUtterance");
        CaptionUtterance captionUtterance = (CaptionUtterance) obj;
        if (!o.LJ(this.utterance, captionUtterance.utterance)) {
            return false;
        }
        TextStickerData textStickerData = this.inlineUtterance;
        String str6 = null;
        if (textStickerData != null) {
            str = textStickerData.getTextStr();
        } else {
            str = null;
        }
        TextStickerData textStickerData2 = captionUtterance.inlineUtterance;
        if (textStickerData2 != null) {
            str2 = textStickerData2.getTextStr();
        } else {
            str2 = null;
        }
        if (!o.LJ(str, str2)) {
            return false;
        }
        TextStickerData textStickerData3 = this.inlineUtterance;
        if (textStickerData3 != null) {
            num = Integer.valueOf(textStickerData3.getBgMode());
        } else {
            num = null;
        }
        TextStickerData textStickerData4 = captionUtterance.inlineUtterance;
        if (textStickerData4 != null) {
            num2 = Integer.valueOf(textStickerData4.getBgMode());
        } else {
            num2 = null;
        }
        if (!o.LJ(num, num2)) {
            return false;
        }
        TextStickerData textStickerData5 = this.inlineUtterance;
        if (textStickerData5 != null) {
            num3 = Integer.valueOf(textStickerData5.getColor());
        } else {
            num3 = null;
        }
        TextStickerData textStickerData6 = captionUtterance.inlineUtterance;
        if (textStickerData6 != null) {
            num4 = Integer.valueOf(textStickerData6.getColor());
        } else {
            num4 = null;
        }
        if (!o.LJ(num3, num4)) {
            return false;
        }
        TextStickerData textStickerData7 = this.inlineUtterance;
        if (textStickerData7 != null) {
            num5 = Integer.valueOf(textStickerData7.getAlign());
        } else {
            num5 = null;
        }
        TextStickerData textStickerData8 = captionUtterance.inlineUtterance;
        if (textStickerData8 != null) {
            num6 = Integer.valueOf(textStickerData8.getAlign());
        } else {
            num6 = null;
        }
        if (!o.LJ(num5, num6)) {
            return false;
        }
        TextStickerData textStickerData9 = this.inlineUtterance;
        if (textStickerData9 != null) {
            str3 = textStickerData9.getFontType();
        } else {
            str3 = null;
        }
        TextStickerData textStickerData10 = captionUtterance.inlineUtterance;
        if (textStickerData10 != null) {
            str4 = textStickerData10.getFontType();
        } else {
            str4 = null;
        }
        if (!o.LJ(str3, str4)) {
            return false;
        }
        TextStickerData textStickerData11 = this.inlineUtterance;
        if (textStickerData11 != null) {
            num7 = Integer.valueOf(textStickerData11.getStartTime());
        } else {
            num7 = null;
        }
        TextStickerData textStickerData12 = captionUtterance.inlineUtterance;
        if (textStickerData12 != null) {
            num8 = Integer.valueOf(textStickerData12.getStartTime());
        } else {
            num8 = null;
        }
        if (!o.LJ(num7, num8)) {
            return false;
        }
        TextStickerData textStickerData13 = this.inlineUtterance;
        if (textStickerData13 != null) {
            num9 = Integer.valueOf(textStickerData13.getEndTime());
        } else {
            num9 = null;
        }
        TextStickerData textStickerData14 = captionUtterance.inlineUtterance;
        if (textStickerData14 != null) {
            num10 = Integer.valueOf(textStickerData14.getEndTime());
        } else {
            num10 = null;
        }
        if (!o.LJ(num9, num10)) {
            return false;
        }
        TextStickerData textStickerData15 = this.inlineUtterance;
        if (textStickerData15 != null) {
            num11 = Integer.valueOf(textStickerData15.getBgMode());
        } else {
            num11 = null;
        }
        TextStickerData textStickerData16 = captionUtterance.inlineUtterance;
        if (textStickerData16 != null) {
            num12 = Integer.valueOf(textStickerData16.getBgMode());
        } else {
            num12 = null;
        }
        if (!o.LJ(num11, num12)) {
            return false;
        }
        TextStickerData textStickerData17 = this.inlineUtterance;
        if (textStickerData17 != null) {
            num13 = Integer.valueOf(textStickerData17.getAlign());
        } else {
            num13 = null;
        }
        TextStickerData textStickerData18 = captionUtterance.inlineUtterance;
        if (textStickerData18 != null) {
            num14 = Integer.valueOf(textStickerData18.getAlign());
        } else {
            num14 = null;
        }
        if (!o.LJ(num13, num14)) {
            return false;
        }
        TextStickerData textStickerData19 = this.inlineUtterance;
        if (textStickerData19 != null) {
            num15 = Integer.valueOf(textStickerData19.getColor());
        } else {
            num15 = null;
        }
        TextStickerData textStickerData20 = captionUtterance.inlineUtterance;
        if (textStickerData20 != null) {
            num16 = Integer.valueOf(textStickerData20.getColor());
        } else {
            num16 = null;
        }
        if (!o.LJ(num15, num16)) {
            return false;
        }
        TextStickerData textStickerData21 = this.inlineUtterance;
        if (textStickerData21 != null) {
            str5 = textStickerData21.getFontType();
        } else {
            str5 = null;
        }
        TextStickerData textStickerData22 = captionUtterance.inlineUtterance;
        if (textStickerData22 != null) {
            str6 = textStickerData22.getFontType();
        }
        if (o.LJ(str5, str6)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CaptionUtterance(TextStickerData inlineUtterance) {
        this((Utterance) null, 3);
        o.LJIIIZ(inlineUtterance, "inlineUtterance");
        this.utterance = null;
        this.inlineUtterance = inlineUtterance;
    }

    public /* synthetic */ CaptionUtterance(Utterance utterance, int i) {
        this((i & 1) != 0 ? null : utterance, (TextStickerData) null);
    }

    public final void LJ(ActivityC45651qj context, String text) {
        o.LJIIIZ(text, "text");
        o.LJIIIZ(context, "context");
        TextStickerData textStickerData = this.inlineUtterance;
        if (textStickerData != null) {
            textStickerData.setTextStr(text);
            textStickerData.setTextWrapList(C47261Igj.LJII(C68W.LIZJ(C68W.LJIILJJIL(textStickerData, context))));
            textStickerData.setInlineTextStyles(C61878OQg.INSTANCE);
        }
        Utterance utterance = this.utterance;
        if (utterance == null) {
            return;
        }
        utterance.setText(text);
    }

    public CaptionUtterance(Utterance utterance, TextStickerData textStickerData) {
        this.utterance = utterance;
        this.inlineUtterance = textStickerData;
    }
}
