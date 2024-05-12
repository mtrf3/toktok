package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.53N, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C53N extends F9E {
    public final C53I LJLIL;
    public final C1291154x LJLILLLLZI;
    public final AnonymousClass550 LJLJI;
    public final C124414uT LJLJJI;
    public final C124404uS LJLJJL;

    public C53N() {
        this(null, null, 31);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.4uT] */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.4uS] */
    public C53N(C53I c53i, AnonymousClass550 anonymousClass550, int i) {
        C1291154x optPanelViewConfig;
        C124414uT filterPanelViewConfig;
        C53I funcBarViewConfig = c53i;
        AnonymousClass550 resourceListViewConfig = anonymousClass550;
        funcBarViewConfig = (i & 1) != 0 ? new C53I(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, 536870911) : funcBarViewConfig;
        if ((i & 2) != 0) {
            optPanelViewConfig = new C1291154x();
        } else {
            optPanelViewConfig = null;
        }
        resourceListViewConfig = (i & 4) != 0 ? new AnonymousClass550(null, null, null, 1023) : resourceListViewConfig;
        if ((i & 8) != 0) {
            filterPanelViewConfig = new F9E() { // from class: X.4uT
                public final int LJLIL = R.drawable.as0;
                public final int LJLILLLLZI = R.drawable.art;
                public final int LJLJI = R.drawable.as4;

                @Override // X.F9E
                public final Object[] getObjects() {
                    return new Object[]{Integer.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI)};
                }
            };
        } else {
            filterPanelViewConfig = null;
        }
        C124404uS adjustPanelViewConfig = (i & 16) != 0 ? new F9E() { // from class: X.4uS
            public final int LJLIL = 0;
            public final int LJLILLLLZI = 0;
            public final int LJLJI = 0;
            public final int LJLJJI = 0;
            public final int LJLJJL = 0;
            public final int LJLJJLL = 0;
            public final int LJLJL = 0;
            public final int LJLJLJ = 0;
            public final int LJLJLLL = 0;
            public final int LJLL = 0;
            public final int LJLLI = 0;

            @Override // X.F9E
            public final Object[] getObjects() {
                return new Object[]{Integer.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI), Integer.valueOf(this.LJLJJI), Integer.valueOf(this.LJLJJL), Integer.valueOf(this.LJLJJLL), Integer.valueOf(this.LJLJL), Integer.valueOf(this.LJLJLJ), Integer.valueOf(this.LJLJLLL), Integer.valueOf(this.LJLL), Integer.valueOf(this.LJLLI)};
            }
        } : null;
        o.LJIIIZ(funcBarViewConfig, "funcBarViewConfig");
        o.LJIIIZ(optPanelViewConfig, "optPanelViewConfig");
        o.LJIIIZ(resourceListViewConfig, "resourceListViewConfig");
        o.LJIIIZ(filterPanelViewConfig, "filterPanelViewConfig");
        o.LJIIIZ(adjustPanelViewConfig, "adjustPanelViewConfig");
        this.LJLIL = funcBarViewConfig;
        this.LJLILLLLZI = optPanelViewConfig;
        this.LJLJI = resourceListViewConfig;
        this.LJLJJI = filterPanelViewConfig;
        this.LJLJJL = adjustPanelViewConfig;
    }
}
