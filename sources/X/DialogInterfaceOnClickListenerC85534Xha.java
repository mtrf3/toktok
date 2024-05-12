package X;

import android.content.Context;
import android.content.DialogInterface;
import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Xha, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class DialogInterfaceOnClickListenerC85534Xha implements DialogInterface.OnClickListener {
    public final /* synthetic */ C85531XhX LJLIL;
    public final /* synthetic */ C85533XhZ LJLILLLLZI;
    public final /* synthetic */ BaseLoginMethod LJLJI;

    public DialogInterfaceOnClickListenerC85534Xha(BaseLoginMethod baseLoginMethod, C85533XhZ c85533XhZ, C85531XhX c85531XhX) {
        this.LJLIL = c85531XhX;
        this.LJLILLLLZI = c85533XhZ;
        this.LJLJI = baseLoginMethod;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C85531XhX c85531XhX = this.LJLIL;
        int absoluteAdapterPosition = this.LJLILLLLZI.getAbsoluteAdapterPosition();
        Context context = this.LJLILLLLZI.LJLIL.getContext();
        o.LJIIIIZZ(context, "view.context");
        c85531XhX.LJZ(absoluteAdapterPosition, context, R.string.u8, R.string.u5, R.string.u7, R.string.u6, this.LJLJI);
    }
}
