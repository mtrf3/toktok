package X;

import com.ss.android.ugc.aweme.feed.assem.addyours.AddYoursEntranceButtonAssem;
import com.ss.android.ugc.aweme.feed.assem.addyours.AddYoursEntranceButtonVM;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* renamed from: X.8uZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C226398uZ extends AbstractC65781Prl implements InterfaceC88471Ynr<AddYoursEntranceButtonAssem, C43I<? extends Integer>, C76800UCe> {
    public static final C226398uZ LJLIL = new C226398uZ();

    public C226398uZ() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(AddYoursEntranceButtonAssem addYoursEntranceButtonAssem, C43I<? extends Integer> c43i) {
        boolean z;
        AddYoursEntranceButtonAssem selectSubscribe = addYoursEntranceButtonAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onHolderSelectedEvent, isVisible=");
        if (selectSubscribe.getContainerView().getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        U26.LIZLLL(LIZ, z, LIZ, "AddYoursEntranceButtonAssem");
        if (c43i != null && selectSubscribe.getContainerView().getVisibility() == 0) {
            selectSubscribe.LLIIJI = true;
            selectSubscribe.u4();
            ((AddYoursEntranceButtonVM) selectSubscribe.LLIIIL.getValue()).lv0("add_yours_bottom_button_show", (VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe));
        }
        return C76800UCe.LIZ;
    }
}
