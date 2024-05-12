package X;

import Y.ACallableS36S1200000_7;
import Y.AgS41S1200000_7;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.Hk4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44920Hk4 extends C44921Hk5 {
    public final /* synthetic */ boolean LIZIZ;
    public final /* synthetic */ boolean LIZJ;
    public final /* synthetic */ C44928HkC LIZLLL;
    public final /* synthetic */ String LJ;
    public final /* synthetic */ Aweme LJFF;

    @Override // X.InterfaceC43172Gwy
    public final void LIZIZ() {
        if (this.LIZJ) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("download_result", "fail");
            c188727au.LJIIIZ("group_id", this.LJFF.getAid());
            c188727au.LJIIIZ("author_id", C227768wm.LIZJ(this.LJFF));
            c188727au.LJIIIZ("enter_from", this.LJ);
            FMX.LJIIL("download_without_logo_status", c188727au.LIZ);
        }
    }

    @Override // X.InterfaceC43172Gwy
    public final void LIZJ(String str) {
        Context context;
        if (!this.LIZIZ) {
            C78939UyV.LJJJIL(str, new File(str).exists());
        }
        if (this.LIZJ) {
            C44928HkC c44928HkC = this.LIZLLL;
            String enterFrom = this.LJ;
            o.LJIIIIZZ(enterFrom, "enterFrom");
            c44928HkC.LJIIJ(enterFrom, str);
        }
        if (!TextUtils.isEmpty(str) && (context = this.LIZ.get()) != null) {
            C44928HkC c44928HkC2 = this.LIZLLL;
            String enterFrom2 = this.LJ;
            boolean z = this.LIZIZ;
            if (Build.VERSION.SDK_INT >= 33) {
                if (C04330Ez.LIZ(context, "android.permission.READ_MEDIA_VIDEO") != 0 || C04330Ez.LIZ(context, "android.permission.READ_MEDIA_IMAGES") != 0) {
                    C78983UzD.LJIIZILJ(new IllegalStateException("try to download video, but no permission"));
                    return;
                }
            } else if (C04330Ez.LIZ(context, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                C78983UzD.LJIIZILJ(new IllegalStateException("try to download video, but no permission"));
                return;
            }
            o.LJIIIIZZ(enterFrom2, "enterFrom");
            c44928HkC2.getClass();
            C10K.LIZJ(new ACallableS36S1200000_7(c44928HkC2, str, context, 0)).LJ(new AgS41S1200000_7(c44928HkC2, context, z, enterFrom2, 3), C10K.LJIIIIZZ, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44920Hk4(Context context, Aweme aweme, C44928HkC c44928HkC, String str, boolean z, boolean z2) {
        super(context);
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = c44928HkC;
        this.LJ = str;
        this.LJFF = aweme;
    }
}
