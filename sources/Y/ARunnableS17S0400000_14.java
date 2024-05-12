package Y;

import X.AbstractC81030Vr8;
import X.AbstractC81439Vxj;
import X.C2V;
import X.C38995FSd;
import X.C42051Get;
import X.C79077V1t;
import X.C79402VEg;
import X.C81032VrA;
import X.C81250Vug;
import X.C81975WFf;
import X.C82064WIq;
import X.C82162WMk;
import X.C82622Wbi;
import X.C82887Wfz;
import X.C83573Wr3;
import X.InterfaceC65784Pro;
import X.InterfaceC81973WFd;
import X.InterfaceC82062WIo;
import X.VNU;
import X.WID;
import X.WM7;
import X.WMI;
import X.WMR;
import X.WN4;
import X.WN7;
import X.XNG;
import android.app.Application;
import android.net.Uri;
import android.view.View;
import com.bytedance.ies.effecteditor.swig.UIAnnotationErrorCode;
import com.bytedance.ies.effecteditor.swig.UIAnnotationUpdateType;
import com.bytedance.scene.navigation.Record;
import com.lynx.fresco.FrescoImageLoader;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.base.TraceEvent;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class ARunnableS17S0400000_14 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ$0() {
        C82162WMk c82162WMk = ((WMR) this.l3).LIZJ.LJI;
        ((ArrayList) c82162WMk.LIZ).remove((C42051Get) this.l0);
        WM7 wm7 = ((Record) this.l1).LJLIL;
        if (wm7 instanceof AbstractC81439Vxj) {
            ((WMR) this.l3).LIZJ.LIZ.LJLJLJ.LIZJ(wm7.getClass(), wm7);
        }
        ((Runnable) this.l2).run();
    }

    public final void LIZ$1() {
        if (((FrescoImageLoader) this.l3).mDestroyed) {
            return;
        }
        if (((FrescoImageLoader) this.l3).mDraweeHolder == null) {
            Application application = LynxEnv.LJIIIZ().LIZ;
            TraceEvent.LIZIZ("image.DraweeHolder.create");
            ((FrescoImageLoader) this.l3).mDraweeHolder = new C81250Vug<>(new C79077V1t(application.getResources()).LIZ());
            TraceEvent.LJ("image.DraweeHolder.create");
        }
        FrescoImageLoader frescoImageLoader = (FrescoImageLoader) this.l3;
        Uri uri = (Uri) this.l0;
        AbstractC81030Vr8 abstractC81030Vr8 = (AbstractC81030Vr8) this.l1;
        ((VNU) this.l2).getClass();
        frescoImageLoader.load(uri, (C81032VrA) null, abstractC81030Vr8, (Object) null);
    }

    public static final void run$0(ARunnableS17S0400000_14 aRunnableS17S0400000_14) {
        boolean LIZ;
        try {
            aRunnableS17S0400000_14.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS17S0400000_14 aRunnableS17S0400000_14) {
        boolean LIZ;
        try {
            aRunnableS17S0400000_14.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS17S0400000_14 aRunnableS17S0400000_14) {
        boolean LIZ;
        try {
            ((C79402VEg) aRunnableS17S0400000_14.l3).LIZIZ.onTimingUpdate((Map) aRunnableS17S0400000_14.l0, (Map) aRunnableS17S0400000_14.l1, (JSONObject) aRunnableS17S0400000_14.l2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS17S0400000_14 aRunnableS17S0400000_14) {
        boolean LIZ;
        InterfaceC81973WFd interfaceC81973WFd;
        try {
            ((InterfaceC65784Pro) aRunnableS17S0400000_14.l0).invoke();
            Object LJ = ((C82622Wbi) aRunnableS17S0400000_14.l1).LJ(InterfaceC82062WIo.class, null);
            C82064WIq c82064WIq = (C82064WIq) aRunnableS17S0400000_14.l2;
            C82622Wbi c82622Wbi = (C82622Wbi) aRunnableS17S0400000_14.l1;
            WID wid = (WID) aRunnableS17S0400000_14.l3;
            C81975WFf d7 = ((InterfaceC82062WIo) LJ).d7(1);
            if (d7 != null && (interfaceC81973WFd = d7.LJLLJ) != null) {
                interfaceC81973WFd.LIZIZ();
            }
            C81975WFf LJIILJJIL = wid.LJIILJJIL();
            c82064WIq.getClass();
            C82064WIq.LJII(c82622Wbi, LJIILJJIL);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS17S0400000_14 aRunnableS17S0400000_14) {
        boolean LIZ;
        try {
            WN7.LIZIZ((View) aRunnableS17S0400000_14.l0);
            WN7.LIZIZ((View) aRunnableS17S0400000_14.l1);
            ((WN4) aRunnableS17S0400000_14.l3).LIZ.getOverlay().remove((View) aRunnableS17S0400000_14.l0);
            ((Runnable) aRunnableS17S0400000_14.l2).run();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS17S0400000_14 aRunnableS17S0400000_14) {
        XNG xng = (XNG) aRunnableS17S0400000_14.l0;
        Object obj = aRunnableS17S0400000_14.l1;
        UIAnnotationUpdateType uIAnnotationUpdateType = (UIAnnotationUpdateType) aRunnableS17S0400000_14.l2;
        C2V c2v = (C2V) aRunnableS17S0400000_14.l3;
        xng.getClass();
        if (obj instanceof String[]) {
            C82887Wfz.LIZ();
            C38995FSd.LIZJ().execute(new ARunnableS18S0400000_15(xng, (String[]) obj, uIAnnotationUpdateType, c2v, 8));
            C82887Wfz.LIZIZ();
        } else {
            C83573Wr3.LIZIZ(c2v, UIAnnotationErrorCode.UIAnnotationErrorCode_UpdateValueFault);
            C82887Wfz.LIZIZ();
        }
    }

    public ARunnableS17S0400000_14(WMR wmr, C42051Get c42051Get, Record record, int i) {
        this.$t = i;
        ARunnableS20S0000000_14 aRunnableS20S0000000_14 = WMI.LJIIL;
        this.l3 = wmr;
        this.l0 = c42051Get;
        this.l1 = record;
        this.l2 = aRunnableS20S0000000_14;
    }

    public ARunnableS17S0400000_14(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l3 = obj;
        this.l0 = obj2;
        this.l1 = obj3;
        this.l2 = obj4;
    }
}
