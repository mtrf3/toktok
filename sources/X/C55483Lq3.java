package X;

import android.util.SparseArray;

/* renamed from: X.Lq3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55483Lq3 extends F9E {
    public static final java.util.Map<Integer, String> LJLJJI = C113554cx.LJJL(new OSZ(249372161, "add_yours_detail"), new OSZ(249372162, "add_yours_invite_panel"), new OSZ(1, "add_yours_hub"), new OSZ(249372176, "story_detail"));
    public static final C55486Lq6 LJLJJL;
    public static final java.util.Map<Integer, InterfaceC65784Pro<C55483Lq3[]>> LJLJJLL;
    public static final java.util.Map<Integer, InterfaceC88471Ynr<SparseArray<C123134sP>, java.util.Map<String, Object>, C76800UCe>> LJLJL;
    public static final java.util.Map<Integer, String> LJLJLJ;
    public final String LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;

    static {
        C55486Lq6 c55486Lq6 = C55486Lq6.LJLIL;
        LJLJJL = c55486Lq6;
        LJLJJLL = C113554cx.LJJL(new OSZ(249372161, c55486Lq6), new OSZ(249372162, c55486Lq6), new OSZ(1, c55486Lq6), new OSZ(249372176, C55485Lq5.LJLIL));
        LJLJL = C51029K0z.LJJIIZI(new OSZ(249372176, C55487Lq7.LIZ));
        LJLJLJ = C113554cx.LJJL(new OSZ(249372161, "social_add_yours_load_metrics"), new OSZ(249372162, "social_add_yours_load_metrics"), new OSZ(1, "social_add_yours_load_metrics"), new OSZ(249372176, "story_list_prf"));
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI)};
    }

    public C55483Lq3(String str, int i, int i2) {
        this.LJLIL = str;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
    }
}
