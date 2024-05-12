package X;

import android.view.ViewGroup;
import com.lynx.tasm.LynxViewClient;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.lynxcard.DynamicCardViewHolder;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OHD extends LynxViewClient {
    public final /* synthetic */ DynamicCardViewHolder.IMSparkContext LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ DynamicCardViewHolder LIZJ;

    @Override // com.lynx.tasm.LynxViewClient
    public final void LIZLLL() {
        int i;
        String str = DynamicCardViewHolder.LLIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("lynxClient onDataUpdated sparkView = ");
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LIZ.boundSparkView;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            i = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.hashCode();
        } else {
            i = 0;
        }
        LIZ.append(i);
        LIZ.append(", uuid = ");
        LIZ.append(this.LIZIZ);
        LIZ.append(" isInvalidCallback = ");
        LIZ.append(this.LIZ.LJJIL());
        C34B.LIZIZ(str, X1D.LIZIZ(LIZ));
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJII() {
        int i;
        String str = DynamicCardViewHolder.LLIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("lynxClient onFirstScreen sparkView = ");
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LIZ.boundSparkView;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            i = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.hashCode();
        } else {
            i = 0;
        }
        LIZ.append(i);
        LIZ.append(", uuid = ");
        LIZ.append(this.LIZIZ);
        LIZ.append(" isInvalidCallback = ");
        LIZ.append(this.LIZ.LJJIL());
        C34B.LJI(str, X1D.LIZIZ(LIZ));
        LJJIIZI();
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIILLIIL() {
        int i;
        String str = DynamicCardViewHolder.LLIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("lynxClient onPageUpdate sparkView = ");
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LIZ.boundSparkView;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            i = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.hashCode();
        } else {
            i = 0;
        }
        LIZ.append(i);
        LIZ.append(", uuid = ");
        LIZ.append(this.LIZIZ);
        LIZ.append(" isInvalidCallback = ");
        LIZ.append(this.LIZ.LJJIL());
        C34B.LJI(str, X1D.LIZIZ(LIZ));
        LJJIIZI();
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJJIIJZLJL() {
        int i;
        String str = DynamicCardViewHolder.LLIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("lynxClient onUpdateDataWithoutChange sparkView = ");
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LIZ.boundSparkView;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            i = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.hashCode();
        } else {
            i = 0;
        }
        LIZ.append(i);
        LIZ.append(", uuid = ");
        LIZ.append(this.LIZIZ);
        LIZ.append(" isInvalidCallback = ");
        LIZ.append(this.LIZ.LJJIL());
        C34B.LIZIZ(str, X1D.LIZIZ(LIZ));
    }

    public final void LJJIIZI() {
        Boolean bool;
        int i;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LIZ.boundSparkView;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            bool = Boolean.valueOf(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LIZLLL());
        } else {
            bool = null;
        }
        if (o.LJ(bool, Boolean.TRUE) && !this.LIZ.LJJIL()) {
            String str = DynamicCardViewHolder.LLIL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("lynxClient changeSparkViewWrapContent sparkView = ");
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = this.LIZ.boundSparkView;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 != null) {
                i = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2.hashCode();
            } else {
                i = 0;
            }
            LIZ.append(i);
            LIZ.append(", uuid = ");
            LIZ.append(this.LIZIZ);
            LIZ.append(" isLoadSuccess = ");
            LIZ.append(bool);
            C34B.LIZIZ(str, X1D.LIZIZ(LIZ));
            DynamicCardViewHolder dynamicCardViewHolder = this.LIZJ;
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3 = this.LIZ.boundSparkView;
            dynamicCardViewHolder.getClass();
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3 != null) {
                ViewGroup.LayoutParams layoutParams = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = -2;
                }
                ViewGroup.LayoutParams layoutParams2 = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = -2;
                }
                sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3.requestLayout();
            }
        }
    }

    public OHD(DynamicCardViewHolder.IMSparkContext iMSparkContext, String str, DynamicCardViewHolder dynamicCardViewHolder) {
        this.LIZ = iMSparkContext;
        this.LIZIZ = str;
        this.LIZJ = dynamicCardViewHolder;
    }
}
