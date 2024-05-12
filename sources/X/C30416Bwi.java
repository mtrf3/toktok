package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.broadcast.trymode.TryModeBroadcastFragment;
import com.bytedance.android.livesdk.livesetting.broadcast.BeautyPanelMemoryOptSetting;
import kotlin.jvm.internal.o;

/* renamed from: X.Bwi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30416Bwi extends BZU {
    public final /* synthetic */ TryModeBroadcastFragment LJLIL;

    public C30416Bwi(TryModeBroadcastFragment tryModeBroadcastFragment) {
        this.LJLIL = tryModeBroadcastFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        o.LJIIIZ(view, "view");
        if (this.LJLIL.LLD == null) {
            return;
        }
        BZI LIZ = C28787BRn.LIZ("live_take_beauty_click");
        LIZ.LJIILLIIL(this.LJLIL.LJIIL());
        LIZ.LJIIIZ("live_take");
        LIZ.LJIIL("click");
        LIZ.LJJIIJZLJL();
        if (BeautyPanelMemoryOptSetting.INSTANCE.enable() && view.getContext() == null) {
            return;
        }
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        LiveDialogFragment LIZ2 = C30355Bvj.LIZ(context, this.LJLIL.LJIIL());
        FragmentManager childFragmentManager = this.LJLIL.getChildFragmentManager();
        o.LJIIIIZZ(childFragmentManager, "childFragmentManager");
        LIZ2.show(childFragmentManager, "");
    }
}
