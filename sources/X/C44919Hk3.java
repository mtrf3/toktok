package X;

import Y.ACallableS36S1200000_7;
import Y.AgS41S1200000_7;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.ShareDependService;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.Hk3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44919Hk3 implements InterfaceC87766YcU {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ boolean LIZIZ;
    public final /* synthetic */ C44928HkC LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ Context LJ;
    public final /* synthetic */ Aweme LJFF;

    @Override // X.InterfaceC87766YcU
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC87766YcU
    public final void onCancel() {
    }

    @Override // X.InterfaceC87766YcU
    public final void onFailed() {
        ShareDependService.LIZ.getClass();
        C44498HdG.LIZ().LJIIJ(false);
        if (this.LIZIZ) {
            C44928HkC c44928HkC = this.LIZJ;
            String enterFrom = this.LIZLLL;
            o.LJIIIIZZ(enterFrom, "enterFrom");
            c44928HkC.LJIIJ(enterFrom, null);
        }
    }

    @Override // X.InterfaceC87766YcU
    public final void onStart() {
        ShareDependService.LIZ.getClass();
        C44498HdG.LIZ().LJIIJ(true);
        C44938HkM.LJIIIIZZ = "download";
    }

    @Override // X.InterfaceC87766YcU
    public final void onSuccess(String str) {
        ShareDependService.LIZ.getClass();
        C44498HdG.LIZ().LJIIJ(false);
        if (!this.LIZ) {
            C78939UyV.LJJJIL(str, new File(str).exists());
        }
        if (this.LIZIZ) {
            C44928HkC c44928HkC = this.LIZJ;
            String enterFrom = this.LIZLLL;
            o.LJIIIIZZ(enterFrom, "enterFrom");
            c44928HkC.LJIIJ(enterFrom, str);
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            if (C04330Ez.LIZ(this.LJ, "android.permission.READ_MEDIA_VIDEO") != 0 || C04330Ez.LIZ(this.LJ, "android.permission.READ_MEDIA_IMAGES") != 0) {
                C78983UzD.LJIIZILJ(new IllegalStateException("try to download video, but no permission"));
                return;
            }
        } else if (C04330Ez.LIZ(this.LJ, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            C78983UzD.LJIIZILJ(new IllegalStateException("try to download video, but no permission"));
            return;
        }
        if (C1DF.LJJIII(this.LJFF)) {
            C44928HkC c44928HkC2 = this.LIZJ;
            Context context = this.LJ;
            String enterFrom2 = this.LIZLLL;
            o.LJIIIIZZ(enterFrom2, "enterFrom");
            boolean z = this.LIZ;
            c44928HkC2.getClass();
            XKX.LIZLLL(C780334l.LJLIL, C36636EZk.LIZ, null, new C165416eP(str, c44928HkC2, context, z, enterFrom2, null), 2);
            return;
        }
        C44928HkC c44928HkC3 = this.LIZJ;
        Context context2 = this.LJ;
        String enterFrom3 = this.LIZLLL;
        o.LJIIIIZZ(enterFrom3, "enterFrom");
        boolean z2 = this.LIZ;
        c44928HkC3.getClass();
        C10K.LIZJ(new ACallableS36S1200000_7(c44928HkC3, str, context2, 0)).LJ(new AgS41S1200000_7(c44928HkC3, context2, z2, enterFrom3, 3), C10K.LJIIIIZZ, null);
    }

    public C44919Hk3(Context context, Aweme aweme, C44928HkC c44928HkC, String str, boolean z, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = c44928HkC;
        this.LIZLLL = str;
        this.LJ = context;
        this.LJFF = aweme;
    }
}
