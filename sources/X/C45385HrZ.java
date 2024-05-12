package X;

import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;

/* renamed from: X.HrZ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45385HrZ extends AbstractC45383HrX {
    public C45385HrZ(AbstractC44957Hkf abstractC44957Hkf) {
        super(abstractC44957Hkf);
    }

    @Override // X.AbstractC45383HrX
    public final boolean LIZ(String str, String str2, String str3) {
        if (str == null || str2 == null || str3 == null) {
            return false;
        }
        X5R with = DownloadServiceManager.INSTANCE.getDownloadService().with(str);
        with.LIZJ = str2;
        with.LJ = str3;
        with.LJIIJJI = this.LIZIZ;
        this.LIZ = with.LJ(C45389Hrd.LJLIL);
        return true;
    }
}
