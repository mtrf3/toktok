package Y;

import X.C93729aVZ;
import X.C93792aWa;
import X.C94007aa3;
import X.InterfaceC88471Ynr;
import X.InterfaceC93791aWZ;
import X.OSZ;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.effectcreatormobile.objectselect.prefab.PrefabPanelFragment;
import com.bytedance.ies.effectcreator.swig.Feature;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public class IDTListenerS124S0100000_42 implements View.OnTouchListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.$t) {
            case 0:
                return onTouch$0(this, view, motionEvent);
            case 1:
                return onTouch$1(this, view, motionEvent);
            case 2:
                return onTouch$2(this, view, motionEvent);
            default:
                return false;
        }
    }

    public IDTListenerS124S0100000_42(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onTouch$0(IDTListenerS124S0100000_42 iDTListenerS124S0100000_42, View view, MotionEvent event) {
        Feature feature;
        o.LJIIIIZZ(event, "event");
        if ((event.getActionMasked() == 1 || event.getActionMasked() == 3) && (feature = ((PrefabPanelFragment) iDTListenerS124S0100000_42.l0).Al().LJLLL) != null) {
            feature.setVisible(true);
            return false;
        }
        return false;
    }

    public static final boolean onTouch$1(IDTListenerS124S0100000_42 iDTListenerS124S0100000_42, View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (motionEvent == null) {
            return false;
        }
        if (motionEvent.getActionMasked() != 0) {
            if (!((C93792aWa) iDTListenerS124S0100000_42.l0).LJ && (Math.abs(motionEvent.getRawX() - ((C93792aWa) iDTListenerS124S0100000_42.l0).LIZJ) > ((C93792aWa) iDTListenerS124S0100000_42.l0).LJFF || Math.abs(motionEvent.getRawY() - ((C93792aWa) iDTListenerS124S0100000_42.l0).LIZLLL) > ((C93792aWa) iDTListenerS124S0100000_42.l0).LJFF)) {
                ((C93792aWa) iDTListenerS124S0100000_42.l0).LJ = true;
            }
        } else {
            C93792aWa c93792aWa = (C93792aWa) iDTListenerS124S0100000_42.l0;
            c93792aWa.LJ = false;
            c93792aWa.LIZJ = (int) motionEvent.getRawX();
            ((C93792aWa) iDTListenerS124S0100000_42.l0).LIZLLL = (int) motionEvent.getRawY();
        }
        List<OSZ<View, InterfaceC93791aWZ>> list = ((C93792aWa) iDTListenerS124S0100000_42.l0).LIZ.get(Integer.valueOf(motionEvent.getActionMasked()));
        if (list != null) {
            loop0: while (true) {
                z = true;
                for (OSZ<View, InterfaceC93791aWZ> osz : list) {
                    if (!z || C93729aVZ.LIZIZ(osz.getFirst()).contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                        z = false;
                    }
                }
            }
        } else {
            z = true;
        }
        List<OSZ<View, InterfaceC93791aWZ>> list2 = ((C93792aWa) iDTListenerS124S0100000_42.l0).LIZ.get(Integer.valueOf(motionEvent.getActionMasked()));
        if (list2 != null) {
            loop2: while (true) {
                z2 = false;
                for (OSZ<View, InterfaceC93791aWZ> osz2 : list2) {
                    if (z2 || (osz2.getSecond().LLZIL(!C93729aVZ.LIZIZ(osz2.getFirst()).contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY()), z, ((C93792aWa) iDTListenerS124S0100000_42.l0).LJ) && osz2.getFirst().getVisibility() == 0)) {
                        z2 = true;
                    }
                }
                break loop2;
            }
        } else {
            z2 = false;
        }
        List<OSZ<View, InterfaceC93791aWZ>> list3 = ((C93792aWa) iDTListenerS124S0100000_42.l0).LIZ.get(Integer.valueOf(motionEvent.getActionMasked()));
        if (list3 == null || list3.isEmpty()) {
            Iterator it = ((ArrayList) ((C93792aWa) iDTListenerS124S0100000_42.l0).LIZIZ).iterator();
            while (it.hasNext()) {
                InterfaceC88471Ynr interfaceC88471Ynr = (InterfaceC88471Ynr) it.next();
                if (z2 || ((Boolean) interfaceC88471Ynr.invoke(motionEvent, Boolean.valueOf(((C93792aWa) iDTListenerS124S0100000_42.l0).LJ))).booleanValue()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
        }
        return z2;
    }

    public static final boolean onTouch$2(IDTListenerS124S0100000_42 iDTListenerS124S0100000_42, View view, MotionEvent event) {
        o.LJIIIIZZ(event, "event");
        if (event.getAction() == 0) {
            C94007aa3 c94007aa3 = (C94007aa3) iDTListenerS124S0100000_42.l0;
            if (!c94007aa3.LIZJ) {
                c94007aa3.getClass();
                return true;
            }
        }
        return false;
    }
}
