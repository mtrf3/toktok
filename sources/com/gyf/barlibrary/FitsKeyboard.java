package com.gyf.barlibrary;

import X.C025107z;
import android.R;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;

/* loaded from: classes11.dex */
public class FitsKeyboard implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int mActionBarHeight;
    public Activity mActivity;
    public View mChildView;
    public View mContentView;
    public View mDecorView;
    public ImmersionBar mImmersionBar;
    public boolean mIsAddListener;
    public int mPaddingBottom;
    public int mPaddingLeft;
    public int mPaddingRight;
    public int mPaddingTop;
    public final int mStatusBarHeight;
    public int mTempKeyboardHeight;
    public Window mWindow;

    public void cancel() {
        if (this.mIsAddListener) {
            this.mDecorView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.mIsAddListener = false;
        }
    }

    public void disable() {
        if (this.mIsAddListener) {
            if (this.mChildView != null) {
                this.mContentView.setPadding(this.mPaddingLeft, this.mPaddingTop, this.mPaddingRight, this.mPaddingBottom);
            } else {
                this.mContentView.setPadding(this.mImmersionBar.getPaddingLeft(), this.mImmersionBar.getPaddingTop(), this.mImmersionBar.getPaddingRight(), this.mImmersionBar.getPaddingBottom());
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        int i;
        ImmersionBar immersionBar = this.mImmersionBar;
        if (immersionBar != null && immersionBar.getBarParams() != null && this.mImmersionBar.getBarParams().keyboardEnable) {
            int navigationBarHeight = ImmersionBar.getNavigationBarHeight(this.mActivity);
            Rect rect = new Rect();
            this.mDecorView.getWindowVisibleDisplayFrame(rect);
            int height = this.mContentView.getHeight() - rect.bottom;
            if (height != this.mTempKeyboardHeight) {
                this.mTempKeyboardHeight = height;
                boolean z = true;
                int i2 = 0;
                if (!ImmersionBar.checkFitsSystemWindows(this.mWindow.getDecorView().findViewById(R.id.content))) {
                    if (this.mChildView != null) {
                        if (this.mImmersionBar.getBarParams().isSupportActionBar) {
                            height += this.mActionBarHeight + this.mStatusBarHeight;
                        }
                        if (this.mImmersionBar.getBarParams().fits) {
                            height += this.mStatusBarHeight;
                        }
                        if (height > navigationBarHeight) {
                            i = this.mPaddingBottom + height;
                        } else {
                            i = 0;
                            z = false;
                        }
                        this.mContentView.setPadding(this.mPaddingLeft, this.mPaddingTop, this.mPaddingRight, i);
                    } else {
                        int paddingBottom = this.mImmersionBar.getPaddingBottom();
                        height -= navigationBarHeight;
                        if (height > navigationBarHeight) {
                            paddingBottom = height + navigationBarHeight;
                        } else {
                            z = false;
                        }
                        this.mContentView.setPadding(this.mImmersionBar.getPaddingLeft(), this.mImmersionBar.getPaddingTop(), this.mImmersionBar.getPaddingRight(), paddingBottom);
                    }
                } else {
                    height -= navigationBarHeight;
                    if (height <= navigationBarHeight) {
                        z = false;
                    }
                }
                if (height >= 0) {
                    i2 = height;
                }
                if (this.mImmersionBar.getBarParams().onKeyboardListener != null) {
                    this.mImmersionBar.getBarParams().onKeyboardListener.onKeyboardChange(z, i2);
                }
            }
        }
    }

    public void enable(int i) {
        this.mWindow.setSoftInputMode(i);
        if (!this.mIsAddListener) {
            this.mDecorView.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.mIsAddListener = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View] */
    public FitsKeyboard(ImmersionBar immersionBar, Activity activity, Window window) {
        this.mImmersionBar = immersionBar;
        this.mActivity = activity;
        this.mWindow = window;
        View decorView = window.getDecorView();
        this.mDecorView = decorView;
        ViewGroup viewGroup = (ViewGroup) decorView.findViewById(R.id.content);
        View childAt = viewGroup.getChildAt(0);
        this.mChildView = childAt;
        if (childAt != null) {
            if (childAt instanceof C025107z) {
                this.mChildView = ((ViewGroup) childAt).getChildAt(0);
            }
            View view = this.mChildView;
            if (view != null) {
                this.mPaddingLeft = view.getPaddingLeft();
                this.mPaddingTop = this.mChildView.getPaddingTop();
                this.mPaddingRight = this.mChildView.getPaddingRight();
                this.mPaddingBottom = this.mChildView.getPaddingBottom();
            }
        }
        ?? r0 = this.mChildView;
        this.mContentView = r0 != 0 ? r0 : viewGroup;
        BarConfig barConfig = new BarConfig(this.mActivity);
        this.mStatusBarHeight = barConfig.getStatusBarHeight();
        this.mActionBarHeight = barConfig.getActionBarHeight();
    }
}
