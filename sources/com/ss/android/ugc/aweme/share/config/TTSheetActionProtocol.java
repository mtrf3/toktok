package com.ss.android.ugc.aweme.share.config;

import X.C62394OeE;
import X.InterfaceC62383Oe3;
import X.InterfaceC62486Ofi;
import com.ss.android.ugc.aweme.share.ShareExtServiceImpl;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.core.protocol.SheetActionProtocol;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class TTSheetActionProtocol implements SheetActionProtocol {
    @Override // com.ss.android.ugc.aweme.share.core.protocol.SheetActionProtocol
    public InterfaceC62383Oe3 s1() {
        return null;
    }

    public final Comparator<InterfaceC62486Ofi> LIZJ() {
        return ShareExtServiceImpl.LJJLIIJ().LJJIIZI();
    }

    public TTSheetActionProtocol(BaseSharePackage baseSharePackage) {
    }

    @Override // X.InterfaceC62570Oh4
    public final void LIZ(C62394OeE c62394OeE) {
        BaseSharePackage baseSharePackage = c62394OeE.LJIIZILJ;
        if (baseSharePackage != null) {
            List<InterfaceC62486Ofi> actions = r(baseSharePackage);
            o.LJIIIZ(actions, "actions");
            c62394OeE.LIZJ.addAll(actions);
        }
        c62394OeE.LJJIIJZLJL = false;
        Comparator<InterfaceC62486Ofi> LIZJ = LIZJ();
        if (LIZJ != null) {
            c62394OeE.LIZ(LIZJ);
        }
    }

    @Override // com.ss.android.ugc.aweme.share.core.protocol.SheetActionProtocol
    public List<InterfaceC62486Ofi> r(BaseSharePackage baseSharePackage) {
        return new ArrayList();
    }
}
