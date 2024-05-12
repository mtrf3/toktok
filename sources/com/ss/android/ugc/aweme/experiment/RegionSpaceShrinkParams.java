package com.ss.android.ugc.aweme.experiment;

import X.InterfaceC65349Pkn;

/* loaded from: classes16.dex */
public class RegionSpaceShrinkParams {

    @InterfaceC65349Pkn("enable")
    public boolean enable;

    @InterfaceC65349Pkn("firstDelay")
    public int firstDelay = -1;

    @InterfaceC65349Pkn("periodOfCheck")
    public int periodOfCheck = -1;

    @InterfaceC65349Pkn("periodOfShrink")
    public float periodOfShrink = 0.65f;

    @InterfaceC65349Pkn("periodOfLessMemoryUsage")
    public float periodOfLessMemoryUsage = 0.45f;

    @InterfaceC65349Pkn("shrinkStep")
    public int shrinkStep = 125;

    @InterfaceC65349Pkn("lowerLimit")
    public int lowerLimit = 384;
}
