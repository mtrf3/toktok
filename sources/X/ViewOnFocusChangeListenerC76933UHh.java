package X;

import Y.ARunnableS49S0100000_13;
import android.view.View;
import com.ss.android.ugc.aweme.compliance.protection.timelock.ui.fragment.AbsTimeLockFragment;

/* renamed from: X.UHh, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class ViewOnFocusChangeListenerC76933UHh implements View.OnFocusChangeListener {
    public final /* synthetic */ View LJLIL;
    public final /* synthetic */ View.OnFocusChangeListener LJLILLLLZI;
    public final /* synthetic */ AbsTimeLockFragment LJLJI;

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        view.post(new ARunnableS49S0100000_13(this, 128));
        View.OnFocusChangeListener onFocusChangeListener = this.LJLILLLLZI;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z);
        }
    }

    public ViewOnFocusChangeListenerC76933UHh(AbsTimeLockFragment absTimeLockFragment, T5T t5t, View.OnFocusChangeListener onFocusChangeListener) {
        this.LJLJI = absTimeLockFragment;
        this.LJLIL = t5t;
        this.LJLILLLLZI = onFocusChangeListener;
    }
}
