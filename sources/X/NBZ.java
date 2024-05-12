package X;

import com.ss.android.ugc.aweme.api.component.interaction.CommerceInteractionComponent;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NBZ extends AbstractC65781Prl implements InterfaceC88471Ynr<CommerceInteractionComponent, C46276IEe, C76800UCe> {
    public static final NBZ LJLIL = new NBZ();

    public NBZ() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(CommerceInteractionComponent commerceInteractionComponent, C46276IEe c46276IEe) {
        Integer valueOf;
        CommerceInteractionComponent selectSubscribe = commerceInteractionComponent;
        C46276IEe c46276IEe2 = c46276IEe;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        String str = null;
        if (c46276IEe2 != null) {
            str = c46276IEe2.LJLILLLLZI;
        }
        if (C06460Ne.LJ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe), str) && c46276IEe2 != null && (valueOf = Integer.valueOf(c46276IEe2.LJLIL)) != null) {
            if (valueOf.intValue() == 5) {
                InterfaceC58942NBi c4 = selectSubscribe.c4();
                if (c4 != null) {
                    c4.LJIILL(NBR.LIZ);
                }
                C242549fW.LIZ("handle RENDER_FIRST_FRAME");
            } else if (valueOf.intValue() == 13) {
                InterfaceC58942NBi c42 = selectSubscribe.c4();
                if (c42 != null) {
                    c42.LJIILL(NBV.LIZ);
                }
                C242549fW.LIZ("handle Replay");
            } else if (valueOf.intValue() == 3) {
                InterfaceC58942NBi c43 = selectSubscribe.c4();
                if (c43 != null) {
                    c43.LJIILL(NBQ.LIZ);
                }
                C242549fW.LIZ("handle Resume");
            } else if (valueOf.intValue() == 4) {
                InterfaceC58942NBi c44 = selectSubscribe.c4();
                if (c44 != null) {
                    c44.LJIILL(NBP.LIZ);
                }
                C242549fW.LIZ("handle Pause");
            } else if (valueOf.intValue() == 7) {
                InterfaceC58942NBi c45 = selectSubscribe.c4();
                if (c45 != null) {
                    c45.LJIILL(NBO.LIZ);
                }
                C242549fW.LIZ("handle Complete");
            }
        }
        return C76800UCe.LIZ;
    }
}
