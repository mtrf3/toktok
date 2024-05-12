package com.bytedance.ies.xelement.input;

import X.C03880Dg;
import X.C16880lQ;
import X.C36922EeM;
import X.C41997Ge1;
import X.C58386Mvm;
import X.C65300Pk0;
import X.C6X4;
import X.C79751VRr;
import X.EWS;
import X.GSY;
import X.InterfaceC58371MvX;
import X.InterfaceC88472Yns;
import X.PPT;
import X.VEZ;
import X.VNA;
import X.VNU;
import X.VOL;
import X.VPD;
import X.VPR;
import X.VS4;
import X.VS5;
import X.VS7;
import X.VS8;
import X.VS9;
import X.VSA;
import X.VSB;
import X.VSC;
import X.X1D;
import Y.IDObjectS185S0100000_14;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.RemoteException;
import android.text.Editable;
import android.text.Selection;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import defpackage.g0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes15.dex */
public class LynxTextAreaView extends LynxBaseInputView {
    public C41997Ge1 LLIIL;
    public boolean LLIILII;
    public int LLIILZL;
    public ClipboardManager LLIIZ;
    public boolean LLIL;
    public final List<VSC> LLILII;
    public final int LLILIL;
    public final int LLILL;
    public boolean LLILLIZIL;
    public InterfaceC88472Yns<? super Context, ? extends InterfaceC58371MvX> LLILLJJLI;

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView
    public final void LJJIFFI(C41997Ge1 editText, String str) {
        o.LJIIJ(editText, "editText");
    }

    @EWS
    public final void resetSelectionMenu() {
    }

    public final AutoHeightInputShadowNode LJJIJL() {
        ShadowNode LIZ;
        VNU vnu = this.mContext;
        int sign = getSign();
        VOL vol = vnu.LJLLLLLL.get();
        if (vol == null || (LIZ = vol.LJFF.LIZ(sign)) == null || !(LIZ instanceof AutoHeightInputShadowNode)) {
            return null;
        }
        return (AutoHeightInputShadowNode) LIZ;
    }

    public final void LJJIZ() {
        AutoHeightInputShadowNode LJJIJL;
        C41997Ge1 c41997Ge1 = this.LLIIL;
        if (c41997Ge1 != null) {
            if (c41997Ge1.getHint() != null && (LJJIJL = LJJIJL()) != null) {
                LJJIJL.LJJJIL();
                this.LLILLIZIL = LJJIJL.LJJJJ();
                return;
            }
            return;
        }
        o.LJIJI("mEditText");
        throw null;
    }

