package X;

import kotlin.jvm.internal.AqS18S0500000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WOp, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82219WOp extends C82218WOo {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLZ;
    public final InterfaceC115514g7 LJLLI;
    public final /* synthetic */ WMH LJLLILLLL;
    public final /* synthetic */ WSY LJLLJ;
    public final /* synthetic */ InterfaceC73033SlR LJLLL;
    public final /* synthetic */ InterfaceC65784Pro<Integer> LJLLLL;
    public final /* synthetic */ InterfaceC88472Yns<InterfaceC83144Wk8, InterfaceC83144Wk8> LJLLLLLL;

    static {
        TBT tbt = new TBT(C82219WOp.class, "recordAdapterComponent", "getRecordAdapterComponent()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterComponent;", 0);
        C65352Pkq.LIZ.getClass();
        LJLZ = new InterfaceC74236TBo[]{tbt};
    }

    private final WLA LJJLL() {
        return (WLA) this.LJLLI.LIZ(this, LJLZ[0]);
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        LJJLL().lk0(this);
    }

    @Override // X.C82218WOo
    public C82226WOw LJJLI(C82622Wbi objectContainer) {
        o.LJIIIZ(objectContainer, "objectContainer");
        return new C82226WOw(objectContainer, new AqS18S0500000_14(this.LJLLILLLL, (WMH) this.LJLLJ, (WSY) this.LJLLL, (InterfaceC73033SlR) this.LJLLLL, (InterfaceC65784Pro<Integer>) this.LJLLLLLL, (InterfaceC88472Yns<? super InterfaceC83144Wk8, ? extends InterfaceC83144Wk8>) 0));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C82219WOp(WMH wmh, C82622Wbi c82622Wbi, WSY wsy, InterfaceC73033SlR interfaceC73033SlR, InterfaceC65784Pro<Integer> interfaceC65784Pro, InterfaceC88472Yns<? super InterfaceC83144Wk8, ? extends InterfaceC83144Wk8> interfaceC88472Yns) {
        super(wmh, c82622Wbi, null, 4, null);
        this.LJLLILLLL = wmh;
        this.LJLLJ = wsy;
        this.LJLLL = interfaceC73033SlR;
        this.LJLLLL = interfaceC65784Pro;
        this.LJLLLLLL = interfaceC88472Yns;
        this.LJLLI = UCI.LJI(getDiContainer(), WLA.class, null);
    }
}
