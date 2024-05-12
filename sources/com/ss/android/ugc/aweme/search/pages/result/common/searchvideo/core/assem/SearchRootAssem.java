package com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem;

import X.C15280iq;
import X.C214348b8;
import X.C49092JOm;
import X.C49099JOt;
import X.C49105JOz;
import X.C5H3;
import X.C65352Pkq;
import X.C8VR;
import X.C8XO;
import X.JO2;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel.SearchVideoHolderVM;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchRootAssem extends ReusedUIContentAssem<SearchRootAssem> implements C8XO<C49105JOz> {
    public final C5H3 LJZL;
    public final View LL;
    public final View LLD;

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public SearchRootAssem(View view) {
        o.LJIIIZ(view, "view");
        new LinkedHashMap();
        this.LJZL = C214348b8.LIZIZ(this, C65352Pkq.LIZ(SearchVideoHolderVM.class), JO2.INSTANCE);
        View findViewById = view.findViewById(R.id.jhq);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.search_subtitle_view)");
        this.LL = findViewById;
        View findViewById2 = view.findViewById(R.id.n82);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.video_skip_view)");
        this.LLD = findViewById2;
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(C49105JOz c49105JOz) {
        C49105JOz item = c49105JOz;
        o.LJIIIZ(item, "item");
        if (C49092JOm.LIZIZ(item.LJLIL, ((SearchVideoHolderVM) this.LJZL.getValue()).LJLILLLLZI)) {
            C8VR.LIZJ(this, C65352Pkq.LIZ(SearchCLASubtitleAssem.class));
        }
        if (C49099JOt.LIZ(item.LJLIL, ((SearchVideoHolderVM) this.LJZL.getValue()).LJLILLLLZI) && C49099JOt.LIZ) {
            C8VR.LIZJ(this, C65352Pkq.LIZ(SearchVideoSkipAssem.class));
        }
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(C49105JOz c49105JOz) {
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C15280iq.LIZIZ("steven", "onViewCreated");
        C8VR.LIZ(this, new AqS174S0100000_8(this, 89));
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(C49105JOz c49105JOz) {
    }
}
