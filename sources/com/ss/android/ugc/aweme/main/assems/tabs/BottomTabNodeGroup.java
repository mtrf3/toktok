package com.ss.android.ugc.aweme.main.assems.tabs;

import X.AbstractC38911fr;
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
import com.ss.android.ugc.aweme.TabFragmentGroup;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class BottomTabNodeGroup extends TabFragmentGroup implements InterfaceC53988LGu {
    public final Context LJLLJ;
    public final BottomTabProtocol LJLLL;
    public final C62822Ol8 LJLLLL;

    @Override // com.ss.android.ugc.aweme.TabFragmentGroup, X.InterfaceC54080LKi
    public final void LIZJ(String str, String str2) {
    }

    @Override // X.InterfaceC54080LKi
    public final String LIZ() {
        return this.LJLLL.w0(this.LJLLJ);
    }

    @Override // com.ss.android.ugc.aweme.TabFragmentGroup, X.InterfaceC54080LKi
    public final void LIZIZ() {
        this.LJLLL.LJFF(this.LJLLJ);
    }

    @Override // com.ss.android.ugc.aweme.TabFragmentGroup, X.InterfaceC54080LKi
    public final void LIZLLL() {
        this.LJLLL.LJI(this.LJLLJ);
    }

    @Override // X.InterfaceC53988LGu
    public final LH4 LJII() {
        return (LH4) this.LJLLLL.getValue();
    }

    @Override // X.AbstractC53895LDf
    public final Bundle LJIIIZ() {
        return this.LJLLL.d(this.LJLLJ);
    }

    @Override // X.AbstractC53895LDf
    public final Class<? extends Fragment> LJIIJ() {
        return this.LJLLL.LJJJJZI();
    }

    @Override // X.AbstractC53895LDf
    public final String LJIIL() {
        return this.LJLLL.LJIIIZ();
    }

    @Override // X.AbstractC53892LDc
    public final boolean LJIJI() {
        AbstractC38911fr LJ = this.LJLLL.LJ();
        if (LJ != null) {
            return LJ.LJIILLIIL();
        }
        "tagGroup in protocol is null".toString();
        throw new IllegalArgumentException("tagGroup in protocol is null");
    }

    @Override // X.AbstractC53895LDf
    public final String tag() {
        return this.LJLLL.getTag();
    }

    public final int hashCode() {
        return tag().hashCode();
    }

    @Override // X.InterfaceC54080LKi
    public final View LJFF(LCZ lcz) {
        LH4 iconData = LJII();
        C54117LLt c54117LLt = (C54117LLt) this.LJLLL.LJLIL.getValue();
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
        if (!o.LJ(BottomTabNodeGroup.class, cls)) {
            return false;
        }
        o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.main.assems.tabs.BottomTabNodeGroup");
        if (TextUtils.equals(tag(), ((AbstractC53895LDf) obj).tag())) {
            return true;
        }
        return false;
    }

    public BottomTabNodeGroup(Context context, BottomTabProtocol protocol) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(protocol, "protocol");
        this.LJLLJ = context;
        this.LJLLL = protocol;
        this.LJLLLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 320));
        protocol.init(context);
        AbstractC38911fr LJ = protocol.LJ();
        if (LJ != null) {
            for (AbstractC53895LDf abstractC53895LDf : LJ.LJIILJJIL(context)) {
                o.LJII(abstractC53895LDf, "null cannot be cast to non-null type com.bytedance.hox.HoxNode");
                LJIILLIIL(abstractC53895LDf);
            }
            return;
        }
        "tagGroup in protocol is null".toString();
        throw new IllegalArgumentException("tagGroup in protocol is null");
    }

    @Override // X.AbstractC53892LDc
    public final void LJJ(Bundle bundle, String tag) {
        o.LJIIIZ(tag, "tag");
        AbstractC38911fr LJ = this.LJLLL.LJ();
        if (LJ != null) {
            LJ.LJJJ(this.LJLLJ, tag, bundle);
        } else {
            "tagGroup in protocol is null".toString();
            throw new IllegalArgumentException("tagGroup in protocol is null");
        }
    }
}
