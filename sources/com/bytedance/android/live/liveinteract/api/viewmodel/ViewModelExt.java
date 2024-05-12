package com.bytedance.android.live.liveinteract.api.viewmodel;

import X.C221108m2;
import X.C62822Ol8;
import X.C75176Teu;
import X.InterfaceC65784Pro;
import androidx.lifecycle.ViewModel;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes14.dex */
public class ViewModelExt extends ViewModel {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C75176Teu.LJLIL);

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        Iterator it = ((List) this.LJLIL.getValue()).iterator();
        while (it.hasNext()) {
            ((InterfaceC65784Pro) it.next()).invoke();
        }
    }
}
