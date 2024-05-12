package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.topic.search.api.TopicSearchApi;

/* renamed from: X.7Qb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C185577Qb implements InterfaceC214228aw<C7PN> {
    public final TopicSearchApi LIZ;
    public final C185587Qc LIZIZ;

    @Override // X.InterfaceC214228aw
    public final void release() {
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.7Qc] */
    public C185577Qb() {
        TopicSearchApi.LIZ.getClass();
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("https://");
        LIZ.append(EF7.LJI.LIZ);
        this.LIZ = (TopicSearchApi) LIZLLL.create(X1D.LIZIZ(LIZ)).create(TopicSearchApi.class);
        this.LIZIZ = new C7PN() { // from class: X.7Qc
            @Override // X.C7PN
            public final Object LJJLIIIJL(Long l, C7PM c7pm) {
                return C185577Qb.this.LIZ.suggestBook(l, 20, c7pm);
            }

            @Override // X.C7PN
            public final Object LLIIII(Long l, C7PM c7pm) {
                return C185577Qb.this.LIZ.suggestMovie(l, 20, c7pm);
            }

            @Override // X.C7PN
            public final Object LJJ(String str, String str2, String str3, C3CS c3cs) {
                return C185577Qb.this.LIZ.searchTopic(str, str2, str3, c3cs);
            }

            @Override // X.C7PN
            public final Object LJLJI(int i, String str, String str2, InterfaceC67352kd interfaceC67352kd) {
                return C185577Qb.this.LIZ.recommendTopic(str, i, 0, str2, interfaceC67352kd);
            }
        };
    }

    @Override // X.InterfaceC214228aw
    public final /* bridge */ /* synthetic */ C7PN getOperator() {
        return this.LIZIZ;
    }
}
