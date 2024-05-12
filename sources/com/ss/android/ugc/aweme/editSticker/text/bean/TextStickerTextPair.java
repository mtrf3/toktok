package com.ss.android.ugc.aweme.editSticker.text.bean;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.UC7;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.editSticker.text.bean.InteractTextStructWrap;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextPair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class TextStickerTextPair implements Parcelable {
    public static final Parcelable.Creator<TextStickerTextPair> CREATOR = new Parcelable.Creator<TextStickerTextPair>() { // from class: X.68Y
        @Override // android.os.Parcelable.Creator
        public final TextStickerTextPair createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C279117r.LIZIZ(InteractTextStructWrap.CREATOR, parcel, arrayList, i, 1);
            }
            return new TextStickerTextPair(readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final TextStickerTextPair[] newArray(int i) {
            return new TextStickerTextPair[i];
        }
    };

    @InterfaceC65349Pkn(alternate = {"a"}, value = "first")
    public final String first;

    @InterfaceC65349Pkn(alternate = {"b"}, value = "second")
    public final List<InteractTextStructWrap> second;

    /* JADX WARN: Multi-variable type inference failed */
    public TextStickerTextPair() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStickerTextPair)) {
            return false;
        }
        TextStickerTextPair textStickerTextPair = (TextStickerTextPair) obj;
        return o.LJ(this.first, textStickerTextPair.first) && o.LJ(this.second, textStickerTextPair.second);
    }

    public final int hashCode() {
        return this.second.hashCode() + (this.first.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('(');
        LIZ.append(this.first);
        LIZ.append(", ");
        return C1NE.LIZIZ(LIZ, this.second, ')', LIZ);
    }

    public TextStickerTextPair(String first, List<InteractTextStructWrap> second) {
        o.LJIIIZ(first, "first");
        o.LJIIIZ(second, "second");
        this.first = first;
        this.second = second;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.first);
        Iterator LIZJ = UC7.LIZJ(this.second, out);
        while (LIZJ.hasNext()) {
            ((InteractTextStructWrap) LIZJ.next()).writeToParcel(out, i);
        }
    }

    public /* synthetic */ TextStickerTextPair(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new ArrayList() : list);
    }
}
