package X;

import android.app.Activity;
import android.content.Context;
import android.webkit.PermissionRequest;
import com.bytedance.bpea.cert.token.TokenCert;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS114S0300000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.Nx1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61011Nx1 {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(PermissionRequest request, NK2 nk2, boolean z, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(request, "request");
        C34K c34k = new C34K();
        c34k.element = z;
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ != null) {
            C61100NyS LIZ2 = C61099NyR.LIZIZ.LIZIZ(LJIIIIZZ, TokenCert.Companion.with("bpea-third_ad_landing_page")).LIZ("android.permission.CAMERA");
            LIZ2.LIZ(new C61012Nx2(LJIIIIZZ, request, nk2, interfaceC88472Yns, c34k));
            LIZ2.LIZJ(new C61010Nx0(LJIIIIZZ, request, nk2, interfaceC88472Yns, c34k));
        }
    }

    public static void LIZIZ(Context context, PermissionRequest permissionRequest, NK2 nk2, boolean z, InterfaceC88472Yns interfaceC88472Yns) {
        if (z) {
            String[] strArr = {"android.webkit.resource.VIDEO_CAPTURE"};
            if (new C03880Dg(2).LIZJ(102605, "android/webkit/PermissionRequest", "grant", permissionRequest, new Object[]{strArr}, "void", new C65300Pk0(false, "([Ljava/lang/String;)V", "4464863876073654863")).LIZ) {
                return;
            }
            permissionRequest.grant(strArr);
            return;
        }
        C26227ARb LIZLLL = KMP.LIZLLL(context, R.string.b9o, R.string.b9n);
        UC0.LIZJ(LIZLLL, new AqS114S0300000_10(permissionRequest, (PermissionRequest) interfaceC88472Yns, (InterfaceC88472Yns<? super Boolean, C76800UCe>) nk2, (NK2) 34));
        LIZLLL.LJII = false;
        LIZLLL.LJI().LIZLLL();
    }
}
