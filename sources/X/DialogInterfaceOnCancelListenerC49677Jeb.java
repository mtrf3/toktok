package X;

import android.content.DialogInterface;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.bullet.ShowSearchRSReportPanelMethod;

/* renamed from: X.Jeb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class DialogInterfaceOnCancelListenerC49677Jeb implements DialogInterface.OnCancelListener {
    public final /* synthetic */ ShowSearchRSReportPanelMethod LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    public DialogInterfaceOnCancelListenerC49677Jeb(ShowSearchRSReportPanelMethod showSearchRSReportPanelMethod, String str) {
        this.LJLIL = showSearchRSReportPanelMethod;
        this.LJLILLLLZI = str;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.LJLIL.LIZJ("cancel", this.LJLILLLLZI);
    }
}
