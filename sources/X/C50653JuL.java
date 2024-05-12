package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.o;

/* renamed from: X.JuL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50653JuL extends F9E implements InterfaceC55260LmS {
    public static final C50654JuM LJLILLLLZI = new C50654JuM();
    public static final List<String> LJLJI = C47261Igj.LJJIJIIJI("general_search", "search_result", "goods_search");
    public static final List<String> LJLJJI = C47261Igj.LJJIJIIJI("homepage_follow", "homepage_hot", "homepage_friends", "homepage_popular", "homepage_topic", "homepage_now", "homepage_nearby", "homepage_explore", "discovery");
    public final java.util.Map<String, String> LJLIL;

    public C50653JuL() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    public C50653JuL(java.util.Map<String, String> extraParamMap) {
        o.LJIIIZ(extraParamMap, "extraParamMap");
        this.LJLIL = extraParamMap;
        o.LJIIIIZZ(UUID.randomUUID().toString(), "randomUUID().toString()");
    }

    public /* synthetic */ C50653JuL(int i) {
        this(new LinkedHashMap());
    }
}
