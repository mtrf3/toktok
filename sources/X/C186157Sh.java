package X;

import com.ss.android.ugc.aweme.topic.review.model.TopicReview;
import kotlin.jvm.internal.o;

/* renamed from: X.7Sh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C186157Sh extends F9E implements C33Q {
    public final float LJLIL;
    public final long LJLILLLLZI;
    public final long LJLJI;
    public final boolean LJLJJI;
    public final boolean LJLJJL;
    public final C43I<TopicReview> LJLJJLL;

    public C186157Sh() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Float.valueOf(this.LJLIL), Long.valueOf(this.LJLILLLLZI), Long.valueOf(this.LJLJI), Boolean.valueOf(this.LJLJJI), Boolean.valueOf(this.LJLJJL), this.LJLJJLL};
    }

    public /* synthetic */ C186157Sh(int i) {
        this(0.0f, 0L, 5L, false, false, new C43I(null));
    }

    public C186157Sh(float f, long j, long j2, boolean z, boolean z2, C43I<TopicReview> published) {
        o.LJIIIZ(published, "published");
        this.LJLIL = f;
        this.LJLILLLLZI = j;
        this.LJLJI = j2;
        this.LJLJJI = z;
        this.LJLJJL = z2;
        this.LJLJJLL = published;
    }

    public static C186157Sh L(C186157Sh c186157Sh, float f, long j, long j2, boolean z, boolean z2, C43I c43i, int i) {
        boolean z3 = z2;
        boolean z4 = z;
        long j3 = j2;
        C43I published = c43i;
        float f2 = f;
        long j4 = j;
        if ((i & 1) != 0) {
            f2 = c186157Sh.LJLIL;
        }
        if ((i & 2) != 0) {
            j4 = c186157Sh.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            j3 = c186157Sh.LJLJI;
        }
        if ((i & 8) != 0) {
            z4 = c186157Sh.LJLJJI;
        }
        if ((i & 16) != 0) {
            z3 = c186157Sh.LJLJJL;
        }
        if ((i & 32) != 0) {
            published = c186157Sh.LJLJJLL;
        }
        c186157Sh.getClass();
        o.LJIIIZ(published, "published");
        return new C186157Sh(f2, j4, j3, z4, z3, published);
    }
}
