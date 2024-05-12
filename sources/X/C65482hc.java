package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.2hc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65482hc implements InterfaceC65462ha<C64492g1> {
    public final /* synthetic */ InterfaceC65462ha LJLIL;
    public final /* synthetic */ InterfaceC65784Pro LJLILLLLZI = null;
    public final /* synthetic */ C203827zG LJLJI;
    public final /* synthetic */ Aweme LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ int LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ boolean LJLJLJ;
    public final /* synthetic */ long LJLJLLL;

    @Override // X.InterfaceC65462ha
    public final Object collect(InterfaceC64672gJ<? super C64492g1> interfaceC64672gJ, InterfaceC67352kd interfaceC67352kd) {
        Object collect = this.LJLIL.collect(new C203767zA(interfaceC64672gJ, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL), interfaceC67352kd);
        if (collect == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return collect;
        }
        return C76800UCe.LIZ;
    }

    public C65482hc(InterfaceC65462ha interfaceC65462ha, C203827zG c203827zG, Aweme aweme, String str, int i, String str2, boolean z, long j) {
        this.LJLIL = interfaceC65462ha;
        this.LJLJI = c203827zG;
        this.LJLJJI = aweme;
        this.LJLJJL = str;
        this.LJLJJLL = i;
        this.LJLJL = str2;
        this.LJLJLJ = z;
        this.LJLJLLL = j;
    }
}
