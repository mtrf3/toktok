package X;

import android.view.View;
import com.bytedance.android.live.design.view.sheet.action.LiveActionSheetDialog;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UY4 implements InterfaceC14120gy {
    public final /* synthetic */ InterfaceC88471Ynr<Integer, String, C76800UCe> LJLIL;

    /* JADX WARN: Multi-variable type inference failed */
    public UY4(InterfaceC88471Ynr<? super Integer, ? super String, C76800UCe> interfaceC88471Ynr) {
        this.LJLIL = interfaceC88471Ynr;
    }

    @Override // X.InterfaceC14120gy
    public final void LJ(View v, C0KG c0kg, LiveActionSheetDialog liveActionSheetDialog) {
        o.LJIIIZ(v, "v");
        this.LJLIL.invoke(Integer.valueOf(R.raw.icon_magnifying_glass), "Magnifying glass");
        liveActionSheetDialog.dismiss();
    }
}
