package X;

import android.net.Uri;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.o;

/* renamed from: X.EoT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37549EoT extends AbstractC37551EoV {
    public C37555EoZ LJLJJL;

    @Override // X.AbstractC37594EpC, X.InterfaceC37666EqM
    public final void release() {
        C37555EoZ c37555EoZ = this.LJLJJL;
        if (c37555EoZ != null) {
            c37555EoZ.release();
        }
    }

    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        SparkContext LIZIZ;
        C37555EoZ c37555EoZ;
        InterfaceC37550EoU interfaceC37550EoU = (InterfaceC37550EoU) xBaseParamModel;
        o.LJIIIZ(type, "type");
        String url = interfaceC37550EoU.getUrl();
        if (ujb.o.LJJJLIIL(url, "https", false)) {
            Uri.Builder builder = new Uri.Builder();
            builder.path("//webview/");
            builder.appendQueryParameter("url", url);
            String it = builder.build().toString();
            LIZIZ = new SparkContext();
            o.LJIIIIZZ(it, "it");
            LIZIZ.LJJIJLIJ(it);
        } else {
            LIZIZ = C42193GhB.LIZIZ(url);
        }
        SparkSchemaParam LJIIZILJ = LIZIZ.LJIIZILJ(-1);
        if (LJIIZILJ == null) {
            C31626Cb8.LIZ(c37356ElM, -3, "Parameter 'url' is required!", 4);
            return;
        }
        java.util.Map<String, Object> renderingContext = interfaceC37550EoU.getContext();
        C37358ElO c37358ElO = new C37358ElO(c37356ElM);
        C37383Eln c37383Eln = new C37383Eln(c37356ElM);
        o.LJIIJ(renderingContext, "renderingContext");
        InterfaceC37486EnS interfaceC37486EnS = (InterfaceC37486EnS) EXP.LIZIZ(InterfaceC37486EnS.class);
        if (interfaceC37486EnS == null) {
            c37383Eln.accept(new C37406EmA("No service implemented."));
        } else {
            new C60607NqV(UriProtector.parse(LJIIZILJ.getUrl())).LJIIJJI = LJIIZILJ;
            C37482EnO LIZ = interfaceC37486EnS.LIZ(LJIIZILJ.getUrl(), renderingContext, c37358ElO, new C37485EnR(c37383Eln));
            if (LIZ != null) {
                c37555EoZ = new C37555EoZ(LIZ);
                this.LJLJJL = c37555EoZ;
            }
        }
        c37555EoZ = null;
        this.LJLJJL = c37555EoZ;
    }
}
