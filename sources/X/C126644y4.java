package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLENode;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.4y4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C126644y4 implements C52R {
    public final InterfaceC124924vI LIZ;
    public final C62822Ol8 LIZIZ;
    public final C62822Ol8 LIZJ;
    public final C62822Ol8 LIZLLL;
    public final C62822Ol8 LJ;

    public final NLEEditor LJI() {
        return (NLEEditor) this.LIZJ.getValue();
    }

    public final ArrayList<InterfaceC126664y6> LJII() {
        return (ArrayList) this.LJ.getValue();
    }

    public final InterfaceC127784zu LJIIIIZZ() {
        return (InterfaceC127784zu) this.LIZIZ.getValue();
    }

    @Override // X.C52R
    public final boolean LIZIZ() {
        return LJI().LIZ();
    }

    @Override // X.C52R
    public final boolean LIZJ() {
        NLEEditor LJI = LJI();
        return NLEEditorJniJNI.NLEEditor_canRedo(LJI.LIZ, LJI);
    }

    @Override // X.C52R
    public final boolean LIZLLL() {
        if (LJI().LIZ()) {
            LJIIIIZZ().pause();
            long H9 = LJIIIIZZ().H9();
            try {
                Iterator<InterfaceC126664y6> it = LJII().iterator();
                while (it.hasNext()) {
                    it.next().LIZ(EnumC126674y7.UNDO);
                }
                NLEEditor LJI = LJI();
                boolean NLEEditor_undo__SWIG_1 = NLEEditorJniJNI.NLEEditor_undo__SWIG_1(LJI.LIZ, LJI);
                Iterator<InterfaceC126664y6> it2 = LJII().iterator();
                while (it2.hasNext()) {
                    it2.next().LIZIZ(EnumC126674y7.UNDO, NLEEditor_undo__SWIG_1);
                }
            } catch (Exception e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("NleModel: undo:");
                LIZ.append(e.getMessage());
                C131935Ft.LIZJ(X1D.LIZIZ(LIZ));
            }
            LJIIIIZZ().M9(C78926UyI.LJJJI(H9));
            C131935Ft.LIZ("NleModel: " + ((NLENode) this.LIZLLL.getValue()).toJsonString());
            return true;
        }
        return false;
    }

    @Override // X.C52R
    public final boolean LJFF() {
        NLEEditor LJI = LJI();
        if (NLEEditorJniJNI.NLEEditor_canRedo(LJI.LIZ, LJI)) {
            LJIIIIZZ().pause();
            long H9 = LJIIIIZZ().H9();
            Iterator<InterfaceC126664y6> it = LJII().iterator();
            while (it.hasNext()) {
                it.next().LIZ(EnumC126674y7.REDO);
            }
            NLEEditor LJI2 = LJI();
            boolean NLEEditor_redo__SWIG_1 = NLEEditorJniJNI.NLEEditor_redo__SWIG_1(LJI2.LIZ, LJI2);
            if (NLEEditor_redo__SWIG_1) {
                Iterator<InterfaceC126664y6> it2 = LJII().iterator();
                while (it2.hasNext()) {
                    it2.next().LIZIZ(EnumC126674y7.REDO, NLEEditor_redo__SWIG_1);
                }
                LJIIIIZZ().M9(C78926UyI.LJJJI(H9));
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("NleModel: ");
                LIZ.append(((NLENode) this.LIZLLL.getValue()).toJsonString());
                C131935Ft.LIZ(X1D.LIZIZ(LIZ));
            }
            return true;
        }
        return false;
    }

    public C126644y4(InterfaceC124924vI editorContext) {
        o.LJIIIZ(editorContext, "editorContext");
        this.LIZ = editorContext;
        this.LIZIZ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 839));
        this.LIZJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 837));
        this.LIZLLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 838));
        this.LJ = C221108m2.LIZIZ(C126654y5.LJLIL);
    }

    @Override // X.C52R
    public final void LIZ(InterfaceC126664y6 listener) {
        o.LJIIIZ(listener, "listener");
        if (LJII().contains(listener)) {
            LJII().remove(listener);
        }
    }

    @Override // X.C52R
    public final void LJ(InterfaceC126664y6 listener) {
        o.LJIIIZ(listener, "listener");
        if (!LJII().contains(listener)) {
            LJII().add(listener);
        }
    }
}
