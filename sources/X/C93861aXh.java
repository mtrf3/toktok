package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;
import kotlin.jvm.internal.o;

/* renamed from: X.aXh, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93861aXh implements TextWatcher {
    public final /* synthetic */ EditText LJLIL;
    public final /* synthetic */ AbstractC94471ahX LJLILLLLZI;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        EditText editText = this.LJLIL;
        o.LJIIIIZZ(editText, "editText");
        String obj = editText.getText().toString();
        C93890aYA c93890aYA = CKEffectEditorContext.LJFF;
        if (c93890aYA != null) {
            long j = this.LJLILLLLZI.LJFF().LJLIL;
            EditText editText2 = this.LJLIL;
            o.LJIIIIZZ(editText2, "editText");
            if (c93890aYA.LIZJ(j, editText2.getText().toString())) {
                C94220adU LJFF = this.LJLILLLLZI.LJFF();
                LJFF.getClass();
                o.LJIIIZ(obj, "<set-?>");
                LJFF.LJLILLLLZI = obj;
            }
        }
    }

    public C93861aXh(EditText editText, AbstractC94471ahX abstractC94471ahX) {
        this.LJLIL = editText;
        this.LJLILLLLZI = abstractC94471ahX;
    }
}
