package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.topic.review.api.TopicReviewApi;

/* renamed from: X.7Sg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C186147Sg implements InterfaceC214228aw<Object> {
    public final TopicReviewApi LIZ;
    public final C186187Sk LIZIZ;

    @Override // X.InterfaceC214228aw
    public final void release() {
    }

    public C186147Sg() {
        TopicReviewApi.LIZ.getClass();
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("https://");
        LIZ.append(EF7.LJI.LIZ);
        this.LIZ = (TopicReviewApi) LIZLLL.create(X1D.LIZIZ(LIZ)).create(TopicReviewApi.class);
        this.LIZIZ = new C186187Sk(this);
    }

    @Override // X.InterfaceC214228aw
    public final /* bridge */ /* synthetic */ Object getOperator() {
        return this.LIZIZ;
    }
}
