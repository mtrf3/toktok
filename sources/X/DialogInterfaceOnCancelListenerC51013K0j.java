package X;

import android.content.DialogInterface;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.rs.core.model.SearchRelatedSuggestionVM;

/* renamed from: X.K0j, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class DialogInterfaceOnCancelListenerC51013K0j implements DialogInterface.OnCancelListener {
    public final /* synthetic */ Aweme LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ SearchRelatedSuggestionVM LJLJJL;

    public DialogInterfaceOnCancelListenerC51013K0j(Aweme aweme, String str, String str2, boolean z, SearchRelatedSuggestionVM searchRelatedSuggestionVM) {
        this.LJLIL = aweme;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = z;
        this.LJLJJL = searchRelatedSuggestionVM;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        C51012K0i.LIZ(this.LJLIL, "cancel", this.LJLILLLLZI, this.LJLJI, this.LJLJJI);
        this.LJLJJL.setState(C51014K0k.LJLIL);
    }
}
