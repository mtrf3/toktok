package X;

import com.ss.android.ugc.aweme.search.model.SearchSugEntity;

/* loaded from: classes9.dex */
public final class K57 implements Runnable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ SearchSugEntity LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ int LJLJJLL;
    public final /* synthetic */ boolean LJLJL;
    public final /* synthetic */ ActivityC45651qj LJLJLJ;

    public K57(String str, int i, SearchSugEntity searchSugEntity, String str2, String str3, int i2, boolean z, ActivityC45651qj activityC45651qj) {
        this.LJLIL = str;
        this.LJLILLLLZI = i;
        this.LJLJI = searchSugEntity;
        this.LJLJJI = str2;
        this.LJLJJL = str3;
        this.LJLJJLL = i2;
        this.LJLJL = z;
        this.LJLJLJ = activityC45651qj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            K56.LJII(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ);
        } finally {
            if (LIZ) {
            }
        }
    }
}
