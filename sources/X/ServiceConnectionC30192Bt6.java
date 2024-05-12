package X;

import Y.ARunnableS41S0100000_5;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.broadcast.obs.OBSBroadcastInteractionFragment;
import com.bytedance.android.livesdk.broadcast.obs.ObsBroadcastFragment;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Bt6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ServiceConnectionC30192Bt6 implements ServiceConnection {
    public final /* synthetic */ ObsBroadcastFragment LJLIL;

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName name) {
        o.LJIIIZ(name, "name");
    }

    public ServiceConnectionC30192Bt6(ObsBroadcastFragment obsBroadcastFragment) {
        this.LJLIL = obsBroadcastFragment;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.ss.ugc.live.sdk.message.interfaces.IMessageManager, O] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName name, IBinder service) {
        o.LJIIIZ(name, "name");
        o.LJIIIZ(service, "service");
        ObsBroadcastFragment obsBroadcastFragment = this.LJLIL;
        C11000bw c11000bw = obsBroadcastFragment.LJLLLLLL;
        Bundle bundle = null;
        if (c11000bw != null) {
            if (c11000bw.LJLJJL == 4) {
                obsBroadcastFragment.Tl(1, -1);
            } else {
                IMessageManager iMessageManager = (IMessageManager) obsBroadcastFragment.LJIIL().kv0(C29927Bop.class);
                if (iMessageManager == null) {
                    iMessageManager = C7N.LJIILL().messageManagerProvider(this.LJLIL.xl().getId(), true, this.LJLIL.getContext());
                }
                obsBroadcastFragment.LJLL = iMessageManager;
                ((C32537Cpp) this.LJLIL.LJIIL().gv0(C29927Bop.class)).LIZ = this.LJLIL.LJLL;
                this.LJLIL.vl();
                ObsBroadcastFragment obsBroadcastFragment2 = this.LJLIL;
                OBSBroadcastInteractionFragment oBSBroadcastInteractionFragment = new OBSBroadcastInteractionFragment();
                obsBroadcastFragment2.getClass();
                if (!obsBroadcastFragment2.mStatusDestroyed && obsBroadcastFragment2.getChildFragmentManager().LJJJIL("AbsInteractionFragment") == null) {
                    obsBroadcastFragment2.LJIIL().rv0(RoomChannel.class, obsBroadcastFragment2.xl());
                    Bundle arguments = obsBroadcastFragment2.getArguments();
                    if (arguments != null) {
                        bundle = arguments.getBundle("extra");
                    }
                    oBSBroadcastInteractionFragment.setArguments(bundle);
                    oBSBroadcastInteractionFragment.vl(obsBroadcastFragment2.LJIIL(), new C30193Bt7(obsBroadcastFragment2));
                    FragmentManager childFragmentManager = obsBroadcastFragment2.getChildFragmentManager();
                    childFragmentManager.getClass();
                    C1B3 c1b3 = new C1B3(childFragmentManager);
                    c1b3.LJIIIIZZ(R.id.eq3, 1, oBSBroadcastInteractionFragment, "AbsInteractionFragment");
                    c1b3.LJI();
                    oBSBroadcastInteractionFragment.postOnViewModulePrepared(new ARunnableS41S0100000_5(obsBroadcastFragment2, 335));
                }
            }
            C0NB.LIZIZ("LivePitayaRunTaskFrequentControlManager", "createRoomSuccess");
            C22800uy.LIZ = 0;
            return;
        }
        o.LJIJI("mStatusService");
        throw null;
    }
}
