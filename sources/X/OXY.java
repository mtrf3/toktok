package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.specact.model.NowShareModel$NowPostIncentiveSharePanelData;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OXY extends F9E {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final NowShareModel$NowPostIncentiveSharePanelData LJLJJL;
    public final Bundle LJLJJLL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL};
    }

    public OXY(String id, String str, NowShareModel$NowPostIncentiveSharePanelData nowShareModel$NowPostIncentiveSharePanelData) {
        Bundle bundle = new Bundle();
        o.LJIIIZ(id, "id");
        this.LJLIL = id;
        this.LJLILLLLZI = str;
        this.LJLJI = "";
        this.LJLJJI = "";
        this.LJLJJL = nowShareModel$NowPostIncentiveSharePanelData;
        this.LJLJJLL = bundle;
    }
}
