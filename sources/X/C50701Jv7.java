package X;

import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import kotlin.jvm.internal.o;

/* renamed from: X.Jv7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50701Jv7 extends F9E implements InterfaceC50315Jot {
    public final boolean LJLIL;
    public final long LJLILLLLZI;
    public final boolean LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final String LJLJJLL;
    public final long LJLJL;
    public final long LJLJLJ;
    public final Word LJLJLLL;

    public C50701Jv7() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), Long.valueOf(this.LJLILLLLZI), Boolean.valueOf(this.LJLJI), this.LJLJJI, this.LJLJJL, this.LJLJJLL, Long.valueOf(this.LJLJL), Long.valueOf(this.LJLJLJ), this.LJLJLLL};
    }

    public /* synthetic */ C50701Jv7(int i) {
        this(true, 0L, false, "", "", "", 0L, 0L, new Word());
    }

    public C50701Jv7(boolean z, long j, boolean z2, String last_group_id, String last_search_source, String last_search_query, long j2, long j3, Word cacheFirstWord) {
        o.LJIIIZ(last_group_id, "last_group_id");
        o.LJIIIZ(last_search_source, "last_search_source");
        o.LJIIIZ(last_search_query, "last_search_query");
        o.LJIIIZ(cacheFirstWord, "cacheFirstWord");
        this.LJLIL = z;
        this.LJLILLLLZI = j;
        this.LJLJI = z2;
        this.LJLJJI = last_group_id;
        this.LJLJJL = last_search_source;
        this.LJLJJLL = last_search_query;
        this.LJLJL = j2;
        this.LJLJLJ = j3;
        this.LJLJLLL = cacheFirstWord;
    }

    public static C50701Jv7 L(C50701Jv7 c50701Jv7, long j, boolean z, String str, String str2, String str3, long j2, long j3, Word word, int i) {
        boolean z2;
        Word cacheFirstWord = word;
        long j4 = j3;
        boolean z3 = z;
        long j5 = j;
        String last_group_id = str;
        String last_search_source = str2;
        String last_search_query = str3;
        long j6 = j2;
        if ((i & 1) != 0) {
            z2 = c50701Jv7.LJLIL;
        } else {
            z2 = false;
        }
        if ((i & 2) != 0) {
            j5 = c50701Jv7.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            z3 = c50701Jv7.LJLJI;
        }
        if ((i & 8) != 0) {
            last_group_id = c50701Jv7.LJLJJI;
        }
        if ((i & 16) != 0) {
            last_search_source = c50701Jv7.LJLJJL;
        }
        if ((i & 32) != 0) {
            last_search_query = c50701Jv7.LJLJJLL;
        }
        if ((i & 64) != 0) {
            j6 = c50701Jv7.LJLJL;
        }
        if ((i & 128) != 0) {
            j4 = c50701Jv7.LJLJLJ;
        }
        if ((i & 256) != 0) {
            cacheFirstWord = c50701Jv7.LJLJLLL;
        }
        c50701Jv7.getClass();
        o.LJIIIZ(last_group_id, "last_group_id");
        o.LJIIIZ(last_search_source, "last_search_source");
        o.LJIIIZ(last_search_query, "last_search_query");
        o.LJIIIZ(cacheFirstWord, "cacheFirstWord");
        return new C50701Jv7(z2, j5, z3, last_group_id, last_search_source, last_search_query, j6, j4, cacheFirstWord);
    }
}
