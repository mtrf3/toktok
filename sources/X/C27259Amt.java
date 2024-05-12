package X;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditActivity;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Amt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27259Amt extends AbstractC27261Amv {
    public AddressEditFragment LJLILLLLZI;

    @Override // X.AbstractC27261Amv
    public final void onDestroy() {
    }

    @Override // X.AbstractC27261Amv
    public final void LIZ() {
        AddressEditFragment addressEditFragment = this.LJLILLLLZI;
        if (addressEditFragment != null) {
            addressEditFragment.onInVisible();
        }
    }

    @Override // X.AbstractC27261Amv
    public final void onStart() {
        AddressEditFragment addressEditFragment = this.LJLILLLLZI;
        if (addressEditFragment != null) {
            addressEditFragment.onVisible();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27259Amt(AddressEditActivity activity) {
        super(activity);
        o.LJIIIZ(activity, "activity");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.router.Strategy
    public final void onBackPressed(InterfaceC65784Pro<C76800UCe> defaultAction) {
        o.LJIIIZ(defaultAction, "defaultAction");
        AddressEditFragment addressEditFragment = this.LJLILLLLZI;
        if (addressEditFragment != null) {
            addressEditFragment.vl();
        }
    }

    @Override // X.AbstractC27261Amv
    public final void onCreate(Bundle bundle) {
        this.LJLIL.setContentView(R.layout.wz);
        C1A7.LJJIJL(this.LJLIL.getWindow());
        new OM5(this.LJLIL);
        AddressEditFragment addressEditFragment = null;
        if (bundle != null) {
            Fragment LJJJIL = this.LJLIL.getSupportFragmentManager().LJJJIL("address_edit_fragment");
            if (LJJJIL instanceof AddressEditFragment) {
                addressEditFragment = (AddressEditFragment) LJJJIL;
            }
            this.LJLILLLLZI = addressEditFragment;
            return;
        }
        C27007Aip c27007Aip = AddressPageStarter.AddressEditEnterParams.Companion;
        Intent intent = this.LJLIL.getIntent();
        c27007Aip.getClass();
        AddressPageStarter.AddressEditEnterParams LIZ = C27007Aip.LIZ(intent);
        if (LIZ != null) {
            addressEditFragment = new AddressEditFragment();
            addressEditFragment.LJLLJ = LIZ;
            addressEditFragment.LJLLLLLL = SystemClock.elapsedRealtime();
        }
        this.LJLILLLLZI = addressEditFragment;
        if (addressEditFragment == null) {
            return;
        }
        FragmentManager supportFragmentManager = this.LJLIL.getSupportFragmentManager();
        C1B3 LIZ2 = C1B6.LIZ(supportFragmentManager, supportFragmentManager);
        LIZ2.LJIIIIZZ(this.LJLIL._$_findCachedViewById(R.id.bs8).getId(), 1, addressEditFragment, "address_edit_fragment");
        LIZ2.LJI();
    }
}
