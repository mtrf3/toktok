package X;

import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.detail.AbstractDetailFragment;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Wff, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* synthetic */ class C82867Wff implements Observer {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.LJLIL) {
            case 0:
                ((AbstractDetailFragment) this.LJLILLLLZI).lambda$new$0((Boolean) obj);
                return;
            case 1:
                C82866Wfe c82866Wfe = (C82866Wfe) this.LJLILLLLZI;
                float floatValue = ((Float) obj).floatValue();
                int i = c82866Wfe.LLII;
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            c82866Wfe.LJJIJIIJIL(floatValue, c82866Wfe.LLIIII);
                        }
                    } else {
                        VideoEditViewModel videoEditViewModel = c82866Wfe.LJZL;
                        if (videoEditViewModel != null) {
                            videoEditViewModel.LLD.getValue().totalSpeed = floatValue;
                            C82868Wfg c82868Wfg = c82866Wfe.LLFF;
                            long j = c82866Wfe.LLILLJJLI;
                            c82866Wfe.LJZL.nv0();
                            c82868Wfg.LIZJ(j);
                        }
                        c82866Wfe.LLFFF.LJLLLLLL(c82866Wfe.LLFF.LIZ, 0.0f);
                        c82866Wfe.LJLLI.LJLI(0);
                    }
                } else {
                    c82866Wfe.LJJIJIIJIL(floatValue, 0);
                    c82866Wfe.LJII();
                }
                c82866Wfe.LJIJI();
                VideoEditViewModel videoEditViewModel2 = c82866Wfe.LJZL;
                if (videoEditViewModel2 != null) {
                    videoEditViewModel2.LJLLJ.setValue(Float.valueOf(floatValue));
                    return;
                }
                return;
            default:
                C82869Wfh this$0 = (C82869Wfh) this.LJLILLLLZI;
                InterfaceC40638FxC interfaceC40638FxC = (InterfaceC40638FxC) obj;
                o.LJIIIZ(this$0, "this$0");
                if (interfaceC40638FxC != null) {
                    interfaceC40638FxC.LJL(this$0.LJIIIIZZ);
                    this$0.LIZ(interfaceC40638FxC);
                    return;
                }
                for (Map.Entry entry : ((LinkedHashMap) this$0.LJ).entrySet()) {
                    C82876Wfo c82876Wfo = this$0.LJI;
                    if (c82876Wfo != null) {
                        c82876Wfo.onError(-10, (String) entry.getKey());
                    }
                }
                ((LinkedHashMap) this$0.LJ).clear();
                for (String str : this$0.LIZLLL) {
                    C82876Wfo c82876Wfo2 = this$0.LJI;
                    if (c82876Wfo2 != null) {
                        c82876Wfo2.onError(-11, str);
                    }
                }
                this$0.LIZLLL.clear();
                this$0.LIZJ = null;
                return;
        }
    }

    public /* synthetic */ C82867Wff(int i, Object obj) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
    }
}
