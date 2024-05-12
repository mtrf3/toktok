package X;

import com.ss.android.ugc.aweme.comment.commentlist.api.CommentBatchManagementApi;
import com.ss.android.ugc.aweme.services.RetrofitService;
import kotlin.jvm.internal.o;

/* renamed from: X.AEv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25909AEv {
    public static final /* synthetic */ C25909AEv LIZ = new C25909AEv();

    public static CommentBatchManagementApi LIZ() {
        Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(com.ss.android.ugc.aweme.app.api.Api.LIZ).create(CommentBatchManagementApi.class);
        o.LJIIIIZZ(create, "get().getService(IRetrof…anagementApi::class.java)");
        return (CommentBatchManagementApi) create;
    }
}
