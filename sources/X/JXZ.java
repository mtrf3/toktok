package X;

import Y.AObserverS76S0100000_8;
import Y.ARunnableS44S0100000_8;
import android.os.Looper;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel;
import com.ss.android.ugc.aweme.userservice.api.IUserService;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes9.dex */
public final class JXZ extends AbstractC50814Jww implements Observer<FollowStatus> {
    public final C62822Ol8 LJLJJI;
    public final AObserverS76S0100000_8 LJLJJL;

    public final void LIZLLL() {
        if (this.LJLIL == null) {
            return;
        }
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-userService>(...)");
        NextLiveData<FollowStatus> LJFF = ((IUserService) value).LJFF();
        LJFF.removeObserver(this);
        LJFF.observe(this.LJLIL, this);
        com.bytedance.ies.sdk.widgets.NextLiveData nextLiveData = ((SearchGlobalViewModel) ViewModelProviders.of(this.LJLIL).get(SearchGlobalViewModel.class)).LJLILLLLZI;
        nextLiveData.removeObserver(this.LJLJJL);
        nextLiveData.observe(this.LJLIL, this.LJLJJL);
    }

    @Override // X.AbstractC50814Jww
    public final void LIZ() {
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @Override // X.AbstractC50814Jww
    public final void LIZIZ() {
        EventBus.LIZJ().LJIJ(this);
    }

    public JXZ(ActivityC45651qj activityC45651qj) {
        super(activityC45651qj);
        this.LJLJJI = C221108m2.LIZIZ(C49316JXc.LJLIL);
        this.LJLJJL = new AObserverS76S0100000_8(this, 136);
    }

    @Override // X.AbstractC50814Jww
    public final void LIZJ(C50340JpI c50340JpI) {
        if (this.LJLIL == null) {
            return;
        }
        if (o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
            LIZLLL();
        } else {
            this.LJLIL.runOnUiThread(new ARunnableS44S0100000_8(this, 183));
        }
    }

    @Override // androidx.lifecycle.Observer
    /* renamed from: LJ, reason: merged with bridge method [inline-methods] */
    public final void onChanged(FollowStatus followStatus) {
        if (followStatus == null) {
            return;
        }
        String str = followStatus.userId;
        o.LJIIIIZZ(str, "followStatus.userId");
        int i = followStatus.followStatus;
        C50340JpI c50340JpI = this.LJLILLLLZI;
        if (c50340JpI != null) {
            c50340JpI.LIZ("changeFollowState", C1B8.LIZIZ("uid", str, "follow_status", i));
        }
        int i2 = followStatus.followStatus;
        if (i2 == 1 || i2 == 2 || i2 == 4) {
            String str2 = followStatus.userId;
            o.LJIIIIZZ(str2, "followStatus.userId");
            C50340JpI c50340JpI2 = this.LJLILLLLZI;
            if (c50340JpI2 != null) {
                c50340JpI2.LIZ("changeBlockState", C1B8.LIZIZ("uid", str2, "block_status", 0));
            }
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onFollowStatusEvent(FollowStatusEvent event) {
        o.LJIIIZ(event, "event");
        try {
            onChanged(event.status);
        } catch (Exception unused) {
        }
    }
}
