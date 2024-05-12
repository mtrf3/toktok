package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.viewmodel.PostModeFavoriteViewModel;
import kotlin.jvm.internal.AqS8S0010000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.87X, reason: invalid class name */
/* loaded from: classes4.dex */
public final /* synthetic */ class C87X extends TBS implements InterfaceC88473Ynt<String, Object, EnumC84576XHg, C76800UCe> {
    public C87X(Object obj) {
        super(3, obj, PostModeFavoriteViewModel.class, "motaCacheSubscriber", "motaCacheSubscriber(Ljava/lang/String;Ljava/lang/Object;Lcom/bytedance/mota/storage/motacache/StorageOperation;)V", 0);
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(String p0, Object obj, EnumC84576XHg p2) {
        Boolean bool;
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(p2, "p2");
        PostModeFavoriteViewModel postModeFavoriteViewModel = (PostModeFavoriteViewModel) this.receiver;
        Aweme aweme = postModeFavoriteViewModel.LJLIL;
        String str = null;
        if (aweme != null) {
            str = aweme.getAid();
        }
        if (o.LJ(p0, str) && obj != null && (obj instanceof Boolean) && (bool = (Boolean) obj) != null) {
            boolean booleanValue = bool.booleanValue();
            if (p2 == EnumC84576XHg.Mutation) {
                postModeFavoriteViewModel.setState(new AqS8S0010000_3(booleanValue, 38));
            }
        }
        return C76800UCe.LIZ;
    }
}
