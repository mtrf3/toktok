package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.JlX, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50107JlX extends FrameLayout {
    public int LJLIL;
    public TuxTextView LJLILLLLZI;
    public SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJLJI;

    public View getHybirdContainerView() {
        return getChildAt(0);
    }

    public int getHybirdType() {
        return this.LJLIL;
    }

    public final SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS getSparkView() {
        return this.LJLJI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50107JlX(Context context) {
        super(context);
        new LinkedHashMap();
        this.LJLIL = 1;
        C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
        SparkContext sparkContext = new SparkContext();
        c40342FsQ.getClass();
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZ = C40343FsR.LIZ(C40342FsQ.LIZ(context, sparkContext));
        this.LJLJI = LIZ;
        addView(LIZ);
        if (o.LJ(((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).getSearchDebugSwitch(), Boolean.TRUE)) {
            Context context2 = getContext();
            o.LJIIIIZZ(context2, "context");
            TuxTextView tuxTextView = new TuxTextView(context2, null, 6, 0);
            tuxTextView.setTextColorRes(R.attr.eb);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(10)));
            layoutParams.gravity = 8388693;
            addView(tuxTextView, layoutParams);
            this.LJLILLLLZI = tuxTextView;
        }
    }

    public final void LIZ(SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) {
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2;
        View childAt = getChildAt(0);
        if ((childAt instanceof SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = (SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) childAt) != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2);
        }
        try {
            if (C78996UzQ.LJJIIJZLJL(getChildAt(0))) {
                C78996UzQ.LJI();
            }
        } catch (Throwable unused) {
        }
        removeViewAt(0);
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getParent() != null) {
            ViewParent parent = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getParent();
            o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            C16880lQ.LJLLL(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, (ViewGroup) parent);
        }
        addView(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, 0);
    }

    public final void setDebugTag(String tag) {
        o.LJIIIZ(tag, "tag");
        TuxTextView tuxTextView = this.LJLILLLLZI;
        if (tuxTextView != null) {
            tuxTextView.setText(tag);
        }
    }

    public final void setSparkView(SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) {
        this.LJLJI = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
    }
}
