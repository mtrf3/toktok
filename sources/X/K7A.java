package X;

import android.content.DialogInterface;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;

/* loaded from: classes9.dex */
public final class K7A implements DialogInterface.OnCancelListener {
    public final /* synthetic */ SearchSugEntity LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;

    public K7A(SearchSugEntity searchSugEntity, int i, String str, String str2, String str3, String str4) {
        this.LJLIL = searchSugEntity;
        this.LJLILLLLZI = i;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = str3;
        this.LJLJJLL = str4;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        K7W.LIZ(this.LJLIL, this.LJLILLLLZI, "cancel", this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL);
    }
}
