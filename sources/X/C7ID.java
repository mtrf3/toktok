package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.topic.movie.favorite.api.MovieCollectionListApi;

/* renamed from: X.7ID, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7ID implements InterfaceC214228aw<C7IB> {
    public final MovieCollectionListApi LIZ;
    public final C7IC LIZIZ;

    @Override // X.InterfaceC214228aw
    public final void release() {
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.7IC] */
    public C7ID() {
        MovieCollectionListApi.LIZ.getClass();
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("https://");
        LIZ.append(EF7.LJI.LIZ);
        this.LIZ = (MovieCollectionListApi) LIZLLL.create(X1D.LIZIZ(LIZ)).create(MovieCollectionListApi.class);
        this.LIZIZ = new C7IB() { // from class: X.7IC
            @Override // X.C7IB
            public final Object LJJL(long j, C7I9 c7i9) {
                return C7ID.this.LIZ.getMovieCollectionList(j, 7, c7i9);
            }
        };
    }

    @Override // X.InterfaceC214228aw
    public final /* bridge */ /* synthetic */ C7IB getOperator() {
        return this.LIZIZ;
    }
}
