package X;

import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility;
import com.ss.android.ugc.aweme.translation.ui.TranslationStatusAssem;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y22 extends AbstractC65781Prl implements InterfaceC88471Ynr<TranslationStatusAssem, Y1Y, C76800UCe> {
    public static final Y22 LJLIL = new Y22();

    public Y22() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(TranslationStatusAssem translationStatusAssem, Y1Y y1y) {
        HashMap<String, String> hashMap;
        TranslationStatusAssem selectSubscribe = translationStatusAssem;
        Y1Y state = y1y;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(state, "state");
        if ((state instanceof Y0Y) || o.LJ(state, Y1X.LIZIZ)) {
            IVideoCellAbility iVideoCellAbility = (IVideoCellAbility) selectSubscribe.LLIILZL.getValue();
            if (iVideoCellAbility != null) {
                iVideoCellAbility.r7(false);
            }
        } else if (state instanceof Y0N) {
            Y0N y0n = (Y0N) state;
            X65 x65 = y0n.LJ;
            if (x65 != null && x65.LIZIZ) {
                if (x65.LIZ != null) {
                    IVideoCellAbility iVideoCellAbility2 = (IVideoCellAbility) selectSubscribe.LLIILZL.getValue();
                    if (iVideoCellAbility2 != null) {
                        iVideoCellAbility2.r7(true);
                    }
                    HashMap<String, String> hashMap2 = new HashMap<>();
                    X65 x652 = y0n.LJ;
                    if (x652 != null && (hashMap = x652.LIZ) != null) {
                        hashMap2.putAll(hashMap);
                    }
                    IVideoCellAbility iVideoCellAbility3 = (IVideoCellAbility) selectSubscribe.LLIILZL.getValue();
                    if (iVideoCellAbility3 != null) {
                        iVideoCellAbility3.u6(hashMap2);
                    }
                }
            } else {
                IVideoCellAbility iVideoCellAbility4 = (IVideoCellAbility) selectSubscribe.LLIILZL.getValue();
                if (iVideoCellAbility4 != null) {
                    iVideoCellAbility4.r7(false);
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
