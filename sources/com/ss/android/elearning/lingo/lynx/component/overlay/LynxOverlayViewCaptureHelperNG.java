package com.ss.android.elearning.lingo.lynx.component.overlay;

import X.C79785VSz;
import X.VT0;
import android.app.Dialog;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes15.dex */
public final class LynxOverlayViewCaptureHelperNG {
    public final ArrayList<Integer> getAllVisibleOverlaySign() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Iterator it = ((ArrayList) C79785VSz.LIZ).iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((VT0) it.next()).LIZIZ.LJLIL.LJLIL.getSign()));
        }
        return arrayList;
    }

    public final ArrayList<Dialog> getGlobalOVerlayNGView() {
        ArrayList<Dialog> arrayList = new ArrayList<>();
        Iterator it = ((ArrayList) C79785VSz.LIZ).iterator();
        while (it.hasNext()) {
            arrayList.add(((VT0) it.next()).LIZIZ);
        }
        return arrayList;
    }
}
