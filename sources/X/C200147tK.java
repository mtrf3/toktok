package X;

import com.ss.android.ugc.aweme.viewmodel.PostDiggViewModel;
import kotlin.jvm.internal.AqS185S0100000_3;

/* renamed from: X.7tK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C200147tK extends TBS implements InterfaceC65784Pro<C76800UCe> {
    public C200147tK(Object obj) {
        super(0, obj, C200107tG.class, "handleDigg", "handleDigg()V", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        C200107tG c200107tG = (C200107tG) this.receiver;
        if (!c200107tG.LJLIL.LJII.hv0() && !((PostDiggViewModel) c200107tG.LJLILLLLZI.getValue()).LJLILLLLZI && c200107tG.LJLIL.LIZJ != null) {
            ((PostDiggViewModel) c200107tG.LJLILLLLZI.getValue()).kv0(new AqS185S0100000_3(c200107tG, 158));
        }
        return C76800UCe.LIZ;
    }
}
