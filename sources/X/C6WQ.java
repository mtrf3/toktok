package X;

import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.internal.o;

/* renamed from: X.6WQ, reason: invalid class name */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6WQ extends TBS implements InterfaceC88472Yns<String, C76800UCe> {
    public C6WQ(Object obj) {
        super(1, obj, C6WM.class, "updateTitle", "updateTitle(Ljava/lang/String;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(String str) {
        String p0 = str;
        o.LJIIIZ(p0, "p0");
        TuxTextView tuxTextView = ((C6WM) this.receiver).LJLJL;
        if (tuxTextView != null) {
            tuxTextView.setText(p0);
        }
        return C76800UCe.LIZ;
    }
}
