package X;

import com.ss.mediakit.medialoader.IAVMDLLibraryLoader;
import com.ss.ttvideoengine.DataLoaderHelper;

/* renamed from: X.IoF, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47727IoF implements IAVMDLLibraryLoader {
    public final /* synthetic */ DataLoaderHelper LIZ;

    public C47727IoF(DataLoaderHelper dataLoaderHelper) {
        this.LIZ = dataLoaderHelper;
    }

    @Override // com.ss.mediakit.medialoader.IAVMDLLibraryLoader
    public final boolean loadLibrary(String str) {
        return this.LIZ.LIZ.loadLibrary(str);
    }
}
