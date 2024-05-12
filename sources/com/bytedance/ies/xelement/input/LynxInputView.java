package com.bytedance.ies.xelement.input;

import X.C41997Ge1;
import X.VNU;
import X.VPD;
import X.VSD;
import android.content.Context;
import android.text.method.PasswordTransformationMethod;
import android.text.method.SingleLineTransformationMethod;
import android.widget.EditText;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class LynxInputView extends LynxBaseInputView {
    public C41997Ge1 LLIIL;

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView
    public final int LJJII() {
        return 16;
    }

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView
    public final void LJIL() {
        if (this.LLIIJLIL) {
            C41997Ge1 c41997Ge1 = this.LLIIL;
            if (c41997Ge1 != null) {
                if (c41997Ge1.getInputType() == 12290) {
                    C41997Ge1 c41997Ge12 = this.LLIIL;
                    if (c41997Ge12 != null) {
                        c41997Ge12.setInputType(2);
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
        C41997Ge1 c41997Ge13 = this.LLIIL;
        if (c41997Ge13 != null) {
            if (c41997Ge13.getInputType() != 2) {
                return;
            }
            C41997Ge1 c41997Ge14 = this.LLIIL;
            if (c41997Ge14 != null) {
                c41997Ge14.setInputType(12290);
                return;
            } else {
                o.LJIJI("mEditText");
                throw null;
            }
        }
        o.LJIJI("mEditText");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LynxInputView(VNU context) {
        super(context);
        o.LJIIJ(context, "context");
    }

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView
    /* renamed from: LJJ */
    public final C41997Ge1 createView(Context context) {
        C41997Ge1 createView = super.createView(context);
        this.LLIIL = createView;
        if (createView != null) {
            createView.setOnEditorActionListener(new VSD(this));
            createView.setOnTouchListener(null);
            createView.setImeOptions(6);
            C41997Ge1 c41997Ge1 = this.LLIIL;
            if (c41997Ge1 != null) {
                return c41997Ge1;
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
        editText.setLines(1);
        editText.setSingleLine(true);
        editText.setHorizontallyScrolling(true);
    }

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView, com.lynx.tasm.behavior.ui.LynxUI
    public final /* bridge */ /* synthetic */ EditText createView(Context context) {
        return createView(context);
    }

    @VPD(defaultBoolean = false, name = "password")
    public final void setIsPassword(boolean z) {
        if (z) {
            C41997Ge1 c41997Ge1 = this.LLIIL;
            if (c41997Ge1 != null) {
                int selectionStart = c41997Ge1.getSelectionStart();
                C41997Ge1 c41997Ge12 = this.LLIIL;
                if (c41997Ge12 != null) {
                    c41997Ge12.setInputType(128);
                    C41997Ge1 c41997Ge13 = this.LLIIL;
                    if (c41997Ge13 != null) {
                        c41997Ge13.setTransformationMethod(PasswordTransformationMethod.getInstance());
                        C41997Ge1 c41997Ge14 = this.LLIIL;
                        if (c41997Ge14 != null) {
                            c41997Ge14.setSelection(selectionStart);
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
            o.LJIJI("mEditText");
            throw null;
        }
        C41997Ge1 c41997Ge15 = this.LLIIL;
        if (c41997Ge15 != null) {
            int selectionStart2 = c41997Ge15.getSelectionStart();
            C41997Ge1 c41997Ge16 = this.LLIIL;
            if (c41997Ge16 != null) {
                c41997Ge16.setInputType(this.LLIIIILZ);
                C41997Ge1 c41997Ge17 = this.LLIIL;
                if (c41997Ge17 != null) {
                    c41997Ge17.setTransformationMethod(SingleLineTransformationMethod.getInstance());
                    C41997Ge1 c41997Ge18 = this.LLIIL;
                    if (c41997Ge18 != null) {
                        c41997Ge18.setSelection(selectionStart2);
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
        o.LJIJI("mEditText");
        throw null;
    }

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView
    public final void LJJIFFI(C41997Ge1 editText, String str) {
        o.LJIIJ(editText, "editText");
        switch (str.hashCode()) {
            case -1034364087:
                if (str.equals("number")) {
                    if (this.LLIIJLIL) {
                        editText.setInputType(2);
                        break;
                    } else {
                        editText.setInputType(12290);
                        break;
                    }
                }
                break;
            case 114715:
                if (str.equals("tel")) {
                    editText.setInputType(3);
                    break;
                }
                break;
            case 3556653:
                if (str.equals("text")) {
                    editText.setInputType(1);
                    break;
                }
                break;
            case 95582509:
                if (str.equals("digit")) {
                    editText.setInputType(8194);
                    break;
                }
                break;
            case 96619420:
                if (str.equals("email")) {
                    editText.setInputType(32);
                    break;
                }
                break;
            case 1216985755:
                if (str.equals("password")) {
                    editText.setInputType(128);
                    break;
                }
                break;
        }
        int selectionStart = editText.getSelectionStart();
        if (!o.LJ(str, "password")) {
            editText.setTransformationMethod(SingleLineTransformationMethod.getInstance());
        } else {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        editText.setSelection(selectionStart);
    }
}
