package X;

import com.ss.android.ttvecamera.TECameraCapture;

/* renamed from: X.P5q, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC63890P5q implements Runnable {
    public final /* synthetic */ TECameraCapture LJLIL;
    public final /* synthetic */ InterfaceC87361YQj LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ EnumC84152X0y LJLJJI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLJJI.queryZoomAbility(this.LJLIL, this.LJLILLLLZI, this.LJLJI);
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC63890P5q(EnumC84152X0y enumC84152X0y, TECameraCapture tECameraCapture, InterfaceC87361YQj interfaceC87361YQj, boolean z) {
        this.LJLJJI = enumC84152X0y;
        this.LJLIL = tECameraCapture;
        this.LJLILLLLZI = interfaceC87361YQj;
        this.LJLJI = z;
    }
}
