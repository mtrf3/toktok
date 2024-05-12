package X;

import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.LynxPerfMetric;
import com.lynx.tasm.LynxViewClient;
import java.lang.ref.WeakReference;

/* renamed from: X.VLy, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79602VLy extends LynxViewClient {
    public final VN8 LIZ;

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJ() {
        this.LIZ.LIZJ();
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJII() {
        this.LIZ.LJ();
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIIJJI() {
        this.LIZ.LJI();
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJJIFFI() {
        this.LIZ.LJIIJ();
    }

    public C79602VLy(WeakReference<VNS> weakReference) {
        this.LIZ = new VN8(VMB.LJLLLL.LIZ(weakReference.get()));
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LIZJ(java.util.Map<String, ? extends Object> map) {
        this.LIZ.LIZIZ(map);
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJI(LynxPerfMetric lynxPerfMetric) {
        VN8 vn8 = this.LIZ;
        C79601VLx c79601VLx = new C79601VLx();
        c79601VLx.LJLILLLLZI = lynxPerfMetric.getFirsPageLayout();
        c79601VLx.LJLJI = lynxPerfMetric.getFirsPageLayout();
        c79601VLx.LJLJJI = lynxPerfMetric.getTti();
        c79601VLx.LJLJJL = lynxPerfMetric.getLayout();
        c79601VLx.LJLJJLL = lynxPerfMetric.getDiffRootCreate();
        c79601VLx.LJLJL = lynxPerfMetric.getDiffSameRoot();
        c79601VLx.LJLJLJ = lynxPerfMetric.getTasmEndDecodeFinishLoadTemplate();
        c79601VLx.LJLJLLL = lynxPerfMetric.getTasmBinaryDecode();
        c79601VLx.LJLL = lynxPerfMetric.getTasmFinishLoadTemplate();
        c79601VLx.LJLLI = lynxPerfMetric.getRenderPage();
        c79601VLx.LJLLJ = lynxPerfMetric.toJSONObject();
        vn8.LIZLLL(c79601VLx);
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIIIZ(JavaOnlyMap javaOnlyMap) {
        this.LIZ.LJFF(javaOnlyMap);
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIILL(String str) {
        this.LIZ.LJII(str);
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIJ(LynxError lynxError) {
        VN8 vn8 = this.LIZ;
        VM0 vm0 = new VM0();
        vm0.LJLILLLLZI = "lynx_error";
        vm0.LJLJI = lynxError.LIZ;
        vm0.LJLJJI = lynxError.LIZ();
        vn8.LJIIIIZZ(vm0);
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJJ(java.util.Set<String> set) {
        this.LIZ.LIZ();
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJJI(VMD vmd) {
        this.LIZ.LJIIIZ(vmd);
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJJIIZ(LynxPerfMetric lynxPerfMetric) {
        this.LIZ.LJIILIIL(lynxPerfMetric);
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void onTimingSetup(java.util.Map<String, Object> map) {
        this.LIZ.LJIIJJI(map);
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJJIIJ(String str, java.util.Map map, java.util.Map map2) {
        this.LIZ.LJIIL(map);
    }
}
