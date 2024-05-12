package X;

import android.os.Message;
import com.ss.android.vesdk.VEEditor;

/* loaded from: classes16.dex */
public class YOF implements YOV {
    public final /* synthetic */ VEEditor LIZ;

    public YOF(VEEditor vEEditor) {
        this.LIZ = vEEditor;
    }

    @Override // X.YOV
    public final int LIZ(byte[] bArr, int i, int i2, int i3, float f) {
        VEEditor vEEditor = this.LIZ;
        InterfaceC134015Nt interfaceC134015Nt = vEEditor.LLJIJIL;
        if (interfaceC134015Nt == null) {
            return -100;
        }
        if (bArr == null && vEEditor.LJLJLLL != null) {
            Message message = new Message();
            message.what = 4117;
            this.LIZ.LJLJLLL.sendMessage(message);
            return 0;
        }
        return interfaceC134015Nt.LIZ(bArr, i, i2, i3, f);
    }
}
