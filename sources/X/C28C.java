package X;

import com.bytedance.android.livesdk.chatroom.model.CommentTray;
import kotlin.jvm.internal.o;

/* renamed from: X.28C, reason: invalid class name */
/* loaded from: classes.dex */
public final class C28C extends AbstractC65781Prl implements InterfaceC88472Yns<CommentTray, C76800UCe> {
    public static final C28C LJLIL = new C28C();

    public C28C() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(CommentTray commentTray) {
        CommentTray it = commentTray;
        o.LJIIIZ(it, "it");
        C37861eA.LJLIL.LIZIZ(new C259610e(it.trayId, it.contentType, it.count, Long.MAX_VALUE, it.content));
        return C76800UCe.LIZ;
    }
}
