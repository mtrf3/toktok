package X;

import com.ss.android.ugc.aweme.autocaption.VideoCLACaptionAssem;
import com.ss.android.ugc.aweme.autocaption.VideoCLACaptionViewModel;
import kotlin.jvm.internal.AqS104S0300000_15;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y0L extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoCLACaptionAssem, Y1Y, C76800UCe> {
    public static final Y0L LJLIL = new Y0L();

    public Y0L() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoCLACaptionAssem videoCLACaptionAssem, Y1Y y1y) {
        Y0Y y0y;
        C84540XFw c84540XFw;
        VideoCLACaptionAssem selectSubscribe = videoCLACaptionAssem;
        Y1Y state = y1y;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(state, "state");
        Y1Y y1y2 = selectSubscribe.r4().LLFFF;
        selectSubscribe.r4().LLFFF = state;
        if (o.LJ(state, Y1X.LIZIZ)) {
            if (selectSubscribe.r4().LJLL && (y1y2 instanceof Y0N)) {
                AqS165S0100000_15 aqS165S0100000_15 = new AqS165S0100000_15(selectSubscribe, 778);
                VideoCLACaptionViewModel r4 = selectSubscribe.r4();
                if (r4.LLF) {
                    aqS165S0100000_15.invoke();
                } else {
                    selectSubscribe.Ai(EnumC86730Y2c.SWITCH_LANGUAGE);
                    r4.LLII = aqS165S0100000_15;
                }
            }
        } else if (state instanceof Y0Y) {
            C86675Xzz c86675Xzz = selectSubscribe.LLIIIILZ;
            if (c86675Xzz != null) {
                c86675Xzz.LJ(false, selectSubscribe.r4().LLZLL());
            }
            if (selectSubscribe.r4().LJLL && (y1y2 instanceof Y0N) && (c84540XFw = (y0y = (Y0Y) state).LIZJ) != null) {
                selectSubscribe.A4(y0y.LIZIZ, false);
                AqS104S0300000_15 aqS104S0300000_15 = new AqS104S0300000_15(selectSubscribe, c84540XFw, state, 9);
                VideoCLACaptionViewModel r42 = selectSubscribe.r4();
                if (r42.LLF) {
                    aqS104S0300000_15.invoke();
                } else {
                    selectSubscribe.Ai(EnumC86730Y2c.SWITCH_LANGUAGE);
                    r42.LLII = aqS104S0300000_15;
                }
            }
        } else if (state instanceof IUQ) {
            C86675Xzz c86675Xzz2 = selectSubscribe.LLIIIILZ;
            if (c86675Xzz2 != null) {
                c86675Xzz2.LJ(((IUQ) state).LIZJ, selectSubscribe.r4().LLZLL());
            }
        } else if (state instanceof Y0N) {
            C86675Xzz c86675Xzz3 = selectSubscribe.LLIIIILZ;
            if (c86675Xzz3 != null) {
                c86675Xzz3.LJ(false, selectSubscribe.r4().LLZLL());
            }
            Y0N y0n = (Y0N) state;
            C84540XFw c84540XFw2 = y0n.LJFF;
            if (c84540XFw2 != null) {
                selectSubscribe.A4(y0n.LIZIZ, true);
                AqS104S0300000_15 aqS104S0300000_152 = new AqS104S0300000_15(selectSubscribe, c84540XFw2, state, 10);
                VideoCLACaptionViewModel r43 = selectSubscribe.r4();
                if (r43.LLF) {
                    aqS104S0300000_152.invoke();
                } else {
                    selectSubscribe.Ai(EnumC86730Y2c.SWITCH_LANGUAGE);
                    r43.LLII = aqS104S0300000_152;
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
