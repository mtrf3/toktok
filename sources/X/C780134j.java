package X;

import com.byted.cast.common.source.ServiceInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.34j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C780134j extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ ServiceInfo LJLIL;
    public final /* synthetic */ Aweme LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C780134j(ServiceInfo serviceInfo, Aweme aweme, int i) {
        super(2);
        this.LJLIL = serviceInfo;
        this.LJLILLLLZI = aweme;
        this.LJLJI = i;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        num.intValue();
        V5G.LIZ(this.LJLIL, this.LJLILLLLZI, interfaceC24520xk, this.LJLJI | 1);
        return C76800UCe.LIZ;
    }
}
