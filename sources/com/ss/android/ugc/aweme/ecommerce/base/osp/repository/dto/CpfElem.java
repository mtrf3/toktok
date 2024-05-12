package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CpfElem {

    @InterfaceC65349Pkn("encrypt_code")
    public final String encryptCode;

    @InterfaceC65349Pkn("hash_id")
    public final Long hashId;

    @InterfaceC65349Pkn("mask_code")
    public final String maskCode;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CpfElem)) {
            return false;
        }
        CpfElem cpfElem = (CpfElem) obj;
        return o.LJ(this.encryptCode, cpfElem.encryptCode) && o.LJ(this.maskCode, cpfElem.maskCode) && o.LJ(this.hashId, cpfElem.hashId);
    }

    public final int hashCode() {
        String str = this.encryptCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.maskCode;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.hashId;
        return hashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CpfElem(encryptCode=");
        LIZ.append(this.encryptCode);
        LIZ.append(", maskCode=");
        LIZ.append(this.maskCode);
        LIZ.append(", hashId=");
        return JBR.LJ(LIZ, this.hashId, ')', LIZ);
    }

    public CpfElem(String str, String str2, Long l) {
        this.encryptCode = str;
        this.maskCode = str2;
        this.hashId = l;
    }
}
