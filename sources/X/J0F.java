package X;

import android.content.Context;
import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class J0F extends C47778Ip4 {
    public final InterfaceC65784Pro<C76800UCe> LJI;

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void setOnCompletionListener(IMediaPlayer.OnCompletionListener<AbsPlayer<C47778Ip4>> onCompletionListener) {
        this.completionListener = new J0E(this, onCompletionListener);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J0F(Context context, AqS164S0100000_14 aqS164S0100000_14) {
        super(context);
        o.LJIIIZ(context, "context");
        this.LJI = aqS164S0100000_14;
    }
}
