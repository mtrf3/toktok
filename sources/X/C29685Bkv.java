package X;

import android.view.View;
import com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget;
import kotlin.jvm.internal.o;

/* renamed from: X.Bkv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C29685Bkv extends TBS implements InterfaceC88472Yns<View, C76800UCe> {
    public C29685Bkv(Object obj) {
        super(1, obj, PreviewToolBaseWidget.class, "onClick", "onClick(Landroid/view/View;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(View view) {
        View p0 = view;
        o.LJIIIZ(p0, "p0");
        ((PreviewToolBaseWidget) this.receiver).onClick(p0);
        return C76800UCe.LIZ;
    }
}
