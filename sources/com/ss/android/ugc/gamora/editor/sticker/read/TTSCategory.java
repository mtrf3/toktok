package com.ss.android.ugc.gamora.editor.sticker.read;

import X.C79062V1e;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.gamora.editor.sticker.read.TTSCategory;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class TTSCategory implements Parcelable {
    public static final Parcelable.Creator<TTSCategory> CREATOR = new Parcelable.Creator<TTSCategory>() { // from class: X.5aZ
        @Override // android.os.Parcelable.Creator
        public final TTSCategory createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new TTSCategory(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TTSCategory[] newArray(int i) {
            return new TTSCategory[i];
        }
    };
    public final String extra;
    public final String id;
    public final String name;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TTSCategory() {
        /*
            r2 = this;
            r1 = 0
            r0 = 7
            r2.<init>(r1, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.sticker.read.TTSCategory.<init>():void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TTSCategory)) {
            return false;
        }
        TTSCategory tTSCategory = (TTSCategory) obj;
        return o.LJ(this.id, tTSCategory.id) && o.LJ(this.name, tTSCategory.name) && o.LJ(this.extra, tTSCategory.extra);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.id);
        out.writeString(this.name);
        out.writeString(this.extra);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.name, this.id.hashCode() * 31, 31);
        String str = this.extra;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return LJ + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TTSCategory(id=");
        LIZ.append(this.id);
        LIZ.append(", name=");
        LIZ.append(this.name);
        LIZ.append(", extra=");
        return q.LIZIZ(LIZ, this.extra, ')', LIZ);
    }

    public TTSCategory(String id, String name, String str) {
        o.LJIIIZ(id, "id");
        o.LJIIIZ(name, "name");
        this.id = id;
        this.name = name;
        this.extra = str;
    }

    public /* synthetic */ TTSCategory(String str, String str2, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (String) null);
    }
}
