package com.ss.android.ugc.aweme.shortvideo.ui;

import X.GBR;
import X.X1D;
import android.app.Activity;
import android.os.Bundle;
import com.ss.android.ugc.aweme.adaptation.AbsSceneAdaptationScene;
import com.ss.android.ugc.aweme.adaptation.saa.SAAService;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import java.util.UUID;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public abstract class TikTokPublishGroupScene extends AbsSceneAdaptationScene {
    public final String LJLJJL;
    public TikTokPublishGroupSceneFragment LJLJJLL;

    public final boolean LLLF() {
        if (this.mParentScene != null) {
            return true;
        }
        return false;
    }

    public final TikTokPublishGroupSceneFragment LLLFF() {
        TikTokPublishGroupSceneFragment tikTokPublishGroupSceneFragment = this.LJLJJLL;
        if (tikTokPublishGroupSceneFragment != null) {
            return tikTokPublishGroupSceneFragment;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Scene ");
        LIZ.append(this);
        LIZ.append(" not attached to a context.");
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }

    public TikTokPublishGroupScene() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TikTokPublishGroupScene#");
        LIZ.append(getClass().getName());
        LIZ.append('#');
        LIZ.append(UUID.randomUUID());
        this.LJLJJL = X1D.LIZIZ(LIZ);
        LLJLLIL(GBR.LJLIL);
    }

    @Override // X.AbstractC42651GoZ, X.AbstractC147255qD, X.WM7
    public void onDestroyView() {
        super.onDestroyView();
        TikTokPublishGroupSceneFragment tikTokPublishGroupSceneFragment = this.LJLJJLL;
        if (tikTokPublishGroupSceneFragment != null) {
            ICreativeSAAService LIZ = SAAService.LIZ();
            Activity requireActivity = requireActivity();
            o.LJIIIIZZ(requireActivity, "requireActivity()");
            LIZ.invokeMethodsSafely(requireActivity, new AqS154S0200000_7(this, tikTokPublishGroupSceneFragment, 41));
        }
    }

    @Override // com.ss.android.ugc.aweme.adaptation.AbsSceneAdaptationScene, X.AbstractC42651GoZ, X.WM7
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        ICreativeSAAService LIZ = SAAService.LIZ();
        Activity requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        LIZ.invokeMethodsSafely(requireActivity, new AqS157S0100000_7(this, 299));
    }
}
