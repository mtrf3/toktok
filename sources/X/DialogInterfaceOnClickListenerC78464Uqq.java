package X;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Uqq, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class DialogInterfaceOnClickListenerC78464Uqq implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ C78461Uqn LJLILLLLZI;
    public final /* synthetic */ EnterRoomConfig LJLJI;
    public final /* synthetic */ Aweme LJLJJI;
    public final /* synthetic */ List<Aweme> LJLJJL;
    public final /* synthetic */ InterfaceC54958Lha LJLJJLL;

    public DialogInterfaceOnClickListenerC78464Uqq(Context context, C78461Uqn c78461Uqn, EnterRoomConfig enterRoomConfig, Aweme aweme, List<Aweme> list, InterfaceC54958Lha interfaceC54958Lha) {
        this.LJLIL = context;
        this.LJLILLLLZI = c78461Uqn;
        this.LJLJI = enterRoomConfig;
        this.LJLJJI = aweme;
        this.LJLJJL = list;
        this.LJLJJLL = interfaceC54958Lha;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialog, int i) {
        o.LJIIIZ(dialog, "dialog");
        C09710Zr.LIZIZ(this.LJLIL);
        this.LJLILLLLZI.LIZJ(this.LJLIL, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, null);
        dialog.dismiss();
    }
}
