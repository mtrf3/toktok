package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchCLASubtitleAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel.SearchCLASubtitleVM;

/* loaded from: classes9.dex */
public final class JOT implements JJS {
    public final /* synthetic */ JJR LIZ;
    public final /* synthetic */ SearchCLASubtitleAssem LIZIZ;

    @Override // X.JJS
    public final void LIZLLL() {
        EnumC48742JBa state = this.LIZ.getState();
        if (state == null) {
            return;
        }
        int i = C48744JBc.LIZ[state.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            this.LIZIZ.Z3().iv0(EnumC48742JBa.SHOW);
            SearchCLASubtitleVM Z3 = this.LIZIZ.Z3();
            JQA jqa = this.LIZIZ.b4().LJLJI;
            Aweme aweme = this.LIZIZ.LLFFF;
            Z3.getClass();
            SearchCLASubtitleVM.hv0(jqa, aweme, "on");
            return;
        }
        this.LIZIZ.Z3().iv0(EnumC48742JBa.CLOSED);
        SearchCLASubtitleVM Z32 = this.LIZIZ.Z3();
        JQA jqa2 = this.LIZIZ.b4().LJLJI;
        Aweme aweme2 = this.LIZIZ.LLFFF;
        Z32.getClass();
        SearchCLASubtitleVM.hv0(jqa2, aweme2, "off");
    }

    public JOT(JJR jjr, SearchCLASubtitleAssem searchCLASubtitleAssem) {
        this.LIZ = jjr;
        this.LIZIZ = searchCLASubtitleAssem;
    }
}
