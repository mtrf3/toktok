package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.A8h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25739A8h implements S1I {
    @Override // X.S1I
    public final void LIZJ(Context context) {
        o.LJIIIZ(context, "context");
    }

    @Override // X.S1I
    public final C8IM LIZIZ(Context context) {
        o.LJIIIZ(context, "context");
        return new C25738A8g(context);
    }

    @Override // X.S1I
    public final boolean LIZ(Aweme aweme, AnchorCommonStruct anchorCommonStruct, boolean z, int i) {
        o.LJIIIZ(aweme, "aweme");
        if (z && i == EnumC42934Gt8.ANCHOR_TICKETMASTER.getTYPE()) {
            return true;
        }
        return false;
    }
}