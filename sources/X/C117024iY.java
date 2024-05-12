package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.o;

/* renamed from: X.4iY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C117024iY implements InterfaceC57784Mm4 {
    public final UrlModel LJLIL;
    public final int LJLILLLLZI;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    public C117024iY(UrlModel urlModel, int i) {
        o.LJIIIZ(urlModel, "urlModel");
        this.LJLIL = urlModel;
        this.LJLILLLLZI = i;
    }
}
