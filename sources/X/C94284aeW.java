package X;

import android.text.TextUtils;
import android.widget.EditText;
import com.ugc.effectcreator.layer.EffectLayerEditorFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.aeW, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94284aeW implements InterfaceC93737aVh {
    public final /* synthetic */ EffectLayerEditorFragment LIZ;
    public final /* synthetic */ EditText LIZIZ;
    public final /* synthetic */ C93861aXh LIZJ;

    @Override // X.InterfaceC93737aVh
    public final void LIZ(int i) {
    }

    @Override // X.InterfaceC93737aVh
    public final void LIZIZ(int i) {
        if (i == 0) {
            this.LIZIZ.clearFocus();
            EditText editText = this.LIZIZ;
            o.LJIIIIZZ(editText, "editText");
            editText.setFocusable(false);
            EditText editText2 = this.LIZIZ;
            o.LJIIIIZZ(editText2, "editText");
            editText2.setFocusableInTouchMode(false);
            EditText editText3 = this.LIZIZ;
            o.LJIIIIZZ(editText3, "editText");
            editText3.setActivated(false);
            EditText editText4 = this.LIZIZ;
            o.LJIIIIZZ(editText4, "editText");
            editText4.setSingleLine(true);
            EditText editText5 = this.LIZIZ;
            o.LJIIIIZZ(editText5, "editText");
            editText5.setKeyListener(null);
            EditText editText6 = this.LIZIZ;
            o.LJIIIIZZ(editText6, "editText");
            editText6.setEllipsize(TextUtils.TruncateAt.END);
            this.LIZIZ.removeTextChangedListener(this.LIZJ);
            C93738aVi c93738aVi = this.LIZ.LJLJLLL;
            if (c93738aVi != null) {
                c93738aVi.LIZJ.remove(this);
            }
        }
    }

    public C94284aeW(EffectLayerEditorFragment effectLayerEditorFragment, EditText editText, C93861aXh c93861aXh) {
        this.LIZ = effectLayerEditorFragment;
        this.LIZIZ = editText;
        this.LIZJ = c93861aXh;
    }
}
