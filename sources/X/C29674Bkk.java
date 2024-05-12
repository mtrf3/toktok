package X;

import Y.IDCListenerS254S0100000_5;
import Y.IDcS170S0100000_5;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.chatroom.api.TimerDetail;
import com.bytedance.android.livesdk.dataChannel.HideTitleLayoutEvent;
import com.bytedance.android.livesdk.impl.revenue.subscription.widget.SubscribeTimeStickerWidget;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.Bkk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29674Bkk extends ConstraintLayout {
    public boolean LJLIL;
    public SubscribeTimeStickerWidget LJLILLLLZI;
    public View LJLJI;
    public boolean LJLJJI;
    public TextView LJLJJL;
    public View LJLJJLL;
    public View LJLJL;
    public View LJLJLJ;
    public View LJLJLLL;
    public final int[] LJLL;
    public int LJLLI;
    public final int[] LJLLILLLL;
    public final int[] LJLLJ;
    public final Rect LJLLL;
    public final Rect LJLLLL;
    public boolean LJLLLLLL;
    public final int LJLZ;
    public float LJZ;
    public float LJZI;
    public float LJZL;
    public float LL;
    public final int LLD;
    public boolean LLF;
    public boolean LLFF;

    public final boolean LJJZ() {
        View view = this.LJLJI;
        if (view == null) {
            return false;
        }
        view.getLocationOnScreen(this.LJLLJ);
        Rect rect = this.LJLLL;
        int[] iArr = this.LJLLJ;
        int i = iArr[0];
        rect.left = i;
        rect.top = iArr[1];
        rect.right = view.getMeasuredWidth() + i;
        rect.bottom = view.getMeasuredHeight() + rect.top;
        this.LJLLL.offset(0, view.getMeasuredHeight() / 100);
        View view2 = this.LJLJL;
        if (view2 != null) {
            view2.getLocationOnScreen(this.LJLLILLLL);
            View view3 = this.LJLJL;
            if (view3 != null) {
                Rect rect2 = this.LJLLLL;
                int[] iArr2 = this.LJLLILLLL;
                int i2 = iArr2[0];
                rect2.left = i2;
                rect2.top = iArr2[1];
                rect2.right = view3.getMeasuredWidth() + i2;
                rect2.bottom = view3.getMeasuredHeight() + rect2.top;
                return this.LJLLL.intersect(this.LJLLLL);
            }
            o.LJIJI("deleteRegionV");
            throw null;
        }
        o.LJIJI("deleteRegionV");
        throw null;
    }

    public final void LJJZZI() {
        this.LL = -1.0f;
        this.LJZL = -1.0f;
        this.LJZI = -1.0f;
        this.LJZ = -1.0f;
        this.LJLJJI = false;
        this.LLF = false;
        this.LLFF = false;
    }

    public final int getDeleteRegionVBottom() {
        View view = this.LJLJL;
        if (view != null) {
            return view.getBottom();
        }
        o.LJIJI("deleteRegionV");
        throw null;
    }

    public final View getStickerView() {
        return this.LJLJI;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLJLI(boolean r8) {
        /*
            r7 = this;
            android.view.View r3 = r7.LJLJI
            if (r3 == 0) goto L4b
            float r2 = r3.getX()
            int[] r0 = r7.LJLL
            r6 = 2
            r0 = r0[r6]
            float r1 = (float) r0
            r5 = 1
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 >= 0) goto L63
            r3.setX(r1)
        L16:
            r8 = 1
        L17:
            int r4 = r3.getMeasuredHeight()
            float r2 = r3.getY()
            int r0 = r7.LJLLI
            float r1 = (float) r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 >= 0) goto L4c
            r3.setY(r1)
        L29:
            float r1 = r3.getX()
            int r0 = r3.getMeasuredWidth()
            int r0 = r0 / r6
            float r0 = (float) r0
            float r1 = r1 + r0
            int r4 = (int) r1
            float r1 = r3.getY()
            int r0 = r3.getMeasuredHeight()
            int r0 = r0 / r6
            float r0 = (float) r0
            float r1 = r1 + r0
            int r2 = (int) r1
            if (r5 == 0) goto L4b
            com.bytedance.android.livesdk.impl.revenue.subscription.widget.SubscribeTimeStickerWidget r1 = r7.LJLILLLLZI
            if (r1 == 0) goto L4b
            r0 = 0
            r1.LLFF(r4, r2, r0)
        L4b:
            return
        L4c:
            float r2 = r3.getY()
            float r0 = (float) r4
            float r2 = r2 + r0
            int[] r0 = r7.LJLL
            r1 = r0[r5]
            float r0 = (float) r1
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L61
            int r1 = r1 - r4
            float r0 = (float) r1
            r3.setY(r0)
            goto L29
        L61:
            r5 = r8
            goto L29
        L63:
            float r2 = r3.getX()
            int r0 = r3.getMeasuredWidth()
            float r0 = (float) r0
            float r2 = r2 + r0
            int[] r1 = r7.LJLL
            r0 = 3
            r1 = r1[r0]
            float r0 = (float) r1
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L17
            int r0 = r3.getMeasuredWidth()
            int r1 = r1 - r0
            float r0 = (float) r1
            r3.setX(r0)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29674Bkk.LJJLJLI(boolean):void");
    }

    public final void LJJLL(boolean z) {
        SubscribeTimeStickerWidget subscribeTimeStickerWidget;
        DataChannel dataChannel;
        if (C15380j0.LJIILLIIL() && (subscribeTimeStickerWidget = this.LJLILLLLZI) != null && (dataChannel = subscribeTimeStickerWidget.dataChannel) != null) {
            dataChannel.qv0(HideTitleLayoutEvent.class, new C29646BkI(z, EnumC2323299w.SUBSCRIBE_TIME_STICKER_WIDGET));
        }
    }

    public final void LJJZZIII(int[] screenValidArea) {
        o.LJIIIZ(screenValidArea, "screenValidArea");
        int[] iArr = this.LJLL;
        iArr[0] = screenValidArea[0];
        iArr[2] = screenValidArea[2];
        iArr[3] = screenValidArea[3];
        int i = this.LJLZ - screenValidArea[1];
        View view = this.LJLJLJ;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.height = i;
            View view2 = this.LJLJLJ;
            if (view2 != null) {
                view2.setLayoutParams(layoutParams);
                View view3 = this.LJLJLJ;
                if (view3 != null) {
                    view3.addOnLayoutChangeListener(new IDCListenerS254S0100000_5(this, 8));
                    return;
                } else {
                    o.LJIJI("bottomRegionV");
                    throw null;
                }
            }
            o.LJIJI("bottomRegionV");
            throw null;
        }
        o.LJIJI("bottomRegionV");
        throw null;
    }

    public final void LJL(boolean z) {
        if (z) {
            View view = this.LJLJJLL;
            if (view != null) {
                if (view.getVisibility() != 0) {
                    View view2 = this.LJLJJLL;
                    if (view2 != null) {
                        view2.setVisibility(0);
                        return;
                    } else {
                        o.LJIJI("warnRegionLayout");
                        throw null;
                    }
                }
                return;
            }
            o.LJIJI("warnRegionLayout");
            throw null;
        }
        View view3 = this.LJLJJLL;
        if (view3 != null) {
            if (view3.getVisibility() == 4) {
                return;
            }
            View view4 = this.LJLJJLL;
            if (view4 != null) {
                view4.setVisibility(4);
                return;
            } else {
                o.LJIJI("warnRegionLayout");
                throw null;
            }
        }
        o.LJIJI("warnRegionLayout");
        throw null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent event) {
        o.LJIIIZ(event, "event");
        if (!this.LJLIL || this.LJLJI == null) {
            return super.onInterceptTouchEvent(event);
        }
        int action = event.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (this.LLF || super.onInterceptTouchEvent(event)) {
                            return true;
                        }
                    }
                } else {
                    if (this.LLF) {
                        return true;
                    }
                    if (!this.LLFF) {
                        return super.onInterceptTouchEvent(event);
                    }
                    float abs = Math.abs(event.getX() - this.LJZ);
                    float abs2 = Math.abs(event.getY() - this.LJZI);
                    int i = this.LLD;
                    if (abs >= i || abs2 >= i) {
                        this.LJZL = event.getX();
                        this.LL = event.getY();
                        this.LLF = true;
                    }
                    if (this.LLF || super.onInterceptTouchEvent(event)) {
                        return true;
                    }
                }
                return false;
            }
            if (!this.LLF) {
                LJJZZI();
            }
            if (this.LLF || super.onInterceptTouchEvent(event)) {
                return true;
            }
            return false;
        }
        LJJZZI();
        float x = event.getX();
        float y = event.getY();
        View view = this.LJLJI;
        if (view != null && x >= view.getX() && x <= view.getX() + view.getMeasuredWidth() && y >= view.getY() && y <= view.getY() + view.getMeasuredHeight()) {
            this.LJZ = event.getX();
            this.LJZI = event.getY();
            this.LJZL = event.getX();
            this.LL = event.getY();
            this.LLFF = true;
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.onInterceptTouchEvent(event);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        View view;
        TimerDetail timerDetail;
        Long l;
        int i;
        User owner;
        User owner2;
        SubscribeInfo subscribeInfo;
        int i2;
        int i3;
        boolean z;
        o.LJIIIZ(event, "event");
        if (!this.LJLIL || this.LJLJI == null) {
            return super.onTouchEvent(event);
        }
        if (!this.LLF && !this.LLFF) {
            return super.onTouchEvent(event);
        }
        int action = event.getAction();
        Long l2 = null;
        if (action != 1) {
            if (action != 2) {
                if (action == 3) {
                    LJJZZI();
                    LJL(false);
                    LJJLL(false);
                }
            } else {
                float x = event.getX() - this.LJZL;
                float y = event.getY() - this.LL;
                View view2 = this.LJLJI;
                if (view2 != null) {
                    float x2 = view2.getX() + x;
                    float f = this.LJLL[2];
                    if (x2 < f) {
                        x2 = f;
                    }
                    float measuredWidth = view2.getMeasuredWidth() + x2;
                    int i4 = this.LJLL[3];
                    if (measuredWidth > i4) {
                        x2 = i4 - view2.getMeasuredWidth();
                    }
                    if (x2 != view2.getX()) {
                        view2.setX(x2);
                        this.LJZL = event.getX();
                        this.LJLJJI = true;
                    }
                    float y2 = view2.getY() + y;
                    float f2 = this.LJLL[0];
                    if (y2 < f2) {
                        y2 = f2;
                    }
                    float measuredHeight = view2.getMeasuredHeight();
                    float f3 = y2 + measuredHeight;
                    float f4 = this.LJLL[1];
                    if (f3 > f4) {
                        y2 = f4 - measuredHeight;
                    }
                    if (y2 != view2.getY()) {
                        view2.setY(y2);
                        this.LL = event.getY();
                        this.LJLJJI = true;
                    }
                }
                boolean LJJZ = LJJZ();
                if (LJJZ != this.LJLLLLLL) {
                    this.LJLLLLLL = LJJZ;
                    TextView textView = this.LJLJJL;
                    if (textView != null) {
                        if (LJJZ) {
                            i2 = R.drawable.dax;
                        } else {
                            i2 = R.drawable.daw;
                        }
                        textView.setCompoundDrawablesWithIntrinsicBounds(0, i2, 0, 0);
                        View view3 = this.LJLJL;
                        if (view3 != null) {
                            Context context = getContext();
                            if (LJJZ) {
                                i3 = R.attr.ar1;
                            } else {
                                i3 = R.attr.bmr;
                            }
                            view3.setBackgroundColor(C259910h.LIZIZ(i3, context));
                        } else {
                            o.LJIJI("deleteRegionV");
                            throw null;
                        }
                    } else {
                        o.LJIJI("stickerDeleteTv");
                        throw null;
                    }
                }
                View view4 = this.LJLJI;
                if (view4 != null) {
                    if (view4.getY() + view4.getMeasuredHeight() >= this.LJLL[1]) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        View view5 = this.LJLJLLL;
                        if (view5 != null) {
                            if (view5.getVisibility() != 0) {
                                View view6 = this.LJLJLLL;
                                if (view6 != null) {
                                    view6.setVisibility(0);
                                } else {
                                    o.LJIJI("bottomRegionLine");
                                    throw null;
                                }
                            }
                        } else {
                            o.LJIJI("bottomRegionLine");
                            throw null;
                        }
                    } else {
                        View view7 = this.LJLJLLL;
                        if (view7 != null) {
                            if (view7.getVisibility() != 4) {
                                View view8 = this.LJLJLLL;
                                if (view8 != null) {
                                    view8.setVisibility(4);
                                } else {
                                    o.LJIJI("bottomRegionLine");
                                    throw null;
                                }
                            }
                        } else {
                            o.LJIJI("bottomRegionLine");
                            throw null;
                        }
                    }
                }
                LJJLL(true);
                LJL(true);
            }
        } else {
            if (LJJZ()) {
                SubscribeTimeStickerWidget subscribeTimeStickerWidget = this.LJLILLLLZI;
                if (subscribeTimeStickerWidget != null) {
                    Room room = subscribeTimeStickerWidget.LJLJJL;
                    if (room != null && (owner2 = room.getOwner()) != null && (subscribeInfo = owner2.getSubscribeInfo()) != null) {
                        timerDetail = subscribeInfo.timerDetail;
                    } else {
                        timerDetail = null;
                    }
                    BZI LIZ = C28787BRn.LIZ("livesdk_subathon_indicator_delete");
                    Room room2 = subscribeTimeStickerWidget.LJLJJL;
                    if (room2 != null && (owner = room2.getOwner()) != null) {
                        l = Long.valueOf(owner.getId());
                    } else {
                        l = null;
                    }
                    LIZ.LJ(l);
                    subscribeTimeStickerWidget.LLFZ(LIZ, timerDetail);
                    if (timerDetail != null) {
                        l2 = Long.valueOf(timerDetail.timeIncreasePerSubS);
                    }
                    LIZ.LJIJJ(l2, "subathon_rules");
                    if (timerDetail != null && timerDetail.subCount > 0) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    LIZ.LJIJJ(Integer.valueOf(i), "is_new_subscribers");
                    subscribeTimeStickerWidget.LLFII(LIZ, timerDetail);
                    LIZ.LJJIIJZLJL();
                    C47071t1 c47071t1 = new C47071t1(subscribeTimeStickerWidget.getContext());
                    c47071t1.LJIILLIIL(R.string.oek);
                    c47071t1.LJFF(R.string.oej);
                    c47071t1.LJIIL(R.string.oei, new IDcS170S0100000_5(subscribeTimeStickerWidget, 43));
                    c47071t1.LJIIIZ(R.string.kg7, C78897Uxp.LJLJJI);
                    LiveDialog LIZ2 = c47071t1.LIZ();
                    if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", LIZ2, new Object[0], "void", new C65300Pk0(false, "()V", "4254545235907960978")).LIZ) {
                        LIZ2.show();
                    }
                }
                LJJLJLI(true);
            } else if (this.LJLJJI && (view = this.LJLJI) != null) {
                int x3 = (int) (view.getX() + (view.getMeasuredWidth() / 2));
                int y3 = (int) (view.getY() + (view.getMeasuredHeight() / 2));
                SubscribeTimeStickerWidget subscribeTimeStickerWidget2 = this.LJLILLLLZI;
                if (subscribeTimeStickerWidget2 != null) {
                    subscribeTimeStickerWidget2.LLFF(x3, y3, true);
                }
            }
            LJJZZI();
            LJL(false);
            LJJLL(false);
        }
        return true;
    }

    public final void setStickerView(View view) {
        this.LJLJI = view;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C29674Bkk(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29674Bkk(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        this.LJLL = new int[4];
        this.LJLLILLLL = new int[2];
        this.LJLLJ = new int[2];
        this.LJLLL = new Rect();
        this.LJLLLL = new Rect();
        KL2.LJIIJJI(getContext());
        this.LJLZ = KL2.LJIIIZ(getContext());
        this.LLD = ViewConfiguration.get(context).getScaledTouchSlop();
        ViewGroup.inflate(context, R.layout.dj1, this);
        View findViewById = findViewById(R.id.fkr);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.layout_region_v)");
        this.LJLJJLL = findViewById;
        View findViewById2 = findViewById(R.id.c6k);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.delete_region_v)");
        this.LJLJL = findViewById2;
        View findViewById3 = findViewById(R.id.aqz);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.bottom_region_v)");
        this.LJLJLJ = findViewById3;
        View findViewById4 = findViewById(R.id.c6l);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.delete_sticker_btn)");
        this.LJLJJL = (TextView) findViewById4;
        View findViewById5 = findViewById(R.id.aqy);
        o.LJIIIIZZ(findViewById5, "findViewById(R.id.bottom_region_line)");
        this.LJLJLLL = findViewById5;
    }
}
