package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.viewmodel.PostModeFavoriteViewModel;
import kotlin.jvm.internal.AqS28S1000000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.87W, reason: invalid class name */
/* loaded from: classes4.dex */
public final /* synthetic */ class C87W extends TBS implements InterfaceC88473Ynt<String, Object, EnumC84576XHg, C76800UCe> {
    public C87W(Object obj) {
        super(3, obj, PostModeFavoriteViewModel.class, "motaCountCacheSubscriber", "motaCountCacheSubscriber(Ljava/lang/String;Ljava/lang/Object;Lcom/bytedance/mota/storage/motacache/StorageOperation;)V", 0);
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(String p0, Object obj, EnumC84576XHg p2) {
        Long l;
        String str;
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(p2, "p2");
        PostModeFavoriteViewModel postModeFavoriteViewModel = (PostModeFavoriteViewModel) this.receiver;
        Aweme aweme = postModeFavoriteViewModel.LJLIL;
        String str2 = null;
        if (aweme != null) {
            str2 = aweme.getAid();
        }
        if (o.LJ(p0, str2) && obj != null && (obj instanceof Long) && (l = (Long) obj) != null) {
            long longValue = l.longValue();
            postModeFavoriteViewModel.LJLJJLL = longValue;
            try {
                str = C77123UOp.LJJIIJ(longValue);
            } catch (Exception e) {
                C36922EeM.LJFF(e);
                str = CardStruct.IStatusCode.DEFAULT;
            }
            postModeFavoriteViewModel.setState(new AqS28S1000000_3(str, 14));
        }
        return C76800UCe.LIZ;
    }
}
