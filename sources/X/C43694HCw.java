package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.List;

/* renamed from: X.HCw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43694HCw implements IEvent {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final Object LJLJI;
    public final String LJLJJI;
    public boolean LJLJJL;
    public C41759GaB LJLJJLL;
    public boolean LJLJL;
    public CreateBaseAwemeResponse LJLJLJ;
    public List<User> LJLJLLL;
    public boolean LJLL;
    public String LJLLI;
    public PublishModel LJLLILLLL;
    public String LJLLJ;

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent post() {
        C2U8.LIZ(this);
        return this;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent postSticky() {
        C2U8.LIZIZ(this);
        return this;
    }

    public C43694HCw() {
        this.LJLIL = 2;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PublishStatus{status=");
        LIZ.append(this.LJLIL);
        LIZ.append(", progress=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", params=");
        return U26.LIZJ(LIZ, this.LJLJI, '}', LIZ);
    }

    public C43694HCw(Object obj, int i, int i2, String str) {
        this.LJLJI = obj;
        this.LJLILLLLZI = i2;
        this.LJLIL = i;
        this.LJLJJI = str;
    }
}
