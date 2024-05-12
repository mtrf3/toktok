package com.ss.android.ugc.gamora.editor.sticker.read;

import X.C157816Hh;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectSpeakerExtra;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class ReadTextEffectBean extends C157816Hh implements Parcelable {
    public static final Parcelable.Creator<ReadTextEffectBean> CREATOR = new Parcelable.Creator<ReadTextEffectBean>() { // from class: X.5aY
        @Override // android.os.Parcelable.Creator
        public final ReadTextEffectBean createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new ReadTextEffectBean((Effect) parcel.readParcelable(ReadTextEffectBean.class.getClassLoader()), ReadTextEffectSpeakerExtra.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ReadTextEffectBean[] newArray(int i) {
            return new ReadTextEffectBean[i];
        }
    };
    public TTSCategory category;
    public final Effect mEffect;
    public final ReadTextEffectSpeakerExtra mSpeaker;
    public boolean selected;
    public boolean voiceClonePlaceHolder;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeParcelable(this.mEffect, i);
        this.mSpeaker.writeToParcel(out, i);
    }

    public final int hashCode() {
        return this.effect.getEffectId().hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.category.name);
        LIZ.append('_');
        LIZ.append(this.effect.getName());
        LIZ.append('_');
        LIZ.append(this.mSpeaker.speakreID);
        return X1D.LIZIZ(LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ReadTextEffectBean) {
            return o.LJ(((C157816Hh) obj).effect.getEffectId(), this.effect.getEffectId());
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReadTextEffectBean(Effect mEffect, ReadTextEffectSpeakerExtra mSpeaker) {
        super(mEffect);
        o.LJIIIZ(mEffect, "mEffect");
        o.LJIIIZ(mSpeaker, "mSpeaker");
        this.mEffect = mEffect;
        this.mSpeaker = mSpeaker;
        String str = null;
        this.category = new TTSCategory(str, str, 7);
    }
}
