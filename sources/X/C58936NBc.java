package X;

import com.ss.android.ugc.aweme.api.component.interaction.CommerceInteractionComponent;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* renamed from: X.NBc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58936NBc extends AbstractC65781Prl implements InterfaceC88471Ynr<CommerceInteractionComponent, C56222Io, C76800UCe> {
    public static final C58936NBc LJLIL = new C58936NBc();

    public C58936NBc() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(CommerceInteractionComponent commerceInteractionComponent, C56222Io c56222Io) {
        String str;
        CommerceInteractionComponent selectSubscribe = commerceInteractionComponent;
        C56222Io c56222Io2 = c56222Io;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c56222Io2 != null) {
            str = c56222Io2.LJLIL;
        } else {
            str = null;
        }
        if (C06460Ne.LJ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe), str)) {
            InterfaceC58942NBi c4 = selectSubscribe.c4();
            if (c4 != null) {
                c4.LJIILIIL(C58937NBd.LIZ);
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("VideoEventDispatchState::Share , awemeId = ");
            LIZ.append(((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getAid());
            C242549fW.LIZ(X1D.LIZIZ(LIZ));
        }
        return C76800UCe.LIZ;
    }
}
