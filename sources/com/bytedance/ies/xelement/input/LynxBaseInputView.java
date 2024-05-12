package com.bytedance.ies.xelement.input;

import X.C41997Ge1;
import X.C61590OFe;
import X.C61592OFg;
import X.C78996UzQ;
import X.C79411VEp;
import X.C79756VRw;
import X.EWS;
import X.EnumC217578gL;
import X.F5B;
import X.GSY;
import X.VNA;
import X.VNU;
import X.VPD;
import X.VPF;
import X.VPR;
import X.VSE;
import X.VSF;
import X.VSG;
import X.VSH;
import X.VSI;
import X.VSJ;
import X.VSK;
import X.X1D;
import Y.ARunnableS50S0100000_14;
import Y.IDLListenerS199S0100000_14;
import Y.IDObjectS185S0100000_14;
import Y.IDTListenerS122S0100000_14;
import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.AbsoluteSizeSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.utils.ColorUtils;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class LynxBaseInputView extends LynxUI<EditText> {
    public C41997Ge1 LJLIL;
    public int LJLILLLLZI;
    public String LJLJI;
    public float LJLJJI;
    public boolean LJLJJL;
    public int LJLJJLL;
    public boolean LJLJL;
    public int LJLJLJ;
    public boolean LJLJLLL;
    public int LJLL;
    public String LJLLI;
    public String LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;
    public boolean LJZ;
    public boolean LJZI;
    public boolean LJZL;
    public boolean LL;
    public boolean LLD;
    public float LLF;
    public int LLFF;
    public boolean LLFFF;
    public int LLFII;
    public boolean LLFZ;
    public boolean LLI;
    public VSE LLIFFJFJJ;
    public boolean LLII;
    public boolean LLIIII;
    public int LLIIIILZ;
    public int LLIIIJ;
    public final VSG LLIIIL;
    public boolean LLIIIZ;
    public boolean LLIIJI;
    public boolean LLIIJLIL;

    public static int LJJIIJ(int i) {
        return (i == 100 || i == 200 || i == 300 || i == 400 || !(i == 500 || i == 600 || i == 700 || i == 800 || i == 900)) ? 0 : 1;
    }

    public void LJIL() {
    }

    public void LJJI(C41997Ge1 editText) {
        o.LJIIJ(editText, "editText");
    }

    public void LJJIFFI(C41997Ge1 editText, String str) {
        o.LJIIJ(editText, "editText");
    }

    public int LJJII() {
        return 0;
    }

    public final void LJJIII() {
        C41997Ge1 c41997Ge1 = this.LJLIL;
        if (c41997Ge1 != null) {
            if (!c41997Ge1.requestFocus()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("requestFocus failed, input hasSize=");
                LIZ.append(LJJIIJZLJL());
                LLog.LIZLLL(4, "LynxBaseInputView", X1D.LIZIZ(LIZ));
            }
            VNU lynxContext = this.mContext;
            o.LJFF(lynxContext, "lynxContext");
            lynxContext.LJLJJLL.LJ = this;
            return;
        }
        o.LJIJI("mEditText");
        throw null;
    }

    public final boolean LJJIIJZLJL() {
        C41997Ge1 c41997Ge1 = this.LJLIL;
        if (c41997Ge1 != null) {
            int bottom = c41997Ge1.getBottom();
            C41997Ge1 c41997Ge12 = this.LJLIL;
            if (c41997Ge12 != null) {
                if (bottom > c41997Ge12.getTop()) {
                    C41997Ge1 c41997Ge13 = this.LJLIL;
                    if (c41997Ge13 != null) {
                        int right = c41997Ge13.getRight();
                        C41997Ge1 c41997Ge14 = this.LJLIL;
                        if (c41997Ge14 != null) {
                            if (right > c41997Ge14.getLeft()) {
                                return true;
                            }
                        } else {
                            o.LJIJI("mEditText");
                            throw null;
                        }
                    } else {
                        o.LJIJI("mEditText");
                        throw null;
                    }
                }
                return false;
            }
            o.LJIJI("mEditText");
            throw null;
        }
        o.LJIJI("mEditText");
        throw null;
    }

    public final void LJJIIZ() {
        C41997Ge1 c41997Ge1 = this.LJLIL;
        if (c41997Ge1 != null) {
            c41997Ge1.post(new ARunnableS50S0100000_14(this, 18));
        } else {
            o.LJIJI("mEditText");
            throw null;
        }
    }

    public void LJJIJ() {
        Typeface typeface;
        int LJJIIJ = LJJIIJ(this.LJLL);
        String str = this.LJLLI;
        if (str != null) {
            typeface = C61590OFe.LIZJ(LJJIIJ, this.mContext, str);
            if (typeface == null) {
                LLog.LIZLLL(2, "LynxBaseInputView", "font-face is not found in TypefaceCache");
                typeface = C61592OFg.LIZ.LIZJ(this.mContext, this.LJLLI, LJJIIJ, new VSJ(this));
                if (typeface == null) {
                    LLog.LIZLLL(2, "LynxBaseInputView", "font-face is not loaded, use default font");
                }
            }
        } else {
            typeface = null;
        }
        if (typeface == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                C41997Ge1 c41997Ge1 = this.LJLIL;
                if (c41997Ge1 != null) {
                    TextPaint textPaint = c41997Ge1.getPaint();
                    o.LJFF(textPaint, "textPaint");
                    textPaint.setTypeface(Typeface.create(textPaint.getTypeface(), this.LJLL, false));
                    return;
                }
                o.LJIJI("mEditText");
                throw null;
            }
            C41997Ge1 c41997Ge12 = this.LJLIL;
            if (c41997Ge12 != null) {
                c41997Ge12.setTypeface(Typeface.create(c41997Ge12.getTypeface(), LJJIIJ));
                return;
            } else {
                o.LJIJI("mEditText");
                throw null;
            }
        }
        C41997Ge1 c41997Ge13 = this.LJLIL;
        if (c41997Ge13 != null) {
            c41997Ge13.setTypeface(Typeface.create(typeface, LJJIIJ));
        } else {
            o.LJIJI("mEditText");
            throw null;
        }
    }

    public void LJJIJIIJI() {
        Typeface LIZJ;
        if (this.LJLJI == null) {
            return;
        }
        int LJJIIJ = LJJIIJ(this.LJLJLJ);
        if (this.LJLLJ || this.LJLLI != null) {
            LIZJ = C61590OFe.LIZJ(LJJIIJ, this.mContext, this.LJLLILLLL);
            if (LIZJ == null) {
                LLog.LIZLLL(2, "LynxBaseInputView", "font-face is not found in TypefaceCache");
                LIZJ = C61592OFg.LIZ.LIZJ(this.mContext, this.LJLLILLLL, LJJIIJ, new VSK(this));
                if (LIZJ == null) {
                    LLog.LIZLLL(2, "LynxBaseInputView", "font-face is not loaded, use default font");
                }
            }
        } else {
            LIZJ = null;
        }
        if (LIZJ == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                C41997Ge1 c41997Ge1 = this.LJLIL;
                if (c41997Ge1 != null) {
                    TextPaint textPaint = c41997Ge1.getPaint();
                    o.LJFF(textPaint, "textPaint");
                    LIZJ = Typeface.create(textPaint.getTypeface(), this.LJLJLJ, false);
                } else {
                    o.LJIJI("mEditText");
                    throw null;
                }
            } else {
                C41997Ge1 c41997Ge12 = this.LJLIL;
                if (c41997Ge12 != null) {
                    LIZJ = Typeface.create(c41997Ge12.getTypeface(), LJJIIJ);
                } else {
                    o.LJIJI("mEditText");
                    throw null;
                }
            }
        }
        SpannableString spannableString = new SpannableString(this.LJLJI);
        int length = spannableString.length();
        spannableString.setSpan(new AbsoluteSizeSpan((int) this.LJLJJI, false), 0, length, 33);
        if (LIZJ != null) {
            spannableString.setSpan(new C79756VRw(LIZJ), 0, length, 33);
        }
        C41997Ge1 c41997Ge13 = this.LJLIL;
        if (c41997Ge13 != null) {
            c41997Ge13.setHint(spannableString);
            if (this.LJLJL) {
                C41997Ge1 c41997Ge14 = this.LJLIL;
                if (c41997Ge14 != null) {
                    c41997Ge14.setHintTextColor(this.LJLJJLL);
                    this.LJLJL = false;
                    return;
                } else {
                    o.LJIJI("mEditText");
                    throw null;
                }
            }
            return;
        }
        o.LJIJI("mEditText");
        throw null;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void destroy() {
        VSG vsg = this.LLIIIL;
        if (vsg.LIZJ != null) {
            VPF vpf = vsg.LJFF;
            C41997Ge1 c41997Ge1 = vsg.LJ;
            vpf.getClass();
            try {
                if (vpf.LJ != null) {
                    vpf.LJIIJ.remove(c41997Ge1);
                }
            } catch (Exception unused) {
            }
        }
        super.destroy();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.VPY
    public final boolean isFocusable() {
        C41997Ge1 c41997Ge1 = this.LJLIL;
        if (c41997Ge1 != null) {
            return c41997Ge1.isFocusable();
        }
        o.LJIJI("mEditText");
        throw null;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final int getOverflow() {
        return super.getOverflow();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void layout() {
        super.layout();
        if (LJJIIJZLJL() && this.LLIIJI) {
            setFocus(true);
            this.LLIIJI = false;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onLayoutUpdated() {
        super.onLayoutUpdated();
        int i = this.mPaddingTop + this.mBorderTopWidth;
        int i2 = this.mPaddingBottom + this.mBorderBottomWidth;
        int i3 = this.mPaddingLeft + this.mBorderLeftWidth;
        int i4 = this.mPaddingRight + this.mBorderRightWidth;
        C41997Ge1 c41997Ge1 = this.LJLIL;
        if (c41997Ge1 != null) {
            c41997Ge1.setPadding(i3, i, i4, i2);
        } else {
            o.LJIJI("mEditText");
            throw null;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onPropsUpdated() {
        super.onPropsUpdated();
        if (this.LJLLL) {
            LJJIJ();
            this.LJLLL = false;
        }
        if (this.LJLLLL && this.LJLJI != null) {
            LJJIJIIJI();
            this.LJLLLL = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LynxBaseInputView(VNU context) {
        super(context);
        o.LJIIJ(context, "context");
        this.LJLILLLLZI = UserLevelGeckoUpdateSetting.DEFAULT;
        this.LJLJLJ = LiveChatShowDelayForHotLiveSetting.DEFAULT;
        this.LJLL = LiveChatShowDelayForHotLiveSetting.DEFAULT;
        this.LLFII = Integer.MAX_VALUE;
        this.LLIIIILZ = 1;
        this.LLIIIL = new VSG(this);
    }

    public static final /* synthetic */ C41997Ge1 LJIJJLI(LynxBaseInputView lynxBaseInputView) {
        C41997Ge1 c41997Ge1 = lynxBaseInputView.LJLIL;
        if (c41997Ge1 != null) {
            return c41997Ge1;
        }
        o.LJIJI("mEditText");
        throw null;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    /* renamed from: LJJ */
    public C41997Ge1 createView(Context context) {
        if (context != null) {
            C41997Ge1 c41997Ge1 = new C41997Ge1(context);
            this.LJLIL = c41997Ge1;
            VSE vse = new VSE(this);
            this.LLIFFJFJJ = vse;
            c41997Ge1.setFilters(new InputFilter[]{vse});
            c41997Ge1.addTextChangedListener(new IDObjectS185S0100000_14(this, 0));
            c41997Ge1.setOnFocusChangeListener(new VSH(c41997Ge1, this));
            c41997Ge1.setBackground(null);
            c41997Ge1.setImeOptions(1);
            C41997Ge1 c41997Ge12 = this.LJLIL;
            if (c41997Ge12 != null) {
                LJJI(c41997Ge12);
                C41997Ge1 c41997Ge13 = this.LJLIL;
                if (c41997Ge13 != null) {
                    c41997Ge13.setOnTouchListener(new IDTListenerS122S0100000_14(this, 0));
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 26 && i <= 27) {
                        C41997Ge1 c41997Ge14 = this.LJLIL;
                        if (c41997Ge14 != null) {
                            c41997Ge14.setLayerType(1, null);
                            C41997Ge1 c41997Ge15 = this.LJLIL;
                            if (c41997Ge15 != null) {
                                c41997Ge15.setImportantForAutofill(2);
                            } else {
                                o.LJIJI("mEditText");
                                throw null;
                            }
                        } else {
                            o.LJIJI("mEditText");
                            throw null;
                        }
                    }
                    float LIZJ = VPR.LIZJ("14px", 0.0f, 0.0f);
                    this.mFontSize = LIZJ;
                    this.LJLJJI = LIZJ;
                    C41997Ge1 c41997Ge16 = this.LJLIL;
                    if (c41997Ge16 != null) {
                        c41997Ge16.setTextSize(0, LIZJ);
                        C41997Ge1 c41997Ge17 = this.LJLIL;
                        if (c41997Ge17 != null) {
                            c41997Ge17.setTextColor(-16777216);
                            C41997Ge1 c41997Ge18 = this.LJLIL;
                            if (c41997Ge18 != null) {
                                c41997Ge18.setInputType(c41997Ge18.getInputType() | 524288);
                                C41997Ge1 c41997Ge19 = this.LJLIL;
                                if (c41997Ge19 != null) {
                                    c41997Ge19.setFocusableInTouchMode(true);
                                    C41997Ge1 c41997Ge110 = this.LJLIL;
                                    if (c41997Ge110 != null) {
                                        return c41997Ge110;
                                    }
                                    o.LJIJI("mEditText");
                                    throw null;
                                }
                                o.LJIJI("mEditText");
                                throw null;
                            }
                            o.LJIJI("mEditText");
                            throw null;
                        }
                        o.LJIJI("mEditText");
                        throw null;
                    }
                    o.LJIJI("mEditText");
                    throw null;
                }
                o.LJIJI("mEditText");
                throw null;
            }
            o.LJIJI("mEditText");
            throw null;
        }
        o.LJIIZILJ();
        throw null;
    }

    @EWS
    public final void blur(Callback callback) {
        C41997Ge1 c41997Ge1 = this.LJLIL;
        if (c41997Ge1 != null) {
            if (c41997Ge1.isFocused()) {
                setFocus(false);
                C41997Ge1 c41997Ge12 = this.LJLIL;
                if (c41997Ge12 != null) {
                    if (!c41997Ge12.isFocused()) {
                        if (callback != null) {
                            callback.invoke(0, "Success to blur.");
                            return;
                        }
                        return;
                    } else {
                        if (callback == null) {
                            return;
                        }
                        callback.invoke(1, "Fail to blur.");
                        return;
                    }
                }
                o.LJIJI("mEditText");
                throw null;
            }
            if (callback == null) {
                return;
            }
            callback.invoke(1, "Target is not focused now.");
            return;
        }
        o.LJIJI("mEditText");
        throw null;
    }

    @EWS
    public final void focus(Callback callback) {
        setFocus(true);
        C41997Ge1 c41997Ge1 = this.LJLIL;
        if (c41997Ge1 != null) {
            if (c41997Ge1.isFocused()) {
                if (callback != null) {
                    callback.invoke(0, "Success to focus.");
                    return;
                }
                return;
            } else {
                if (callback == null) {
                    return;
                }
                callback.invoke(1, "Fail to focus.");
                return;
            }
        }
        o.LJIJI("mEditText");
        throw null;
    }

    @EWS
    public final void getSelection(Callback callback) {
        C41997Ge1 c41997Ge1 = this.LJLIL;
        if (c41997Ge1 != null) {
            if (c41997Ge1.isFocused()) {
                JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
                C41997Ge1 c41997Ge12 = this.LJLIL;
                if (c41997Ge12 != null) {
                    javaOnlyMap.putInt("selectionStart", c41997Ge12.getSelectionStart());
                    C41997Ge1 c41997Ge13 = this.LJLIL;
                    if (c41997Ge13 != null) {
                        javaOnlyMap.putInt("selectionEnd", c41997Ge13.getSelectionEnd());
                        if (callback != null) {
                            callback.invoke(0, javaOnlyMap);
                            return;
                        }
                        return;
                    }
                    o.LJIJI("mEditText");
                    throw null;
                }
                o.LJIJI("mEditText");
                throw null;
            }
            if (callback == null) {
                return;
            }
            callback.invoke(1, "Target is not focused now.");
            return;
        }
        o.LJIJI("mEditText");
        throw null;
    }

    @EWS
    public final void select(Callback callback) {
        C41997Ge1 c41997Ge1 = this.LJLIL;
        if (c41997Ge1 != null) {
            if (c41997Ge1.getText() != null) {
                C41997Ge1 c41997Ge12 = this.LJLIL;
                if (c41997Ge12 != null) {
                    Editable text = c41997Ge12.getText();
                    if (text != null) {
                        c41997Ge12.setSelection(0, text.length());
                        if (callback != null) {
                            callback.invoke(0, "Success.");
                            return;
                        }
                        return;
                    }
                    o.LJIIZILJ();
                    throw null;
                }
                o.LJIJI("mEditText");
                throw null;
            }
            if (callback == null) {
                return;
            }
            callback.invoke(1, "Input is not ready.");
            return;
        }
        o.LJIJI("mEditText");
        throw null;
    }

    @VPD(name = "adjust-mode")
    public final void setAdjustMode(String str) {
        if (str == null) {
            str = "end";
        }
        VSG vsg = this.LLIIIL;
        vsg.getClass();
        vsg.LJIIIIZZ = str;
    }

    @VPD(defaultBoolean = false, name = "auto-fill")
    public final void setAutoFill(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            if (!z) {
                C41997Ge1 c41997Ge1 = this.LJLIL;
                if (c41997Ge1 != null) {
                    c41997Ge1.setImportantForAutofill(2);
                    return;
                } else {
                    o.LJIJI("mEditText");
                    throw null;
                }
            }
            C41997Ge1 c41997Ge12 = this.LJLIL;
            if (c41997Ge12 != null) {
                c41997Ge12.setImportantForAutofill(1);
                return;
            } else {
                o.LJIJI("mEditText");
                throw null;
            }
        }
        LLog.LIZLLL(3, "LynxBaseInputView", "auto fill require android version above 8");
    }

    @VPD(defaultBoolean = true, name = "auto-fit")
    public final void setAutoFit(boolean z) {
        this.LLIIIL.LJIIIZ = z;
    }

    @VPD(defaultBoolean = false, name = "keyboard-hide-blur")
    public final void setBlurKeyboardHide(boolean z) {
        this.LLIIII = z;
    }

    @VPD(name = "bottom-inset")
    public final void setBottomInset(String str) {
        if (str == null) {
            str = "0px";
        }
        VSG vsg = this.LLIIIL;
        vsg.getClass();
        vsg.LJIIJ = (int) VPR.LIZIZ(str, 0.0f);
    }

    @VPD(defaultBoolean = false, name = "compat-number-type")
    public final void setCompatNumberType(boolean z) {
        this.LLIIJLIL = z;
        LJIL();
    }

    @VPD(name = "confirm-type")
    public final void setConfirmType(String str) {
        if (str == null) {
            str = "done";
        }
        switch (str.hashCode()) {
            case -906336856:
                if (!str.equals("search")) {
                    return;
                }
                C41997Ge1 c41997Ge1 = this.LJLIL;
                if (c41997Ge1 != null) {
                    c41997Ge1.setImeOptions(3);
                    return;
                } else {
                    o.LJIJI("mEditText");
                    throw null;
                }
            case 3304:
                if (!str.equals("go")) {
                    return;
                }
                C41997Ge1 c41997Ge12 = this.LJLIL;
                if (c41997Ge12 != null) {
                    c41997Ge12.setImeOptions(2);
                    return;
                } else {
                    o.LJIJI("mEditText");
                    throw null;
                }
            case 3089282:
                if (!str.equals("done")) {
                    return;
                }
                C41997Ge1 c41997Ge13 = this.LJLIL;
                if (c41997Ge13 != null) {
                    c41997Ge13.setImeOptions(6);
                    return;
                } else {
                    o.LJIJI("mEditText");
                    throw null;
                }
            case 3377907:
                if (!str.equals("next")) {
                    return;
                }
                C41997Ge1 c41997Ge14 = this.LJLIL;
                if (c41997Ge14 != null) {
                    c41997Ge14.setImeOptions(5);
                    return;
                } else {
                    o.LJIJI("mEditText");
                    throw null;
                }
            case 3526536:
                if (!str.equals("send")) {
                    return;
                }
                C41997Ge1 c41997Ge15 = this.LJLIL;
                if (c41997Ge15 != null) {
                    c41997Ge15.setImeOptions(4);
                    return;
                } else {
                    o.LJIJI("mEditText");
                    throw null;
                }
            default:
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if (r5 != null) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048 A[Catch: all -> 0x0072, TryCatch #0 {all -> 0x0072, blocks: (B:10:0x0022, B:15:0x002c, B:17:0x0048, B:19:0x0051, B:20:0x005e, B:33:0x0028), top: B:9:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @X.VPD(name = "caret-color")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setCursorColor(java.lang.String r11) {
        /*
            r10 = this;
            if (r11 != 0) goto L3
            return
        L3:
            X.Ge1 r2 = r10.LJLIL
            java.lang.String r9 = "mEditText"
            r8 = 0
            if (r2 == 0) goto La2
            int r7 = com.lynx.tasm.utils.ColorUtils.LIZ(r11)
            r3 = 1
            java.lang.Class<android.widget.TextView> r1 = android.widget.TextView.class
            java.lang.String r0 = "mEditor"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch: java.lang.Throwable -> L1b
            r0.setAccessible(r3)     // Catch: java.lang.Throwable -> L1b
            goto L22
        L1b:
            r0 = r8
        L1c:
            r5 = r2
            if (r0 != 0) goto L28
            java.lang.Class<android.widget.TextView> r6 = android.widget.TextView.class
            goto L2c
        L22:
            java.lang.Object r5 = r0.get(r2)     // Catch: java.lang.Throwable -> L72
            if (r5 == 0) goto L1c
        L28:
            java.lang.Class r6 = r5.getClass()     // Catch: java.lang.Throwable -> L72
        L2c:
            java.lang.Class<android.widget.TextView> r1 = android.widget.TextView.class
            java.lang.String r0 = "mCursorDrawableRes"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch: java.lang.Throwable -> L72
            r0.setAccessible(r3)     // Catch: java.lang.Throwable -> L72
            int r2 = r0.getInt(r2)     // Catch: java.lang.Throwable -> L72
            X.VNU r1 = r10.mContext     // Catch: java.lang.Throwable -> L72
            java.lang.String r0 = "lynxContext"
            kotlin.jvm.internal.o.LJFF(r1, r0)     // Catch: java.lang.Throwable -> L72
            android.graphics.drawable.Drawable r4 = r1.getDrawable(r2)     // Catch: java.lang.Throwable -> L72
            if (r4 == 0) goto L72
            r4.setTint(r7)     // Catch: java.lang.Throwable -> L72
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L72
            r0 = 28
            if (r1 < r0) goto L5e
            java.lang.String r0 = "mDrawableForCursor"
            java.lang.reflect.Field r0 = r6.getDeclaredField(r0)     // Catch: java.lang.Throwable -> L72
            r0.setAccessible(r3)     // Catch: java.lang.Throwable -> L72
            r0.set(r5, r4)     // Catch: java.lang.Throwable -> L72
            goto L72
        L5e:
            java.lang.String r0 = "mCursorDrawable"
            java.lang.reflect.Field r2 = r6.getDeclaredField(r0)     // Catch: java.lang.Throwable -> L72
            r2.setAccessible(r3)     // Catch: java.lang.Throwable -> L72
            r0 = 2
            android.graphics.drawable.Drawable[] r1 = new android.graphics.drawable.Drawable[r0]     // Catch: java.lang.Throwable -> L72
            r0 = 0
            r1[r0] = r4     // Catch: java.lang.Throwable -> L72
            r1[r3] = r4     // Catch: java.lang.Throwable -> L72
            r2.set(r5, r1)     // Catch: java.lang.Throwable -> L72
        L72:
            java.lang.String r0 = "transparent"
            boolean r0 = kotlin.jvm.internal.o.LJ(r11, r0)
            if (r0 == 0) goto La1
            java.lang.Class<android.widget.TextView> r1 = android.widget.TextView.class
            java.lang.String r0 = "mTextSelectHandleRes"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r0)     // Catch: java.lang.Throwable -> L99
            java.lang.String r0 = "TextView::class.java.get…d(\"mTextSelectHandleRes\")"
            kotlin.jvm.internal.o.LJFF(r2, r0)     // Catch: java.lang.Throwable -> L99
            r2.setAccessible(r3)     // Catch: java.lang.Throwable -> L99
            X.Ge1 r1 = r10.LJLIL     // Catch: java.lang.Throwable -> L99
            if (r1 == 0) goto L95
            r0 = 17170445(0x106000d, float:2.461195E-38)
            r2.setInt(r1, r0)     // Catch: java.lang.Throwable -> L99
            goto La1
        L95:
            kotlin.jvm.internal.o.LJIJI(r9)     // Catch: java.lang.Throwable -> L99
            throw r8     // Catch: java.lang.Throwable -> L99
        L99:
            r2 = 3
            java.lang.String r1 = "LynxBaseInputView"
            java.lang.String r0 = "Failed to set transparent text select handle"
            com.lynx.tasm.base.LLog.LIZLLL(r2, r1, r0)
        La1:
            return
        La2:
            kotlin.jvm.internal.o.LJIJI(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.input.LynxBaseInputView.setCursorColor(java.lang.String):void");
    }

    @VPD(defaultBoolean = false, name = "disabled")
    public final void setDisable(boolean z) {
        C41997Ge1 c41997Ge1 = this.LJLIL;
        if (c41997Ge1 != null) {
            c41997Ge1.setEnabled(!z);
            C41997Ge1 c41997Ge12 = this.LJLIL;
            if (c41997Ge12 != null) {
                c41997Ge12.setFocusable(!z);
                C41997Ge1 c41997Ge13 = this.LJLIL;
                if (c41997Ge13 != null) {
                    c41997Ge13.setFocusableInTouchMode(!z);
                    return;
                } else {
                    o.LJIJI("mEditText");
                    throw null;
                }
            }
            o.LJIJI("mEditText");
            throw null;
        }
        o.LJIJI("mEditText");
        throw null;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setEvents(Map<String, VNA> map) {
        super.setEvents(map);
        if (map != null) {
            this.LJZI = map.containsKey("blur");
            this.LJZL = map.containsKey("confirm");
            this.LJZ = map.containsKey("focus");
            this.LJLZ = map.containsKey("input");
            this.LL = map.containsKey("length");
        }
    }

    @VPD(defaultBoolean = false, name = "focus")
    public final void setFocus(boolean z) {
        if (!LJJIIJZLJL() && z) {
            this.LLIIJI = true;
            return;
        }
        if (z) {
            LJJIII();
            if (this.LLII) {
                LJJIIZ();
                return;
            }
            VNU lynxContext = this.mContext;
            o.LJFF(lynxContext, "lynxContext");
            VSF vsf = new VSF(lynxContext, this);
            C41997Ge1 c41997Ge1 = this.LJLIL;
            if (c41997Ge1 != null) {
                c41997Ge1.post(vsf);
                return;
            } else {
                o.LJIJI("mEditText");
                throw null;
            }
        }
        C41997Ge1 c41997Ge12 = this.LJLIL;
        if (c41997Ge12 != null) {
            if (!c41997Ge12.isFocused()) {
                return;
            }
            C41997Ge1 c41997Ge13 = this.LJLIL;
            if (c41997Ge13 != null) {
                c41997Ge13.clearFocus();
                if (this.LLII) {
                    return;
                }
                LJJIIZ();
                return;
            }
            o.LJIJI("mEditText");
            throw null;
        }
        o.LJIJI("mEditText");
        throw null;
    }

    @VPD(defaultInt = -16777216, name = "color")
    public final void setFontColor(F5B color) {
        o.LJIIJ(color, "color");
        ReadableType type = color.getType();
        if (type != null) {
            int i = VSI.LIZ[type.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    C41997Ge1 c41997Ge1 = this.LJLIL;
                    if (c41997Ge1 != null) {
                        c41997Ge1.setTextColor(ColorUtils.LIZ(color.asString()));
                        return;
                    } else {
                        o.LJIJI("mEditText");
                        throw null;
                    }
                }
            } else {
                C41997Ge1 c41997Ge12 = this.LJLIL;
                if (c41997Ge12 != null) {
                    c41997Ge12.setTextColor(color.asInt());
                    return;
                } else {
                    o.LJIJI("mEditText");
                    throw null;
                }
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Not supported color type: ");
        LIZ.append(color.getType().name());
        LLog.LIZLLL(3, "LynxBaseInputView", X1D.LIZIZ(LIZ));
    }

    @VPD(name = "font-family")
    public final void setFontFamily(String str) {
        if (str == null) {
            return;
        }
        this.LJLLI = str;
        if (!this.LJLLJ) {
            this.LJLLILLLL = str;
            this.LJLLLL = true;
        }
        this.LJLLL = true;
    }

    @VPD(name = "font-size")
    public final void setFontTextSize(F5B f5b) {
        if (f5b == null) {
            this.mFontSize = VPR.LIZJ("14px", 0.0f, 0.0f);
        } else {
            ReadableType type = f5b.getType();
            if (type != null) {
                int i = VSI.LIZIZ[type.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        float LIZJ = VPR.LIZJ(f5b.asString(), 0.0f, 0.0f);
                        this.mFontSize = LIZJ;
                        C41997Ge1 c41997Ge1 = this.LJLIL;
                        if (c41997Ge1 != null) {
                            c41997Ge1.setTextSize(0, LIZJ);
                        } else {
                            o.LJIJI("mEditText");
                            throw null;
                        }
                    }
                } else {
                    float asDouble = (float) f5b.asDouble();
                    this.mFontSize = asDouble;
                    C41997Ge1 c41997Ge12 = this.LJLIL;
                    if (c41997Ge12 != null) {
                        c41997Ge12.setTextSize(0, asDouble);
                    } else {
                        o.LJIJI("mEditText");
                        throw null;
                    }
                }
            }
        }
        C41997Ge1 c41997Ge13 = this.LJLIL;
        if (c41997Ge13 != null) {
            c41997Ge13.setTextSize(0, this.mFontSize);
            if (!this.LJLJJL) {
                this.LJLJJI = this.mFontSize;
                this.LJLLLL = true;
                return;
            }
            return;
        }
        o.LJIJI("mEditText");
        throw null;
    }

    @VPD(name = "font-weight")
    public final void setFontWeight(Integer num) {
        int i = LiveChatShowDelayForHotLiveSetting.DEFAULT;
        if (num == null) {
            this.LJLL = LiveChatShowDelayForHotLiveSetting.DEFAULT;
        } else {
            if (num.intValue() == 1) {
                i = 700;
            } else if (num.intValue() != 0) {
                i = (num.intValue() - 1) * 100;
            }
            this.LJLL = i;
        }
        if (!this.LJLJLLL) {
            this.LJLJLJ = this.LJLL;
            this.LJLLLL = true;
        }
        this.LJLLL = true;
    }

    @EWS
    public final void setInputFilter(ReadableMap readableMap) {
        VSE vse;
        if (readableMap != null && (vse = this.LLIFFJFJJ) != null) {
            String string = readableMap.getString("pattern");
            o.LJFF(string, "params.getString(\"pattern\")");
            vse.LJLILLLLZI = string;
        }
    }

    @VPD(name = "type")
    public final void setInputType(String str) {
        if (str == null) {
            str = "text";
        }
        C41997Ge1 c41997Ge1 = this.LJLIL;
        if (c41997Ge1 != null) {
            LJJIFFI(c41997Ge1, str);
            C41997Ge1 c41997Ge12 = this.LJLIL;
            if (c41997Ge12 != null) {
                c41997Ge12.setInputType(c41997Ge12.getInputType() | 524288);
                C41997Ge1 c41997Ge13 = this.LJLIL;
                if (c41997Ge13 != null) {
                    this.LLIIIILZ = c41997Ge13.getInputType();
                    return;
                } else {
                    o.LJIJI("mEditText");
                    throw null;
                }
            }
            o.LJIJI("mEditText");
            throw null;
        }
        o.LJIJI("mEditText");
        throw null;
    }

    @VPD(name = "value")
    public final void setInputValue(String str) {
        if (str == null) {
            str = "";
        }
        C41997Ge1 c41997Ge1 = this.LJLIL;
        if (c41997Ge1 != null) {
            if (o.LJ(str, String.valueOf(c41997Ge1.getText()))) {
                return;
            }
            LJJIIZI(str, null, null);
            return;
        }
        o.LJIJI("mEditText");
        throw null;
    }

    @VPD(defaultBoolean = false, name = "enableAutoFill")
    public final void setIsAutoFillEnabled(boolean z) {
        this.LLIIIZ = z;
        Activity LJIIJJI = C78996UzQ.LJIIJJI(this.mContext);
        if ((LJIIJJI instanceof Activity) && Build.VERSION.SDK_INT >= 26) {
            if (this.LLIIIZ) {
                Window window = LJIIJJI.getWindow();
                o.LJFF(window, "context.window");
                View decorView = window.getDecorView();
                o.LJFF(decorView, "context.window.decorView");
                decorView.setImportantForAutofill(1);
                return;
            }
            Window window2 = LJIIJJI.getWindow();
            o.LJFF(window2, "context.window");
            View decorView2 = window2.getDecorView();
            o.LJFF(decorView2, "context.window.decorView");
            decorView2.setImportantForAutofill(8);
        }
    }

    @VPD(defaultBoolean = false, name = "readonly")
    public final void setIsReadOnly(boolean z) {
        C41997Ge1 c41997Ge1 = this.LJLIL;
        if (c41997Ge1 != null) {
            c41997Ge1.setFocusable(!z);
            C41997Ge1 c41997Ge12 = this.LJLIL;
            if (c41997Ge12 != null) {
                c41997Ge12.setFocusableInTouchMode(!z);
                return;
            } else {
                o.LJIJI("mEditText");
                throw null;
            }
        }
        o.LJIJI("mEditText");
        throw null;
    }

    @VPD(defaultBoolean = true, name = "fullscreen-mode")
    public final void setKeyBoardFullscreenMode(boolean z) {
        if (!z) {
            C41997Ge1 c41997Ge1 = this.LJLIL;
            if (c41997Ge1 != null) {
                c41997Ge1.setImeOptions(c41997Ge1.getImeOptions() | 33554432 | 268435456);
                return;
            } else {
                o.LJIJI("mEditText");
                throw null;
            }
        }
        C41997Ge1 c41997Ge12 = this.LJLIL;
        if (c41997Ge12 != null) {
            c41997Ge12.setImeOptions(1);
        } else {
            o.LJIJI("mEditText");
            throw null;
        }
    }

    @VPD(defaultFloat = 0.0f, name = "letter-spacing")
    public final void setLetterSpacing(float f) {
        C41997Ge1 c41997Ge1 = this.LJLIL;
        if (c41997Ge1 != null) {
            if (c41997Ge1.getTextSize() != 0.0f) {
                C41997Ge1 c41997Ge12 = this.LJLIL;
                if (c41997Ge12 != null) {
                    c41997Ge12.setLetterSpacing(f / c41997Ge12.getTextSize());
                    return;
                } else {
                    o.LJIJI("mEditText");
                    throw null;
                }
            }
            LLog.LIZLLL(3, "LynxBaseInputView", "Input's textSize is 0f.");
            return;
        }
        o.LJIJI("mEditText");
        throw null;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    @VPD(defaultInt = 3, name = "direction")
    public void setLynxDirection(int i) {
        this.mLynxDirection = i;
        if (i != 0) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                C41997Ge1 c41997Ge1 = this.LJLIL;
                if (c41997Ge1 != null) {
                    c41997Ge1.setTextDirection(3);
                    return;
                } else {
                    o.LJIJI("mEditText");
                    throw null;
                }
            }
            C41997Ge1 c41997Ge12 = this.LJLIL;
            if (c41997Ge12 != null) {
                c41997Ge12.setTextDirection(4);
                return;
            } else {
                o.LJIJI("mEditText");
                throw null;
            }
        }
        C41997Ge1 c41997Ge13 = this.LJLIL;
        if (c41997Ge13 != null) {
            c41997Ge13.setTextDirection(5);
        } else {
            o.LJIJI("mEditText");
            throw null;
        }
    }

    @VPD(name = "maxlength")
    public final void setMaxLength(F5B f5b) {
        if (f5b == null) {
            this.LJLILLLLZI = UserLevelGeckoUpdateSetting.DEFAULT;
        } else {
            ReadableType type = f5b.getType();
            if (type != null) {
                int i = VSI.LIZJ[type.ordinal()];
                if (i != 1) {
                    if (i == 2 || i == 3 || i == 4) {
                        this.LJLILLLLZI = f5b.asInt();
                    }
                } else {
                    String asString = f5b.asString();
                    o.LJFF(asString, "maxLength.asString()");
                    this.LJLILLLLZI = CastIntegerProtector.parseInt(asString);
                }
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Not supported length type: ");
            LIZ.append(f5b.getType().name());
            LLog.LIZLLL(3, "LynxBaseInputView", X1D.LIZIZ(LIZ));
        }
        if (this.LJLILLLLZI < 0) {
            this.LJLILLLLZI = Integer.MAX_VALUE;
        }
        VSE vse = this.LLIFFJFJJ;
        if (vse != null) {
            vse.LJLIL = this.LJLILLLLZI;
        }
    }

    @VPD(name = "placeholder-style")
    public final void setPlaceHolderStyle(ReadableMap readableMap) {
        String string;
        F5B dynamic;
        F5B dynamic2;
        F5B dynamic3;
        if (readableMap == null) {
            return;
        }
        if (readableMap.hasKey("color") && (dynamic3 = readableMap.getDynamic("color")) != null) {
            setPlaceholderColor(dynamic3);
        }
        if (readableMap.hasKey("font-size") && (dynamic2 = readableMap.getDynamic("font-size")) != null) {
            setPlaceholderTextSize(dynamic2);
        }
        if (readableMap.hasKey("font-weight") && (dynamic = readableMap.getDynamic("font-weight")) != null) {
            setPlaceholderTextWeight(dynamic);
        }
        if (readableMap.hasKey("font-family") && (string = readableMap.getString("font-family")) != null) {
            setPlaceholderFontFamily(string);
        }
    }

    @VPD(name = "placeholder")
    public final void setPlaceholder(String str) {
        if (str == null) {
            str = null;
        }
        this.LJLJI = str;
        this.LJLLLL = true;
    }

    @VPD(name = "placeholder-color")
    public final void setPlaceholderColor(F5B f5b) {
        if (f5b == null) {
            this.LJLJJLL = 0;
            this.LJLJL = false;
            return;
        }
        this.LJLJL = true;
        this.LJLLLL = true;
        ReadableType type = f5b.getType();
        if (type != null) {
            int i = VSI.LIZLLL[type.ordinal()];
            if (i != 1 && i != 2) {
                if (i == 3) {
                    this.LJLJJLL = ColorUtils.LIZ(f5b.asString());
                    return;
                }
            } else {
                this.LJLJJLL = f5b.asInt();
                return;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Not supported color type: ");
        LIZ.append(f5b.getType().name());
        LLog.LIZLLL(3, "LynxBaseInputView", X1D.LIZIZ(LIZ));
        this.LJLJL = false;
        this.LJLLLL = false;
    }

    @VPD(name = "placeholder-font-family")
    public final void setPlaceholderFontFamily(String str) {
        if (str == null) {
            this.LJLLJ = false;
            String str2 = this.LJLLI;
            if (str2 != null) {
                this.LJLLILLLL = str2;
            } else {
                this.LJLLILLLL = null;
            }
        } else {
            this.LJLLJ = true;
            this.LJLLILLLL = str;
        }
        this.LJLLLL = true;
    }

    @VPD(name = "placeholder-font-size")
    public final void setPlaceholderTextSize(F5B f5b) {
        if (f5b == null) {
            this.LJLJJI = this.mFontSize;
            this.LJLJJL = false;
        } else {
            this.LJLJJL = true;
            ReadableType type = f5b.getType();
            if (type != null) {
                int i = VSI.LJ[type.ordinal()];
                if (i != 1 && i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            this.LJLJJI = VPR.LIZIZ(f5b.asString(), 0.0f);
                        }
                    } else {
                        this.LJLJJI = (float) f5b.asDouble();
                    }
                } else {
                    this.LJLJJI = (float) f5b.asDouble();
                }
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Not supported placeholder-font-size type: ");
            LIZ.append(f5b.getType().name());
            LLog.LIZLLL(3, "LynxBaseInputView", X1D.LIZIZ(LIZ));
            this.LJLJJL = false;
            this.LJLJJI = this.mFontSize;
        }
        this.LJLLLL = true;
    }

    @VPD(name = "placeholder-font-weight")
    public final void setPlaceholderTextWeight(F5B f5b) {
        if (f5b == null) {
            this.LJLJLJ = this.LJLL;
            this.LJLJLLL = false;
        } else {
            this.LJLJLLL = true;
            ReadableType type = f5b.getType();
            if (type != null) {
                int i = VSI.LJFF[type.ordinal()];
                int i2 = 700;
                if (i != 1 && i != 2 && i != 3) {
                    if (i == 4) {
                        if (f5b.asString().equals("bold")) {
                            this.LJLJLJ = 700;
                        } else if (f5b.asString().equals("normal")) {
                            this.LJLJLJ = LiveChatShowDelayForHotLiveSetting.DEFAULT;
                        }
                    }
                } else {
                    int asInt = f5b.asInt();
                    if (asInt != 0) {
                        if (asInt != 1) {
                            i2 = (f5b.asInt() - 1) * 100;
                        }
                    } else {
                        i2 = LiveChatShowDelayForHotLiveSetting.DEFAULT;
                    }
                    this.LJLJLJ = i2;
                }
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Not supported placeholder-font-weight type: ");
            LIZ.append(f5b.getType().name());
            LLog.LIZLLL(3, "LynxBaseInputView", X1D.LIZIZ(LIZ));
            this.LJLJLLL = false;
            this.LJLJLJ = this.LJLL;
        }
        this.LJLLLL = true;
    }

    @VPD(name = "android-selection-handle-color")
    public final void setSelectionHandleColor(String str) {
        if (str == null) {
            return;
        }
        int LIZ = ColorUtils.LIZ(str);
        C41997Ge1 c41997Ge1 = this.LJLIL;
        if (c41997Ge1 != null) {
            Drawable textSelectHandleLeft = c41997Ge1.getTextSelectHandleLeft();
            C41997Ge1 c41997Ge12 = this.LJLIL;
            if (c41997Ge12 != null) {
                Drawable textSelectHandleRight = c41997Ge12.getTextSelectHandleRight();
                C41997Ge1 c41997Ge13 = this.LJLIL;
                if (c41997Ge13 != null) {
                    Drawable textSelectHandle = c41997Ge13.getTextSelectHandle();
                    if (textSelectHandleLeft != null) {
                        textSelectHandleLeft.setColorFilter(new PorterDuffColorFilter(LIZ, PorterDuff.Mode.SRC_IN));
                        C41997Ge1 c41997Ge14 = this.LJLIL;
                        if (c41997Ge14 != null) {
                            c41997Ge14.setTextSelectHandleLeft(textSelectHandleLeft);
                        } else {
                            o.LJIJI("mEditText");
                            throw null;
                        }
                    }
                    if (textSelectHandleRight != null) {
                        textSelectHandleRight.setColorFilter(new PorterDuffColorFilter(LIZ, PorterDuff.Mode.SRC_IN));
                        C41997Ge1 c41997Ge15 = this.LJLIL;
                        if (c41997Ge15 != null) {
                            c41997Ge15.setTextSelectHandleRight(textSelectHandleRight);
                        } else {
                            o.LJIJI("mEditText");
                            throw null;
                        }
                    }
                    if (textSelectHandle != null) {
                        textSelectHandle.setColorFilter(new PorterDuffColorFilter(LIZ, PorterDuff.Mode.SRC_IN));
                        C41997Ge1 c41997Ge16 = this.LJLIL;
                        if (c41997Ge16 != null) {
                            c41997Ge16.setTextSelectHandle(textSelectHandle);
                            return;
                        } else {
                            o.LJIJI("mEditText");
                            throw null;
                        }
                    }
                    return;
                }
                o.LJIJI("mEditText");
                throw null;
            }
            o.LJIJI("mEditText");
            throw null;
        }
        o.LJIJI("mEditText");
        throw null;
    }

    @VPD(name = "android-selection-highlight-color")
    public final void setSelectionHighLightColor(String str) {
        if (str == null) {
            return;
        }
        C41997Ge1 c41997Ge1 = this.LJLIL;
        if (c41997Ge1 != null) {
            c41997Ge1.setHighlightColor(ColorUtils.LIZ(str));
        } else {
            o.LJIJI("mEditText");
            throw null;
        }
    }

    @VPD(defaultBoolean = true, name = "show-soft-input-onfocus")
    public final void setShowSoftInputOnFocus(boolean z) {
        Method method;
        try {
            method = C41997Ge1.class.getMethod("setShowSoftInputOnFocus", Boolean.TYPE);
            try {
                method.setAccessible(true);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            method = null;
        }
        Activity LJIIJJI = C78996UzQ.LJIIJJI(this.mContext);
        if (LJIIJJI instanceof Activity) {
            if (!z) {
                this.LLII = true;
                Window window = LJIIJJI.getWindow();
                o.LJFF(window, "context.window");
                this.LLIIIJ = window.getAttributes().softInputMode & 15;
                Window window2 = LJIIJJI.getWindow();
                o.LJFF(window2, "context.window");
                LJIIJJI.getWindow().setSoftInputMode((window2.getAttributes().softInputMode ^ 15) | 3);
                if (method != null) {
                    C41997Ge1 c41997Ge1 = this.LJLIL;
                    if (c41997Ge1 != null) {
                        method.invoke(c41997Ge1, Boolean.FALSE);
                        return;
                    } else {
                        o.LJIJI("mEditText");
                        throw null;
                    }
                }
                return;
            }
            this.LLII = false;
            Window window3 = LJIIJJI.getWindow();
            o.LJFF(window3, "context.window");
            LJIIJJI.getWindow().setSoftInputMode((window3.getAttributes().softInputMode ^ 15) | this.LLIIIJ);
            if (method == null) {
                return;
            }
            C41997Ge1 c41997Ge12 = this.LJLIL;
            if (c41997Ge12 != null) {
                method.invoke(c41997Ge12, Boolean.TRUE);
            } else {
                o.LJIJI("mEditText");
                throw null;
            }
        }
    }

    @VPD(defaultBoolean = true, name = "smart-scroll")
    public final void setSmartScroll(boolean z) {
        VSG vsg = this.LLIIIL;
        if (z) {
            if (!vsg.LJFF.LIZLLL) {
                if (!C79411VEp.LIZ()) {
                    C79411VEp.LIZJ(new ARunnableS50S0100000_14(vsg, 141));
                }
            } else {
                vsg.LIZJ();
            }
        } else {
            VPF vpf = vsg.LJFF;
            C41997Ge1 c41997Ge1 = vsg.LJ;
            IDLListenerS199S0100000_14 iDLListenerS199S0100000_14 = vsg.LIZJ;
            vpf.getClass();
            if (iDLListenerS199S0100000_14 != null) {
                try {
                    if (vpf.LJ != null) {
                        vpf.LJIIJ.remove(c41997Ge1);
                    }
                } catch (Exception unused) {
                }
            }
        }
        vsg.LJIIJJI = z;
    }

    @VPD(defaultInt = 0, name = "text-align")
    public final void setTextAlign(int i) {
        int LJJII = LJJII();
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                C41997Ge1 c41997Ge1 = this.LJLIL;
                if (c41997Ge1 != null) {
                    c41997Ge1.setGravity(LJJII | 5);
                    return;
                } else {
                    o.LJIJI("mEditText");
                    throw null;
                }
            }
            C41997Ge1 c41997Ge12 = this.LJLIL;
            if (c41997Ge12 != null) {
                c41997Ge12.setGravity(LJJII | 1);
                return;
            } else {
                o.LJIJI("mEditText");
                throw null;
            }
        }
        C41997Ge1 c41997Ge13 = this.LJLIL;
        if (c41997Ge13 != null) {
            c41997Ge13.setGravity(LJJII | 3);
        } else {
            o.LJIJI("mEditText");
            throw null;
        }
    }

    @EWS
    public final void addText(ReadableMap readableMap, Callback callback) {
        if (readableMap == null) {
            return;
        }
        String string = readableMap.getString("text");
        C41997Ge1 c41997Ge1 = this.LJLIL;
        if (c41997Ge1 != null) {
            Editable text = c41997Ge1.getText();
            if (text != null) {
                C41997Ge1 c41997Ge12 = this.LJLIL;
                if (c41997Ge12 != null) {
                    text.insert(c41997Ge12.getSelectionEnd(), string);
                } else {
                    o.LJIJI("mEditText");
                    throw null;
                }
            }
            if (callback != null) {
                callback.invoke(0);
                return;
            }
            return;
        }
        o.LJIJI("mEditText");
        throw null;
    }

    @EWS
    public final void controlKeyBoard(ReadableMap readableMap, Callback callback) {
        if (readableMap == null) {
            return;
        }
        int i = readableMap.getInt("action");
        int length = EnumC217578gL.values().length;
        if (i < 0 || length <= i) {
            if (callback != null) {
                callback.invoke(4);
                return;
            }
            return;
        }
        LJJIII();
        if (i == 0) {
            VNU lynxContext = this.mContext;
            o.LJFF(lynxContext, "lynxContext");
            VSF vsf = new VSF(lynxContext, this);
            C41997Ge1 c41997Ge1 = this.LJLIL;
            if (c41997Ge1 != null) {
                c41997Ge1.post(vsf);
            } else {
                o.LJIJI("mEditText");
                throw null;
            }
        } else if (i == 1) {
            LJJIIZ();
        } else if (i != 2 && i == 3) {
            C41997Ge1 c41997Ge12 = this.LJLIL;
            if (c41997Ge12 != null) {
                c41997Ge12.clearFocus();
                LJJIIZ();
            } else {
                o.LJIJI("mEditText");
                throw null;
            }
        }
        if (callback != null) {
            callback.invoke(0);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI, X.VPY
    public final void onFocusChanged(boolean z, boolean z2) {
        if (!z2 || this.LLII) {
            if (z && !this.LLFFF) {
                setFocus(true);
            } else {
                setFocus(false);
            }
        }
    }

    @EWS
    public void sendDelEvent(ReadableMap readableMap, Callback callback) {
        if (readableMap == null) {
            return;
        }
        try {
            int i = readableMap.getInt("action");
            if (i == 0) {
                int i2 = readableMap.getInt("length");
                C41997Ge1 c41997Ge1 = this.LJLIL;
                if (c41997Ge1 != null) {
                    GSY LJI = c41997Ge1.LJI();
                    if (LJI != null) {
                        LJI.deleteSurroundingText(i2, 0);
                    }
                } else {
                    o.LJIJI("mEditText");
                    throw null;
                }
            } else if (i == 1) {
                ((EditText) this.mView).dispatchKeyEvent(new KeyEvent(0, 67));
            }
            if (callback != null) {
                callback.invoke(0);
            }
        } catch (Throwable th) {
            if (callback != null) {
                callback.invoke(1, th);
            }
        }
    }

    @EWS
    public final void setSelectionRange(ReadableMap readableMap, Callback callback) {
        int i;
        int i2;
        if (readableMap == null) {
            if (callback != null) {
                callback.invoke(4, "Param is not a map.");
                return;
            }
            return;
        }
        if (readableMap.hasKey("selectionStart")) {
            i = readableMap.getInt("selectionStart");
        } else {
            i = -1;
        }
        if (readableMap.hasKey("selectionEnd")) {
            i2 = readableMap.getInt("selectionEnd");
        } else {
            i2 = -1;
        }
        C41997Ge1 c41997Ge1 = this.LJLIL;
        if (c41997Ge1 != null) {
            if (c41997Ge1.getText() != null) {
                C41997Ge1 c41997Ge12 = this.LJLIL;
                if (c41997Ge12 != null) {
                    Editable text = c41997Ge12.getText();
                    if (text != null) {
                        int length = text.length();
                        if (length != -1 && i <= length && i2 <= length && i >= 0 && i2 >= 0) {
                            C41997Ge1 c41997Ge13 = this.LJLIL;
                            if (c41997Ge13 != null) {
                                c41997Ge13.setSelection(i, i2);
                                if (callback != null) {
                                    callback.invoke(0, "Success.");
                                    return;
                                }
                                return;
                            }
                            o.LJIJI("mEditText");
                            throw null;
                        }
                    } else {
                        o.LJIIZILJ();
                        throw null;
                    }
                } else {
                    o.LJIJI("mEditText");
                    throw null;
                }
            }
            if (callback != null) {
                callback.invoke(4, "Range does not meet expectations.");
                return;
            }
            return;
        }
        o.LJIJI("mEditText");
        throw null;
    }

    @EWS
    public final void setValue(ReadableMap readableMap, Callback callback) {
        String text;
        Integer num;
        if (readableMap == null) {
            if (callback != null) {
                callback.invoke(4, "Param is not a map.");
                return;
            }
            return;
        }
        if (readableMap.hasKey("value")) {
            text = readableMap.getString("value");
        } else {
            text = "";
        }
        if (readableMap.hasKey("index")) {
            num = Integer.valueOf(readableMap.getInt("index"));
        } else {
            num = null;
        }
        o.LJFF(text, "text");
        LJJIIZI(text, num, callback);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIZI(java.lang.String r15, java.lang.Integer r16, com.lynx.react.bridge.Callback r17) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.input.LynxBaseInputView.LJJIIZI(java.lang.String, java.lang.Integer, com.lynx.react.bridge.Callback):void");
    }
}
