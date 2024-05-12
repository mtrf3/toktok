package X;

import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.Lm7, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55239Lm7 extends C55238Lm6 {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJJLL;
    public final C55242LmA LJLJJI;
    public final C62822Ol8 LJLJJL;

    static {
        TBV tbv = new TBV(C55239Lm7.class, "activityWeak", "getActivityWeak()Landroidx/fragment/app/FragmentActivity;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJJLL = new InterfaceC74236TBo[]{tbv};
    }

    @Override // X.C55238Lm6, X.InterfaceC55235Lm3
    public final Object getHost() {
        return this.LJLJJI.LIZ(LJLJJLL[0]);
    }

    @Override // X.C55238Lm6, X.InterfaceC55235Lm3
    public final C55252LmK getTree() {
        return (C55252LmK) this.LJLJJL.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55239Lm7(ActivityC45651qj fragmentActivity, String key) {
        super(key);
        o.LJIIIZ(fragmentActivity, "fragmentActivity");
        o.LJIIIZ(key, "key");
        this.LJLJJI = new C55242LmA(new AqS159S0100000_9(fragmentActivity, 35));
        this.LJLJJL = C221108m2.LIZIZ(new AqS156S0200000_9(fragmentActivity, this, 4));
        L9U.LIZIZ(new AqS156S0200000_9(fragmentActivity, this, 3));
    }
}
