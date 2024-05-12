package X;

import Y.ARunnableS46S0100000_10;
import Y.IDBReceiverS8S0100000_8;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.provider.Settings;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: X.Ngw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60014Ngw extends NQR {
    public final NR8 LIZ;
    public final NRJ LIZIZ;
    public AbstractC60015Ngx LJ;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public final List<C60021Nh3> LIZJ = new ArrayList();
    public boolean LJFF = false;
    public boolean LJI = false;
    public final String LJII = UUID.randomUUID().toString();
    public C60024Nh6 LIZLLL = new C60024Nh6(null);

    static {
        PatternProtector.compile("^[a-zA-Z0-9 ]+$");
    }

    @Override // X.NQR
    public final void LJ() {
        if (this.LJI) {
            return;
        }
        ((ArrayList) this.LIZJ).clear();
    }

    public final C60021Nh3 LJII(View view) {
        Iterator it = ((ArrayList) this.LIZJ).iterator();
        while (it.hasNext()) {
            C60021Nh3 c60021Nh3 = (C60021Nh3) it.next();
            if (c60021Nh3.LIZ.get() == view) {
                return c60021Nh3;
            }
        }
        return null;
    }

    @Override // X.NQR
    public final void LIZJ() {
        boolean z;
        IDBReceiverS8S0100000_8 iDBReceiverS8S0100000_8;
        if (this.LJI) {
            return;
        }
        this.LIZLLL.clear();
        LJ();
        this.LJI = true;
        AbstractC60015Ngx abstractC60015Ngx = this.LJ;
        abstractC60015Ngx.getClass();
        C37137Ehp.LIZIZ(abstractC60015Ngx.LJFF(), "finishSession", new Object[0]);
        C60023Nh5 c60023Nh5 = C60023Nh5.LIZJ;
        if (c60023Nh5.LIZIZ.size() > 0) {
            z = true;
        } else {
            z = false;
        }
        c60023Nh5.LIZ.remove(this);
        c60023Nh5.LIZIZ.remove(this);
        if (z && c60023Nh5.LIZIZ.size() <= 0) {
            C59998Ngg LIZ = C59998Ngg.LIZ();
            LIZ.getClass();
            C60030NhC c60030NhC = C60030NhC.LJI;
            c60030NhC.getClass();
            Handler handler = C60030NhC.LJIIIIZZ;
            if (handler != null) {
                handler.removeCallbacks(C60030NhC.LJIIJ);
                C60030NhC.LJIIIIZZ = null;
            }
            ((ArrayList) c60030NhC.LIZ).clear();
            C60030NhC.LJII.post(new ARunnableS46S0100000_10(c60030NhC, 193));
            C60018Nh0 c60018Nh0 = C60018Nh0.LJFF;
            Context context = c60018Nh0.LIZ;
            if (context != null && (iDBReceiverS8S0100000_8 = c60018Nh0.LIZIZ) != null) {
                C16880lQ.LJJLIIIJL(context, iDBReceiverS8S0100000_8);
                c60018Nh0.LIZIZ = null;
            }
            c60018Nh0.LIZJ = false;
            c60018Nh0.LIZLLL = false;
            c60018Nh0.LJ = null;
            C60013Ngv c60013Ngv = LIZ.LIZLLL;
            c60013Ngv.LIZ.getContentResolver().unregisterContentObserver(c60013Ngv);
        }
        this.LJ.LJ();
        this.LJ = null;
    }

    @Override // X.NQR
    public final void LJI() {
        boolean z;
        if (this.LJFF) {
            return;
        }
        this.LJFF = true;
        C60023Nh5 c60023Nh5 = C60023Nh5.LIZJ;
        if (c60023Nh5.LIZIZ.size() > 0) {
            z = true;
        } else {
            z = false;
        }
        c60023Nh5.LIZIZ.add(this);
        if (!z) {
            C59998Ngg LIZ = C59998Ngg.LIZ();
            LIZ.getClass();
            C60018Nh0 c60018Nh0 = C60018Nh0.LJFF;
            c60018Nh0.LJ = LIZ;
            c60018Nh0.LIZIZ = new IDBReceiverS8S0100000_8(4);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            c60018Nh0.LIZ.registerReceiver(c60018Nh0.LIZIZ, intentFilter);
            c60018Nh0.LIZJ = true;
            c60018Nh0.LIZIZ();
            if (!c60018Nh0.LIZLLL) {
                C60030NhC.LJI.getClass();
                C60030NhC.LIZ();
            }
            C60013Ngv c60013Ngv = LIZ.LIZLLL;
            c60013Ngv.LJ = c60013Ngv.LIZ();
            c60013Ngv.LIZIZ();
            c60013Ngv.LIZ.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, c60013Ngv);
        }
        float f = C59998Ngg.LIZ().LIZ;
        AbstractC60015Ngx abstractC60015Ngx = this.LJ;
        abstractC60015Ngx.getClass();
        C37137Ehp.LIZIZ(abstractC60015Ngx.LJFF(), "setDeviceVolume", Float.valueOf(f));
        this.LJ.LIZJ(this, this.LIZ);
    }

    @Override // X.NQR
    public final void LIZ(View view) {
        C39T c39t = C39T.OTHER;
        if (this.LJI) {
            return;
        }
        if (view != null) {
            if (LJII(view) != null) {
                return;
            }
            ((ArrayList) this.LIZJ).add(new C60021Nh3(view, c39t));
            return;
        }
        throw new IllegalArgumentException("FriendlyObstruction is null");
    }

    @Override // X.NQR
    public final void LIZLLL(View view) {
        if (this.LJI) {
            return;
        }
        C38891fp.LJFF(view, "AdView is null");
        if (this.LIZLLL.get() == view) {
            return;
        }
        this.LIZLLL = new C60024Nh6(view);
        AbstractC60015Ngx abstractC60015Ngx = this.LJ;
        abstractC60015Ngx.getClass();
        abstractC60015Ngx.LJ = System.nanoTime();
        abstractC60015Ngx.LIZLLL = EnumC60020Nh2.AD_STATE_IDLE;
        Collection<C60014Ngw> unmodifiableCollection = Collections.unmodifiableCollection(C60023Nh5.LIZJ.LIZ);
        if (unmodifiableCollection != null && unmodifiableCollection.size() > 0) {
            for (C60014Ngw c60014Ngw : unmodifiableCollection) {
                if (c60014Ngw != this && c60014Ngw.LIZLLL.get() == view) {
                    c60014Ngw.LIZLLL.clear();
                }
            }
        }
    }

    @Override // X.NQR
    public final void LJFF(View view) {
        if (this.LJI) {
            return;
        }
        if (view != null) {
            C60021Nh3 LJII = LJII(view);
            if (LJII != null) {
                ((ArrayList) this.LIZJ).remove(LJII);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("FriendlyObstruction is null");
    }

    public C60014Ngw(NRJ nrj, NR8 nr8) {
        AbstractC60015Ngx c60017Ngz;
        Object obj;
        String str;
        this.LIZIZ = nrj;
        this.LIZ = nr8;
        if (nr8.LJII == NRL.HTML) {
            c60017Ngz = new C60019Nh1(nr8.LIZIZ);
        } else {
            c60017Ngz = new C60017Ngz(Collections.unmodifiableMap(nr8.LIZLLL), nr8.LJ);
        }
        this.LJ = c60017Ngz;
        c60017Ngz.LIZ();
        C60023Nh5.LIZJ.LIZ.add(this);
        AbstractC60015Ngx abstractC60015Ngx = this.LJ;
        abstractC60015Ngx.getClass();
        WebView LJFF = abstractC60015Ngx.LJFF();
        JSONObject jSONObject = new JSONObject();
        C60031NhD.LIZJ(jSONObject, "impressionOwner", nrj.LIZ);
        if (nrj.LIZLLL != null && nrj.LJ != null) {
            C60031NhD.LIZJ(jSONObject, "mediaEventsOwner", nrj.LIZIZ);
            C60031NhD.LIZJ(jSONObject, "creativeType", nrj.LIZLLL);
            obj = nrj.LJ;
            str = "impressionType";
        } else {
            obj = nrj.LIZIZ;
            str = "videoEventsOwner";
        }
        C60031NhD.LIZJ(jSONObject, str, obj);
        C60031NhD.LIZJ(jSONObject, "isolateVerificationScripts", Boolean.valueOf(nrj.LIZJ));
        C37137Ehp.LIZIZ(LJFF, "init", jSONObject);
    }
}
