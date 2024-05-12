package X;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.wallet.callback.CallbackInput;
import com.google.android.gms.wallet.callback.zzd;

/* renamed from: X.Qay, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class HandlerC67288Qay extends HandlerC67289Qaz {
    public final /* synthetic */ zzd LIZ;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.replyTo == null) {
            return;
        }
        byte[] byteArray = message.getData().getByteArray("extra_callback_input");
        QH7.LJIIIIZZ(byteArray);
        CallbackInput callbackInput = (CallbackInput) C64476PSe.LIZ(byteArray, CallbackInput.CREATOR);
        String string = message.getData().getString("message_task_tag");
        QH7.LJIIIIZZ(string);
        this.LIZ.LJLILLLLZI.execute(new RunnableC67290Qb0(this.LIZ, callbackInput, message.replyTo, string, message.arg1));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC67288Qay(zzd zzdVar, Looper looper) {
        super(looper);
        this.LIZ = zzdVar;
    }
}
