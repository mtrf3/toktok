package com.ss.android.ugc.aweme.main.assems.tabs;

import X.AbstractC53895LDf;
import X.C221108m2;
import X.C54117LLt;
import X.C62822Ol8;
import X.InterfaceC53988LGu;
import X.LCZ;
import X.LH4;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol;
import com.ss.android.ugc.aweme.TabFragmentNode;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class BottomTabNode extends TabFragmentNode implements InterfaceC53988LGu {
    public final Context LJLJLJ;
    public final BottomTabProtocol LJLJLLL;
    public final C62822Ol8 LJLL;

    @Override // com.ss.android.ugc.aweme.TabFragmentNode, X.InterfaceC54080LKi
    public final void LIZJ(String str, String str2) {
    }

    @Override // com.ss.android.ugc.aweme.TabFragmentNode, X.InterfaceC54080LKi
    public final void LJ(String str) {
    }

    @Override // X.InterfaceC54080LKi
    public final String LIZ() {
        return this.LJLJLLL.w0(this.LJLJLJ);
    }

    @Override // com.ss.android.ugc.aweme.TabFragmentNode, X.InterfaceC54080LKi
    public final void LIZIZ() {
        this.LJLJLLL.LJFF(this.LJLJLJ);
    }

    @Override // com.ss.android.ugc.aweme.TabFragmentNode, X.InterfaceC54080LKi
    public final void LIZLLL() {
        this.LJLJLLL.LJI(this.LJLJLJ);
    }

    @Override // X.InterfaceC53988LGu
    public final LH4 LJII() {
        return (LH4) this.LJLL.getValue();
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

    public final int hashCode() {
        return tag().hashCode();
    }

    @Override // X.InterfaceC54080LKi
    public final View LJFF(LCZ lcz) {
        LH4 iconData = LJII();
        C54117LLt c54117LLt = (C54117LLt) this.LJLJLLL.LJLIL.getValue();
        c54117LLt.getClass();
        o.LJIIIZ(iconData, "iconData");
        View LIZ = c54117LLt.LIZ(lcz, iconData);
        c54117LLt.LJLIL = LIZ;
        return LIZ;
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
        if (!o.LJ(BottomTabNode.class, cls)) {
            return false;
        }
        o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.main.assems.tabs.BottomTabNode");
        if (TextUtils.equals(tag(), ((AbstractC53895LDf) obj).tag())) {
            return true;
        }
        return false;
    }

    public BottomTabNode(Context context, BottomTabProtocol protocol) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(protocol, "protocol");
        this.LJLJLJ = context;
        this.LJLJLLL = protocol;
        this.LJLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 319));
        protocol.init(context);
    }
}
