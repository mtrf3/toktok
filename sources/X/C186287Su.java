package X;

import android.util.LruCache;
import com.ss.android.ugc.aweme.topic.book.detail.api.BookDetailResp;
import com.ss.android.ugc.aweme.topic.book.model.BookDetail;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7Su, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C186287Su extends AbstractC54815LfH<String, C186307Sw> {
    public final int LIZIZ;
    public final long LIZJ;
    public final C62822Ol8 LIZLLL;

    public C186287Su() {
        this(Integer.MAX_VALUE, -1L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC54815LfH
    public final C186307Sw LIZLLL(String k) {
        String str;
        Boolean bool;
        boolean booleanValue;
        o.LJIIIZ(k, "k");
        C199567sO c199567sO = (C199567sO) ((LruCache) this.LIZLLL.getValue()).get(k);
        BookDetailResp bookDetailResp = null;
        if (c199567sO == null) {
            return null;
        }
        if (this.LIZJ > 0 && System.currentTimeMillis() - c199567sO.LIZIZ > this.LIZJ) {
            remove(k);
            return null;
        }
        BookDetailResp bookDetailResp2 = ((C186307Sw) c199567sO.LIZ).LIZ;
        if (bookDetailResp2 == null) {
            return null;
        }
        BookDetail bookDetail = bookDetailResp2.detail;
        if (bookDetail != null) {
            str = bookDetail.id;
        } else {
            str = null;
            if (bookDetailResp2 == null) {
                bool = null;
                if (str == null && bool != null) {
                    bool.booleanValue();
                    BookDetailResp bookDetailResp3 = ((C186307Sw) c199567sO.LIZ).LIZ;
                    if (bookDetailResp3 != null) {
                        Boolean LIZIZ = C7OG.LIZIZ(C7PV.BOOK, str);
                        if (LIZIZ != null) {
                            booleanValue = LIZIZ.booleanValue();
                        } else {
                            booleanValue = bool.booleanValue();
                        }
                        BookDetail detail = bookDetailResp3.detail;
                        o.LJIIIZ(detail, "detail");
                        bookDetailResp = new BookDetailResp(booleanValue, detail);
                    }
                    return new C186307Sw(bookDetailResp);
                }
            }
        }
        bool = Boolean.valueOf(bookDetailResp2.isCollected);
        return str == null ? null : null;
    }

    @Override // X.AbstractC54815LfH
    public final C199567sO<C186307Sw> LJ(String k) {
        o.LJIIIZ(k, "k");
        return (C199567sO) ((LruCache) this.LIZLLL.getValue()).remove(k);
    }

    public C186287Su(int i, long j) {
        this.LIZIZ = i;
        this.LIZJ = j;
        this.LIZLLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1491));
    }

    @Override // X.AbstractC54815LfH
    public final C199557sN LJFF(Object obj, Object v) {
        String k = (String) obj;
        o.LJIIIZ(k, "k");
        o.LJIIIZ(v, "v");
        C199557sN c199557sN = new C199557sN(System.currentTimeMillis(), v, k);
        ((LruCache) this.LIZLLL.getValue()).put(k, c199557sN);
        return c199557sN;
    }
}
