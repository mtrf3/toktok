package X;

import com.ss.android.ugc.aweme.feed.assem.desc.TranslationAbility;
import com.ss.android.ugc.aweme.feed.model.Audio;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.ui.DubbingStatusAssem;
import com.ss.android.ugc.aweme.ui.DubbingStatusViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y2O extends AbstractC65781Prl implements InterfaceC88471Ynr<DubbingStatusAssem, Y1Y, C76800UCe> {
    public static final Y2O LJLIL = new Y2O();

    public Y2O() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(DubbingStatusAssem dubbingStatusAssem, Y1Y y1y) {
        boolean z;
        Aweme aweme;
        DubbingStatusAssem selectSubscribe = dubbingStatusAssem;
        Y1Y state = y1y;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(state, "state");
        DubbingStatusViewModel q4 = selectSubscribe.q4();
        TranslationAbility translationAbility = (TranslationAbility) selectSubscribe.LLFII.getValue();
        if (translationAbility != null) {
            z = translationAbility.N00();
        } else {
            z = false;
        }
        q4.getClass();
        VideoItemParams gv0 = q4.gv0();
        if (gv0 != null && (aweme = gv0.getAweme()) != null && C78605Ut7.LJIJ(aweme, Y01.LIZIZ.LJJIIZI()) && !z) {
            if (state instanceof Y1X) {
                q4.setState(Y3R.LJLIL);
                q4.onEvent(C86763Y3j.LIZIZ);
            } else if (state instanceof Y0Y) {
                if ((q4.LJZ instanceof Y0N) && q4.LJLLLL == Audio.InfoIdType.TRANSLATED) {
                    if (q4.LJLLLLLL != Y2X.AWAITING_DUBBING_OFF) {
                        q4.nv0(false);
                    }
                } else {
                    q4.setState(Y3S.LJLIL);
                    q4.onEvent(C86763Y3j.LIZIZ);
                }
            } else if (state instanceof IUQ) {
                q4.setState(Y3T.LJLIL);
                if (C53277KvZ.LIZ.getBoolean("dubbing_default_state_on", true) && (((Y2S) q4.getState()).LJLIL instanceof C86758Y3e)) {
                    q4.nv0(false);
                }
            } else if (state instanceof Y0N) {
                q4.setState(Y3U.LJLIL);
                if (!C53277KvZ.LIZ()) {
                    q4.setState(Y3V.LJLIL);
                }
            }
            q4.LJZ = state;
        }
        return C76800UCe.LIZ;
    }
}
