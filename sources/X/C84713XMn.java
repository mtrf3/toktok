package X;

import android.content.Intent;
import android.os.Bundle;
import android.util.TypedValue;
import com.ss.android.ugc.aweme.account.login.rememberaccount.OneClickLoginViewModel;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.XMn, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84713XMn extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public final /* synthetic */ OneClickLoginViewModel LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84713XMn(OneClickLoginViewModel oneClickLoginViewModel) {
        super(0);
        this.LJLIL = oneClickLoginViewModel;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        WeakReference<ActivityC45651qj> weakReference = this.LJLIL.LJLIL;
        if (weakReference != null) {
            ActivityC45651qj activityC45651qj = weakReference.get();
            if (activityC45651qj == null) {
                return Boolean.FALSE;
            }
            if (((int) TypedValue.applyDimension(1, activityC45651qj.getResources().getDisplayMetrics().heightPixels, activityC45651qj.getResources().getDisplayMetrics())) < 700) {
                return Boolean.FALSE;
            }
            Intent intent = this.LJLIL.LJLILLLLZI;
            if (intent != null) {
                Bundle LLJJIJI = C16880lQ.LLJJIJI(intent);
                if (LLJJIJI != null) {
                    z = LLJJIJI.getBoolean("is_expandable_dialog");
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
            o.LJIJI("intent");
            throw null;
        }
        o.LJIJI("weakFragmentActivity");
        throw null;
    }
}
