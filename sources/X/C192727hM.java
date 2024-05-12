package X;

import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetail;
import kotlin.jvm.internal.o;

/* renamed from: X.7hM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C192727hM extends F9E {
    public final CollectionDetail LJLIL;
    public final int LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI)};
    }

    public C192727hM(CollectionDetail detail, int i) {
        o.LJIIIZ(detail, "detail");
        this.LJLIL = detail;
        this.LJLILLLLZI = i;
    }
}
