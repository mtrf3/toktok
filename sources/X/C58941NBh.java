package X;

import com.ss.android.ugc.aweme.api.component.interaction.CommerceInteractionComponent;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* renamed from: X.NBh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58941NBh extends AbstractC65781Prl implements InterfaceC88471Ynr<CommerceInteractionComponent, C193097hx, C76800UCe> {
    public static final C58941NBh LJLIL = new C58941NBh();

    public C58941NBh() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(CommerceInteractionComponent commerceInteractionComponent, C193097hx c193097hx) {
        String str;
        CommerceInteractionComponent selectSubscribe = commerceInteractionComponent;
        C193097hx c193097hx2 = c193097hx;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c193097hx2 != null) {
            str = c193097hx2.LJLIL;
        } else {
            str = null;
        }
        if (C06460Ne.LJ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe), str)) {
            InterfaceC58942NBi c4 = selectSubscribe.c4();
            if (c4 != null) {
                c4.LJIILIIL(C58944NBk.LIZ);
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("VideoEventDispatchState::Favorite , aweme.aid = ");
            LIZ.append(((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getAid());
            C242549fW.LIZ(X1D.LIZIZ(LIZ));
        }
        return C76800UCe.LIZ;
    }
}
