package X;

import com.ss.android.ugc.aweme.feedback.runtime.behavior.RuntimeBehaviorServiceImpl;
import java.io.File;
import java.util.List;

/* renamed from: X.Gkq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42420Gkq implements InterfaceC47650In0 {
    public final /* synthetic */ AbstractC42414Gkk LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ List<String> LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ String LJ;

    @Override // X.InterfaceC47650In0
    public final void onFailed() {
        C42418Gko.LIZIZ(this.LIZJ, this.LIZLLL, this.LJ, this.LIZ);
    }

    @Override // X.InterfaceC47650In0
    public final void onSuccess(String str) {
        File file = new File(str);
        RuntimeBehaviorServiceImpl.LJ().LIZ("download_success");
        AbstractC42414Gkk abstractC42414Gkk = this.LIZ;
        if (abstractC42414Gkk != null) {
            abstractC42414Gkk.LIZIZ = System.currentTimeMillis();
        }
        AbstractC42414Gkk abstractC42414Gkk2 = this.LIZ;
        if (abstractC42414Gkk2 != null) {
            file.length();
            file.length();
            abstractC42414Gkk2.LIZLLL(100);
        }
        AbstractC42414Gkk abstractC42414Gkk3 = this.LIZ;
        if (abstractC42414Gkk3 != null) {
            abstractC42414Gkk3.LJ("local", this.LIZIZ);
        }
    }

    public C42420Gkq(C42416Gkm c42416Gkm, String str, List list, String str2, String str3) {
        this.LIZ = c42416Gkm;
        this.LIZIZ = str;
        this.LIZJ = list;
        this.LIZLLL = str2;
        this.LJ = str3;
    }
}
