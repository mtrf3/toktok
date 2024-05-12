package X;

import android.os.Message;
import com.bytedance.android.live.ai.api.trigger.ILiveTriggerService;
import com.bytedance.android.livesdk.livesetting.gift.GiftReceiveMsgThreadSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftGuideClientAISettings;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Cib, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32089Cib implements InterfaceC28344BAm {
    public static long LJLLI;
    public static long LJLLILLLL;
    public final List<Long> LJLIL;
    public final List<Long> LJLILLLLZI;
    public final C5H3 LJLJI;
    public C32148CjY LJLJJI;
    public final C5H3 LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public final HandlerC28345BAn LJLJLJ;
    public boolean LJLJLLL;
    public static final java.util.Map<String, String> LJLL = new LinkedHashMap();
    public static final ConcurrentHashMap<String, Long> LJLLJ = new ConcurrentHashMap<>();
    public static final C5H3<InterfaceC22790ux> LJLLL = C78996UzQ.LJJIJIIJI(C32110Ciw.LJLIL);
    public static final ConcurrentHashMap<String, JSONObject> LJLLLL = new ConcurrentHashMap<>();

    public final void LIZ() {
        this.LJLJL = false;
        ((LinkedHashMap) LJLL).clear();
        GiftReceiveMsgThreadSetting giftReceiveMsgThreadSetting = GiftReceiveMsgThreadSetting.INSTANCE;
        List<Long> list = this.LJLIL;
        if (giftReceiveMsgThreadSetting.getMultiThread()) {
            synchronized (list) {
                this.LJLIL.clear();
            }
        } else {
            this.LJLIL.clear();
        }
        ((ArrayList) this.LJLILLLLZI).clear();
        this.LJLJLJ.removeMessages(100);
    }

    public final void LIZIZ() {
        this.LJLJLLL = false;
        this.LJLJLJ.removeMessages(100);
        LIZ();
        C32148CjY c32148CjY = this.LJLJJI;
        if (c32148CjY != null) {
            BZJ.LIZ.getClass();
            BU1.LIZIZ.remove(c32148CjY);
        }
        C32150Cja listener = (C32150Cja) this.LJLJJL.getValue();
        o.LJIIIZ(listener, "listener");
        ((ILiveTriggerService) C24120x6.LIZ.getValue()).At(listener);
        ((C32150Cja) this.LJLJJL.getValue()).LIZ = null;
    }

    public C32089Cib() {
        List<Long> arrayList;
        if (GiftReceiveMsgThreadSetting.INSTANCE.getMultiThread()) {
            arrayList = Collections.synchronizedList(new ArrayList());
            o.LJIIIIZZ(arrayList, "{\n        Collections.sy…(ArrayList<Long>())\n    }");
        } else {
            arrayList = new ArrayList<>();
        }
        this.LJLIL = arrayList;
        this.LJLILLLLZI = new ArrayList();
        this.LJLJI = C78996UzQ.LJJIJIIJI(C32095Cih.LJLIL);
        this.LJLJJL = C78996UzQ.LJJIJIIJI(C32107Cit.LJLIL);
        this.LJLJLJ = new HandlerC28345BAn(C16880lQ.LLJJJJ(), this);
    }

    @Override // X.InterfaceC28344BAm
    public final void handleMsg(Message message) {
        if (message != null && message.what == 100) {
            Object obj = message.obj;
            if (obj instanceof DataChannel) {
                o.LJII(obj, "null cannot be cast to non-null type com.bytedance.ies.sdk.datachannel.DataChannel");
                C32146CjW.LIZJ((DataChannel) obj, "client_polling", null);
                if (this.LJLJLLL) {
                    Message obtainMessage = this.LJLJLJ.obtainMessage(100, message.obj);
                    o.LJIIIIZZ(obtainMessage, "handler.obtainMessage(MSG_POLLING, msg.obj)");
                    this.LJLJLJ.sendMessageDelayed(obtainMessage, LiveGiftGuideClientAISettings.INSTANCE.getValue().pollingDuration * 1000);
                }
            }
        }
    }
}
