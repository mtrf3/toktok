package X;

import android.view.ViewTreeObserver;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.lynxcard.DynamicCardViewHolder;

/* loaded from: classes11.dex */
public final class OHE implements ViewTreeObserver.OnWindowFocusChangeListener {
    public final /* synthetic */ DynamicCardViewHolder LJLIL;

    public OHE(DynamicCardViewHolder dynamicCardViewHolder) {
        this.LJLIL = dynamicCardViewHolder;
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        if (z && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLIL.LLIIIJ) != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.requestLayout();
        }
    }
}
