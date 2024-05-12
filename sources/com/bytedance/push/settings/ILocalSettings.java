package com.bytedance.push.settings;

import X.PTB;
import android.content.Context;

/* loaded from: classes12.dex */
public interface ILocalSettings {
    void registerValChanged(Context context, String str, String str2, PTB ptb);

    void unregisterValChanged(PTB ptb);
}
