package X;

import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.viewmodel.MentionFavoriteVideoVM;
import java.util.List;
import kotlin.jvm.internal.AqS72S0400000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.T1o, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73976T1o extends AbstractC65781Prl implements InterfaceC88474Ynu<InterfaceC11440ce, Integer, InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ List<C9QW> LJLIL;
    public final /* synthetic */ MentionFavoriteVideoVM LJLILLLLZI;
    public final /* synthetic */ IAVPublishService LJLJI;
    public final /* synthetic */ View LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C73976T1o(List<C9QW> list, MentionFavoriteVideoVM mentionFavoriteVideoVM, IAVPublishService iAVPublishService, View view) {
        super(4);
        this.LJLIL = list;
        this.LJLILLLLZI = mentionFavoriteVideoVM;
        this.LJLJI = iAVPublishService;
        this.LJLJJI = view;
    }

    @Override // X.InterfaceC88474Ynu
    public final C76800UCe invoke(InterfaceC11440ce items, Integer num, InterfaceC24520xk interfaceC24520xk, Integer num2) {
        int i;
        int intValue = num.intValue();
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        int intValue2 = num2.intValue();
        o.LJIIIZ(items, "$this$items");
        if ((intValue2 & 112) == 0) {
            if (interfaceC24520xk2.LJIIIZ(intValue)) {
                i = 32;
            } else {
                i = 16;
            }
            intValue2 |= i;
        }
        if ((intValue2 & 721) != 144 || !interfaceC24520xk2.LIZ()) {
            MentionFavoriteVideoVM mentionFavoriteVideoVM = this.LJLILLLLZI;
            interfaceC24520xk2.LJJIIJ(-492369756);
            Object LJIILL = interfaceC24520xk2.LJIILL();
            InterfaceC24520xk.LIZ.getClass();
            if (LJIILL == C24500xi.LIZIZ) {
                LJIILL = C78966Uyw.LJJJIL(Boolean.valueOf(mentionFavoriteVideoVM.hv0()));
                interfaceC24520xk2.LJJIII(LJIILL);
            }
            interfaceC24520xk2.LJJIJIIJIL();
            InterfaceC35811ar interfaceC35811ar = (InterfaceC35811ar) LJIILL;
            C9QW c9qw = (C9QW) ListProtector.get(this.LJLIL, intValue);
            C79162V5a.LIZ(c9qw, ((Boolean) interfaceC35811ar.getValue()).booleanValue(), new AqS72S0400000_12(c9qw, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, 31), null, new AqS72S0400000_12(c9qw, (C9QW) this.LJLILLLLZI, (MentionFavoriteVideoVM) this.LJLJI, (IAVPublishService) interfaceC35811ar, (InterfaceC35811ar<Boolean>) 32), interfaceC24520xk2, 8, 8);
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
