package com.ss.android.ugc.aweme.editSticker.text.bean;

import X.C6D6;
import X.F9E;
import X.UC7;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectExtraConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextLayoutConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class InnerEffectTextLayoutConfig extends F9E implements Parcelable {
    public static final Parcelable.Creator<InnerEffectTextLayoutConfig> CREATOR = new Parcelable.Creator<InnerEffectTextLayoutConfig>() { // from class: X.6Ao
        @Override // android.os.Parcelable.Creator
        public final InnerEffectTextLayoutConfig createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            C6D6 valueOf = C6D6.valueOf(parcel.readString());
            int readInt = parcel.readInt();
            float readFloat = parcel.readFloat();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            int readInt5 = parcel.readInt();
            int readInt6 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt6);
            int i = 0;
            while (i != readInt6) {
                i = C279117r.LIZIZ(InnerEffectTextConfig.CREATOR, parcel, arrayList, i, 1);
            }
            return new InnerEffectTextLayoutConfig(valueOf, readInt, readFloat, readInt2, readInt3, readInt4, readInt5, arrayList, InnerEffectExtraConfig.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final InnerEffectTextLayoutConfig[] newArray(int i) {
            return new InnerEffectTextLayoutConfig[i];
        }
    };
    public final InnerEffectExtraConfig extraConfig;
    public final C6D6 layoutType;
    public final int orientation;
    public final int paddingBottom;
    public final int paddingEnd;
    public final int paddingStart;
    public final int paddingTop;
    public final float rotation;
    public final List<InnerEffectTextConfig> textConfigs;

    public InnerEffectTextLayoutConfig() {
        this(null, 0, 0.0f, 0, 0, 0, 0, null, null, 511, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InnerEffectTextLayoutConfig copy$default(InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, C6D6 c6d6, int i, float f, int i2, int i3, int i4, int i5, List list, InnerEffectExtraConfig innerEffectExtraConfig, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            c6d6 = innerEffectTextLayoutConfig.layoutType;
        }
        if ((i6 & 2) != 0) {
            i = innerEffectTextLayoutConfig.orientation;
        }
        if ((i6 & 4) != 0) {
            f = innerEffectTextLayoutConfig.rotation;
        }
        if ((i6 & 8) != 0) {
            i2 = innerEffectTextLayoutConfig.paddingStart;
        }
        if ((i6 & 16) != 0) {
            i3 = innerEffectTextLayoutConfig.paddingEnd;
        }
        if ((i6 & 32) != 0) {
            i4 = innerEffectTextLayoutConfig.paddingTop;
        }
        if ((i6 & 64) != 0) {
            i5 = innerEffectTextLayoutConfig.paddingBottom;
        }
        if ((i6 & 128) != 0) {
            list = innerEffectTextLayoutConfig.textConfigs;
        }
        if ((i6 & 256) != 0) {
            innerEffectExtraConfig = innerEffectTextLayoutConfig.extraConfig;
        }
        return innerEffectTextLayoutConfig.copy(c6d6, i, f, i2, i3, i4, i5, list, innerEffectExtraConfig);
    }

    public final InnerEffectTextLayoutConfig copy(C6D6 layoutType, int i, float f, int i2, int i3, int i4, int i5, List<InnerEffectTextConfig> textConfigs, InnerEffectExtraConfig extraConfig) {
        o.LJIIIZ(layoutType, "layoutType");
        o.LJIIIZ(textConfigs, "textConfigs");
        o.LJIIIZ(extraConfig, "extraConfig");
        return new InnerEffectTextLayoutConfig(layoutType, i, f, i2, i3, i4, i5, textConfigs, extraConfig);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.layoutType, Integer.valueOf(this.orientation), Float.valueOf(this.rotation), Integer.valueOf(this.paddingStart), Integer.valueOf(this.paddingEnd), Integer.valueOf(this.paddingTop), Integer.valueOf(this.paddingBottom), this.textConfigs, this.extraConfig};
    }

    public final InnerEffectExtraConfig getExtraConfig() {
        return this.extraConfig;
    }

    public final C6D6 getLayoutType() {
        return this.layoutType;
    }

    public final int getOrientation() {
        return this.orientation;
    }

    public final int getPaddingBottom() {
        return this.paddingBottom;
    }

    public final int getPaddingEnd() {
        return this.paddingEnd;
    }

    public final int getPaddingStart() {
        return this.paddingStart;
    }

    public final int getPaddingTop() {
        return this.paddingTop;
    }

    public final float getRotation() {
        return this.rotation;
    }

    public final List<InnerEffectTextConfig> getTextConfigs() {
        return this.textConfigs;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.layoutType.name());
        out.writeInt(this.orientation);
        out.writeFloat(this.rotation);
        out.writeInt(this.paddingStart);
        out.writeInt(this.paddingEnd);
        out.writeInt(this.paddingTop);
        out.writeInt(this.paddingBottom);
        Iterator LIZJ = UC7.LIZJ(this.textConfigs, out);
        while (LIZJ.hasNext()) {
            ((InnerEffectTextConfig) LIZJ.next()).writeToParcel(out, i);
        }
        this.extraConfig.writeToParcel(out, i);
    }

    public InnerEffectTextLayoutConfig(C6D6 layoutType, int i, float f, int i2, int i3, int i4, int i5, List<InnerEffectTextConfig> textConfigs, InnerEffectExtraConfig extraConfig) {
        o.LJIIIZ(layoutType, "layoutType");
        o.LJIIIZ(textConfigs, "textConfigs");
        o.LJIIIZ(extraConfig, "extraConfig");
        this.layoutType = layoutType;
        this.orientation = i;
        this.rotation = f;
        this.paddingStart = i2;
        this.paddingEnd = i3;
        this.paddingTop = i4;
        this.paddingBottom = i5;
        this.textConfigs = textConfigs;
        this.extraConfig = extraConfig;
    }

    public /* synthetic */ InnerEffectTextLayoutConfig(C6D6 c6d6, int i, float f, int i2, int i3, int i4, int i5, List list, InnerEffectExtraConfig innerEffectExtraConfig, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? C6D6.LINEAR : c6d6, (i6 & 2) != 0 ? 1 : i, (i6 & 4) != 0 ? 0.0f : f, (i6 & 8) != 0 ? 0 : i2, (i6 & 16) != 0 ? 0 : i3, (i6 & 32) != 0 ? 0 : i4, (i6 & 64) != 0 ? 0 : i5, (i6 & 128) != 0 ? new ArrayList() : list, (i6 & 256) != 0 ? new InnerEffectExtraConfig(false, 1, null) : innerEffectExtraConfig);
    }
}
