package X;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryWrapperFragment;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.router.Strategy;
import kotlin.jvm.internal.o;

/* renamed from: X.AhC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC26906AhC extends Strategy {
    public final CommerceBottomSheetDialogFragment LJLIL;
    public final DeliveryPanelViewModel LJLILLLLZI;

    public abstract void LIZ(Bundle bundle);

    public abstract void LIZIZ(DialogInterface dialogInterface);

    public abstract View LIZJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    public abstract void LIZLLL();

    public abstract void LJFF(Dialog dialog);

    public abstract void LJI();

    public abstract void onCreate(Bundle bundle);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC26906AhC(DeliveryWrapperFragment fragment, DeliveryPanelViewModel viewModel) {
        super(null, fragment, 1, null);
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(viewModel, "viewModel");
        this.LJLIL = fragment;
        this.LJLILLLLZI = viewModel;
    }
}
