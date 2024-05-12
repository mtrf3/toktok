package X;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.ugc.aweme.friendstab.api.FriendsFeedResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LWW<T> implements InterfaceC64592gB {
    public final /* synthetic */ C54384LWa LJLIL;
    public final /* synthetic */ LWX LJLILLLLZI;
    public final /* synthetic */ Handler LJLJI;
    public final /* synthetic */ String LJLJJI;

    public LWW(C54384LWa c54384LWa, LWX lwx, WeakHandler weakHandler, String str) {
        this.LJLIL = c54384LWa;
        this.LJLILLLLZI = lwx;
        this.LJLJI = weakHandler;
        this.LJLJJI = str;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        FriendsFeedResponse friendsFeedResponse = (FriendsFeedResponse) obj;
        int i = 0;
        this.LJLIL.LIZIZ = false;
        this.LJLILLLLZI.LJIIIZ();
        Message obtainMessage = this.LJLJI.obtainMessage(0);
        o.LJIIIIZZ(obtainMessage, "mHandler.obtainMessage(MSG_REQUEST)");
        obtainMessage.obj = friendsFeedResponse;
        obtainMessage.sendToTarget();
        if (!LX1.LJIILIIL) {
            if (friendsFeedResponse != null) {
                i = friendsFeedResponse.preload;
            }
            LX1.LJIIJ = i;
            LX1.LJIIJJI = C78857UxB.LJJJIL(this.LJLJJI);
            LX1.LIZLLL = SystemClock.elapsedRealtime();
        }
    }
}
