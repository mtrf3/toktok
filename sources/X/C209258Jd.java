package X;

import com.ss.android.ugc.aweme.feed.assem.bubblelist.BubbleListAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.8Jd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C209258Jd extends AbstractC65781Prl implements InterfaceC88471Ynr<BubbleListAssem, C43I<? extends C76800UCe>, C76800UCe> {
    public static final C209258Jd LJLIL = new C209258Jd();

    public C209258Jd() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(BubbleListAssem bubbleListAssem, C43I<? extends C76800UCe> c43i) {
        InterfaceC209288Jg interfaceC209288Jg;
        BubbleListAssem selectSubscribe = bubbleListAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null && (interfaceC209288Jg = selectSubscribe.LLF) != null) {
            interfaceC209288Jg.onResume();
        }
        return C76800UCe.LIZ;
    }
}
