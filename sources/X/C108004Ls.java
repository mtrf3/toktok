package X;

import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import kotlin.jvm.internal.o;

/* renamed from: X.4Ls, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C108004Ls extends TBS implements InterfaceC88473Ynt<String, RequestParams, InterfaceC88472Yns<? super C61295O3v, ? extends C76800UCe>, C38515F9r> {
    public C108004Ls(Forest forest) {
        super(3, forest, Forest.class, "fetchResourceAsync", "fetchResourceAsync(Ljava/lang/String;Lcom/bytedance/forest/model/RequestParams;Lkotlin/jvm/functions/Function1;)Lcom/bytedance/forest/model/RequestOperation;", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88473Ynt
    public final C38515F9r invoke(String str, RequestParams requestParams, InterfaceC88472Yns<? super C61295O3v, ? extends C76800UCe> interfaceC88472Yns) {
        String p0 = str;
        RequestParams p1 = requestParams;
        InterfaceC88472Yns<? super C61295O3v, ? extends C76800UCe> p2 = interfaceC88472Yns;
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(p1, "p1");
        o.LJIIIZ(p2, "p2");
        return ((Forest) this.receiver).fetchResourceAsync(p0, p1, p2);
    }
}
