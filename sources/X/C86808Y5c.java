package X;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.pipo.ocr.bean.PipoOcrResult;
import kotlin.jvm.internal.o;

/* renamed from: X.Y5c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86808Y5c implements Parcelable.Creator<PipoOcrResult> {
    public static PipoOcrResult LIZ(C36661cE c36661cE) {
        String str;
        Bitmap bitmap;
        String str2;
        Bitmap bitmap2 = null;
        PipoOcrResult pipoOcrResult = new PipoOcrResult(null, 255);
        if (c36661cE == null) {
            str = null;
        } else {
            try {
                str = c36661cE.LJII;
            } catch (Throwable unused) {
            }
        }
        pipoOcrResult.cardNumber = str;
        if (c36661cE == null) {
            bitmap = null;
        } else {
            bitmap = c36661cE.LJIILIIL;
        }
        pipoOcrResult.cardNumberImage = bitmap;
        if (c36661cE == null) {
            str2 = null;
        } else {
            str2 = c36661cE.LJFF;
        }
        pipoOcrResult.expirationDate = str2;
        if (c36661cE != null) {
            bitmap2 = c36661cE.LJIILJJIL;
        }
        pipoOcrResult.expirationDateImage = bitmap2;
        return pipoOcrResult;
    }

    @Override // android.os.Parcelable.Creator
    public final PipoOcrResult createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new PipoOcrResult((Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader()), parcel.readString(), (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader()), parcel.readString(), (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader()), parcel.readString(), (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader()), (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final PipoOcrResult[] newArray(int i) {
        return new PipoOcrResult[i];
    }
}
