package X;

import android.os.Handler;
import android.os.Message;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;

/* renamed from: X.FVc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class HandlerC39072FVc extends Handler {
    public final Handler LIZ;
    public boolean LIZIZ;

    public HandlerC39072FVc(Handler handler) {
        this.LIZ = handler;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object obj;
        super.handleMessage(message);
        FW5.LIZ = Boolean.FALSE;
        FW5.LJIIIIZZ = null;
        if (this.LIZIZ && (obj = message.obj) != null && (obj instanceof FeedItemList)) {
            ((FeedItemList) obj).setReplaceFake();
        }
        this.LIZ.handleMessage(message);
    }
}
