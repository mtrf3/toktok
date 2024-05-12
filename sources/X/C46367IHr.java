package X;

import com.ss.android.ugc.aweme.player.sdk.api.OnPlayerPreparedListener;

/* renamed from: X.IHr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46367IHr implements OnPlayerPreparedListener {
    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnPlayerPreparedListener
    public final void onPreparedReady(String str) {
        FAR.LIZLLL = true;
        if (!C56662Kg.LIZ().LJIIIIZZ("player_prerender_end_to_onprepared")) {
            C56662Kg.LIZ().LJFF("player_prerender_end_to_onprepared", false);
        }
        if (!C56662Kg.LIZ().LJIIIIZZ("cold_boot_start_to_prepared_end")) {
            C56662Kg.LIZ().LJFF("cold_boot_start_to_prepared_end", false);
        }
        if (!C56662Kg.LIZ().LJII("player_prepared_end_to_tryplay")) {
            C56662Kg.LIZ().LIZJ("player_prepared_end_to_tryplay", false);
        }
    }
}
