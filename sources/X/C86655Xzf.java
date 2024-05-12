package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.service.CaptionKevaServiceImpl;
import com.ss.android.ugc.aweme.service.ICaptionKevaService;

/* renamed from: X.Xzf, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86655Xzf {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Aweme aweme, boolean z, boolean z2, boolean z3) {
        if (aweme == null || !C52280KfU.LIZ() || !C53379KxD.LIZ() || z3 || z2 || z || C47636Imm.LJII(2) > 0.13d) {
            return false;
        }
        Integer LJIJJ = C86670Xzu.LJIJJ(aweme);
        if (LJIJJ != null && LJIJJ.intValue() <= 20000) {
            return false;
        }
        ICaptionKevaService LJJJJI = CaptionKevaServiceImpl.LJJJJI();
        if (LJJJJI.LIZ()) {
            return false;
        }
        int LJIIL = LJJJJI.LJIIL();
        long LJIILLIIL = LJJJJI.LJIILLIIL();
        if (LJIIL < 2) {
            if (System.currentTimeMillis() - LJIILLIIL < C86656Xzg.LIZ) {
                return false;
            }
            return true;
        }
        if (System.currentTimeMillis() - LJIILLIIL < C86656Xzg.LIZIZ) {
            return false;
        }
        return true;
    }
}
