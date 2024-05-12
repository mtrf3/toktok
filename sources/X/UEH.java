package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;
import tikcast.api.anchor_data.RealtimeLiveCenterLayoutTab;

/* loaded from: classes14.dex */
public final class UEH extends UED {
    public final FrameLayout LJLIL;
    public final /* synthetic */ UEF LJLILLLLZI;

    @Override // X.UED
    public final void L(int i) {
        RealtimeLiveCenterLayoutTab realtimeLiveCenterLayoutTab;
        String str;
        List<RealtimeLiveCenterLayoutTab> list = this.LJLILLLLZI.LJLIL.LJLJLJ;
        if (list == null || (realtimeLiveCenterLayoutTab = (RealtimeLiveCenterLayoutTab) ListProtector.get(list, i - 4)) == null || (str = realtimeLiveCenterLayoutTab.lynxUrl) == null) {
            return;
        }
        IHybridContainerService LJIILIIL = C7N.LJIILIIL();
        Context context = this.LJLILLLLZI.LJLIL.getContext();
        o.LJIIIIZZ(context, "context");
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZIZ = C05590Jv.LIZIZ(LJIILIIL, context, str, false, null, 12);
        this.LJLIL.removeAllViews();
        this.LJLIL.addView(LIZIZ, -1, -2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UEH(UEF uef, View view) {
        super(view);
        this.LJLILLLLZI = uef;
        this.LJLIL = (FrameLayout) view.findViewById(R.id.gb_);
    }
}
