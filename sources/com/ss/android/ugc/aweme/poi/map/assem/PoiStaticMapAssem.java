package com.ss.android.ugc.aweme.poi.map.assem;

import X.C191137en;
import X.C191147eo;
import X.C191157ep;
import X.C214298b3;
import X.C221108m2;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C9BE;
import X.SJC;
import Y.ARunnableS22S0200000_3;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.poi.map.PoiMapViewModel;
import com.ss.android.ugc.aweme.poi.map.assem.PoiStaticMapAssem;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PoiStaticMapAssem extends UIContentAssem {
    public final C214298b3 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C191147eo LJLJI;
    public final C191157ep LJLJJI;

    /* JADX WARN: Type inference failed for: r0v7, types: [X.7ep] */
    public PoiStaticMapAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(PoiMapViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 774), C191137en.INSTANCE, null);
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 769));
        this.LJLJI = new C191147eo();
        this.LJLJJI = new SJC() { // from class: X.7ep
            @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                PoiStaticMapAssem poiStaticMapAssem = PoiStaticMapAssem.this;
                C191147eo c191147eo = poiStaticMapAssem.LJLJI;
                AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(poiStaticMapAssem, 770);
                c191147eo.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime - c191147eo.LIZ > 2000) {
                    c191147eo.LIZ = elapsedRealtime;
                    aqS153S0100000_3.invoke();
                    return true;
                }
                return true;
            }
        };
    }

    public final PoiMapViewModel v3() {
        return (PoiMapViewModel) this.LJLIL.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        view.post(new ARunnableS22S0200000_3(view, this, 22));
    }
}
