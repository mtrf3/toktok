package X;

import Y.ARunnableS41S0100000_5;
import Y.AfS57S0100000_5;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.model.Sticker;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Bkb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC29665Bkb<T extends Sticker> extends ConstraintLayout {
    public final T LJLIL;
    public final boolean LJLILLLLZI;
    public int[] LJLJI;
    public final InterfaceC29661BkX LJLJJI;
    public boolean LJLJJL;
    public TextView LJLJJLL;
    public View LJLJL;
    public View LJLJLJ;
    public View LJLJLLL;
    public View LJLL;
    public final int[] LJLLI;
    public final int[] LJLLILLLL;
    public final int[] LJLLJ;
    public final Rect LJLLL;
    public final Rect LJLLLL;
    public boolean LJLLLLLL;
    public final int LJLZ;
    public final int LJZ;
    public float LJZI;
    public float LJZL;
    public float LL;
    public float LLD;
    public float LLF;
    public float LLFF;
    public final int LLFFF;
    public View LLFII;
    public boolean LLFZ;
    public boolean LLI;
    public final C73411SrX LLIFFJFJJ;
    public int LLII;
    public float LLIIII;
    public float LLIIIILZ;

    public abstract void LJJZ();

    public abstract View LJJZZIII();

    public abstract void LJL(View view);

    public void LJJLJLI() {
        this.LJLJJI.LJLLJ(this.LJLIL);
    }

    public final boolean LJJZZI() {
        View view = this.LLFII;
        if (view == null) {
            return false;
        }
        view.getLocationOnScreen(this.LJLLJ);
        View view2 = this.LLFII;
        o.LJI(view2);
        Rect rect = this.LJLLL;
        int[] iArr = this.LJLLJ;
        int i = iArr[0];
        rect.left = i;
        rect.top = iArr[1];
        rect.right = view2.getMeasuredWidth() + i;
        rect.bottom = view2.getMeasuredHeight() + rect.top;
        Rect rect2 = this.LJLLL;
        View view3 = this.LLFII;
        o.LJI(view3);
        rect2.offset(0, view3.getMeasuredHeight() / 100);
        View view4 = this.LJLJLJ;
        if (view4 != null) {
            view4.getLocationOnScreen(this.LJLLILLLL);
            View view5 = this.LJLJLJ;
            if (view5 != null) {
                Rect rect3 = this.LJLLLL;
                int[] iArr2 = this.LJLLILLLL;
                int i2 = iArr2[0];
                rect3.left = i2;
                rect3.top = iArr2[1];
                rect3.right = view5.getMeasuredWidth() + i2;
                rect3.bottom = view5.getMeasuredHeight() + rect3.top;
                return this.LJLLL.intersect(this.LJLLLL);
            }
            o.LJIJI("deleteRegionV");
            throw null;
        }
        o.LJIJI("deleteRegionV");
        throw null;
    }

    public final void LJLI() {
        this.LLFF = -1.0f;
        this.LLF = -1.0f;
        this.LJZL = -1.0f;
        this.LJZI = -1.0f;
        this.LJLJJL = false;
        this.LLFZ = false;
        this.LLI = false;
    }

    public JSONObject getDecorationInfo() {
        JSONObject jSONObject = new JSONObject();
        T t = this.LJLIL;
        try {
            jSONObject.put("id", String.valueOf(t.id));
            jSONObject.put("type", t.type);
            jSONObject.put("content", t.content);
            jSONObject.put("x", t.x);
            jSONObject.put("y", t.y);
            jSONObject.put("w", this.LJLZ);
            jSONObject.put("h", this.LJZ);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        return jSONObject;
    }

    public final int getDeleteRegionVBottom() {
        View view = this.LJLJLJ;
        if (view != null) {
            return view.getBottom();
        }
        o.LJIJI("deleteRegionV");
        throw null;
    }

    public T getRoomDecoration() {
        if (this.LJLILLLLZI) {
            T t = this.LJLIL;
            t.screenHeight = this.LJZ;
            return t;
        }
        return this.LJLIL;
    }

    public final int getType() {
        return this.LJLIL.type;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C73411SrX c73411SrX = this.LLIFFJFJJ;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
    }

    public final float getDownX() {
        return this.LLIIII;
    }

    public final float getDownY() {
        return this.LLIIIILZ;
    }

    public final int getLocToRest() {
        return this.LLII;
    }

    public final void LJLIIIL(boolean z) {
        int[] iArr = this.LJLLI;
        int[] iArr2 = this.LJLJI;
        iArr[0] = iArr2[0];
        iArr[2] = iArr2[2];
        iArr[3] = iArr2[3];
        int i = this.LJZ - iArr2[1];
        View view = this.LJLJLLL;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.height = i;
            View view2 = this.LJLJLLL;
            if (view2 != null) {
                view2.setLayoutParams(layoutParams);
                View view3 = this.LJLJLLL;
                if (view3 != null) {
                    view3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC29667Bkd(this, z));
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

    public final void LJLIIL(boolean z) {
        if (z) {
            View view = this.LJLJL;
            if (view != null) {
                if (view.getVisibility() != 0) {
                    View view2 = this.LJLJL;
                    if (view2 != null) {
                        view2.setVisibility(0);
                    } else {
                        o.LJIJI("warnRegionLayout");
                        throw null;
                    }
                }
                if (this instanceof C29656BkS) {
                    this.LJLJJI.LJLL();
                    return;
                }
                return;
            }
            o.LJIJI("warnRegionLayout");
            throw null;
        }
        View view3 = this.LJLJL;
        if (view3 != null) {
            if (view3.getVisibility() == 4) {
                return;
            }
            View view4 = this.LJLJL;
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

    /* JADX WARN: Removed duplicated region for block: B:62:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013d  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC29665Bkb.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x0256, code lost:
    
        if (r4 != false) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x014a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 659
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC29665Bkb.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setDownX(float f) {
        this.LLIIII = f;
    }

    public final void setDownY(float f) {
        this.LLIIIILZ = f;
    }

    public final void setLocToRest(int i) {
        this.LLII = i;
    }

    public void LJJLL(AqS155S0100000_5 aqS155S0100000_5, AqS155S0100000_5 aqS155S0100000_52) {
        this.LJLJJI.LJLLJ(this.LJLIL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC29665Bkb(Context context, T sticker, boolean z, int[] mScreenValidArea, InterfaceC29661BkX mDecorationWidgetCallback, boolean z2) {
        super(context);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sticker, "sticker");
        o.LJIIIZ(mScreenValidArea, "mScreenValidArea");
        o.LJIIIZ(mDecorationWidgetCallback, "mDecorationWidgetCallback");
        new LinkedHashMap();
        this.LJLIL = sticker;
        this.LJLILLLLZI = z;
        this.LJLJI = mScreenValidArea;
        this.LJLJJI = mDecorationWidgetCallback;
        this.LJLLI = new int[4];
        this.LJLLILLLL = new int[2];
        this.LJLLJ = new int[2];
        this.LJLLL = new Rect();
        this.LJLLLL = new Rect();
        this.LJLZ = KL2.LJIIJJI(getContext());
        this.LJZ = KL2.LJIIIZ(getContext());
        this.LLFFF = ViewConfiguration.get(context).getScaledTouchSlop();
        ViewGroup.inflate(context, R.layout.cvk, this);
        View findViewById = findViewById(R.id.fkr);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.layout_region_v)");
        this.LJLJL = findViewById;
        View findViewById2 = findViewById(R.id.c6k);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.delete_region_v)");
        this.LJLJLJ = findViewById2;
        View findViewById3 = findViewById(R.id.aqz);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.bottom_region_v)");
        this.LJLJLLL = findViewById3;
        View findViewById4 = findViewById(R.id.c6l);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.delete_sticker_btn)");
        this.LJLJJLL = (TextView) findViewById4;
        View findViewById5 = findViewById(R.id.aqy);
        o.LJIIIIZZ(findViewById5, "findViewById(R.id.bottom_region_line)");
        this.LJLL = findViewById5;
        LJLIIIL(true);
        if (z2) {
            post(new ARunnableS41S0100000_5(this, 253));
        }
        this.LLIFFJFJJ = (C73411SrX) C73943T0h.LIZ().LJ(C28946BXq.class).LJJJJZI(new AfS57S0100000_5(this, 237));
        this.LLIIII = -1.0f;
        this.LLIIIILZ = -1.0f;
    }
}
