package X;

import com.ss.android.ugc.aweme.music.search.cell.SearchMusicCellAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.9cc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C240749cc extends AbstractC65781Prl implements InterfaceC88471Ynr<SearchMusicCellAssem, C43I<? extends String>, C76800UCe> {
    public static final C240749cc LJLIL = new C240749cc();

    public C240749cc() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(SearchMusicCellAssem searchMusicCellAssem, C43I<? extends String> c43i) {
        String str;
        SearchMusicCellAssem selectSubscribe = searchMusicCellAssem;
        C43I<? extends String> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null && (str = (String) c43i2.LIZ) != null) {
            C26045AKb c26045AKb = new C26045AKb(selectSubscribe.getContainerView());
            c26045AKb.LJIIIZ(str);
            c26045AKb.LJIIJ();
        }
        return C76800UCe.LIZ;
    }
}
