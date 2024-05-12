package X;

import android.text.Editable;
import android.text.TextUtils;
import android.widget.EditText;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Xio, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85610Xio extends AbstractC65781Prl implements InterfaceC88472Yns<String, C76800UCe> {
    public final /* synthetic */ EditText LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85610Xio(EditText editText, String str, String str2, String str3) {
        super(1);
        this.LJLIL = editText;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = str3;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(String str) {
        String it = str;
        o.LJIIIZ(it, "it");
        Editable text = this.LJLIL.getText();
        if (TextUtils.isEmpty(text)) {
            this.LJLIL.setText(it);
        } else {
            o.LJI(text);
            int LJJLIIIJL = s.LJJLIIIJL(text.toString(), "@", 0, false, 6);
            if (LJJLIIIJL != -1) {
                text.replace(LJJLIIIJL, text.length(), it);
            } else {
                text.append((CharSequence) it);
            }
        }
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_from", this.LJLILLLLZI);
        c35936E8m.LIZLLL("enter_method", this.LJLJI);
        c35936E8m.LIZLLL("bind_type", this.LJLJJI);
        FMX.LJIIL("choose_recommend_email_suffix", c35936E8m.LIZ);
        return C76800UCe.LIZ;
    }
}
