package com.ss.android.ugc.aweme.homepage.story.guide;

import X.ActivityC45651qj;
import X.C212428Vi;
import X.C220828la;
import X.C221108m2;
import X.C3SZ;
import X.C55647Lsh;
import X.C55648Lsi;
import X.C55649Lsj;
import X.C62822Ol8;
import X.C64216PIe;
import X.C84763XOl;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.hox.Hox;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class StoryGuideController extends UIContentAssem {
    public boolean LJLIL;
    public final C62822Ol8 LJLILLLLZI;

    public StoryGuideController() {
        new LinkedHashMap();
        this.LJLILLLLZI = C221108m2.LIZIZ(C55649Lsj.LJLIL);
        C221108m2.LIZIZ(C55647Lsh.LJLIL);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        if (C220828la.LIZ().getLong("key_first_use_time_new_version", 0L) == 0) {
            C220828la.LIZ().storeLong("key_first_use_time_new_version", System.currentTimeMillis());
        }
    }

    @Override // X.C8W0
    public final void onResume() {
        super.onResume();
        if (this.LJLIL) {
            this.LJLIL = false;
            ActivityC45651qj LIZ = C212428Vi.LIZ(this);
            if (LIZ != null) {
                C3SZ.LIZ(LIZ);
            }
        }
    }

    @Override // X.C8W0
    public final void onStop() {
        super.onStop();
        if (!((C64216PIe) this.LJLILLLLZI.getValue()).LJLJJL && C84763XOl.LJIIIIZZ() == null) {
            this.LJLIL = true;
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ == null) {
            return;
        }
        Hox.LJLLI.LIZ(LIZ).hv0("HOME", new C55648Lsi(this));
    }
}
