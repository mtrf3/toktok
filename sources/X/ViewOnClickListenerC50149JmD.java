package X;

import android.view.View;
import com.ss.android.ugc.aweme.discover.model.QueryCorrectInfo;

/* renamed from: X.JmD, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC50149JmD implements View.OnClickListener {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ QueryCorrectInfo LJLILLLLZI;
    public final /* synthetic */ C50137Jm1 LJLJI;
    public final /* synthetic */ String LJLJJI;

    public ViewOnClickListenerC50149JmD(String str, QueryCorrectInfo queryCorrectInfo, C50137Jm1 c50137Jm1, String str2) {
        this.LJLIL = str;
        this.LJLILLLLZI = queryCorrectInfo;
        this.LJLJI = c50137Jm1;
        this.LJLJJI = str2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str = this.LJLIL;
        this.LJLILLLLZI.getCorrectedLevel();
        C2U8.LIZ(new C50162JmQ(str));
        C50137Jm1 c50137Jm1 = this.LJLJI;
        int correctedLevel = this.LJLILLLLZI.getCorrectedLevel();
        String correctedKeyword = this.LJLILLLLZI.getCorrectedKeyword();
        String str2 = this.LJLJJI;
        String requestId = this.LJLILLLLZI.getRequestId();
        c50137Jm1.getClass();
        C50137Jm1.LIZIZ(correctedLevel, "click", correctedKeyword, str2, requestId, "corrected_keyword");
    }
}
