package com.ss.android.ugc.aweme.share.screenshot.strategy;

import X.C65776Prg;
import X.EnumC62261Oc5;
import X.InterfaceC62225ObV;
import X.InterfaceC62264Oc8;
import X.InterfaceC99233ux;
import android.content.Context;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;

/* loaded from: classes11.dex */
public abstract class ScreenshotShareStrategy<T extends SharePackage> implements InterfaceC99233ux {
    public abstract boolean LIZ(InterfaceC62225ObV interfaceC62225ObV, SharePackage sharePackage);

    public abstract boolean LIZJ(InterfaceC62225ObV interfaceC62225ObV, String str, int i);

    public abstract boolean LIZLLL(InterfaceC62225ObV interfaceC62225ObV, String str, int i);

    public abstract boolean LJ(InterfaceC62225ObV interfaceC62225ObV, Context context, SharePackage sharePackage, InterfaceC62264Oc8 interfaceC62264Oc8);

    public abstract C65776Prg LJFF();

    public abstract EnumC62261Oc5 LJI();

    public abstract String LJII(InterfaceC62225ObV interfaceC62225ObV, SharePackage sharePackage);
}
