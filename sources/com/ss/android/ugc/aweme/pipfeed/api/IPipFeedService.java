package com.ss.android.ugc.aweme.pipfeed.api;

import X.ActivityC45651qj;
import X.C8W0;
import X.IVB;
import X.InterfaceC48810JDq;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS158S0100000_8;

/* loaded from: classes9.dex */
public interface IPipFeedService {

    /* loaded from: classes9.dex */
    public interface DebugService {
    }

    void LIZ();

    void LIZIZ(ActivityC45651qj activityC45651qj, String str, Map<String, String> map);

    void LIZJ();

    boolean LIZLLL();

    void LJ(InterfaceC48810JDq interfaceC48810JDq);

    void LJFF(ActivityC45651qj activityC45651qj, AqS158S0100000_8 aqS158S0100000_8);

    boolean LJI();

    void LJII(String str);

    void LJIIIIZZ();

    void LJIIIZ(ActivityC45651qj activityC45651qj, String str, Map<String, String> map);

    boolean LJIIJ();

    boolean LJIIJJI();

    boolean LJIIL(Aweme aweme, String str);

    List<String> LJIILIIL();

    void LJIILJJIL();

    void LJIILL(boolean z);

    void LJIILLIIL(InterfaceC48810JDq interfaceC48810JDq);

    boolean LJIIZILJ();

    void LJIJ();

    void LJIJI(IVB ivb);

    C8W0 LJIJJ();

    boolean LJIJJLI();

    boolean LJIL(Context context);

    void LJJ();

    void LJJI(String... strArr);

    boolean LJJIFFI();

    void init();

    boolean isInPipMode();
}
