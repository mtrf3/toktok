package com.bytedance.ies.xelement.overlay;

import X.C79774VSo;
import X.C79775VSp;
import android.app.Dialog;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes15.dex */
public final class LynxOverlayViewCaptureHelper {
    public final ArrayList<Dialog> getGlobalOVerlayView() {
        ArrayList<Dialog> arrayList = new ArrayList<>();
        Iterator it = ((ArrayList) C79774VSo.LIZ).iterator();
        while (it.hasNext()) {
            arrayList.add(((C79775VSp) it.next()).LIZIZ);
        }
        return arrayList;
    }
}
