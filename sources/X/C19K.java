package X;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.Editable;
import android.text.TextUtils;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.appcompat.widget.a0;
import androidx.appcompat.widget.z0;
import com.zhiliaoapp.musically.R;
import o3.h0;

/* renamed from: X.19K, reason: invalid class name */
/* loaded from: classes.dex */
public class C19K extends EditText implements InterfaceC16810lJ {
    public final C03A LJLIL;
    public final a0 LJLILLLLZI;
    public final C014203u LJLJI;
    public final C28571Af LJLJJI;
    public final C19L LJLJJL;

    public ColorStateList getSupportBackgroundTintList() {
        C03A c03a = this.LJLIL;
        if (c03a != null) {
            return c03a.LIZIZ();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C03A c03a = this.LJLIL;
        if (c03a != null) {
            return c03a.LIZJ();
        }
        return null;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C014203u c014203u;
        if (Build.VERSION.SDK_INT >= 28 || (c014203u = this.LJLJI) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = c014203u.LIZIZ;
        if (textClassifier == null) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) c014203u.LIZ.getContext().getSystemService(TextClassificationManager.class);
            if (textClassificationManager != null) {
                return textClassificationManager.getTextClassifier();
            }
            return TextClassifier.NO_OP;
        }
        return textClassifier;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C03A c03a = this.LJLIL;
        if (c03a != null) {
            c03a.LIZ();
        }
        a0 a0Var = this.LJLILLLLZI;
        if (a0Var != null) {
            a0Var.LIZIZ();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C023107f.LJIIIIZZ(super.getCustomSelectionActionModeCallback());
    }

    @Override // X.InterfaceC16810lJ
    public final C16190kJ LIZLLL(C16190kJ c16190kJ) {
        return this.LJLJJI.LIZ(this, c16190kJ);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] LJIIIIZZ;
        String[] stringArray;
        InputConnectionWrapper inputConnectionWrapper;
        final InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.LJLILLLLZI.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 && onCreateInputConnection != null) {
            C20390r5.LIZ(editorInfo, getText());
        }
        C78897Uxp.LJJJI(this, editorInfo, onCreateInputConnection);
        if (onCreateInputConnection != null && i <= 30 && (LJIIIIZZ = h0.LJIIIIZZ(this)) != null) {
            if (i >= 25) {
                editorInfo.contentMimeTypes = LJIIIIZZ;
            } else {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", LJIIIIZZ);
                editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", LJIIIIZZ);
            }
            final C1YZ c1yz = new C1YZ(this);
            if (i >= 25) {
                inputConnectionWrapper = new InputConnectionWrapper(onCreateInputConnection) { // from class: X.0r6
                    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
                    public final boolean commitContent(InputContentInfo inputContentInfo, int i2, Bundle bundle) {
                        C20440rA c20440rA;
                        InterfaceC20420r8 interfaceC20420r8 = c1yz;
                        if (inputContentInfo == null || Build.VERSION.SDK_INT < 25) {
                            c20440rA = null;
                        } else {
                            c20440rA = new C20440rA(new C34761Ya(inputContentInfo));
                        }
                        if (((C1YZ) interfaceC20420r8).LIZ(c20440rA, i2, bundle)) {
                            return true;
                        }
                        return super.commitContent(inputContentInfo, i2, bundle);
                    }
                };
            } else {
                String[] strArr = C20390r5.LIZ;
                Bundle bundle = editorInfo.extras;
                if (bundle != null && ((stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES")) != null || (stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES")) != null)) {
                    strArr = stringArray;
                }
                if (strArr.length != 0) {
                    inputConnectionWrapper = new InputConnectionWrapper(onCreateInputConnection) { // from class: X.0r7
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r8v0 */
                        /* JADX WARN: Type inference failed for: r8v3, types: [boolean] */
                        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
                        public final boolean performPrivateCommand(String str, Bundle bundle2) {
                            boolean z;
                            String str2;
                            String str3;
                            String str4;
                            String str5;
                            String str6;
                            String str7;
                            InterfaceC20420r8 interfaceC20420r8 = c1yz;
                            int i2 = 0;
                            r8 = 0;
                            int i3 = 0;
                            if (bundle2 != null) {
                                if (TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                                    z = false;
                                } else if (TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                                    z = true;
                                }
                                if (z) {
                                    str2 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
                                } else {
                                    str2 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
                                }
                                try {
                                    ResultReceiver resultReceiver = (ResultReceiver) bundle2.getParcelable(str2);
                                    if (z) {
                                        str3 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";
                                    } else {
                                        str3 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";
                                    }
                                    try {
                                        android.net.Uri uri = (android.net.Uri) bundle2.getParcelable(str3);
                                        if (z) {
                                            str4 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
                                        } else {
                                            str4 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
                                        }
                                        ClipDescription clipDescription = (ClipDescription) bundle2.getParcelable(str4);
                                        if (z) {
                                            str5 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
                                        } else {
                                            str5 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
                                        }
                                        android.net.Uri uri2 = (android.net.Uri) bundle2.getParcelable(str5);
                                        if (z) {
                                            str6 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
                                        } else {
                                            str6 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
                                        }
                                        int i4 = bundle2.getInt(str6);
                                        if (z) {
                                            str7 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
                                        } else {
                                            str7 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
                                        }
                                        Bundle bundle3 = (Bundle) bundle2.getParcelable(str7);
                                        if (uri != null && clipDescription != null) {
                                            i2 = ((C1YZ) interfaceC20420r8).LIZ(new C20440rA(uri, clipDescription, uri2), i4, bundle3);
                                            i3 = i2;
                                        }
                                        if (resultReceiver != null) {
                                            resultReceiver.send(i3, null);
                                        }
                                        if (i3 != 0) {
                                            return true;
                                        }
                                    } catch (Throwable th) {
                                        if (resultReceiver != null) {
                                            resultReceiver.send(i2, null);
                                            throw th;
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            return super.performPrivateCommand(str, bundle2);
                        }
                    };
                }
            }
            onCreateInputConnection = inputConnectionWrapper;
        }
        return this.LJLJJL.LIZLLL(onCreateInputConnection, editorInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 31 && i >= 24 && dragEvent.getLocalState() == null && h0.LJIIIIZZ(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof Activity) {
                    Activity activity = (Activity) context;
                    if (activity != null && dragEvent.getAction() != 1 && dragEvent.getAction() == 3 && C013903r.LIZ(dragEvent, this, activity)) {
                        return true;
                    }
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        ClipData primaryClip;
        int i2 = 0;
        if (Build.VERSION.SDK_INT >= 31 || h0.LJIIIIZZ(this) == null || (i != 16908322 && i != 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) C16880lQ.LLILL(getContext(), "clipboard");
        if (clipboardManager != null && (primaryClip = clipboardManager.getPrimaryClip()) != null && primaryClip.getItemCount() > 0) {
            C16160kG c16160kG = new C16160kG(primaryClip, 1);
            if (i != 16908322) {
                i2 = 1;
            }
            c16160kG.LIZ.LIZIZ(i2);
            h0.LJIILJJIL(this, c16160kG.LIZ.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C03A c03a = this.LJLIL;
        if (c03a != null) {
            c03a.LJ();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C03A c03a = this.LJLIL;
        if (c03a != null) {
            c03a.LJFF(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C023107f.LJIIIZ(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.LJLJJL.LJ(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.LJLJJL.LIZ(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C03A c03a = this.LJLIL;
        if (c03a != null) {
            c03a.LJII(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C03A c03a = this.LJLIL;
        if (c03a != null) {
            c03a.LJIIIIZZ(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C014203u c014203u;
        if (Build.VERSION.SDK_INT >= 28 || (c014203u = this.LJLJI) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c014203u.LIZIZ = textClassifier;
        }
    }

    public C19K(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.aar);
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        a0 a0Var = this.LJLILLLLZI;
        if (a0Var != null) {
            a0Var.LJ(i, context);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19K(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        z0.LIZ(context);
        C16880lQ.LLLLII(getContext());
        C03A c03a = new C03A(this);
        this.LJLIL = c03a;
        c03a.LIZLLL(attributeSet, i);
        a0 a0Var = new a0(this);
        this.LJLILLLLZI = a0Var;
        a0Var.LIZLLL(attributeSet, i);
        a0Var.LIZIZ();
        this.LJLJI = new C014203u(this);
        this.LJLJJI = new C28571Af();
        C19L c19l = new C19L(this);
        this.LJLJJL = c19l;
        c19l.LIZIZ(attributeSet, i);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            int inputType = super.getInputType();
            KeyListener LIZ = c19l.LIZ(keyListener);
            if (LIZ == keyListener) {
                return;
            }
            super.setKeyListener(LIZ);
            super.setRawInputType(inputType);
            super.setFocusable(isFocusable);
        }
    }
}
