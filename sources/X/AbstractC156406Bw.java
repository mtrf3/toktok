package X;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.6Bw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC156406Bw<T> extends FrameLayout implements InterfaceC1549166d<C1558669u>, InterfaceC1549266e {
    public static final /* synthetic */ int LJLLL = 0;
    public C6C5 LJLIL;
    public TextView LJLILLLLZI;
    public LinearLayout LJLJI;
    public T LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public final int LJLJL;
    public final int LJLJLJ;
    public C6C8 LJLJLLL;
    public C1558669u LJLL;
    public long LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;

    public abstract C6C5 LJ();

    public abstract TextView LJFF();

    public abstract LinearLayout LJI();

    public abstract void LJIIIIZZ();

    public abstract void LJIIJ();

    public abstract String getContent();

    public abstract int getLayoutResId();

    @Override // X.InterfaceC1549166d
    /* renamed from: LIZLLL, reason: merged with bridge method [inline-methods] */
    public final C1558669u LJIJ() {
        InteractStickerStruct interactStickerStruct;
        int i;
        C6C8 c6c8 = this.LJLJLLL;
        if (c6c8 != null) {
            interactStickerStruct = c6c8.getInteractStickerStruct();
        } else {
            interactStickerStruct = null;
        }
        C1558669u c1558669u = this.LJLL;
        int i2 = 0;
        if (c1558669u != null) {
            i = c1558669u.LJLILLLLZI;
            i2 = c1558669u.LJLJI;
        } else {
            i = 0;
        }
        return new C1558669u(interactStickerStruct, i, i2);
    }

    public final boolean LJII() {
        C1558669u c1558669u = this.LJLL;
        if (c1558669u == null || c1558669u.LJLJI == 0) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1549166d
    public final int LJJJJI() {
        C1558669u c1558669u = this.LJLL;
        if (c1558669u != null && LJII()) {
            return c1558669u.LJLILLLLZI;
        }
        return 0;
    }

    public int getEndTime() {
        C1558669u c1558669u = this.LJLL;
        if (c1558669u != null) {
            return c1558669u.LJLJI;
        }
        return 0;
    }

    public final LinearLayout getInputLayout() {
        LinearLayout linearLayout = this.LJLJI;
        if (linearLayout != null) {
            return linearLayout;
        }
        o.LJIJI("inputLayout");
        throw null;
    }

    @Override // X.InterfaceC1549266e
    public Integer getInteractStickerType() {
        C6C8 c6c8 = this.LJLJLLL;
        if (c6c8 != null) {
            return Integer.valueOf(c6c8.getInteractStickerType());
        }
        return null;
    }

    public final C6C5 getMEditTextView() {
        C6C5 c6c5 = this.LJLIL;
        if (c6c5 != null) {
            return c6c5;
        }
        o.LJIJI("mEditTextView");
        throw null;
    }

    public final TextView getMIconView() {
        TextView textView = this.LJLILLLLZI;
        if (textView != null) {
            return textView;
        }
        o.LJIJI("mIconView");
        throw null;
    }

    public int getStartTime() {
        C1558669u c1558669u = this.LJLL;
        if (c1558669u != null) {
            return c1558669u.LJLILLLLZI;
        }
        return 0;
    }

    private final int getMaxTextWidth() {
        int paddingLeft = getMIconView().getPaddingLeft();
        int paddingRight = getMIconView().getPaddingRight();
        int paddingLeft2 = getMEditTextView().getPaddingLeft();
        return this.LJLJJL - (((paddingLeft + paddingRight) + paddingLeft2) + getMEditTextView().getPaddingRight());
    }

    public final void LIZIZ() {
        C16880lQ.LJZI(getInputLayout(), getMIconView());
        TextView mIconView = getMIconView();
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        int LIZIZ = (int) C74275TDb.LIZIZ(context, 12.0f);
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        int LIZIZ2 = (int) C74275TDb.LIZIZ(context2, 16.0f);
        Context context3 = getContext();
        o.LJIIIIZZ(context3, "context");
        int LIZIZ3 = (int) C74275TDb.LIZIZ(context3, 2.0f);
        Context context4 = getContext();
        o.LJIIIIZZ(context4, "context");
        mIconView.setPadding(LIZIZ, LIZIZ2, LIZIZ3, (int) C74275TDb.LIZIZ(context4, 14.0f));
        C6C5 mEditTextView = getMEditTextView();
        Context context5 = getContext();
        o.LJIIIIZZ(context5, "context");
        int LIZIZ4 = (int) C74275TDb.LIZIZ(context5, 8.0f);
        Context context6 = getContext();
        o.LJIIIIZZ(context6, "context");
        int LIZIZ5 = (int) C74275TDb.LIZIZ(context6, 16.0f);
        Context context7 = getContext();
        o.LJIIIIZZ(context7, "context");
        mEditTextView.setPadding(0, LIZIZ4, LIZIZ5, (int) C74275TDb.LIZIZ(context7, 8.0f));
        if (C173636rf.LIZIZ(getContext())) {
            getInputLayout().addView(getMIconView(), 1);
        } else {
            getInputLayout().addView(getMIconView(), 0);
        }
    }

    public final void LIZJ() {
        C16880lQ.LJZI(getInputLayout(), getMIconView());
        TextView mIconView = getMIconView();
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        int LIZIZ = (int) C74275TDb.LIZIZ(context, 2.0f);
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        int LIZIZ2 = (int) C74275TDb.LIZIZ(context2, 16.0f);
        Context context3 = getContext();
        o.LJIIIIZZ(context3, "context");
        int LIZIZ3 = (int) C74275TDb.LIZIZ(context3, 12.0f);
        Context context4 = getContext();
        o.LJIIIIZZ(context4, "context");
        mIconView.setPadding(LIZIZ, LIZIZ2, LIZIZ3, (int) C74275TDb.LIZIZ(context4, 14.0f));
        C6C5 mEditTextView = getMEditTextView();
        Context context5 = getContext();
        o.LJIIIIZZ(context5, "context");
        int LIZIZ4 = (int) C74275TDb.LIZIZ(context5, 8.0f);
        Context context6 = getContext();
        o.LJIIIIZZ(context6, "context");
        int LIZIZ5 = (int) C74275TDb.LIZIZ(context6, 0.0f);
        Context context7 = getContext();
        o.LJIIIIZZ(context7, "context");
        mEditTextView.setPadding(16, LIZIZ4, LIZIZ5, (int) C74275TDb.LIZIZ(context7, 8.0f));
        if (C173636rf.LIZIZ(getContext())) {
            getInputLayout().addView(getMIconView(), 0);
        } else {
            getInputLayout().addView(getMIconView(), 1);
        }
    }

    public final T getCurModel() {
        return this.LJLJJI;
    }

    public final boolean getInEditMode() {
        return this.LJLLJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC156406Bw(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
        this.LJLJL = 30;
        this.LJLJLJ = 10;
        C16880lQ.LLLZIIL(getLayoutResId(), C16880lQ.LLZIL(getContext()), this);
        this.LJLJJL = KL2.LJIIJJI(getContext()) - (((int) KL2.LIZJ(getContext(), 8.0f)) * 2);
        setMEditTextView(LJ());
        setMIconView(LJFF());
        setInputLayout(LJI());
        setTextSize(30);
    }

    private final void setTextSize(int i) {
        if (this.LJLJJLL != i) {
            this.LJLJJLL = i;
            float f = i;
            getMEditTextView().setTextSize(f);
            getMIconView().setTextSize(f * 0.73333335f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(boolean r11) {
        /*
            r10 = this;
            android.widget.TextView r0 = r10.getMIconView()
            java.lang.CharSequence r0 = r0.getText()
            r8 = 0
            if (r0 == 0) goto L32
            java.lang.String r7 = r0.toString()
        Lf:
            X.6C5 r0 = r10.getMEditTextView()
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L1d
            java.lang.String r8 = r0.toString()
        L1d:
            if (r7 == 0) goto L25
            int r0 = r7.length()
            if (r0 != 0) goto L29
        L25:
            r10.LJIIIIZZ()
            return
        L29:
            if (r8 == 0) goto L25
            int r0 = r8.length()
            if (r0 != 0) goto L34
            goto L25
        L32:
            r7 = r8
            goto Lf
        L34:
            X.6C5 r1 = r10.getMEditTextView()
            java.lang.String r0 = ""
            r1.setHint(r0)
            android.text.TextPaint r6 = new android.text.TextPaint
            X.6C5 r0 = r10.getMEditTextView()
            android.text.TextPaint r0 = r0.getPaint()
            r6.<init>(r0)
            android.text.TextPaint r5 = new android.text.TextPaint
            android.widget.TextView r0 = r10.getMIconView()
            android.text.TextPaint r0 = r0.getPaint()
            r5.<init>(r0)
            int r4 = r10.getMaxTextWidth()
            int r3 = r10.LJLJL
            int r2 = r10.LJLJLJ
            if (r2 > r3) goto La9
        L61:
            android.content.Context r1 = r10.getContext()
            float r0 = (float) r3
            float r0 = X.KL2.LJIIZILJ(r1, r0)
            r5.setTextSize(r0)
            float r9 = r5.measureText(r7)
            r6.setTextSize(r0)
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r0 = "getDefault()"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.String r1 = r8.toUpperCase(r1)
            java.lang.String r0 = "this as java.lang.String).toUpperCase(locale)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            float r1 = r6.measureText(r1)
            float r1 = r1 + r9
            float r0 = (float) r4
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto La4
        L90:
            r10.setTextSize(r3)
            if (r11 == 0) goto La3
            X.6C5 r2 = r10.getMEditTextView()
            Y.ARunnableS38S0100000_2 r1 = new Y.ARunnableS38S0100000_2
            r0 = 14
            r1.<init>(r10, r0)
            r2.post(r1)
        La3:
            return
        La4:
            if (r3 == r2) goto La9
            int r3 = r3 + (-1)
            goto L61
        La9:
            int r3 = r10.LJLJLJ
            goto L90
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC156406Bw.LIZ(boolean):void");
    }

    @Override // X.InterfaceC1549166d
    public final int LJIIZILJ(int i) {
        C1558669u c1558669u = this.LJLL;
        if (c1558669u != null && LJII()) {
            return c1558669u.LJLJI;
        }
        return i;
    }

    @Override // X.InterfaceC1549166d
    public final int LJJII(int i) {
        C1558669u c1558669u = this.LJLL;
        if (c1558669u != null && LJII()) {
            return c1558669u.LJLILLLLZI;
        }
        return 0;
    }

    @Override // X.InterfaceC1549166d
    public final int LJJJZ(int i) {
        C1558669u c1558669u = this.LJLL;
        if (c1558669u != null && LJII()) {
            return c1558669u.LJLJI;
        }
        return i;
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

    public final void setController(C6C8 controller) {
        o.LJIIIZ(controller, "controller");
        this.LJLJLLL = controller;
    }

    public final void setCurModel(T t) {
        this.LJLJJI = t;
    }

    @Override // X.InterfaceC1549266e
    public void setEndTime(int i) {
        C1558669u c1558669u = this.LJLL;
        if (c1558669u == null) {
            return;
        }
        c1558669u.LJLJI = i;
    }

    public final void setInEditMode(boolean z) {
        this.LJLLJ = z;
    }

    public final void setInputLayout(LinearLayout linearLayout) {
        o.LJIIIZ(linearLayout, "<set-?>");
        this.LJLJI = linearLayout;
    }

    public final void setMEditTextView(C6C5 c6c5) {
        o.LJIIIZ(c6c5, "<set-?>");
        this.LJLIL = c6c5;
    }

    public final void setMIconView(TextView textView) {
        o.LJIIIZ(textView, "<set-?>");
        this.LJLILLLLZI = textView;
    }

    public final void setPlayPosition(long j) {
        this.LJLLI = j;
    }

    public final void setSocialStickerTimeEditData(C1558669u data) {
        o.LJIIIZ(data, "data");
        this.LJLL = data;
    }

    @Override // X.InterfaceC1549266e
    public void setStartTime(int i) {
        C1558669u c1558669u = this.LJLL;
        if (c1558669u == null) {
            return;
        }
        c1558669u.LJLILLLLZI = i;
    }

    public final void setTouching(boolean z) {
        this.LJLLILLLL = z;
    }

    @Override // X.InterfaceC1549266e
    public final void LJIIIZ(float f, boolean z) {
        setAlpha(f);
    }

    @Override // X.InterfaceC1549166d
    public final void LJJJJLI(C1558669u c1558669u, int i, int i2) {
        InteractStickerStruct interactStickerStruct;
        C1558669u c1558669u2 = c1558669u;
        NormalTrackTimeStamp LIZIZ = C164826dS.LIZIZ(c1558669u2.LJLIL);
        C6C8 c6c8 = this.LJLJLLL;
        if (c6c8 != null) {
            interactStickerStruct = c6c8.getInteractStickerStruct();
        } else {
            interactStickerStruct = null;
        }
        NormalTrackTimeStamp LIZIZ2 = C164826dS.LIZIZ(interactStickerStruct);
        C1558669u c1558669u3 = this.LJLL;
        if (c1558669u3 != null) {
            c1558669u3.LJLILLLLZI = c1558669u2.LJLILLLLZI;
            c1558669u3.LJLJI = c1558669u2.LJLJI;
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
            String json = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().getNetworkService().getRetrofitFactoryGson(), arrayList);
            InteractStickerStruct interactStickerStruct2 = c1558669u2.LJLIL;
            if (interactStickerStruct2 != null) {
                interactStickerStruct2.setTrackList(json);
            }
            C6C8 c6c82 = this.LJLJLLL;
            if (c6c82 != null) {
                c6c82.LJIILLIIL(false);
            }
            C6C8 c6c83 = this.LJLJLLL;
            if (c6c83 != null) {
                c6c83.LJIIZILJ(c1558669u2.LJLIL);
            }
            C6C8 c6c84 = this.LJLJLLL;
            if (c6c84 != null) {
                c6c84.LJIILLIIL(true);
            }
        }
    }
}
