package X;

import com.ss.android.ugc.aweme.nows.feed.viewmodel.NowOtherCollectionListViewModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7m7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C195677m7 extends TBS implements InterfaceC88472Yns<List<? extends EnumC195697m9>, C76800UCe> {
    public C195677m7(Object obj) {
        super(1, obj, NowOtherCollectionListViewModel.class, "updateFakeStateList", "updateFakeStateList(Ljava/util/List;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(List<? extends EnumC195697m9> list) {
        List<? extends EnumC195697m9> p0 = list;
        o.LJIIIZ(p0, "p0");
        ((NowOtherCollectionListViewModel) this.receiver).kv0(p0);
        return C76800UCe.LIZ;
    }
}
