package X;

import Y.ALAdapterS11S0100000_14;
import Y.AUListenerS74S0101000_14;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import kotlin.jvm.internal.o;

/* renamed from: X.Wac, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C82554Wac extends VWL {
    public static final /* synthetic */ int LJLLI = 0;
    public float LJLILLLLZI;
    public float LJLJI;
    public int LJLJJI;
    public boolean LJLJJL;
    public float LJLJJLL;
    public boolean LJLJL;
    public float LJLJLJ;
    public boolean LJLJLLL;
    public InterfaceC82570Was LJLL;

    public final boolean LIZ(MotionEvent motionEvent) {
        if (this.LJLJJI == 0 && motionEvent.getX() > this.LJLJJLL) {
            return true;
        }
        if (getAdapter() != null && this.LJLJJI == getAdapter().getCount() - 1 && motionEvent.getX() < this.LJLJJLL) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        double abs;
        int abs2;
        float rawX;
        char c = 0;
        float f = 0.0f;
        if (motionEvent.getAction() == 0) {
            this.LJLILLLLZI = motionEvent.getX();
            this.LJLJI = motionEvent.getY();
            EnumC82563Wal state = EnumC82563Wal.START;
            EnumC82565Wan producer = EnumC82565Wan.MAIN_TEMPLATE;
            o.LJIIIZ(state, "state");
            o.LJIIIZ(producer, "producer");
            C2U8.LIZ(new C82562Wak(state, producer, 0, 0.0f));
        } else {
            char c2 = 1;
            if (motionEvent.getAction() == 1 && this.LJLJLLL) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (Math.abs(x - this.LJLILLLLZI) > 60.0f || Math.abs(y - this.LJLJI) > 60.0f) {
                    super.dispatchTouchEvent(motionEvent);
                } else {
                    int childCount = getChildCount();
                    int currentItem = getCurrentItem();
                    int[] iArr = new int[2];
                    int i = 0;
                    while (true) {
                        if (i >= childCount) {
                            break;
                        }
                        View childAt = getChildAt(i);
                        int intValue = ((Integer) childAt.getTag()).intValue();
                        childAt.getLocationOnScreen(iArr);
                        int i2 = iArr[c];
                        int i3 = iArr[c2];
                        int width = childAt.getWidth() + i2;
                        int height = childAt.getHeight() + iArr[c2];
                        if (intValue < currentItem) {
                            width = (int) (width - (((childAt.getWidth() * Math.abs(f)) * 0.5d) + ((childAt.getWidth() * 0.100000024f) * 0.5d)));
                            abs = i2 - (((Math.abs(0.0f) * childAt.getWidth()) * 0.5d) + ((childAt.getWidth() * 0.100000024f) * 0.5d));
                        } else if (intValue == currentItem) {
                            abs2 = (int) ((Math.abs(0.0f) * childAt.getWidth()) + i2);
                            rawX = motionEvent.getRawX();
                            float rawY = motionEvent.getRawY();
                            if (rawX <= abs2 && rawX < width && rawY > i3 && rawY < height) {
                                int intValue2 = ((Integer) childAt.getTag()).intValue();
                                if (getCurrentItem() != intValue2) {
                                    setCurrentItem(intValue2, true);
                                }
                            } else {
                                i++;
                                c = 0;
                                f = 0.0f;
                                c2 = 1;
                            }
                        } else {
                            width = (int) (width - ((Math.abs(0.0f) * childAt.getWidth()) * 0.5d));
                            abs = i2 - ((Math.abs(0.0f) * childAt.getWidth()) * 0.5d);
                        }
                        abs2 = (int) abs;
                        rawX = motionEvent.getRawX();
                        float rawY2 = motionEvent.getRawY();
                        if (rawX <= abs2) {
                        }
                        i++;
                        c = 0;
                        f = 0.0f;
                        c2 = 1;
                    }
                    super.dispatchTouchEvent(motionEvent);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // X.VWL, androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 2 && LIZ(motionEvent)) {
                return true;
            }
        } else {
            this.LJLJJLL = motionEvent.getX();
            this.LJLJJI = getCurrentItem();
            this.LJLJLJ = getTranslationX();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // X.VWL, androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C82547WaV c82547WaV;
        int i;
        if (this.LJLJL || getAdapter() == null) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action != 1) {
            if (action == 2 && LIZ(motionEvent)) {
                float x = motionEvent.getX();
                float f = x - this.LJLJJLL;
                if (Math.abs(f) > 4.0f) {
                    this.LJLJJL = true;
                    float translationX = (f * 0.45f) + getTranslationX();
                    InterfaceC82570Was interfaceC82570Was = this.LJLL;
                    if (interfaceC82570Was != null) {
                        C82567Wap c82567Wap = (C82567Wap) interfaceC82570Was;
                        C82553Wab c82553Wab = c82567Wap.LIZ;
                        if (c82553Wab.LLD == 0 && (c82547WaV = (C82547WaV) c82553Wab.LJZL.LJJIIZI(0)) != null) {
                            C82553Wab c82553Wab2 = c82567Wap.LIZ;
                            ViewGroup viewGroup = c82547WaV.LJLJL;
                            if (viewGroup != null) {
                                i = viewGroup.getMeasuredWidth();
                            } else {
                                i = 0;
                            }
                            c82553Wab2.LLD = i;
                        }
                        if (c82567Wap.LIZ.LLD > 0 && translationX < 0.0f) {
                            float abs = Math.abs(translationX);
                            TextView textView = c82567Wap.LIZ.LJLIL;
                            float f2 = 1.0f - ((abs / r1.LLD) * 2.0f);
                            textView.setAlpha(f2);
                            c82567Wap.LIZ.LJLILLLLZI.setAlpha(f2);
                        }
                    }
                    setTranslationX(translationX);
                    this.LJLJJLL = x;
                }
            }
        } else {
            if (getTranslationX() != this.LJLJLJ && this.LJLJJL) {
                ValueAnimator duration = ValueAnimator.ofFloat(getTranslationX(), this.LJLJLJ).setDuration(200L);
                duration.addUpdateListener(new AUListenerS74S0101000_14(1, this, 1));
                duration.addListener(new ALAdapterS11S0100000_14(this, 24));
                duration.start();
                this.LJLJL = true;
            }
            this.LJLJJL = false;
        }
        if (this.LJLJJL || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setBounceScrollListener(InterfaceC82570Was interfaceC82570Was) {
        this.LJLL = interfaceC82570Was;
    }

    public void setHandleClickChange(boolean z) {
        this.LJLJLLL = z;
    }

    public C82554Wac(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLJLLL = true;
    }
}
