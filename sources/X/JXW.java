package X;

import Y.ARunnableS44S0100000_8;
import android.os.Looper;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.profile.model.BlockStatus;
import com.ss.android.ugc.aweme.userservice.api.IUserService;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class JXW extends JSR implements Observer<BlockStatus> {
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;

    @Override // X.JSR
    public final void LJ() {
        ActivityC45651qj activityC45651qj = this.LJLIL.LIZIZ;
        if (activityC45651qj != null) {
            if (o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
                LJII();
            } else {
                activityC45651qj.runOnUiThread(new ARunnableS44S0100000_8(this, 184));
            }
        }
        C49314JXa.LIZJ.LIZ((InterfaceC49318JXe) this.LJLJI.getValue());
    }

    public final void LJII() {
        if (this.LJLIL.LIZIZ != null) {
            o.LJIIIIZZ(this.LJLILLLLZI.getValue(), "<get-mUserService>(...)");
            Object value = this.LJLILLLLZI.getValue();
            o.LJIIIIZZ(value, "<get-mUserService>(...)");
            ((IUserService) value).LJII().removeObserver(this);
            Object value2 = this.LJLILLLLZI.getValue();
            o.LJIIIIZZ(value2, "<get-mUserService>(...)");
            NextLiveData<BlockStatus> LJII = ((IUserService) value2).LJII();
            ActivityC45651qj activityC45651qj = this.LJLIL.LIZIZ;
            o.LJI(activityC45651qj);
            LJII.observe(activityC45651qj, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JXW(JTS bulletContext) {
        super(bulletContext);
        o.LJIIIZ(bulletContext, "bulletContext");
        this.LJLILLLLZI = C221108m2.LIZIZ(JX7.LJLIL);
        this.LJLJI = C221108m2.LIZIZ(new AqS158S0100000_8(this, 671));
    }

    @Override // androidx.lifecycle.Observer
    /* renamed from: LJIIIIZZ, reason: merged with bridge method [inline-methods] */
    public final void onChanged(BlockStatus blockStatus) {
        if (blockStatus == null) {
            return;
        }
        JTS jts = this.LJLIL;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uid", blockStatus.userId);
        jSONObject.put("block_status", blockStatus.blockStatus);
        jts.LIZ("changeBlockState", jSONObject);
        if (blockStatus.blockStatus == 1) {
            JTS jts2 = this.LJLIL;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("uid", blockStatus.userId);
            jSONObject2.put("follow_status", 0);
            jts2.LIZ("changeFollowState", jSONObject2);
        }
    }
}
