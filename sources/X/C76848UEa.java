package X;

import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.UEa, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76848UEa implements OnMessageListener {
    public final /* synthetic */ InterfaceC88472Yns LJLIL;

    public C76848UEa(AqS179S0100000_13 function) {
        o.LJIIIZ(function, "function");
        this.LJLIL = function;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final /* synthetic */ void onMessage(IMessage iMessage) {
        this.LJLIL.invoke(iMessage);
    }
}
