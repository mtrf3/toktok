package com.tiktok.sticker.commonsticker.model;

import X.C1542463o;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.tiktok.sticker.commonsticker.model.OptionsBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class OptionsBean implements Parcelable {
    public static final C1542463o CREATOR = new Parcelable.Creator<OptionsBean>() { // from class: X.63o
        @Override // android.os.Parcelable.Creator
        public final OptionsBean createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new OptionsBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final OptionsBean[] newArray(int i) {
            return new OptionsBean[i];
        }
    };

    @InterfaceC65349Pkn("option_id")
    public final long optionId;

    @InterfaceC65349Pkn("option_text")
    public final String optionText;

    @InterfaceC65349Pkn("vote_count")
    public final long pollCount;

    @InterfaceC65349Pkn("option")
    public final String postOption;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public OptionsBean() {
        /*
            r9 = this;
            r1 = 0
            r2 = 0
            r7 = 15
            r0 = r9
            r4 = r2
            r6 = r1
            r8 = r1
            r0.<init>(r1, r2, r4, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tiktok.sticker.commonsticker.model.OptionsBean.<init>():void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public OptionsBean(android.os.Parcel r8) {
        /*
            r7 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            java.lang.String r1 = r8.readString()
            java.lang.String r6 = ""
            if (r1 != 0) goto Le
            r1 = r6
        Le:
            long r2 = r8.readLong()
            long r4 = r8.readLong()
            java.lang.String r0 = r8.readString()
            if (r0 != 0) goto L21
        L1c:
            r0 = r7
            r0.<init>(r1, r2, r4, r6)
            return
        L21:
            r6 = r0
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tiktok.sticker.commonsticker.model.OptionsBean.<init>(android.os.Parcel):void");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeString(this.optionText);
        parcel.writeLong(this.optionId);
        parcel.writeLong(this.pollCount);
        parcel.writeString(this.postOption);
    }

    public OptionsBean(String optionText, long j, long j2, String postOption) {
        o.LJIIIZ(optionText, "optionText");
        o.LJIIIZ(postOption, "postOption");
        this.optionText = optionText;
        this.optionId = j;
        this.pollCount = j2;
        this.postOption = postOption;
    }

    public /* synthetic */ OptionsBean(String str, long j, long j2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : j, (i & 4) == 0 ? j2 : 0L, (i & 8) == 0 ? str2 : "");
    }
}