    public final void LJJJ() {
        AutoHeightInputShadowNode LJJIJL;
        C41997Ge1 c41997Ge1 = this.LLIIL;
        if (c41997Ge1 != null) {
            if (c41997Ge1.getText() != null && (LJJIJL = LJJIJL()) != null) {
                LJJIJL.LJJJJI();
                this.LLILLIZIL = LJJIJL.LJJJJ();
                return;
            }
            return;
        }
        o.LJIJI("mEditText");
        throw null;
    }

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView
    public final void LJJIJ() {
        super.LJJIJ();
        LJJJ();
    }

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView
    public final void LJJIJIIJI() {
        super.LJJIJIIJI();
        if (this.LJLJI != null) {
            LJJIZ();
        }
    }

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void layout() {
        super.layout();
        if (LJJIIJZLJL() && this.LLILLIZIL) {
            this.LLIIIL.LJ();
            this.LLILLIZIL = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LynxTextAreaView(VNU context) {
        super(context);
        o.LJIIJ(context, "context");
        this.LLILII = new ArrayList();
        this.LLILIL = 1;
        this.LLILL = 16;
        this.LLILLJJLI = C58386Mvm.LJLIL;
    }

    public static final /* synthetic */ C41997Ge1 LJJIJIL(LynxTextAreaView lynxTextAreaView) {
        C41997Ge1 c41997Ge1 = lynxTextAreaView.LLIIL;
        if (c41997Ge1 != null) {
            return c41997Ge1;
        }
        o.LJIJI("mEditText");
        throw null;
    }

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView
    /* renamed from: LJJ */
    public final C41997Ge1 createView(Context context) {
        C41997Ge1 createView = super.createView(context);
        this.LLIIL = createView;
        createView.addTextChangedListener(new IDObjectS185S0100000_14(this, 1));
        createView.setOnEditorActionListener(new VS8(createView, this));
        C41997Ge1 c41997Ge1 = this.LLIIL;
        if (c41997Ge1 != null) {
            LJJI(c41997Ge1);
            C41997Ge1 c41997Ge12 = this.LLIIL;
            if (c41997Ge12 != null) {
                return c41997Ge12;
            }
            o.LJIJI("mEditText");
            throw null;
        }
        o.LJIJI("mEditText");
        throw null;
    }

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView
    public final void LJJI(C41997Ge1 editText) {
        o.LJIIJ(editText, "editText");
        editText.setHorizontallyScrolling(false);
        editText.setSingleLine(false);
        editText.setGravity(48);
    }

    public final <T> JavaOnlyArray LJJIJLIJ(Class<T> cls) {
        C41997Ge1 c41997Ge1 = this.LLIIL;
        if (c41997Ge1 != null) {
            Editable text = c41997Ge1.getText();
            if (text != null) {
                Object[] spans = text.getSpans(0, text.length(), cls);
                JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
                for (Object obj : spans) {
                    JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
                    javaOnlyMap.put("start", Integer.valueOf(text.getSpanStart(obj)));
                    javaOnlyMap.put("end", Integer.valueOf(text.getSpanEnd(obj)));
                    javaOnlyArray.add(javaOnlyMap);
                }
                return javaOnlyArray;
            }
            o.LJIIZILJ();
            throw null;
        }
        o.LJIJI("mEditText");
        throw null;
    }

    public final void LJJIL(ClipData clipData) {
        PPT ppt = (PPT) VEZ.LIZIZ().LIZ(PPT.class);
        if (ppt != null) {
            try {
                ppt.LIZJ(clipData);
                return;
            } catch (RemoteException e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("A RemoteException was encountered while calling systemInvokeService. ");
                LIZ.append(e.getMessage());
                LLog.LIZLLL(4, "LynxTextAreaView", X1D.LIZIZ(LIZ));
                return;
            }
        }
        try {
            ClipboardManager clipboardManager = this.LLIIZ;
            if (clipboardManager != null) {
                LJJIJIIJIL(clipboardManager, clipData);
            }
        } catch (RemoteException e2) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("When we tried to copy copyData, we encountered a RemoteException. ");
            LIZ2.append(e2.getMessage());
            LLog.LIZLLL(4, "LynxTextAreaView", X1D.LIZIZ(LIZ2));
        }
    }

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView, com.lynx.tasm.behavior.ui.LynxUI
    public final /* bridge */ /* synthetic */ EditText createView(Context context) {
        return createView(context);
    }

    @EWS
    public final void getTextInfo(Callback callback) {
        if (callback == null) {
            return;
        }
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        C41997Ge1 c41997Ge1 = this.LLIIL;
        if (c41997Ge1 != null) {
            javaOnlyMap.put("text", String.valueOf(c41997Ge1.getText()));
            int i = this.LLIILZL;
            int i2 = this.LLILIL;
            if ((i & i2) == i2) {
                javaOnlyMap.put("mention", LJJIJLIJ(VSB.class));
            }
            if (g0.LJJIZ()) {
                int i3 = this.LLIILZL;
                int i4 = this.LLILL;
                if ((i3 & i4) == i4) {
                    javaOnlyMap.put("emoji", LJJIJLIJ(C6X4.class));
                }
            }
            callback.invoke(0, javaOnlyMap);
            return;
        }
        o.LJIJI("mEditText");
        throw null;
    }

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setEvents(Map<String, VNA> map) {
        super.setEvents(map);
        if (map != null) {
            this.LJLLLLLL = map.containsKey("line");
            this.LLIL = map.containsKey("mention");
        }
    }

    @VPD(name = "max-height")
    public final void setMaxHeight(String str) {
        if (str == null) {
            T t = this.mView;
            if (t != 0) {
                ((TextView) t).setMaxLines(Integer.MAX_VALUE);
            } else {
                o.LJIIZILJ();
                throw null;
            }
        }
        float LIZIZ = VPR.LIZIZ(str, 0.0f);
        T t2 = this.mView;
        if (t2 != 0) {
            ((TextView) t2).setMaxHeight((int) (LIZIZ + 0.5d));
            LJJJ();
            LJJIZ();
            return;
        }
        o.LJIIZILJ();
        throw null;
    }

    @VPD(defaultInt = Integer.MAX_VALUE, name = "maxlines")
    public final void setMaxLines(int i) {
        this.LLFII = i;
    }

    @VPD(name = "min-height")
    public final void setMinHeight(String str) {
        if (str == null) {
            T t = this.mView;
            if (t != 0) {
                ((TextView) t).setMinLines(0);
                return;
            } else {
                o.LJIIZILJ();
                throw null;
            }
        }
        float LIZIZ = VPR.LIZIZ(str, 0.0f);
        T t2 = this.mView;
        if (t2 != 0) {
            ((TextView) t2).setMinHeight((int) (LIZIZ + 0.5d));
            LJJJ();
            LJJIZ();
            return;
        }
        o.LJIIZILJ();
        throw null;
    }

    @VPD(name = "richtype")
    public final void setRichType(String str) {
        if (str == null) {
            str = LiveGiftNewGifterBadgeSetting.DEFAULT;
        }
        if (s.LJJJLZIJ(str, LiveGiftNewGifterBadgeSetting.DEFAULT, false)) {
            this.LLIILZL = 0;
            ((ArrayList) this.LLILII).clear();
            C41997Ge1 c41997Ge1 = this.LLIIL;
            if (c41997Ge1 != null) {
                GSY gsy = c41997Ge1.LJLJJLL;
                if (gsy != null) {
                    gsy.LIZ = null;
                }
                c41997Ge1.LJLJL = null;
                return;
            }
            o.LJIJI("mEditText");
            throw null;
        }
        if (s.LJJJLZIJ(str, "mention", false)) {
            this.LLIILZL |= this.LLILIL;
            ((ArrayList) this.LLILII).add(new VSC() { // from class: X.8Fy
                @Override // X.VSC
                public final boolean LIZ(Editable editable) {
                    int selectionStart = Selection.getSelectionStart(editable);
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    Object[] spans = editable.getSpans(selectionStart, selectionEnd, VSB.class);
                    o.LJFF(spans, "editableText.getSpans(se…xMentionSpan::class.java)");
                    int length = spans.length;
                    boolean z = false;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        Object obj = spans[i];
                        if (editable.getSpanEnd(obj) == selectionStart) {
                            if (obj != null) {
                                if (selectionStart == selectionEnd) {
                                    z = true;
                                }
                                Selection.setSelection(editable, editable.getSpanStart(obj), editable.getSpanEnd(obj));
                            }
                        } else {
                            i++;
                        }
                    }
                    return z;
                }
            });
            this.LLD = true;
            VSA vsa = new VSA(new SpanWatcher() { // from class: X.8Fx
                public int LJLIL;
                public int LJLILLLLZI;

                @Override // android.text.SpanWatcher
                public final void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
                }

                @Override // android.text.SpanWatcher
                public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
                }

                @Override // android.text.SpanWatcher
                public final void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
                    Object[] spans;
                    Object LJJJ;
                    Object[] spans2;
                    Object LJJJ2;
                    if (o.LJ(obj, Selection.SELECTION_END) && this.LJLILLLLZI != i3) {
                        this.LJLILLLLZI = i3;
                        if (spannable != null && (spans2 = spannable.getSpans(i3, i4, VSB.class)) != null && (LJJJ2 = ORY.LJJJ(spans2)) != null) {
                            int spanStart = spannable.getSpanStart(LJJJ2);
                            int spanEnd = spannable.getSpanEnd(LJJJ2);
                            if (Math.abs(this.LJLILLLLZI - spanEnd) <= Math.abs(this.LJLILLLLZI - spanStart)) {
                                spanStart = spanEnd;
                            }
                            Selection.setSelection(spannable, Selection.getSelectionStart(spannable), spanStart);
                        }
                    }
                    if (obj == Selection.SELECTION_START && this.LJLIL != i3) {
                        this.LJLIL = i3;
                        if (spannable != null && (spans = spannable.getSpans(i3, i4, VSB.class)) != null && (LJJJ = ORY.LJJJ(spans)) != null) {
                            int spanStart2 = spannable.getSpanStart(LJJJ);
                            int spanEnd2 = spannable.getSpanEnd(LJJJ);
                            if (Math.abs(this.LJLIL - spanEnd2) <= Math.abs(this.LJLIL - spanStart2)) {
                                spanStart2 = spanEnd2;
                            }
                            Selection.setSelection(spannable, spanStart2, Selection.getSelectionEnd(spannable));
                        }
                    }
                }
            });
            C41997Ge1 c41997Ge12 = this.LLIIL;
            if (c41997Ge12 != null) {
                c41997Ge12.setEditableFactory(vsa);
            } else {
                o.LJIJI("mEditText");
                throw null;
            }
        }
        if (g0.LJJIZ() && s.LJJJLZIJ(str, "bracket", false)) {
            this.LLIILZL |= this.LLILL;
            ((ArrayList) this.LLILII).add(new VSC() { // from class: X.8Fz
                @Override // X.VSC
                public final boolean LIZ(Editable editable) {
                    int selectionStart = Selection.getSelectionStart(editable);
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    Object[] spans = editable.getSpans(selectionStart, selectionEnd, C6X4.class);
                    o.LJFF(spans, "editableText.getSpans(se…ynxEmojiSpan::class.java)");
                    int length = spans.length;
                    boolean z = false;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        Object obj = spans[i];
                        if (editable.getSpanEnd(obj) == selectionStart) {
                            if (obj != null) {
                                if (selectionStart == selectionEnd) {
                                    z = true;
                                }
                                editable.delete(editable.getSpanStart(obj), editable.getSpanEnd(obj));
                            }
                        } else {
                            i++;
                        }
                    }
                    return z;
                }
            });
            VS5 LIZ = VS4.LIZ();
            InterfaceC88472Yns<? super Context, ? extends InterfaceC58371MvX> interfaceC88472Yns = this.LLILLJJLI;
            VNU mContext = this.mContext;
            o.LJFF(mContext, "mContext");
            InterfaceC58371MvX invoke = interfaceC88472Yns.invoke(mContext);
            o.LJIIJ(invoke, "<set-?>");
            LIZ.LIZ = invoke;
            this.LLIILII = true;
        }
        if ((this.LLIILZL ^ 0) != 0) {
            C41997Ge1 c41997Ge13 = this.LLIIL;
            if (c41997Ge13 != null) {
                c41997Ge13.setBackSpaceListener(new VS9(this));
                this.LLIIZ = (ClipboardManager) C16880lQ.LLIZLLLIL(this.mContext, "clipboard");
                VS7 vs7 = new VS7(this);
                C41997Ge1 c41997Ge14 = this.LLIIL;
                if (c41997Ge14 != null) {
                    c41997Ge14.setCopyListener(vs7);
                    return;
                } else {
                    o.LJIJI("mEditText");
                    throw null;
                }
            }
            o.LJIJI("mEditText");
            throw null;
        }
    }

    public static void LJJIJIIJIL(ClipboardManager clipboardManager, ClipData clipData) {
        try {
            if (!new C03880Dg(2).LIZJ(101807, "android/content/ClipboardManager", "setPrimaryClip", clipboardManager, new Object[]{clipData}, "void", new C65300Pk0(false, "(Landroid/content/ClipData;)V", "5137579813857494492")).LIZ) {
                clipboardManager.setPrimaryClip(clipData);
            }
        } catch (Exception e) {
            C36922EeM.LIZLLL(2, "ClipboardLancet", e.getLocalizedMessage());
        }
    }

    @EWS
    public final void addMention(ReadableMap readableMap, Callback callback) {
        VSB vsb;
        int i;
        int i2;
        if (readableMap == null) {
            return;
        }
        int i3 = this.LLIILZL;
        int i4 = this.LLILIL;
        if ((i3 & i4) != i4 || !readableMap.hasKey("name")) {
            if (callback != null) {
                callback.invoke(4);
                return;
            }
            return;
        }
        if (readableMap.hasKey("symbol")) {
            String string = readableMap.getString("name");
            o.LJFF(string, "params.getString(\"name\")");
            String string2 = readableMap.getString("symbol");
            o.LJFF(string2, "params.getString(\"symbol\")");
            vsb = new VSB(string, string2);
        } else {
            String string3 = readableMap.getString("name");
            o.LJFF(string3, "params.getString(\"name\")");
            vsb = new VSB(string3, "@");
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(vsb.LIZIZ);
        LIZ.append(vsb.LIZ);
        SpannableString spannableString = new SpannableString(X1D.LIZIZ(LIZ));
        int length = spannableString.length();
        C41997Ge1 c41997Ge1 = this.LLIIL;
        if (c41997Ge1 != null) {
            spannableString.setSpan(Integer.valueOf(c41997Ge1.getHeight()), 0, length, 33);
            if (readableMap.hasKey("font-style")) {
                i = readableMap.getInt("font-style");
            } else {
                i = 1;
            }
            spannableString.setSpan(new StyleSpan(i), 0, length, 33);
            if (readableMap.hasKey("font-color")) {
                i2 = ColorProtector.parseColor(readableMap.getString("font-color"));
            } else {
                i2 = -65536;
            }
            spannableString.setSpan(new C79751VRr(i2), 0, length, 33);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            Object[] objArr = {vsb};
            SpannableString valueOf = SpannableString.valueOf(spannableString);
            valueOf.setSpan(objArr[0], 0, valueOf.length(), 33);
            o.LJFF(valueOf, "SpannableString.valueOf(…)\n            }\n        }");
            spannableStringBuilder.append((CharSequence) valueOf);
            if (readableMap.hasKey("extraSpace")) {
                spannableStringBuilder.append((CharSequence) readableMap.getString("extraSpace"));
            } else {
                spannableStringBuilder.append((CharSequence) " ");
            }
            C41997Ge1 c41997Ge12 = this.LLIIL;
            if (c41997Ge12 != null) {
                Editable text = c41997Ge12.getText();
                if (text != null) {
                    C41997Ge1 c41997Ge13 = this.LLIIL;
                    if (c41997Ge13 != null) {
                        text.insert(c41997Ge13.getSelectionEnd(), spannableStringBuilder);
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
        o.LJIJI("mEditText");
        throw null;
    }

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView
    @EWS
    public void sendDelEvent(ReadableMap readableMap, Callback callback) {
        if (readableMap == null) {
            return;
        }
        if ((this.LLIILZL ^ 0) == 0) {
            super.sendDelEvent(readableMap, callback);
            return;
        }
        while (true) {
            boolean z = false;
            for (VSC vsc : this.LLILII) {
                if (!z) {
                    C41997Ge1 c41997Ge1 = this.LLIIL;
                    if (c41997Ge1 != null) {
                        Editable text = c41997Ge1.getText();
                        if (text != null) {
                            o.LJFF(text, "mEditText.text!!");
                            if (vsc.LIZ(text)) {
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
                z = true;
            }
            if (z) {
                return;
            }
            try {
                int i = readableMap.getInt("action");
                if (i == 0) {
                    int i2 = readableMap.getInt("length");
                    C41997Ge1 c41997Ge12 = this.LLIIL;
                    if (c41997Ge12 != null) {
                        GSY LJI = c41997Ge12.LJI();
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
                if (callback == null) {
                    return;
                }
                callback.invoke(0);
                return;
            } catch (Throwable th) {
                if (callback == null) {
                    return;
                }
                callback.invoke(1, th);
                return;
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setSign(int i, String str) {
        super.setSign(i, str);
        AutoHeightInputShadowNode LJJIJL = LJJIJL();
        if (LJJIJL != null) {
            C41997Ge1 edittext = this.LLIIL;
            if (edittext != null) {
                o.LJIIJ(edittext, "edittext");
                LJJIJL.LJJJJLL = edittext;
            } else {
                o.LJIJI("mEditText");
                throw null;
            }
        }
    }
}
