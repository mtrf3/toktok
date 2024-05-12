package X;

import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class JX3 extends JSR {
    @Override // X.JSR
    public final void LJFF() {
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @Override // X.JSR
    public final void LJI() {
        EventBus.LIZJ().LJIJ(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JX3(JTS bulletContext) {
        super(bulletContext);
        o.LJIIIZ(bulletContext, "bulletContext");
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onCommentDiggChangedEvent(JX4 event) {
        o.LJIIIZ(event, "event");
        ActivityC45651qj activityC45651qj = this.LJLIL.LIZIZ;
        if (activityC45651qj != null && o.LJ(C50989Jzl.LJ(), activityC45651qj)) {
            try {
                JTS jts = this.LJLIL;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("cid", event.LJLIL);
                jSONObject.put("status", event.LJLILLLLZI);
                C50340JpI c50340JpI = jts.LJIILLIIL;
                if (c50340JpI != null) {
                    c50340JpI.LIZ("changeCommentDiggState", jSONObject);
                }
            } catch (Exception unused) {
                C78983UzD.LJIILL("search_jsb_json");
            }
        }
    }
}
