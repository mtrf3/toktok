package X;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import java.util.List;

/* renamed from: X.UkK, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class DialogInterfaceOnClickListenerC78060UkK implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ C78461Uqn LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ EnterRoomConfig LJLJJI;
    public final /* synthetic */ List<Long> LJLJJL;
    public final /* synthetic */ String LJLJJLL;

    public DialogInterfaceOnClickListenerC78060UkK(Context context, EnterRoomConfig enterRoomConfig, C78461Uqn c78461Uqn, String str, String str2, List list) {
        this.LJLIL = context;
        this.LJLILLLLZI = c78461Uqn;
        this.LJLJI = str;
        this.LJLJJI = enterRoomConfig;
        this.LJLJJL = list;
        this.LJLJJLL = str2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C09710Zr.LIZIZ(this.LJLIL);
        this.LJLILLLLZI.LJIJ(this.LJLIL, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL);
        dialogInterface.dismiss();
    }
}
