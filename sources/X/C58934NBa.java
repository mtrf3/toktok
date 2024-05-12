package X;

import com.ss.android.ugc.aweme.api.component.interaction.CommerceInteractionComponent;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* renamed from: X.NBa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58934NBa extends AbstractC65781Prl implements InterfaceC88471Ynr<CommerceInteractionComponent, C56332Iz, C76800UCe> {
    public static final C58934NBa LJLIL = new C58934NBa();

    public C58934NBa() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(CommerceInteractionComponent commerceInteractionComponent, C56332Iz c56332Iz) {
        String str;
        CommerceInteractionComponent selectSubscribe = commerceInteractionComponent;
        C56332Iz c56332Iz2 = c56332Iz;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c56332Iz2 != null) {
            str = c56332Iz2.LJLIL;
        } else {
            str = null;
        }
        if (C06460Ne.LJ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe), str)) {
            InterfaceC58942NBi c4 = selectSubscribe.c4();
            if (c4 != null) {
                c4.LJIILIIL(C58935NBb.LIZ);
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("VideoEventDispatchState::LongPress , aweme.aid = ");
            LIZ.append(((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getAid());
            C242549fW.LIZ(X1D.LIZIZ(LIZ));
        }
        return C76800UCe.LIZ;
    }
}
