package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.CpO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32510CpO extends FrameLayout implements InterfaceC76931UHf {
    public SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJLIL;
    public String LJLILLLLZI;

    @Override // X.InterfaceC76931UHf
    public final boolean LJIL(int i) {
        return true;
    }

    @Override // X.InterfaceC76931UHf
    public final boolean LJJLIL() {
        return false;
    }

    public final String getShowingUrl() {
        return this.LJLILLLLZI;
    }

    public final SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS getSparkView() {
        return this.LJLIL;
    }

    public final void setShowingUrl(String str) {
        this.LJLILLLLZI = str;
    }

    public final void setSparkView(SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) {
        this.LJLIL = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32510CpO(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View changedView, int i) {
        o.LJIIIZ(changedView, "changedView");
        super.onVisibilityChanged(changedView, i);
        if (i == 8) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLIL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
                SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
            }
            this.LJLIL = null;
        }
    }
}
