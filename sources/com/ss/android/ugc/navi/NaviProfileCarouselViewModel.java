package com.ss.android.ugc.navi;

import X.C78685UuP;
import X.InterfaceC72668SfY;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class NaviProfileCarouselViewModel extends ViewModel {
    public final MutableLiveData<List<InterfaceC72668SfY>> LJLIL = new MutableLiveData<>();
    public int LJLILLLLZI;

    public final List<InterfaceC72668SfY> gv0(User user) {
        o.LJIIIZ(user, "user");
        List<InterfaceC72668SfY> value = this.LJLIL.getValue();
        if (value != null) {
            ArrayList arrayList = new ArrayList();
            for (InterfaceC72668SfY interfaceC72668SfY : value) {
                InterfaceC72668SfY interfaceC72668SfY2 = interfaceC72668SfY;
                if (C78685UuP.LJJJZ(interfaceC72668SfY2.LIZLLL()) && !o.LJ(user.naviId, interfaceC72668SfY2.LIZLLL())) {
                    arrayList.add(interfaceC72668SfY);
                }
            }
            return arrayList;
        }
        return null;
    }
}
