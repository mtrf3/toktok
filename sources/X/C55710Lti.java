package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.Lti, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55710Lti extends AbstractC65781Prl implements InterfaceC88472Yns<C55127LkJ, Boolean> {
    public static final C55710Lti LJLIL = new C55710Lti();

    public C55710Lti() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(C55127LkJ c55127LkJ) {
        Aweme aweme;
        C55127LkJ typeParams = c55127LkJ;
        o.LJIIIZ(typeParams, "typeParams");
        boolean z = false;
        if (C195937mX.LJII(typeParams.LIZ) && !C55697LtV.LIZ(typeParams.LIZ) && (aweme = typeParams.LIZ) != null && aweme.getAwemeType() == 41) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
