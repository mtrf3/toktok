package X;

import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.videoshop.controller.RefactorVideoController;

/* loaded from: classes16.dex */
public class YST implements WeakHandler.IHandler {
    public final /* synthetic */ RefactorVideoController LJLIL;

    public YST(RefactorVideoController refactorVideoController) {
        this.LJLIL = refactorVideoController;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        java.util.Map map;
        switch (message.what) {
            case 1001:
                Object obj = message.obj;
                if (obj instanceof java.util.Map) {
                    map = (java.util.Map) obj;
                } else {
                    map = null;
                }
                this.LJLIL.responseFrameDraw(message.arg1, map);
                return;
            case 1002:
                this.LJLIL.responseBarrageMaskInfo(message.getData());
                return;
            case 1003:
                this.LJLIL.responseSubtitlePathInfo();
                return;
            case 1004:
                this.LJLIL.responseSubtitleInfoCallback(message.getData());
                return;
            case 1005:
                this.LJLIL.responseSubtitleSwitchComplete(message.getData());
                return;
            default:
                return;
        }
    }
}
