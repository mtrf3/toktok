package X;

import Y.ARunnableS38S0100000_2;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.sticker.data.PoiStickerStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6Ct, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C156636Ct extends TuxTextView implements InterfaceC1549166d<InteractStickerStruct>, InterfaceC1549266e {
    public static final /* synthetic */ int LLII = 0;
    public long LJLLLL;
    public InteractStickerStruct LJLLLLLL;
    public boolean LJLZ;
    public final RectF LJZ;
    public final C62822Ol8 LJZI;
    public final SY9 LJZL;
    public final int LL;
    public final int LLD;
    public final int LLF;
    public final int LLFF;
    public final float LLFFF;
    public C156526Ci LLFII;
    public int LLFZ;
    public final List<Integer> LLI;
    public final java.util.Map<Integer, View> LLIFFJFJJ;

    @Override // com.bytedance.tux.input.TuxTextView
    public final View LJJIJIL(int i) {
        java.util.Map<Integer, View> map = this.LLIFFJFJJ;
        Integer valueOf = Integer.valueOf(R.id.title);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.title);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    private final SafeHandler getHandler() {
        return (SafeHandler) this.LJZI.getValue();
    }

    public final boolean LJJJIL() {
        InteractStickerStruct interactStickerStruct = this.LJLLLLLL;
        if (interactStickerStruct == null) {
            return false;
        }
        PoiStickerStruct poiStickerStruct = interactStickerStruct.getPoiStickerStruct();
        if (poiStickerStruct != null && poiStickerStruct.getEndTime() == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:
    
        if (r3 <= r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004d, code lost:
    
        if (8 == getVisibility()) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJJJ() {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r0 = r7.LJLLLLLL
            r5 = 0
            if (r0 == 0) goto L5f
            X.6Ci r0 = r7.getStickerController()
            boolean r0 = r0.LJIL()
            if (r0 != 0) goto L5f
            boolean r0 = r7.LJLZ
            if (r0 != 0) goto L5f
            boolean r0 = r7.LJJJIL()
            r6 = 1
            if (r0 == 0) goto L44
            long r3 = r7.LJLLLL
            com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r0 = r7.LJLLLLLL
            if (r0 == 0) goto L5d
            com.ss.android.ugc.aweme.sticker.data.PoiStickerStruct r0 = r0.getPoiStickerStruct()
            if (r0 == 0) goto L5d
            int r0 = r0.getStartTime()
        L2a:
            long r1 = (long) r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L55
            long r3 = r7.LJLLLL
            com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r0 = r7.LJLLLLLL
            if (r0 == 0) goto L53
            com.ss.android.ugc.aweme.sticker.data.PoiStickerStruct r0 = r0.getPoiStickerStruct()
            if (r0 == 0) goto L53
            int r0 = r0.getEndTime()
        L3f:
            long r1 = (long) r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L55
        L44:
            r2 = 1
            r1 = 8
            if (r6 == 0) goto L56
            int r0 = r7.getVisibility()
            if (r1 != r0) goto L56
        L4f:
            X.C162696a1.LJ(r5, r7)
            return r6
        L53:
            r0 = 0
            goto L3f
        L55:
            r2 = 0
        L56:
            r6 = 0
            if (r2 == 0) goto L5a
            goto L4f
        L5a:
            r5 = 8
            goto L4f
        L5d:
            r0 = 0
            goto L2a
        L5f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C156636Ct.LJJJJ():boolean");
    }

    public int getEndTime() {
        PoiStickerStruct poiStickerStruct;
        InteractStickerStruct interactStickerStruct = this.LJLLLLLL;
        if (interactStickerStruct != null && (poiStickerStruct = interactStickerStruct.getPoiStickerStruct()) != null) {
            return poiStickerStruct.getEndTime();
        }
        return 0;
    }

    @Override // X.InterfaceC1549266e
    public Integer getInteractStickerType() {
        return 22;
    }

    public int getStartTime() {
        PoiStickerStruct poiStickerStruct;
        InteractStickerStruct interactStickerStruct = this.LJLLLLLL;
        if (interactStickerStruct != null && (poiStickerStruct = interactStickerStruct.getPoiStickerStruct()) != null) {
            return poiStickerStruct.getStartTime();
        }
        return 0;
    }

    public final C156526Ci getStickerController() {
        C156526Ci c156526Ci = this.LLFII;
        if (c156526Ci != null) {
            return c156526Ci;
        }
        o.LJIJI("stickerController");
        throw null;
    }

    @Override // X.InterfaceC1549166d
    public final InteractStickerStruct LJIJ() {
        InteractStickerStruct interactStickerStruct = getStickerController().getInteractStickerStruct();
        if (interactStickerStruct == null) {
            interactStickerStruct = new InteractStickerStruct();
        }
        this.LJLLLLLL = interactStickerStruct;
        return interactStickerStruct;
    }

    @Override // X.InterfaceC1549166d
    public final int LJJJJI() {
        InteractStickerStruct interactStickerStruct;
        PoiStickerStruct poiStickerStruct;
        if (LJJJIL() && (interactStickerStruct = this.LJLLLLLL) != null && (poiStickerStruct = interactStickerStruct.getPoiStickerStruct()) != null) {
            return poiStickerStruct.getStartTime();
        }
        return 0;
    }

    public final long getPlayPosition() {
        return this.LJLLLL;
    }

    public final int getStickerType$tools_camera_edit_release() {
        return this.LLFZ;
    }

    @Override // X.InterfaceC1549166d
    public final int LJIIZILJ(int i) {
        InteractStickerStruct interactStickerStruct;
        PoiStickerStruct poiStickerStruct;
        if (LJJJIL() && (interactStickerStruct = this.LJLLLLLL) != null && (poiStickerStruct = interactStickerStruct.getPoiStickerStruct()) != null) {
            return poiStickerStruct.getEndTime();
        }
        return i;
    }

    @Override // X.InterfaceC1549166d
    public final int LJJII(int i) {
        InteractStickerStruct interactStickerStruct;
        PoiStickerStruct poiStickerStruct;
        if (LJJJIL() && (interactStickerStruct = this.LJLLLLLL) != null && (poiStickerStruct = interactStickerStruct.getPoiStickerStruct()) != null) {
            return poiStickerStruct.getStartTime();
        }
        return 0;
    }

    public final void LJJJJJ(int i) {
        SY9 sy9;
        SY9 sy92;
        float textSize = (getTextSize() - C278817o.LIZ(this.LLFFF)) / O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(30 - this.LLFFF)));
        float f = 0.0f;
        if (textSize > 1.0f) {
            textSize = 1.0f;
        } else if (textSize < 0.0f) {
            textSize = 0.0f;
        }
        setPadding(C7MY.LIZIZ(8), C7MY.LIZIZ(3) + ((int) (C7MY.LIZIZ(5) * textSize)), C7MY.LIZIZ(10), C7MY.LIZIZ(3) + ((int) (C7MY.LIZIZ(5) * textSize)));
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZJ = C61328O5c.LIZJ(2);
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.eb);
        Context context = getContext();
        o.LJIIIIZZ(context, "this.context");
        setBackground(c110614Vt.LIZ(context));
        SY9 sy93 = this.LJZL;
        if (sy93 != null) {
            sy93.LJ(i);
        }
        float width = ((getWidth() - getPaint().measureText(getText().toString())) - getPaddingLeft()) - getPaddingRight();
        int compoundDrawablePadding = getCompoundDrawablePadding();
        int i2 = this.LLF;
        if (compoundDrawablePadding != i2) {
            setCompoundDrawablePadding(i2);
        }
        float f2 = (width - (this.LL + this.LLF)) - 0;
        if (f2 >= 0.0f) {
            f = f2;
        }
        float f3 = f / 2.0f;
        if (C26338AVi.LIZLLL(this)) {
            sy9 = null;
            sy92 = this.LJZL;
        } else {
            sy9 = this.LJZL;
            sy92 = null;
        }
        int LJJIIZ = O6R.LJJIIZ(f3);
        int i3 = -LJJIIZ;
        if (sy9 != null) {
            sy9.setBounds(LJJIIZ, 0, this.LL + LJJIIZ, this.LLD);
        }
        if (sy92 != null) {
            sy92.setBounds(i3, 0, this.LL + i3, this.LLD);
        }
        setCompoundDrawables(sy9, null, sy92, null);
        requestLayout();
    }

    public final void LJJJJL(Integer num) {
        int intValue;
        PoiStickerStruct poiStickerStruct;
        if (num != null) {
            intValue = num.intValue();
        } else {
            int indexOf = this.LLI.indexOf(Integer.valueOf(this.LLFZ));
            List<Integer> list = this.LLI;
            intValue = ((Number) ListProtector.get(list, (indexOf + 1) % list.size())).intValue();
        }
        this.LLFZ = intValue;
        if (intValue != 1) {
            if (intValue != 2) {
                if (intValue == 3) {
                    getPaint().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.XOR));
                    SY9 sy9 = this.LJZL;
                    sy9.LJIIJ = true;
                    sy9.invalidateSelf();
                    Context context = getContext();
                    o.LJIIIIZZ(context, "context");
                    LJJJJJ(AnonymousClass636.LJIIIIZZ(R.attr.dj, context));
                    Context context2 = getContext();
                    o.LJIIIIZZ(context2, "context");
                    setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.dj, context2));
                    C110614Vt c110614Vt = new C110614Vt();
                    c110614Vt.LIZJ = Float.valueOf(this.LLFF);
                    c110614Vt.LJ = Integer.valueOf(C86V.LIZIZ(R.color.bc));
                    c110614Vt.LIZ = Integer.valueOf(C86V.LIZIZ(R.color.bc));
                    Context context3 = getContext();
                    o.LJIIIIZZ(context3, "context");
                    setBackground(c110614Vt.LIZ(context3));
                }
            } else {
                getPaint().setXfermode(null);
                SY9 sy92 = this.LJZL;
                sy92.LJIIJ = false;
                sy92.invalidateSelf();
                Context context4 = getContext();
                o.LJIIIIZZ(context4, "context");
                LJJJJJ(AnonymousClass636.LJIIIIZZ(R.attr.dj, context4));
                Context context5 = getContext();
                o.LJIIIIZZ(context5, "context");
                setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.dj, context5));
                C110614Vt c110614Vt2 = new C110614Vt();
                c110614Vt2.LIZJ = Float.valueOf(this.LLFF);
                c110614Vt2.LJ = Integer.valueOf(C86V.LIZIZ(R.color.b9));
                c110614Vt2.LIZ = Integer.valueOf(C86V.LIZIZ(R.color.b9));
                Context context6 = getContext();
                o.LJIIIIZZ(context6, "context");
                setBackground(c110614Vt2.LIZ(context6));
            }
        } else {
            getPaint().setXfermode(null);
            SY9 sy93 = this.LJZL;
            sy93.LJIIJ = false;
            sy93.invalidateSelf();
            Context context7 = getContext();
            o.LJIIIIZZ(context7, "context");
            LJJJJJ(AnonymousClass636.LJIIIIZZ(R.attr.e8, context7));
            Context context8 = getContext();
            o.LJIIIIZZ(context8, "context");
            setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.ed, context8));
            C110614Vt c110614Vt3 = new C110614Vt();
            c110614Vt3.LIZJ = Float.valueOf(this.LLFF);
            c110614Vt3.LJ = Integer.valueOf(C86V.LIZIZ(R.color.bc));
            c110614Vt3.LIZ = Integer.valueOf(C86V.LIZIZ(R.color.bc));
            Context context9 = getContext();
            o.LJIIIIZZ(context9, "context");
            setBackground(c110614Vt3.LIZ(context9));
        }
        InteractStickerStruct interactStickerStruct = this.LJLLLLLL;
        if (interactStickerStruct != null && (poiStickerStruct = interactStickerStruct.getPoiStickerStruct()) != null) {
            poiStickerStruct.setStickerTheme(this.LLFZ);
        }
        invalidate();
    }

    @Override // X.InterfaceC1549166d
    public final int LJJJZ(int i) {
        InteractStickerStruct interactStickerStruct;
        PoiStickerStruct poiStickerStruct;
        if (LJJJIL() && (interactStickerStruct = this.LJLLLLLL) != null && (poiStickerStruct = interactStickerStruct.getPoiStickerStruct()) != null) {
            return poiStickerStruct.getEndTime();
        }
        return i;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        this.LJZ.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.saveLayer(this.LJZ, null);
        super.draw(canvas);
        canvas.restore();
    }

    @Override // X.InterfaceC1549166d
    public void setAlpha(boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.3137255f;
        }
        LJIIIZ(f, false);
    }

    @Override // X.InterfaceC1549266e
    public void setEndTime(int i) {
        PoiStickerStruct poiStickerStruct;
        InteractStickerStruct interactStickerStruct = this.LJLLLLLL;
        if (interactStickerStruct == null || (poiStickerStruct = interactStickerStruct.getPoiStickerStruct()) == null) {
            return;
        }
        poiStickerStruct.setEndTime(i);
    }

    public final void setLocationStickerData$tools_camera_edit_release(InteractStickerStruct data) {
        PoiData poiData;
        o.LJIIIZ(data, "data");
        this.LJLLLLLL = data;
        PoiStickerStruct poiStickerStruct = data.getPoiStickerStruct();
        if (poiStickerStruct != null && (poiData = poiStickerStruct.getPoiData()) != null) {
            setText(poiData.getName());
        }
        postDelayed(new ARunnableS38S0100000_2(this, 69), 100L);
    }

    public final void setPlayPosition(long j) {
        this.LJLLLL = j;
    }

    @Override // X.InterfaceC1549266e
    public void setStartTime(int i) {
        PoiStickerStruct poiStickerStruct;
        InteractStickerStruct interactStickerStruct = this.LJLLLLLL;
        if (interactStickerStruct == null || (poiStickerStruct = interactStickerStruct.getPoiStickerStruct()) == null) {
            return;
        }
        poiStickerStruct.setStartTime(i);
    }

    public final void setStickerController(C156526Ci c156526Ci) {
        o.LJIIIZ(c156526Ci, "<set-?>");
        this.LLFII = c156526Ci;
    }

    public final void setTouching$tools_camera_edit_release(boolean z) {
        if (z == this.LJLZ) {
            return;
        }
        this.LJLZ = z;
        if (!z) {
            SystemClock.elapsedRealtime();
            getHandler().postDelayed(new ARunnableS38S0100000_2(this, 202), 1000L);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C156636Ct(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        InteractStickerStruct interactStickerStruct;
        PoiStickerStruct poiStickerStruct;
        Integer num;
        PoiStickerStruct poiStickerStruct2;
        PoiStickerStruct poiStickerStruct3;
        this.LLIFFJFJJ = C62850Ola.LJFF(context, "context");
        this.LJZ = new RectF();
        this.LJZI = C221108m2.LIZIZ(new AqS149S0200000_2(this, context, 106));
        this.LJZL = new SY9(context, R.raw.icon_map_pin_fill);
        this.LL = O6R.LJJIIZ(C32151Nz.LJIIZILJ(24));
        this.LLD = O6R.LJJIIZ(C32151Nz.LJIIZILJ(24));
        this.LLF = C7MY.LIZIZ(4);
        this.LLFF = O6R.LJJIIZ(C32151Nz.LJIIZILJ(8));
        this.LLFFF = 22.0f;
        this.LLFZ = 1;
        this.LLI = C47261Igj.LJJIJIL(1, 2, 3);
        setPadding(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)));
        setMaxLines(1);
        setTuxFont(11);
        LJJJ(30.0f);
        setMinTextSize(22.0f);
        setGravity(8388627);
        setEllipsize(TextUtils.TruncateAt.END);
        setMaxWidth(C60996Nwm.LIZIZ(context) - O6R.LJJIIZ(C32151Nz.LJIIZILJ(79)));
        InteractStickerStruct interactStickerStruct2 = this.LJLLLLLL;
        if ((interactStickerStruct2 != null && (poiStickerStruct3 = interactStickerStruct2.getPoiStickerStruct()) != null && poiStickerStruct3.getStickerTheme() == 2) || ((interactStickerStruct = this.LJLLLLLL) != null && (poiStickerStruct = interactStickerStruct.getPoiStickerStruct()) != null && poiStickerStruct.getStickerTheme() == 3)) {
            InteractStickerStruct interactStickerStruct3 = this.LJLLLLLL;
            if (interactStickerStruct3 != null && (poiStickerStruct2 = interactStickerStruct3.getPoiStickerStruct()) != null) {
                num = Integer.valueOf(poiStickerStruct2.getStickerTheme());
            } else {
                num = null;
            }
            LJJJJL(num);
        } else {
            LJJJJL(1);
        }
        Typeface LJIILIIL = C68M.LJIIJ().LJIILIIL("Neon");
        if (LJIILIIL != null) {
            setTypeface(LJIILIIL);
        }
    }

    @Override // X.InterfaceC1549266e
    public final void LJIIIZ(float f, boolean z) {
        setAlpha(f);
    }

    @Override // X.InterfaceC1549166d
    public final void LJJJJLI(InteractStickerStruct interactStickerStruct, int i, int i2) {
        PoiStickerStruct poiStickerStruct;
        PoiStickerStruct poiStickerStruct2;
        InteractStickerStruct interactStickerStruct2 = interactStickerStruct;
        NormalTrackTimeStamp LIZIZ = C164826dS.LIZIZ(interactStickerStruct2);
        NormalTrackTimeStamp LIZIZ2 = C164826dS.LIZIZ(getStickerController().getInteractStickerStruct());
        InteractStickerStruct interactStickerStruct3 = this.LJLLLLLL;
        if (interactStickerStruct3 != null && (poiStickerStruct2 = interactStickerStruct3.getPoiStickerStruct()) != null) {
            poiStickerStruct2.setStartTime(interactStickerStruct2.getPoiStickerStruct().getStartTime());
        }
        InteractStickerStruct interactStickerStruct4 = this.LJLLLLLL;
        if (interactStickerStruct4 != null && (poiStickerStruct = interactStickerStruct4.getPoiStickerStruct()) != null) {
            poiStickerStruct.setEndTime(interactStickerStruct2.getPoiStickerStruct().getEndTime());
        }
        if (LIZIZ != null && LIZIZ2 != null) {
            LIZIZ.setRotation(LIZIZ.getRotation() - LIZIZ2.getRotation());
            if (!o.LIZJ(LIZIZ2.getScale(), 0.0f)) {
                float floatValue = LIZIZ.getScale().floatValue();
                Float scale = LIZIZ2.getScale();
                o.LJIIIIZZ(scale, "newLocation.scale");
                LIZIZ.setScale(Float.valueOf(floatValue / scale.floatValue()));
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(LIZIZ);
            interactStickerStruct2.setTrackList(GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().getNetworkService().getRetrofitFactoryGson(), arrayList));
            getStickerController().LJJIIZ(false);
            getStickerController().LJJIIJZLJL(interactStickerStruct2, Boolean.FALSE);
            getStickerController().LJJIIZ(true);
        }
    }
}
