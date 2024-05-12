package com.ss.android.ugc.aweme.nows.service;

import X.C201167uy;
import X.C210188Ms;
import X.EE1;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.nows.cache.PreloadNowFeedTask;
import com.ss.android.ugc.aweme.service.INowFeedPreLoadService;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowFeedPreLoadServiceImpl implements INowFeedPreLoadService {
    @Override // com.ss.android.ugc.aweme.service.INowFeedPreLoadService
    public final EE1 LIZ() {
        if (C201167uy.LIZ) {
            return new PreloadNowFeedTask();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.service.INowFeedPreLoadService
    public final View LIZIZ(Context context, int i, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        o.LJIIIZ(context, "context");
        return C210188Ms.LIZIZ(context, i, viewGroup, false, layoutInflater);
    }
}
