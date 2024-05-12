package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.impl;

import X.C245649kW;
import X.InterfaceC223648q8;
import X.InterfaceC86703Y1b;
import X.Y1E;
import X.Y1Q;
import X.Y1W;
import android.app.Activity;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.common.utility.collection.WeakHandler;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class WidgetOnTouchListener implements View.OnTouchListener, WeakHandler.IHandler {
    public static final int $stable = 8;
    public final Activity activity;
    public final InterfaceC86703Y1b clickHandle;
    public int curType;
    public int doubleTapSlop;
    public C245649kW interactStickerParams;
    public List<Y1W> interactStickers;
    public boolean mAlwaysInBiggerTapRegion;
    public boolean mAlwaysInTapRegion;
    public MotionEvent mCurDownEvent;
    public int mDoubleTapSlopSquare;
    public WeakHandler mHandler;
    public float mInitX;
    public float mInitY;
    public boolean mIsDoubleTap;
    public MotionEvent mPreUpEvent;
    public int mTouchSlopSquare;
    public int touchSlop;
    public InterfaceC223648q8 videoDataGetter;

    public final Activity getActivity() {
        return this.activity;
    }

    public final InterfaceC86703Y1b getClickHandle() {
        return this.clickHandle;
    }

    public final int getCurType() {
        return this.curType;
    }

    public final int getDoubleTapSlop() {
        return this.doubleTapSlop;
    }

    public final C245649kW getInteractStickerParams() {
        return this.interactStickerParams;
    }

    public final List<Y1W> getInteractStickers() {
        return this.interactStickers;
    }

    public final boolean getMAlwaysInBiggerTapRegion() {
        return this.mAlwaysInBiggerTapRegion;
    }

    public final boolean getMAlwaysInTapRegion() {
        return this.mAlwaysInTapRegion;
    }

    public final MotionEvent getMCurDownEvent() {
        return this.mCurDownEvent;
    }

    public final int getMDoubleTapSlopSquare() {
        return this.mDoubleTapSlopSquare;
    }

    public final WeakHandler getMHandler() {
        return this.mHandler;
    }

    public final float getMInitX() {
        return this.mInitX;
    }

    public final float getMInitY() {
        return this.mInitY;
    }

    public final boolean getMIsDoubleTap() {
        return this.mIsDoubleTap;
    }

    public final MotionEvent getMPreUpEvent() {
        return this.mPreUpEvent;
    }

    public final int getMTouchSlopSquare() {
        return this.mTouchSlopSquare;
    }

    public final int getTouchSlop() {
        return this.touchSlop;
    }

    public final InterfaceC223648q8 getVideoDataGetter() {
        return this.videoDataGetter;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        Integer valueOf;
        long j;
        if (message == null || (valueOf = Integer.valueOf(message.what)) == null || valueOf.intValue() != 0) {
            return;
        }
        InterfaceC86703Y1b interfaceC86703Y1b = this.clickHandle;
        InterfaceC223648q8 interfaceC223648q8 = this.videoDataGetter;
        if (interfaceC223648q8 != null) {
            j = interfaceC223648q8.LJZL();
        } else {
            j = 0;
        }
        Object obj = message.obj;
        o.LJII(obj, "null cannot be cast to non-null type android.view.MotionEvent");
        interfaceC86703Y1b.LIZIZ(j, (MotionEvent) obj);
    }

    public final void setCurType(int i) {
        this.curType = i;
    }

    public final void setDoubleTapSlop(int i) {
        this.doubleTapSlop = i;
    }

    public final void setInteractStickerParams(C245649kW c245649kW) {
        this.interactStickerParams = c245649kW;
    }

    public final void setInteractStickers(List<Y1W> list) {
        o.LJIIIZ(list, "<set-?>");
        this.interactStickers = list;
    }

    public final void setMAlwaysInBiggerTapRegion(boolean z) {
        this.mAlwaysInBiggerTapRegion = z;
    }

    public final void setMAlwaysInTapRegion(boolean z) {
        this.mAlwaysInTapRegion = z;
    }

    public final void setMCurDownEvent(MotionEvent motionEvent) {
        this.mCurDownEvent = motionEvent;
    }

    public final void setMDoubleTapSlopSquare(int i) {
        this.mDoubleTapSlopSquare = i;
    }

    public final void setMHandler(WeakHandler weakHandler) {
        this.mHandler = weakHandler;
    }

    public final void setMInitX(float f) {
        this.mInitX = f;
    }

    public final void setMInitY(float f) {
        this.mInitY = f;
    }

    public final void setMIsDoubleTap(boolean z) {
        this.mIsDoubleTap = z;
    }

    public final void setMPreUpEvent(MotionEvent motionEvent) {
        this.mPreUpEvent = motionEvent;
    }

    public final void setMTouchSlopSquare(int i) {
        this.mTouchSlopSquare = i;
    }

    public final void setTouchSlop(int i) {
        this.touchSlop = i;
    }

    public final void setVideoDataGetter(InterfaceC223648q8 interfaceC223648q8) {
        this.videoDataGetter = interfaceC223648q8;
    }

    public final void updateInteractStickers(List<Y1W> interactStickers) {
        o.LJIIIZ(interactStickers, "interactStickers");
        this.interactStickers = interactStickers;
    }

    private final boolean isConsideredSingleTap(MotionEvent motionEvent, MotionEvent motionEvent2) {
        if (motionEvent == null || motionEvent2 == null) {
            return false;
        }
        return this.mAlwaysInTapRegion;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        WeakHandler weakHandler;
        Message obtainMessage;
        long j;
        long j2;
        Y1Q y1q;
        WeakHandler weakHandler2;
        Integer num = null;
        if (motionEvent != null) {
            num = Integer.valueOf(motionEvent.getAction());
        }
        long j3 = 0;
        if (num != null) {
            if (num.intValue() == 0) {
                WeakHandler weakHandler3 = this.mHandler;
                if (weakHandler3 != null && weakHandler3.hasMessages(0) && (weakHandler2 = this.mHandler) != null) {
                    weakHandler2.removeMessages(0);
                }
                MotionEvent motionEvent2 = this.mCurDownEvent;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                this.mCurDownEvent = MotionEvent.obtain(motionEvent);
                this.mAlwaysInTapRegion = true;
                this.mAlwaysInBiggerTapRegion = true;
                this.mInitX = motionEvent.getX();
                this.mInitY = motionEvent.getY();
                this.curType = -1;
                for (Y1W y1w : this.interactStickers) {
                    Y1E y1e = y1w.LIZJ;
                    InterfaceC223648q8 interfaceC223648q8 = this.videoDataGetter;
                    if (interfaceC223648q8 != null) {
                        j2 = interfaceC223648q8.LJZL();
                    } else {
                        j2 = 0;
                    }
                    if (y1e.LJIIJJI(j2, motionEvent.getX(), motionEvent.getY(), y1w.LIZJ.getStickerType())) {
                        this.curType = y1w.LIZJ.getStickerType();
                        C245649kW c245649kW = this.interactStickerParams;
                        if (c245649kW != null && (y1q = c245649kW.LJIILJJIL) != null) {
                            y1w.LIZJ.getStickerType();
                            y1q.LIZJ(motionEvent);
                        }
                        if (!y1w.LIZJ.LJIIJ()) {
                            return true;
                        }
                    }
                }
                return false;
            }
            if (num.intValue() == 2) {
                int x = (int) (motionEvent.getX() - this.mInitX);
                int y = (int) (motionEvent.getY() - this.mInitY);
                int i = (y * y) + (x * x);
                if (i > this.mTouchSlopSquare || Math.abs(x) >= this.touchSlop) {
                    this.mAlwaysInTapRegion = false;
                    WeakHandler weakHandler4 = this.mHandler;
                    if (weakHandler4 != null) {
                        weakHandler4.removeMessages(0);
                    }
                }
                if (i > this.mDoubleTapSlopSquare) {
                    this.mAlwaysInBiggerTapRegion = false;
                }
            } else if (num.intValue() == 1 && this.mAlwaysInTapRegion) {
                this.mIsDoubleTap = false;
                if (isConsideredDoubleTap(this.mCurDownEvent, this.mPreUpEvent, motionEvent)) {
                    this.mIsDoubleTap = true;
                    InterfaceC86703Y1b interfaceC86703Y1b = this.clickHandle;
                    InterfaceC223648q8 interfaceC223648q82 = this.videoDataGetter;
                    if (interfaceC223648q82 != null) {
                        j = interfaceC223648q82.LJZL();
                    } else {
                        j = 0;
                    }
                    interfaceC86703Y1b.LJFF(j, this.curType, this.mCurDownEvent);
                }
                if (!this.mIsDoubleTap && isConsideredSingleTap(this.mCurDownEvent, motionEvent) && (weakHandler = this.mHandler) != null && (obtainMessage = weakHandler.obtainMessage(0)) != null) {
                    obtainMessage.obj = this.mCurDownEvent;
                    WeakHandler weakHandler5 = this.mHandler;
                    if (weakHandler5 != null) {
                        long doubleTapTimeout = ViewConfiguration.getDoubleTapTimeout() - motionEvent.getEventTime();
                        MotionEvent motionEvent3 = this.mCurDownEvent;
                        if (motionEvent3 != null) {
                            j3 = motionEvent3.getEventTime();
                        }
                        weakHandler5.sendMessageDelayed(obtainMessage, doubleTapTimeout + j3);
                    }
                }
                MotionEvent motionEvent4 = this.mPreUpEvent;
                if (motionEvent4 != null) {
                    motionEvent4.recycle();
                }
                this.mPreUpEvent = MotionEvent.obtain(motionEvent);
            }
        }
        return false;
    }

    private final boolean isConsideredDoubleTap(MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3) {
        if (motionEvent == null || motionEvent2 == null || motionEvent3 == null || !this.mAlwaysInBiggerTapRegion) {
            return false;
        }
        long eventTime = motionEvent3.getEventTime() - motionEvent2.getEventTime();
        if (eventTime > ViewConfiguration.getDoubleTapTimeout() || eventTime < 40) {
            return false;
        }
        int x = ((int) motionEvent.getX()) - ((int) motionEvent3.getX());
        int y = ((int) motionEvent.getY()) - ((int) motionEvent3.getY());
        if ((y * y) + (x * x) >= this.mDoubleTapSlopSquare) {
            return false;
        }
        return true;
    }

    public WidgetOnTouchListener(Activity activity, List<Y1W> interactStickers, C245649kW c245649kW, InterfaceC223648q8 interfaceC223648q8, InterfaceC86703Y1b clickHandle) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(interactStickers, "interactStickers");
        o.LJIIIZ(clickHandle, "clickHandle");
        this.activity = activity;
        this.interactStickers = interactStickers;
        this.interactStickerParams = c245649kW;
        this.videoDataGetter = interfaceC223648q8;
        this.clickHandle = clickHandle;
        this.doubleTapSlop = ViewConfiguration.get(activity).getScaledDoubleTapSlop();
        int scaledTouchSlop = ViewConfiguration.get(activity).getScaledTouchSlop() * 3;
        this.touchSlop = scaledTouchSlop;
        this.mTouchSlopSquare = scaledTouchSlop * scaledTouchSlop;
        int i = this.doubleTapSlop;
        this.mDoubleTapSlopSquare = i * i;
        this.curType = -1;
        this.mHandler = new WeakHandler(this);
    }
}
