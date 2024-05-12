package X;

import com.bytedance.bpea.basics.Cert;

/* loaded from: classes12.dex */
public final class P76 implements Runnable {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ int[] LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ Cert LJLJJI;
    public final /* synthetic */ EnumC84152X0y LJLJJL;

    public final void LIZ() {
        long currentTimeMillis = System.currentTimeMillis() - this.LJLIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Push close task cost: ");
        LIZ.append(currentTimeMillis);
        C63922P6w.LIZLLL("TECameraServer", X1D.LIZIZ(LIZ));
        this.LJLILLLLZI[0] = this.LJLJJL.close(this.LJLJI, this.LJLJJI);
        this.LJLJJL.mIsCameraPendingClose = false;
        if (this.LJLJI) {
            this.LJLJJL.mCameraClientCondition.open();
        }
        long currentTimeMillis2 = System.currentTimeMillis() - this.LJLIL;
        C87367YQp.LIZ("te_record_camera_push_close_task_time", currentTimeMillis);
        C87367YQp.LIZ("te_record_camera_close_cost", currentTimeMillis2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public P76(EnumC84152X0y enumC84152X0y, long j, int[] iArr, boolean z, Cert cert) {
        this.LJLJJL = enumC84152X0y;
        this.LJLIL = j;
        this.LJLILLLLZI = iArr;
        this.LJLJI = z;
        this.LJLJJI = cert;
    }
}
