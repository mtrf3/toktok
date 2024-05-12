package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.o;

/* renamed from: X.T3t, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74033T3t extends AbstractC65781Prl implements InterfaceC88472Yns<C74034T3u, C74034T3u> {
    public static final C74033T3t LJLIL = new C74033T3t();

    public C74033T3t() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C74034T3u invoke(C74034T3u c74034T3u) {
        C74034T3u setState = c74034T3u;
        o.LJIIIZ(setState, "$this$setState");
        C43I c43i = new C43I(EnumC46467ILn.QUIT);
        String effectName = setState.LJLIL;
        String author = setState.LJLILLLLZI;
        UrlModel originalEffectImage = setState.LJLJI;
        android.net.Uri uri = setState.LJLJJI;
        o.LJIIIZ(effectName, "effectName");
        o.LJIIIZ(author, "author");
        o.LJIIIZ(originalEffectImage, "originalEffectImage");
        return new C74034T3u(effectName, author, originalEffectImage, uri, c43i);
    }
}
