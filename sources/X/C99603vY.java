package X;

import Y.IDLListenerS189S0100000_1;
import android.app.Activity;
import android.view.View;
import android.widget.PopupWindow;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS151S0100000_1;

/* renamed from: X.3vY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C99603vY extends PopupWindow {
    public final Activity LIZ;
    public final InterfaceC65784Pro<Integer> LIZIZ;
    public final View LIZJ;
    public int LIZLLL;
    public final ArrayList<InterfaceC99593vX> LJ;
    public final IDLListenerS189S0100000_1 LJFF;

    public C99603vY(ActivityC45651qj activityC45651qj, AqS151S0100000_1 aqS151S0100000_1) {
        super(activityC45651qj);
        this.LIZ = activityC45651qj;
        this.LIZIZ = aqS151S0100000_1;
        View view = new View(activityC45651qj);
        this.LIZJ = view;
        this.LIZLLL = -1;
        this.LJ = new ArrayList<>();
        setContentView(view);
        setSoftInputMode(21);
        setInputMethodMode(1);
        setWidth(0);
        setHeight(-1);
        this.LJFF = new IDLListenerS189S0100000_1(this, 4);
    }
}
