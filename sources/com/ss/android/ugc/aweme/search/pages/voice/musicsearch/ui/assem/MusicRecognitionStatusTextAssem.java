package com.ss.android.ugc.aweme.search.pages.voice.musicsearch.ui.assem;

import X.C214298b3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8YN;
import X.C94589ajR;
import X.C9BE;
import X.TBT;
import X.XKQ;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.pages.voice.musicsearch.viewmodel.MusicRecognitionVM;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.IDqS423S0100000_42;
import kotlin.jvm.internal.IDqS446S0100000_42;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class MusicRecognitionStatusTextAssem extends UIContentAssem {
    public final C214298b3 LJLIL;
    public XKQ LJLILLLLZI;
    public int LJLJI;
    public XKQ LJLJJI;
    public int LJLJJL;
    public TuxTextView LJLJJLL;

    public MusicRecognitionStatusTextAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(MusicRecognitionVM.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new IDqS423S0100000_42(LIZ, 89), C94589ajR.INSTANCE, null);
        this.LJLJI = 3;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        View containerView = getContainerView();
        o.LJII(containerView, "null cannot be cast to non-null type com.bytedance.tux.input.TuxTextView");
        this.LJLJJLL = (TuxTextView) containerView;
        C8YN.LJII(this, this.LJLIL.getValue(), new TBT() { // from class: X.apw
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C94283aeV) obj).LJLIL;
            }
        }, null, new IDqS446S0100000_42(this, 3), 6);
    }
}
