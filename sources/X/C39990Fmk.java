package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommercelive.business.player.audio.EcAudioPlayer;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Fmk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39990Fmk {
    public static EcAudioPlayer LIZ(LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        HashMap<LifecycleOwner, EcAudioPlayer> hashMap = EcAudioPlayer.LJLJJL;
        EcAudioPlayer ecAudioPlayer = hashMap.get(lifecycleOwner);
        if (ecAudioPlayer == null) {
            EcAudioPlayer ecAudioPlayer2 = new EcAudioPlayer(lifecycleOwner);
            hashMap.put(lifecycleOwner, ecAudioPlayer2);
            return ecAudioPlayer2;
        }
        return ecAudioPlayer;
    }
}
