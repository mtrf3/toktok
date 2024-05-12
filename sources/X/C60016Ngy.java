package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Ngy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60016Ngy {
    public final Object LIZ;

    public final void LIZJ() {
        C38891fp.LJII((C60014Ngw) this.LIZ);
        NRJ nrj = ((C60014Ngw) this.LIZ).LIZIZ;
        nrj.getClass();
        if (NRK.NATIVE == nrj.LIZ) {
            Object obj = this.LIZ;
            C60014Ngw c60014Ngw = (C60014Ngw) obj;
            if (!c60014Ngw.LJFF || c60014Ngw.LJI) {
                try {
                    ((C60014Ngw) obj).LJI();
                } catch (Exception unused) {
                }
            }
            Object obj2 = this.LIZ;
            C60014Ngw c60014Ngw2 = (C60014Ngw) obj2;
            if (c60014Ngw2.LJFF && !c60014Ngw2.LJI) {
                C60014Ngw c60014Ngw3 = (C60014Ngw) obj2;
                if (!c60014Ngw3.LJIIIIZZ) {
                    AbstractC60015Ngx abstractC60015Ngx = c60014Ngw3.LJ;
                    abstractC60015Ngx.getClass();
                    C37137Ehp.LIZIZ(abstractC60015Ngx.LJFF(), "publishImpressionEvent", new Object[0]);
                    c60014Ngw3.LJIIIIZZ = true;
                    return;
                }
                throw new IllegalStateException("Impression event can only be sent once");
            }
            return;
        }
        throw new IllegalStateException("Impression event is not expected from the Native AdSession");
    }

    public /* synthetic */ C60016Ngy(String publishId) {
        o.LJIIIZ(publishId, "publishId");
        this.LIZ = publishId;
    }

    public static C60016Ngy LIZIZ(NQR nqr) {
        C60014Ngw c60014Ngw = (C60014Ngw) nqr;
        C38891fp.LJFF(nqr, "AdSession is null");
        if (c60014Ngw.LJ.LIZIZ == null) {
            C38891fp.LJII(c60014Ngw);
            C60016Ngy c60016Ngy = new C60016Ngy(c60014Ngw);
            c60014Ngw.LJ.LIZIZ = c60016Ngy;
            return c60016Ngy;
        }
        throw new IllegalStateException("AdEvents already exists for AdSession");
    }

    public final void LIZLLL(NSV nsv) {
        C38891fp.LJIIIIZZ((C60014Ngw) this.LIZ);
        NRJ nrj = ((C60014Ngw) this.LIZ).LIZIZ;
        nrj.getClass();
        if (NRK.NATIVE == nrj.LIZ) {
            C60014Ngw c60014Ngw = (C60014Ngw) this.LIZ;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("skippable", false);
                jSONObject.put("autoPlay", nsv.LIZ);
                jSONObject.put("position", nsv.LIZIZ);
            } catch (JSONException unused) {
                C1GE.LIZ("VastProperties: JSON error");
            }
            if (!c60014Ngw.LJIIIZ) {
                AbstractC60015Ngx abstractC60015Ngx = c60014Ngw.LJ;
                abstractC60015Ngx.getClass();
                C37137Ehp.LIZIZ(abstractC60015Ngx.LJFF(), "publishLoadedEvent", jSONObject);
                c60014Ngw.LJIIIZ = true;
                return;
            }
            throw new IllegalStateException("Loaded event can only be sent once");
        }
        throw new IllegalStateException("Impression event is not expected from the Native AdSession");
    }

    public /* synthetic */ C60016Ngy(Object obj) {
        this.LIZ = obj;
    }

    public final void LIZ(VideoPublishEditModel videoPublishEditModel, C145995oB c145995oB) {
        if (!GA5.LIZ()) {
            return;
        }
        C6BK c6bk = new C6BK();
        H4V h4v = new H4V(c6bk);
        h4v.LJI((String) this.LIZ);
        h4v.LIZJ = videoPublishEditModel;
        h4v.LIZ();
        VideoPublishEditModel videoPublishEditModel2 = h4v.LIZJ;
        if (videoPublishEditModel2 != null) {
            c6bk.LIZLLL("prop_list", videoPublishEditModel2.getStickers());
            C41859Gbn LJJ = C60903NvH.LJIIJJI().getPublishService().LJJ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Publish Id: ");
            String str = h4v.LIZIZ;
            if (str != null) {
                LIZ.append(str);
                LJJ.LJ("build_publish_monitor_metrics", X1D.LIZIZ(LIZ));
                JSONObject LJ = c6bk.LJ();
                if (LJ == null) {
                    LJ = new JSONObject();
                }
                Iterator<String> keys = LJ.keys();
                while (keys.hasNext()) {
                    String key = keys.next();
                    Object opt = LJ.opt(key);
                    o.LJIIIIZZ(key, "key");
                    if (opt instanceof String) {
                        c145995oB.LIZLLL(key, (String) opt);
                    } else if (opt instanceof Long) {
                        c145995oB.LIZIZ(((Number) opt).longValue(), key);
                    } else if (opt instanceof Integer) {
                        c145995oB.LIZ(((Number) opt).intValue(), key);
                    } else if (opt instanceof Boolean) {
                        c145995oB.LJ(key, ((Boolean) opt).booleanValue());
                    } else {
                        c145995oB.LIZJ(opt, key);
                    }
                }
                return;
            }
            o.LJIJI("publishId");
            throw null;
        }
        o.LJIJI("editModel");
        throw null;
    }
}
