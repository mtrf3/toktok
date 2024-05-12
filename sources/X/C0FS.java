package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.0FS */
/* loaded from: classes.dex */
public final /* synthetic */ class C0FS {
    public static /* synthetic */ void LIZIZ(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static Iterator LIZ(NLEEditor nLEEditor, String str, String str2) {
        NLEModel LJ = nLEEditor.LJ();
        o.LJIIIIZZ(LJ, str);
        VecNLETrackSPtr tracks = LJ.getTracks();
        o.LJIIIIZZ(tracks, str2);
        return tracks.iterator();
    }

    public static void LIZJ(StringBuilder sb, int i, StringBuilder sb2, int i2, String str, String str2) {
        sb.append(i);
        C65210PiY.LIZLLL(i2, str, str2, X1D.LIZIZ(sb2));
    }
}
