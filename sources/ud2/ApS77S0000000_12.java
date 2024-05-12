package ud2;

import X.AbstractC82618Wbe;
import X.C44307HaB;
import X.C44308HaC;
import X.C82622Wbi;
import X.I0N;
import X.InterfaceC78118UlG;
import X.InterfaceC84497XEf;
import X.TFC;
import X.TFD;
import X.TFE;
import X.TFF;
import X.TH7;
import X.THA;
import X.THC;
import X.THG;
import X.THN;
import X.THX;
import Y.AObjectS87S0100000_12;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.AVApiImpl;
import com.ss.android.ugc.aweme.sticker.view.internal.search.TTSearchStickerViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class ApS77S0000000_12 extends AbstractC82618Wbe {
    public final int $t;

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, X.TH7<X.THN, androidx.fragment.app.Fragment>] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, X.TH7<X.THN, androidx.fragment.app.Fragment>] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, X.TH7<X.THN, androidx.fragment.app.Fragment>] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.TH7<X.THN, androidx.fragment.app.Fragment>] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, X.TH7<X.THN, androidx.fragment.app.Fragment>] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, X.TH7<X.THN, androidx.fragment.app.Fragment>] */
    @Override // X.AbstractC82618Wbe
    public final TH7<THN, Fragment> LIZIZ(C82622Wbi c82622Wbi) {
        switch (this.$t) {
            case 0:
                return LIZIZ$0(this, c82622Wbi);
            case 1:
                return LIZIZ$1(this, c82622Wbi);
            case 2:
                return LIZIZ$2(this, c82622Wbi);
            case 3:
                return LIZIZ$3(this, c82622Wbi);
            case 4:
                return LIZIZ$4(this, c82622Wbi);
            default:
                return super.LIZIZ(c82622Wbi);
        }
    }

    public ApS77S0000000_12(int i) {
        this.$t = i;
    }

    public static final Object LIZIZ$0(ApS77S0000000_12 apS77S0000000_12, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        THC thc = new THC(null);
        thc.LIZ("sticker_category:favorite", new THG((LifecycleOwner) container.LJ(LifecycleOwner.class, null), (THX) container.LJ(THX.class, null), ((I0N) container.LJ(I0N.class, null)).LLLLL(), (InterfaceC78118UlG) container.LJ(InterfaceC78118UlG.class, null)));
        return thc;
    }

    public static final Object LIZIZ$1(ApS77S0000000_12 apS77S0000000_12, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        THC thc = new THC(null);
        thc.LIZ("sticker_category:favorite", new THG((LifecycleOwner) container.LJ(LifecycleOwner.class, null), (THX) container.LJ(THX.class, null), ((I0N) container.LJ(I0N.class, null)).LLLLL(), (InterfaceC78118UlG) container.LJ(InterfaceC78118UlG.class, null)));
        return thc;
    }

    public static final Object LIZIZ$2(ApS77S0000000_12 apS77S0000000_12, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        TTSearchStickerViewModel tTSearchStickerViewModel = new TTSearchStickerViewModel((LifecycleOwner) container.LJ(LifecycleOwner.class, null), ((I0N) container.LJ(I0N.class, null)).LLLLL(), ((I0N) container.LJ(I0N.class, null)).LLZL(), new THA((InterfaceC84497XEf) container.LJ(InterfaceC84497XEf.class, null)));
        String LIZ = AVApiImpl.LIZJ().LIZ();
        o.LJIIIIZZ(LIZ, "get().getService(AVApi::…s.java).apI_URL_PREFIX_SI");
        tTSearchStickerViewModel.LLII = LIZ;
        ((I0N) container.LJ(I0N.class, null)).q80().LIZLLL((LifecycleOwner) container.LJ(LifecycleOwner.class, null), new AObjectS87S0100000_12(tTSearchStickerViewModel, 0));
        return tTSearchStickerViewModel;
    }

    public static final Object LIZIZ$3(ApS77S0000000_12 apS77S0000000_12, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        ((I0N) container.LJ(I0N.class, null)).LLLLL().LJJJJLL().LIZ().LJI().observe((LifecycleOwner) container.LJ(LifecycleOwner.class, null), TFF.LJLIL);
        TTSearchStickerViewModel tTSearchStickerViewModel = new TTSearchStickerViewModel((LifecycleOwner) container.LJ(LifecycleOwner.class, null), ((I0N) container.LJ(I0N.class, null)).LLLLL(), ((I0N) container.LJ(I0N.class, null)).LLZL(), new THA((InterfaceC84497XEf) container.LJ(InterfaceC84497XEf.class, null)));
        tTSearchStickerViewModel.LLFF.observe((LifecycleOwner) container.LJ(LifecycleOwner.class, null), C44308HaC.LJLIL);
        tTSearchStickerViewModel.LLI.observe((LifecycleOwner) container.LJ(LifecycleOwner.class, null), TFD.LJLIL);
        String LIZ = AVApiImpl.LIZJ().LIZ();
        o.LJIIIIZZ(LIZ, "get().getService(AVApi::…s.java).apI_URL_PREFIX_SI");
        tTSearchStickerViewModel.LLII = LIZ;
        ((I0N) container.LJ(I0N.class, null)).q80().LIZLLL((LifecycleOwner) container.LJ(LifecycleOwner.class, null), new AObjectS87S0100000_12(tTSearchStickerViewModel, 6));
        return tTSearchStickerViewModel;
    }

    public static final Object LIZIZ$4(ApS77S0000000_12 apS77S0000000_12, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        ((I0N) container.LJ(I0N.class, null)).LLLLL().LJJJJLL().LIZ().LJI().observe((LifecycleOwner) container.LJ(LifecycleOwner.class, null), TFE.LJLIL);
        TTSearchStickerViewModel tTSearchStickerViewModel = new TTSearchStickerViewModel((LifecycleOwner) container.LJ(LifecycleOwner.class, null), ((I0N) container.LJ(I0N.class, null)).LLLLL(), ((I0N) container.LJ(I0N.class, null)).LLZL(), new THA((InterfaceC84497XEf) container.LJ(InterfaceC84497XEf.class, null)));
        tTSearchStickerViewModel.LLFF.observe((LifecycleOwner) container.LJ(LifecycleOwner.class, null), C44307HaB.LJLIL);
        tTSearchStickerViewModel.LLI.observe((LifecycleOwner) container.LJ(LifecycleOwner.class, null), TFC.LJLIL);
        String LIZ = AVApiImpl.LIZJ().LIZ();
        o.LJIIIIZZ(LIZ, "get().getService(AVApi::…s.java).apI_URL_PREFIX_SI");
        tTSearchStickerViewModel.LLII = LIZ;
        ((I0N) container.LJ(I0N.class, null)).q80().LIZLLL((LifecycleOwner) container.LJ(LifecycleOwner.class, null), new AObjectS87S0100000_12(tTSearchStickerViewModel, 5));
        return tTSearchStickerViewModel;
    }
}
