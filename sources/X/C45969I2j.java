package X;

import com.bytedance.als.ApiCenter;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.o;

/* renamed from: X.I2j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45969I2j implements WSJ {
    public final /* synthetic */ C45850Hz4 LIZ;
    public final /* synthetic */ C45970I2k LIZIZ;

    @Override // X.WSJ
    public final boolean onTabUnselected(WSF wsf, I34 i34) {
        return false;
    }

    public C45969I2j(C45850Hz4 c45850Hz4, C45970I2k c45970I2k) {
        this.LIZ = c45850Hz4;
        this.LIZIZ = c45970I2k;
    }

    @Override // X.WSJ
    public final boolean onTabSelected(WSF wsf, I34 i34) {
        int i;
        I37 i37 = this.LIZ.LIZ;
        if (i37 != null) {
            i37.X2("record");
        }
        C45970I2k c45970I2k = this.LIZIZ;
        String tag = wsf.LIZIZ;
        c45970I2k.getClass();
        o.LJIIIZ(tag, "tag");
        String str = C44269HYz.LIZ;
        if (o.LJ(tag, str)) {
            i = 10;
        } else if (o.LJ(tag, C44269HYz.LIZ())) {
            i = 11;
        } else {
            i = 8;
        }
        this.LIZ.LIZLLL().shootMode = i;
        ApiCenter LIZ = C0I0.LIZ(this.LIZ.LIZ());
        ((InterfaceC45999I3n) LIZ.LIZ(InterfaceC45999I3n.class)).Qt0(true);
        InterfaceC164206cS interfaceC164206cS = (InterfaceC164206cS) LIZ.LIZ(InterfaceC164206cS.class);
        interfaceC164206cS.LLLLII();
        interfaceC164206cS.LLLIL(3, false);
        InterfaceC82086WJm interfaceC82086WJm = this.LIZIZ.LJLJJL;
        if (interfaceC82086WJm != null) {
            interfaceC82086WJm.s9(0);
            ((InterfaceC164206cS) LIZ.LIZ(InterfaceC164206cS.class)).i7(true);
            if (C60903NvH.LJIIJJI().LJJIL().getSpeedPanelOpen(false)) {
                ((WIB) LIZ.LIZ(WIB.class)).h1(true);
            }
            C45850Hz4 c45850Hz4 = this.LIZ;
            String str2 = wsf.LIZIZ;
            c45850Hz4.LIZLLL();
            boolean z = i34.LIZ;
            if (o.LJ(C44269HYz.LIZ(), str2) || o.LJ(str, str2)) {
                C45964I2e c45964I2e = new C45964I2e(!o.LJ(C44269HYz.LIZ(), str2), true);
                c45964I2e.LJLJJL = z;
                c45964I2e.LJLJJI = 2;
                ((InterfaceC45971I2l) C0I0.LIZ(c45850Hz4.LIZ()).LIZ(InterfaceC45971I2l.class)).configSwitchDuration(c45964I2e);
            }
            C45850Hz4 c45850Hz42 = this.LIZ;
            String str3 = wsf.LIZIZ;
            ShortVideoContext LIZLLL = c45850Hz42.LIZLLL();
            if ((o.LJ(C44269HYz.LIZ(), str3) || o.LJ(str, str3)) && LIZLLL.LJJIJIL()) {
                if (LIZLLL.LJJJIL()) {
                    LIZLLL.cameraComponentModel.mMusicStart = HEG.LIZIZ(LIZLLL.stitchContext.stitchParams);
                } else if (!LIZLLL.mIsFromDraft || LIZLLL.LJII().isEmpty()) {
                    LIZLLL.cameraComponentModel.mMusicStart = 0;
                }
                HB4.LJII(LIZLLL.cameraComponentModel.mMusicPath, MusicBeanUtilKt.extractAVMusic(LIZLLL.creativeModel.musicBuzModel), LIZLLL.cameraComponentModel.mMusicStart);
                InterfaceC83865Wvl LIZJ = c45850Hz42.LIZJ();
                CameraComponentModel cameraComponentModel = LIZLLL.cameraComponentModel;
                LIZJ.LLZZJLIL(cameraComponentModel.mMusicStart, cameraComponentModel.mTotalRecordingTime, cameraComponentModel.mMusicPath, false, false);
            }
            HB4.LJIIIZ(i);
            return true;
        }
        o.LJIJI("cameraApiComponent");
        throw null;
    }
}
