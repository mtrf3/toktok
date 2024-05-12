package X;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Vibrator;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.impl.revenue.subscription.emote.preview.PreviewImageDialogFragment;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UDP extends C0B4 {
    public final UDQ LIZLLL;
    public boolean LJ;

    @Override // X.C0B4
    public final void LJIILL(RecyclerView.ViewHolder p0) {
        o.LJIIIZ(p0, "p0");
    }

    public UDP(UDQ adapter) {
        o.LJIIIZ(adapter, "adapter");
        this.LIZLLL = adapter;
    }

    public static void LJIILLIIL(int i) {
        Context context = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context();
        if (context == null) {
            return;
        }
        Object LLILL = C16880lQ.LLILL(context, "vibrator");
        o.LJII(LLILL, "null cannot be cast to non-null type android.os.Vibrator");
        try {
            ((Vibrator) LLILL).vibrate(i);
        } catch (Exception unused) {
        }
    }

    @Override // X.C0B4
    public final void LIZIZ(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        PreviewImageDialogFragment previewImageDialogFragment;
        o.LJIIIZ(recyclerView, "recyclerView");
        o.LJIIIZ(viewHolder, "viewHolder");
        UDQ udq = this.LIZLLL;
        udq.getClass();
        if (udq.LJLILLLLZI != -1) {
            UDR udr = (UDR) viewHolder;
            FrameLayout frameLayout = udr.LJLJJI;
            if (frameLayout != null) {
                frameLayout.setScaleY(1.0f);
                udr.LJLJJI.setScaleX(1.0f);
            }
            int adapterPosition = viewHolder.getAdapterPosition();
            int i = udq.LJLILLLLZI;
            if (adapterPosition != i && (previewImageDialogFragment = udq.LJLJJI) != null) {
                previewImageDialogFragment.wl(i, adapterPosition);
            }
            udq.LJLILLLLZI = -1;
        }
        super.LIZIZ(recyclerView, viewHolder);
    }

    @Override // X.C0B4
    public final int LJ(RecyclerView p0, RecyclerView.ViewHolder p1) {
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(p1, "p1");
        return C0B4.LJIIIZ(15, 0);
    }

    @Override // X.C0B4
    public final void LJIILJJIL(RecyclerView.ViewHolder viewHolder, int i) {
        if (i != 0) {
            if (viewHolder != null) {
                LJIILLIIL(100);
                UDQ udq = this.LIZLLL;
                udq.getClass();
                UDR udr = (UDR) viewHolder;
                FrameLayout frameLayout = udr.LJLJJI;
                if (frameLayout != null) {
                    frameLayout.setScaleX(1.0f);
                    udr.LJLJJI.setScaleY(1.0f);
                }
                udq.LJLILLLLZI = viewHolder.getAdapterPosition();
                return;
            }
            return;
        }
        if (viewHolder != null) {
        }
    }

    @Override // X.C0B4
    public final boolean LJIIL(RecyclerView p0, RecyclerView.ViewHolder p1, RecyclerView.ViewHolder viewHolder) {
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(p1, "p1");
        LJIILLIIL(50);
        UDQ udq = this.LIZLLL;
        udq.getClass();
        int adapterPosition = p1.getAdapterPosition();
        int adapterPosition2 = viewHolder.getAdapterPosition();
        if (adapterPosition >= 0 && adapterPosition < udq.LJLIL.size() && adapterPosition2 >= 0 && adapterPosition2 < udq.LJLIL.size()) {
            udq.notifyItemMoved(adapterPosition, adapterPosition2);
            Object remove = ListProtector.remove(udq.LJLIL, adapterPosition);
            o.LJIIIIZZ(remove, "mediaModelList.removeAt(from)");
            ListProtector.add(udq.LJLIL, adapterPosition2, remove);
        }
        return true;
    }

    @Override // X.C0B4
    public final void LJIIJ(Canvas c, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
        float f3 = f2;
        o.LJIIIZ(c, "c");
        o.LJIIIZ(recyclerView, "recyclerView");
        o.LJIIIZ(viewHolder, "viewHolder");
        o.LJIIIIZZ(viewHolder.itemView, "viewHolder.itemView");
        double height = (r8.getHeight() * 0.25d) / 2;
        double top = (viewHolder.itemView.getTop() - height) + f3;
        double height2 = (viewHolder.itemView.getHeight() * 1.25f) + top;
        if (top < LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            f3 = -((float) (viewHolder.itemView.getTop() - height));
        } else if (height2 > recyclerView.getHeight()) {
            f3 = (float) (recyclerView.getHeight() - (r8.getBottom() + height));
        }
        if (i == 2 && !z) {
            if (this.LJ) {
                this.LJ = false;
                this.LIZLLL.getClass();
                ViewPropertyAnimator scaleY = viewHolder.itemView.animate().scaleX(1.0f).scaleY(1.0f);
                o.LJIIIIZZ(scaleY, "holder.itemView.animate(…scaleX(1.0f).scaleY(1.0f)");
                scaleY.translationX(0.0f).translationY(0.0f).setDuration(C0B4.LIZJ(recyclerView, 8)).start();
                return;
            }
            return;
        }
        super.LJIIJ(c, recyclerView, viewHolder, f, f3, i, z);
        this.LJ = true;
    }
}
