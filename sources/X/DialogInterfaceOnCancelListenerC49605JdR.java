package X;

import android.content.DialogInterface;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;

/* renamed from: X.JdR, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class DialogInterfaceOnCancelListenerC49605JdR implements DialogInterface.OnCancelListener {
    public final /* synthetic */ Word LJLIL;
    public final /* synthetic */ JQA LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;

    public DialogInterfaceOnCancelListenerC49605JdR(Word word, JQA jqa, String str, String str2) {
        this.LJLIL = word;
        this.LJLILLLLZI = jqa;
        this.LJLJI = str;
        this.LJLJJI = str2;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        C49604JdQ.LJFF(this.LJLIL, this.LJLILLLLZI, "cancel", this.LJLJI, this.LJLJJI);
    }
}
