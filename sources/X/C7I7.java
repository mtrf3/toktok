package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.topic.book.favorite.api.BookCollectionListApi;

/* renamed from: X.7I7, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7I7 implements InterfaceC214228aw<C7I5> {
    public final BookCollectionListApi LIZ;
    public final C7I6 LIZIZ;

    @Override // X.InterfaceC214228aw
    public final void release() {
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.7I6] */
    public C7I7() {
        BookCollectionListApi.LIZ.getClass();
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("https://");
        LIZ.append(EF7.LJI.LIZ);
        this.LIZ = (BookCollectionListApi) LIZLLL.create(X1D.LIZIZ(LIZ)).create(BookCollectionListApi.class);
        this.LIZIZ = new C7I5() { // from class: X.7I6
            @Override // X.C7I5
            public final Object LJJLIIIJILLIZJL(long j, C7I3 c7i3) {
                return C7I7.this.LIZ.getBookCollectionList(j, 7, c7i3);
            }
        };
    }

    @Override // X.InterfaceC214228aw
    public final /* bridge */ /* synthetic */ C7I5 getOperator() {
        return this.LIZIZ;
    }
}
