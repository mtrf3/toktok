package X;

import Y.ARunnableS9S0110000_3;
import com.ss.android.ugc.aweme.ui.fragment.PostModeDetailFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.7uR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C200837uR extends TBS implements InterfaceC88473Ynt<String, Object, EnumC84576XHg, C76800UCe> {
    public C200837uR(Object obj) {
        super(3, obj, PostModeDetailFragment.class, "motaCacheSubscriber", "motaCacheSubscriber(Ljava/lang/String;Ljava/lang/Object;Lcom/bytedance/mota/storage/motacache/StorageOperation;)V", 0);
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(String p0, Object obj, EnumC84576XHg p2) {
        Boolean bool;
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(p2, "p2");
        PostModeDetailFragment postModeDetailFragment = (PostModeDetailFragment) this.receiver;
        postModeDetailFragment.getClass();
        if (obj != null && (obj instanceof Boolean) && (bool = (Boolean) obj) != null) {
            boolean booleanValue = bool.booleanValue();
            if (p2 == EnumC84576XHg.Mutation) {
                C1DH.LJJIJIIJI(new ARunnableS9S0110000_3(postModeDetailFragment, booleanValue, 8));
            }
        }
        return C76800UCe.LIZ;
    }
}
