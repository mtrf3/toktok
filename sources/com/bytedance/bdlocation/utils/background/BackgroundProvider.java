package com.bytedance.bdlocation.utils.background;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public class BackgroundProvider {
    public static boolean mIsInitProvider;
    public List<Callback> mCallback = new ArrayList();
    public volatile boolean isEnterBackground = true;

    /* loaded from: classes12.dex */
    public interface Callback {
        void onAppBackgroundSwitch(boolean z);
    }

    public List<Callback> getCallback() {
        return this.mCallback;
    }

    public boolean isBackground() {
        return this.isEnterBackground;
    }

    public void addCallback(Callback callback) {
        List<Callback> list = this.mCallback;
        if (list != null) {
            list.add(callback);
        }
    }

    public void onAppBackgroundSwitch(boolean z) {
        if (!mIsInitProvider) {
            mIsInitProvider = true;
        }
        this.isEnterBackground = z;
        List<Callback> list = this.mCallback;
        if (list != null && list.size() > 0) {
            for (int i = 0; i < this.mCallback.size(); i++) {
                if (ListProtector.get(this.mCallback, i) != null) {
                    ((Callback) ListProtector.get(this.mCallback, i)).onAppBackgroundSwitch(z);
                }
            }
        }
    }

    public void setCallback(List<Callback> list) {
        if (list != null) {
            this.mCallback = list;
        }
    }
}
