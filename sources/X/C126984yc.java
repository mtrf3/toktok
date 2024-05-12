package X;

import com.bytedance.ies.nle.editor_jni.NLEError;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AqS133S0200000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.4yc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C126984yc {
    public static final /* synthetic */ int LIZIZ = 0;
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C139025cw.LJLIL);

    public static final void LIZIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecognizeCaptionExecutor stopExtractAudio mVeEditor: ");
        LIZ.append((Object) null);
        H7B.LJ(X1D.LIZIZ(LIZ));
    }

    public static C84674XLa LIZ(VideoPublishEditModel mModel, int i, int i2, int i3, NLEModel nLEModel, InterfaceC65784Pro interfaceC65784Pro) {
        OSZ osz;
        o.LJIIIZ(mModel, "mModel");
        InterfaceC171126nc pathAdapter = C60903NvH.LJIIJJI().LJJIJL().getPathAdapter();
        CreativeInfo creativeInfo = mModel.creativeInfo;
        o.LJIIIIZZ(creativeInfo, "mModel.creativeInfo");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("init_");
        LIZ.append(System.currentTimeMillis());
        String LJIL = pathAdapter.LJIL(creativeInfo, X1D.LIZIZ(LIZ));
        AqS133S0200000_2 aqS133S0200000_2 = new AqS133S0200000_2(nLEModel, mModel, 96);
        C124284uG c124284uG = C124284uG.LJLIL;
        if (nLEModel != null) {
            NLEError LIZ2 = C126694y9.LIZ(LJIL, nLEModel, null, aqS133S0200000_2, i3, i2, i, c124284uG, 256);
            if (LIZ2 == NLEError.SUCCESS) {
                osz = new OSZ(0, "");
            } else {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("nle error ");
                LIZ3.append(LIZ2.name());
                osz = new OSZ(1, X1D.LIZIZ(LIZ3));
            }
            return new C84674XLa(((Number) osz.getFirst()).intValue(), (String) osz.getSecond(), LJIL);
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
