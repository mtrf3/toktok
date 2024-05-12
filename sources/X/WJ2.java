package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AqS161S0200000_14;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WJ2 implements InterfaceC82069WIv {
    @Override // X.InterfaceC82069WIv
    public final C82067WIt LIZ(WID wid, ArrayList<C6MP> arrayList) {
        C82067WIt c82067WIt = new C82067WIt();
        Iterator<C6MP> it = arrayList.iterator();
        while (it.hasNext()) {
            switch (C6MR.LIZ[it.next().ordinal()]) {
                case 1:
                    c82067WIt.LIZ(wid.LJIIJJI(), WJ8.LJLIL);
                    break;
                case 2:
                    c82067WIt.LIZ(wid.LJIILJJIL(), WJ8.LJLIL);
                    break;
                case 3:
                    c82067WIt.LIZ((C81975WFf) wid.LJII.getValue(), WJ8.LJLIL);
                    break;
                case 4:
                    c82067WIt.LIZ((C81975WFf) wid.LJ.getValue(), WJ8.LJLIL);
                    break;
                case 5:
                    c82067WIt.LIZ((C81975WFf) wid.LJFF.getValue(), WJ8.LJLIL);
                    break;
                case 6:
                    c82067WIt.LIZ(wid.LIZLLL(), WJ8.LJLIL);
                    break;
                case 7:
                    c82067WIt.LIZ(wid.LJIIIIZZ(), WJ8.LJLIL);
                    break;
                case 8:
                    c82067WIt.LIZ(wid.LJIJ(), WJ8.LJLIL);
                    break;
                case 9:
                    c82067WIt.LIZ(wid.LJII(), WJ8.LJLIL);
                    break;
                case 10:
                    c82067WIt.LIZ((C81975WFf) wid.LJIJ.getValue(), WJ8.LJLIL);
                    break;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    c82067WIt.LIZ((C81975WFf) wid.LJIJJ.getValue(), WJ8.LJLIL);
                    break;
                case 12:
                    c82067WIt.LIZ(wid.LJIIL(), WJ8.LJLIL);
                    break;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                    c82067WIt.LIZ(wid.LJFF(), WJ8.LJLIL);
                    break;
                case 14:
                    c82067WIt.LIZ(wid.LJI(), WJ8.LJLIL);
                    break;
                case 15:
                    c82067WIt.LIZ(wid.LIZIZ(), WJ8.LJLIL);
                    break;
                case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                    c82067WIt.LIZ((C81975WFf) wid.LJIJJLI.getValue(), WJ8.LJLIL);
                    break;
                case 17:
                    c82067WIt.LIZ(wid.LJIILL(), WJ8.LJLIL);
                    break;
                default:
                    throw new RuntimeException("it shouldn't display in record page");
            }
        }
        return c82067WIt;
    }

    @Override // X.InterfaceC82069WIv
    public final C82067WIt LIZIZ(C82622Wbi diContainer, WID wid, C82068WIu state) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(state, "state");
        ShortVideoContext shortVideoContext = (ShortVideoContext) diContainer.LJ(ShortVideoContext.class, null);
        C82067WIt c82067WIt = new C82067WIt();
        C81975WFf LJIIJJI = wid.LJIIJJI();
        WJ8 wj8 = WJ8.LJLIL;
        c82067WIt.LIZ(LJIIJJI, wj8);
        c82067WIt.LIZ(wid.LJIILJJIL(), wj8);
        c82067WIt.LIZ((C81975WFf) wid.LJ.getValue(), WJ6.LJLIL);
        c82067WIt.LIZ((C81975WFf) wid.LJFF.getValue(), wj8);
        c82067WIt.LIZ((C81975WFf) wid.LJII.getValue(), WJ7.LJLIL);
        c82067WIt.LIZ(wid.LIZLLL(), wj8);
        c82067WIt.LIZ(wid.LJIIIIZZ(), new AqS164S0100000_14(shortVideoContext, 453));
        c82067WIt.LIZ(wid.LJIJ(), new AqS164S0100000_14(state, 454));
        c82067WIt.LIZ(wid.LJ(), new AqS161S0200000_14(state, shortVideoContext, 73));
        c82067WIt.LIZ(wid.LJIILLIIL(), new AqS164S0100000_14(state, 455));
        c82067WIt.LIZ(wid.LJII(), new AqS164S0100000_14(state, 456));
        c82067WIt.LIZ(wid.LJIIL(), new AqS164S0100000_14(state, 457));
        c82067WIt.LIZ((C81975WFf) wid.LJIJ.getValue(), new AqS164S0100000_14(state, 458));
        c82067WIt.LIZ(wid.LJIILL(), new AqS164S0100000_14(shortVideoContext, 446));
        c82067WIt.LIZ((C81975WFf) wid.LJIJJ.getValue(), new AqS164S0100000_14(state, 447));
        c82067WIt.LIZ((C81975WFf) wid.LJIJJLI.getValue(), new AqS164S0100000_14(state, 448));
        c82067WIt.LIZ(wid.LIZIZ(), new AqS164S0100000_14(state, 449));
        if (C53237Kuv.LIZ() != 0 && !shortVideoContext.LJJIJIIJIL()) {
            c82067WIt.LIZ(wid.LJIIJ(), new AqS164S0100000_14(state, 450));
        }
        if (!HWY.LIZ()) {
            c82067WIt.LIZ(wid.LJFF(), new AqS164S0100000_14(shortVideoContext, 451));
        } else {
            c82067WIt.LIZ(wid.LJI(), new AqS164S0100000_14(shortVideoContext, 452));
        }
        return c82067WIt;
    }
}
