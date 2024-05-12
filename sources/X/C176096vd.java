package X;

import Y.ACallableS106S0100000_3;
import android.os.Handler;
import android.os.Message;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import com.ss.android.ugc.aweme.services.NetworkStateServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.6vd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C176096vd {
    public static final C176126vg LIZ = new C176126vg();
    public static final C176106ve LIZIZ = new C176106ve();
    public static final C174666tK LIZJ = new C174666tK("comment_delete_time", -1, -1, -1, -1, false);
    public static final C176116vf LIZLLL = new C176116vf();
    public static final C175416uX LJ = new C175416uX();
    public static final C174676tL LJFF = new C174676tL();
    public static final HandlerC176136vh LJI = new Handler() { // from class: X.6vh
        {
            C16880lQ.LLJJJJ();
        }

        @Override // android.os.Handler
        public final void handleMessage(Message msg) {
            o.LJIIIZ(msg, "msg");
            super.handleMessage(msg);
            if (msg.what == 0) {
                C176096vd.LIZJ(C176096vd.LJFF);
            }
        }
    };

    public static boolean LIZIZ() {
        INetworkStateService createINetworkStateServicebyMonsterPlugin = NetworkStateServiceImpl.createINetworkStateServicebyMonsterPlugin(false);
        return createINetworkStateServicebyMonsterPlugin.isWeakNetwork() || createINetworkStateServicebyMonsterPlugin.isFakeNetwork();
    }

    public static void LIZ(Object... objArr) {
        int i = 0;
        Object obj = objArr[0];
        if (obj instanceof C176676wZ) {
            C176106ve c176106ve = LIZIZ;
            o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.comment.param.CommentPublishParameters");
            String str = ((AbstractC176686wa) obj).LIZIZ;
            if (str != null) {
                i = str.length();
            }
            c176106ve.LJI = i;
        }
        C176106ve c176106ve2 = LIZIZ;
        c176106ve2.LJFF = LIZIZ();
        c176106ve2.LIZLLL = System.currentTimeMillis();
    }

    public static void LIZJ(AbstractC174686tM event) {
        o.LJIIIZ(event, "event");
        C10K.LIZJ(new ACallableS106S0100000_3(event, 13));
    }
}
