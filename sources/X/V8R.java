package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.influencer.ecommercelive.framework.settings.LynxDragListUIView;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class V8R extends Handler {
    public final /* synthetic */ LynxDragListUIView LIZ;

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        C1C8 c1c8;
        o.LJIIIZ(msg, "msg");
        super.handleMessage(msg);
        if (msg.what == 0 && (c1c8 = this.LIZ.LLIL) != null) {
            Object obj = msg.obj;
            o.LJII(obj, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.ViewHolder");
            c1c8.LJIJI((RecyclerView.ViewHolder) obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V8R(LynxDragListUIView lynxDragListUIView, Looper looper) {
        super(looper);
        this.LIZ = lynxDragListUIView;
    }
}
