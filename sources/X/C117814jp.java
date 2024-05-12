package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4jp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C117814jp extends AbstractC117924k0<H4F, C117814jp> {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final EnumC117804jo LJI;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C117814jp() {
        /*
            r6 = this;
            r1 = 0
            r3 = 0
            r5 = 127(0x7f, float:1.78E-43)
            r0 = r6
            r2 = r1
            r4 = r3
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117814jp.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C117814jp)) {
            return false;
        }
        C117814jp c117814jp = (C117814jp) obj;
        return o.LJ(this.LIZ, c117814jp.LIZ) && o.LJ(this.LIZIZ, c117814jp.LIZIZ) && this.LIZJ == c117814jp.LIZJ && this.LIZLLL == c117814jp.LIZLLL && o.LJ(this.LJ, c117814jp.LJ) && o.LJ(this.LJFF, c117814jp.LJFF) && this.LJI == c117814jp.LJI;
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int hashCode2 = (((((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31;
        String str3 = this.LJ;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJFF;
        return this.LJI.hashCode() + ((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PictureCardTemplateAndAttachmentWrapper(localPath=");
        LIZ.append(this.LIZ);
        LIZ.append(", localFileMD5=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", width=");
        LIZ.append(this.LIZJ);
        LIZ.append(", height=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", secretKey=");
        LIZ.append(this.LJ);
        LIZ.append(", uri=");
        LIZ.append(this.LJFF);
        LIZ.append(", uploadState=");
        LIZ.append(this.LJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.AbstractC117924k0
    public final List<C117824jq> LIZ(String str) {
        C117824jq c117824jq = new C117824jq();
        c117824jq.setIndex(0);
        c117824jq.setLocalPath(this.LIZ);
        c117824jq.setOriginalWidth(this.LIZJ);
        c117824jq.setOriginalHeight(this.LIZLLL);
        c117824jq.setHash(this.LIZIZ);
        if (str != null) {
            c117824jq.setMsgUuid(str);
        }
        c117824jq.setUploadState(this.LJI.getState());
        C117824jq c117824jq2 = new C117824jq();
        c117824jq2.setIndex(1);
        c117824jq2.setOriginalWidth(this.LIZJ);
        c117824jq2.setOriginalHeight(this.LIZLLL);
        c117824jq2.setSecretKey(this.LJ);
        c117824jq2.setUri(this.LJFF);
        c117824jq2.setHash(this.LIZIZ);
        if (str != null) {
            c117824jq2.setMsgUuid(str);
        }
        return C47261Igj.LJJIJIIJI(c117824jq, c117824jq2);
    }

    public /* synthetic */ C117814jp(String str, String str2, int i, int i2, int i3) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2, null, null, (i3 & 64) != 0 ? EnumC117804jo.DEFAULT : null);
    }

    public C117814jp(String str, String str2, int i, int i2, String str3, String str4, EnumC117804jo uploadState) {
        o.LJIIIZ(uploadState, "uploadState");
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = str3;
        this.LJFF = str4;
        this.LJI = uploadState;
    }

    public static C117814jp LIZIZ(C117814jp c117814jp, String str, int i, int i2, String str2, String str3, EnumC117804jo enumC117804jo, int i3) {
        String str4;
        EnumC117804jo uploadState = enumC117804jo;
        String str5 = str3;
        String str6 = str2;
        int i4 = i2;
        String str7 = str;
        int i5 = i;
        if ((i3 & 1) != 0) {
            str7 = c117814jp.LIZ;
        }
        if ((i3 & 2) != 0) {
            str4 = c117814jp.LIZIZ;
        } else {
            str4 = null;
        }
        if ((i3 & 4) != 0) {
            i5 = c117814jp.LIZJ;
        }
        if ((i3 & 8) != 0) {
            i4 = c117814jp.LIZLLL;
        }
        if ((i3 & 16) != 0) {
            str6 = c117814jp.LJ;
        }
        if ((i3 & 32) != 0) {
            str5 = c117814jp.LJFF;
        }
        if ((i3 & 64) != 0) {
            uploadState = c117814jp.LJI;
        }
        c117814jp.getClass();
        o.LJIIIZ(uploadState, "uploadState");
        return new C117814jp(str7, str4, i5, i4, str6, str5, uploadState);
    }
}
