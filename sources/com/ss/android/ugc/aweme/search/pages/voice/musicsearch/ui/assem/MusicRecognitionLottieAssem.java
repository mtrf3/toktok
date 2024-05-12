package com.ss.android.ugc.aweme.search.pages.voice.musicsearch.ui.assem;

import X.C214298b3;
import X.C29701Eo;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8YN;
import X.C94588ajQ;
import X.C9BE;
import X.TBT;
import Y.IDAListenerS84S0100000_42;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.search.pages.voice.musicsearch.viewmodel.MusicRecognitionVM;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.IDqS423S0100000_42;
import kotlin.jvm.internal.IDqS446S0100000_42;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class MusicRecognitionLottieAssem extends UIContentAssem {
    public final C214298b3 LJLIL;
    public int LJLILLLLZI;
    public C29701Eo LJLJI;

    public MusicRecognitionLottieAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(MusicRecognitionVM.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new IDqS423S0100000_42(LIZ, 88), C94588ajQ.INSTANCE, null);
        this.LJLILLLLZI = 2;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C29701Eo c29701Eo;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        View containerView = getContainerView();
        if (containerView instanceof C29701Eo) {
            c29701Eo = (C29701Eo) containerView;
        } else {
            c29701Eo = null;
        }
        this.LJLJI = c29701Eo;
        C8YN.LJII(this, this.LJLIL.getValue(), new TBT() { // from class: X.apv
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C94283aeV) obj).LJLIL;
            }
        }, null, new IDqS446S0100000_42(this, 2), 6);
    }

    public final void v3(int i) {
        if (this.LJLILLLLZI == i) {
            return;
        }
        this.LJLILLLLZI = i;
        C29701Eo c29701Eo = this.LJLJI;
        if (c29701Eo != null) {
            c29701Eo.removeAllAnimatorListeners();
        }
        if (i != 0) {
            if (i != 1) {
                C29701Eo c29701Eo2 = this.LJLJI;
                if (c29701Eo2 != null) {
                    c29701Eo2.setAnimation("musicwait.json");
                }
                C29701Eo c29701Eo3 = this.LJLJI;
                if (c29701Eo3 != null) {
                    c29701Eo3.setRepeatCount(-1);
                }
                C29701Eo c29701Eo4 = this.LJLJI;
                if (c29701Eo4 != null) {
                    c29701Eo4.playAnimation();
                    return;
                }
                return;
            }
            C29701Eo c29701Eo5 = this.LJLJI;
            if (c29701Eo5 != null) {
                c29701Eo5.setAnimation("musicrecognizing.json");
            }
            C29701Eo c29701Eo6 = this.LJLJI;
            if (c29701Eo6 != null) {
                c29701Eo6.setRepeatCount(-1);
            }
            C29701Eo c29701Eo7 = this.LJLJI;
            if (c29701Eo7 == null) {
                return;
            }
            c29701Eo7.playAnimation();
            return;
        }
        C29701Eo c29701Eo8 = this.LJLJI;
        if (c29701Eo8 != null) {
            c29701Eo8.setAnimation("musicsearch.json");
        }
        C29701Eo c29701Eo9 = this.LJLJI;
        if (c29701Eo9 != null) {
            c29701Eo9.setRepeatCount(0);
        }
        C29701Eo c29701Eo10 = this.LJLJI;
        if (c29701Eo10 != null) {
            c29701Eo10.addAnimatorListener(new IDAListenerS84S0100000_42(this, 1));
        }
        C29701Eo c29701Eo11 = this.LJLJI;
        if (c29701Eo11 == null) {
            return;
        }
        c29701Eo11.playAnimation();
    }
}
