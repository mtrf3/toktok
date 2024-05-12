package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes9.dex */
public final /* synthetic */ class J9A implements InterfaceC67369QcH {
    public static IY0 LIZ(IY5 iy5) {
        return iy5.LIZIZ(iy5.LIZJ);
    }

    @Override // X.InterfaceC67369QcH
    public Object apply(Object obj) {
        obj.getClass();
        C67499QeN c67499QeN = AbstractC67514Qec.LIZ;
        c67499QeN.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            c67499QeN.LIZ(byteArrayOutputStream, obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static long LIZIZ(String str, long j) {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LJFF(str, j);
    }

    public static void LIZJ(BZI bzi, DataChannel dataChannel, String str, String str2) {
        bzi.LJIILLIIL(dataChannel);
        bzi.LJIJJ(str, str2);
        bzi.LJJIIJZLJL();
    }
}
