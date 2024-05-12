package X;

import android.view.View;
import kotlin.jvm.internal.AqS168S0100000_2;

/* renamed from: X.6kG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC169046kG {
    public final C81232VuO LIZ;
    public final View LIZIZ;
    public int LIZJ = -1;

    public abstract void LIZ();

    public abstract void LIZIZ();

    public abstract void LJ(boolean z);

    public abstract void LJFF();

    public abstract void LJI(AqS168S0100000_2 aqS168S0100000_2);

    public final void LIZJ(int i) {
        C80924VpQ avTextView;
        C81232VuO c81232VuO = this.LIZ;
        if (c81232VuO != null && (avTextView = c81232VuO.getAvTextView()) != null) {
            avTextView.setTextColor(i);
        }
    }

    public final void LIZLLL(int i) {
        C80924VpQ avTextView;
        C81232VuO c81232VuO = this.LIZ;
        if (c81232VuO != null && (avTextView = c81232VuO.getAvTextView()) != null) {
            avTextView.setTuxFont(i);
        }
    }

    public AbstractC169046kG(C81232VuO c81232VuO, View view) {
        this.LIZ = c81232VuO;
        this.LIZIZ = view;
    }
}
