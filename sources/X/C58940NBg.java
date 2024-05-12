package X;

import com.ss.android.ugc.aweme.api.component.interaction.CommerceInteractionComponent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* renamed from: X.NBg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58940NBg extends AbstractC65781Prl implements InterfaceC88471Ynr<CommerceInteractionComponent, C174046sK, C76800UCe> {
    public static final C58940NBg LJLIL = new C58940NBg();

    public C58940NBg() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(CommerceInteractionComponent commerceInteractionComponent, C174046sK c174046sK) {
        String str;
        Aweme aweme;
        CommerceInteractionComponent selectSubscribe = commerceInteractionComponent;
        C174046sK c174046sK2 = c174046sK;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c174046sK2 != null && (aweme = c174046sK2.LJLJI) != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        if (C06460Ne.LJ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe), str)) {
            InterfaceC58942NBi c4 = selectSubscribe.c4();
            if (c4 != null) {
                c4.LJIILIIL(C58943NBj.LIZ);
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("VideoEventDispatchState::Comment , aweme.aid = ");
            LIZ.append(((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getAid());
            C242549fW.LIZ(X1D.LIZIZ(LIZ));
        }
        return C76800UCe.LIZ;
    }
}
