package com.bytedance.ies.xelement.overlay.ng;

import X.C79784VSy;
import X.VT1;
import android.app.Dialog;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes15.dex */
public final class LynxOverlayViewCaptureHelperNG {
    public final ArrayList<Integer> getAllVisibleOverlaySign() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Iterator it = ((ArrayList) C79784VSy.LIZ).iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((VT1) it.next()).LIZIZ.LJLJI.LLD.getSign()));
        }
        return arrayList;
    }

    public final ArrayList<Dialog> getGlobalOVerlayNGView() {
        ArrayList<Dialog> arrayList = new ArrayList<>();
        Iterator it = ((ArrayList) C79784VSy.LIZ).iterator();
        while (it.hasNext()) {
            arrayList.add(((VT1) it.next()).LIZIZ);
        }
        return arrayList;
    }
}
