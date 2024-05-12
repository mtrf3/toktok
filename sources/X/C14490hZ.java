package X;

import Y.IDfS292S0100000;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.linkmic.LiveLinkMicGiftFlyChannel;
import com.bytedance.android.live.linkmic.LivePublicScreenClipChannel;
import com.bytedance.android.live.linkmic.SmallFlyMicGiftAnimationStartEvent;
import com.bytedance.android.live.linkmic.StopFlyMicGiftAnimationEvent;
import com.bytedance.android.livesdk.dataChannel.ScreenClearEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestFlyMicViewUsePoolSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.0hZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14490hZ {
    public final C14560hg LIZ;
    public final C14520hc LIZIZ;

    public final void LIZIZ() {
        C14560hg c14560hg = this.LIZ;
        c14560hg.getClass();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        dataChannelGlobal.getClass();
        dataChannelGlobal.jv0(c14560hg);
        View view = c14560hg.LJ;
        if (view != null) {
            view.removeOnLayoutChangeListener(c14560hg.LJIIIIZZ);
        }
        InterfaceC92693kP interfaceC92693kP = c14560hg.LIZJ;
        if (interfaceC92693kP != null) {
            interfaceC92693kP.dispose();
        }
        C14520hc c14520hc = this.LIZIZ;
        c14520hc.getClass();
        dataChannelGlobal.jv0(c14520hc);
        C14470hX.LIZ.clear();
        c14520hc.LJ.LIZLLL();
        if (!((ArrayList) c14520hc.LIZLLL).isEmpty()) {
            Iterator it = ((ArrayList) c14520hc.LIZLLL).iterator();
            while (it.hasNext()) {
                AnimatorSet animatorSet = (AnimatorSet) it.next();
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
            }
        }
        c14520hc.LJII = null;
        c14520hc.LJI = false;
        if (MultiGuestFlyMicViewUsePoolSetting.INSTANCE.isEnable()) {
            c14520hc.LJFF = null;
        }
    }

    public C14490hZ(DataChannel dataChannel) {
        o.LJIIIZ(dataChannel, "dataChannel");
        this.LIZ = new C14560hg(dataChannel);
        this.LIZIZ = new C14520hc(dataChannel);
    }

    public final void LIZ(View view, LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(view, "view");
        C14560hg c14560hg = this.LIZ;
        c14560hg.LIZLLL = view;
        c14560hg.LJ = view.findViewById(R.id.if2);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        dataChannelGlobal.pv0(LivePublicScreenClipChannel.class, c14560hg, new C2I4(c14560hg));
        if (lifecycleOwner != null) {
            c14560hg.LIZJ = C73943T0h.LIZ().LIZJ(lifecycleOwner, B4Q.class).LIZIZ(new IDfS292S0100000(c14560hg, 29));
        }
        View view2 = c14560hg.LJ;
        if (view2 != null) {
            view2.addOnLayoutChangeListener(c14560hg.LJIIIIZZ);
        }
        C14520hc c14520hc = this.LIZIZ;
        c14520hc.getClass();
        c14520hc.LIZJ = view.getContext();
        c14520hc.LIZIZ = (ViewGroup) view.findViewById(R.id.n4b);
        dataChannelGlobal.ov0(LiveLinkMicGiftFlyChannel.class, c14520hc, new C2I0(c14520hc));
        dataChannelGlobal.ov0(SmallFlyMicGiftAnimationStartEvent.class, c14520hc, new C2I1(c14520hc));
        dataChannelGlobal.ov0(ScreenClearEvent.class, c14520hc, new C2I2(c14520hc));
        dataChannelGlobal.ov0(StopFlyMicGiftAnimationEvent.class, c14520hc, new C2I3(c14520hc));
    }
}
