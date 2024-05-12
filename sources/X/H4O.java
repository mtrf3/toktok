package X;

import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H4O extends F9E {
    public final CreativeInfo LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final String LJLJJLL;
    public final UrlModel LJLJL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI), this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL};
    }

    public H4O(CreativeInfo creativeInfo, int i, int i2, String effectId, String effectName, String str, UrlModel effectIcon) {
        o.LJIIIZ(effectId, "effectId");
        o.LJIIIZ(effectName, "effectName");
        o.LJIIIZ(effectIcon, "effectIcon");
        this.LJLIL = creativeInfo;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = effectId;
        this.LJLJJL = effectName;
        this.LJLJJLL = str;
        this.LJLJL = effectIcon;
    }
}
