package X;

import Y.ARunnableS9S0110000_3;
import com.ss.android.ugc.aweme.fullpagev3.PostModeDetailFragmentV3;
import kotlin.jvm.internal.o;

/* renamed from: X.7uQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C200827uQ extends TBS implements InterfaceC88473Ynt<String, Object, EnumC84576XHg, C76800UCe> {
    public C200827uQ(Object obj) {
        super(3, obj, PostModeDetailFragmentV3.class, "motaCacheSubscriber", "motaCacheSubscriber(Ljava/lang/String;Ljava/lang/Object;Lcom/bytedance/mota/storage/motacache/StorageOperation;)V", 0);
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(String p0, Object obj, EnumC84576XHg p2) {
        Boolean bool;
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(p2, "p2");
        PostModeDetailFragmentV3 postModeDetailFragmentV3 = (PostModeDetailFragmentV3) this.receiver;
        postModeDetailFragmentV3.getClass();
        if (obj != null && (obj instanceof Boolean) && (bool = (Boolean) obj) != null) {
            boolean booleanValue = bool.booleanValue();
            if (p2 == EnumC84576XHg.Mutation) {
                C1DH.LJJIJIIJI(new ARunnableS9S0110000_3(postModeDetailFragmentV3, booleanValue, 5));
            }
        }
        return C76800UCe.LIZ;
    }
}
