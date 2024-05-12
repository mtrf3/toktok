package X;

import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class JX6 extends JSR {
    @Override // X.JSR
    public final void LJFF() {
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @Override // X.JSR
    public final void LJI() {
        EventBus.LIZJ().LJIJ(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JX6(JTS bulletContext) {
        super(bulletContext);
        o.LJIIIZ(bulletContext, "bulletContext");
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onCollectMusicEvent(C213358Yx event) {
        o.LJIIIZ(event, "event");
        try {
            JTS jts = this.LJLIL;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("music_id", event.LJLIL);
            jSONObject.put("collect_status", event.LJLILLLLZI);
            jts.LIZ("changeMusicCollectState", jSONObject);
        } catch (Exception unused) {
        }
    }
}
