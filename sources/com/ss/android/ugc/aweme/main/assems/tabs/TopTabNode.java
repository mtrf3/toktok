package com.ss.android.ugc.aweme.main.assems.tabs;

import X.AbstractC53895LDf;
import X.AbstractC53958LFq;
import X.InterfaceC53908LDs;
import X.InterfaceC53909LDt;
import X.LCP;
import X.LCY;
import X.LCZ;
import X.LGE;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.ss.android.ugc.aweme.TabFragmentNode;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class TopTabNode extends TabFragmentNode implements InterfaceC53909LDt {
    public final Context LJLJLJ;
    public final TopTabProtocol LJLJLLL;

    @Override // X.InterfaceC54080LKi
    public final String LIZ() {
        return this.LJLJLLL.w0(this.LJLJLJ);
    }

    @Override // com.ss.android.ugc.aweme.TabFragmentNode, X.InterfaceC54080LKi
    public final void LIZIZ() {
        this.LJLJLLL.LIZIZ();
    }

    @Override // X.InterfaceC53909LDt
    public final LGE LJI() {
        return this.LJLJLLL.LJ();
    }

    @Override // X.AbstractC53895LDf
    public final Bundle LJIIIZ() {
        return this.LJLJLLL.d(this.LJLJLJ);
    }

    @Override // X.AbstractC53895LDf
    public final Class<? extends Fragment> LJIIJ() {
        return this.LJLJLLL.LJJJJZI();
    }

    @Override // X.AbstractC53895LDf
    public final String LJIIL() {
        return this.LJLJLLL.LJIIIZ();
    }

    @Override // X.AbstractC53895LDf
    public final String tag() {
        return this.LJLJLLL.getTag();
    }

    @Override // com.ss.android.ugc.aweme.TabFragmentNode, X.InterfaceC54080LKi
    public final int type() {
        return this.LJLJLLL.LJI();
    }

    public final int hashCode() {
        return tag().hashCode();
    }

    @Override // com.ss.android.ugc.aweme.TabFragmentNode, X.InterfaceC54080LKi
    public final void LJ(String str) {
        this.LJLJLLL.LJIIIIZZ(str);
    }

    @Override // X.InterfaceC54080LKi
    public final View LJFF(LCZ lcz) {
        LCY LJFF = this.LJLJLLL.LJFF();
        LCP lcp = new LCP(this.LJLJLJ, tag(), LIZ());
        LJFF.getClass();
        InterfaceC53908LDs interfaceC53908LDs = LJFF.LIZ;
        if (interfaceC53908LDs == null) {
            interfaceC53908LDs = LJFF.LIZ(lcz, lcp);
            LJFF.LIZ = interfaceC53908LDs;
            AbstractC53958LFq LIZIZ = LJFF.LIZIZ();
            if (LIZIZ != null) {
                LIZIZ.LJII(interfaceC53908LDs.getView(), lcp);
            }
        }
        return interfaceC53908LDs.getView();
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!o.LJ(TopTabNode.class, cls)) {
            return false;
        }
        o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.main.assems.tabs.TopTabNode");
        if (TextUtils.equals(tag(), ((AbstractC53895LDf) obj).tag())) {
            return true;
        }
        return false;
    }

    public TopTabNode(Context context, TopTabProtocol topTabProtocol) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(topTabProtocol, "topTabProtocol");
        this.LJLJLJ = context;
        this.LJLJLLL = topTabProtocol;
        topTabProtocol.init(context);
    }

    @Override // com.ss.android.ugc.aweme.TabFragmentNode, X.InterfaceC54080LKi
    public final void LIZJ(String str, String str2) {
        this.LJLJLLL.LJII(str, str2);
    }
}
