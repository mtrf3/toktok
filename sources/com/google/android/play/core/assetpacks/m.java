package com.google.android.play.core.assetpacks;

import X.C40579FwF;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;

/* loaded from: classes7.dex */
public final class m extends l<ParcelFileDescriptor> {
    public m(q qVar, C40579FwF c40579FwF) {
        super(qVar, c40579FwF);
    }

    @Override // com.google.android.play.core.assetpacks.l, X.InterfaceC40618Fws
    public final void LLFII(Bundle bundle, Bundle bundle2) {
        super.LLFII(bundle, bundle2);
        this.LJLIL.LIZJ(bundle.getParcelable("chunk_file_descriptor"));
    }
}
