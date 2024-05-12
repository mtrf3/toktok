package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I3E implements WSJ {
    public final /* synthetic */ I3F LIZ;
    public final /* synthetic */ C45850Hz4 LIZIZ;

    public I3E(I3F i3f, C45850Hz4 c45850Hz4) {
        this.LIZ = i3f;
        this.LIZIZ = c45850Hz4;
    }

    @Override // X.WSJ
    public final boolean onTabSelected(WSF wsf, I34 i34) {
        I3Q.LIZ(I3P.DUET);
        C41015G7v.LIZ = System.currentTimeMillis();
        I3F i3f = this.LIZ;
        C82631Wbr c82631Wbr = i3f.LJLJL;
        InterfaceC74236TBo<?>[] interfaceC74236TBoArr = I3F.LJLZ;
        InterfaceC45999I3n interfaceC45999I3n = (InterfaceC45999I3n) c82631Wbr.LIZ(i3f, interfaceC74236TBoArr[1]);
        if (interfaceC45999I3n != null) {
            interfaceC45999I3n.Qt0(false);
        }
        C2U8.LIZ(new C61252an(true));
        I3F i3f2 = this.LIZ;
        HYQ hyq = (HYQ) i3f2.LJLLILLLL.LIZ(i3f2, interfaceC74236TBoArr[6]);
        if (hyq != null) {
            hyq.si0(true);
        }
        I3F i3f3 = this.LIZ;
        InterfaceC82400WVo interfaceC82400WVo = (InterfaceC82400WVo) i3f3.LJLLJ.LIZ(i3f3, interfaceC74236TBoArr[7]);
        if (interfaceC82400WVo != null) {
            C82398WVm.LJI(interfaceC82400WVo, null);
        }
        return true;
    }

    @Override // X.WSJ
    public final boolean onTabUnselected(WSF wsf, I34 i34) {
        ShortVideoContextViewModel shortVideoContextViewModel = this.LIZ.LJLLL;
        if (shortVideoContextViewModel != null) {
            shortVideoContextViewModel.LJLILLLLZI.put("photo_mode", Boolean.FALSE);
            if (!this.LIZIZ.LIZLLL().mIsFromDraft) {
                this.LIZIZ.LIZLLL().mIsPhotoMvModeMusic = false;
            }
            C2U8.LIZ(new C61252an(false));
            I3F i3f = this.LIZ;
            HYQ hyq = (HYQ) i3f.LJLLILLLL.LIZ(i3f, I3F.LJLZ[6]);
            if (hyq != null) {
                hyq.si0(false);
                return true;
            }
            return true;
        }
        o.LJIJI("shortVideoContextViewModel");
        throw null;
    }
}
