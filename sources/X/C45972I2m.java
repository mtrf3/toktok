package X;

import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.o;

/* renamed from: X.I2m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45972I2m implements WSJ {
    public final /* synthetic */ C45850Hz4 LIZ;
    public final /* synthetic */ C45973I2n LIZIZ;

    @Override // X.WSJ
    public final boolean onTabUnselected(WSF wsf, I34 i34) {
        return false;
    }

    public C45972I2m(C45850Hz4 c45850Hz4, C45973I2n c45973I2n) {
        this.LIZ = c45850Hz4;
        this.LIZIZ = c45973I2n;
    }

    @Override // X.WSJ
    public final boolean onTabSelected(WSF wsf, I34 i34) {
        I37 i37 = this.LIZ.LIZ;
        if (i37 != null) {
            i37.X2("record");
        }
        int LIZIZ = C44269HYz.LIZIZ(wsf.LIZIZ);
        this.LIZ.LIZLLL().shootMode = LIZIZ;
        C45973I2n c45973I2n = this.LIZIZ;
        C82632Wbs c82632Wbs = c45973I2n.LJLJL;
        InterfaceC74236TBo<?>[] interfaceC74236TBoArr = C45973I2n.LJLL;
        ((InterfaceC45999I3n) c82632Wbs.LIZ(c45973I2n, interfaceC74236TBoArr[0])).Qt0(i34.LIZLLL);
        C45850Hz4 c45850Hz4 = this.LIZ;
        String str = wsf.LIZIZ;
        ShortVideoContext LIZLLL = c45850Hz4.LIZLLL();
        boolean z = i34.LIZ;
        if ((o.LJ(C44269HYz.LIZ(), str) || o.LJ(C44269HYz.LIZ, str)) && !LIZLLL.LJJJI()) {
            C45964I2e c45964I2e = new C45964I2e(o.LJ(C44269HYz.LIZ, str), true);
            c45964I2e.LJLJI = o.LJ(str, C44269HYz.LIZJ);
            c45964I2e.LJLJJL = z;
            c45964I2e.LJLJJI = 2;
            C45973I2n c45973I2n2 = this.LIZIZ;
            ((InterfaceC45979I2t) c45973I2n2.LJLJLJ.LIZ(c45973I2n2, interfaceC74236TBoArr[1])).configSwitchDuration(c45964I2e);
        }
        C45850Hz4 c45850Hz42 = this.LIZ;
        String str2 = wsf.LIZIZ;
        ShortVideoContext LIZLLL2 = c45850Hz42.LIZLLL();
        if ((o.LJ(C44269HYz.LIZ(), str2) || o.LJ(C44269HYz.LIZ, str2)) && LIZLLL2.LJJIJIL()) {
            if (LIZLLL2.LJJJIL()) {
                LIZLLL2.cameraComponentModel.mMusicStart = HEG.LIZIZ(LIZLLL2.stitchContext.stitchParams);
            } else if (!LIZLLL2.mIsFromDraft || (LIZLLL2.LJII().isEmpty() && !LIZLLL2.cameraComponentModel.isRetakeMode)) {
                LIZLLL2.cameraComponentModel.mMusicStart = 0;
            }
            I9T.LJII(LIZLLL2.cameraComponentModel.mMusicStart, "", LIZLLL2.creativeModel.musicBuzModel);
            HB4.LJII(LIZLLL2.cameraComponentModel.mMusicPath, MusicBeanUtilKt.extractAVMusic(LIZLLL2.creativeModel.musicBuzModel), LIZLLL2.cameraComponentModel.mMusicStart);
            InterfaceC83865Wvl LIZJ = c45850Hz42.LIZJ();
            CameraComponentModel cameraComponentModel = LIZLLL2.cameraComponentModel;
            LIZJ.LLZZJLIL(cameraComponentModel.mMusicStart, cameraComponentModel.mTotalRecordingTime, cameraComponentModel.mMusicPath, false, false);
        }
        HB4.LJIIIZ(LIZIZ);
        return true;
    }
}
