package com.byted.cast.sdk.utils;

import X.V0N;
import android.os.Build;

/* loaded from: classes29.dex */
public class CompatibleManager {
    public static final String[] MODEL_LIST_FC_MODE_NEED_UPDATE_IN_TORCH = {"GT-I9260"};
    public static final String[] MODEL_LIST_UNSUPPORTED_TORCH = {"GT-I9260"};
    public STATE mIsNeedUpdateFCModeWithTorch;
    public STATE mIsSupportTorch;

    /* loaded from: classes29.dex */
    public static class CompatibleManagerHolder {
        public static final CompatibleManager instance = new CompatibleManager();
    }

    private STATE _isNeedUpdateFCModeWithTorch() {
        for (String str : MODEL_LIST_FC_MODE_NEED_UPDATE_IN_TORCH) {
            if (str.equalsIgnoreCase(Build.MODEL)) {
                return STATE.YES;
            }
        }
        return STATE.NO;
    }

    private STATE _isSupportTorch() {
        for (String str : MODEL_LIST_UNSUPPORTED_TORCH) {
            if (str.equalsIgnoreCase(Build.MODEL)) {
                return STATE.NO;
            }
        }
        return STATE.YES;
    }

    public boolean isNeedUpdateFCModeWithTorch() {
        if (this.mIsNeedUpdateFCModeWithTorch == STATE.UNKNOWN) {
            this.mIsNeedUpdateFCModeWithTorch = _isNeedUpdateFCModeWithTorch();
        }
        if (this.mIsNeedUpdateFCModeWithTorch == STATE.YES) {
            return true;
        }
        return false;
    }

    public boolean isSupportTorch() {
        if (this.mIsSupportTorch == STATE.UNKNOWN) {
            this.mIsSupportTorch = _isSupportTorch();
        }
        if (this.mIsSupportTorch == STATE.YES) {
            return true;
        }
        return false;
    }

    public CompatibleManager() {
        STATE state = STATE.UNKNOWN;
        this.mIsNeedUpdateFCModeWithTorch = state;
        this.mIsSupportTorch = state;
    }

    public static CompatibleManager getInstance() {
        return CompatibleManagerHolder.instance;
    }

    /* loaded from: classes29.dex */
    public enum STATE {
        UNKNOWN,
        YES,
        NO;

        public static STATE valueOf(String str) {
            return (STATE) V0N.LJJJ(STATE.class, str);
        }
    }
}
