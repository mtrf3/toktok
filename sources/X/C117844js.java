package X;

import com.ss.android.vesdk.VEUtils;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4js, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C117844js extends AbstractC117924k0<G0D, C117844js> {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final EnumC117804jo LJI;
    public final VEUtils.VEVideoFileInfo LJII;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C117844js() {
        /*
            r7 = this;
            r1 = 0
            r3 = 0
            r6 = 255(0xff, float:3.57E-43)
            r0 = r7
            r2 = r1
            r4 = r3
            r5 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117844js.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C117844js)) {
            return false;
        }
        C117844js c117844js = (C117844js) obj;
        return o.LJ(this.LIZ, c117844js.LIZ) && o.LJ(this.LIZIZ, c117844js.LIZIZ) && o.LJ(this.LIZJ, c117844js.LIZJ) && o.LJ(this.LIZLLL, c117844js.LIZLLL) && this.LJ == c117844js.LJ && this.LJFF == c117844js.LJFF && this.LJI == c117844js.LJI && o.LJ(this.LJII, c117844js.LJII);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LIZLLL;
        int hashCode4 = (this.LJI.hashCode() + ((((((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.LJ) * 31) + this.LJFF) * 31)) * 31;
        VEUtils.VEVideoFileInfo vEVideoFileInfo = this.LJII;
        return hashCode4 + (vEVideoFileInfo != null ? vEVideoFileInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoCardTemplateAndAttachmentWrapper(localPath=");
        LIZ.append(this.LIZ);
        LIZ.append(", localFileMD5=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", localThumbnailPath=");
        LIZ.append(this.LIZJ);
        LIZ.append(", vid=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", videoWidth=");
        LIZ.append(this.LJ);
        LIZ.append(", videoHeight=");
        LIZ.append(this.LJFF);
        LIZ.append(", uploadState=");
        LIZ.append(this.LJI);
        LIZ.append(", videoFileInfo=");
        LIZ.append(this.LJII);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.AbstractC117924k0
    public final List<C117824jq> LIZ(String str) {
        C117824jq c117824jq = new C117824jq();
        c117824jq.setIndex(0);
        c117824jq.setLocalPath(this.LIZ);
        c117824jq.setOriginalWidth(this.LJ);
        c117824jq.setOriginalHeight(this.LJFF);
        if (str != null) {
            c117824jq.setMsgUuid(str);
        }
        c117824jq.setUploadState(this.LJI.getState());
        C117824jq c117824jq2 = new C117824jq();
        c117824jq2.setIndex(1);
        c117824jq2.setOriginalWidth(this.LJ);
        c117824jq2.setOriginalHeight(this.LJFF);
        c117824jq2.setLocalPath(this.LIZJ);
        if (str != null) {
            c117824jq2.setMsgUuid(str);
        }
        C117824jq c117824jq3 = new C117824jq();
        c117824jq3.setIndex(2);
        c117824jq3.setVid(this.LIZLLL);
        c117824jq3.setOriginalWidth(this.LJ);
        c117824jq3.setOriginalHeight(this.LJFF);
        c117824jq3.setHash(this.LIZIZ);
        if (str != null) {
            c117824jq3.setMsgUuid(str);
        }
        return C47261Igj.LJJIJIIJI(c117824jq, c117824jq2, c117824jq3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C117844js(java.lang.String r11, java.lang.String r12, int r13, int r14, com.ss.android.vesdk.VEUtils.VEVideoFileInfo r15, int r16) {
        /*
            r10 = this;
            r3 = r12
            r2 = r11
            r6 = r13
            r7 = r14
            r9 = r15
            r1 = r16
            r0 = r1 & 1
            r4 = 0
            if (r0 == 0) goto Ld
            r2 = r4
        Ld:
            r0 = r1 & 2
            if (r0 == 0) goto L12
            r3 = r4
        L12:
            r0 = r1 & 16
            if (r0 == 0) goto L17
            r6 = 0
        L17:
            r0 = r1 & 32
            if (r0 == 0) goto L1c
            r7 = 0
        L1c:
            r0 = r1 & 64
            if (r0 == 0) goto L2d
            X.4jo r8 = X.EnumC117804jo.DEFAULT
        L22:
            r0 = r1 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L27
            r9 = r4
        L27:
            r1 = r10
            r5 = r4
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        L2d:
            r8 = r4
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117844js.<init>(java.lang.String, java.lang.String, int, int, com.ss.android.vesdk.VEUtils$VEVideoFileInfo, int):void");
    }

    public C117844js(String str, String str2, String str3, String str4, int i, int i2, EnumC117804jo uploadState, VEUtils.VEVideoFileInfo vEVideoFileInfo) {
        o.LJIIIZ(uploadState, "uploadState");
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = i;
        this.LJFF = i2;
        this.LJI = uploadState;
        this.LJII = vEVideoFileInfo;
    }

    public static C117844js LIZIZ(C117844js c117844js, String str, String str2, String str3, int i, int i2, EnumC117804jo enumC117804jo, int i3) {
        String str4;
        String str5 = str2;
        String str6 = str;
        String str7 = str3;
        int i4 = i;
        int i5 = i2;
        EnumC117804jo uploadState = enumC117804jo;
        if ((i3 & 1) != 0) {
            str6 = c117844js.LIZ;
        }
        VEUtils.VEVideoFileInfo vEVideoFileInfo = null;
        if ((i3 & 2) != 0) {
            str4 = c117844js.LIZIZ;
        } else {
            str4 = null;
        }
        if ((i3 & 4) != 0) {
            str5 = c117844js.LIZJ;
        }
        if ((i3 & 8) != 0) {
            str7 = c117844js.LIZLLL;
        }
        if ((i3 & 16) != 0) {
            i4 = c117844js.LJ;
        }
        if ((i3 & 32) != 0) {
            i5 = c117844js.LJFF;
        }
        if ((i3 & 64) != 0) {
            uploadState = c117844js.LJI;
        }
        if ((i3 & 128) != 0) {
            vEVideoFileInfo = c117844js.LJII;
        }
        c117844js.getClass();
        o.LJIIIZ(uploadState, "uploadState");
        return new C117844js(str6, str4, str5, str7, i4, i5, uploadState, vEVideoFileInfo);
    }
}
