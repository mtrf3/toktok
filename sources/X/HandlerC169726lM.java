package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ss.android.vesdk.VEEditor;

/* renamed from: X.6lM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class HandlerC169726lM extends Handler {
    public final /* synthetic */ VEEditor LIZ;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        String obj;
        int i = message.what;
        if (i != 4101) {
            if (i != 4103) {
                if (i != 4105) {
                    if (i != 4117) {
                        if (i != 4133) {
                            if (i != 4157) {
                                return;
                            }
                            this.LIZ.getClass();
                            return;
                        }
                        this.LIZ.getClass();
                        return;
                    }
                    InterfaceC134015Nt interfaceC134015Nt = this.LIZ.LLJIJIL;
                    if (interfaceC134015Nt == null) {
                        return;
                    }
                    interfaceC134015Nt.LIZ(null, -1, -1, -1, 0.0f);
                    this.LIZ.LLJIJIL = null;
                    return;
                }
                if (this.LIZ.LJLLI == null) {
                    return;
                }
                this.LIZ.LJLLI.onCompileProgress(((Float) message.obj).floatValue());
                return;
            }
            if (this.LIZ.LJLLI == null) {
                return;
            }
            if (message.arg1 < 0) {
                InterfaceC134045Nw interfaceC134045Nw = this.LIZ.LJLLI;
                int i2 = message.arg1;
                Object obj2 = message.obj;
                if (obj2 == null) {
                    obj = "";
                } else {
                    obj = obj2.toString();
                }
                interfaceC134045Nw.onCompileError(i2, i2, 0.0f, obj);
            } else {
                this.LIZ.LJLLI.onCompileDone();
            }
            this.LIZ.LJLLI = null;
            return;
        }
        if (this.LIZ.LJLL == null) {
            return;
        }
        this.LIZ.LJLL.LIZ(0);
        this.LIZ.LJLL = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC169726lM(VEEditor vEEditor, Looper looper) {
        super(looper);
        this.LIZ = vEEditor;
    }
}
