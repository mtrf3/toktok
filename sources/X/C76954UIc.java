package X;

import android.view.View;
import com.bytedance.android.live.base.model.emoji.BadgeIconTab;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.UIc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76954UIc {
    public final C80664VlE LIZ;
    public final List<BadgeIconTab> LIZIZ;
    public int LIZJ;
    public java.util.Map<String, ? extends Object> LIZLLL;

    public final void LIZ(C76956UIe c76956UIe) {
        if (c76956UIe != null) {
            View view = c76956UIe.LJ;
            if (view != null) {
                view.setBackgroundResource(R.drawable.cmu);
            }
            int i = c76956UIe.LIZLLL;
            if (i >= 0 && i < ((ArrayList) this.LIZIZ).size()) {
                BZI LIZ = C28787BRn.LIZ("livesdk_subscription_keyboard_show");
                java.util.Map<String, ? extends Object> map = this.LIZLLL;
                if (map != null) {
                    for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                        LIZ.LJIJJ(entry.getValue().toString(), entry.getKey());
                    }
                }
                C30869C9p.LIZ(((BadgeIconTab) ListProtector.get(this.LIZIZ, i)).tabId, LIZ, "tab");
            }
        }
    }

    public C76954UIc(C80664VlE c80664VlE, VWJ vwj, T2Y emojiInputListener) {
        o.LJIIIZ(emojiInputListener, "emojiInputListener");
        this.LIZ = c80664VlE;
        this.LIZIZ = new ArrayList();
        c80664VlE.LIZIZ(new C76955UId(this));
    }
}
