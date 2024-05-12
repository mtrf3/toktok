package com.ss.android.ugc.aweme.services;

import android.content.Context;

/* loaded from: classes8.dex */
public interface ISDKService {

    /* loaded from: classes8.dex */
    public interface SplitCallback {

        /* loaded from: classes8.dex */
        public static final class DefaultImpls {
            public static boolean checkIsCanceled(SplitCallback splitCallback) {
                return false;
            }
        }

        boolean checkIsCanceled();

        void onFail();

        void onSuccess(int i, int i2);
    }

    void split(Context context, int i, String str, String str2, String str3, String str4, SplitCallback splitCallback);
}
