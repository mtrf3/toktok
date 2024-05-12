package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.android.livesdk.game.model.GameLiveFragment;

/* loaded from: classes6.dex */
public class HighlightFragmentReadyMessage extends CR6 {

    @InterfaceC65349Pkn("live_fragment")
    public GameLiveFragment gameLiveFragment;

    public HighlightFragmentReadyMessage() {
        this.type = EnumC31509CYf.HIGHLIGHT_FRAGMENT_READY_MESSAGE;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("HighlightFragmentReadyMessage{gameLiveFragment=");
        LIZ.append(this.gameLiveFragment);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }
}
