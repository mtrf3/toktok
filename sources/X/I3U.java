package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I3U implements WSJ {
    public final /* synthetic */ C45850Hz4 LIZ;
    public final /* synthetic */ C46001I3p LIZIZ;

    public I3U(C45850Hz4 c45850Hz4, C46001I3p c46001I3p) {
        this.LIZ = c45850Hz4;
        this.LIZIZ = c46001I3p;
    }

    @Override // X.WSJ
    public final boolean onTabSelected(WSF wsf, I34 i34) {
        boolean z;
        InterfaceC45891Hzj interfaceC45891Hzj;
        this.LIZ.LIZLLL().shootMode = 2;
        HB4.LJIIIZ(2);
        I37 i37 = this.LIZ.LIZ;
        if (i37 != null) {
            i37.X2("record");
        }
        InterfaceC45999I3n interfaceC45999I3n = (InterfaceC45999I3n) this.LIZIZ.LJLJJL.LJ(InterfaceC45999I3n.class, null);
        C46001I3p c46001I3p = this.LIZIZ;
        InterfaceC82325WSr interfaceC82325WSr = (InterfaceC82325WSr) c46001I3p.LJLL.LIZ(c46001I3p, C46001I3p.LJLLLLLL[0]);
        if (interfaceC82325WSr != null) {
            z = interfaceC82325WSr.kT(i34.LIZJ);
        } else {
            z = true;
        }
        interfaceC45999I3n.Qt0(z);
        ShortVideoContextViewModel shortVideoContextViewModel = this.LIZIZ.LJLJJLL;
        if (shortVideoContextViewModel != null) {
            shortVideoContextViewModel.LJLILLLLZI.put("photo_mode", Boolean.TRUE);
            InterfaceC82086WJm interfaceC82086WJm = this.LIZIZ.LJLJL;
            if (interfaceC82086WJm != null) {
                interfaceC82086WJm.s9(0);
                InterfaceC45995I3j interfaceC45995I3j = (InterfaceC45995I3j) this.LIZIZ.LJLJJL.LJ(InterfaceC45995I3j.class, null);
                if ((interfaceC45995I3j instanceof InterfaceC45891Hzj) && (interfaceC45891Hzj = (InterfaceC45891Hzj) interfaceC45995I3j) != null) {
                    interfaceC45891Hzj.bl0(0);
                }
                interfaceC45995I3j.LLLIL(1, true);
                C5UD c5ud = C44172HVg.LIZJ;
                String str = this.LIZ.LIZLLL().shootWay;
                c5ud.getClass();
                I3V i3v = new I3V();
                C1799074g c1799074g = InterfaceC1798974f.LIZ;
                i3v.LJ("shoot_way", str, c1799074g);
                i3v.LJ("shoot_type", "photo_shoot", c1799074g);
                i3v.LJIILIIL();
                interfaceC45995I3j.i7(false);
                if (!this.LIZ.LIZLLL().mIsFromDraft) {
                    this.LIZ.LIZLLL().mIsPhotoMvModeMusic = false;
                }
                return true;
            }
            o.LJIJI("cameraApiComponent");
            throw null;
        }
        o.LJIJI("shortVideoContextViewModel");
        throw null;
    }

    @Override // X.WSJ
    public final boolean onTabUnselected(WSF wsf, I34 i34) {
        ShortVideoContextViewModel shortVideoContextViewModel = this.LIZIZ.LJLJJLL;
        if (shortVideoContextViewModel != null) {
            shortVideoContextViewModel.LJLILLLLZI.put("photo_mode", Boolean.FALSE);
            if (!this.LIZ.LIZLLL().mIsFromDraft) {
                this.LIZ.LIZLLL().mIsPhotoMvModeMusic = false;
                return true;
            }
            return true;
        }
        o.LJIJI("shortVideoContextViewModel");
        throw null;
    }
}
