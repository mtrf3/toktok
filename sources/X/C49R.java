package X;

import com.zhiliaoapp.musically.R;

/* renamed from: X.49R, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C49R {
    public static final C1045248i LIZ;

    /* JADX WARN: Type inference failed for: r5v0, types: [X.2UE] */
    static {
        C1049049u c1049049u;
        ?? r5 = new F9E() { // from class: X.2UE
            public final int LJLIL = R.attr.lb;
            public final int LJLILLLLZI = R.attr.lb;
            public final boolean LJLJI = true;

            @Override // X.F9E
            public final Object[] getObjects() {
                return new Object[]{Integer.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI), Boolean.valueOf(this.LJLJI)};
            }
        };
        if (C4VT.LIZIZ()) {
            c1049049u = new C1049049u(Integer.valueOf(R.attr.cj), Integer.valueOf(R.drawable.bgp), R.attr.cj, R.attr.cj);
        } else {
            c1049049u = new C1049049u(Integer.valueOf(R.attr.cf), null, R.attr.cv, R.attr.cf);
        }
        LIZ = new C1045248i(Integer.valueOf(R.dimen.t5), r5, c1049049u);
    }

    public static final C49T LIZ() {
        return new C49T(new C49S(), new C49S());
    }
}
