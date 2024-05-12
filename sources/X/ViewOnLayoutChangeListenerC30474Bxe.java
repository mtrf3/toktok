package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.livesdk.dataChannel.LiveDialogStatusChannel;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveGiftTrayPublicScreenTranslateSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;

/* renamed from: X.Bxe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnLayoutChangeListenerC30474Bxe extends AbstractC30535Byd implements View.OnLayoutChangeListener {
    public int LJLJJI;

    @Override // X.AbstractC30535Byd
    public final void LIZ() {
        HZE hze = new HZE(0, this);
        if (LiveGiftTrayPublicScreenTranslateSetting.enable(EnumC29596BjU.DIALOG_BIZ_SECONDARY_EFFECT_PANEL)) {
            this.LJLILLLLZI.postDelayed(hze, 200L);
        } else {
            hze.run();
        }
        this.LJLILLLLZI.removeOnLayoutChangeListener(this);
        super.dismiss();
    }

    @Override // android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.LJLILLLLZI.removeOnLayoutChangeListener(this);
        this.LJLIL.rv0(LiveDialogStatusChannel.class, new C29602Bja(false, 0, hashCode(), EnumC29596BjU.DIALOG_BIZ_FIRSTLY_EFFECT_PANEL));
    }

    public ViewOnLayoutChangeListenerC30474Bxe(Context context, DataChannel dataChannel, List list) {
        super(context, dataChannel, list);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.LJLJJI != this.LJLILLLLZI.getHeight()) {
            int height = this.LJLILLLLZI.getHeight();
            this.LJLJJI = height;
            this.LJLIL.rv0(LiveDialogStatusChannel.class, new C29602Bja(true, height, hashCode(), EnumC29596BjU.DIALOG_BIZ_FIRSTLY_EFFECT_PANEL));
        }
    }
}
