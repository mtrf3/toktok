package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Sct, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72503Sct extends F9E {
    public final EnumC72483ScZ LJLIL;
    public final int LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;

    public C72503Sct() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI), this.LJLJI, this.LJLJJI};
    }

    public /* synthetic */ C72503Sct(int i) {
        this(EnumC72483ScZ.TT_NOW, 10, "", "");
    }

    public C72503Sct(EnumC72483ScZ scene, int i, String secUid, String pageToken) {
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(secUid, "secUid");
        o.LJIIIZ(pageToken, "pageToken");
        this.LJLIL = scene;
        this.LJLILLLLZI = i;
        this.LJLJI = secUid;
        this.LJLJJI = pageToken;
    }
}
