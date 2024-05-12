package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.4cJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C113154cJ {
    public final Integer LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final Integer LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;

    public C113154cJ() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C113154cJ)) {
            return false;
        }
        C113154cJ c113154cJ = (C113154cJ) obj;
        return o.LJ(this.LIZ, c113154cJ.LIZ) && o.LJ(this.LIZIZ, c113154cJ.LIZIZ) && o.LJ(this.LIZJ, c113154cJ.LIZJ) && o.LJ(this.LIZLLL, c113154cJ.LIZLLL) && o.LJ(this.LJ, c113154cJ.LJ) && o.LJ(this.LJFF, c113154cJ.LJFF) && o.LJ(this.LJI, c113154cJ.LJI) && o.LJ(this.LJII, c113154cJ.LJII) && o.LJ(this.LJIIIIZZ, c113154cJ.LJIIIIZZ);
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.LIZIZ;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZLLL;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.LJ;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.LJFF;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJI;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LJII;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.LJIIIIZZ;
        return hashCode8 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OpenSendToSheetRequestData(sendMessageScene=");
        LIZ.append(this.LIZ);
        LIZ.append(", uid=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", nickName=");
        LIZ.append(this.LIZJ);
        LIZ.append(", conversationId=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", messageType=");
        LIZ.append(this.LJ);
        LIZ.append(", messageToSend=");
        LIZ.append(this.LJFF);
        LIZ.append(", coverUrl=");
        LIZ.append(this.LJI);
        LIZ.append(", content=");
        LIZ.append(this.LJII);
        LIZ.append(", sendScene=");
        return q.LIZIZ(LIZ, this.LJIIIIZZ, ')', LIZ);
    }

    public C113154cJ(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, Integer num2) {
        this.LIZ = num;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = num2;
        this.LJFF = str4;
        this.LJI = str5;
        this.LJII = str6;
        this.LJIIIIZZ = str7;
    }
}
