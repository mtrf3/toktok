package com.ss.android.newmedia.message;

import X.C16880lQ;
import X.C35532Dx2;
import X.C38413F5t;
import X.C39116FWu;
import X.C84763XOl;
import X.RunnableC39117FWv;
import android.content.Context;
import com.bytedance.common.utility.collection.WeakHandler;

/* loaded from: classes7.dex */
public abstract class MessageShowHandlerService extends MessageReceiverService {
    public static final WeakHandler LJLIL = new WeakHandler(C16880lQ.LLJJJJ(), new C39116FWu());

    @Override // com.ss.android.newmedia.message.MessageReceiverService, android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
            C35532Dx2.LIZJ();
        }
        super.attachBaseContext(context);
    }

    @Override // com.ss.android.newmedia.message.MessageReceiverService
    public final void onHandleMessage(Context context, int i, String str, int i2, String str2) {
        LJLIL.post(new RunnableC39117FWv(str, i2, str2));
    }
}
