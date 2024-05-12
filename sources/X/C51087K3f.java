package X;

import Y.AObserverS76S0100000_8;
import com.ss.android.ugc.aweme.search.ecommerce.middle.SearchStartViewModel;
import com.ss.android.ugc.aweme.search.pages.common.theme.activitybg.SearchActivityCardBgController;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.K3f, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51087K3f {
    public final ActivityC45651qj LIZ;
    public final InterfaceC50244Jnk LIZIZ;
    public final C62822Ol8 LIZJ;
    public final AObserverS76S0100000_8 LIZLLL;
    public final C62822Ol8 LJ;
    public final C62822Ol8 LJFF;

    public final int LIZ() {
        Integer value = ((SearchStartViewModel) this.LIZJ.getValue()).iv0().getValue();
        if (value == null) {
            return 0;
        }
        return value.intValue();
    }

    public C51087K3f(ActivityC45651qj activity, SearchActivityCardBgController handler) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(handler, "handler");
        this.LIZ = activity;
        this.LIZIZ = handler;
        this.LIZJ = C221108m2.LIZIZ(new AqS158S0100000_8(this, 700));
        this.LIZLLL = new AObserverS76S0100000_8(this, 150);
        this.LJ = C221108m2.LIZIZ(new AqS158S0100000_8(this, 698));
        this.LJFF = C221108m2.LIZIZ(new AqS158S0100000_8(this, 699));
    }
}
