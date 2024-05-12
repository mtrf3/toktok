package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JQA implements JHA {
    public static final /* synthetic */ int LJJIJLIJ = 0;
    public boolean LIZ;
    public int LIZIZ;
    public String LIZJ = "";
    public String LIZLLL = "";
    public String LJ = "";
    public String LJFF = "";
    public String LJI = "";
    public String LJII = "";
    public String LJIIIIZZ = "";
    public String LJIIIZ = "";
    public LogPbBean LJIIJ = new LogPbBean();
    public String LJIIJJI = "";
    public int LJIIL = -1;
    public String LJIILIIL = "";
    public String LJIILJJIL = "";
    public String LJIILL = "";
    public String LJIILLIIL = "";
    public String LJIIZILJ = "";
    public String LJIJ = "";
    public String LJIJI = "normal";
    public String LJIJJ = "normal";
    public String LJIJJLI = "";
    public String LJIL = CardStruct.IStatusCode.DEFAULT;
    public String LJJ = "";
    public String LJJI = "";
    public String LJJIFFI = "";
    public String LJJII = "";
    public java.util.Map<String, String> LJJIII = new LinkedHashMap();
    public java.util.Map<String, String> LJJIIJ = new LinkedHashMap();
    public String LJJIIJZLJL;
    public InterfaceC88472Yns<? super Aweme, String> LJJIIZ;
    public String LJJIIZI;
    public String LJJIJ;
    public String LJJIJIIJI;
    public JQF LJJIJIIJIL;
    public InterfaceC88472Yns<? super Aweme, String> LJJIJIL;
    public InterfaceC88472Yns<? super Aweme, String> LJJIJL;

    public JQA() {
        C113554cx.LJJJLIIL();
        this.LJJIIJZLJL = "";
        this.LJJIIZ = JQC.LJLIL;
        this.LJJIIZI = "";
        this.LJJIJ = "";
        this.LJJIJIIJI = "";
        this.LJJIJIL = JQB.LJLIL;
        this.LJJIJL = JQD.LJLIL;
    }

    public final void LIZ(@InterfaceC50111Jlb String str) {
        if (str == null) {
            str = "unknown";
        }
        this.LJJII = str;
    }

    public final void LIZIZ(String implId) {
        o.LJIIIZ(implId, "implId");
        this.LJIIIIZZ = implId;
    }

    public final void LIZJ(String searchId) {
        o.LJIIIZ(searchId, "searchId");
        this.LJII = searchId;
    }

    public final void LIZLLL(String searchKeyword) {
        o.LJIIIZ(searchKeyword, "searchKeyword");
        this.LJ = searchKeyword;
    }
}
