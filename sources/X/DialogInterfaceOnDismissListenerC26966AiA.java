package X;

import android.content.DialogInterface;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import kotlin.jvm.internal.o;

/* renamed from: X.AiA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class DialogInterfaceOnDismissListenerC26966AiA implements DialogInterface.OnDismissListener {
    public final /* synthetic */ InterfaceC88473Ynt<Boolean, Long, String, C76800UCe> LJLIL;
    public final /* synthetic */ long LJLILLLLZI;

    /* JADX WARN: Multi-variable type inference failed */
    public DialogInterfaceOnDismissListenerC26966AiA(InterfaceC88473Ynt<? super Boolean, ? super Long, ? super String, C76800UCe> interfaceC88473Ynt, long j) {
        this.LJLIL = interfaceC88473Ynt;
        this.LJLILLLLZI = j;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface it) {
        String str;
        o.LJIIIIZZ(it, "it");
        boolean LJ = o.LJ(ASQ.LJIIIIZZ(it), ASY.LIZ);
        if (ActivityStack.isAppBackGround()) {
            str = "close";
        } else {
            str = "return";
        }
        InterfaceC88473Ynt<Boolean, Long, String, C76800UCe> interfaceC88473Ynt = this.LJLIL;
        if (interfaceC88473Ynt != null) {
            interfaceC88473Ynt.invoke(Boolean.valueOf(LJ), Long.valueOf(this.LJLILLLLZI), str);
        }
    }
}
