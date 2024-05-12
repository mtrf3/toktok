package X;

import com.bytedance.pumbaa.ruler.adapter.api.RuleEngineConfig;
import com.google.gson.m;
import com.ss.android.ugc.aweme.kids.compliance.IKidsSettingsService;
import com.ss.android.ugc.aweme.kids.homepage.compliance.KidsSettingsServiceImpl;

/* renamed from: X.Pv0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65982Pv0 extends AbstractC65781Prl implements InterfaceC65784Pro<C65983Pv1> {
    public static final C65982Pv0 LJLIL = new C65982Pv0();

    public C65982Pv0() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C65983Pv1 invoke() {
        RuleEngineConfig ruleEngineConfig;
        m mVar;
        IKidsSettingsService LJIIJJI = KidsSettingsServiceImpl.LJIIJJI();
        if (LJIIJJI == null || (ruleEngineConfig = LJIIJJI.LIZLLL()) == null) {
            ruleEngineConfig = new RuleEngineConfig(false, 0, false, 0, false, null, null, false, false, false, false, false, false, null, null, false, false, false, null, 524287, null);
        }
        IKidsSettingsService LJIIJJI2 = KidsSettingsServiceImpl.LJIIJJI();
        if (LJIIJJI2 != null) {
            mVar = LJIIJJI2.LJIIIIZZ();
        } else {
            mVar = null;
        }
        return new C65983Pv1(ruleEngineConfig, mVar);
    }
}
