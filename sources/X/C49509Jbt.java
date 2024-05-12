package X;

import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility;
import com.ss.android.ugc.aweme.search.pages.result.bot.component.SearchTakoCardAssem;

/* renamed from: X.Jbt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49509Jbt extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ SearchTakoCardAssem LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49509Jbt(SearchTakoCardAssem searchTakoCardAssem, int i) {
        super(0);
        this.LJLIL = searchTakoCardAssem;
        this.LJLILLLLZI = i;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility = (SearchServiceCenter$AutoPlayAbility) this.LJLIL.LLI.getValue();
        if (searchServiceCenter$AutoPlayAbility != null) {
            searchServiceCenter$AutoPlayAbility.i40(this.LJLILLLLZI);
        }
        return C76800UCe.LIZ;
    }
}
