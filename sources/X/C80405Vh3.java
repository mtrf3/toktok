package X;

import java.util.Comparator;

/* renamed from: X.Vh3, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80405Vh3 implements Comparator<C80400Vgy> {
    public final /* synthetic */ C80401Vgz LJLIL;

    public C80405Vh3(C80401Vgz c80401Vgz) {
        this.LJLIL = c80401Vgz;
    }

    @Override // java.util.Comparator
    public final int compare(C80400Vgy c80400Vgy, C80400Vgy c80400Vgy2) {
        C80400Vgy c80400Vgy3 = c80400Vgy;
        C80400Vgy c80400Vgy4 = c80400Vgy2;
        int compareTo = Boolean.valueOf(c80400Vgy3.isChecked()).compareTo(Boolean.valueOf(c80400Vgy4.isChecked()));
        if (compareTo != 0) {
            return compareTo;
        }
        int compareTo2 = Boolean.valueOf(c80400Vgy3.isPressed()).compareTo(Boolean.valueOf(c80400Vgy4.isPressed()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        return Integer.valueOf(this.LJLIL.indexOfChild(c80400Vgy3)).compareTo(Integer.valueOf(this.LJLIL.indexOfChild(c80400Vgy4)));
    }
}
