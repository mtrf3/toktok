package X;

import kotlin.jvm.internal.o;

/* renamed from: X.JhF, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49841JhF extends F9E {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final int LJLJI;
    public final JTL LJLJJI;
    public final int LJLJJL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, Integer.valueOf(this.LJLJI), this.LJLJJI, Integer.valueOf(this.LJLJJL)};
    }

    public C49841JhF(String keyword, String aid, int i, JTL scene, int i2) {
        o.LJIIIZ(keyword, "keyword");
        o.LJIIIZ(aid, "aid");
        o.LJIIIZ(scene, "scene");
        this.LJLIL = keyword;
        this.LJLILLLLZI = aid;
        this.LJLJI = i;
        this.LJLJJI = scene;
        this.LJLJJL = i2;
    }
}
