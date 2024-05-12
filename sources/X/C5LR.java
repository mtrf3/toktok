package X;

import com.ss.android.vesdk.runtime.VEEditorResManager;
import kotlin.jvm.internal.o;

/* renamed from: X.5LR, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5LR implements InterfaceC133425Lm {
    public final InterfaceC153045zY LIZ;
    public boolean LIZIZ;
    public VEEditorResManager LIZJ;
    public InterfaceC88472Yns<? super Double, C76800UCe> LIZLLL;

    public final void LIZ() {
        this.LIZIZ = false;
        C122034qd LJJI = C17N.LJJI(LIZLLL());
        if (LJJI != null) {
            LJJI.LIZLLL().LJJI();
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public abstract InterfaceC153045zY LIZLLL();

    public final String[] LIZIZ() {
        String str;
        C122034qd LJJI = C17N.LJJI(LIZLLL());
        if (LJJI != null) {
            C121864qM LJJIL = LJJI.LIZLLL().LJJIL(EnumC121854qL.AUDIO);
            if (LJJIL != null && (str = LJJIL.LIZIZ) != null) {
                return new String[]{str};
            }
            return null;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final String[] LIZJ() {
        String str;
        C122034qd LJJI = C17N.LJJI(LIZLLL());
        if (LJJI != null) {
            C121864qM LJJIL = LJJI.LIZLLL().LJJIL(EnumC121854qL.VIDEO);
            if (LJJIL != null && (str = LJJIL.LIZIZ) != null) {
                return new String[]{str};
            }
            return null;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final String[] LJ() {
        VEEditorResManager LJFF = LJFF();
        if (LJFF != null) {
            return LJFF.mVideoPaths;
        }
        return null;
    }

    public final boolean LJI() {
        if (LIZJ() != null) {
            return true;
        }
        return false;
    }

    public VEEditorResManager LJFF() {
        return this.LIZJ;
    }

    public C5LR(InterfaceC153045zY srcVEEditor) {
        o.LJIIIZ(srcVEEditor, "srcVEEditor");
        this.LIZ = srcVEEditor;
    }
}
