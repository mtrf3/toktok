package Y;

import X.AbstractC86252XtA;
import X.C16880lQ;
import X.C79235V7v;
import X.C79236V7w;
import X.C79237V7x;
import X.C86253XtB;
import X.C86894Y8k;
import X.C86898Y8o;
import X.InterfaceC86908Y8y;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.ss.android.ugc.aweme.fe.method.feature.TakePhotoFeature;
import com.ss.android.ugc.aweme.fe.method.upload.PickPhotoUploadFeature;
import com.ss.android.ugc.aweme.fe.method.upload.config.UploadConfig;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public class ACListenerS6S0401000_15 implements View.OnClickListener {
    public final int $t;
    public int i4;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS6S0401000_15 aCListenerS6S0401000_15, View view) {
        AbstractC86252XtA abstractC86252XtA = (AbstractC86252XtA) aCListenerS6S0401000_15.l0;
        int i = aCListenerS6S0401000_15.i4;
        WeakReference weakReference = (WeakReference) aCListenerS6S0401000_15.l1;
        JSONObject jSONObject = (JSONObject) aCListenerS6S0401000_15.l2;
        UploadConfig uploadConfig = (UploadConfig) aCListenerS6S0401000_15.l3;
        short s = abstractC86252XtA.LJLJJI[i];
        if (s != 0) {
            if (s != 1) {
                if (s != 2) {
                    if (s != 3) {
                        return;
                    }
                    abstractC86252XtA.LJLJI = new C86253XtB(weakReference, abstractC86252XtA.LJLILLLLZI, abstractC86252XtA, uploadConfig);
                    try {
                        jSONObject.put("type", 700);
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                    }
                    abstractC86252XtA.LJLJI.handleJsInvoke(jSONObject, abstractC86252XtA.LJLJJL);
                    return;
                }
                abstractC86252XtA.LJLJI = new C86253XtB(weakReference, abstractC86252XtA.LJLILLLLZI, abstractC86252XtA, uploadConfig);
                try {
                    jSONObject.put("type", 800);
                } catch (Exception e2) {
                    C16880lQ.LLLLIIL(e2);
                }
                abstractC86252XtA.LJLJI.handleJsInvoke(jSONObject, abstractC86252XtA.LJLJJL);
                return;
            }
            PickPhotoUploadFeature pickPhotoUploadFeature = new PickPhotoUploadFeature(weakReference, abstractC86252XtA.LJLILLLLZI, abstractC86252XtA);
            abstractC86252XtA.LJLJI = pickPhotoUploadFeature;
            pickPhotoUploadFeature.handleJsInvoke(jSONObject, abstractC86252XtA.LJLJJL);
            return;
        }
        TakePhotoFeature takePhotoFeature = new TakePhotoFeature(weakReference, abstractC86252XtA.LJLILLLLZI, abstractC86252XtA);
        abstractC86252XtA.LJLJI = takePhotoFeature;
        takePhotoFeature.handleJsInvoke(jSONObject, abstractC86252XtA.LJLJJL);
    }

    public static final void onClick$1(ACListenerS6S0401000_15 aCListenerS6S0401000_15, View it) {
        ViewPager viewPager = (ViewPager) aCListenerS6S0401000_15.l0;
        if (viewPager != null) {
            viewPager.setCurrentItem(aCListenerS6S0401000_15.i4);
        }
        C86894Y8k c86894Y8k = (C86894Y8k) aCListenerS6S0401000_15.l1;
        o.LJIIIIZZ(it, "it");
        c86894Y8k.getClass();
        C86894Y8k.LJII(it);
        C79236V7w c79236V7w = (C79236V7w) aCListenerS6S0401000_15.l2;
        C86898Y8o c86898Y8o = ((C79235V7v) c79236V7w).LJII;
        if (c86898Y8o != null) {
            c86898Y8o.LJ(c79236V7w, ((C86894Y8k) aCListenerS6S0401000_15.l1).LJLIL, it);
        }
        if (!((C86894Y8k) aCListenerS6S0401000_15.l1).getTextNavigatorScrollable()) {
            return;
        }
        ((InterfaceC86908Y8y) aCListenerS6S0401000_15.l3).LIZJ(((C79236V7w) aCListenerS6S0401000_15.l2).LIZ);
    }

    public static final void onClick$2(ACListenerS6S0401000_15 aCListenerS6S0401000_15, View it) {
        ViewPager viewPager = (ViewPager) aCListenerS6S0401000_15.l0;
        if (viewPager != null) {
            viewPager.setCurrentItem(aCListenerS6S0401000_15.i4);
        }
        C86894Y8k c86894Y8k = (C86894Y8k) aCListenerS6S0401000_15.l1;
        o.LJIIIIZZ(it, "it");
        c86894Y8k.getClass();
        C86894Y8k.LJII(it);
        C79236V7w c79236V7w = (C79236V7w) aCListenerS6S0401000_15.l2;
        C86898Y8o c86898Y8o = ((C79237V7x) c79236V7w).LJIIIIZZ;
        if (c86898Y8o != null) {
            c86898Y8o.LJ(c79236V7w, ((C86894Y8k) aCListenerS6S0401000_15.l1).LJLIL, it);
        }
        if (!((C86894Y8k) aCListenerS6S0401000_15.l1).getTextNavigatorScrollable()) {
            return;
        }
        ((InterfaceC86908Y8y) aCListenerS6S0401000_15.l3).LIZJ(((C79236V7w) aCListenerS6S0401000_15.l2).LIZ);
    }

    public ACListenerS6S0401000_15(Object obj, int i, Object obj2, Object obj3, Object obj4, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i4 = i;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
