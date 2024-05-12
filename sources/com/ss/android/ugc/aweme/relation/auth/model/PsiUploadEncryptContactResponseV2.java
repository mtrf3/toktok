package com.ss.android.ugc.aweme.relation.auth.model;

import X.C1NE;
import X.C32I;
import X.C78977Uz7;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.O1A;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class PsiUploadEncryptContactResponseV2 extends BaseResponse {

    @O1A
    public transient byte[] bloomFilterBits;

    @InterfaceC65349Pkn("phone_bits")
    public final String bloomFilterBitsBase64;

    @InterfaceC65349Pkn("email_bits")
    public final String bloomFilterBitsBase64Email;

    @O1A
    public transient byte[] bloomFilterBitsEmail;

    @InterfaceC65349Pkn("phone_k")
    public final long bloomFilterK;

    @InterfaceC65349Pkn("email_k")
    public final long bloomFilterKEmail;

    @InterfaceC65349Pkn("phone_m")
    public final long bloomFilterM;

    @InterfaceC65349Pkn("email_m")
    public final long bloomFilterMEmail;

    @InterfaceC65349Pkn("phone_hash_a_b")
    public final List<String> hashABBase64List;

    @InterfaceC65349Pkn("email_hash_a_b")
    public final List<String> hashABBase64ListEmail;

    @O1A
    public transient List<byte[]> hashABList;

    @O1A
    public transient List<byte[]> hashABListEmail;

    @InterfaceC65349Pkn("log_id")
    public final String psiSessionId;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PsiUploadEncryptContactResponseV2 copy$default(PsiUploadEncryptContactResponseV2 psiUploadEncryptContactResponseV2, String str, String str2, long j, long j2, List list, String str3, long j3, long j4, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = psiUploadEncryptContactResponseV2.psiSessionId;
        }
        if ((i & 2) != 0) {
            str2 = psiUploadEncryptContactResponseV2.bloomFilterBitsBase64;
        }
        if ((i & 4) != 0) {
            j = psiUploadEncryptContactResponseV2.bloomFilterM;
        }
        if ((i & 8) != 0) {
            j2 = psiUploadEncryptContactResponseV2.bloomFilterK;
        }
        if ((i & 16) != 0) {
            list = psiUploadEncryptContactResponseV2.hashABBase64List;
        }
        if ((i & 32) != 0) {
            str3 = psiUploadEncryptContactResponseV2.bloomFilterBitsBase64Email;
        }
        if ((i & 64) != 0) {
            j3 = psiUploadEncryptContactResponseV2.bloomFilterMEmail;
        }
        if ((i & 128) != 0) {
            j4 = psiUploadEncryptContactResponseV2.bloomFilterKEmail;
        }
        if ((i & 256) != 0) {
            list2 = psiUploadEncryptContactResponseV2.hashABBase64ListEmail;
        }
        return psiUploadEncryptContactResponseV2.copy(str, str2, j, j2, list, str3, j3, j4, list2);
    }

    public final PsiUploadEncryptContactResponseV2 copy(String psiSessionId, String str, long j, long j2, List<String> list, String str2, long j3, long j4, List<String> list2) {
        o.LJIIIZ(psiSessionId, "psiSessionId");
        return new PsiUploadEncryptContactResponseV2(psiSessionId, str, j, j2, list, str2, j3, j4, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PsiUploadEncryptContactResponseV2)) {
            return false;
        }
        PsiUploadEncryptContactResponseV2 psiUploadEncryptContactResponseV2 = (PsiUploadEncryptContactResponseV2) obj;
        return o.LJ(this.psiSessionId, psiUploadEncryptContactResponseV2.psiSessionId) && o.LJ(this.bloomFilterBitsBase64, psiUploadEncryptContactResponseV2.bloomFilterBitsBase64) && this.bloomFilterM == psiUploadEncryptContactResponseV2.bloomFilterM && this.bloomFilterK == psiUploadEncryptContactResponseV2.bloomFilterK && o.LJ(this.hashABBase64List, psiUploadEncryptContactResponseV2.hashABBase64List) && o.LJ(this.bloomFilterBitsBase64Email, psiUploadEncryptContactResponseV2.bloomFilterBitsBase64Email) && this.bloomFilterMEmail == psiUploadEncryptContactResponseV2.bloomFilterMEmail && this.bloomFilterKEmail == psiUploadEncryptContactResponseV2.bloomFilterKEmail && o.LJ(this.hashABBase64ListEmail, psiUploadEncryptContactResponseV2.hashABBase64ListEmail);
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.psiSessionId.hashCode() * 31;
        String str = this.bloomFilterBitsBase64;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.bloomFilterK, JBR.LIZJ(this.bloomFilterM, (hashCode4 + hashCode) * 31, 31), 31);
        List<String> list = this.hashABBase64List;
        if (list == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list.hashCode();
        }
        int i2 = (LIZJ + hashCode2) * 31;
        String str2 = this.bloomFilterBitsBase64Email;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int LIZJ2 = JBR.LIZJ(this.bloomFilterKEmail, JBR.LIZJ(this.bloomFilterMEmail, (i2 + hashCode3) * 31, 31), 31);
        List<String> list2 = this.hashABBase64ListEmail;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return LIZJ2 + i;
    }

    public final PsiUploadEncryptContactResponseV2 initIfReflectByGson() {
        List<byte[]> list;
        byte[] bArr;
        ArrayList arrayList;
        List<byte[]> list2;
        byte[] bArr2;
        ArrayList arrayList2;
        if (this.hashABList == null) {
            List<String> list3 = this.hashABBase64List;
            if (list3 != null) {
                arrayList2 = new ArrayList(C32I.LJJL(list3, 10));
                Iterator<String> it = list3.iterator();
                while (it.hasNext()) {
                    arrayList2.add(C78977Uz7.LJJIIJ(it.next()));
                }
            } else {
                arrayList2 = new ArrayList();
            }
            this.hashABList = arrayList2;
        }
        String str = "";
        if (this.bloomFilterBits == null) {
            String str2 = this.bloomFilterBitsBase64;
            if ((str2 == null || str2.length() == 0) && (list2 = this.hashABList) != null && list2.size() == 0) {
                bArr2 = new byte[0];
            } else {
                String str3 = this.bloomFilterBitsBase64;
                if (str3 == null) {
                    str3 = "";
                }
                bArr2 = C78977Uz7.LJJIIJ(str3);
            }
            this.bloomFilterBits = bArr2;
        }
        if (this.hashABListEmail == null) {
            List<String> list4 = this.hashABBase64ListEmail;
            if (list4 != null) {
                arrayList = new ArrayList(C32I.LJJL(list4, 10));
                Iterator<String> it2 = list4.iterator();
                while (it2.hasNext()) {
                    arrayList.add(C78977Uz7.LJJIIJ(it2.next()));
                }
            } else {
                arrayList = new ArrayList();
            }
            this.hashABListEmail = arrayList;
        }
        if (this.bloomFilterBitsEmail == null) {
            String str4 = this.bloomFilterBitsBase64Email;
            if ((str4 == null || str4.length() == 0) && (list = this.hashABListEmail) != null && list.size() == 0) {
                bArr = new byte[0];
            } else {
                String str5 = this.bloomFilterBitsBase64Email;
                if (str5 != null) {
                    str = str5;
                }
                bArr = C78977Uz7.LJJIIJ(str);
            }
            this.bloomFilterBitsEmail = bArr;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PsiUploadEncryptContactResponseV2(psiSessionId=");
        LIZ.append(this.psiSessionId);
        LIZ.append(", bloomFilterBitsBase64=");
        LIZ.append(this.bloomFilterBitsBase64);
        LIZ.append(", bloomFilterM=");
        LIZ.append(this.bloomFilterM);
        LIZ.append(", bloomFilterK=");
        LIZ.append(this.bloomFilterK);
        LIZ.append(", hashABBase64List=");
        LIZ.append(this.hashABBase64List);
        LIZ.append(", bloomFilterBitsBase64Email=");
        LIZ.append(this.bloomFilterBitsBase64Email);
        LIZ.append(", bloomFilterMEmail=");
        LIZ.append(this.bloomFilterMEmail);
        LIZ.append(", bloomFilterKEmail=");
        LIZ.append(this.bloomFilterKEmail);
        LIZ.append(", hashABBase64ListEmail=");
        return C1NE.LIZIZ(LIZ, this.hashABBase64ListEmail, ')', LIZ);
    }

    public final byte[] getBloomFilterBits() {
        return this.bloomFilterBits;
    }

    public final String getBloomFilterBitsBase64() {
        return this.bloomFilterBitsBase64;
    }

    public final String getBloomFilterBitsBase64Email() {
        return this.bloomFilterBitsBase64Email;
    }

    public final byte[] getBloomFilterBitsEmail() {
        return this.bloomFilterBitsEmail;
    }

    public final long getBloomFilterK() {
        return this.bloomFilterK;
    }

    public final long getBloomFilterKEmail() {
        return this.bloomFilterKEmail;
    }

    public final long getBloomFilterM() {
        return this.bloomFilterM;
    }

    public final long getBloomFilterMEmail() {
        return this.bloomFilterMEmail;
    }

    public final List<String> getHashABBase64List() {
        return this.hashABBase64List;
    }

    public final List<String> getHashABBase64ListEmail() {
        return this.hashABBase64ListEmail;
    }

    public final List<byte[]> getHashABList() {
        return this.hashABList;
    }

    public final List<byte[]> getHashABListEmail() {
        return this.hashABListEmail;
    }

    public final String getPsiSessionId() {
        return this.psiSessionId;
    }

    public final void setBloomFilterBits(byte[] bArr) {
        o.LJIIIZ(bArr, "<set-?>");
        this.bloomFilterBits = bArr;
    }

    public final void setBloomFilterBitsEmail(byte[] bArr) {
        o.LJIIIZ(bArr, "<set-?>");
        this.bloomFilterBitsEmail = bArr;
    }

    public final void setHashABList(List<byte[]> list) {
        o.LJIIIZ(list, "<set-?>");
        this.hashABList = list;
    }

    public final void setHashABListEmail(List<byte[]> list) {
        o.LJIIIZ(list, "<set-?>");
        this.hashABListEmail = list;
    }

    public PsiUploadEncryptContactResponseV2(String psiSessionId, String str, long j, long j2, List<String> list, String str2, long j3, long j4, List<String> list2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        o.LJIIIZ(psiSessionId, "psiSessionId");
        this.psiSessionId = psiSessionId;
        this.bloomFilterBitsBase64 = str;
        this.bloomFilterM = j;
        this.bloomFilterK = j2;
        this.hashABBase64List = list;
        this.bloomFilterBitsBase64Email = str2;
        this.bloomFilterMEmail = j3;
        this.bloomFilterKEmail = j4;
        this.hashABBase64ListEmail = list2;
        this.bloomFilterBits = C78977Uz7.LJJIIJ(str == null ? "" : str);
        if (list != null) {
            arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(C78977Uz7.LJJIIJ(it.next()));
            }
        } else {
            arrayList = new ArrayList();
        }
        this.hashABList = arrayList;
        String str3 = this.bloomFilterBitsBase64Email;
        this.bloomFilterBitsEmail = C78977Uz7.LJJIIJ(str3 != null ? str3 : "");
        List<String> list3 = this.hashABBase64ListEmail;
        if (list3 != null) {
            arrayList2 = new ArrayList(C32I.LJJL(list3, 10));
            Iterator<String> it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(C78977Uz7.LJJIIJ(it2.next()));
            }
        } else {
            arrayList2 = new ArrayList();
        }
        this.hashABListEmail = arrayList2;
    }

    public /* synthetic */ PsiUploadEncryptContactResponseV2(String str, String str2, long j, long j2, List list, String str3, long j3, long j4, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, j2, (i & 16) != 0 ? null : list, str3, j3, j4, (i & 256) == 0 ? list2 : null);
    }
}
