package com.ss.android.ugc.aweme.search.pages.choosemusic.result.core.viewmodel;

import X.C51468KHw;
import X.XVF;
import X.XVG;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public abstract class SearchMusicResultBaseViewModel extends ViewModel {
    public final XVG LJLIL = new XVG("search_music", "", "", XVF.LIZ);
    public C51468KHw LJLILLLLZI = new C51468KHw();
    public Map<String, Object> LJLJI;

    public final String gv0() {
        if (CommerceMediaServiceImpl.LIZJ().LJIIIZ()) {
            return "ad_music";
        }
        C51468KHw c51468KHw = this.LJLILLLLZI;
        String str = c51468KHw.LIZ;
        if (c51468KHw.LJ != null) {
            str = "tab_search";
        }
        o.LJIIIIZZ(str, "{\n            var source…         source\n        }");
        return str;
    }
}
