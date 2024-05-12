package X;

import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class JXU extends AbstractC50814Jww {
    public JXU() {
        super(null);
    }

    @Override // X.AbstractC50814Jww
    public final void LIZIZ() {
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // X.AbstractC50814Jww
    public final void LIZJ(C50340JpI c50340JpI) {
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onCollectMusicEvent(C213358Yx event) {
        o.LJIIIZ(event, "event");
        try {
            C50340JpI c50340JpI = this.LJLILLLLZI;
            if (c50340JpI != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("music_id", event.LJLIL);
                jSONObject.put("collect_status", event.LJLILLLLZI);
                c50340JpI.LIZ("changeMusicCollectState", jSONObject);
            }
        } catch (Exception unused) {
        }
    }
}
