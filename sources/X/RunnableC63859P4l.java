package X;

import com.ss.android.ttvecamera.TECameraCapture;

/* renamed from: X.P4l, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC63859P4l implements Runnable {
    public final /* synthetic */ TECameraCapture LJLIL;
    public final /* synthetic */ float LJLILLLLZI;
    public final /* synthetic */ InterfaceC87361YQj LJLJI;
    public final /* synthetic */ EnumC84152X0y LJLJJI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLJJI.zoomV2(this.LJLIL, this.LJLILLLLZI, this.LJLJI);
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC63859P4l(EnumC84152X0y enumC84152X0y, TECameraCapture tECameraCapture, float f, InterfaceC87361YQj interfaceC87361YQj) {
        this.LJLJJI = enumC84152X0y;
        this.LJLIL = tECameraCapture;
        this.LJLILLLLZI = f;
        this.LJLJI = interfaceC87361YQj;
    }
}
