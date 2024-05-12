package X;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Uqp, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class DialogInterfaceOnClickListenerC78463Uqp implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ C78461Uqn LJLILLLLZI;
    public final /* synthetic */ EnterRoomConfig LJLJI;
    public final /* synthetic */ LiveRoomStruct LJLJJI;
    public final /* synthetic */ List<LiveRoomStruct> LJLJJL;
    public final /* synthetic */ InterfaceC54958Lha LJLJJLL;
    public final /* synthetic */ InterfaceC78468Uqu LJLJL;

    public DialogInterfaceOnClickListenerC78463Uqp(Context context, C78461Uqn c78461Uqn, EnterRoomConfig enterRoomConfig, LiveRoomStruct liveRoomStruct, List<LiveRoomStruct> list, InterfaceC54958Lha interfaceC54958Lha, InterfaceC78468Uqu interfaceC78468Uqu) {
        this.LJLIL = context;
        this.LJLILLLLZI = c78461Uqn;
        this.LJLJI = enterRoomConfig;
        this.LJLJJI = liveRoomStruct;
        this.LJLJJL = list;
        this.LJLJJLL = interfaceC54958Lha;
        this.LJLJL = interfaceC78468Uqu;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialog, int i) {
        o.LJIIIZ(dialog, "dialog");
        C09710Zr.LIZIZ(this.LJLIL);
        this.LJLILLLLZI.LIZLLL(this.LJLIL, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL);
        dialog.dismiss();
    }
}
