package X;

import androidx.lifecycle.Observer;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.internal.LobbyInvisibleActivity;

/* loaded from: classes12.dex */
public final class QB2 implements Observer<AuthResult> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ LobbyInvisibleActivity LJLILLLLZI;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(AuthResult authResult) {
        QBB LIZ = QBB.LIZ();
        String str = this.LJLIL;
        LIZ.LIZIZ(this.LJLILLLLZI.LJLJJI, authResult, str);
        this.LJLILLLLZI.finish();
    }

    public QB2(LobbyInvisibleActivity lobbyInvisibleActivity, String str) {
        this.LJLILLLLZI = lobbyInvisibleActivity;
        this.LJLIL = str;
    }
}
