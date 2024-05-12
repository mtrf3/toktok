package X;

import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.playerkit.session.Session;
import com.ss.android.ugc.playerkit.simapicommon.model.SimAudioBitrate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.ITc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46664ITc {
    public static final C46664ITc LJIJ = new C46664ITc();
    public volatile Session LIZ;
    public final Queue<Session> LIZIZ = new LinkedList();
    public final LruCache<String, String> LIZJ = new LruCache<>(100);
    public final LruCache<String, IYN> LIZLLL = new LruCache<>(100);
    public final LruCache<String, SimBitRate> LJ = new LruCache<>(100);
    public final LruCache<String, SimAudioBitrate> LJFF = new LruCache<>(100);
    public final LruCache<String, IYN> LJI = new LruCache<>(100);
    public final LruCache<String, SimBitRate> LJII = new LruCache<>(100);
    public final LruCache<String, String> LJIIIIZZ = new LruCache<>(100);
    public final LruCache<String, String> LJIIIZ = new LruCache<>(20);
    public final LruCache<String, C46665ITd> LJIIJ = new LruCache<>(100);
    public final LruCache<String, List<SimBitRate>> LJIIJJI = new LruCache<>(100);
    public final LruCache<String, List<C59772Wf>> LJIIL = new LruCache<>(100);
    public final LruCache<String, String> LJIILIIL = new LruCache<>(100);
    public final LruCache<String, C46666ITe> LJIILJJIL = new LruCache<>(10);
    public final LruCache<String, Float> LJIILL = new LruCache<>(20);
    public final List<ITK> LJIILLIIL = new ArrayList();
    public int LJIIZILJ = 0;

    public final synchronized Session LJFF() {
        Session session;
        if (this.LIZ != null) {
            session = this.LIZ;
        } else {
            session = Session.DEFAULT;
        }
        return session;
    }

    public static C46664ITc LJII() {
        return LJIJ;
    }

    public final synchronized Session LIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Session instance = Session.instance();
        instance.key = str;
        instance.uri = str;
        if (((LinkedList) this.LIZIZ).size() + 1 > 5) {
            ((LinkedList) this.LIZIZ).poll();
        }
        ((LinkedList) this.LIZIZ).offer(instance);
        return instance;
    }

    public final synchronized Session LIZIZ(String str) {
        if (!TextUtils.isEmpty(str)) {
            Session[] sessionArr = (Session[]) ((LinkedList) this.LIZIZ).toArray(new Session[0]);
            for (int length = sessionArr.length - 1; length >= 0; length--) {
                if (str.equals(sessionArr[length].key)) {
                    return sessionArr[length];
                }
            }
        }
        return null;
    }

    public final synchronized List<SimBitRate> LIZJ(String str) {
        if (!TextUtils.isEmpty(str)) {
            return this.LJIIJJI.get(str);
        }
        return null;
    }

    public final synchronized JSONObject LIZLLL(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C46665ITd c46665ITd = this.LJIIJ.get(str);
        if (c46665ITd == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("input_quality_type", C46665ITd.LIZ(c46665ITd.LIZ));
            jSONObject.put("output_quality_type", C46665ITd.LIZ(c46665ITd.LIZIZ));
            jSONObject.put("filters", c46665ITd.LIZJ);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        return jSONObject;
    }

    public final synchronized Session LJ(String str) {
        if (!TextUtils.isEmpty(str)) {
            Session[] sessionArr = (Session[]) ((LinkedList) this.LIZIZ).toArray(new Session[0]);
            int length = sessionArr.length;
            do {
                length--;
                if (length >= 0) {
                }
            } while (!str.equals(sessionArr[length].sourceId));
            return sessionArr[length];
        }
        return null;
    }

    public final synchronized String LJI(String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            str2 = this.LJIILIIL.get(str);
        } else {
            str2 = "";
        }
        return str2;
    }

    public final synchronized String LJIIIIZZ(String str) {
        if (!TextUtils.isEmpty(str)) {
            return this.LJIIIIZZ.get(str);
        }
        return null;
    }

    public final String LJIIIZ(String str) {
        C46666ITe c46666ITe;
        String str2;
        if (str == null || (c46666ITe = this.LJIILJJIL.get(str)) == null || (str2 = c46666ITe.LIZ) == null) {
            return "";
        }
        return str2;
    }

    public final synchronized SimBitRate LJIIJ(String str) {
        if (!TextUtils.isEmpty(str)) {
            return this.LJII.get(str);
        }
        return null;
    }

    public final synchronized IYN LJIIJJI(String str) {
        if (!TextUtils.isEmpty(str)) {
            return this.LIZLLL.get(str);
        }
        return null;
    }

    public final synchronized SimAudioBitrate LJIIL(String str) {
        if (!TextUtils.isEmpty(str)) {
            return this.LJFF.get(str);
        }
        return null;
    }

    public final synchronized SimBitRate LJIILIIL(String str) {
        if (!TextUtils.isEmpty(str)) {
            return this.LJ.get(str);
        }
        return null;
    }

    public final synchronized String LJIILJJIL(String str) {
        if (!TextUtils.isEmpty(str)) {
            return this.LJIIIZ.get(str);
        }
        return "cache-null";
    }

    public final synchronized void LJJI(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.LJIIL.remove(str);
        }
    }

    public final synchronized void LJIILLIIL(long j, String str) {
        ITK itk;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (((ArrayList) this.LJIILLIIL).size() <= 0 || (itk = (ITK) ListProtector.get(this.LJIILLIIL, 0)) == null || !TextUtils.equals(itk.LIZ, str)) {
            itk = new ITK(str);
            ListProtector.add(this.LJIILLIIL, 0, itk);
            int size = ((ArrayList) this.LJIILLIIL).size();
            if (size > 20) {
                ListProtector.remove(this.LJIILLIIL, size - 1);
            }
        }
        ListProtector.add(itk.LIZIZ, 0, new ITT(j));
    }

    public final void LJIIZILJ(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.LIZJ.put(str, str2);
        }
    }

    public final synchronized void LJIJ(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.LJIILIIL.put(str, str2);
        }
    }

    public final synchronized void LJIJI(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            this.LJIIIIZZ.remove(str);
        } else {
            this.LJIIIIZZ.put(str, str2);
        }
    }

    public final synchronized void LJIJJ(String str, IYN iyn) {
        if (!TextUtils.isEmpty(str) && iyn != null) {
            this.LJI.put(str, iyn);
        }
    }

    public final synchronized void LJIJJLI(String str, SimBitRate simBitRate) {
        if (!TextUtils.isEmpty(str) && simBitRate != null) {
            this.LJII.put(str, simBitRate);
        }
    }

    public final synchronized void LJIL(String str, SimBitRate simBitRate) {
        if (!TextUtils.isEmpty(str)) {
            this.LJ.put(str, simBitRate);
        }
    }

    public final synchronized void LJJ(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            this.LJIIIZ.remove(str);
        } else {
            this.LJIIIZ.put(str, str2);
        }
    }

    public final synchronized void LJJIFFI(String str, IYN iyn) {
        if (TextUtils.isEmpty(str) || iyn == null) {
            return;
        }
        List<C59772Wf> list = this.LJIIL.get(str);
        if (list != null && !list.isEmpty()) {
            C59772Wf c59772Wf = (C59772Wf) ListProtector.get(list, list.size() - 1);
            if (iyn.getBitRate() > 0) {
                c59772Wf.setSelected_bitrate(iyn.getBitRate());
            }
        }
    }

    public final synchronized void LJIILL(String str, List list, List list2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.LJIIJ.put(str, new C46665ITd(list, list2));
    }
}
