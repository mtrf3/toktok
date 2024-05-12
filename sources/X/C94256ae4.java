package X;

import kotlin.jvm.internal.o;

/* renamed from: X.ae4, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94256ae4 extends F9E {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final String LJLJJLL;
    public final String LJLJL;
    public String LJLJLJ;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ};
    }

    public C94256ae4(String name, String category, String categoryKey, String url, String id, String resID, String scaleFactor, int i) {
        scaleFactor = (i & 64) != 0 ? "" : scaleFactor;
        String resultPath = (i & 128) == 0 ? null : "";
        o.LJIIIZ(name, "name");
        o.LJIIIZ(category, "category");
        o.LJIIIZ(categoryKey, "categoryKey");
        o.LJIIIZ(url, "url");
        o.LJIIIZ(id, "id");
        o.LJIIIZ(resID, "resID");
        o.LJIIIZ(scaleFactor, "scaleFactor");
        o.LJIIIZ(resultPath, "resultPath");
        this.LJLIL = name;
        this.LJLILLLLZI = category;
        this.LJLJI = categoryKey;
        this.LJLJJI = url;
        this.LJLJJL = id;
        this.LJLJJLL = resID;
        this.LJLJL = scaleFactor;
        this.LJLJLJ = resultPath;
    }
}
