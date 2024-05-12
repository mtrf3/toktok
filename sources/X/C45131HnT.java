package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback;
import com.bytedance.ies.smartmovie.jni.UnorderedMapStrStr;
import defpackage.t1;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.HnT, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C45131HnT extends NLEModelRequestProgressCallback {
    public final List<InterfaceC45209Hoj> LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public NLEModel LIZLLL;
    public UnorderedMapStrStr LJ;

    public void LIZ(NLEModel nLEModel, java.util.Map<String, String> map) {
    }

    public void LIZIZ(int i, int i2, String str) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C45131HnT(List<? extends InterfaceC45209Hoj> listeners) {
        o.LJIIIZ(listeners, "listeners");
        this.LIZ = listeners;
    }

    @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
    public void onResponse(NLEModel nLEModel, UnorderedMapStrStr unorderedMapStrStr) {
        String str;
        String str2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("COMPREHENSION_NLE: onResponse hasComprehensionNLE=");
        Object obj = null;
        if (unorderedMapStrStr != null) {
            str = (String) unorderedMapStrStr.get("comprehension_nle");
        } else {
            str = null;
        }
        LIZ.append(C78685UuP.LJJJZ(str));
        X1D.LIZIZ(LIZ);
        if (unorderedMapStrStr != null && (str2 = (String) unorderedMapStrStr.get("comprehension_nle")) != null && str2.length() > 0) {
            this.LIZIZ = true;
            AqS157S0100000_7 aqS157S0100000_7 = new AqS157S0100000_7(this, 578);
            NLEEditor nLEEditor = new NLEEditor();
            nLEEditor.LJI(str2);
            NLEModel LJ = nLEEditor.LJ();
            Iterator LIZJ = t1.LIZJ(LJ, "nleModel.tracks");
            while (true) {
                if (!LIZJ.hasNext()) {
                    break;
                }
                Object next = LIZJ.next();
                if (((NLETrack) next).LJIIZILJ() == EnumC123864ta.AUDIO) {
                    obj = next;
                    break;
                }
            }
            NLETrack nLETrack = (NLETrack) obj;
            if (nLETrack != null) {
                LJ.removeTrack(nLETrack);
            }
            C45087Hml.LJJIJL(LJ, new C45132HnU(aqS157S0100000_7));
        }
    }

    @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
    public void onSuccess(NLEModel nLEModel, UnorderedMapStrStr unorderedMapStrStr) {
        java.util.Map<String, String> map = null;
        if (this.LIZIZ) {
            if (this.LIZJ) {
                if (unorderedMapStrStr != null) {
                    map = C113554cx.LJJLIIIJLLLLLLLZ(unorderedMapStrStr);
                }
                LIZ(nLEModel, map);
                return;
            } else {
                this.LIZLLL = nLEModel;
                this.LJ = unorderedMapStrStr;
                return;
            }
        }
        if (unorderedMapStrStr != null) {
            map = C113554cx.LJJLIIIJLLLLLLLZ(unorderedMapStrStr);
        }
        LIZ(nLEModel, map);
    }
}
