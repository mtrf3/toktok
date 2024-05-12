package X;

import com.ss.android.ugc.aweme.topic.book.model.BookDetail;
import kotlin.jvm.internal.o;

/* renamed from: X.7Pm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C185427Pm extends F9E implements C33Q {
    public final AbstractC72932td<BookDetail> LJLIL;
    public final boolean LJLILLLLZI;

    public C185427Pm() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Boolean.valueOf(this.LJLILLLLZI)};
    }

    public /* synthetic */ C185427Pm(int i) {
        this(C33X.LIZ, false);
    }

    public C185427Pm(AbstractC72932td<BookDetail> bookDetail, boolean z) {
        o.LJIIIZ(bookDetail, "bookDetail");
        this.LJLIL = bookDetail;
        this.LJLILLLLZI = z;
    }

    public static C185427Pm L(C185427Pm c185427Pm, AbstractC72932td bookDetail, boolean z, int i) {
        if ((i & 1) != 0) {
            bookDetail = c185427Pm.LJLIL;
        }
        if ((i & 2) != 0) {
            z = c185427Pm.LJLILLLLZI;
        }
        c185427Pm.getClass();
        o.LJIIIZ(bookDetail, "bookDetail");
        return new C185427Pm(bookDetail, z);
    }
}
