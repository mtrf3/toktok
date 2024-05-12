package com.ss.android.ugc.aweme.sec.captcha;

import X.C16880lQ;
import X.C221108m2;
import X.C36922EeM;
import X.C61349O5x;
import X.C62822Ol8;
import X.C64859Pct;
import X.OIP;
import X.QN2;
import X.QN4;
import X.QN8;
import X.QNA;
import X.QNB;
import X.QNC;
import X.QND;
import X.QNE;
import X.QNL;
import X.QNQ;
import X.QNS;
import X.X1D;
import Y.ARunnableS47S0100000_11;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AqS161S0100000_11;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class SecCaptcha implements GenericLifecycleObserver, QNS {
    public final Context LJLIL;
    public final QN8 LJLILLLLZI;
    public final QND LJLJI;
    public final C62822Ol8 LJLJJI;
    public final QNE LJLJJL;
    public WeakReference<Activity> LJLJJLL;
    public QNA LJLJL;
    public String LJLJLJ;
    public String LJLJLLL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            release();
        }
    }

    public final QN4 LIZIZ() {
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-bdTuringConfig>(...)");
        return (QN4) value;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void release() {
        ComponentCallbacks2 componentCallbacks2;
        WeakReference<Activity> weakReference = this.LJLJJLL;
        if (weakReference != null) {
            componentCallbacks2 = (Activity) weakReference.get();
        } else {
            componentCallbacks2 = null;
        }
        if (componentCallbacks2 instanceof LifecycleOwner) {
            ((LifecycleOwner) componentCallbacks2).getLifecycle().removeObserver(this);
        }
        QNE qne = this.LJLJJL;
        if (qne == null || !qne.LIZIZ) {
            return;
        }
        qne.LIZJ.dismissVerifyDialog();
    }

    @Override // X.QNS
    public final void onFail(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("popCaptcha-onFail, code=");
        LIZ.append(i);
        C36922EeM.LIZLLL(4, "Sec", X1D.LIZIZ(LIZ));
        QNA qna = this.LJLJL;
        if (qna != null) {
            qna.LIZIZ(i, false);
        }
        QNA qna2 = this.LJLJL;
        if (qna2 != null) {
            qna2.LIZ();
        }
    }

    @Override // X.QNS
    public final void LIZ(int i, JSONObject jSONObject) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("popCaptcha-onSuccess, code=");
        LIZ.append(i);
        C36922EeM.LIZLLL(4, "Sec", X1D.LIZIZ(LIZ));
        QNA qna = this.LJLJL;
        if (qna != null) {
            qna.LIZIZ(i, true);
        }
    }

    public final void LIZJ(String deviceId, String iid) {
        o.LJIIIZ(deviceId, "deviceId");
        o.LJIIIZ(iid, "iid");
        QN8 qn8 = this.LJLILLLLZI;
        qn8.getClass();
        qn8.LJLJJL = deviceId;
        QN8 qn82 = this.LJLILLLLZI;
        qn82.getClass();
        qn82.LJLJJI = iid;
        LIZIZ().LJI = this.LJLILLLLZI.LJLJJI;
        LIZIZ().LJIIIIZZ = this.LJLILLLLZI.LJLJJL;
    }

    public SecCaptcha(Context context, QN8 qn8, QND secGetDataCallBack) {
        o.LJIIIZ(secGetDataCallBack, "secGetDataCallBack");
        this.LJLIL = context;
        this.LJLILLLLZI = qn8;
        this.LJLJI = secGetDataCallBack;
        this.LJLJJI = C221108m2.LIZIZ(new AqS161S0100000_11(this, 53));
        QNE qne = OIP.LIZ;
        QN4 LIZIZ = LIZIZ();
        synchronized (qne) {
            if (!qne.LIZIZ) {
                long currentTimeMillis = System.currentTimeMillis();
                qne.LIZ = LIZIZ;
                QNE.LIZIZ(LIZIZ);
                QNB qnb = QNC.LIZ;
                qnb.LIZ();
                ARunnableS47S0100000_11 aRunnableS47S0100000_11 = new ARunnableS47S0100000_11(LIZIZ, 142);
                QNL qnl = qnb.LIZIZ;
                if (qnl != null) {
                    qnl.post(aRunnableS47S0100000_11);
                }
                qne.LIZLLL();
                QNQ.LIZ().LIZ = qne.LIZ.LJIJ;
                qne.LIZIZ = true;
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", currentTimeMillis2);
                    jSONObject.put("key", "init");
                    QN2.LIZJ("turing_verify_sdk", jSONObject);
                } catch (JSONException e) {
                    if (C61349O5x.LIZ < 3) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
            }
        }
        this.LJLJJL = qne;
        String sessionId = this.LJLJI.getSessionId();
        this.LJLJLJ = sessionId == null ? "" : sessionId;
        String userId = this.LJLJI.getUserId();
        this.LJLJLLL = userId == null ? "" : userId;
        C64859Pct.LIZ();
    }
}
