package X;

import com.ss.android.ugc.aweme.cla.et.newet.SeeOriginalShowEvent;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.translation.ui.TranslationStatusAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.Y1p, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86717Y1p extends AbstractC65781Prl implements InterfaceC88473Ynt<TranslationStatusAssem, Y1Y, Boolean, C76800UCe> {
    public static final C86717Y1p LJLIL = new C86717Y1p();

    public C86717Y1p() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(TranslationStatusAssem translationStatusAssem, Y1Y y1y, Boolean bool) {
        TranslationStatusAssem selectSubscribe = translationStatusAssem;
        Y1Y state = y1y;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(state, "state");
        if (booleanValue) {
            if (state instanceof Y0Y) {
                selectSubscribe.C4();
            } else if (state instanceof Y0N) {
                if (((Y0N) state).LIZ()) {
                    Y2G.LJ(SeeOriginalShowEvent.class, selectSubscribe.getVScope(), C47261Igj.LJJIJ(new C2Y1(0)), 4);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Trigger aid ");
                    LIZ.append(((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getAid());
                    LIZ.append(" go to  status through user click: ");
                    LIZ.append(!r7.LIZJ);
                    C36922EeM.LIZLLL(4, "TranslationStatusView", X1D.LIZIZ(LIZ));
                } else {
                    selectSubscribe.C4();
                }
            } else if (state instanceof Y1X) {
            }
        }
        return C76800UCe.LIZ;
    }
}
