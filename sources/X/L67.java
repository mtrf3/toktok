package X;

import Y.ACListenerS29S0100000_9;
import Y.AObserverS51S1100000_9;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.model.ActivityStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class L67 implements InterfaceC53591L1n<EnumC53519KzT, C53526Kza> {
    public final C53526Kza LJLIL;
    public final IIMService LJLILLLLZI;
    public LiveData<ActivityStatus> LJLJI;
    public L69 LJLJJI;
    public String LJLJJL;
    public EnumC53519KzT LJLJJLL;

    public L67(C53526Kza c53526Kza) {
        this.LJLIL = c53526Kza;
        IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
        o.LJIIIIZZ(createIIMServicebyMonsterPlugin, "get()");
        this.LJLILLLLZI = createIIMServicebyMonsterPlugin;
    }

    @Override // X.InterfaceC53591L1n
    public final EnumC53519KzT LIZIZ(Object obj) {
        ActivityStatus activityStatus;
        C107724Kq c107724Kq = null;
        if (!(obj instanceof ActivityStatus) || (activityStatus = (ActivityStatus) obj) == null) {
            return null;
        }
        if (OUP.LJJII(activityStatus, null, null, 3)) {
            L69 l69 = this.LJLJJI;
            if (l69 != null) {
                C112244aq.LIZ(l69, this.LJLJJL, Boolean.TRUE);
            }
            C53526Kza c53526Kza = this.LJLIL;
            if (c53526Kza != null) {
                C107724Kq c107724Kq2 = c53526Kza.LJFF;
                if (c107724Kq2 != null) {
                    c107724Kq2.LJI = Boolean.TRUE;
                }
                c107724Kq = c53526Kza.LJFF;
            }
            C78946Uyc.LJJIJL(c107724Kq);
            EnumC53519KzT enumC53519KzT = EnumC53519KzT.IS_ACTIVE;
            this.LJLJJLL = enumC53519KzT;
            return enumC53519KzT;
        }
        L69 l692 = this.LJLJJI;
        if (l692 != null) {
            C112244aq.LIZ(l692, this.LJLJJL, Boolean.FALSE);
        }
        C53526Kza c53526Kza2 = this.LJLIL;
        if (c53526Kza2 != null) {
            C107724Kq c107724Kq3 = c53526Kza2.LJFF;
            if (c107724Kq3 != null) {
                c107724Kq3.LJI = Boolean.FALSE;
            }
            c107724Kq = c53526Kza2.LJFF;
        }
        C78946Uyc.LJJIJL(c107724Kq);
        EnumC53519KzT enumC53519KzT2 = EnumC53519KzT.IS_INACTIVE;
        this.LJLJJLL = enumC53519KzT2;
        return enumC53519KzT2;
    }

    @Override // X.InterfaceC53591L1n
    public final void LIZLLL(L69 l69, LifecycleOwner lifecycleOwner) {
        this.LJLJJI = l69;
        l69.LIZIZ(new ACListenerS29S0100000_9(this, 86));
    }

    @Override // X.InterfaceC53591L1n
    public final void LIZJ(String uid, WeakReference weakReference, L5U observer, Object obj) {
        LifecycleOwner lifecycleOwner;
        String str;
        C107724Kq c107724Kq;
        InterfaceC65784Pro<Boolean> interfaceC65784Pro;
        ActivityStatus value;
        o.LJIIIZ(uid, "uid");
        o.LJIIIZ(observer, "observer");
        this.LJLJJL = uid;
        if (!this.LJLILLLLZI.getActivityStatusViewModel().getSettings().LJFF()) {
            return;
        }
        C53526Kza c53526Kza = this.LJLIL;
        if ((c53526Kza == null || (lifecycleOwner = c53526Kza.LJ) == null) && (lifecycleOwner = (LifecycleOwner) weakReference.get()) == null) {
            return;
        }
        if (obj == null || !(obj instanceof User) || ((User) obj).getFollowStatus() != 2) {
            LiveData<ActivityStatus> liveData = this.LJLJI;
            if (liveData != null) {
                liveData.removeObservers(lifecycleOwner);
                return;
            }
            return;
        }
        LiveData<ActivityStatus> liveData2 = this.LJLJI;
        if (liveData2 != null && (value = liveData2.getValue()) != null) {
            str = value.userID;
        } else {
            str = null;
        }
        if (o.LJ(str, uid)) {
            EnumC53519KzT enumC53519KzT = this.LJLJJLL;
            if (enumC53519KzT == EnumC53519KzT.IS_ACTIVE) {
                L5V.LIZ(observer, uid, enumC53519KzT, EnumC53663L4h.ACTIVE, null, 24);
                return;
            }
            return;
        }
        C53526Kza c53526Kza2 = this.LJLIL;
        if (c53526Kza2 != null && (interfaceC65784Pro = c53526Kza2.LIZLLL) != null && interfaceC65784Pro.invoke().booleanValue()) {
            return;
        }
        C53526Kza c53526Kza3 = this.LJLIL;
        if (c53526Kza3 != null && (c107724Kq = c53526Kza3.LJFF) != null) {
            c107724Kq.LIZJ = uid;
        }
        LiveData<ActivityStatus> liveData3 = this.LJLJI;
        if (liveData3 != null) {
            liveData3.removeObservers(lifecycleOwner);
        }
        LiveData<ActivityStatus> LIZ = C3B3.LIZ(this.LJLILLLLZI.getActivityStatusViewModel(), uid, null, null, 14);
        this.LJLJI = LIZ;
        if (LIZ != null) {
            LIZ.observe(lifecycleOwner, new AObserverS51S1100000_9(observer, uid, 0));
        }
        L69 l69 = this.LJLJJI;
        if (l69 != null) {
            C112244aq.LIZ(l69, uid, Boolean.FALSE);
        }
    }
}
