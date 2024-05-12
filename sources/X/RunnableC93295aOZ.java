package X;

import com.bytedance.pitaya.network.DefaultHttpClient;

/* renamed from: X.aOZ, reason: case insensitive filesystem */
/* loaded from: classes30.dex */
public final class RunnableC93295aOZ implements Runnable {
    public final /* synthetic */ DefaultHttpClient LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ byte[] LJLJI;
    public final /* synthetic */ EnumC93298aOc LJLJJI;
    public final /* synthetic */ InterfaceC93314aOs LJLJJL;

    public RunnableC93295aOZ(DefaultHttpClient defaultHttpClient, String str, byte[] bArr, EnumC93298aOc enumC93298aOc, InterfaceC93314aOs interfaceC93314aOs) {
        this.LJLIL = defaultHttpClient;
        this.LJLILLLLZI = str;
        this.LJLJI = bArr;
        this.LJLJJI = enumC93298aOc;
        this.LJLJJL = interfaceC93314aOs;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        String str;
        try {
            DefaultHttpClient defaultHttpClient = this.LJLIL;
            String str2 = this.LJLILLLLZI;
            byte[] bArr = this.LJLJI;
            if (bArr != null) {
                str = new String(bArr, PVC.LIZ);
            } else {
                str = "";
            }
            defaultHttpClient.makeHttpPost(str2, str, this.LJLJJI, this.LJLJJL);
        } finally {
            if (LIZ) {
            }
        }
    }
}
