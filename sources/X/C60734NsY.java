package X;

import Y.ARunnableS9S1200000_10;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.lynx.tasm.TemplateBundle;
import kotlin.jvm.internal.o;

/* renamed from: X.NsY, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60734NsY extends AbstractC65781Prl implements InterfaceC88472Yns<C61295O3v, C76800UCe> {
    public final /* synthetic */ C60726NsQ LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ C68322mC LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C60734NsY(C60726NsQ c60726NsQ, long j, C68322mC c68322mC, String str) {
        super(1);
        this.LJLIL = c60726NsQ;
        this.LJLILLLLZI = j;
        this.LJLJI = c68322mC;
        this.LJLJJI = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C61295O3v c61295O3v) {
        String filePath;
        HybridSchemaParam hybridSchemaParam;
        TemplateBundle templateBundle;
        C60735NsZ c60735NsZ;
        C61295O3v it = c61295O3v;
        o.LJIIJ(it, "it");
        if (it.LJZL) {
            C60606NqU c60606NqU = this.LJLIL.LJLJI;
            if (c60606NqU != null && (c60735NsZ = c60606NqU.LJII) != null) {
                c60735NsZ.LJI(it);
            }
            C60728NsS c60728NsS = this.LJLIL.LJLJLJ;
            if (c60728NsS != null) {
                c60728NsS.LJIIJJI = Long.valueOf(System.currentTimeMillis() - this.LJLILLLLZI);
                c60728NsS.LIZ = Boolean.valueOf(it.LLFF);
            }
            long currentTimeMillis = System.currentTimeMillis();
            byte[] S = it.S();
            long currentTimeMillis2 = System.currentTimeMillis();
            if (S == null) {
                this.LJLIL.LJIILJJIL(it, 205, "forest load succeeded but null bytes");
            } else {
                C60606NqU c60606NqU2 = this.LJLIL.LJLJI;
                if (c60606NqU2 != null && c60606NqU2.LJIJJLI) {
                    long currentTimeMillis3 = System.currentTimeMillis();
                    this.LJLIL.LJIILL(S);
                    FD5.LJII("hybrid_log_report", C113554cx.LJJL(new OSZ(WM7.SCENE_SERVICE, "extra_info"), new OSZ("duration", C44847Hit.LIZ(currentTimeMillis3))));
                }
                C60905NvJ.LJFF((String) this.LJLJI.element, this.LJLIL.getHybridContext().templateResData, it, this.LJLILLLLZI, currentTimeMillis2, false);
                if (C60726NsQ.LJZL) {
                    filePath = it.LJZI.getUrl();
                    if (filePath.length() == 0) {
                        if (C96Q.LIZ(it.LJZI.getGeckoModel().LJLILLLLZI) && C96Q.LIZ(it.LJZI.getGeckoModel().LJLJI)) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("lynxview://");
                            LIZ.append(it.LJZI.getGeckoModel().LJLILLLLZI);
                            LIZ.append('/');
                            LIZ.append(it.LJZI.getGeckoModel().LJLJI);
                            filePath = X1D.LIZIZ(LIZ);
                        } else {
                            filePath = this.LJLJJI;
                        }
                    }
                } else {
                    if (o.LJ(it.LLD, "cdn")) {
                        filePath = it.getFilePath();
                        if (filePath == null) {
                            filePath = it.LJZI.getUrl();
                        }
                    } else {
                        filePath = it.getFilePath();
                    }
                    if (filePath == null) {
                        filePath = this.LJLJJI;
                    }
                }
                C60606NqU c60606NqU3 = this.LJLIL.LJLJI;
                if (c60606NqU3 != null && c60606NqU3.LJIJI && c60606NqU3.LJIILLIIL) {
                    if (c60606NqU3.LJJIIZ == null) {
                        c60606NqU3.LJJIIZ = TemplateBundle.LIZ(S);
                    }
                    C60726NsQ c60726NsQ = this.LJLIL;
                    C60606NqU c60606NqU4 = c60726NsQ.LJLJI;
                    if (c60606NqU4 != null && (templateBundle = c60606NqU4.LJJIIZ) != null) {
                        templateBundle.LIZJ(K1O.LIZ(c60726NsQ.getHybridContext(), this.LJLJJI));
                    }
                    C39048FUe.LIZIZ(C39048FUe.LIZIZ, "enable pre code cache", null, "PreCodeCache", 2);
                    FD5.LJIIIZ(this.LJLIL.getHybridContext().containerId, "lynx_precodecache", "use", null, this.LJLJJI, this.LJLIL.getHybridContext().bid, null, null, 200);
                }
                C60606NqU c60606NqU5 = this.LJLIL.LJLJI;
                if (c60606NqU5 != null && (hybridSchemaParam = c60606NqU5.LJIILJJIL) != null && hybridSchemaParam.getParallelFetchResource()) {
                    C61325O4z.LJFF(new ARunnableS9S1200000_10(S, this, filePath, 9));
                } else {
                    this.LJLIL.LJIILIIL(filePath, S);
                }
                long currentTimeMillis4 = System.currentTimeMillis();
                FD5.LIZJ(currentTimeMillis4, this.LJLIL.getHybridContext().containerId, "prepare_template_end");
                this.LJLIL.getHybridContext().LIZIZ(C60728NsS.class);
                C60728NsS c60728NsS2 = this.LJLIL.LJLJLJ;
                if (c60728NsS2 != null) {
                    c60728NsS2.LJI = Long.valueOf(currentTimeMillis4 - currentTimeMillis);
                }
            }
        } else {
            this.LJLIL.LJIILJJIL(it, 204, "forest load failed");
        }
        return C76800UCe.LIZ;
    }
}
