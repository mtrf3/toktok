package X;

import com.ss.mediakit.medialoader.AVMDLCopyOperationListener;
import com.ss.mediakit.medialoader.AVMDLFileInfo;
import com.ss.ttvideoengine.DataLoaderHelper;

/* renamed from: X.Idp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47081Idp implements AVMDLCopyOperationListener {
    public final /* synthetic */ C47080Ido LIZ;

    @Override // com.ss.mediakit.medialoader.AVMDLCopyOperationListener
    public final void onFileInfo(AVMDLFileInfo aVMDLFileInfo) {
        InterfaceC47099Ie7 interfaceC47099Ie7 = this.LIZ.LIZIZ;
        if (interfaceC47099Ie7 != null) {
            new C47729IoH();
            long j = aVMDLFileInfo.mContentLenght;
            long j2 = aVMDLFileInfo.mCacheSize;
            InterfaceC47084Ids interfaceC47084Ids = ((C47079Idn) interfaceC47099Ie7).LIZ;
            if (interfaceC47084Ids != null) {
                interfaceC47084Ids.LJIIJ(j, j2);
            }
        }
    }

    public C47081Idp(DataLoaderHelper dataLoaderHelper, C47080Ido c47080Ido) {
        this.LIZ = c47080Ido;
    }

    @Override // com.ss.mediakit.medialoader.AVMDLCopyOperationListener
    public final void onCopyComplete(boolean z, int i, String str) {
        InterfaceC47084Ids interfaceC47084Ids;
        InterfaceC47099Ie7 interfaceC47099Ie7 = this.LIZ.LIZIZ;
        if (interfaceC47099Ie7 != null && (interfaceC47084Ids = ((C47079Idn) interfaceC47099Ie7).LIZ) != null) {
            interfaceC47084Ids.LJIILIIL(z, str);
        }
    }
}
