package X;

import com.ss.android.ugc.aweme.ecommerce.mall.lynxhome.ui.ShopMainLynxAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.M0l, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56111M0l extends M19 {
    public final /* synthetic */ ShopMainLynxAssem LJLJI;

    @Override // X.AbstractC60673NrZ
    public final void LJJJJLL() {
        C36746EbW.LIZ(3, "ShopTabV3 SparkLifeCycle onPreKitCreate");
        C56092Lzs.LJIIJJI(C56092Lzs.LIZ, EnumC56115M0p.STAGE_SPARK_PREKIT_CREATE.getStage(), System.currentTimeMillis() - M0M.LIZ, M0M.LIZJ, 4);
        this.LJLJI.v3().LJLILLLLZI.LJLJLLL.add(EnumC56110M0k.SPARK_ON_PREKIT_CREATE);
    }

    public C56111M0l(ShopMainLynxAssem shopMainLynxAssem) {
        this.LJLJI = shopMainLynxAssem;
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        o.LJIIIZ(view, "view");
        C36746EbW.LIZ(3, "ShopTabV3 SparkLifeCycle onLoadFinish");
        C56092Lzs c56092Lzs = C56092Lzs.LIZ;
        String stage = EnumC56115M0p.STAGE_SPARK_LOAD_FINISH.getStage();
        long currentTimeMillis = System.currentTimeMillis() - M0M.LIZ;
        boolean z = !this.LJLILLLLZI;
        boolean z2 = M0M.LIZJ;
        c56092Lzs.getClass();
        C56092Lzs.LJIIJ(stage, currentTimeMillis, z, z2, null);
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJLI(InterfaceC60761Nsz interfaceC60761Nsz) {
        C36746EbW.LIZ(3, "ShopTabV3 SparkLifeCycle onPostKitCreated");
        C56092Lzs.LJIIJJI(C56092Lzs.LIZ, EnumC56115M0p.STAGE_SPARK_POSTKIT_CREATED.getStage(), System.currentTimeMillis() - M0M.LIZ, M0M.LIZJ, 4);
        this.LJLJI.v3().LJLILLLLZI.LJLJLLL.add(EnumC56110M0k.SPARK_ON_POSTKIT_CREATED);
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJZ(EnumC39924Flg kitType) {
        o.LJIIIZ(kitType, "kitType");
        C36746EbW.LIZ(3, "ShopTabV3 SparkLifeCycle onRuntimeReady");
        C56092Lzs.LJIIJJI(C56092Lzs.LIZ, EnumC56115M0p.STAGE_SPARK_RUNTIME_READY.getStage(), System.currentTimeMillis() - M0M.LIZ, M0M.LIZJ, 4);
    }

    @Override // X.M19, X.AbstractC60673NrZ
    public final void LJJJJJL(InterfaceC60761Nsz view, String url) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJJL(view, url);
        C36746EbW.LIZ(3, "ShopTabV3 SparkLifeCycle onLoadStart");
        this.LJLILLLLZI = false;
        C56092Lzs.LJIIJJI(C56092Lzs.LIZ, EnumC56115M0p.STAGE_SPARK_LOAD_START.getStage(), System.currentTimeMillis() - M0M.LIZ, M0M.LIZJ, 4);
    }

    @Override // X.M19, X.AbstractC60673NrZ
    public final void LJJJJIZL(InterfaceC60761Nsz view, String url, C60704Ns4 c60704Ns4) {
        String str;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJIZL(view, url, c60704Ns4);
        C36746EbW.LIZ(3, "LynxDataUpdate");
        C36746EbW.LIZ(3, "ShopTabV3 SparkLifeCycle onLoadFailed");
        this.LJLJI.getClass();
        M0M.LIZJ = true;
        this.LJLILLLLZI = true;
        OSZ[] oszArr = new OSZ[2];
        Integer num = c60704Ns4.LIZ;
        String str2 = "";
        if (num == null || (str = num.toString()) == null) {
            str = "";
        }
        oszArr[0] = new OSZ("error_code", str);
        String str3 = c60704Ns4.LIZIZ;
        if (str3 != null) {
            str2 = str3;
        }
        oszArr[1] = new OSZ("error_msg", str2);
        java.util.Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
        C56092Lzs c56092Lzs = C56092Lzs.LIZ;
        String stage = EnumC56115M0p.STAGE_SPARK_LOAD_FAILED.getStage();
        long currentTimeMillis = System.currentTimeMillis() - M0M.LIZ;
        boolean z = M0M.LIZJ;
        c56092Lzs.getClass();
        C56092Lzs.LJIIJ(stage, currentTimeMillis, false, z, LJJLIIIIJ);
        C56092Lzs.LJIIIZ(false);
        this.LJLJI.v3().LJLILLLLZI.LJLJLLL.clear();
        M0L m0l = this.LJLJI.v3().LJLILLLLZI;
        EnumC56062LzO enumC56062LzO = EnumC56062LzO.TEMPLATE_ERROR_RETRY;
        m0l.getClass();
        o.LJIIIZ(enumC56062LzO, "<set-?>");
        m0l.LJLIL = enumC56062LzO;
        ShopMainLynxAssem shopMainLynxAssem = this.LJLJI;
        shopMainLynxAssem.getClass();
        C36746EbW.LIZ(3, "ShopTabV3 ErrorView setLynxErrorView LynxAssem");
        shopMainLynxAssem.v3().setState(C56122M0w.LJLIL);
    }
}
