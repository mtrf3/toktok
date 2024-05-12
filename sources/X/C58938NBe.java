package X;

import com.ss.android.ugc.aweme.api.component.interaction.CommerceInteractionComponent;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* renamed from: X.NBe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58938NBe extends AbstractC65781Prl implements InterfaceC88471Ynr<CommerceInteractionComponent, C183887Jo, C76800UCe> {
    public static final C58938NBe LJLIL = new C58938NBe();

    public C58938NBe() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(CommerceInteractionComponent commerceInteractionComponent, C183887Jo c183887Jo) {
        String str;
        CommerceInteractionComponent selectSubscribe = commerceInteractionComponent;
        C183887Jo c183887Jo2 = c183887Jo;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c183887Jo2 != null) {
            str = c183887Jo2.LJLIL;
        } else {
            str = null;
        }
        if (C06460Ne.LJ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe), str)) {
            InterfaceC58942NBi c4 = selectSubscribe.c4();
            if (c4 != null) {
                c4.LJIILIIL(C58946NBm.LIZ);
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("VideoEventDispatchState::Like , aweme.aid = ");
            LIZ.append(((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getAid());
            C242549fW.LIZ(X1D.LIZIZ(LIZ));
        }
        return C76800UCe.LIZ;
    }
}
