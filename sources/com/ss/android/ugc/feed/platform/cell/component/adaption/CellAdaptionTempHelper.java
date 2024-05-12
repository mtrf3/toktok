package com.ss.android.ugc.feed.platform.cell.component.adaption;

import X.C221108m2;
import X.C221138m5;
import X.C223048pA;
import X.C224188r0;
import X.C224238r5;
import X.C224258r7;
import X.C62822Ol8;
import X.KR8;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.OcrLocation;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class CellAdaptionTempHelper implements CellAdaptionComponentAbility {
    public final VideoViewCell LJLIL;
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C224188r0.LJLIL);
    public final C221138m5 LJLJI = KR8.LJIIJJI(new AqS153S0100000_3(this, 1240));

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    public final boolean vH() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    public final boolean yO(boolean z) {
        return false;
    }

    public CellAdaptionTempHelper(VideoViewCell videoViewCell) {
        this.LJLIL = videoViewCell;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    public final C223048pA I60(Context context, Aweme aweme, OcrLocation ocrLocation, ViewGroup viewGroup) {
        C223048pA I60;
        o.LJIIIZ(context, "context");
        if (C224258r7.LIZIZ) {
            CellAdaptionComponentAbility cellAdaptionComponentAbility = (CellAdaptionComponentAbility) this.LJLJI.getValue();
            if (cellAdaptionComponentAbility == null || (I60 = cellAdaptionComponentAbility.I60(context, aweme, ocrLocation, viewGroup)) == null) {
                return new C223048pA(0, 0);
            }
            return I60;
        }
        return ((C224238r5) this.LJLILLLLZI.getValue()).LIZIZ(context, aweme, viewGroup);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    public final void CA(Context context, Aweme aweme, View videoView, OcrLocation ocrLocation, ViewGroup containerView) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(videoView, "videoView");
        o.LJIIIZ(containerView, "containerView");
        if (C224258r7.LIZIZ) {
            CellAdaptionComponentAbility cellAdaptionComponentAbility = (CellAdaptionComponentAbility) this.LJLJI.getValue();
            if (cellAdaptionComponentAbility != null) {
                cellAdaptionComponentAbility.CA(context, aweme, videoView, ocrLocation, containerView);
                return;
            }
            return;
        }
        ((C224238r5) this.LJLILLLLZI.getValue()).LJIIL(context, aweme, videoView, containerView);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    public final void JK(Context context, Aweme aweme, View view, SmartImageView smartImageView, OcrLocation ocrLocation, ViewGroup viewGroup) {
        if (C224258r7.LIZIZ) {
            CellAdaptionComponentAbility cellAdaptionComponentAbility = (CellAdaptionComponentAbility) this.LJLJI.getValue();
            if (cellAdaptionComponentAbility != null) {
                cellAdaptionComponentAbility.JK(context, aweme, view, smartImageView, ocrLocation, viewGroup);
                return;
            }
            return;
        }
        C224238r5 c224238r5 = (C224238r5) this.LJLILLLLZI.getValue();
        c224238r5.LJ = false;
        c224238r5.LIZ(context, aweme, view, smartImageView, viewGroup);
    }
}
