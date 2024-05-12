package com.google.android.gms.common.server.response;

import X.C0EH;
import X.C1DI;
import X.C37355ElL;
import X.C67305QbF;
import X.C67308QbI;
import X.C67315QbP;
import X.C79057V0z;
import X.O5Y;
import X.QH7;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.SparseArray;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes12.dex */
public class SafeParcelResponse extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator<SafeParcelResponse> CREATOR = new C67305QbF();
    public final int zaa;
    public final Parcel zab;
    public final int zac;
    public final zan zad;
    public final String zae;
    public int zaf;
    public int zag;

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Map<String, FastJsonResponse.Field<?, ?>> LIZIZ() {
        zan zanVar = this.zad;
        if (zanVar == null) {
            return null;
        }
        String str = this.zae;
        QH7.LJIIIIZZ(str);
        return zanVar.LJJJJL(str);
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    public final Object LJ() {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean LJII() {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public final Parcel LJIIJ() {
        int i = this.zaf;
        if (i != 0) {
            if (i == 1) {
                C79057V0z.LJLILLLLZI(this.zab, this.zag);
                this.zaf = 2;
            }
        } else {
            int LJLIL = C79057V0z.LJLIL(this.zab, 20293);
            this.zag = LJLIL;
            C79057V0z.LJLILLLLZI(this.zab, LJLIL);
            this.zaf = 2;
        }
        return this.zab;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final String toString() {
        QH7.LJIIIZ(this.zad, "Cannot convert to JSON on client side.");
        Parcel LJIIJ = LJIIJ();
        LJIIJ.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        zan zanVar = this.zad;
        String str = this.zae;
        QH7.LJIIIIZZ(str);
        Map<String, FastJsonResponse.Field<?, ?>> LJJJJL = zanVar.LJJJJL(str);
        QH7.LJIIIIZZ(LJJJJL);
        LJIIJJI(sb, LJJJJL, LJIIJ);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zan zanVar;
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 1, this.zaa);
        Parcel LJIIJ = LJIIJ();
        if (LJIIJ != null) {
            int LJLIL2 = C79057V0z.LJLIL(parcel, 2);
            parcel.appendFrom(LJIIJ, 0, LJIIJ.dataSize());
            C79057V0z.LJLILLLLZI(parcel, LJLIL2);
        }
        int i2 = this.zac;
        if (i2 != 0) {
            if (i2 != 1) {
                zanVar = this.zad;
            } else {
                zanVar = this.zad;
            }
        } else {
            zanVar = null;
        }
        C79057V0z.LJJZZI(parcel, 3, zanVar, i, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public SafeParcelResponse(int i, Parcel parcel, zan zanVar) {
        String str;
        this.zaa = i;
        QH7.LJIIIIZZ(parcel);
        this.zab = parcel;
        this.zac = 2;
        this.zad = zanVar;
        if (zanVar == null) {
            str = null;
        } else {
            str = zanVar.zac;
        }
        this.zae = str;
        this.zaf = 2;
    }

    public static void LJIIJJI(StringBuilder sb, Map map, Parcel parcel) {
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry entry : map.entrySet()) {
            sparseArray.put(((FastJsonResponse.Field) entry.getValue()).zaf, entry);
        }
        sb.append('{');
        int LJJIII = C67315QbP.LJJIII(parcel);
        boolean z = false;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            Map.Entry entry2 = (Map.Entry) sparseArray.get((char) readInt);
            if (entry2 != null) {
                if (z) {
                    sb.append(",");
                }
                String str = (String) entry2.getKey();
                FastJsonResponse.Field field = (FastJsonResponse.Field) entry2.getValue();
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                Parcel parcel2 = null;
                BigInteger bigInteger = null;
                BigInteger[] bigIntegerArr = null;
                float[] createFloatArray = null;
                double[] createDoubleArray = null;
                BigDecimal[] bigDecimalArr = null;
                boolean[] createBooleanArray = null;
                Parcel[] parcelArr = null;
                BigInteger bigInteger2 = null;
                String encodeToString = null;
                String encodeToString2 = null;
                if (field.LJJJLIIL()) {
                    int i = field.LJLJI;
                    switch (i) {
                        case 0:
                            LJIILIIL(sb, field, FastJsonResponse.LJIIIIZZ(field, Integer.valueOf(C67315QbP.LJIJJLI(parcel, readInt))));
                            break;
                        case 1:
                            int LJJIFFI = C67315QbP.LJJIFFI(parcel, readInt);
                            int dataPosition = parcel.dataPosition();
                            if (LJJIFFI != 0) {
                                byte[] createByteArray = parcel.createByteArray();
                                parcel.setDataPosition(dataPosition + LJJIFFI);
                                bigInteger = new BigInteger(createByteArray);
                            }
                            LJIILIIL(sb, field, FastJsonResponse.LJIIIIZZ(field, bigInteger));
                            break;
                        case 2:
                            LJIILIIL(sb, field, FastJsonResponse.LJIIIIZZ(field, Long.valueOf(C67315QbP.LJJ(parcel, readInt))));
                            break;
                        case 3:
                            LJIILIIL(sb, field, FastJsonResponse.LJIIIIZZ(field, Float.valueOf(C67315QbP.LJIJ(parcel, readInt))));
                            break;
                        case 4:
                            LJIILIIL(sb, field, FastJsonResponse.LJIIIIZZ(field, Double.valueOf(C67315QbP.LJIILLIIL(parcel, readInt))));
                            break;
                        case 5:
                            LJIILIIL(sb, field, FastJsonResponse.LJIIIIZZ(field, C67315QbP.LIZ(parcel, readInt)));
                            break;
                        case 6:
                            LJIILIIL(sb, field, FastJsonResponse.LJIIIIZZ(field, Boolean.valueOf(C67315QbP.LJIILIIL(parcel, readInt))));
                            break;
                        case 7:
                            LJIILIIL(sb, field, FastJsonResponse.LJIIIIZZ(field, C67315QbP.LJII(parcel, readInt)));
                            break;
                        case 8:
                        case 9:
                            LJIILIIL(sb, field, FastJsonResponse.LJIIIIZZ(field, C67315QbP.LIZJ(parcel, readInt)));
                            break;
                        case 10:
                            Bundle LIZIZ = C67315QbP.LIZIZ(parcel, readInt);
                            HashMap hashMap = new HashMap();
                            for (String str2 : LIZIZ.keySet()) {
                                String string = LIZIZ.getString(str2);
                                QH7.LJIIIIZZ(string);
                                hashMap.put(str2, string);
                            }
                            LJIILIIL(sb, field, FastJsonResponse.LJIIIIZZ(field, hashMap));
                            break;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            StringBuilder sb2 = new StringBuilder(36);
                            sb2.append("Unknown field out type = ");
                            sb2.append(i);
                            throw new IllegalArgumentException(sb2.toString());
                    }
                } else if (field.LJLJJI) {
                    sb.append("[");
                    switch (field.LJLJI) {
                        case 0:
                            int[] LIZLLL = C67315QbP.LIZLLL(parcel, readInt);
                            int length = LIZLLL.length;
                            for (int i2 = 0; i2 < length; i2++) {
                                if (i2 != 0) {
                                    sb.append(",");
                                }
                                sb.append(Integer.toString(LIZLLL[i2]));
                            }
                            break;
                        case 1:
                            int LJJIFFI2 = C67315QbP.LJJIFFI(parcel, readInt);
                            int dataPosition2 = parcel.dataPosition();
                            if (LJJIFFI2 != 0) {
                                int readInt2 = parcel.readInt();
                                bigIntegerArr = new BigInteger[readInt2];
                                for (int i3 = 0; i3 < readInt2; i3++) {
                                    bigIntegerArr[i3] = new BigInteger(parcel.createByteArray());
                                }
                                parcel.setDataPosition(dataPosition2 + LJJIFFI2);
                            }
                            int length2 = bigIntegerArr.length;
                            for (int i4 = 0; i4 < length2; i4++) {
                                if (i4 != 0) {
                                    sb.append(",");
                                }
                                sb.append(bigIntegerArr[i4]);
                            }
                            break;
                        case 2:
                            long[] LJFF = C67315QbP.LJFF(parcel, readInt);
                            int length3 = LJFF.length;
                            for (int i5 = 0; i5 < length3; i5++) {
                                if (i5 != 0) {
                                    sb.append(",");
                                }
                                sb.append(Long.toString(LJFF[i5]));
                            }
                            break;
                        case 3:
                            int LJJIFFI3 = C67315QbP.LJJIFFI(parcel, readInt);
                            int dataPosition3 = parcel.dataPosition();
                            if (LJJIFFI3 != 0) {
                                createFloatArray = parcel.createFloatArray();
                                parcel.setDataPosition(dataPosition3 + LJJIFFI3);
                            }
                            int length4 = createFloatArray.length;
                            for (int i6 = 0; i6 < length4; i6++) {
                                if (i6 != 0) {
                                    sb.append(",");
                                }
                                sb.append(Float.toString(createFloatArray[i6]));
                            }
                            break;
                        case 4:
                            int LJJIFFI4 = C67315QbP.LJJIFFI(parcel, readInt);
                            int dataPosition4 = parcel.dataPosition();
                            if (LJJIFFI4 != 0) {
                                createDoubleArray = parcel.createDoubleArray();
                                parcel.setDataPosition(dataPosition4 + LJJIFFI4);
                            }
                            int length5 = createDoubleArray.length;
                            for (int i7 = 0; i7 < length5; i7++) {
                                if (i7 != 0) {
                                    sb.append(",");
                                }
                                sb.append(Double.toString(createDoubleArray[i7]));
                            }
                            break;
                        case 5:
                            int LJJIFFI5 = C67315QbP.LJJIFFI(parcel, readInt);
                            int dataPosition5 = parcel.dataPosition();
                            if (LJJIFFI5 != 0) {
                                int readInt3 = parcel.readInt();
                                bigDecimalArr = new BigDecimal[readInt3];
                                for (int i8 = 0; i8 < readInt3; i8++) {
                                    byte[] createByteArray2 = parcel.createByteArray();
                                    bigDecimalArr[i8] = new BigDecimal(new BigInteger(createByteArray2), parcel.readInt());
                                }
                                parcel.setDataPosition(dataPosition5 + LJJIFFI5);
                            }
                            int length6 = bigDecimalArr.length;
                            for (int i9 = 0; i9 < length6; i9++) {
                                if (i9 != 0) {
                                    sb.append(",");
                                }
                                sb.append(bigDecimalArr[i9]);
                            }
                            break;
                        case 6:
                            int LJJIFFI6 = C67315QbP.LJJIFFI(parcel, readInt);
                            int dataPosition6 = parcel.dataPosition();
                            if (LJJIFFI6 != 0) {
                                createBooleanArray = parcel.createBooleanArray();
                                parcel.setDataPosition(dataPosition6 + LJJIFFI6);
                            }
                            int length7 = createBooleanArray.length;
                            for (int i10 = 0; i10 < length7; i10++) {
                                if (i10 != 0) {
                                    sb.append(",");
                                }
                                sb.append(Boolean.toString(createBooleanArray[i10]));
                            }
                            break;
                        case 7:
                            String[] LJIIIIZZ = C67315QbP.LJIIIIZZ(parcel, readInt);
                            int length8 = LJIIIIZZ.length;
                            int i11 = 0;
                            while (i11 < length8) {
                                if (i11 != 0) {
                                    sb.append(",");
                                }
                                sb.append("\"");
                                i11 = C0EH.LIZIZ(sb, LJIIIIZZ[i11], "\"", i11, 1);
                            }
                            break;
                        case 8:
                        case 9:
                        case 10:
                            throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                            int LJJIFFI7 = C67315QbP.LJJIFFI(parcel, readInt);
                            int dataPosition7 = parcel.dataPosition();
                            if (LJJIFFI7 != 0) {
                                int readInt4 = parcel.readInt();
                                Parcel[] parcelArr2 = new Parcel[readInt4];
                                for (int i12 = 0; i12 < readInt4; i12++) {
                                    int readInt5 = parcel.readInt();
                                    if (readInt5 != 0) {
                                        int dataPosition8 = parcel.dataPosition();
                                        Parcel obtain = Parcel.obtain();
                                        obtain.appendFrom(parcel, dataPosition8, readInt5);
                                        parcelArr2[i12] = obtain;
                                        parcel.setDataPosition(dataPosition8 + readInt5);
                                    } else {
                                        parcelArr2[i12] = null;
                                    }
                                }
                                parcel.setDataPosition(dataPosition7 + LJJIFFI7);
                                parcelArr = parcelArr2;
                            }
                            int length9 = parcelArr.length;
                            for (int i13 = 0; i13 < length9; i13++) {
                                if (i13 > 0) {
                                    sb.append(",");
                                }
                                parcelArr[i13].setDataPosition(0);
                                QH7.LJIIIIZZ(field.LJLJL);
                                QH7.LJIIIIZZ(field.zaj);
                                Map<String, FastJsonResponse.Field<?, ?>> LJJJJL = field.zaj.LJJJJL(field.LJLJL);
                                QH7.LJIIIIZZ(LJJJJL);
                                LJIIJJI(sb, LJJJJL, parcelArr[i13]);
                            }
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out.");
                    }
                    sb.append("]");
                } else {
                    switch (field.LJLJI) {
                        case 0:
                            sb.append(C67315QbP.LJIJJLI(parcel, readInt));
                            break;
                        case 1:
                            int LJJIFFI8 = C67315QbP.LJJIFFI(parcel, readInt);
                            int dataPosition9 = parcel.dataPosition();
                            if (LJJIFFI8 != 0) {
                                byte[] createByteArray3 = parcel.createByteArray();
                                parcel.setDataPosition(dataPosition9 + LJJIFFI8);
                                bigInteger2 = new BigInteger(createByteArray3);
                            }
                            sb.append(bigInteger2);
                            break;
                        case 2:
                            sb.append(C67315QbP.LJJ(parcel, readInt));
                            break;
                        case 3:
                            sb.append(C67315QbP.LJIJ(parcel, readInt));
                            break;
                        case 4:
                            sb.append(C67315QbP.LJIILLIIL(parcel, readInt));
                            break;
                        case 5:
                            sb.append(C67315QbP.LIZ(parcel, readInt));
                            break;
                        case 6:
                            sb.append(C67315QbP.LJIILIIL(parcel, readInt));
                            break;
                        case 7:
                            String LJII = C67315QbP.LJII(parcel, readInt);
                            sb.append("\"");
                            sb.append(C37355ElL.LIZIZ(LJII));
                            sb.append("\"");
                            break;
                        case 8:
                            byte[] LIZJ = C67315QbP.LIZJ(parcel, readInt);
                            sb.append("\"");
                            if (LIZJ != null) {
                                encodeToString = Base64.encodeToString(LIZJ, 0);
                            }
                            sb.append(encodeToString);
                            sb.append("\"");
                            break;
                        case 9:
                            byte[] LIZJ2 = C67315QbP.LIZJ(parcel, readInt);
                            sb.append("\"");
                            if (LIZJ2 != null) {
                                encodeToString2 = Base64.encodeToString(LIZJ2, 10);
                            }
                            sb.append(encodeToString2);
                            sb.append("\"");
                            break;
                        case 10:
                            Bundle LIZIZ2 = C67315QbP.LIZIZ(parcel, readInt);
                            Set<String> keySet = LIZIZ2.keySet();
                            sb.append("{");
                            boolean z2 = true;
                            for (String str3 : keySet) {
                                if (!z2) {
                                    sb.append(",");
                                }
                                C1DI.LIZIZ(sb, "\"", str3, "\":\"");
                                sb.append(C37355ElL.LIZIZ(LIZIZ2.getString(str3)));
                                sb.append("\"");
                                z2 = false;
                            }
                            sb.append("}");
                            break;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                            int LJJIFFI9 = C67315QbP.LJJIFFI(parcel, readInt);
                            int dataPosition10 = parcel.dataPosition();
                            if (LJJIFFI9 != 0) {
                                parcel2 = Parcel.obtain();
                                parcel2.appendFrom(parcel, dataPosition10, LJJIFFI9);
                                parcel.setDataPosition(dataPosition10 + LJJIFFI9);
                            }
                            parcel2.setDataPosition(0);
                            QH7.LJIIIIZZ(field.LJLJL);
                            QH7.LJIIIIZZ(field.zaj);
                            Map<String, FastJsonResponse.Field<?, ?>> LJJJJL2 = field.zaj.LJJJJL(field.LJLJL);
                            QH7.LJIIIIZZ(LJJJJL2);
                            LJIIJJI(sb, LJJJJL2, parcel2);
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out");
                    }
                }
                z = true;
            }
        }
        if (parcel.dataPosition() == LJJIII) {
            sb.append('}');
            return;
        }
        StringBuilder sb3 = new StringBuilder(37);
        sb3.append("Overread allowed size end=");
        sb3.append(LJJIII);
        throw new C67308QbI(sb3.toString(), parcel);
    }

    public static final void LJIIL(StringBuilder sb, int i, Object obj) {
        String str = null;
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append("\"");
                QH7.LJIIIIZZ(obj);
                sb.append(C37355ElL.LIZIZ(obj.toString()));
                sb.append("\"");
                return;
            case 8:
                sb.append("\"");
                byte[] bArr = (byte[]) obj;
                if (bArr != null) {
                    str = Base64.encodeToString(bArr, 0);
                }
                sb.append(str);
                sb.append("\"");
                return;
            case 9:
                sb.append("\"");
                byte[] bArr2 = (byte[]) obj;
                if (bArr2 != null) {
                    str = Base64.encodeToString(bArr2, 10);
                }
                sb.append(str);
                sb.append("\"");
                return;
            case 10:
                QH7.LJIIIIZZ(obj);
                O5Y.LJJLIIIJJIZ(sb, (HashMap) obj);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                StringBuilder sb2 = new StringBuilder(26);
                sb2.append("Unknown type = ");
                sb2.append(i);
                throw new IllegalArgumentException(sb2.toString());
        }
    }

    public static final void LJIILIIL(StringBuilder sb, FastJsonResponse.Field<?, ?> field, Object obj) {
        if (field.LJLILLLLZI) {
            ArrayList arrayList = (ArrayList) obj;
            sb.append("[");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (i != 0) {
                    sb.append(",");
                }
                LJIIL(sb, field.LJLIL, ListProtector.get(arrayList, i));
            }
            sb.append("]");
            return;
        }
        LJIIL(sb, field.LJLIL, obj);
    }
}
