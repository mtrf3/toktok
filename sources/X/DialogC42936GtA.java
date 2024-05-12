package X;

import Y.ACListenerS27S0100000_7;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.tux.icon.TuxIconView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.sticker.model.EffectAttribution;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS138S0200000_7;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.GtA, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class DialogC42936GtA extends OOS {
    public final String LJLJLLL;
    public final List<EffectAttribution> LJLL;
    public View LJLLI;
    public TuxIconView LJLLILLLL;
    public RecyclerView LJLLJ;
    public final C62822Ol8 LJLLL;
    public final ACListenerS27S0100000_7 LJLLLL;

    @Override // X.OOS, android.app.Dialog
    public final void onStart() {
        FrameLayout.LayoutParams layoutParams;
        super.onStart();
        View findViewById = findViewById(R.id.c8m);
        ViewGroup.LayoutParams layoutParams2 = null;
        if (findViewById != null) {
            findViewById.setBackground(null);
            BottomSheetBehavior from = BottomSheetBehavior.from(findViewById);
            from.setPeekHeight((int) (KL2.LJIIIZ(getContext()) * 0.7d));
            from.setSkipCollapsed(false);
        }
        View view = this.LJLLI;
        if (view != null) {
            layoutParams2 = view.getLayoutParams();
        }
        if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
            layoutParams.gravity = 80;
            View view2 = this.LJLLI;
            if (view2 == null) {
                return;
            }
            view2.setLayoutParams(layoutParams);
        }
    }

    @Override // X.OOS, X.C18Z, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        try {
            Window window = getWindow();
            if (window != null) {
                window.addFlags(LiveLayoutPreloadThreadPriority.DEFAULT);
            }
        } catch (Exception e) {
            C36922EeM.LJ(e.getMessage());
        }
        super.onCreate(bundle);
        setContentView(R.layout.atb);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setStatusBarColor(0);
        }
        View findViewById = findViewById(R.id.j7n);
        if (findViewById != null) {
            this.LJLLI = findViewById;
            TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.eb1);
            if (tuxIconView != null) {
                this.LJLLILLLL = tuxIconView;
                RecyclerView recyclerView = (RecyclerView) findViewById(R.id.isd);
                if (recyclerView != null) {
                    this.LJLLJ = recyclerView;
                    TuxIconView tuxIconView2 = this.LJLLILLLL;
                    if (tuxIconView2 != null) {
                        C16880lQ.LJJJ(tuxIconView2, this.LJLLLL);
                    }
                    RecyclerView recyclerView2 = this.LJLLJ;
                    if (recyclerView2 != null) {
                        recyclerView2.setAdapter(new C42944GtI(new AqS138S0200000_7(recyclerView2, this, 122), this.LJLL));
                        return;
                    }
                    return;
                }
                throw new ExceptionInInitializerError();
            }
            throw new ExceptionInInitializerError();
        }
        throw new ExceptionInInitializerError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC42936GtA(Context context, String stickId, List<EffectAttribution> list) {
        super(context, R.style.a6_);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(stickId, "stickId");
        o.LJIIIZ(list, "list");
        this.LJLJLLL = stickId;
        this.LJLL = list;
        this.LJLLL = C221108m2.LIZIZ(new AqS157S0100000_7(context, 759));
        this.LJLLLL = new ACListenerS27S0100000_7(this, 198);
    }
}
