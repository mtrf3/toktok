package com.ss.android.ugc.aweme.friendstab.protocol;

import X.AbstractC53895LDf;
import X.LCZ;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.TabFragmentNode;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class SocialTopTabNode extends TabFragmentNode {
    public final Context LJLJLJ;
    public final ISocialTabProtocol LJLJLLL;

    @Override // X.InterfaceC54080LKi
    public final View LJFF(LCZ lcz) {
        return null;
    }

    @Override // X.InterfaceC54080LKi
    public final String LIZ() {
        return this.LJLJLLL.w0(this.LJLJLJ);
    }

    @Override // com.ss.android.ugc.aweme.TabFragmentNode, X.InterfaceC54080LKi
    public final void LIZIZ() {
        this.LJLJLLL.LIZIZ();
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
        if (!o.LJ(SocialTopTabNode.class, cls)) {
            return false;
        }
        o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.friendstab.protocol.SocialTopTabNode");
        if (TextUtils.equals(tag(), ((AbstractC53895LDf) obj).tag())) {
            return true;
        }
        return false;
    }

    public SocialTopTabNode(Context context, ISocialTabProtocol topTabProtocol) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(topTabProtocol, "topTabProtocol");
        this.LJLJLJ = context;
        this.LJLJLLL = topTabProtocol;
        topTabProtocol.init(context);
    }
}
