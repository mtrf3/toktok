package X;

import X.C77090UNi;
import X.EnumC31509CYf;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.live.room.SeiEvent;
import com.bytedance.android.livesdk.model.message.CaptionContent;
import com.bytedance.android.livesdk.model.message.CaptionMessage;
import com.bytedance.android.livesdkapi.depend.model.live.CaptionInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.List;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.UNi, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77090UNi implements OnMessageListener {
    public final String LJLIL;
    public final LifecycleOwner LJLILLLLZI;
    public final UO1 LJLJI;
    public final InterfaceC88472Yns<? super Boolean, C76800UCe> LJLJJI;
    public final IMessageManager LJLJJL;
    public final CaptionInfo LJLJJLL;
    public boolean LJLJL;
    public final boolean LJLJLJ;
    public final XJO LJLJLLL;

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        CaptionInfo captionInfo;
        List<CaptionContent> list;
        if (iMessage instanceof CaptionMessage) {
            CaptionMessage captionMessage = (CaptionMessage) iMessage;
            if (captionMessage.durationMs == -1) {
                C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.j1;
                if (!c48459J0d.LIZJ().booleanValue()) {
                    Boolean bool = Boolean.TRUE;
                    c48459J0d.LIZ(bool);
                    InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns = this.LJLJJI;
                    if (interfaceC88472Yns != null) {
                        interfaceC88472Yns.invoke(bool);
                        return;
                    }
                    return;
                }
            }
            if (!this.LJLJL || !this.LJLJLJ) {
                return;
            }
            Boolean LIZJ = InterfaceC30442Bx8.g1.LIZJ();
            o.LJIIIIZZ(LIZJ, "LIVE_SHOW_CAPTION_AUDIENCE_SWITCH.value");
            if (!LIZJ.booleanValue() || (captionInfo = this.LJLJJLL) == null || !captionInfo.open || InterfaceC30442Bx8.j1.LIZJ().booleanValue() || (list = captionMessage.content) == null) {
                return;
            }
            for (CaptionContent captionContent : list) {
                if (o.LJ(captionContent.lang, this.LJLIL)) {
                    XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LJLILLLLZI), C78613UtF.LIZ, null, new C77091UNj(this, iMessage, captionContent, this.LJLJI.LIZJ(), null), 2);
                }
            }
        }
    }

    public C77090UNi(DataChannel dataChannel, String str, LifecycleOwner lifecycleOwner, UO1 uo1, AqS179S0100000_13 aqS179S0100000_13) {
        CaptionInfo captionInfo;
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLIL = str;
        this.LJLILLLLZI = lifecycleOwner;
        this.LJLJI = uo1;
        this.LJLJJI = aqS179S0100000_13;
        this.LJLJJL = (IMessageManager) dataChannel.kv0(C29927Bop.class);
        Room LJJIJLIJ = C29306Beo.LJJIJLIJ(dataChannel);
        if (LJJIJLIJ != null) {
            captionInfo = LJJIJLIJ.captionInfo;
        } else {
            captionInfo = null;
        }
        this.LJLJJLL = captionInfo;
        this.LJLJL = true;
        this.LJLJLJ = true;
        XJO LIZ = XJR.LIZ();
        this.LJLJLLL = LIZ;
        uo1.LJIILIIL = LIZ;
        lifecycleOwner.getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.bytedance.android.live.publicscreen.impl.caption.CaptionViewModelV2$1$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_RESUME) {
                    onResume();
                } else if (event == Lifecycle.Event.ON_STOP) {
                    onStop();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
            public final void onResume() {
                IMessageManager iMessageManager = C77090UNi.this.LJLJJL;
                if (iMessageManager != null) {
                    iMessageManager.addMessageListener(EnumC31509CYf.CAPTION_MESSAGE.getIntType(), this);
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
            public final void onStop() {
                IMessageManager iMessageManager = C77090UNi.this.LJLJJL;
                if (iMessageManager != null) {
                    iMessageManager.removeMessageListener(this);
                }
            }
        });
        dataChannel.lv0(lifecycleOwner, SeiEvent.class, new AqS167S0100000_1(this, 319));
        dataChannel.lv0(lifecycleOwner, LinkCrossRoomStateChangeEvent.class, new AqS179S0100000_13(this, 422));
    }
}
