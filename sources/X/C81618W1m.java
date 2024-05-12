package X;

import android.app.Application;
import android.content.DialogInterface;
import android.os.Handler;
import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* renamed from: X.W1m, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81618W1m implements InterfaceC46205IBl {
    @Override // X.InterfaceC46205IBl
    public final DialogC81619W1n LIZ(Effect effect, DialogInterface.OnDismissListener onDismissListener, Handler handler, C29S activity) {
        o.LJIIIZ(effect, "effect");
        o.LJIIIZ(onDismissListener, "onDismissListener");
        o.LJIIIZ(handler, "handler");
        o.LJIIIZ(activity, "activity");
        if (!C79260V8u.LIZJ) {
            return null;
        }
        Application application = C60903NvH.LJ;
        C78934UyQ.LJLIL.getSpService().getClass();
        String showSwitch = VJG.LIZ(application, "guide").LIZ.getString("upload_pic_sticker_show", "");
        if (!TextUtils.isEmpty(showSwitch)) {
            o.LJIIIIZZ(showSwitch, "showSwitch");
            if (s.LJJJLZIJ(showSwitch, effect.getEffectId(), false)) {
                return null;
            }
        }
        C46421IJt c46421IJt = new C46421IJt();
        List<String> urlPrefixList = C79260V8u.LIZ;
        o.LJIIIZ(urlPrefixList, "urlPrefixList");
        c46421IJt.LIZLLL = urlPrefixList;
        try {
            JSONObject jSONObject = new JSONObject(effect.getExtra());
            c46421IJt.LIZJ = jSONObject.optString("pixaloop_text");
            c46421IJt.LIZ = jSONObject.optString("pixaloop_picture_cover");
            c46421IJt.LIZIZ = jSONObject.optString("pixaloop_video_cover");
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        DialogC81619W1n dialogC81619W1n = new DialogC81619W1n(activity, effect, c46421IJt);
        dialogC81619W1n.LJLL = handler;
        dialogC81619W1n.setOnDismissListener(onDismissListener);
        return dialogC81619W1n;
    }
}
