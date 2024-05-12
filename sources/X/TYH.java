package X;

import com.bytedance.android.livesdk.comp.impl.game.linkmic.dialog.GameLinkGuestUserInfoDialog;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TYH {
    public static GameLinkGuestUserInfoDialog LIZ(DataChannel dataChannel, TTR ttr, TT0 tt0, C74813TXt c74813TXt, WeakReference weakReference, TWA twa, TWQ twq, String source) {
        o.LJIIIZ(source, "source");
        GameLinkGuestUserInfoDialog gameLinkGuestUserInfoDialog = new GameLinkGuestUserInfoDialog();
        gameLinkGuestUserInfoDialog.dataChannel = dataChannel;
        gameLinkGuestUserInfoDialog.LJLJI = tt0;
        gameLinkGuestUserInfoDialog.LJLIL = c74813TXt;
        gameLinkGuestUserInfoDialog.LJLILLLLZI = ttr;
        gameLinkGuestUserInfoDialog.LJLJJI = weakReference;
        gameLinkGuestUserInfoDialog.LJLJJL = twa;
        gameLinkGuestUserInfoDialog.LJLJJLL = twq;
        gameLinkGuestUserInfoDialog.LJLJLLL = source;
        return gameLinkGuestUserInfoDialog;
    }
}
