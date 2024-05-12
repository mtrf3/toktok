package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Y9j, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86919Y9j extends F9E {
    public final String LJLIL;
    public Integer LJLILLLLZI;
    public Boolean LJLJI;
    public Boolean LJLJJI;
    public String LJLJJL;
    public String LJLJJLL;
    public int LJLLI;
    public Boolean LJLLILLLL;
    public Boolean LJLLJ;
    public Long LJLLL;
    public Long LJLLLL;
    public Long LJLLLLLL;
    public Long LJLZ;
    public String LJZ;
    public Boolean LJZI;
    public Boolean LJZL;
    public Boolean LL;
    public Boolean LLD;
    public Boolean LLF;
    public Boolean LLFF;
    public Boolean LLFFF;
    public Boolean LLFII;
    public Long LLFZ;
    public Long LLI;
    public Long LLIFFJFJJ;
    public Boolean LLII;
    public int LJLJL = -1;
    public int LJLJLJ = -1;
    public int LJLJLLL = -1;
    public int LJLL = -1;
    public final HashMap<YG0, Object> LLIIII = new HashMap<>();
    public final List<ONP> LLIIIILZ = new ArrayList();

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    public C86919Y9j(String str) {
        this.LJLIL = str;
    }

    public final void L(Long l) {
        this.LLIFFJFJJ = l;
        if (l == null || l.longValue() < 3000) {
            M(ONP.SKIP, false);
        }
    }

    public final void M(ONP onp, boolean z) {
        if (((ArrayList) this.LLIIIILZ).contains(onp)) {
            if (z) {
                ((ArrayList) this.LLIIIILZ).remove(onp);
                return;
            }
            return;
        }
        ((ArrayList) this.LLIIIILZ).add(onp);
    }
}
