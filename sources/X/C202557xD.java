package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.feed.immersive.digg.ImmersiveStoryDiggAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.7xD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C202557xD extends AbstractC65781Prl implements InterfaceC88471Ynr<ImmersiveStoryDiggAssem, C43I<? extends Aweme>, C76800UCe> {
    public static final C202557xD LJLIL = new C202557xD();

    public C202557xD() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(ImmersiveStoryDiggAssem immersiveStoryDiggAssem, C43I<? extends Aweme> c43i) {
        ImmersiveStoryDiggAssem selectSubscribeOnAsync = immersiveStoryDiggAssem;
        C43I<? extends Aweme> c43i2 = c43i;
        o.LJIIIZ(selectSubscribeOnAsync, "$this$selectSubscribeOnAsync");
        if (c43i2 != null) {
            selectSubscribeOnAsync.q4().m6((Aweme) c43i2.LIZ);
        }
        return C76800UCe.LIZ;
    }
}
