package X;

import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.effectmanager.DownloadableModelSupportLibraryLoader;

/* loaded from: classes16.dex */
public final class XFU implements DownloadableModelSupportLibraryLoader {
    public final /* synthetic */ XFV LIZ;

    public XFU(XFV xfv) {
        this.LIZ = xfv;
    }

    @Override // com.ss.android.ugc.effectmanager.DownloadableModelSupportLibraryLoader
    public final void loadLibrary(String str) {
        Librarian.LJFF(this.LIZ.LIZ, str);
    }
}
