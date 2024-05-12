package X;

import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6OA, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6OA {
    public final List LIZ;
    public final LifecycleOwner LIZIZ;
    public final C1NS<TextStickerModel> LIZJ;
    public final C6OE LIZLLL;
    public final C6O5 LJ;
    public final AnonymousClass635 LJFF;
    public final C1NS<C6O4> LJI;
    public final C159586Oc LJII;
    public final ViewGroup LJIIIIZZ;
    public int LJIIIZ;

    public final C6O8 LIZ(C65776Prg c65776Prg) {
        Object obj;
        Iterator it = ((ArrayList) this.LIZ).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (c65776Prg.LIZ(obj)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C6O8 c6o8 = (C6O8) obj;
        if (c6o8 == null) {
            return null;
        }
        T2R.LJIILIIL(c6o8, c65776Prg);
        return c6o8;
    }

    public final void LIZIZ(C6O6 c6o6) {
        ((ArrayList) this.LIZ).add(c6o6);
    }

    public C6OA(LifecycleOwner lifecycleOwner, C1NS c1ns, C6OE c6oe, C6O5 c6o5, AnonymousClass635 config, C1NS editViewTextStickerEditState, C159586Oc editViewActions, ViewGroup viewGroup) {
        o.LJIIIZ(config, "config");
        o.LJIIIZ(editViewTextStickerEditState, "editViewTextStickerEditState");
        o.LJIIIZ(editViewActions, "editViewActions");
        this.LIZ = new ArrayList();
        this.LIZIZ = lifecycleOwner;
        this.LIZJ = c1ns;
        this.LIZLLL = c6oe;
        this.LJ = c6o5;
        this.LJFF = config;
        this.LJI = editViewTextStickerEditState;
        this.LJII = editViewActions;
        this.LJIIIIZZ = viewGroup;
        this.LJIIIZ = 1;
    }
}
