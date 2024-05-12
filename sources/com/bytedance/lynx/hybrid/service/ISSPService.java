package com.bytedance.lynx.hybrid.service;

import X.AbstractC60673NrZ;
import X.C60737Nsb;
import X.InterfaceC61488OBg;
import android.content.Context;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;

/* loaded from: classes7.dex */
public interface ISSPService extends InterfaceC61488OBg {
    AbstractC60673NrZ bootSSPLifecycle(Context context, C60737Nsb c60737Nsb, HybridSchemaParam hybridSchemaParam);

    /* synthetic */ String getBid();

    @Override // X.InterfaceC61488OBg
    /* synthetic */ void onRegister(String str);

    @Override // X.InterfaceC61488OBg
    /* synthetic */ void onUnRegister();
}
