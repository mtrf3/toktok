package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.ss.android.ugc.aweme.feed.assem.bubblelist.BubbleListAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.8Jf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C209278Jf extends AbstractC65781Prl implements InterfaceC88471Ynr<BubbleListAssem, C43I<? extends C195357lb>, C76800UCe> {
    public static final C209278Jf LJLIL = new C209278Jf();

    public C209278Jf() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(BubbleListAssem bubbleListAssem, C43I<? extends C195357lb> c43i) {
        ViewTreeObserver viewTreeObserver;
        BubbleListAssem selectSubscribe = bubbleListAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null) {
            InterfaceC209288Jg interfaceC209288Jg = selectSubscribe.LLF;
            if (interfaceC209288Jg != null) {
                interfaceC209288Jg.LJJIIZ();
            }
            View view = selectSubscribe.LLFF;
            if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(selectSubscribe.LLI);
            }
        }
        return C76800UCe.LIZ;
    }
}
