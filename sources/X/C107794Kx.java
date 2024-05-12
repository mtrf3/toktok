package X;

import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.List;

/* renamed from: X.4Kx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C107794Kx implements IEvent {
    public final IMContact LJLIL;
    public final List<IMContact> LJLILLLLZI;
    public final boolean LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final String LJLJJLL;
    public final String LJLJL;
    public final boolean LJLJLJ;
    public final String LJLJLLL;
    public final int LJLL;
    public int LJLLI;
    public boolean LJLLILLLL;

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

    public C107794Kx(List<IMContact> list, IMContact iMContact, int i, boolean z, String str, String str2, String str3, String str4, String str5, boolean z2) {
        this.LJLILLLLZI = list;
        this.LJLIL = iMContact;
        this.LJLL = i;
        this.LJLJI = z;
        this.LJLJJI = str;
        this.LJLJJL = str2;
        this.LJLJJLL = str3;
        this.LJLJL = str4;
        this.LJLJLJ = z2;
        this.LJLJLLL = str5;
    }
}
