package com.bytedance.android.live.publicscreen.impl.caption;

import X.C0NB;
import X.C29296Bee;
import X.C29298Beg;
import X.C29306Beo;
import X.C29927Bop;
import X.EnumC31509CYf;
import X.InterfaceC30442Bx8;
import X.X1D;
import X.XKX;
import android.os.SystemClock;
import android.text.TextPaint;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.live.room.SeiEvent;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveCaptionDelayTime;
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
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CaptionViewModel implements OnMessageListener {
    public final TextPaint LJLIL;
    public final float LJLILLLLZI;
    public final String LJLJI;
    public final LifecycleOwner LJLJJI;
    public final MutableLiveData<C29296Bee> LJLJJL;
    public final IMessageManager LJLJJLL;
    public final long LJLJL;
    public final CaptionInfo LJLJLJ;
    public boolean LJLJLLL;
    public final boolean LJLL;
    public volatile long LJLLI;
    public volatile long LJLLILLLL;

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        CaptionMessage captionMessage;
        List<CaptionContent> list;
        if ((iMessage instanceof CaptionMessage) && this.LJLJLLL && this.LJLL) {
            Boolean LIZJ = InterfaceC30442Bx8.g1.LIZJ();
            o.LJIIIIZZ(LIZJ, "LIVE_SHOW_CAPTION_AUDIENCE_SWITCH.value");
            if (LIZJ.booleanValue() && (list = (captionMessage = (CaptionMessage) iMessage).content) != null) {
                for (CaptionContent captionContent : list) {
                    if (o.LJ(captionContent.lang, this.LJLJI)) {
                        String str = captionContent.content;
                        o.LJIIIIZZ(str, "it.content");
                        C29296Bee c29296Bee = new C29296Bee(str, captionMessage.timestampMs, captionMessage.durationMs, this.LJLLI + (SystemClock.elapsedRealtime() - this.LJLLILLLL));
                        CaptionInfo captionInfo = this.LJLJLJ;
                        if (captionInfo != null && captionInfo.open) {
                            XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LJLJJI), null, null, new C29298Beg(this, c29296Bee, null), 3);
                        }
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("key: ");
                        LIZ.append(this.LJLJI);
                        LIZ.append(" + \n + value: ");
                        LIZ.append(captionContent.content);
                        LIZ.append("+\n+ timestampMs: ");
                        LIZ.append(captionMessage.timestampMs);
                        LIZ.append("+\n+ durationMs: ");
                        LIZ.append(captionMessage.durationMs);
                        LIZ.append('+');
                        C0NB.LIZIZ("CaptionViewModel", X1D.LIZIZ(LIZ));
                    }
                }
            }
        }
    }

    public CaptionViewModel(TextPaint textPaint, float f, DataChannel dataChannel, String str, LifecycleOwner lifecycleOwner) {
        CaptionInfo captionInfo;
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLIL = textPaint;
        this.LJLILLLLZI = f;
        this.LJLJI = str;
        this.LJLJJI = lifecycleOwner;
        this.LJLJJL = new MutableLiveData<>();
        this.LJLJJLL = (IMessageManager) dataChannel.kv0(C29927Bop.class);
        this.LJLJL = LiveCaptionDelayTime.getValue();
        Room LJJIJLIJ = C29306Beo.LJJIJLIJ(dataChannel);
        if (LJJIJLIJ != null) {
            captionInfo = LJJIJLIJ.captionInfo;
        } else {
            captionInfo = null;
        }
        this.LJLJLJ = captionInfo;
        this.LJLJLLL = true;
        this.LJLL = true;
        lifecycleOwner.getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.bytedance.android.live.publicscreen.impl.caption.CaptionViewModel$1$1
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
                IMessageManager iMessageManager = CaptionViewModel.this.LJLJJLL;
                if (iMessageManager != null) {
                    iMessageManager.addMessageListener(EnumC31509CYf.CAPTION_MESSAGE.getIntType(), this);
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
            public final void onStop() {
                IMessageManager iMessageManager = CaptionViewModel.this.LJLJJLL;
                if (iMessageManager != null) {
                    iMessageManager.removeMessageListener(this);
                }
            }
        });
        dataChannel.lv0(lifecycleOwner, SeiEvent.class, new AqS167S0100000_1(this, 31));
        dataChannel.lv0(lifecycleOwner, LinkCrossRoomStateChangeEvent.class, new AqS171S0100000_5(this, 82));
    }
}
