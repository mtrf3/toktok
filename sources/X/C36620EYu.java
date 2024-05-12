package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.google.gson.m;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.api.ProductListRequestBody;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.EYu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36620EYu implements InterfaceC65104Pgq {
    public static final C36620EYu LIZ = new C36620EYu();

    @Override // X.InterfaceC65104Pgq
    public final void LIZJ(Request request) {
        o.LJIIIZ(request, "request");
    }

    @Override // X.InterfaceC65104Pgq
    public final void LJFF(C64797Pbt<?> response) {
        o.LJIIIZ(response, "response");
    }

    @Override // X.InterfaceC65104Pgq
    public final void LJII(Request request) {
        o.LJIIIZ(request, "request");
    }

    @Override // X.InterfaceC65104Pgq
    public final void onException(Throwable throwable) {
        o.LJIIIZ(throwable, "throwable");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65104Pgq
    public final void LJIIIIZZ(Request request, C64797Pbt<?> c64797Pbt, Throwable th) {
        String str;
        o.LJIIIZ(request, "request");
        if (c64797Pbt != null && c64797Pbt.LIZIZ()) {
            String path = request.getPath();
            o.LJIIIIZZ(path, "request.path");
            if (!s.LJJJLZIJ(path, "/api/shop/v1/product/list", false)) {
                return;
            }
            Response response = null;
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                TypedOutput body = request.getBody();
                o.LJIIIIZZ(body, "request.body");
                body.writeTo(byteArrayOutputStream);
                str = String.valueOf(byteArrayOutputStream);
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable unused) {
                str = null;
            }
            try {
                Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), str, C65330PkU.LIZJ(C65352Pkq.LJI(ProductListRequestBody.class)));
                if (!(fromJson instanceof ProductListRequestBody)) {
                    fromJson = null;
                }
                ProductListRequestBody productListRequestBody = (ProductListRequestBody) fromJson;
                if (productListRequestBody != null) {
                    T t = c64797Pbt.LIZIZ;
                    if (t instanceof Response) {
                        EZI.LIZ(productListRequestBody, (Response) t);
                        return;
                    }
                    if (t instanceof String) {
                        if (!o.LJ(productListRequestBody.pageName, "profile_tab_store")) {
                            return;
                        }
                        try {
                            Object fromJson2 = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), (String) t, C65330PkU.LIZJ(C65352Pkq.LJII(Response.class, C65340Pke.LIZ(C65352Pkq.LJI(m.class)))));
                            if (!(fromJson2 instanceof Response)) {
                                fromJson2 = null;
                            }
                            response = (Response) fromJson2;
                        } catch (com.google.gson.s unused2) {
                        }
                        EZI.LIZ(productListRequestBody, response);
                        return;
                    }
                    if (!(t instanceof TypedByteArray) || !o.LJ(productListRequestBody.pageName, "profile_tab_store")) {
                        return;
                    }
                    byte[] bytes = ((TypedByteArray) t).getBytes();
                    o.LJIIIIZZ(bytes, "responseBody.bytes");
                    try {
                        Object fromJson3 = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), new String(bytes, PVC.LIZ), C65330PkU.LIZJ(C65352Pkq.LJII(Response.class, C65340Pke.LIZ(C65352Pkq.LJI(m.class)))));
                        if (!(fromJson3 instanceof Response)) {
                            fromJson3 = null;
                        }
                        response = (Response) fromJson3;
                    } catch (com.google.gson.s unused3) {
                    }
                    EZI.LIZ(productListRequestBody, response);
                }
            } catch (com.google.gson.s unused4) {
            }
        }
    }
}
