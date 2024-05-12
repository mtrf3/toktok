package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.text.Editable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.sticker.data.CountDownStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.views.IDlS62S0100000_2;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.6Jg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C158326Jg extends FrameLayout implements InterfaceC1549166d<C1558669u>, InterfaceC1549266e {
    public static final int LLFF = SFS.LJI(73.0d);
    public LinearLayout LJLIL;
    public C158376Jl LJLILLLLZI;
    public C158396Jn LJLJI;
    public TuxTextView LJLJJI;
    public TuxTextView LJLJJL;
    public TuxTextView LJLJJLL;
    public TuxTextView LJLJL;
    public TuxTextView LJLJLJ;
    public TuxTextView LJLJLLL;
    public DialogC158506Jy LJLL;
    public final C158426Jq LJLLI;
    public boolean LJLLILLLL;
    public long LJLLJ;
    public long LJLLL;
    public int LJLLLL;
    public InterfaceC158446Js LJLLLLLL;
    public InterfaceC158456Jt LJLZ;
    public InterfaceC158496Jx LJZ;
    public C6JV LJZI;
    public C1558669u LJZL;
    public long LL;
    public boolean LLD;
    public boolean LLF;

    public final void LJIIIIZZ() {
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.du8, this, false);
        o.LJII(LLLLIILL, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout = (LinearLayout) LLLLIILL;
        this.LJLIL = linearLayout;
        addView(linearLayout);
        LinearLayout linearLayout2 = this.LJLIL;
        if (linearLayout2 != null) {
            View findViewById = linearLayout2.findViewById(R.id.cn3);
            o.LJIIIIZZ(findViewById, "container.findViewById(R.id.ed_live_title)");
            this.LJLJI = (C158396Jn) findViewById;
            LinearLayout linearLayout3 = this.LJLIL;
            if (linearLayout3 != null) {
                View findViewById2 = linearLayout3.findViewById(R.id.m36);
                o.LJIIIIZZ(findViewById2, "container.findViewById(R.id.tv_count_down_first)");
                this.LJLJJI = (TuxTextView) findViewById2;
                LinearLayout linearLayout4 = this.LJLIL;
                if (linearLayout4 != null) {
                    View findViewById3 = linearLayout4.findViewById(R.id.m38);
                    o.LJIIIIZZ(findViewById3, "container.findViewById(R.id.tv_count_down_second)");
                    this.LJLJJL = (TuxTextView) findViewById3;
                    LinearLayout linearLayout5 = this.LJLIL;
                    if (linearLayout5 != null) {
                        View findViewById4 = linearLayout5.findViewById(R.id.m3_);
                        o.LJIIIIZZ(findViewById4, "container.findViewById(R.id.tv_count_down_third)");
                        this.LJLJJLL = (TuxTextView) findViewById4;
                        TuxTextView tuxTextView = this.LJLJJI;
                        if (tuxTextView != null) {
                            tuxTextView.LJJJ(32.0f);
                            TuxTextView tuxTextView2 = this.LJLJJL;
                            if (tuxTextView2 != null) {
                                tuxTextView2.LJJJ(32.0f);
                                TuxTextView tuxTextView3 = this.LJLJJLL;
                                if (tuxTextView3 != null) {
                                    tuxTextView3.LJJJ(32.0f);
                                    LinearLayout linearLayout6 = this.LJLIL;
                                    if (linearLayout6 != null) {
                                        View findViewById5 = linearLayout6.findViewById(R.id.m37);
                                        o.LJIIIIZZ(findViewById5, "container.findViewById(R…tv_count_down_first_hint)");
                                        this.LJLJL = (TuxTextView) findViewById5;
                                        LinearLayout linearLayout7 = this.LJLIL;
                                        if (linearLayout7 != null) {
                                            View findViewById6 = linearLayout7.findViewById(R.id.m39);
                                            o.LJIIIIZZ(findViewById6, "container.findViewById(R…v_count_down_second_hint)");
                                            this.LJLJLJ = (TuxTextView) findViewById6;
                                            LinearLayout linearLayout8 = this.LJLIL;
                                            if (linearLayout8 != null) {
                                                View findViewById7 = linearLayout8.findViewById(R.id.m3a);
                                                o.LJIIIIZZ(findViewById7, "container.findViewById(R…tv_count_down_third_hint)");
                                                this.LJLJLLL = (TuxTextView) findViewById7;
                                                LJII(CardStruct.IStatusCode.DEFAULT, CardStruct.IStatusCode.DEFAULT, CardStruct.IStatusCode.DEFAULT, CardStruct.IStatusCode.DEFAULT, true);
                                                LinearLayout linearLayout9 = this.LJLIL;
                                                if (linearLayout9 != null) {
                                                    View findViewById8 = linearLayout9.findViewById(R.id.g2m);
                                                    o.LJIIIIZZ(findViewById8, "container.findViewById(R.id.ll_countdown_time)");
                                                    C158376Jl c158376Jl = (C158376Jl) findViewById8;
                                                    this.LJLILLLLZI = c158376Jl;
                                                    c158376Jl.setOnClickListener(new ViewOnClickListenerC13880ga(new IDlS62S0100000_2(this, (AbstractC156316Bn<Object>) 16)));
                                                    final C158396Jn c158396Jn = this.LJLJI;
                                                    if (c158396Jn != null) {
                                                        c158396Jn.addTextChangedListener(new TextWatcher(c158396Jn, this) { // from class: X.6Jh
                                                            public final EditText LJLIL;
                                                            public final EditText LJLILLLLZI;
                                                            public final C158326Jg LJLJI;

                                                            @Override // android.text.TextWatcher
                                                            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                                                            }

                                                            @Override // android.text.TextWatcher
                                                            public final void afterTextChanged(Editable editable) {
                                                                Editable text;
                                                                EditText editText = this.LJLIL;
                                                                if (editText != null && (text = editText.getText()) != null && text.length() != 0) {
                                                                    int LJI = SFS.LJI(190);
                                                                    try {
                                                                        String obj = editText.getText().toString();
                                                                        Editable text2 = editText.getText();
                                                                        o.LJIIIIZZ(text2, "text");
                                                                        if (s.LJJLI(text2, " ")) {
                                                                            StringBuilder LIZ = X1D.LIZ();
                                                                            LIZ.append(s.LJLL(editText.getText().toString(), new C40517FvF(0, editText.getText().toString().length() - 2)));
                                                                            LIZ.append('-');
                                                                            obj = X1D.LIZIZ(LIZ);
                                                                        }
                                                                        if (new StaticLayout(obj, editText.getPaint(), LJI, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount() > 2) {
                                                                            String obj2 = editText.getText().toString();
                                                                            if (obj2.length() >= 100) {
                                                                                obj2 = obj2.substring(0, 100);
                                                                                o.LJIIIIZZ(obj2, "this as java.lang.String…ing(startIndex, endIndex)");
                                                                            }
                                                                            String LIZIZ = C58314Muc.LIZIZ(obj2, 1, 0, "this as java.lang.String…ing(startIndex, endIndex)");
                                                                            for (int length = LIZIZ.length() - 1; length >= 0 && Character.isHighSurrogate(LIZIZ.charAt(length)); length--) {
                                                                                LIZIZ = LIZIZ.substring(0, length);
                                                                                o.LJIIIIZZ(LIZIZ, "this as java.lang.String…ing(startIndex, endIndex)");
                                                                            }
                                                                            editText.setText(LIZIZ);
                                                                            editText.setSelection(editText.getText().length());
                                                                        }
                                                                    } catch (Exception e) {
                                                                        C16880lQ.LLLLIIL(e);
                                                                    }
                                                                }
                                                                String valueOf = String.valueOf(editable);
                                                                if (s.LJJLIIIJJIZ(valueOf, '\r', 0, false, 6) >= 0 || s.LJJLIIIJJIZ(valueOf, '\n', 0, false, 6) >= 0) {
                                                                    this.LJLIL.setText(ujb.o.LJJJJZ(ujb.o.LJJJJZ(valueOf, "\r", "", false), "\n", "", false));
                                                                    EditText editText2 = this.LJLIL;
                                                                    editText2.setSelection(editText2.getText().length());
                                                                    V3N.LJJIIZI(this.LJLILLLLZI);
                                                                }
                                                                InterfaceC158456Jt hintTextStateChanged = this.LJLJI.getHintTextStateChanged();
                                                                if (hintTextStateChanged != null) {
                                                                    hintTextStateChanged.LIZ();
                                                                }
                                                                InterfaceC158496Jx liveCDEditStateListener = this.LJLJI.getLiveCDEditStateListener();
                                                                if (liveCDEditStateListener != null) {
                                                                    String obj3 = this.LJLIL.getText().toString();
                                                                    this.LJLJI.getSelectTimeMiles();
                                                                    liveCDEditStateListener.LIZ(obj3);
                                                                }
                                                                this.LJLJI.LIZIZ();
                                                            }

                                                            {
                                                                o.LJIIIZ(this, "liveCDEditStickerView");
                                                                this.LJLIL = c158396Jn;
                                                                this.LJLILLLLZI = null;
                                                                this.LJLJI = this;
                                                            }

                                                            @Override // android.text.TextWatcher
                                                            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                                                                EditText editText = this.LJLIL;
                                                                if (editText == null) {
                                                                    return;
                                                                }
                                                                if (TextUtils.isEmpty(editText.getText().toString()) && editText.getHint() != null) {
                                                                    Paint paint = new Paint();
                                                                    paint.setTextSize(editText.getTextSize());
                                                                    paint.setTypeface(editText.getTypeface());
                                                                    int measureText = (int) ((editText.getLayoutParams().width - paint.measureText(editText.getHint().toString())) / 2);
                                                                    if (measureText < 0) {
                                                                        editText.setPaddingRelative(0, 0, 0, 0);
                                                                        editText.setGravity(8388659);
                                                                        return;
                                                                    } else {
                                                                        editText.setPaddingRelative(measureText, 0, 0, 0);
                                                                        editText.setGravity(8388627);
                                                                        return;
                                                                    }
                                                                }
                                                                editText.setGravity(17);
                                                                editText.setPaddingRelative(SFS.LJI(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX), 0, SFS.LJI(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX), 0);
                                                            }
                                                        });
                                                        Math.max(C81184Vtc.LIZIZ(getContext()) / 4, LLFF);
                                                        C158396Jn c158396Jn2 = this.LJLJI;
                                                        if (c158396Jn2 != null) {
                                                            V3N.LJJIIZI(c158396Jn2);
                                                            return;
                                                        } else {
                                                            o.LJIJI("edLiveTitle");
                                                            throw null;
                                                        }
                                                    }
                                                    o.LJIJI("edLiveTitle");
                                                    throw null;
                                                }
                                                o.LJIJI("container");
                                                throw null;
                                            }
                                            o.LJIJI("container");
                                            throw null;
                                        }
                                        o.LJIJI("container");
                                        throw null;
                                    }
                                    o.LJIJI("container");
                                    throw null;
                                }
                                o.LJIJI("tvCountDownThird");
                                throw null;
                            }
                            o.LJIJI("tvCountDownSecond");
                            throw null;
                        }
                        o.LJIJI("tvCountDownFirst");
                        throw null;
                    }
                    o.LJIJI("container");
                    throw null;
                }
                o.LJIJI("container");
                throw null;
            }
            o.LJIJI("container");
            throw null;
        }
        o.LJIJI("container");
        throw null;
    }

    public final void LIZIZ() {
        Integer valueOf;
        InterfaceC158446Js interfaceC158446Js;
        InterfaceC158446Js interfaceC158446Js2 = this.LJLLLLLL;
        if (interfaceC158446Js2 == null || (valueOf = Integer.valueOf(interfaceC158446Js2.getHintState())) == null) {
            return;
        }
        if ((valueOf.intValue() != 2 && valueOf.intValue() != 3 && valueOf.intValue() != 4) || (interfaceC158446Js = this.LJLLLLLL) == null) {
            return;
        }
        interfaceC158446Js.LIZ(-1);
    }

    @Override // X.InterfaceC1549166d
    /* renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
    public final C1558669u LJIJ() {
        InteractStickerStruct interactStickerStruct;
        int i;
        C6JV c6jv = this.LJZI;
        if (c6jv != null) {
            interactStickerStruct = c6jv.getInteractStickerStruct();
        } else {
            interactStickerStruct = null;
        }
        C1558669u c1558669u = this.LJZL;
        int i2 = 0;
        if (c1558669u != null) {
            i = c1558669u.LJLILLLLZI;
            i2 = c1558669u.LJLJI;
        } else {
            i = 0;
        }
        return new C1558669u(interactStickerStruct, i, i2);
    }

    public final void LIZLLL() {
        C158426Jq c158426Jq = this.LJLLI;
        C158396Jn c158396Jn = this.LJLJI;
        if (c158396Jn != null) {
            c158426Jq.LIZ = String.valueOf(c158396Jn.getText());
            this.LJLLI.LIZIZ = this.LJLLL;
            this.LJLLILLLL = !TextUtils.isEmpty(r2.LIZ);
            return;
        }
        o.LJIJI("edLiveTitle");
        throw null;
    }

    public final boolean LJFF() {
        C1558669u c1558669u = this.LJZL;
        if (c1558669u == null || c1558669u.LJLJI == 0) {
            return false;
        }
        return true;
    }

    public final boolean LJIIJ() {
        if (this.LJLLL == 0) {
            return false;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(this.LJLLL);
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
        long currentTimeMillis = System.currentTimeMillis();
        this.LJLLJ = currentTimeMillis;
        gregorianCalendar2.setTimeInMillis(currentTimeMillis);
        if (gregorianCalendar.get(1) == gregorianCalendar2.get(1) && gregorianCalendar.get(2) == gregorianCalendar2.get(2) && gregorianCalendar.get(5) == gregorianCalendar2.get(5) && gregorianCalendar.get(11) == gregorianCalendar2.get(11) && gregorianCalendar.get(12) == gregorianCalendar2.get(12)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1549166d
    public final int LJJJJI() {
        C1558669u c1558669u = this.LJZL;
        if (c1558669u != null && LJFF()) {
            return c1558669u.LJLILLLLZI;
        }
        return 0;
    }

    public int getEndTime() {
        C1558669u c1558669u = this.LJZL;
        if (c1558669u != null) {
            return c1558669u.LJLJI;
        }
        return 0;
    }

    @Override // X.InterfaceC1549266e
    public Integer getInteractStickerType() {
        if (this.LJZI != null) {
            return 10;
        }
        return null;
    }

    public final CountDownStickerStruct getLiveCDStruct() {
        C158396Jn c158396Jn = this.LJLJI;
        if (c158396Jn != null) {
            return new CountDownStickerStruct(String.valueOf(c158396Jn.getText()), this.LJLLL, 0L, null, null, null, null, 124, null);
        }
        o.LJIJI("edLiveTitle");
        throw null;
    }

    public int getStartTime() {
        C1558669u c1558669u = this.LJZL;
        if (c1558669u != null) {
            return c1558669u.LJLILLLLZI;
        }
        return 0;
    }

    public final String getTitleText() {
        C158396Jn c158396Jn = this.LJLJI;
        if (c158396Jn != null) {
            return String.valueOf(c158396Jn.getText());
        }
        o.LJIJI("edLiveTitle");
        throw null;
    }

    public final void LJI() {
        InputMethodManager inputMethodManager = (InputMethodManager) C16880lQ.LLILL(getContext(), "input_method");
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        Activity LIZ = C105574Cj.LIZ(context);
        if (LIZ != null && inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(LIZ.getWindow().getDecorView().getWindowToken(), 0);
        }
    }

    public final InterfaceC158456Jt getHintTextStateChanged() {
        return this.LJLZ;
    }

    public final boolean getInEditMode() {
        return this.LLF;
    }

    public final InterfaceC158496Jx getLiveCDEditStateListener() {
        return this.LJZ;
    }

    public final InterfaceC158446Js getLiveCDStickerInterface() {
        return this.LJLLLLLL;
    }

    public final long getSelectTimeMiles() {
        return this.LJLLL;
    }

    public final int getState() {
        return this.LJLLLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C158326Jg(Context context) {
        super(context);
        new LinkedHashMap();
        this.LJLLI = new C158426Jq();
        this.LJLLLL = 1;
        LJIIIIZZ();
    }

    public static String LJ(String str) {
        if (CastIntegerProtector.parseInt(str) < 10) {
            return QZZ.LIZIZ('0', str);
        }
        return str;
    }

    public final void LIZ(CountDownStickerStruct liveCDStruct) {
        long j;
        o.LJIIIZ(liveCDStruct, "liveCDStruct");
        C158396Jn c158396Jn = this.LJLJI;
        if (c158396Jn != null) {
            String title = liveCDStruct.getTitle();
            if (title == null) {
                title = "";
            }
            c158396Jn.setText(title);
            Long expiredTime = liveCDStruct.getExpiredTime();
            if (expiredTime != null) {
                j = expiredTime.longValue();
            } else {
                j = 0;
            }
            this.LJLLL = j;
            C158366Jk LJIL = C77123UOp.LJIL(j, System.currentTimeMillis());
            LJII(LJIL.LIZ, LJIL.LIZIZ, LJIL.LIZJ, LJIL.LIZLLL, false);
            InterfaceC158496Jx interfaceC158496Jx = this.LJZ;
            if (interfaceC158496Jx != null) {
                C158396Jn c158396Jn2 = this.LJLJI;
                if (c158396Jn2 != null) {
                    interfaceC158496Jx.LIZ(String.valueOf(c158396Jn2.getText()));
                    return;
                } else {
                    o.LJIJI("edLiveTitle");
                    throw null;
                }
            }
            return;
        }
        o.LJIJI("edLiveTitle");
        throw null;
    }

    @Override // X.InterfaceC1549166d
    public final int LJIIZILJ(int i) {
        C1558669u c1558669u = this.LJZL;
        if (c1558669u != null && LJFF()) {
            return c1558669u.LJLJI;
        }
        return i;
    }

    @Override // X.InterfaceC1549166d
    public final int LJJII(int i) {
        C1558669u c1558669u = this.LJZL;
        if (c1558669u != null && LJFF()) {
            return c1558669u.LJLILLLLZI;
        }
        return 0;
    }

    @Override // X.InterfaceC1549166d
    public final int LJJJZ(int i) {
        C1558669u c1558669u = this.LJZL;
        if (c1558669u != null && LJFF()) {
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

    public final void setController(C6JV c6jv) {
        this.LJZI = c6jv;
    }

    public final void setEditCurrentSticker(boolean z) {
        this.LJLLILLLL = z;
    }

    public final void setEditEnable(boolean z) {
        C158396Jn c158396Jn = this.LJLJI;
        if (c158396Jn != null) {
            c158396Jn.setEnabled(z);
            C158376Jl c158376Jl = this.LJLILLLLZI;
            if (c158376Jl != null) {
                c158376Jl.setEnabled(z);
                return;
            } else {
                o.LJIJI("llCountDown");
                throw null;
            }
        }
        o.LJIJI("edLiveTitle");
        throw null;
    }

    @Override // X.InterfaceC1549266e
    public void setEndTime(int i) {
        C1558669u c1558669u = this.LJZL;
        if (c1558669u == null) {
            return;
        }
        c1558669u.LJLJI = i;
    }

    public final void setHintTextStateChanged(InterfaceC158456Jt interfaceC158456Jt) {
        this.LJLZ = interfaceC158456Jt;
    }

    public final void setInEditMode(boolean z) {
        this.LLF = z;
    }

    public final void setLiveCDEditStateListener(InterfaceC158496Jx interfaceC158496Jx) {
        this.LJZ = interfaceC158496Jx;
    }

    public final void setLiveCDStickerInterface(InterfaceC158446Js interfaceC158446Js) {
        this.LJLLLLLL = interfaceC158446Js;
    }

    public final void setLiveCDStickerTimeEditData(C1558669u c1558669u) {
        this.LJZL = c1558669u;
    }

    public final void setPlayPosition(long j) {
        this.LL = j;
    }

    public final void setSelectTimeMiles(long j) {
        this.LJLLL = j;
    }

    @Override // X.InterfaceC1549266e
    public void setStartTime(int i) {
        C1558669u c1558669u = this.LJZL;
        if (c1558669u == null) {
            return;
        }
        c1558669u.LJLILLLLZI = i;
    }

    public final void setState(int i) {
        this.LJLLLL = i;
    }

    public final void setTouchEnable(boolean z) {
        C158396Jn c158396Jn = this.LJLJI;
        if (c158396Jn != null) {
            c158396Jn.setMode(z);
            C158376Jl c158376Jl = this.LJLILLLLZI;
            if (c158376Jl != null) {
                c158376Jl.setMode(z);
                return;
            } else {
                o.LJIJI("llCountDown");
                throw null;
            }
        }
        o.LJIJI("edLiveTitle");
        throw null;
    }

    public final void setTouching(boolean z) {
        this.LLD = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C158326Jg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C04560Fw.LIZ(context, "context", attributeSet, "attr");
        this.LJLLI = new C158426Jq();
        this.LJLLLL = 1;
        LJIIIIZZ();
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
        C6JV c6jv = this.LJZI;
        if (c6jv != null) {
            interactStickerStruct = c6jv.getInteractStickerStruct();
        } else {
            interactStickerStruct = null;
        }
        NormalTrackTimeStamp LIZIZ2 = C164826dS.LIZIZ(interactStickerStruct);
        C1558669u c1558669u3 = this.LJZL;
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
            C6JV c6jv2 = this.LJZI;
            if (c6jv2 != null) {
                c6jv2.LJJIIZ(false);
            }
            C6JV c6jv3 = this.LJZI;
            if (c6jv3 != null) {
                c6jv3.LJJIIJZLJL(c1558669u2.LJLIL, Boolean.FALSE);
            }
            C6JV c6jv4 = this.LJZI;
            if (c6jv4 != null) {
                c6jv4.LJJIIZ(true);
            }
        }
    }

    public final void LJII(String str, String str2, String str3, String str4, boolean z) {
        C43588H8u.LIZLLL(str, "days", str2, "hours", str3, "minutes", str4, "seconds");
        if (z) {
            TuxTextView tuxTextView = this.LJLJJI;
            if (tuxTextView != null) {
                tuxTextView.setText(LJ(str2));
                TuxTextView tuxTextView2 = this.LJLJJL;
                if (tuxTextView2 != null) {
                    tuxTextView2.setText(LJ(str3));
                    TuxTextView tuxTextView3 = this.LJLJJLL;
                    if (tuxTextView3 != null) {
                        tuxTextView3.setText(LJ(str4));
                        TuxTextView tuxTextView4 = this.LJLJL;
                        if (tuxTextView4 != null) {
                            tuxTextView4.setVisibility(4);
                            TuxTextView tuxTextView5 = this.LJLJLJ;
                            if (tuxTextView5 != null) {
                                tuxTextView5.setVisibility(4);
                                TuxTextView tuxTextView6 = this.LJLJLLL;
                                if (tuxTextView6 != null) {
                                    tuxTextView6.setVisibility(4);
                                    return;
                                } else {
                                    o.LJIJI("tvCountDownThirdHint");
                                    throw null;
                                }
                            }
                            o.LJIJI("tvCountDownSecondHint");
                            throw null;
                        }
                        o.LJIJI("tvCountDownFirstHint");
                        throw null;
                    }
                    o.LJIJI("tvCountDownThird");
                    throw null;
                }
                o.LJIJI("tvCountDownSecond");
                throw null;
            }
            o.LJIJI("tvCountDownFirst");
            throw null;
        }
        TuxTextView tuxTextView7 = this.LJLJL;
        if (tuxTextView7 != null) {
            tuxTextView7.setVisibility(0);
            TuxTextView tuxTextView8 = this.LJLJLJ;
            if (tuxTextView8 != null) {
                tuxTextView8.setVisibility(0);
                TuxTextView tuxTextView9 = this.LJLJLLL;
                if (tuxTextView9 != null) {
                    tuxTextView9.setVisibility(0);
                    if (CastIntegerProtector.parseInt(str) == 0) {
                        TuxTextView tuxTextView10 = this.LJLJL;
                        if (tuxTextView10 != null) {
                            tuxTextView10.setText(getContext().getResources().getText(R.string.dx4));
                            TuxTextView tuxTextView11 = this.LJLJLJ;
                            if (tuxTextView11 != null) {
                                tuxTextView11.setText(getContext().getResources().getText(R.string.dx5));
                                TuxTextView tuxTextView12 = this.LJLJLLL;
                                if (tuxTextView12 != null) {
                                    tuxTextView12.setText(getContext().getResources().getText(R.string.dx_));
                                    TuxTextView tuxTextView13 = this.LJLJJI;
                                    if (tuxTextView13 != null) {
                                        tuxTextView13.setText(LJ(str2));
                                        TuxTextView tuxTextView14 = this.LJLJJL;
                                        if (tuxTextView14 != null) {
                                            tuxTextView14.setText(LJ(str3));
                                            TuxTextView tuxTextView15 = this.LJLJJLL;
                                            if (tuxTextView15 != null) {
                                                tuxTextView15.setText(LJ(str4));
                                                return;
                                            } else {
                                                o.LJIJI("tvCountDownThird");
                                                throw null;
                                            }
                                        }
                                        o.LJIJI("tvCountDownSecond");
                                        throw null;
                                    }
                                    o.LJIJI("tvCountDownFirst");
                                    throw null;
                                }
                                o.LJIJI("tvCountDownThirdHint");
                                throw null;
                            }
                            o.LJIJI("tvCountDownSecondHint");
                            throw null;
                        }
                        o.LJIJI("tvCountDownFirstHint");
                        throw null;
                    }
                    TuxTextView tuxTextView16 = this.LJLJL;
                    if (tuxTextView16 != null) {
                        tuxTextView16.setText(getContext().getResources().getText(R.string.dwu));
                        TuxTextView tuxTextView17 = this.LJLJLJ;
                        if (tuxTextView17 != null) {
                            tuxTextView17.setText(getContext().getResources().getText(R.string.dx4));
                            TuxTextView tuxTextView18 = this.LJLJLLL;
                            if (tuxTextView18 != null) {
                                tuxTextView18.setText(getContext().getResources().getText(R.string.dx5));
                                TuxTextView tuxTextView19 = this.LJLJJI;
                                if (tuxTextView19 != null) {
                                    tuxTextView19.setText(LJ(str));
                                    TuxTextView tuxTextView20 = this.LJLJJL;
                                    if (tuxTextView20 != null) {
                                        tuxTextView20.setText(LJ(str2));
                                        TuxTextView tuxTextView21 = this.LJLJJLL;
                                        if (tuxTextView21 != null) {
                                            tuxTextView21.setText(LJ(str3));
                                            return;
                                        } else {
                                            o.LJIJI("tvCountDownThird");
                                            throw null;
                                        }
                                    }
                                    o.LJIJI("tvCountDownSecond");
                                    throw null;
                                }
                                o.LJIJI("tvCountDownFirst");
                                throw null;
                            }
                            o.LJIJI("tvCountDownThirdHint");
                            throw null;
                        }
                        o.LJIJI("tvCountDownSecondHint");
                        throw null;
                    }
                    o.LJIJI("tvCountDownFirstHint");
                    throw null;
                }
                o.LJIJI("tvCountDownThirdHint");
                throw null;
            }
            o.LJIJI("tvCountDownSecondHint");
            throw null;
        }
        o.LJIJI("tvCountDownFirstHint");
        throw null;
    }
}
