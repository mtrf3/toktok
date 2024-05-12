package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.Jqa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50420Jqa implements IEvent {
    public final int LJLIL;
    public final Object LJLILLLLZI;
    public Bundle LJLJI;
    public String LJLJJI;
    public String LJLJJL;
    public long LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public long LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public String LJLLILLLL;
    public Boolean LJLLJ;
    public String LJLLL;
    public String LJLLLL;
    public final Long LJLLLLLL;
    public int LJLZ;
    public PublishModel LJZ;

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

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoEvent{type=");
        LIZ.append(this.LJLIL);
        LIZ.append(", param=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", videoType=");
        LIZ.append(0);
        LIZ.append(", from='");
        LIZ.append(this.LJLJJI);
        LIZ.append(", currentPosition='");
        LIZ.append(this.LJLJLLL);
        LIZ.append(", isPlaying='");
        LIZ.append(this.LJLL);
        LIZ.append('\'');
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public C50420Jqa(int i) {
        this.LJLJLJ = -1;
        this.LJLLJ = Boolean.FALSE;
        this.LJLIL = i;
    }

    public C50420Jqa(Object obj, Long l) {
        this.LJLJLJ = -1;
        this.LJLLJ = Boolean.FALSE;
        this.LJLIL = 14;
        this.LJLILLLLZI = obj;
        this.LJLLLLLL = l;
    }

    public C50420Jqa(int i, Object obj) {
        this.LJLJLJ = -1;
        this.LJLLJ = Boolean.FALSE;
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
    }
}
