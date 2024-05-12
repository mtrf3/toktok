package X;

import android.widget.ImageView;
import com.bytedance.android.live.walletnew.RechargeDialogNew;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Ue2, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77670Ue2 implements InterfaceC77695UeR {
    public final /* synthetic */ RechargeDialogNew LIZ;

    public C77670Ue2(RechargeDialogNew rechargeDialogNew) {
        this.LIZ = rechargeDialogNew;
    }

    @Override // X.InterfaceC77695UeR
    public final void LIZ(boolean z) {
        if (z) {
            ImageView imageView = (ImageView) this.LIZ._$_findCachedViewById(R.id.d0w);
            if (imageView == null) {
                return;
            }
            imageView.setVisibility(4);
            return;
        }
        ImageView imageView2 = (ImageView) this.LIZ._$_findCachedViewById(R.id.d0w);
        if (imageView2 == null) {
            return;
        }
        imageView2.setVisibility(0);
    }
}
