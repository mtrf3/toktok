package com.ss.android.ugc.aweme.discover.helper;

import X.C012403c;
import X.C03880Dg;
import X.C16880lQ;
import X.C39519Ff9;
import X.C65300Pk0;
import X.OH2;
import Y.IDTListenerS119S0100000_10;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.common.utility.collection.WeakHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes11.dex */
public class ViewPagerSwitchHelper implements WeakHandler.IHandler {
    public final boolean isRtl;
    public long mDuration;
    public boolean mEnableAutoScroll;
    public Handler mHandler;
    public boolean mIsAutoSwitching;
    public Method mMethod;
    public View.OnTouchListener mTouchListener;
    public ViewPager mViewPager;
    public int realCount;

    public static Object com_ss_android_ugc_aweme_discover_helper_ViewPagerSwitchHelper_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "3943460521751782046"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
    }

    public void nextPage() {
        int i;
        if (!this.mIsAutoSwitching) {
            this.mHandler.removeCallbacksAndMessages(null);
            return;
        }
        int currentItem = this.mViewPager.getCurrentItem();
        if (this.isRtl) {
            i = -1;
        } else {
            i = 1;
        }
        int i2 = currentItem + i;
        if (i2 < 0) {
            i2 += this.realCount;
        }
        Method method = this.mMethod;
        if (method != null) {
            try {
                ViewPager viewPager = this.mViewPager;
                Boolean bool = Boolean.TRUE;
                com_ss_android_ugc_aweme_discover_helper_ViewPagerSwitchHelper_java_lang_reflect_Method_invoke(method, viewPager, new Object[]{Integer.valueOf(i2), bool, bool, 1});
                return;
            } catch (IllegalAccessException e) {
                C16880lQ.LLLLIIL(e);
            } catch (InvocationTargetException e2) {
                C16880lQ.LLLLIIL(e2);
            }
        }
        this.mViewPager.setCurrentItem(i2, true);
    }

    public void startAutoSwitch() {
        if (this.mIsAutoSwitching) {
            return;
        }
        this.mIsAutoSwitching = true;
        this.mHandler.removeCallbacksAndMessages(null);
        this.mHandler.postDelayed(new OH2(this, this.mDuration), this.mDuration);
    }

    public void stopAutoSwitch() {
        if (!this.mIsAutoSwitching) {
            return;
        }
        this.mIsAutoSwitching = false;
        this.mHandler.removeCallbacksAndMessages(null);
    }

    public ViewPagerSwitchHelper(ViewPager viewPager) {
        this(viewPager, 5000L);
    }

    public static boolean isRTL(Context context) {
        if (context == null || C012403c.LIZ(context) != 1) {
            return false;
        }
        return true;
    }

    public void enableAutoScroll(boolean z) {
        this.mEnableAutoScroll = z;
    }

    public void setRealCount(int i) {
        this.realCount = i;
    }

    public ViewPagerSwitchHelper(ViewPager viewPager, long j) {
        this.mEnableAutoScroll = true;
        this.mTouchListener = new IDTListenerS119S0100000_10(this, 3);
        this.mViewPager = viewPager;
        this.mDuration = j;
        this.mHandler = new WeakHandler(this);
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Method declaredMethod = ViewPager.class.getDeclaredMethod("setCurrentItemInternal", cls, cls2, cls2, cls);
            this.mMethod = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException e) {
            C16880lQ.LLLLIIL(e);
        }
        viewPager.setOnTouchListener(this.mTouchListener);
        this.isRtl = isRTL(viewPager.getContext());
    }
}
