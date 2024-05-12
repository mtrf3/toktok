package X;

import android.os.Build;
import android.view.View;
import android.view.Window;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.fragment.BaseQuickChatRoomFragment;
import kotlin.jvm.internal.o;
import o3.h0;

/* renamed from: X.4LW, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4LW extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public final /* synthetic */ BaseQuickChatRoomFragment LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4LW(BaseQuickChatRoomFragment baseQuickChatRoomFragment) {
        super(0);
        this.LJLIL = baseQuickChatRoomFragment;
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        View decorView;
        C16800lI LJIIIZ;
        C16210kL LJFF;
        ActivityC45651qj requireActivity = this.LJLIL.requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        Window window = requireActivity.getWindow();
        int i = 0;
        if (window != null && (decorView = window.getDecorView()) != null && (LJIIIZ = h0.LJIIIZ(decorView)) != null && (LJFF = LJIIIZ.LIZ.LJFF()) != null && Build.VERSION.SDK_INT >= 28) {
            i = C16200kK.LJFF(LJFF.LIZ);
        }
        return Integer.valueOf(i);
    }
}
