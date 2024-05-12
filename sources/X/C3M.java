package X;

import Y.IDeS402S0100000_5;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import com.bytedance.android.livesdk.chatroom.ui.GameBroadcastFragment;
import com.bytedance.android.livesdk.comp.api.game.GameBroadcastStateChannel;
import com.bytedance.bpea.cert.token.TokenCert;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class C3M implements ServiceConnection {
    public final /* synthetic */ GameBroadcastFragment LJLIL;

    public C3M(GameBroadcastFragment gameBroadcastFragment) {
        this.LJLIL = gameBroadcastFragment;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName name) {
        o.LJIIIZ(name, "name");
        C22940vC c22940vC = this.LJLIL.LJLLLLLL;
        if (c22940vC != null) {
            BZI LIZ = C28787BRn.LIZ("livesdk_live_unexcepted_interruption_service_disconnected");
            LIZ.LJIJJ(c22940vC.LIZIZ(), "anchor_id");
            LIZ.LJIJJ("screen_share", "live_type");
            LIZ.LJIJJ(Long.valueOf(c22940vC.LIZJ()), "room_id");
            LIZ.LJJIIJZLJL();
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Boolean, O] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName name, IBinder service) {
        Boolean bool;
        ActivityC45651qj mo49getActivity;
        boolean z;
        o.LJIIIZ(name, "name");
        o.LJIIIZ(service, "service");
        C11000bw c11000bw = this.LJLIL.LJLZ;
        if (c11000bw != null) {
            if (c11000bw.LJLJJL == 4) {
                z = true;
            } else {
                z = false;
            }
            bool = Boolean.valueOf(z);
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool)) {
            this.LJLIL.Zl(1, -1);
        } else {
            C37661dq c37661dq = this.LJLIL.LJZ;
            if (c37661dq != null) {
                Intent intent = c37661dq.LJJIFFI;
                if (intent != null) {
                    c37661dq.LJIILL(intent, C78857UxB.LJJIIJ(1476788233, "bpea-577"));
                }
                if (C29306Beo.LJJIFFI((Boolean) c37661dq.LIZJ.kv0(BDT.class))) {
                    c37661dq.LIZIZ.Vl(c37661dq.LJJIFFI, c37661dq.LJIIJ, false, c37661dq.LIZJ);
                    ((C32537Cpp) c37661dq.LIZJ.gv0(BDT.class)).LIZ = Boolean.FALSE;
                    CUC cuc = c37661dq.LJIIZILJ;
                    if (cuc != null) {
                        cuc.LJIIJ(false);
                    }
                    c37661dq.LIZJ.rv0(GameBroadcastStateChannel.class, CWI.StateConnected);
                    Iterator it = ((ArrayList) c37661dq.LJJJJL).iterator();
                    while (it.hasNext()) {
                        ((InterfaceC04500Fq) it.next()).LIZJ();
                    }
                }
            }
        }
        GameBroadcastFragment gameBroadcastFragment = this.LJLIL;
        Context context = gameBroadcastFragment.getContext();
        if (context != null) {
            boolean LIZIZ = new AnonymousClass078(context).LIZIZ();
            if (Build.VERSION.SDK_INT >= 33 && !LIZIZ && (mo49getActivity = gameBroadcastFragment.mo49getActivity()) != null) {
                C61099NyR.LIZIZ.LIZIZ(mo49getActivity, TokenCert.Companion.with("bpea-game_broadcast_post_notification_on_start")).LIZ("android.permission.POST_NOTIFICATIONS").LIZJ(new IDeS402S0100000_5(gameBroadcastFragment, 0));
            }
        }
    }
}
