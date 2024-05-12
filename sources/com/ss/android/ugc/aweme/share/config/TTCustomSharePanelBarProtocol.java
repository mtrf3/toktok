package com.ss.android.ugc.aweme.share.config;

import X.C62394OeE;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.sharer.protocol.CustomSharePanelBarProtocol;

/* loaded from: classes11.dex */
public class TTCustomSharePanelBarProtocol implements CustomSharePanelBarProtocol {
    @Override // com.ss.android.ugc.aweme.sharer.protocol.CustomSharePanelBarProtocol
    public boolean LLZZZIL() {
        return false;
    }

    public TTCustomSharePanelBarProtocol(BaseSharePackage baseSharePackage) {
    }

    @Override // X.InterfaceC62570Oh4
    public final void LIZ(C62394OeE c62394OeE) {
        c62394OeE.LJIJ = !LLZZZIL();
    }
}
