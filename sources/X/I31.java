package X;

import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.tools.mvtemplate.RecordMVViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I31 extends I35 {
    public final C82622Wbi LJLILLLLZI;
    public final boolean LJLJI;
    public RecordMVViewModel LJLJJI;
    public final C62822Ol8 LJLJJL;

    @Override // X.WSH
    public final WT3 provideScene() {
        return (WT3) this.LJLJJL.getValue();
    }

    @Override // X.WSH
    public final WSF createBottomTabItem(C45850Hz4 c45850Hz4) {
        String string = c45850Hz4.LIZ().getString(R.string.pwb);
        o.LJIIIIZZ(string, "tabEnv.activity.getString(R.string.record_mode_mv)");
        boolean z = false;
        if (!this.LJLJI) {
            RecordMVViewModel recordMVViewModel = this.LJLJJI;
            if (recordMVViewModel != null) {
                if (!C78685UuP.LJJJZ(recordMVViewModel.LJLJL) || !HJC.LJ() || !C60903NvH.LJIIJJI().LIZIZ().LJI()) {
                    RecordMVViewModel recordMVViewModel2 = this.LJLJJI;
                    if (recordMVViewModel2 != null) {
                        ShortVideoContext Mv0 = recordMVViewModel2.Mv0();
                        if (HJC.LJ() && (!Mv0.LJJJI())) {
                            RecordMVViewModel recordMVViewModel3 = this.LJLJJI;
                            if (recordMVViewModel3 != null) {
                                if (recordMVViewModel3.LJLJJLL != null) {
                                    HJC.LIZ = "mv_reuse";
                                }
                            } else {
                                o.LJIJI("mvViewModel");
                                throw null;
                            }
                        }
                    } else {
                        o.LJIJI("mvViewModel");
                        throw null;
                    }
                }
                z = true;
            } else {
                o.LJIJI("mvViewModel");
                throw null;
            }
        }
        return new WSF(string, "record_mode_mv", "mv", z, new I32(this, c45850Hz4));
    }

    @Override // X.WSH
    public final void initialize(C45850Hz4 c45850Hz4) {
        JediViewModel LIZ = ((C165626ek) this.LJLILLLLZI.LJ(C165626ek.class, null)).LIZ(RecordMVViewModel.class);
        o.LJIIIIZZ(LIZ, "diContainer.get(JediView…dMVViewModel::class.java)");
        RecordMVViewModel recordMVViewModel = (RecordMVViewModel) LIZ;
        this.LJLJJI = recordMVViewModel;
        recordMVViewModel.LJLJLJ = c45850Hz4.LIZLLL();
        RecordMVViewModel recordMVViewModel2 = this.LJLJJI;
        if (recordMVViewModel2 != null) {
            recordMVViewModel2.LJLJJLL = ((ShortVideoContext) this.LJLILLLLZI.LJ(ShortVideoContext.class, null)).enterMvThemeEffect;
            RecordMVViewModel recordMVViewModel3 = this.LJLJJI;
            if (recordMVViewModel3 != null) {
                recordMVViewModel3.LJLJL = ((ShortVideoContext) this.LJLILLLLZI.LJ(ShortVideoContext.class, null)).enterCutsameId;
                return;
            } else {
                o.LJIJI("mvViewModel");
                throw null;
            }
        }
        o.LJIJI("mvViewModel");
        throw null;
    }

    public I31(C82622Wbi diContainer, boolean z) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLILLLLZI = diContainer;
        this.LJLJI = z;
        this.LJLJJL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 24));
        diContainer.LJIIIIZZ(null, ShortVideoContext.class);
    }
}
