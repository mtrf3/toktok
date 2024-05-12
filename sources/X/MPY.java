package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.relation.recuser.inbox.AbsUserCardInboxWidget;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MPY {
    public boolean LIZ;
    public final C62822Ol8 LIZIZ;
    public final C62822Ol8 LIZJ;
    public final C62822Ol8 LIZLLL;

    public final AbsUserCardInboxWidget LIZ() {
        return (AbsUserCardInboxWidget) this.LIZIZ.getValue();
    }

    public final MPV LIZIZ() {
        return (MPV) this.LIZJ.getValue();
    }

    public MPY(Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        this.LIZ = true;
        this.LIZIZ = C221108m2.LIZIZ(new AqS159S0100000_9(fragment, 979));
        this.LIZJ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 980));
        this.LIZLLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 981));
        LIZ().LJLJJI = true;
        LIZ().LJLJI.put("position", "new_activities");
        LIZ().LJLJI.put("enter_method", "click_card");
        MS5.LJ(new AqS156S0200000_9(fragment, this, 108));
    }
}
