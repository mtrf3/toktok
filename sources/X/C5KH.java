package X;

import android.content.Context;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETemplateConverter;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.5KH, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5KH {
    public final NLEModel LIZ;
    public final NLETemplateConverter LIZIZ;
    public ArrayList<NLETrackSlot> LIZJ = new ArrayList<>();

    public C5KH(NLEModel nLEModel, String str) {
        this.LIZ = nLEModel;
        this.LIZIZ = new NLETemplateConverter(nLEModel, str);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [X.5KI, X.5KT] */
    public final void LIZ(final int i, final Context context, final String str, final InterfaceC88472Yns interfaceC88472Yns, final boolean z) {
        if (this.LIZJ.isEmpty()) {
            interfaceC88472Yns.invoke(new ArrayList());
            return;
        }
        Object obj = ListProtector.get(this.LIZJ, i);
        o.LJIIIIZZ(obj, "unMutableVideoSlot[index]");
        NLESegmentVideo LJJ = NLESegmentVideo.LJJ(((NLETrackSlot) obj).LJI());
        String inputPath = LJJ.LJ().LIZJ();
        boolean LJIJI = C44694HgQ.LJIJI(inputPath, true);
        o.LJIIIIZZ(inputPath, "inputPath");
        final String LIZIZ = C5KN.LIZIZ(str, inputPath, LJIJI);
        int[] iArr = {C78926UyI.LJJIZ(LJJ.LJIILIIL())};
        int[] iArr2 = {C78926UyI.LJJIZ(LJJ.LJIIL())};
        final C132485Hw c132485Hw = new C132485Hw(LJJ, this, i, str, context, z, interfaceC88472Yns);
        ?? r6 = new C5KT() { // from class: X.5KI
            @Override // X.C5KT
            public final void LJ(String inputPath2, String outputPath) {
                o.LJIIIZ(inputPath2, "inputPath");
                o.LJIIIZ(outputPath, "outputPath");
            }

            @Override // X.C5KT
            public final void LJI(C5KU c5ku) {
            }

            @Override // X.C5KT
            public final void onProgress(float f) {
            }

            @Override // X.C5KT
            public final void LJFF(String inputPath2, String outputPath) {
                o.LJIIIZ(inputPath2, "inputPath");
                o.LJIIIZ(outputPath, "outputPath");
                c132485Hw.invoke(LIZIZ);
            }

            @Override // X.C5KT
            public final void LIZ(String str2, String str3, String str4) {
                HH1.LIZ(str2, "inputPath", str3, "outputPath", str4, "errorInfo");
                C5KH c5kh = C5KH.this;
                int i2 = i;
                String str5 = str;
                Context context2 = context;
                boolean z2 = z;
                InterfaceC88472Yns<ArrayList<NLETrackSlot>, C76800UCe> interfaceC88472Yns2 = interfaceC88472Yns;
                int i3 = i2 + 1;
                if (i3 < c5kh.LIZJ.size()) {
                    c5kh.LIZ(i3, context2, str5, interfaceC88472Yns2, z2);
                } else {
                    interfaceC88472Yns2.invoke(c5kh.LIZJ);
                }
            }
        };
        if (z) {
            H78.LJI("TemplateProducer hasPreload");
            if (LIZIZ.length() > 0 && C44687HgJ.LIZIZ(LIZIZ)) {
                H78.LJI("TemplateProducer pre-resize success");
                c132485Hw.invoke(LIZIZ);
                return;
            }
            C5KJ c5kj = new C5KJ(LIZIZ, c132485Hw, context, inputPath, str, iArr, iArr2, r6);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("waitJobResult: ");
            LIZ.append(inputPath);
            C5KN.LIZJ(X1D.LIZIZ(LIZ));
            XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new C67092kD(inputPath, c5kj, null), 2);
            return;
        }
        H78.LJI("TAG optimizeMediaSize");
        C145765no.LIZIZ(1080, 1080, context, r6, inputPath, LIZIZ, str, iArr, iArr2);
    }
}
