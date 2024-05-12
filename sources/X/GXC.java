package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GXC extends F9E {
    public final /* synthetic */ int LJLIL = 1;
    public final Object LJLILLLLZI;
    public final Object LJLJI;
    public final Object LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        switch (this.LJLIL) {
            case 0:
                return new Object[]{this.LJLILLLLZI, this.LJLJI, this.LJLJJI};
            default:
                return new Object[]{this.LJLILLLLZI, this.LJLJI, this.LJLJJI};
        }
    }

    public GXC(C41665GWv c41665GWv, AwemeDraft draft, GLI gli) {
        o.LJIIIZ(draft, "draft");
        this.LJLILLLLZI = c41665GWv;
        this.LJLJI = draft;
        this.LJLJJI = gli;
    }

    public GXC(String str, String str2, EnumC124564ui type) {
        o.LJIIIZ(type, "type");
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = type;
    }
}
