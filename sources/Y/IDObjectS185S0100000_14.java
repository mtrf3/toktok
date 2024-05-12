package Y;

import X.C41997Ge1;
import X.C47614ImQ;
import X.C49615Jdb;
import X.C6X4;
import X.C82890Wg2;
import X.C83552Wqi;
import X.C83553Wqj;
import X.C83554Wqk;
import X.GSY;
import X.InterfaceC83565Wqv;
import X.TMB;
import X.VNU;
import X.VS4;
import X.VS5;
import X.VS6;
import X.VSB;
import X.WW1;
import X.X1D;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.ies.xelement.input.LynxTextAreaView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.compliance.consent.countrylist.MusCountryListActivity;
import com.ss.android.ugc.aweme.compliance.consent.countrylist.service.RegionListAPI;
import defpackage.g0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class IDObjectS185S0100000_14 implements TextWatcher {
    public final int $t;
    public Object l0;

    public static final void beforeTextChanged$0(IDObjectS185S0100000_14 iDObjectS185S0100000_14, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$2(IDObjectS185S0100000_14 iDObjectS185S0100000_14, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$3(IDObjectS185S0100000_14 iDObjectS185S0100000_14, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$7(IDObjectS185S0100000_14 iDObjectS185S0100000_14, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$0(IDObjectS185S0100000_14 iDObjectS185S0100000_14, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$2(IDObjectS185S0100000_14 iDObjectS185S0100000_14, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$3(IDObjectS185S0100000_14 iDObjectS185S0100000_14, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$7(IDObjectS185S0100000_14 iDObjectS185S0100000_14, CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.$t) {
            case 0:
                afterTextChanged$0(this, editable);
                return;
            case 1:
                afterTextChanged$1(this, editable);
                return;
            case 2:
                afterTextChanged$2(this, editable);
                return;
            case 3:
                afterTextChanged$3(this, editable);
                return;
            case 4:
                afterTextChanged$4(this, editable);
                return;
            case 5:
                afterTextChanged$5(this, editable);
                return;
            case 6:
                afterTextChanged$6(this, editable);
                return;
            case 7:
                afterTextChanged$7(this, editable);
                return;
            default:
                return;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.$t) {
            case 0:
                beforeTextChanged$0(this, charSequence, i, i2, i3);
                return;
            case 1:
                beforeTextChanged$1(this, charSequence, i, i2, i3);
                return;
            case 2:
                beforeTextChanged$2(this, charSequence, i, i2, i3);
                return;
            case 3:
                beforeTextChanged$3(this, charSequence, i, i2, i3);
                return;
            case 4:
                o.LJIIIZ(charSequence, "s");
                return;
            case 5:
                o.LJIIIZ(charSequence, "s");
                return;
            case 6:
                o.LJIIIZ(charSequence, "s");
                return;
            case 7:
                beforeTextChanged$7(this, charSequence, i, i2, i3);
                return;
            default:
                return;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.$t) {
            case 0:
                onTextChanged$0(this, charSequence, i, i2, i3);
                return;
            case 1:
                onTextChanged$1(this, charSequence, i, i2, i3);
                return;
            case 2:
                onTextChanged$2(this, charSequence, i, i2, i3);
                return;
            case 3:
                onTextChanged$3(this, charSequence, i, i2, i3);
                return;
            case 4:
                onTextChanged$4(this, charSequence, i, i2, i3);
                return;
            case 5:
                onTextChanged$5(this, charSequence, i, i2, i3);
                return;
            case 6:
                onTextChanged$6(this, charSequence, i, i2, i3);
                return;
            case 7:
                onTextChanged$7(this, charSequence, i, i2, i3);
                return;
            default:
                return;
        }
    }

    public IDObjectS185S0100000_14(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        r1 = ((com.bytedance.ies.xelement.input.LynxBaseInputView) r6.l0).mContext;
        kotlin.jvm.internal.o.LJFF(r1, "lynxContext");
        r4 = r1.LJLJJL;
        r3 = new X.C49615Jdb(((com.bytedance.ies.xelement.input.LynxBaseInputView) r6.l0).getSign(), "input");
        r3.LIZJ(r7.toString(), "value");
        r3.LIZJ(java.lang.Integer.valueOf(com.bytedance.ies.xelement.input.LynxBaseInputView.LJIJJLI((com.bytedance.ies.xelement.input.LynxBaseInputView) r6.l0).getSelectionEnd()), "cursor");
        r3.LIZJ(java.lang.Integer.valueOf(r7.toString().length()), "textLength");
        r3.LIZJ(java.lang.Boolean.valueOf(r5), "isComposing");
        r4.LIZIZ(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        if (r7 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        if (r1.length == 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void afterTextChanged$0(Y.IDObjectS185S0100000_14 r6, android.text.Editable r7) {
        /*
            java.lang.Object r1 = r6.l0
            com.bytedance.ies.xelement.input.LynxBaseInputView r1 = (com.bytedance.ies.xelement.input.LynxBaseInputView) r1
            boolean r0 = r1.LJLZ
            r2 = 0
            if (r0 == 0) goto L82
            boolean r0 = r1.LLD
            if (r0 != 0) goto L82
            if (r7 == 0) goto L82
            boolean r0 = r7 instanceof android.text.SpannableStringBuilder
            if (r0 == 0) goto L28
            int r1 = r7.length()
            java.lang.Class<android.text.style.UnderlineSpan> r0 = android.text.style.UnderlineSpan.class
            java.lang.Object[] r1 = r7.getSpans(r2, r1, r0)
            android.text.style.UnderlineSpan[] r1 = (android.text.style.UnderlineSpan[]) r1
            java.lang.String r0 = "result"
            kotlin.jvm.internal.o.LJFF(r1, r0)
            int r0 = r1.length
            r5 = 1
            if (r0 != 0) goto L2b
        L28:
            r5 = 0
            if (r7 == 0) goto L82
        L2b:
            java.lang.Object r0 = r6.l0
            com.bytedance.ies.xelement.input.LynxBaseInputView r0 = (com.bytedance.ies.xelement.input.LynxBaseInputView) r0
            X.VNU r1 = r0.mContext
            java.lang.String r0 = "lynxContext"
            kotlin.jvm.internal.o.LJFF(r1, r0)
            X.VNL r4 = r1.LJLJJL
            X.Jdb r3 = new X.Jdb
            java.lang.Object r0 = r6.l0
            com.bytedance.ies.xelement.input.LynxBaseInputView r0 = (com.bytedance.ies.xelement.input.LynxBaseInputView) r0
            int r1 = r0.getSign()
            java.lang.String r0 = "input"
            r3.<init>(r1, r0)
            java.lang.String r1 = "value"
            java.lang.String r0 = r7.toString()
            r3.LIZJ(r0, r1)
            java.lang.Object r0 = r6.l0
            com.bytedance.ies.xelement.input.LynxBaseInputView r0 = (com.bytedance.ies.xelement.input.LynxBaseInputView) r0
            X.Ge1 r0 = com.bytedance.ies.xelement.input.LynxBaseInputView.LJIJJLI(r0)
            int r0 = r0.getSelectionEnd()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "cursor"
            r3.LIZJ(r1, r0)
            java.lang.String r0 = r7.toString()
            int r0 = r0.length()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "textLength"
            r3.LIZJ(r1, r0)
            java.lang.String r1 = "isComposing"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r3.LIZJ(r0, r1)
            r4.LIZIZ(r3)
        L82:
            java.lang.Object r1 = r6.l0
            com.bytedance.ies.xelement.input.LynxBaseInputView r1 = (com.bytedance.ies.xelement.input.LynxBaseInputView) r1
            boolean r0 = r1.LLD
            if (r0 == 0) goto L8c
            r1.LLD = r2
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDObjectS185S0100000_14.afterTextChanged$0(Y.IDObjectS185S0100000_14, android.text.Editable):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v7 */
    public static final void afterTextChanged$1(IDObjectS185S0100000_14 iDObjectS185S0100000_14, Editable editable) {
        ?? r2;
        ArrayList arrayList;
        int i;
        boolean z;
        boolean z2;
        if (g0.LJJIZ()) {
            LynxTextAreaView lynxTextAreaView = (LynxTextAreaView) iDObjectS185S0100000_14.l0;
            boolean z3 = lynxTextAreaView.LLD;
            lynxTextAreaView.LLD = true;
            if (g0.LJJIZ() && lynxTextAreaView.LLIILII) {
                T mView = lynxTextAreaView.mView;
                o.LJFF(mView, "mView");
                TextView textView = (TextView) mView;
                if (!VS6.LIZIZ) {
                    VS6.LIZIZ = true;
                    CharSequence text = textView.getText();
                    Context context = textView.getContext();
                    String charSequence = text.toString();
                    if (context == null || TextUtils.isEmpty(charSequence)) {
                        arrayList = new ArrayList();
                    } else {
                        arrayList = new ArrayList();
                        Matcher matcher = VS6.LIZ.matcher(charSequence);
                        while (matcher.find()) {
                            String emoji = matcher.group();
                            if (VS4.LIZ().LIZ(context, emoji) != null) {
                                o.LJFF(emoji, "emoji");
                                arrayList.add(emoji);
                            }
                        }
                    }
                    int intValue = Integer.valueOf(arrayList.size()).intValue();
                    if (TextUtils.isEmpty(text) || intValue <= 0) {
                        VS6.LIZIZ = false;
                    } else {
                        SpannableString spannableString = new SpannableString(text);
                        C6X4[] c6x4Arr = (C6X4[]) spannableString.getSpans(0, text.length(), C6X4.class);
                        if (c6x4Arr != null && c6x4Arr.length > 0) {
                            if (c6x4Arr.length != intValue) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            int length = c6x4Arr.length;
                            for (int i2 = 0; i2 < length; i2++) {
                                C6X4 c6x4 = c6x4Arr[i2];
                                spannableString.removeSpan(c6x4);
                                if (i2 < intValue && !z2) {
                                    CharSequence charSequence2 = c6x4.LJLILLLLZI;
                                    if (charSequence2 == null) {
                                        charSequence2 = "";
                                    }
                                    if (!TextUtils.equals(charSequence2, (CharSequence) ListProtector.get(arrayList, i2))) {
                                        z2 = true;
                                    }
                                }
                            }
                            if (!z2) {
                                VS6.LIZIZ = false;
                            }
                        }
                        boolean z4 = textView instanceof EditText;
                        if (z4) {
                            i = textView.getSelectionStart();
                        } else {
                            i = 0;
                        }
                        VS5 LIZ = VS4.LIZ();
                        Matcher matcher2 = VS6.LIZ.matcher(text);
                        while (matcher2.find()) {
                            int start = matcher2.start();
                            int end = matcher2.end();
                            String group = matcher2.group();
                            Drawable LIZ2 = LIZ.LIZ(textView.getContext(), group);
                            if (LIZ2 != null) {
                                int lineHeight = textView.getLineHeight();
                                LIZ2.setBounds(0, 0, (int) ((lineHeight * ((LIZ2.getIntrinsicWidth() + 0.0f) / LIZ2.getIntrinsicHeight())) + 0.5f), lineHeight);
                                spannableString.setSpan(new C6X4(LIZ2, Integer.valueOf(end - start), group), start, end, 33);
                                if (i > start && i < end && z4) {
                                    ((EditText) textView).setSelection(end);
                                }
                            }
                        }
                        if (z4) {
                            Editable editableText = textView.getEditableText();
                            if (editableText != null) {
                                z = false;
                                editableText.replace(0, text.length(), spannableString);
                            } else {
                                z = false;
                            }
                        } else {
                            z = false;
                            textView.setText(spannableString);
                        }
                        VS6.LIZIZ = z;
                    }
                }
            }
            ((LynxTextAreaView) iDObjectS185S0100000_14.l0).LLD = z3;
        }
        LynxTextAreaView lynxTextAreaView2 = (LynxTextAreaView) iDObjectS185S0100000_14.l0;
        if (lynxTextAreaView2.LLFII != Integer.MAX_VALUE) {
            if (LynxTextAreaView.LJJIJIL(lynxTextAreaView2).getLayout() != null) {
                Layout layout = LynxTextAreaView.LJJIJIL((LynxTextAreaView) iDObjectS185S0100000_14.l0).getLayout();
                o.LJFF(layout, "mEditText.layout");
                int lineCount = layout.getLineCount();
                LynxTextAreaView lynxTextAreaView3 = (LynxTextAreaView) iDObjectS185S0100000_14.l0;
                if (lineCount > lynxTextAreaView3.LLFII) {
                    if (!lynxTextAreaView3.LLFZ) {
                        r2 = 1;
                        lynxTextAreaView3.LLFZ = true;
                        lynxTextAreaView3.LLI = lynxTextAreaView3.LLD;
                    } else {
                        r2 = 1;
                    }
                    lynxTextAreaView3.LLD = r2;
                    GSY LJI = LynxTextAreaView.LJJIJIL(lynxTextAreaView3).LJI();
                    if (LJI != 0) {
                        LJI.deleteSurroundingText(r2, 0);
                        return;
                    }
                    return;
                }
            }
            LynxTextAreaView lynxTextAreaView4 = (LynxTextAreaView) iDObjectS185S0100000_14.l0;
            if (lynxTextAreaView4.LLFZ) {
                if (lynxTextAreaView4.LJLLLLLL && editable != null) {
                    VNU lynxContext = lynxTextAreaView4.mContext;
                    o.LJFF(lynxContext, "lynxContext");
                    lynxContext.LJLJJL.LIZIZ(new C49615Jdb(((LynxTextAreaView) iDObjectS185S0100000_14.l0).getSign(), "line"));
                }
                LynxTextAreaView lynxTextAreaView5 = (LynxTextAreaView) iDObjectS185S0100000_14.l0;
                lynxTextAreaView5.LLFZ = false;
                lynxTextAreaView5.LLD = lynxTextAreaView5.LLI;
            }
        }
        ((LynxTextAreaView) iDObjectS185S0100000_14.l0).LJJJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void afterTextChanged$2(Y.IDObjectS185S0100000_14 r4, android.text.Editable r5) {
        /*
            if (r5 == 0) goto Lb4
            java.lang.String r0 = r5.toString()
        L6:
            boolean r0 = X.C78685UuP.LJJJZ(r0)
            r3 = 0
            if (r0 == 0) goto L9c
            java.lang.String r2 = java.lang.String.valueOf(r5)
            X.OJD r1 = new X.OJD
            java.lang.String r0 = "[\\n\\s]*"
            r1.<init>(r0)
            boolean r0 = r1.matches(r2)
            if (r0 != 0) goto L9c
            java.lang.Object r0 = r4.l0
            X.WoF r0 = (X.C83399WoF) r0
            X.Wnu r0 = r0.LJJLIIIIJ()
            com.bytedance.tux.icon.TuxIconView r0 = r0.LLJILJILJ()
            r0.setVisibility(r3)
            java.lang.Object r1 = r4.l0
            X.WoF r1 = (X.C83399WoF) r1
            r0 = 1
            r1.LJLJLLL = r0
        L34:
            java.lang.Object r0 = r4.l0
            X.WoF r0 = (X.C83399WoF) r0
            X.Wnu r0 = r0.LJJLIIIIJ()
            X.T5T r0 = r0.LLJILJIL()
            int r1 = r0.getLineCount()
            r0 = 5
            java.lang.String r2 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            if (r1 < r0) goto L75
            java.lang.Object r0 = r4.l0
            X.WoF r0 = (X.C83399WoF) r0
            X.Wnu r0 = r0.LJJLIIIIJ()
            X.T5T r0 = r0.LLJILJIL()
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            kotlin.jvm.internal.o.LJII(r1, r2)
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            r0 = -8
            int r0 = X.C7MY.LIZIZ(r0)
            r1.topMargin = r0
            java.lang.Object r0 = r4.l0
            X.WoF r0 = (X.C83399WoF) r0
            X.Wnu r0 = r0.LJJLIIIIJ()
            X.T5T r0 = r0.LLJILJIL()
            r0.setLayoutParams(r1)
        L74:
            return
        L75:
            java.lang.Object r0 = r4.l0
            X.WoF r0 = (X.C83399WoF) r0
            X.Wnu r0 = r0.LJJLIIIIJ()
            X.T5T r0 = r0.LLJILJIL()
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            kotlin.jvm.internal.o.LJII(r1, r2)
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            r1.topMargin = r3
            java.lang.Object r0 = r4.l0
            X.WoF r0 = (X.C83399WoF) r0
            X.Wnu r0 = r0.LJJLIIIIJ()
            X.T5T r0 = r0.LLJILJIL()
            r0.setLayoutParams(r1)
            goto L74
        L9c:
            java.lang.Object r0 = r4.l0
            X.WoF r0 = (X.C83399WoF) r0
            X.Wnu r0 = r0.LJJLIIIIJ()
            com.bytedance.tux.icon.TuxIconView r1 = r0.LLJILJILJ()
            r0 = 8
            r1.setVisibility(r0)
            java.lang.Object r0 = r4.l0
            X.WoF r0 = (X.C83399WoF) r0
            r0.LJLJLLL = r3
            goto L34
        Lb4:
            r0 = 0
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDObjectS185S0100000_14.afterTextChanged$2(Y.IDObjectS185S0100000_14, android.text.Editable):void");
    }

    public static final void afterTextChanged$3(IDObjectS185S0100000_14 iDObjectS185S0100000_14, Editable editable) {
        boolean z;
        if (editable == null || editable.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            View view = ((WW1) iDObjectS185S0100000_14.l0).LLFFF;
            if (view != null) {
                view.setVisibility(8);
                return;
            } else {
                o.LJIJI("stickerCenterCancelRoot");
                throw null;
            }
        }
        View view2 = ((WW1) iDObjectS185S0100000_14.l0).LLFFF;
        if (view2 != null) {
            view2.setVisibility(0);
        } else {
            o.LJIJI("stickerCenterCancelRoot");
            throw null;
        }
    }

    public static final void afterTextChanged$4(IDObjectS185S0100000_14 iDObjectS185S0100000_14, Editable editable) {
        EditText editText;
        if (editable != null && (editText = ((C83554Wqk) iDObjectS185S0100000_14.l0).LJLIL) != null) {
            int selectionEnd = editText.getSelectionEnd();
            int length = editable.toString().length();
            C83554Wqk c83554Wqk = (C83554Wqk) iDObjectS185S0100000_14.l0;
            int i = c83554Wqk.LJLJLJ;
            if (1 > i || length <= i) {
                InterfaceC83565Wqv interfaceC83565Wqv = c83554Wqk.LJLJJLL;
                if (interfaceC83565Wqv != null) {
                    interfaceC83565Wqv.LIZIZ(editable.toString());
                    return;
                }
                return;
            }
            editable.delete(i, length);
            EditText editView = ((C83554Wqk) iDObjectS185S0100000_14.l0).LJLIL;
            o.LJIIIIZZ(editView, "editView");
            editView.setText(editable);
            C83554Wqk c83554Wqk2 = (C83554Wqk) iDObjectS185S0100000_14.l0;
            int i2 = c83554Wqk2.LJLJLJ;
            if (selectionEnd > i2) {
                selectionEnd = (selectionEnd - length) + i2;
            }
            c83554Wqk2.LJLIL.setSelection(selectionEnd);
            TMB tmb = C82890Wg2.LJFF;
            EditText editView2 = ((C83554Wqk) iDObjectS185S0100000_14.l0).LJLIL;
            o.LJIIIIZZ(editView2, "editView");
            TMB.LIZLLL(tmb, editView2.getContext(), ((C83554Wqk) iDObjectS185S0100000_14.l0).LJLJL).LIZ();
        }
    }

    public static final void afterTextChanged$5(IDObjectS185S0100000_14 iDObjectS185S0100000_14, Editable editable) {
        if (editable != null) {
            C83552Wqi c83552Wqi = (C83552Wqi) iDObjectS185S0100000_14.l0;
            if (c83552Wqi.LJLJJLL == null) {
                return;
            }
            String str = c83552Wqi.LJLJLLL;
            if ((str == null || str.length() > ((C83552Wqi) iDObjectS185S0100000_14.l0).LJLJLJ) && ((C83552Wqi) iDObjectS185S0100000_14.l0).LJLJLJ > 0) {
                return;
            }
            ((C83552Wqi) iDObjectS185S0100000_14.l0).LJLJJLL.LIZIZ(editable.toString());
        }
    }

    public static final void afterTextChanged$6(IDObjectS185S0100000_14 iDObjectS185S0100000_14, Editable editable) {
        EditText editText;
        if (editable != null && (editText = ((C83553Wqj) iDObjectS185S0100000_14.l0).LJLIL) != null) {
            int selectionEnd = editText.getSelectionEnd();
            int length = editable.toString().length();
            C83553Wqj c83553Wqj = (C83553Wqj) iDObjectS185S0100000_14.l0;
            int i = c83553Wqj.LJLJLJ;
            if (1 > i || length <= i) {
                InterfaceC83565Wqv interfaceC83565Wqv = c83553Wqj.LJLJJLL;
                if (interfaceC83565Wqv != null) {
                    interfaceC83565Wqv.LIZIZ(editable.toString());
                    return;
                }
                return;
            }
            editable.delete(i, length);
            EditText editView = ((C83553Wqj) iDObjectS185S0100000_14.l0).LJLIL;
            o.LJIIIIZZ(editView, "editView");
            editView.setText(editable);
            C83553Wqj c83553Wqj2 = (C83553Wqj) iDObjectS185S0100000_14.l0;
            int i2 = c83553Wqj2.LJLJLJ;
            if (selectionEnd > i2) {
                selectionEnd = (selectionEnd - length) + i2;
            }
            c83553Wqj2.LJLIL.setSelection(selectionEnd);
            TMB tmb = C82890Wg2.LJFF;
            EditText editView2 = ((C83553Wqj) iDObjectS185S0100000_14.l0).LJLIL;
            o.LJIIIIZZ(editView2, "editView");
            TMB.LIZLLL(tmb, editView2.getContext(), ((C83553Wqj) iDObjectS185S0100000_14.l0).LJLJL).LIZ();
        }
    }

    public static final void afterTextChanged$7(IDObjectS185S0100000_14 iDObjectS185S0100000_14, Editable editable) {
        String lowerCase = ((MusCountryListActivity) iDObjectS185S0100000_14.l0).LJLJJL.getText().toString().toLowerCase(Locale.getDefault());
        ((MusCountryListActivity) iDObjectS185S0100000_14.l0).LJLJI.clear();
        if (lowerCase.isEmpty()) {
            MusCountryListActivity musCountryListActivity = (MusCountryListActivity) iDObjectS185S0100000_14.l0;
            musCountryListActivity.LJLJI.addAll(musCountryListActivity.LJLJJI);
        } else {
            Iterator<RegionListAPI.Country> it = ((MusCountryListActivity) iDObjectS185S0100000_14.l0).LJLJJI.iterator();
            while (it.hasNext()) {
                RegionListAPI.Country next = it.next();
                if (C47614ImQ.LIZ(next.countryName, lowerCase) || C47614ImQ.LIZ(next.countryName, lowerCase)) {
                    Iterator<RegionListAPI.Country> it2 = ((MusCountryListActivity) iDObjectS185S0100000_14.l0).LJLJI.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (it2.next().countryName.equals(next.countryName)) {
                                break;
                            }
                        } else {
                            ((MusCountryListActivity) iDObjectS185S0100000_14.l0).LJLJI.add(next);
                            break;
                        }
                    }
                }
            }
        }
        ((MusCountryListActivity) iDObjectS185S0100000_14.l0).LJLJLJ.notifyDataSetChanged();
    }

    public static final void beforeTextChanged$1(IDObjectS185S0100000_14 iDObjectS185S0100000_14, CharSequence charSequence, int i, int i2, int i3) {
        LynxTextAreaView lynxTextAreaView = (LynxTextAreaView) iDObjectS185S0100000_14.l0;
        if (!lynxTextAreaView.LLD && i3 != 0) {
            C41997Ge1 c41997Ge1 = lynxTextAreaView.LLIIL;
            Object obj = null;
            if (c41997Ge1 != null) {
                Editable text = c41997Ge1.getText();
                if (text != null) {
                    if (g0.LJJIZ()) {
                        int i4 = lynxTextAreaView.LLIILZL;
                        int i5 = lynxTextAreaView.LLILL;
                        if ((i4 & i5) == i5) {
                            int i6 = i + i2;
                            Object[] spans = text.getSpans(i, i6, C6X4.class);
                            o.LJFF(spans, "editableText.getSpans(st…ynxEmojiSpan::class.java)");
                            int length = spans.length;
                            int i7 = 0;
                            while (true) {
                                if (i7 >= length) {
                                    break;
                                }
                                Object obj2 = spans[i7];
                                if (text.getSpanStart(obj2) == i && text.getSpanEnd(obj2) == i6) {
                                    if (obj2 != null) {
                                        text.removeSpan(obj2);
                                    }
                                } else {
                                    i7++;
                                }
                            }
                        }
                    }
                    int i8 = lynxTextAreaView.LLIILZL;
                    int i9 = lynxTextAreaView.LLILIL;
                    if ((i8 & i9) == i9) {
                        int i10 = i2 + i;
                        Object[] spans2 = text.getSpans(i, i10, VSB.class);
                        o.LJFF(spans2, "editableText.getSpans(st…xMentionSpan::class.java)");
                        int length2 = spans2.length;
                        int i11 = 0;
                        while (true) {
                            if (i11 >= length2) {
                                break;
                            }
                            Object obj3 = spans2[i11];
                            if (text.getSpanStart(obj3) == i && text.getSpanEnd(obj3) == i10) {
                                obj = obj3;
                                break;
                            }
                            i11++;
                        }
                        VSB vsb = (VSB) obj;
                        if (vsb != null) {
                            lynxTextAreaView.LLD = true;
                            text.delete(text.getSpanStart(vsb), text.getSpanEnd(vsb));
                            lynxTextAreaView.LLD = true;
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append(vsb.LIZIZ);
                            LIZ.append(vsb.LIZ);
                            text.insert(i, X1D.LIZIZ(LIZ));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            o.LJIJI("mEditText");
            throw null;
        }
    }

    public static final void onTextChanged$1(IDObjectS185S0100000_14 iDObjectS185S0100000_14, CharSequence charSequence, int i, int i2, int i3) {
        LynxTextAreaView lynxTextAreaView = (LynxTextAreaView) iDObjectS185S0100000_14.l0;
        int i4 = lynxTextAreaView.LLIILZL;
        int i5 = lynxTextAreaView.LLILIL;
        if ((i4 & i5) == i5 && lynxTextAreaView.LLIL && !lynxTextAreaView.LLD && i2 == 0 && i3 == 1 && !TextUtils.isEmpty(charSequence) && charSequence != null && (charSequence.charAt(i) == '@' || charSequence.charAt(i) == '#')) {
            VNU lynxContext = ((LynxTextAreaView) iDObjectS185S0100000_14.l0).mContext;
            o.LJFF(lynxContext, "lynxContext");
            lynxContext.LJLJJL.LIZIZ(new C49615Jdb(((LynxTextAreaView) iDObjectS185S0100000_14.l0).getSign(), "mention"));
        }
        LynxTextAreaView lynxTextAreaView2 = (LynxTextAreaView) iDObjectS185S0100000_14.l0;
        if (!lynxTextAreaView2.LJLZ && lynxTextAreaView2.LLD) {
            lynxTextAreaView2.LLD = false;
        }
    }

    public static final void onTextChanged$4(IDObjectS185S0100000_14 iDObjectS185S0100000_14, CharSequence s, int i, int i2, int i3) {
        o.LJIIIZ(s, "s");
        ((C83554Wqk) iDObjectS185S0100000_14.l0).LJLJLLL = s.toString();
        C83554Wqk c83554Wqk = (C83554Wqk) iDObjectS185S0100000_14.l0;
        if (c83554Wqk.LJLJLLL == null) {
            c83554Wqk.LJLJLLL = "";
        }
    }

    public static final void onTextChanged$5(IDObjectS185S0100000_14 iDObjectS185S0100000_14, CharSequence s, int i, int i2, int i3) {
        o.LJIIIZ(s, "s");
        ((C83552Wqi) iDObjectS185S0100000_14.l0).LJLJLLL = s.toString();
        C83552Wqi c83552Wqi = (C83552Wqi) iDObjectS185S0100000_14.l0;
        if (c83552Wqi.LJLJLLL == null) {
            c83552Wqi.LJLJLLL = "";
        }
    }

    public static final void onTextChanged$6(IDObjectS185S0100000_14 iDObjectS185S0100000_14, CharSequence s, int i, int i2, int i3) {
        o.LJIIIZ(s, "s");
        ((C83553Wqj) iDObjectS185S0100000_14.l0).LJLJLLL = s.toString();
        C83553Wqj c83553Wqj = (C83553Wqj) iDObjectS185S0100000_14.l0;
        if (c83553Wqj.LJLJLLL == null) {
            c83553Wqj.LJLJLLL = "";
        }
    }
}
