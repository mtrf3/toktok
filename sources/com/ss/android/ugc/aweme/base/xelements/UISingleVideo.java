package com.ss.android.ugc.aweme.base.xelements;

import X.AbstractC79989VaL;
import X.C51576KMa;
import X.VNU;
import android.content.Context;
import android.view.View;
import com.bytedance.ies.xelement.LynxVideoManager;
import kotlin.jvm.internal.IDqS433S0100000_8;

/* loaded from: classes9.dex */
public final class UISingleVideo extends LynxVideoManager {
    public UISingleVideo(VNU vnu) {
        super(vnu);
    }

    @Override // com.bytedance.ies.xelement.LynxVideoManager
    /* renamed from: LJIJJLI */
    public final AbstractC79989VaL createView(Context context) {
        if (context != null) {
            C51576KMa c51576KMa = new C51576KMa(context);
            c51576KMa.setStateChangeReporter(new IDqS433S0100000_8(this, 4));
            return c51576KMa;
        }
        "Required context must be non-null".toString();
        throw new IllegalArgumentException("Required context must be non-null");
    }

    @Override // com.bytedance.ies.xelement.LynxVideoManager, com.lynx.tasm.behavior.ui.LynxUI
    public final /* bridge */ /* synthetic */ View createView(Context context) {
        return createView(context);
    }
}
