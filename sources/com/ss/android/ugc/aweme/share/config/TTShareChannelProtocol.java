package com.ss.android.ugc.aweme.share.config;

import X.C44498HdG;
import X.C62394OeE;
import X.InterfaceC62225ObV;
import X.InterfaceC62382Oe2;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ShareExtServiceImpl;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol;
import com.ss.android.ugc.aweme.share.improve.channel.ImChannel;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class TTShareChannelProtocol implements ShareChannelProtocol {
    public final BaseSharePackage LJLIL;
    public final Comparator<InterfaceC62225ObV> LJLILLLLZI;

    @Override // com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol
    public InterfaceC62382Oe2 P1() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol
    public List<InterfaceC62225ObV> g1() {
        List<InterfaceC62225ObV> LJJJJIZL = ShareExtServiceImpl.LJJLIIJ().LJJJJIZL(this.LJLIL.shareContentTypes);
        if (ShareExtServiceImpl.LJJLIIJ().LJIJJ() && (this.LJLIL instanceof SharePackage)) {
            ShareDependService.LIZ.getClass();
            ImChannel LJJIJIIJI = C44498HdG.LIZ().LJJIJIIJI((SharePackage) this.LJLIL, "");
            if (LJJIJIIJI != null) {
                LJJJJIZL.add(LJJIJIIJI);
            }
        }
        return LJJJJIZL;
    }

    public TTShareChannelProtocol(BaseSharePackage baseSharePackage) {
        this.LJLIL = baseSharePackage;
        this.LJLILLLLZI = ShareExtServiceImpl.LJJLIIJ().LJJLIIIJJI(baseSharePackage);
    }

    @Override // X.InterfaceC62570Oh4
    public final void LIZ(C62394OeE c62394OeE) {
        List<InterfaceC62225ObV> channels = g1();
        o.LJIIIZ(channels, "channels");
        c62394OeE.LIZ.addAll(channels);
        Comparator<InterfaceC62225ObV> comparator = this.LJLILLLLZI;
        if (comparator != null) {
            c62394OeE.LJFF(comparator);
        }
        c62394OeE.LJFF(c62394OeE.LJIIIZ);
    }
}
