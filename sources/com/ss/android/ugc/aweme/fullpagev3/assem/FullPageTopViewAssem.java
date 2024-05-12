package com.ss.android.ugc.aweme.fullpagev3.assem;

import X.C184357Lj;
import X.C188907bC;
import X.C8VV;
import X.Z9N;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FullPageTopViewAssem extends BaseFullPageAssem {
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String str;
        Context context;
        Aweme aweme;
        List<InteractStickerStruct> interactStickerStructs;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C8VV.LIZJ(this, new AqS134S0200000_3(this, view, 236));
        C8VV.LIZJ(this, new AqS134S0200000_3(this, view, 237));
        C8VV.LIZJ(this, new AqS134S0200000_3(this, view, 238));
        C8VV.LIZJ(this, new AqS134S0200000_3(this, view, 239));
        C8VV.LIZJ(this, new AqS134S0200000_3(this, view, 240));
        C8VV.LIZJ(this, new AqS134S0200000_3(this, view, 229));
        C8VV.LIZJ(this, new AqS134S0200000_3(this, view, 231));
        C8VV.LIZJ(this, new AqS134S0200000_3(this, view, 232));
        if (C188907bC.LIZ() && (aweme = A3().getAweme()) != null && (interactStickerStructs = aweme.getInteractStickerStructs()) != null && (!interactStickerStructs.isEmpty())) {
            C8VV.LIZJ(this, new AqS134S0200000_3(this, view, 234));
        }
        C8VV.LIZJ(this, new AqS134S0200000_3(this, view, 233));
        C8VV.LIZJ(this, new AqS134S0200000_3(this, view, 235));
        FullPageParam fullPageParam = A3();
        o.LJIIIZ(fullPageParam, "fullPageParam");
        Z9N z9n = Z9N.LIZIZ;
        View view2 = null;
        if (z9n.LJJLI()) {
            Aweme aweme2 = fullPageParam.getAweme();
            PostModeDetailParams postModeDetailParams = fullPageParam.getPostModeDetailParams();
            if (postModeDetailParams != null) {
                str = postModeDetailParams.eventType;
            } else {
                str = null;
            }
            if (z9n.LLIIJLIL(aweme2, str) && (context = getContext()) != null) {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
                View view3 = (View) linkedHashMap.get(Integer.valueOf(R.id.hzl));
                if (view3 == null) {
                    View containerView = getContainerView();
                    if (containerView != null && (view3 = containerView.findViewById(R.id.hzl)) != null) {
                        linkedHashMap.put(Integer.valueOf(R.id.hzl), view3);
                    }
                    C184357Lj.LIZ((ViewGroup) view2, context, A3());
                }
                view2 = view3;
                C184357Lj.LIZ((ViewGroup) view2, context, A3());
            }
        }
    }
}
