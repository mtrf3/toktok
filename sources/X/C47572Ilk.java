package X;

import com.ss.ttvideoengine.DataLoaderHelper;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;

/* renamed from: X.Ilk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47572Ilk implements InterfaceC47584Ilw {
    public final /* synthetic */ DataLoaderHelper LIZ;

    public C47572Ilk(DataLoaderHelper dataLoaderHelper) {
        this.LIZ = dataLoaderHelper;
    }

    @Override // X.InterfaceC47584Ilw
    public final void LIZ(int i, int i2, int i3) {
        if (i != 0) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("access changed, from: ");
        LIZ.append(i2);
        LIZ.append(" to: ");
        LIZ.append(i3);
        TTVideoEngineLog.d("DataLoaderHelper", X1D.LIZIZ(LIZ));
        DataLoaderHelper dataLoaderHelper = this.LIZ;
        dataLoaderHelper.LJJIIJ = i3;
        dataLoaderHelper.LJJJ(1000, 1);
        this.LIZ.LJJJ(1104, i3);
    }
}
