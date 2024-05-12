package com.ss.android.ugc.feed.platform.cell.component.adaption;

import X.C223048pA;
import X.C2K0;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.OcrLocation;

/* loaded from: classes4.dex */
public interface CellAdaptionComponentAbility extends C2K0 {
    void CA(Context context, Aweme aweme, View view, OcrLocation ocrLocation, ViewGroup viewGroup);

    C223048pA I60(Context context, Aweme aweme, OcrLocation ocrLocation, ViewGroup viewGroup);

    void JK(Context context, Aweme aweme, View view, SmartImageView smartImageView, OcrLocation ocrLocation, ViewGroup viewGroup);

    boolean vH();

    boolean yO(boolean z);
}
