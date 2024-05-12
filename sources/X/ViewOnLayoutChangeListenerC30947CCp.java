package X;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.impl.revenue.subscription.widget.SubscribeTimeStickerWidget;
import kotlin.jvm.internal.o;

/* renamed from: X.CCp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnLayoutChangeListenerC30947CCp implements View.OnLayoutChangeListener {
    public final /* synthetic */ SubscribeTimeStickerWidget LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ long LJLJJL;

    public ViewOnLayoutChangeListenerC30947CCp(SubscribeTimeStickerWidget subscribeTimeStickerWidget, long j, long j2, long j3, long j4) {
        this.LJLIL = subscribeTimeStickerWidget;
        this.LJLILLLLZI = j;
        this.LJLJI = j2;
        this.LJLJJI = j3;
        this.LJLJJL = j4;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View v, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        o.LJIIIZ(v, "v");
        ConstraintLayout constraintLayout = this.LJLIL.LJLLILLLL;
        if (constraintLayout != null) {
            constraintLayout.removeOnLayoutChangeListener(this);
        }
        SubscribeTimeStickerWidget subscribeTimeStickerWidget = this.LJLIL;
        ConstraintLayout constraintLayout2 = subscribeTimeStickerWidget.LJLLILLLL;
        if (constraintLayout2 != null) {
            subscribeTimeStickerWidget.LLIIIILZ(constraintLayout2, constraintLayout2.getMeasuredWidth(), constraintLayout2.getMeasuredHeight(), this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL);
        }
    }
}
