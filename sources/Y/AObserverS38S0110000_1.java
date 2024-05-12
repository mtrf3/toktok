package Y;

import X.ActivityC45651qj;
import X.C108424Ni;
import X.C108464Nm;
import X.C108534Nt;
import X.C45804HyK;
import X.C76800UCe;
import X.C87693cL;
import X.C92333jp;
import X.InterfaceC108504Nq;
import X.LFH;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui.GroupChatPanel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.fragment.BaseQuickChatRoomFragment;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.viewmodel.BaseQuickChatRoomViewModel;
import com.ss.android.ugc.aweme.im.sdk.chatlist.ui.fragment.SessionListFragmentV2;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class AObserverS38S0110000_1 implements Observer {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                return;
            case 1:
                onChanged$1(this, obj);
                return;
            case 2:
                onChanged$2(this, obj);
                return;
            case 3:
                onChanged$3(this, obj);
                return;
            case 4:
                onChanged$4(this, obj);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AObserverS38S0110000_1(MediatorLiveData mediatorLiveData, MediatorLiveData<Object> mediatorLiveData2) {
        this.$t = mediatorLiveData2;
        this.l0 = mediatorLiveData;
        this.z1 = true;
    }

    public static final void onChanged$0(AObserverS38S0110000_1 aObserverS38S0110000_1, Object obj) {
        T value = ((MediatorLiveData) aObserverS38S0110000_1.l0).getValue();
        if (!aObserverS38S0110000_1.z1) {
            if (value == 0) {
                if (obj == null) {
                    return;
                }
            } else if (o.LJ(value, obj)) {
                return;
            }
        }
        aObserverS38S0110000_1.z1 = false;
        ((MediatorLiveData) aObserverS38S0110000_1.l0).setValue(obj);
    }

    public static final void onChanged$1(AObserverS38S0110000_1 aObserverS38S0110000_1, Object obj) {
        long j;
        if (C92333jp.LIZIZ() && LFH.LIZIZ.LIZLLL().LJIIIIZZ().LIZLLL("bookmode_dm") && !aObserverS38S0110000_1.z1) {
            SessionListFragmentV2 sessionListFragmentV2 = (SessionListFragmentV2) aObserverS38S0110000_1.l0;
            if (sessionListFragmentV2.xl().LJLZ()) {
                j = 0;
            } else {
                j = 500;
            }
            sessionListFragmentV2._$_findCachedViewById(R.id.l_2).postDelayed(new ARunnableS37S0100000_1(sessionListFragmentV2, 9), j);
        }
    }

    public static final void onChanged$2(AObserverS38S0110000_1 aObserverS38S0110000_1, Object obj) {
        BaseQuickChatRoomFragment baseQuickChatRoomFragment;
        BaseQuickChatRoomViewModel Al;
        if (aObserverS38S0110000_1.z1) {
            Fragment fragment = ((GroupChatPanel) aObserverS38S0110000_1.l0).LJLJLJ;
            if ((fragment instanceof BaseQuickChatRoomFragment) && (baseQuickChatRoomFragment = (BaseQuickChatRoomFragment) fragment) != null && (Al = baseQuickChatRoomFragment.Al()) != null) {
                Al.LJLJJLL.postValue(C76800UCe.LIZ);
                return;
            }
            return;
        }
        ((GroupChatPanel) aObserverS38S0110000_1.l0).LJLJLLL.finish();
    }

    public static final void onChanged$3(AObserverS38S0110000_1 aObserverS38S0110000_1, Object obj) {
        List<? extends User> userList = (List) obj;
        if (userList == null || userList.isEmpty()) {
            return;
        }
        ((C108464Nm) aObserverS38S0110000_1.l0).getClass();
        C108464Nm c108464Nm = (C108464Nm) aObserverS38S0110000_1.l0;
        c108464Nm.getClass();
        C108534Nt c108534Nt = C108534Nt.LIZIZ;
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(c108464Nm.LIZ);
        o.LJI(LJJIFFI);
        String string = c108464Nm.LIZJ.extras.getString("enter_from");
        if (string == null) {
            string = "";
        }
        InterfaceC108504Nq LIZ = c108534Nt.LIZ.LIZ(new C87693cL(LJJIFFI, string));
        C108464Nm c108464Nm2 = (C108464Nm) aObserverS38S0110000_1.l0;
        boolean z = aObserverS38S0110000_1.z1;
        LIZ.LIZIZ(new AqS151S0100000_1(c108464Nm2, 858));
        LIZ.LIZ(new C108424Ni(c108464Nm2, z, LIZ));
        o.LJIIIIZZ(userList, "userList");
        LIZ.LIZJ(userList);
        LIZ.show();
    }

    public static final void onChanged$4(AObserverS38S0110000_1 aObserverS38S0110000_1, Object obj) {
        T value = ((MediatorLiveData) aObserverS38S0110000_1.l0).getValue();
        if (!aObserverS38S0110000_1.z1) {
            if (value == 0) {
                if (obj == null) {
                    return;
                }
            } else if (!(!o.LJ(value, obj))) {
                return;
            }
        }
        aObserverS38S0110000_1.z1 = false;
        ((MediatorLiveData) aObserverS38S0110000_1.l0).setValue(obj);
    }

    public AObserverS38S0110000_1(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
