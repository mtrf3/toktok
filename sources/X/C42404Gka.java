package X;

import com.ss.android.ugc.aweme.feedback.runtime.behavior.RuntimeBehaviorServiceImpl;
import java.io.File;
import java.util.List;

/* renamed from: X.Gka, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42404Gka implements InterfaceC47650In0 {
    public final /* synthetic */ AbstractC42411Gkh LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ List<String> LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ String LJ;

    @Override // X.InterfaceC47650In0
    public final void onFailed() {
        C42403GkZ.LIZ(this.LIZJ, this.LIZLLL, this.LJ, this.LIZ);
    }

    @Override // X.InterfaceC47650In0
    public final void onSuccess(String str) {
        File file = new File(str);
        RuntimeBehaviorServiceImpl.LJ().LIZ("download_success");
        AbstractC42411Gkh abstractC42411Gkh = this.LIZ;
        if (abstractC42411Gkh != null) {
            abstractC42411Gkh.LIZLLL();
        }
        AbstractC42411Gkh abstractC42411Gkh2 = this.LIZ;
        if (abstractC42411Gkh2 != null) {
            abstractC42411Gkh2.LIZJ(100, file.length(), file.length());
        }
        AbstractC42411Gkh abstractC42411Gkh3 = this.LIZ;
        if (abstractC42411Gkh3 != null) {
            abstractC42411Gkh3.LJ("local", this.LIZIZ);
        }
    }

    public C42404Gka(C42395GkR c42395GkR, String str, String str2, String str3, List list) {
        this.LIZ = c42395GkR;
        this.LIZIZ = str;
        this.LIZJ = list;
        this.LIZLLL = str2;
        this.LJ = str3;
    }
}
