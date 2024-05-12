package X;

import android.content.Context;
import com.zhiliaoapp.musically.R;

/* renamed from: X.0vE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22960vE {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Type inference failed for: r0v7, types: [X.W5O, REQUEST] */
    public static void LIZ(Context context, C47061t0 c47061t0) {
        InterfaceC29405BgP LIZIZ;
        InterfaceC05190Ih interfaceC05190Ih;
        if (KL2.LJIIIZ(context) == 0) {
            return;
        }
        C78739UvH c78739UvH = new C78739UvH(KL2.LJIIJJI(context) / KL2.LJIIIZ(context));
        B83 LIZ2 = B83.LIZ();
        if (LIZ2 != null && (LIZIZ = LIZ2.LIZIZ()) != null && (interfaceC05190Ih = ((C29374Bfu) LIZIZ).LIZIZ) != null && interfaceC05190Ih.getAvatarLarge() != null) {
            C31665Cbl.LJFF(c47061t0, interfaceC05190Ih.getAvatarLarge(), c78739UvH);
            return;
        }
        C81705W4v LIZJ = W5I.LIZJ();
        W5P LIZJ2 = W5P.LIZJ(R.drawable.cqu);
        LIZJ2.LJIIJ = c78739UvH;
        LIZJ.LIZLLL = LIZJ2.LIZ();
        LIZJ.LJIIL = c47061t0.getController();
        c47061t0.setController(LIZJ.LIZ());
    }
}
