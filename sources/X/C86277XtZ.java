package X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.runtime.depend.IHostPermissionDepend;
import java.io.File;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.XtZ, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86277XtZ extends AbstractC86280Xtc {
    public final String LJLJJL = "jpg";
    public final String LJLJJLL = "png";
    public final String LJLJL = "nonsupportType";
    public final String LJLJLJ = "image/jpeg";
    public final String LJLJLLL = "image/png";

    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        Context context;
        boolean z;
        String str;
        IHostPermissionDepend iHostPermissionDepend;
        InterfaceC86279Xtb interfaceC86279Xtb = (InterfaceC86279Xtb) xBaseParamModel;
        o.LJIIJ(type, "type");
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz != null && (context = interfaceC38263Ezz.getContext()) != null) {
            Activity LIZ = C37925EuX.LIZ(context);
            if (LIZ != null) {
                if (interfaceC86279Xtb.getDataURL().length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    C31626Cb8.LIZ(c37356ElM, -3, "The dataURL key is required.", 4);
                    return;
                }
                if (interfaceC86279Xtb.getExtension().length() == 0) {
                    C31626Cb8.LIZ(c37356ElM, -3, "The extension key is required.", 4);
                    return;
                }
                if (interfaceC86279Xtb.getFilename().length() == 0) {
                    C31626Cb8.LIZ(c37356ElM, -3, "The filename key is required.", 4);
                    return;
                }
                if (!ujb.o.LJJJLIIL(interfaceC86279Xtb.getDataURL(), "data:", false)) {
                    C31626Cb8.LIZ(c37356ElM, -3, "dataURL invalid", 4);
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    str = "android.permission.READ_MEDIA_IMAGES";
                } else {
                    str = "android.permission.READ_EXTERNAL_STORAGE";
                }
                C86289Xtl c86289Xtl = C86289Xtl.LJFF;
                if (c86289Xtl != null && (iHostPermissionDepend = c86289Xtl.LIZ) != null && iHostPermissionDepend.hasPermission(LIZ, str)) {
                    LJII(context, interfaceC86279Xtb, c37356ElM);
                    return;
                } else {
                    C61099NyR.LIZIZ.LIZIZ(LIZ, TokenCert.Companion.with("bpea-xsave_data_url_method_read_storage")).LIZ(str).LIZJ(new C86278Xta(this, str, context, interfaceC86279Xtb, c37356ElM));
                    return;
                }
            }
            C31626Cb8.LIZ(c37356ElM, 0, "context can not convert to activity", 4);
            return;
        }
        C31626Cb8.LIZ(c37356ElM, 0, "Context not provided in host", 4);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [T, java.lang.String] */
    public final void LJII(Context context, InterfaceC86279Xtb params, CompletionBlock<InterfaceC86281Xtd> callback) {
        String absolutePath;
        String str;
        o.LJIIJ(context, "context");
        o.LJIIJ(params, "params");
        o.LJIIJ(callback, "callback");
        String dataURL = params.getDataURL();
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = "";
        if (s.LJJJLZIJ(dataURL, ",", false)) {
            ?? r0 = (String) ListProtector.get(s.LJLJJL(dataURL, new String[]{","}, 0, 6), 1);
            c68322mC.element = r0;
            if (r0.length() == 0) {
                C31626Cb8.LIZ(callback, -3, null, 6);
                return;
            }
            String extension = params.getExtension();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(params.getFilename());
            LIZ.append('.');
            LIZ.append(extension);
            String LIZIZ = X1D.LIZIZ(LIZ);
            File LLIIIZ = C16880lQ.LLIIIZ(context);
            if (LLIIIZ == null) {
                LLIIIZ = C16880lQ.LLIIIL(context);
            }
            if (LLIIIZ != null && (absolutePath = LLIIIZ.getAbsolutePath()) != null) {
                File file = new File(absolutePath, LIZIZ);
                String absolutePath2 = file.getAbsolutePath();
                if (file.exists()) {
                    C31626Cb8.LIZ(callback, 0, "file path already exist", 4);
                    return;
                }
                if (o.LJ(extension, this.LJLJJL)) {
                    str = this.LJLJLJ;
                } else if (o.LJ(extension, this.LJLJJLL)) {
                    str = this.LJLJLLL;
                } else {
                    str = this.LJLJL;
                }
                if (o.LJ(str, this.LJLJL)) {
                    C31626Cb8.LIZ(callback, -3, null, 6);
                    return;
                }
                ExecutorService executorService = C38016Ew0.LIZ;
                o.LJFF(executorService, "TTExecutors.getNormalExecutor()");
                executorService.execute(new RunnableC86283Xtf(this, c68322mC, callback, str, absolutePath2, params, context));
                return;
            }
            C31626Cb8.LIZ(callback, 0, "cacheDir is null", 4);
            return;
        }
        C31626Cb8.LIZ(callback, -3, null, 6);
    }
}
