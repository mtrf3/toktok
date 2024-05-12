package X;

import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JNV extends AbstractC214518bP<JQA> {
    public final /* synthetic */ JNU LIZIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JNV(JNU jnu) {
        super(null);
        this.LIZIZ = jnu;
    }

    @Override // X.AbstractC214518bP
    public final void LIZJ(InterfaceC74236TBo<?> property, JQA jqa, JQA jqa2) {
        String str;
        LogPbBean logPbBean;
        LogPbBean logPbBean2;
        o.LJIIIZ(property, "property");
        JQA jqa3 = jqa2;
        JQA jqa4 = jqa;
        String str2 = null;
        if (jqa4 != null && (logPbBean2 = jqa4.LJIIJ) != null) {
            str = logPbBean2.getImprId();
        } else {
            str = null;
        }
        if (jqa3 != null && (logPbBean = jqa3.LJIIJ) != null) {
            str2 = logPbBean.getImprId();
        }
        if (!ujb.o.LJJJJIZL(str, str2, false)) {
            this.LIZIZ.getClass();
            this.LIZIZ.N();
        }
    }
}
