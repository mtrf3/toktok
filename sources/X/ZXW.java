package X;

import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import androidx.mediarouter.media.MediaRouteProviderService;
import com.bytedance.mt.protector.impl.collections.ListProtector;

/* loaded from: classes29.dex */
public final class ZXW extends Handler {
    public final /* synthetic */ MediaRouteProviderService LIZ;

    public ZXW(MediaRouteProviderService mediaRouteProviderService) {
        this.LIZ = mediaRouteProviderService;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C90595Zh1 c90595Zh1;
        int LIZLLL;
        if (message.what != 1 || (LIZLLL = (c90595Zh1 = this.LIZ.LJLJJL).LIZLLL((Messenger) message.obj)) < 0) {
            return;
        }
        ((ZXV) ListProtector.remove(c90595Zh1.LIZIZ, LIZLLL)).LIZLLL();
    }
}
