package X;

import kotlin.jvm.internal.o;

/* renamed from: X.W1p, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81621W1p extends C222738of {
    public final /* synthetic */ DialogC81619W1n LJLIL;

    public C81621W1p(DialogC81619W1n dialogC81619W1n) {
        this.LJLIL = dialogC81619W1n;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(IPG error) {
        o.LJIIIZ(error, "error");
        this.LJLIL.LIZ(false);
        W5G w5g = this.LJLIL.LJLJJI;
        if (w5g != null) {
            o.LJI(w5g);
            w5g.setVisibility(0);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(IT4 sourceId) {
        o.LJIIIZ(sourceId, "sourceId");
        this.LJLIL.LIZ(false);
        W5G w5g = this.LJLIL.LJLJJI;
        if (w5g != null) {
            o.LJI(w5g);
            w5g.setVisibility(8);
        }
    }
}
