package com.bytedance.pipo.ocr.bean;

import X.C1DI;
import X.C86808Y5c;
import X.X1D;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b1;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class PipoOcrResult implements Parcelable {
    public static final C86808Y5c CREATOR = new C86808Y5c();
    public Bitmap cardImage;
    public String cardNumber;
    public Bitmap cardNumberImage;
    public String expirationDate;
    public Bitmap expirationDateImage;
    public String holderName;
    public Bitmap holderNameImage;
    public Bitmap originalImage;

    public PipoOcrResult() {
        this(null, 255);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder LIZJ = b1.LIZJ("PipoOcrResult {", "originalImage: ");
        LIZJ.append(this.originalImage);
        LIZJ.append(", ");
        LIZJ.append("cardNumber: ");
        C1DI.LIZIZ(LIZJ, this.cardNumber, ", ", "cardNumberImage: ");
        LIZJ.append(this.cardNumberImage);
        LIZJ.append(", ");
        LIZJ.append("expirationDate: ");
        C1DI.LIZIZ(LIZJ, this.expirationDate, ", ", "expirationDateImage: ");
        LIZJ.append(this.expirationDateImage);
        LIZJ.append(", ");
        LIZJ.append("holderName: ");
        LIZJ.append(this.holderName);
        LIZJ.append("holderNameImage: ");
        LIZJ.append(this.holderNameImage);
        LIZJ.append("cardImage: ");
        LIZJ.append(this.cardImage);
        LIZJ.append("}");
        return X1D.LIZIZ(LIZJ);
    }

    public /* synthetic */ PipoOcrResult(Bitmap bitmap, int i) {
        this((i & 1) != 0 ? null : bitmap, null, null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeParcelable(this.originalImage, i);
        parcel.writeString(this.cardNumber);
        parcel.writeParcelable(this.cardNumberImage, i);
        parcel.writeString(this.expirationDate);
        parcel.writeParcelable(this.expirationDateImage, i);
        parcel.writeString(this.holderName);
        parcel.writeParcelable(this.holderNameImage, i);
        parcel.writeParcelable(this.cardImage, i);
    }

    public PipoOcrResult(Bitmap bitmap, String str, Bitmap bitmap2, String str2, Bitmap bitmap3, String str3, Bitmap bitmap4, Bitmap bitmap5) {
        this.originalImage = bitmap;
        this.cardNumber = str;
        this.cardNumberImage = bitmap2;
        this.expirationDate = str2;
        this.expirationDateImage = bitmap3;
        this.holderName = str3;
        this.holderNameImage = bitmap4;
        this.cardImage = bitmap5;
    }
}
