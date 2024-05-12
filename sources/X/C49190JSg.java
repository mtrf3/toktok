package X;

import android.graphics.Rect;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageHeightSetting;
import kotlin.jvm.internal.AqS158S0100000_8;

/* renamed from: X.JSg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49190JSg extends AbstractC49155JQx {
    public final InterfaceC49148JQq LIZLLL;
    public final View LJ;
    public final C62822Ol8 LJFF = C221108m2.LIZIZ(C49192JSi.LJLIL);
    public final C62822Ol8 LJI = C221108m2.LIZIZ(C49193JSj.LJLIL);
    public final C62822Ol8 LJII = C221108m2.LIZIZ(new AqS158S0100000_8(this, LiveBroadcastUploadVideoImageHeightSetting.DEFAULT));

    @Override // X.AbstractC49155JQx
    public final void LIZLLL() {
    }

    @Override // X.AbstractC49155JQx
    public final int LIZ() {
        return ((Number) this.LJII.getValue()).intValue();
    }

    @Override // X.AbstractC49155JQx
    public final Rect LIZIZ() {
        this.LJ.getLocationOnScreen(LJI());
        ((Rect) this.LJFF.getValue()).set(LJI()[0], LJI()[1], this.LJ.getWidth() + LJI()[0], this.LJ.getHeight() + LJI()[1]);
        return (Rect) this.LJFF.getValue();
    }

    public final int[] LJI() {
        return (int[]) this.LJI.getValue();
    }

    public C49190JSg(InterfaceC49148JQq interfaceC49148JQq, View view) {
        this.LIZLLL = interfaceC49148JQq;
        this.LJ = view;
    }
}
