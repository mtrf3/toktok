package X;

import Y.ARunnableS27S0200000_8;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.discover.eventcenter.EventCenter;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JZ7 extends JSR implements Observer<C207668Da> {
    public final EventCenter LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JZ7(JTS bulletContext) {
        super(bulletContext);
        o.LJIIIZ(bulletContext, "bulletContext");
        ActivityC45651qj activityC45651qj = bulletContext.LIZIZ;
        if (activityC45651qj != null) {
            EventCenter eventCenter = (EventCenter) ViewModelProviders.of(activityC45651qj).get(EventCenter.class);
            this.LJLILLLLZI = eventCenter;
            if (o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
                if (eventCenter != null && !TextUtils.isEmpty("mix_feed_fragment_status")) {
                    eventCenter.hv0("mix_feed_fragment_status").observe(activityC45651qj, this, false);
                    return;
                }
                return;
            }
            activityC45651qj.runOnUiThread(new ARunnableS27S0200000_8(activityC45651qj, this, 90));
        }
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C207668Da c207668Da) {
        String str;
        C207668Da c207668Da2 = c207668Da;
        if (c207668Da2 == null || !o.LJ(c207668Da2.LIZ, "mix_feed_fragment_status")) {
            return;
        }
        Object obj = c207668Da2.LIZIZ;
        if (obj == null) {
            obj = null;
        }
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            return;
        }
        if (bool.booleanValue()) {
            str = "viewAppear";
        } else {
            str = "viewDisappear";
        }
        this.LJLIL.LIZ(str, C65232Piu.LIZJ("from", "mix"));
    }
}
