package X;

import android.text.TextUtils;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.Jtj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50615Jtj implements InterfaceC50422Jqc {
    @Override // X.InterfaceC50422Jqc
    public final InterfaceC51679KPz LIZ(M89 param, AbstractC51036K1g<?, ?> abstractC51036K1g, JediViewModel<?> jediViewModel) {
        o.LJIIIZ(param, "param");
        C50494Jrm.LIZ = false;
        C50494Jrm.LIZIZ = false;
        C50494Jrm.LIZJ = false;
        if (C48919JHv.LIZ()) {
            Aweme aweme = C78966Uyw.LJLJJI;
            C78966Uyw.LJLJJI = null;
            return new C50662JuU(aweme);
        }
        if (!TextUtils.isEmpty(param.getIds()) || !TextUtils.isEmpty(param.getPushParams())) {
            return new C224708rq(param.getIds());
        }
        return new KQC();
    }
}
