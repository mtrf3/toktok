package com.bytedance.android.livesdkapi.host;

import X.C30834C8g;
import X.F6P;
import X.InterfaceC06390Mx;
import X.OSZ;
import android.content.Context;

/* loaded from: classes6.dex */
public interface IHostPlugin extends InterfaceC06390Mx {
    public static final C30834C8g Companion = C30834C8g.LIZ;

    boolean checkPluginInstalled(String str);

    void install(F6P f6p);

    boolean loadLibrary(int i, Context context, String str, String str2, ClassLoader classLoader);

    @Override // X.InterfaceC06390Mx
    /* bridge */ /* synthetic */ void onInit();

    OSZ<Boolean, String> splitCompatInstall(Context context);
}
