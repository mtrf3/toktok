package X;

import android.content.DialogInterface;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.Gng, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class DialogInterfaceOnCancelListenerC42596Gng implements DialogInterface.OnCancelListener {
    public final /* synthetic */ C42594Gne LJLIL;
    public final /* synthetic */ Aweme LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    public DialogInterfaceOnCancelListenerC42596Gng(C42594Gne c42594Gne, Aweme aweme, String str) {
        this.LJLIL = c42594Gne;
        this.LJLILLLLZI = aweme;
        this.LJLJI = str;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        C42594Gne c42594Gne = this.LJLIL;
        Aweme aweme = this.LJLILLLLZI;
        String str = this.LJLJI;
        c42594Gne.getClass();
        C42594Gne.LIZJ(str, aweme, "cancel");
    }
}
