package com.ss.android.ugc.aweme.relation.auth.model;

import X.InterfaceC65349Pkn;
import X.O1A;
import X.X1D;
import android.util.Base64;
import defpackage.q;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class PsiContactStruct {

    @O1A
    public final transient byte[] hashA;

    @InterfaceC65349Pkn("hash_a")
    public String hashABase64;

    @InterfaceC65349Pkn("prefix")
    public final String prefix;

    public static /* synthetic */ PsiContactStruct copy$default(PsiContactStruct psiContactStruct, byte[] bArr, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bArr = psiContactStruct.hashA;
        }
        if ((i & 2) != 0) {
            str = psiContactStruct.prefix;
        }
        return psiContactStruct.copy(bArr, str);
    }

    public final PsiContactStruct copy(byte[] hashA, String prefix) {
        o.LJIIIZ(hashA, "hashA");
        o.LJIIIZ(prefix, "prefix");
        return new PsiContactStruct(hashA, prefix);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PsiContactStruct)) {
            return false;
        }
        PsiContactStruct psiContactStruct = (PsiContactStruct) obj;
        return o.LJ(this.hashA, psiContactStruct.hashA) && o.LJ(this.prefix, psiContactStruct.prefix);
    }

    public int hashCode() {
        return this.prefix.hashCode() + (Arrays.hashCode(this.hashA) * 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PsiContactStruct(hashA=");
        LIZ.append(Arrays.toString(this.hashA));
        LIZ.append(", prefix=");
        return q.LIZIZ(LIZ, this.prefix, ')', LIZ);
    }

    public final byte[] getHashA() {
        return this.hashA;
    }

    public final String getHashABase64() {
        return this.hashABase64;
    }

    public final String getPrefix() {
        return this.prefix;
    }

    public final void setHashABase64(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.hashABase64 = str;
    }

    public PsiContactStruct(byte[] hashA, String prefix) {
        o.LJIIIZ(hashA, "hashA");
        o.LJIIIZ(prefix, "prefix");
        this.hashA = hashA;
        this.prefix = prefix;
        String encodeToString = Base64.encodeToString(hashA, 2);
        o.LJIIIIZZ(encodeToString, "encodeToString(byteArray, Base64.NO_WRAP)");
        this.hashABase64 = encodeToString;
    }
}
