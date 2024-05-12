package com.ss.android.ugc.aweme.servicimpl;

import X.C77275UUl;
import android.app.Activity;
import com.ss.android.ugc.aweme.IAutoCutService;
import com.ss.android.ugc.aweme.adaptation.saa.SAAActivity;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity;
import java.util.Set;

/* loaded from: classes7.dex */
public final class AutoCutServiceImpl implements IAutoCutService {
    @Override // com.ss.android.ugc.aweme.IAutoCutService
    public final Set<Class<? extends Activity>> LIZ() {
        return C77275UUl.LJIIIIZZ(SAAActivity.class, VideoPublishActivity.class);
    }
}
