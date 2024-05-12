package X;

import com.ss.android.ugc.aweme.story.feed.immersive.component.StoryLoadingComponent;
import kotlin.jvm.internal.o;

/* renamed from: X.8M1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8M1 extends AbstractC65781Prl implements InterfaceC88471Ynr<StoryLoadingComponent, C43I<? extends Boolean>, C76800UCe> {
    public static final C8M1 LJLIL = new C8M1();

    public C8M1() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(StoryLoadingComponent storyLoadingComponent, C43I<? extends Boolean> c43i) {
        StoryLoadingComponent selectSubscribe = storyLoadingComponent;
        C43I<? extends Boolean> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null) {
            if (((Boolean) c43i2.LIZ).booleanValue()) {
                AnonymousClass961 q4 = selectSubscribe.q4();
                if (q4 != null) {
                    q4.LIZJ();
                }
            } else {
                AnonymousClass961 q42 = selectSubscribe.q4();
                if (q42 != null) {
                    q42.LIZLLL();
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
