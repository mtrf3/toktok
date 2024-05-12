package com.ss.android.vesdk.algorithm;

import X.EnumC62542cs;

/* loaded from: classes15.dex */
public class VEBaseAlgorithmParam {
    public String mAlgorithmName;
    public int mAlgorithmType;
    public boolean mForInit;

    public VEBaseAlgorithmParam() {
    }

    public String getAlgorithmName() {
        return this.mAlgorithmName;
    }

    public int getAlgorithmType() {
        return this.mAlgorithmType;
    }

    public boolean getForInit() {
        return this.mForInit;
    }

    public EnumC62542cs getUsage() {
        return EnumC62542cs.DEFAULT;
    }

    public void setAlgorithmName(String str) {
        this.mAlgorithmName = str;
    }

    public void setAlgorithmType(int i) {
        this.mAlgorithmType = i;
    }

    public void setForInit(boolean z) {
        this.mForInit = z;
    }

    public VEBaseAlgorithmParam(int i, String str, boolean z) {
        this.mAlgorithmType = i;
        this.mAlgorithmName = str;
        this.mForInit = z;
    }
}
