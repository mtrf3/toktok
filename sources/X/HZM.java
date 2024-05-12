package X;

import com.ss.android.ugc.aweme.filter.FilterBean;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HZM implements WRX, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJI;
    public final C82622Wbi LJLIL;
    public final C82632Wbs LJLILLLLZI;

    static {
        TBT tbt = new TBT(HZM.class, "tikTokCameraApiComponent", "getTikTokCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJI = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.WRX
    public final WRQ R4() {
        return (WRQ) this.LJLILLLLZI.LIZ(this, LJLJI[0]);
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public HZM(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = UCI.LJI(diContainer, WRQ.class, null);
    }

    @Override // X.WRX
    public final void Q4(FilterBean filterBean) {
        ((WRQ) this.LJLILLLLZI.LIZ(this, LJLJI[0])).Q4(filterBean);
    }

    @Override // X.WRX
    public final void a1(FilterBean filterBean, Float f) {
        o.LJIIIZ(filterBean, "filterBean");
        ((WRQ) this.LJLILLLLZI.LIZ(this, LJLJI[0])).a1(filterBean, f);
    }
}
