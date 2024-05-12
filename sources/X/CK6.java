package X;

import Y.ARunnableS9S0101000_5;
import Y.IDRunnableS6S0101000;
import android.graphics.Bitmap;
import android.graphics.drawable.NinePatchDrawable;
import android.widget.ImageView;
import com.bytedance.android.livesdk.function.LiveRoomNotifyWidget;
import com.bytedance.android.livesdk.model.message.RoomNotifyMessage;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class CK6 implements InterfaceC31672Cbs {
    public final /* synthetic */ RoomNotifyMessage LIZ;
    public final /* synthetic */ LiveRoomNotifyWidget LIZIZ;

    @Override // X.InterfaceC31672Cbs
    public final void LIZ(Exception exc) {
        if ("gift_broadcast".equals(this.LIZ.source)) {
            this.LIZIZ.LJLIL.post(new ARunnableS9S0101000_5(1, this, 8));
            return;
        }
        ImageView imageView = this.LIZIZ.LJLIL;
        CKB ckb = CKB.INSTANCE;
        Objects.requireNonNull(ckb);
        imageView.post(new C0BU(3, ckb));
    }

    @Override // X.InterfaceC31672Cbs
    public final void LIZIZ(Bitmap bitmap) {
        float f;
        if (!this.LIZIZ.isViewValid()) {
            return;
        }
        if (C15380j0.LJIIJ() != null) {
            f = C15380j0.LJIIJ().getDisplayMetrics().density / 3.0f;
        } else {
            f = 1.0f;
        }
        NinePatchDrawable LIZ = C31665Cbl.LIZ(f, bitmap);
        ImageView imageView = this.LIZIZ.LJLIL;
        if (imageView != null) {
            imageView.setBackground(LIZ);
        }
        this.LIZIZ.LJLIL.post(new IDRunnableS6S0101000(1, this, 11));
    }

    public CK6(LiveRoomNotifyWidget liveRoomNotifyWidget, RoomNotifyMessage roomNotifyMessage) {
        this.LIZIZ = liveRoomNotifyWidget;
        this.LIZ = roomNotifyMessage;
    }
}
