package X;

import com.ss.android.ugc.aweme.music.search.cell.SearchMusicCellAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.9cq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C240889cq extends AbstractC65781Prl implements InterfaceC88471Ynr<SearchMusicCellAssem, Boolean, C76800UCe> {
    public static final C240889cq LJLIL = new C240889cq();

    public C240889cq() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(SearchMusicCellAssem searchMusicCellAssem, Boolean bool) {
        int i;
        SearchMusicCellAssem selectSubscribe = searchMusicCellAssem;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        W5G w5g = (W5G) selectSubscribe.getContainerView().findViewById(R.id.f75);
        if (booleanValue) {
            i = R.drawable.bxt;
        } else {
            i = R.drawable.by9;
        }
        w5g.setImageResource(i);
        return C76800UCe.LIZ;
    }
}
