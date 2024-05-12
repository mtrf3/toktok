package X;

import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.Hjh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44897Hjh implements InterfaceC43172Gwy {
    public final /* synthetic */ InterfaceC44899Hjj LIZ;
    public final /* synthetic */ Aweme LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ C43170Gww LIZLLL;

    @Override // X.InterfaceC43172Gwy
    public final /* synthetic */ void LJ(android.net.Uri uri) {
    }

    @Override // X.InterfaceC43172Gwy
    public final void LIZ() {
        InterfaceC44899Hjj interfaceC44899Hjj = this.LIZ;
        if (interfaceC44899Hjj != null) {
            interfaceC44899Hjj.LIZ();
        }
    }

    @Override // X.InterfaceC43172Gwy
    public final void LIZIZ() {
        InterfaceC44899Hjj interfaceC44899Hjj = this.LIZ;
        if (interfaceC44899Hjj != null) {
            interfaceC44899Hjj.LIZIZ();
        }
        C225298sn.LIZ(1, 1, this.LIZIZ, this.LIZJ);
        C225298sn.LIZIZ(this.LIZIZ, 1, C77275UUl.LJ(1));
        C44896Hjg.LJIJJLI = false;
    }

    @Override // X.InterfaceC43172Gwy
    public final void onCancel() {
        InterfaceC44899Hjj interfaceC44899Hjj = this.LIZ;
        if (interfaceC44899Hjj != null) {
            interfaceC44899Hjj.onCancel();
        }
        C225298sn.LIZ(1, 1, this.LIZIZ, this.LIZJ);
        C225298sn.LIZIZ(this.LIZIZ, 1, C77275UUl.LJ(1));
        C44896Hjg.LJIJJLI = false;
    }

    @Override // X.InterfaceC43172Gwy
    public final void LIZJ(String str) {
        C225298sn.LIZ(1, 1, this.LIZIZ, this.LIZJ);
        InterfaceC44899Hjj interfaceC44899Hjj = this.LIZ;
        if (interfaceC44899Hjj != null) {
            int i = C44896Hjg.LIZLLL;
            String str2 = C44896Hjg.LIZJ;
            C43170Gww c43170Gww = this.LIZLLL;
            interfaceC44899Hjj.LIZJ(str, i, str2, c43170Gww.LIZIZ, c43170Gww.LIZJ);
        }
        C44896Hjg.LJIJJLI = false;
    }

    @Override // X.InterfaceC43172Gwy
    public final void LIZLLL(DownloadInfo info) {
        o.LJIIIZ(info, "info");
        C225298sn.LIZJ(1, 1, this.LIZIZ);
        InterfaceC44899Hjj interfaceC44899Hjj = this.LIZ;
        if (interfaceC44899Hjj != null) {
            interfaceC44899Hjj.LIZ();
        }
    }

    @Override // X.InterfaceC43172Gwy
    public final void onProgress(int i) {
        InterfaceC44899Hjj interfaceC44899Hjj = this.LIZ;
        if (interfaceC44899Hjj != null) {
            interfaceC44899Hjj.onProgress(i);
        }
    }

    public C44897Hjh(C45374HrO c45374HrO, Aweme aweme, String str, C43170Gww c43170Gww) {
        this.LIZ = c45374HrO;
        this.LIZIZ = aweme;
        this.LIZJ = str;
        this.LIZLLL = c43170Gww;
    }
}
