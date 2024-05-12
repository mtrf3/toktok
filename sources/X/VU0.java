package X;

import Y.ARunnableS33S0200000_14;
import android.app.Application;
import android.content.res.Resources;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.lynx.component.svg.UISvg;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.base.LLog;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes15.dex */
public final class VU0 implements InterfaceC39983Fmd {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ InterfaceC79485VHl LIZIZ;

    /* JADX WARN: Finally extract failed */
    @Override // X.InterfaceC39983Fmd
    public final void LIZ(C39982Fmc c39982Fmc) {
        String LJJIFFI;
        C87698YbO LIZJ;
        try {
            LJJIFFI = C79043V0l.LJJIFFI(c39982Fmc.LIZJ);
        } catch (VU3 e) {
            c39982Fmc.LIZIZ = e.toString();
            new RuntimeException(e);
        }
        if (TextUtils.isEmpty(LJJIFFI)) {
            c39982Fmc.LIZIZ = "data is empty!";
            LIZIZ(c39982Fmc);
            return;
        }
        if (this.LIZ.startsWith("res:///")) {
            Application application = LynxEnv.LJIIIZ().LIZ;
            int parseInt = CastIntegerProtector.parseInt(LJJIFFI);
            Resources resources = application.getResources();
            C87696YbM c87696YbM = new C87696YbM();
            InputStream openRawResource = resources.openRawResource(parseInt);
            try {
                LIZJ = c87696YbM.LIZJ(openRawResource);
                try {
                    openRawResource.close();
                } catch (IOException unused) {
                }
            } catch (Throwable th) {
                try {
                    openRawResource.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
        } else {
            LIZJ = C87698YbO.LIZJ(LJJIFFI);
        }
        UISvg uISvg = ((VU2) this.LIZIZ).LIZ;
        uISvg.getClass();
        C79411VEp.LIZJ(new ARunnableS33S0200000_14(uISvg, LIZJ, 82));
    }

    @Override // X.InterfaceC39983Fmd
    public final void LIZIZ(C39982Fmc c39982Fmc) {
        InterfaceC79485VHl interfaceC79485VHl = this.LIZIZ;
        String str = c39982Fmc.LIZIZ;
        interfaceC79485VHl.getClass();
        LLog.LIZLLL(4, "lynx_UISvg", str);
    }

    public VU0(String str, VU2 vu2) {
        this.LIZ = str;
        this.LIZIZ = vu2;
    }
}
