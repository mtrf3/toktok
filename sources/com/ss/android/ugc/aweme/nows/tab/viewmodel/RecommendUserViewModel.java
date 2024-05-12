package com.ss.android.ugc.aweme.nows.tab.viewmodel;

import X.ActivityC45651qj;
import X.C194677kV;
import X.C53976LGi;
import X.C78596Usy;
import X.C7XD;
import X.LHX;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class RecommendUserViewModel extends ViewModel implements LHX {
    public final MutableLiveData<Integer> LJLIL = new MutableLiveData<>();
    public final AqS169S0100000_3 LJLILLLLZI;

    public static IFriendsTabLayoutAbility gv0() {
        ActivityC45651qj LIZLLL = StateOwner.LJLIL.LIZLLL();
        if (LIZLLL != null) {
            return C53976LGi.LIZJ(LIZLLL);
        }
        return null;
    }

    public RecommendUserViewModel() {
        AqS169S0100000_3 aqS169S0100000_3 = new AqS169S0100000_3(this, 360);
        this.LJLILLLLZI = aqS169S0100000_3;
        C7XD.LIZ("RecommendUserViewModel", "viewModel inited");
        C194677kV c194677kV = C78596Usy.LJJIFFI().LJFF;
        c194677kV.getClass();
        ((ArrayList) c194677kV.LIZ).add(aqS169S0100000_3);
        aqS169S0100000_3.invoke(0);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C7XD.LIZ("RecommendUserViewModel", "viewModel onCleared");
        C194677kV c194677kV = C78596Usy.LJJIFFI().LJFF;
        AqS169S0100000_3 observer = this.LJLILLLLZI;
        c194677kV.getClass();
        o.LJIIIZ(observer, "observer");
        ((ArrayList) c194677kV.LIZ).remove(observer);
    }

    @Override // X.LHX
    public final void ag(String fromTag, String str) {
        IFriendsTabLayoutAbility gv0;
        IFriendsTabLayoutAbility gv02;
        o.LJIIIZ(fromTag, "fromTag");
        Integer num = -1;
        if (o.LJ(str, "SOCIAL_NOWS")) {
            Integer value = this.LJLIL.getValue();
            if (value == null) {
                value = num;
            }
            if (value.intValue() > 0 && (gv02 = gv0()) != null) {
                gv02.Iq("SOCIAL_NOWS");
            }
        }
        if (o.LJ(str, "SOCIAL_EXPLORE")) {
            Integer value2 = this.LJLIL.getValue();
            if (value2 != null) {
                num = value2;
            }
            if (num.intValue() > 0 && (gv0 = gv0()) != null) {
                gv0.Iq("SOCIAL_NOWS");
            }
        }
    }
}
