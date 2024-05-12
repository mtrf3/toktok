package X;

import com.ss.mediakit.medialoader.IAVMDLLibraryLoader;
import com.ss.ttvideoengine.DataLoaderHelper;

/* renamed from: X.IoC, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47724IoC implements IAVMDLLibraryLoader {
    public final /* synthetic */ DataLoaderHelper LIZ;

    public C47724IoC(DataLoaderHelper dataLoaderHelper) {
        this.LIZ = dataLoaderHelper;
    }

    @Override // com.ss.mediakit.medialoader.IAVMDLLibraryLoader
    public final boolean loadLibrary(String str) {
        this.LIZ.getClass();
        C47573Ill c47573Ill = this.LIZ.LIZ;
        if (c47573Ill != null) {
            c47573Ill.loadLibrary(str);
            return false;
        }
        return false;
    }
}
