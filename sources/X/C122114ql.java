package X;

import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.VecFloat;
import com.bytedance.ies.nle.editor_jni.VecString;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4ql, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122114ql {
    public final C133765Mu LIZ;

    public C122114ql(C133765Mu editor) {
        o.LJIIIZ(editor, "editor");
        this.LIZ = editor;
    }

    public final void LIZIZ(List<String> composerNodePath) {
        o.LJIIIZ(composerNodePath, "composerNodePath");
        C122034qd LJI = this.LIZ.LJI();
        C121574pt LIZIZ = LJI.LJ().LIZIZ();
        if (LIZIZ != null) {
            Iterator<String> it = composerNodePath.iterator();
            while (it.hasNext()) {
                LIZIZ.LIZ(it.next());
            }
            LJI.LJ().LJJIIJZLJL(LIZIZ);
        }
    }

    public final void LIZJ(String[] strArr, String[] nodeKeys, float[] fArr) {
        o.LJIIIZ(nodeKeys, "nodeKeys");
        C122034qd LJI = this.LIZ.LJI();
        C121574pt LIZIZ = LJI.LJ().LIZIZ();
        if (LIZIZ != null) {
            C5JW S8 = LJI.LJIIJJI.S8();
            VecString vecString = new VecString(strArr);
            VecString vecString2 = new VecString(nodeKeys);
            VecFloat vecFloat = new VecFloat();
            NLEEditorJniJNI.VecFloat_reserve(vecFloat.LJLIL, vecFloat, fArr.length);
            for (float f : fArr) {
                vecFloat.LIZJ(Float.valueOf(f));
            }
            S8.LJII(vecString, vecString2, vecFloat, LIZIZ.LIZ);
        }
    }

    public final void LIZ(String str, String str2, String str3, List list) {
        C122034qd LJI = this.LIZ.LJI();
        C121574pt LIZIZ = LJI.LJ().LIZIZ();
        if (LIZIZ == null) {
            LIZIZ = new C121574pt(EnumC121534pp.COLOR);
        }
        LIZIZ.LIZLLL(str, str2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            OSZ osz = (OSZ) it.next();
            LIZIZ.LIZJ(str, (String) osz.getFirst(), (Float) osz.getSecond());
        }
        if (str3 != null) {
            LIZIZ.LIZIZ(str, str3);
        }
        LJI.LJ().LJJIIJZLJL(LIZIZ);
    }
}
