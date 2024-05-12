package com.ss.android.ugc.aweme.services;

import X.OSZ;
import android.content.Context;

/* loaded from: classes2.dex */
public interface IRessoAnchorService {
    OSZ<Long, Integer> getCopyrightLimitMsUninstalledResso(String str);

    boolean showAnchorUninstalledResso(String str, Context context);
}
