package com.ss.android.ugc.aweme.fullpagev3.assem;

import X.C184337Lh;
import X.C214298b3;
import X.C221108m2;
import X.C47704Ins;
import X.C55749LuL;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C9BE;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.ui.feed.photos.PostModeFullPageViewModel;
import com.ss.android.ugc.aweme.viewmodel.PostModeContainerViewModel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;

/* loaded from: classes4.dex */
public class BaseFullPageAssem extends UIContentAssem {
    public final C55749LuL LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C214298b3 LJLJI;

    public BaseFullPageAssem() {
        new LinkedHashMap();
        this.LJLIL = new C55749LuL(C47704Ins.LIZJ(this, FullPageParam.class, null), checkSupervisorPrepared());
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 415));
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(PostModeFullPageViewModel.class);
        this.LJLJI = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 416), C184337Lh.INSTANCE, null);
    }

    public final FullPageParam A3() {
        return (FullPageParam) this.LJLIL.getValue();
    }

    public final PostModeContainerViewModel v3() {
        return (PostModeContainerViewModel) this.LJLILLLLZI.getValue();
    }

    public final PostModeFullPageViewModel x3() {
        return (PostModeFullPageViewModel) this.LJLJI.getValue();
    }
}
