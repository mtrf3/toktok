package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;

/* renamed from: X.Ikn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47513Ikn extends PthreadThread {
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLIL;

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLIL.invoke();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47513Ikn(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super("ThreadsKt$thread$thread$1");
        this.LJLIL = interfaceC65784Pro;
    }
}
