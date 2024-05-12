package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.Jso, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50558Jso {
    public static final /* synthetic */ int LIZ = 0;

    public static Fragment LIZ(ActivityC45651qj context) {
        C50559Jsp c50559Jsp;
        WeakReference<Fragment> weakReference;
        o.LJIIIZ(context, "context");
        InterfaceC55251LmJ LJII = C55230Lly.LIZLLL(context, null).getTree().LJII(C50559Jsp.class, "source_default_key");
        if (LJII == null || (c50559Jsp = (C50559Jsp) LJII.getSource()) == null || (weakReference = c50559Jsp.LJLIL) == null) {
            return null;
        }
        return weakReference.get();
    }

    public static void LIZIZ(ActivityC45651qj context, AbsSearchBaseFragment absSearchBaseFragment) {
        o.LJIIIZ(context, "context");
        C55230Lly.LIZLLL(context, null).getTree().LIZIZ("source_default_key", new C50559Jsp(new WeakReference(absSearchBaseFragment)), C50559Jsp.class);
    }
}
