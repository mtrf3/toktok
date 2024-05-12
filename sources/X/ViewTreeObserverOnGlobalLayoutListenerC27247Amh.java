package X;

import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS9S0010000_4;

/* renamed from: X.Amh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC27247Amh implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View LJLIL;
    public final /* synthetic */ Rect LJLILLLLZI;
    public final /* synthetic */ View LJLJI;
    public final /* synthetic */ AddressEditFragment LJLJJI;

    public ViewTreeObserverOnGlobalLayoutListenerC27247Amh(View view, Rect rect, View view2, AddressEditFragment addressEditFragment) {
        this.LJLIL = view;
        this.LJLILLLLZI = rect;
        this.LJLJI = view2;
        this.LJLJJI = addressEditFragment;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        DisplayMetrics displayMetrics;
        Resources resources;
        float f = 148;
        View view = this.LJLIL;
        if (view != null && (resources = view.getResources()) != null) {
            displayMetrics = resources.getDisplayMetrics();
        } else {
            displayMetrics = null;
        }
        boolean z = true;
        int applyDimension = (int) TypedValue.applyDimension(1, f, displayMetrics);
        View view2 = this.LJLIL;
        if (view2 != null) {
            view2.getWindowVisibleDisplayFrame(this.LJLILLLLZI);
        }
        int height = this.LJLJI.getHeight();
        Rect rect = this.LJLILLLLZI;
        if (height - (rect.bottom - rect.top) < applyDimension) {
            z = false;
        }
        AddressEditFragment addressEditFragment = this.LJLJJI;
        if (z != addressEditFragment.LJLJI) {
            addressEditFragment.LJLJI = z;
            if (z) {
                View _$_findCachedViewById = addressEditFragment._$_findCachedViewById(R.id.jah);
                if (_$_findCachedViewById != null) {
                    _$_findCachedViewById.setVisibility(8);
                }
                View _$_findCachedViewById2 = this.LJLJJI._$_findCachedViewById(R.id.hvv);
                if (_$_findCachedViewById2 != null) {
                    _$_findCachedViewById2.setVisibility(8);
                }
                View _$_findCachedViewById3 = this.LJLJJI._$_findCachedViewById(R.id.jai);
                if (_$_findCachedViewById3 == null) {
                    return;
                }
                _$_findCachedViewById3.setVisibility(8);
                return;
            }
            AddressEditViewModel Dl = addressEditFragment.Dl();
            Dl.getClass();
            Dl.setState(new AqS9S0010000_4(false, 58));
            View _$_findCachedViewById4 = this.LJLJJI._$_findCachedViewById(R.id.jah);
            if (_$_findCachedViewById4 != null) {
                _$_findCachedViewById4.setVisibility(0);
            }
            View _$_findCachedViewById5 = this.LJLJJI._$_findCachedViewById(R.id.hvv);
            if (_$_findCachedViewById5 != null) {
                _$_findCachedViewById5.setVisibility(0);
            }
            View _$_findCachedViewById6 = this.LJLJJI._$_findCachedViewById(R.id.jai);
            if (_$_findCachedViewById6 != null) {
                _$_findCachedViewById6.setVisibility(0);
            }
            ViewGroup viewGroup = (ViewGroup) this.LJLJJI._$_findCachedViewById(R.id.isf);
            if (viewGroup == null) {
                return;
            }
            viewGroup.clearFocus();
        }
    }
}
