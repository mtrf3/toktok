package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

/* renamed from: X.ZXa, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public class HandlerC90082ZXa extends Handler {
    public final /* synthetic */ C90865ZlN LIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC90082ZXa(C90865ZlN c90865ZlN) {
        super(C16880lQ.LLJJJJ());
        this.LIZ = c90865ZlN;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        String string;
        int i = message.what;
        int i2 = message.arg1;
        Object obj = message.obj;
        Bundle peekData = message.peekData();
        AbstractC90104ZXw abstractC90104ZXw = this.LIZ.LJIIIZ.get(i2);
        if (abstractC90104ZXw == null) {
            return;
        }
        this.LIZ.LJIIIZ.remove(i2);
        if (i != 3) {
            if (i != 4) {
                return;
            }
            if (peekData == null) {
                string = null;
            } else {
                string = peekData.getString("error");
            }
            abstractC90104ZXw.LIZ((Bundle) obj, string);
            return;
        }
        abstractC90104ZXw.LIZIZ((Bundle) obj);
    }
}
