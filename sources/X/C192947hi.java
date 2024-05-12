package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.favorites.business.collection.ChooseCollectionSheetFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.7hi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C192947hi extends AbstractC65781Prl implements InterfaceC88472Yns<C4LX<InterfaceC87283bg>, C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ ChooseCollectionSheetFragment LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C192947hi(boolean z, ChooseCollectionSheetFragment chooseCollectionSheetFragment) {
        super(1);
        this.LJLIL = z;
        this.LJLILLLLZI = chooseCollectionSheetFragment;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C4LX<InterfaceC87283bg> c4lx) {
        String str;
        boolean z;
        C4LX<InterfaceC87283bg> hierarchyData = c4lx;
        o.LJIIIZ(hierarchyData, "$this$hierarchyData");
        boolean z2 = this.LJLIL;
        Bundle arguments = this.LJLILLLLZI.getArguments();
        if (arguments != null) {
            str = arguments.getString("excludeId");
        } else {
            str = null;
        }
        Bundle arguments2 = this.LJLILLLLZI.getArguments();
        if (arguments2 != null) {
            z = arguments2.getBoolean("useCache");
        } else {
            z = false;
        }
        hierarchyData.LIZ = new C192817hV(z2, str, z);
        return C76800UCe.LIZ;
    }
}
