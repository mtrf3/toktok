package X;

import Y.ACListenerS21S0100000_1;
import android.app.Activity;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3On, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C83253On {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(ActivityC45651qj currentActivity) {
        int i;
        int i2;
        o.LJIIIZ(currentActivity, "currentActivity");
        C3LR.LIZ.getClass();
        C3LD LIZ2 = C3LR.LIZ();
        C252659vp c252659vp = new C252659vp();
        if (LIZ2.LIZ.getBoolean("STICK_TO_TOP", false)) {
            i = R.string.i47;
        } else {
            i = R.string.i46;
        }
        c252659vp.LIZ(i);
        if (LIZ2.LIZ.getBoolean("STICK_TO_TOP", false)) {
            i2 = R.raw.icon_pin_fill;
        } else {
            i2 = R.raw.icon_pin;
        }
        c252659vp.LIZJ(i2);
        c252659vp.LIZJ = 0;
        c252659vp.LJ = new ACListenerS21S0100000_1(LIZ2, 289);
        C252659vp c252659vp2 = new C252659vp();
        c252659vp2.LIZ(R.string.efd);
        c252659vp2.LIZJ(R.raw.icon_trash_bin);
        c252659vp2.LIZJ = 1;
        c252659vp2.LJ = new ACListenerS21S0100000_1(LIZ2, 288);
        C245319jz c245319jz = new C245319jz();
        c245319jz.LJI(R.string.i3r);
        c245319jz.LJ(C47261Igj.LJJIJIIJI(c252659vp, c252659vp2));
        c245319jz.LIZLLL(R.string.cg_);
        TuxActionSheet LIZJ = c245319jz.LIZJ();
        FragmentManager supportFragmentManager = currentActivity.getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "currentActivity.supportFragmentManager");
        LIZJ.show(supportFragmentManager, "IMSessionLongPressHelper");
    }

    public static TuxActionSheet LIZ(ActivityC45651qj currentActivity, IMContact iMContact, C3L4 session, AnonymousClass367 bluePrint, DialogInterface.OnDismissListener onDismissListener) {
        String str;
        C63088OpQ coreInfo;
        o.LJIIIZ(currentActivity, "currentActivity");
        o.LJIIIZ(session, "session");
        o.LJIIIZ(bluePrint, "bluePrint");
        String LJFF = session.LJFF();
        o.LJIIIIZZ(LJFF, "session.sessionID");
        AbstractC90763hI LIZ2 = C81273Gx.LIZ(LJFF);
        C63120Opw LIZLLL = LIZ2.LIZLLL();
        String str2 = null;
        if (LIZLLL != null && (coreInfo = LIZLLL.getCoreInfo()) != null) {
            if (iMContact != null) {
                str2 = iMContact.getDisplayName();
            }
            coreInfo.setName(str2);
        }
        List<InterfaceC88473Ynt<Activity, AbstractC90763hI, C3L4, AbstractC785136h>> actionList = bluePrint.getActionList();
        ArrayList arrayList = new ArrayList(C32I.LJJL(actionList, 10));
        Iterator<InterfaceC88473Ynt<Activity, AbstractC90763hI, C3L4, AbstractC785136h>> it = actionList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().invoke(currentActivity, LIZ2, session));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (!((AbstractC785136h) next).LJ()) {
                arrayList2.add(next);
            }
        }
        C245319jz c245319jz = new C245319jz();
        if (iMContact == null || (str = iMContact.getDisplayName()) == null) {
            str = "";
        }
        c245319jz.LJII(bluePrint.getTitle(currentActivity, str));
        ArrayList arrayList3 = new ArrayList(C32I.LJJL(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            AbstractC785136h abstractC785136h = (AbstractC785136h) it3.next();
            abstractC785136h.getClass();
            C252659vp c252659vp = new C252659vp();
            c252659vp.LIZJ(abstractC785136h.LIZIZ());
            c252659vp.LIZ(abstractC785136h.LIZJ());
            c252659vp.LIZJ = abstractC785136h.LIZLLL();
            c252659vp.LJ = new ACListenerS21S0100000_1(abstractC785136h, 287);
            arrayList3.add(c252659vp);
        }
        c245319jz.LJ(arrayList3);
        if (onDismissListener == null) {
            onDismissListener = new DialogInterface.OnDismissListener() { // from class: X.3Om
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                }
            };
        }
        c245319jz.LIZ.LJLILLLLZI = onDismissListener;
        TuxActionSheet LIZJ = c245319jz.LIZJ();
        FragmentManager supportFragmentManager = currentActivity.getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "currentActivity.supportFragmentManager");
        LIZJ.show(supportFragmentManager, "IMSessionLongPressHelper");
        return LIZJ;
    }
}
