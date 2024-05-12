package X;

import android.R;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import android.widget.TextView;
import androidx.emoji2.text.f;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.o;

/* renamed from: X.19L, reason: invalid class name */
/* loaded from: classes.dex */
public final class C19L implements InterfaceC153055zZ {
    public final Object LJLIL;
    public final Object LJLILLLLZI;

    public /* synthetic */ C19L(C40647FxL c40647FxL, InterfaceC153055zZ interfaceC153055zZ) {
        this.LJLIL = c40647FxL;
        this.LJLILLLLZI = interfaceC153055zZ;
    }

    @Override // X.InterfaceC153055zZ
    public final /* bridge */ /* synthetic */ Object a() {
        Object a = ((InterfaceC153055zZ) this.LJLILLLLZI).a();
        C40654FxS.LJI(a);
        return a;
    }

    public /* synthetic */ C19L(EditText editText) {
        this.LJLIL = editText;
        this.LJLILLLLZI = new C0F5(editText);
    }

    public final KeyListener LIZ(final KeyListener keyListener) {
        if (!(keyListener instanceof NumberKeyListener)) {
            ((C0F5) this.LJLILLLLZI).LIZ.getClass();
            if (keyListener instanceof C0FB) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return new KeyListener(keyListener) { // from class: X.0FB
                public final KeyListener LJLIL;
                public final C0FA LJLILLLLZI;

                @Override // android.text.method.KeyListener
                public final int getInputType() {
                    return this.LJLIL.getInputType();
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [X.0FA] */
                {
                    ?? r0 = new Object() { // from class: X.0FA
                    };
                    this.LJLIL = keyListener;
                    this.LJLILLLLZI = r0;
                }

                @Override // android.text.method.KeyListener
                public final void clearMetaKeyState(View view, Editable editable, int i) {
                    this.LJLIL.clearMetaKeyState(view, editable, i);
                }

                @Override // android.text.method.KeyListener
                public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
                    return this.LJLIL.onKeyOther(view, editable, keyEvent);
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0017 A[ORIG_RETURN, RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:9:0x0018 A[RETURN, SYNTHETIC] */
                @Override // android.text.method.KeyListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final boolean onKeyDown(android.view.View r4, android.text.Editable r5, int r6, android.view.KeyEvent r7) {
                    /*
                        r3 = this;
                        X.0FA r0 = r3.LJLILLLLZI
                        r0.getClass()
                        r2 = 67
                        r1 = 1
                        r0 = 0
                        if (r6 == r2) goto L1a
                        r0 = 112(0x70, float:1.57E-43)
                        if (r6 == r0) goto L1f
                    Lf:
                        android.text.method.KeyListener r0 = r3.LJLIL
                        boolean r0 = r0.onKeyDown(r4, r5, r6, r7)
                        if (r0 == 0) goto L18
                    L17:
                        return r1
                    L18:
                        r1 = 0
                        goto L17
                    L1a:
                        boolean r0 = X.C08G.LIZ(r5, r7, r0)
                        goto L23
                    L1f:
                        boolean r0 = X.C08G.LIZ(r5, r7, r1)
                    L23:
                        if (r0 == 0) goto Lf
                        android.text.method.MetaKeyKeyListener.adjustMetaAfterKeypress(r5)
                        goto L17
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0FB.onKeyDown(android.view.View, android.text.Editable, int, android.view.KeyEvent):boolean");
                }

                @Override // android.text.method.KeyListener
                public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
                    return this.LJLIL.onKeyUp(view, editable, i, keyEvent);
                }
            };
        }
        return keyListener;
    }

    public final void LIZJ(C109544Rq c109544Rq) {
        EnumC89223eo enumC89223eo;
        Integer valueOf;
        String str = (String) this.LJLIL;
        String str2 = (String) this.LJLILLLLZI;
        EnumC110124Tw.Companion.getClass();
        BaseContent LIZJ = C110134Tx.LIZJ(c109544Rq);
        if (LIZJ != null && (valueOf = Integer.valueOf(LIZJ.type)) != null) {
            int intValue = valueOf.intValue();
            if (intValue != 704) {
                if (intValue == 708) {
                    enumC89223eo = EnumC89223eo.SUGGESTED_QN_ANS;
                }
            } else {
                enumC89223eo = EnumC89223eo.WELCOME;
            }
            C89213en.LIZ(str, str2, enumC89223eo, C93793mB.LIZIZ(c109544Rq));
        }
        enumC89223eo = EnumC89223eo.DEFAULT;
        C89213en.LIZ(str, str2, enumC89223eo, C93793mB.LIZIZ(c109544Rq));
    }

    public final void LJ(boolean z) {
        C0FE c0fe = ((C0F5) this.LJLILLLLZI).LIZ.LIZIZ;
        if (c0fe.LJLJJI != z) {
            if (c0fe.LJLJI != null) {
                f LIZ = f.LIZ();
                C1EA c1ea = c0fe.LJLJI;
                LIZ.getClass();
                TMC.LJIIIZ(c1ea, "initCallback cannot be null");
                ((ReentrantReadWriteLock) LIZ.LIZ).writeLock().lock();
                try {
                    LIZ.LIZIZ.remove(c1ea);
                } finally {
                    ((ReentrantReadWriteLock) LIZ.LIZ).writeLock().unlock();
                }
            }
            c0fe.LJLJJI = z;
            if (z) {
                C0FE.LIZ(c0fe.LJLIL, f.LIZ().LIZIZ());
            }
        }
    }

    public /* synthetic */ C19L(String enterFrom, String enterMethod) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        this.LJLIL = enterFrom;
        this.LJLILLLLZI = enterMethod;
    }

    public final void LIZIZ(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = ((View) this.LJLIL).getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.textAppearance, com.zhiliaoapp.musically.R.attr.wg, com.zhiliaoapp.musically.R.attr.wh, com.zhiliaoapp.musically.R.attr.wi, com.zhiliaoapp.musically.R.attr.wj, com.zhiliaoapp.musically.R.attr.wk, com.zhiliaoapp.musically.R.attr.aa4, com.zhiliaoapp.musically.R.attr.aa5, com.zhiliaoapp.musically.R.attr.aa6, com.zhiliaoapp.musically.R.attr.aa7, com.zhiliaoapp.musically.R.attr.aa9, com.zhiliaoapp.musically.R.attr.aa_, com.zhiliaoapp.musically.R.attr.aaa, com.zhiliaoapp.musically.R.attr.aab, com.zhiliaoapp.musically.R.attr.ab9, com.zhiliaoapp.musically.R.attr.ad7, com.zhiliaoapp.musically.R.attr.ae9, com.zhiliaoapp.musically.R.attr.aei, com.zhiliaoapp.musically.R.attr.akp, com.zhiliaoapp.musically.R.attr.aog, com.zhiliaoapp.musically.R.attr.bhl, com.zhiliaoapp.musically.R.attr.bih}, i, 0);
        try {
            boolean z = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            LJ(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final InputConnection LIZLLL(final InputConnection inputConnection, final EditorInfo editorInfo) {
        C0F5 c0f5 = (C0F5) this.LJLILLLLZI;
        if (inputConnection == null) {
            c0f5.getClass();
            return null;
        }
        C1E6 c1e6 = c0f5.LIZ;
        c1e6.getClass();
        if (inputConnection instanceof C0F8) {
            return inputConnection;
        }
        final EditText editText = c1e6.LIZ;
        return new InputConnectionWrapper(editText, inputConnection, editorInfo) { // from class: X.0F8
            public final TextView LIZ;
            public final C0F7 LIZIZ;

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public final boolean deleteSurroundingText(int i, int i2) {
                C0F7 c0f7 = this.LIZIZ;
                Editable editableText = this.LIZ.getEditableText();
                c0f7.getClass();
                if (!C0F7.LIZ(this, editableText, i, i2, false) && !super.deleteSurroundingText(i, i2)) {
                    return false;
                }
                return true;
            }

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
                C0F7 c0f7 = this.LIZIZ;
                Editable editableText = this.LIZ.getEditableText();
                c0f7.getClass();
                if (C0F7.LIZ(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2)) {
                    return true;
                }
                return false;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(inputConnection, false);
                int i;
                C0F7 c0f7 = new C0F7();
                this.LIZ = editText;
                this.LIZIZ = c0f7;
                if (f.LIZJ()) {
                    f LIZ = f.LIZ();
                    if (LIZ.LIZIZ() != 1 || editorInfo == null) {
                        return;
                    }
                    if (editorInfo.extras == null) {
                        editorInfo.extras = new Bundle();
                    }
                    C28691Ar c28691Ar = LIZ.LJ;
                    c28691Ar.getClass();
                    Bundle bundle = editorInfo.extras;
                    C29361Dg c29361Dg = c28691Ar.LIZJ.LIZ;
                    int LIZ2 = c29361Dg.LIZ(4);
                    if (LIZ2 != 0) {
                        i = c29361Dg.LIZIZ.getInt(LIZ2 + c29361Dg.LIZ);
                    } else {
                        i = 0;
                    }
                    bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", i);
                    Bundle bundle2 = editorInfo.extras;
                    c28691Ar.LIZ.getClass();
                    bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
                }
            }
        };
    }
}
