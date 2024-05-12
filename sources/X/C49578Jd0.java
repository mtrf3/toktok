package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import kotlin.jvm.internal.o;

/* renamed from: X.Jd0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49578Jd0 extends AbstractC49223JTn {
    public boolean LJLILLLLZI = true;
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(C49579Jd1.LJLIL);

    @Override // X.InterfaceC49220JTk
    public final MutableLiveData<Integer> LIZ() {
        return (MutableLiveData) this.LJLJI.getValue();
    }

    public final void LIZIZ(Boolean bool) {
        int i;
        if (bool != null) {
            bool.booleanValue();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setFragmentVisible: ");
            LIZ.append(bool);
            LIZ.append(" and current is ");
            LIZ.append(this.LJLILLLLZI);
            X1D.LIZIZ(LIZ);
            if (o.LJ(bool, Boolean.valueOf(this.LJLILLLLZI))) {
                return;
            }
            this.LJLILLLLZI = bool.booleanValue();
            LiveData liveData = (LiveData) this.LJLJI.getValue();
            if (bool.booleanValue()) {
                i = 1;
            } else {
                i = 0;
            }
            liveData.setValue(i);
        }
    }
}
