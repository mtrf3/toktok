package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

/* renamed from: X.Jcd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49555Jcd extends AbstractC49223JTn {
    public boolean LJLILLLLZI;
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(C49556Jce.LJLIL);

    @Override // X.InterfaceC49220JTk
    public final MutableLiveData<Integer> LIZ() {
        return (MutableLiveData) this.LJLJI.getValue();
    }

    public final void LIZIZ(Boolean bool) {
        int i;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setTakoFullyVisible: ");
        LIZ.append(bool);
        LIZ.append(" and current is ");
        LIZ.append(this.LJLILLLLZI);
        X1D.LIZIZ(LIZ);
        if (bool != null && bool.booleanValue() != this.LJLILLLLZI) {
            boolean booleanValue = bool.booleanValue();
            this.LJLILLLLZI = booleanValue;
            LiveData liveData = (LiveData) this.LJLJI.getValue();
            if (booleanValue) {
                i = 0;
            } else {
                i = 1;
            }
            liveData.setValue(i);
        }
    }
}
