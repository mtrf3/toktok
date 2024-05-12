package X;

import Y.ARunnableS50S0100000_14;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WRr, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C82299WRr extends AbstractC29891Fh<InterfaceC82302WRu> implements InterfaceC135635Tz, InterfaceC82302WRu {
    public static final /* synthetic */ InterfaceC74236TBo[] LJLJJLL;
    public final InterfaceC115514g7 LJLIL;
    public final C5H3 LJLILLLLZI;
    public final WMH LJLJI;
    public final C82622Wbi LJLJJI;
    public final int LJLJJL;

    static {
        TBT tbt = new TBT(C82299WRr.class, "filterApiComponent", "getFilterApiComponent()Lcom/bytedance/creativex/recorder/filter/api/FilterApiComponent;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJJLL = new InterfaceC74236TBo[]{tbt};
    }

    public InterfaceC82302WRu LJJLIIIIJ() {
        return this;
    }

    public final C82300WRs LJJLIIIJILLIZJL() {
        return (C82300WRs) this.LJLILLLLZI.getValue();
    }

    public final WRP getFilterApiComponent() {
        return (WRP) this.LJLIL.LIZ(this, LJLJJLL[0]);
    }

    public C82300WRs LJJLI() {
        return new C82300WRs();
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        this.LJLJI.add(this.LJLJJL, LJJLIIIJILLIZJL(), "FilterSwipeIndicatorScene");
        this.LJLJI.mView.postDelayed(new ARunnableS50S0100000_14(this, 14), 100L);
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC82302WRu getApiComponent() {
        LJJLIIIIJ();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLJJI;
    }

    public C82299WRr(WMH parentScene, C82622Wbi diContainer, int i) {
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLJI = parentScene;
        this.LJLJJI = diContainer;
        this.LJLJJL = i;
        this.LJLIL = UCI.LJII(getDiContainer(), WRP.class, null);
        this.LJLILLLLZI = C221108m2.LIZ(EnumC221088m0.NONE, new AqS164S0100000_14(this, 39));
    }
}
