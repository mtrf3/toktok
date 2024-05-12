package X;

import com.ss.android.ugc.aweme.share.core.ui.campaign.SharingOperationConfig;

/* renamed from: X.OjL, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC62711OjL implements InterfaceC62733Ojh {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;

    @Override // X.InterfaceC62733Ojh
    public final C5D4 LIZLLL() {
        String str;
        String str2 = this.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        SharingOperationConfig LIZ2 = C62285OcT.LIZ();
        if (LIZ2 != null) {
            str = LIZ2.operationTemplateResourcePrefix;
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(this.LIZ);
        LIZ.append("_");
        LIZ.append(this.LIZIZ);
        LIZ.append("_");
        YE1.LIZLLL(LIZ, this.LIZJ, "_", str2, "_");
        return new C5D4(JBR.LJFF(LIZ, this.LJ, ".png", LIZ), this.LIZLLL);
    }

    public AbstractC62711OjL(String str, String str2, String str3, String str4, String str5) {
        C43588H8u.LIZLLL(str, "campaignId", str2, "templateId", str3, "campaignTagId", str4, "coverUrl");
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
    }
}
