package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.ss.android.ugc.aweme.model.PostModeEgressEtData;
import kotlin.jvm.internal.o;

/* renamed from: X.80n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2044180n extends F9E implements InterfaceC87283bg {
    public long LJLIL;
    public double LJLILLLLZI;
    public final String LJLJI;
    public Long LJLJJI;
    public boolean LJLJJL;
    public long LJLJJLL;
    public long LJLJL;
    public long LJLJLJ;
    public boolean LJLJLLL;
    public PostModeEgressEtData LJLL;
    public long LJLLI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.LJLIL), Double.valueOf(this.LJLILLLLZI), this.LJLJI};
    }

    public C2044180n(String paramsEventType) {
        o.LJIIIZ(paramsEventType, "paramsEventType");
        this.LJLIL = 0L;
        this.LJLILLLLZI = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        this.LJLJI = paramsEventType;
        this.LJLJLJ = -1L;
        this.LJLL = new PostModeEgressEtData(false, (EnumC201127uu) null, 0L, 0L, 0L, (Long) null, 0, 255);
    }
}
