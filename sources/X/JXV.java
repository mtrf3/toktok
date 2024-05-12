package X;

import Y.AObserverS76S0100000_8;
import Y.ARunnableS44S0100000_8;
import android.os.Looper;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel;
import com.ss.android.ugc.aweme.userservice.api.IUserService;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class JXV extends JSR implements Observer<FollowStatus> {
    public final C62822Ol8 LJLILLLLZI;
    public final AObserverS76S0100000_8 LJLJI;
    public final C62822Ol8 LJLJJI;

    @Override // X.JSR
    public final void LJ() {
        ActivityC45651qj activityC45651qj = this.LJLIL.LIZIZ;
        if (activityC45651qj != null) {
            if (o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
                LJII();
            } else {
                activityC45651qj.runOnUiThread(new ARunnableS44S0100000_8(this, 185));
            }
        }
        C49314JXa.LIZJ.LIZ((InterfaceC49318JXe) this.LJLJJI.getValue());
    }

    public final void LJII() {
        ActivityC45651qj activityC45651qj = this.LJLIL.LIZIZ;
        if (activityC45651qj == null) {
            return;
        }
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-mUserService>(...)");
        NextLiveData<FollowStatus> LJFF = ((IUserService) value).LJFF();
        LJFF.removeObserver(this);
        LJFF.observe(activityC45651qj, this);
        com.bytedance.ies.sdk.widgets.NextLiveData nextLiveData = ((SearchGlobalViewModel) ViewModelProviders.of(activityC45651qj).get(SearchGlobalViewModel.class)).LJLILLLLZI;
        nextLiveData.removeObserver(this.LJLJI);
        nextLiveData.observe(activityC45651qj, this.LJLJI);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JXV(JTS bulletContext) {
        super(bulletContext);
        o.LJIIIZ(bulletContext, "bulletContext");
        this.LJLILLLLZI = C221108m2.LIZIZ(JXT.LJLIL);
        this.LJLJI = new AObserverS76S0100000_8(this, 135);
        this.LJLJJI = C221108m2.LIZIZ(new AqS158S0100000_8(this, 673));
    }

    @Override // androidx.lifecycle.Observer
    /* renamed from: LJIIIIZZ, reason: merged with bridge method [inline-methods] */
    public final void onChanged(FollowStatus followStatus) {
        if (followStatus == null) {
            return;
        }
        String str = followStatus.userId;
        o.LJIIIIZZ(str, "followStatus.userId");
        int i = followStatus.followStatus;
        JTS jts = this.LJLIL;
        JSONObject LIZIZ = C1B8.LIZIZ("uid", str, "follow_status", i);
        C50340JpI c50340JpI = jts.LJIILLIIL;
        if (c50340JpI != null) {
            c50340JpI.LIZ("changeFollowState", LIZIZ);
        }
        int i2 = followStatus.followStatus;
        if (i2 == 1 || i2 == 2 || i2 == 4) {
            String str2 = followStatus.userId;
            o.LJIIIIZZ(str2, "followStatus.userId");
            JTS jts2 = this.LJLIL;
            JSONObject LIZIZ2 = C1B8.LIZIZ("uid", str2, "block_status", 0);
            C50340JpI c50340JpI2 = jts2.LJIILLIIL;
            if (c50340JpI2 != null) {
                c50340JpI2.LIZ("changeBlockState", LIZIZ2);
            }
        }
    }
}
