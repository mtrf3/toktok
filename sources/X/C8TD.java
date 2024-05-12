package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.feed.common.newarch.component.StoryFakePlayerComponent;
import kotlin.jvm.internal.o;

/* renamed from: X.8TD, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8TD extends AbstractC65781Prl implements InterfaceC88471Ynr<StoryFakePlayerComponent, C43I<? extends C70012ov>, C76800UCe> {
    public static final C8TD LJLIL = new C8TD();

    public C8TD() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(StoryFakePlayerComponent storyFakePlayerComponent, C43I<? extends C70012ov> c43i) {
        C70012ov c70012ov;
        String str;
        StoryFakePlayerComponent selectSubscribe = storyFakePlayerComponent;
        C43I<? extends C70012ov> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null && (c70012ov = (C70012ov) c43i2.LIZ) != null) {
            if (c70012ov.LJLJJLL) {
                if (!C1DF.LJJIII(c70012ov.LJLIL)) {
                    selectSubscribe.g4();
                } else {
                    String aid = c70012ov.LJLIL.getAid();
                    Aweme aweme = selectSubscribe.LLFII;
                    if (aweme != null) {
                        str = aweme.getAid();
                    } else {
                        str = null;
                    }
                    if (!o.LJ(aid, str)) {
                        selectSubscribe.c4(c70012ov.LJLIL);
                    } else {
                        selectSubscribe.mr();
                    }
                }
            }
            selectSubscribe.LLFII = c70012ov.LJLIL;
        }
        return C76800UCe.LIZ;
    }
}
