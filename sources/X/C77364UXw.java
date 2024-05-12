package X;

import android.view.View;
import com.bytedance.android.live.design.view.sheet.action.LiveActionSheetDialog;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.UXw, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77364UXw implements InterfaceC14120gy {
    public final /* synthetic */ InterfaceC88471Ynr<Integer, String, C76800UCe> LJLIL;

    /* JADX WARN: Multi-variable type inference failed */
    public C77364UXw(InterfaceC88471Ynr<? super Integer, ? super String, C76800UCe> interfaceC88471Ynr) {
        this.LJLIL = interfaceC88471Ynr;
    }

    @Override // X.InterfaceC14120gy
    public final void LJ(View v, C0KG c0kg, LiveActionSheetDialog liveActionSheetDialog) {
        o.LJIIIZ(v, "v");
        this.LJLIL.invoke(Integer.valueOf(R.raw.icon_chevron_left_offset_ltr), "Back");
        liveActionSheetDialog.dismiss();
    }
}
