package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.NHk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59100NHk extends AbstractC59359NRj {
    public final NS7 LJLJL;

    public final NGM LJ() {
        if (C39289FbR.LIZ("feed_descriptive_cta_top") == 1 && this.LJLJJI) {
            return NGM.RENDER_SUCCESS;
        }
        if (!this.LJLJJI) {
            return NGM.LOAD_TIME_OUT;
        }
        return NGM.LOAD_TIME_OUT;
    }

    @Override // X.InterfaceC41034G8o
    public final /* bridge */ /* synthetic */ Object L9() {
        return this.LJLJL;
    }

    public C59100NHk(C59101NHl c59101NHl) {
        this.LJLJL = c59101NHl;
    }

    @Override // X.AbstractC59359NRj
    public final C59066NGc LIZ(Context context, Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        return C59057NFt.LIZJ(context, aweme);
    }

    @Override // X.AbstractC59359NRj
    public final C59421NTt LIZIZ(Context context, Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        return C59057NFt.LIZIZ(context, aweme);
    }
}
