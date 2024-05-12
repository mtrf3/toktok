package X;

/* renamed from: X.MiG, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57548MiG extends C222898ov {
    public final /* synthetic */ ViewOnClickListenerC57546MiE LJLIL;

    public C57548MiG(ViewOnClickListenerC57546MiE viewOnClickListenerC57546MiE) {
        this.LJLIL = viewOnClickListenerC57546MiE;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(IPG ipg) {
        this.LJLIL.P().setVisibility(0);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(IT4 it4) {
        ViewOnClickListenerC57546MiE viewOnClickListenerC57546MiE = this.LJLIL;
        viewOnClickListenerC57546MiE.LJLLLLLL = true;
        viewOnClickListenerC57546MiE.T();
        int adapterPosition = this.LJLIL.getAdapterPosition();
        ViewOnClickListenerC57546MiE viewOnClickListenerC57546MiE2 = this.LJLIL;
        if (adapterPosition != viewOnClickListenerC57546MiE2.LJLJJI.LJZL) {
            viewOnClickListenerC57546MiE2.Q().pause();
        }
    }
}
