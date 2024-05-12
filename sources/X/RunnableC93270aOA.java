package X;

import com.bytedance.pitaya.bdcomponentimpl.network.TTNetHttpClientImpl;

/* renamed from: X.aOA, reason: case insensitive filesystem */
/* loaded from: classes30.dex */
public final class RunnableC93270aOA implements Runnable {
    public final /* synthetic */ TTNetHttpClientImpl LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ byte[] LJLJI;
    public final /* synthetic */ InterfaceC93314aOs LJLJJI;
    public final /* synthetic */ EnumC93298aOc LJLJJL;

    public RunnableC93270aOA(TTNetHttpClientImpl tTNetHttpClientImpl, String str, byte[] bArr, InterfaceC93314aOs interfaceC93314aOs, EnumC93298aOc enumC93298aOc) {
        this.LJLIL = tTNetHttpClientImpl;
        this.LJLILLLLZI = str;
        this.LJLJI = bArr;
        this.LJLJJI = interfaceC93314aOs;
        this.LJLJJL = enumC93298aOc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLIL.postInWorkThread(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL);
        } finally {
            if (LIZ) {
            }
        }
    }
}
