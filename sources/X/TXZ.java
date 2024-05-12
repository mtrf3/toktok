package X;

import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.main.mask.common.animation.AnimationManagerImpl;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.IThemeAbility;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicLayoutAnimationSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TXZ {
    public static final /* synthetic */ int LIZ = 0;

    public static AnimationManagerImpl LIZ(ViewGroup viewGroup, TXY multiGuestContent, LifecycleOwner lifeCycleOwner, IThemeAbility iThemeAbility, DataChannel dataChannel) {
        o.LJIIIZ(multiGuestContent, "multiGuestContent");
        o.LJIIIZ(lifeCycleOwner, "lifeCycleOwner");
        if (LinkMicLayoutAnimationSetting.INSTANCE.useAnimation()) {
            return new AnimationManagerImpl(viewGroup, multiGuestContent, lifeCycleOwner, iThemeAbility, dataChannel);
        }
        return null;
    }
}
