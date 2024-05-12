package X;

import android.content.Intent;
import com.bytedance.effectcreatormobile.ckeapi.api.text.TextAlign;
import com.bytedance.effectcreatormobile.ckeapi.api.text.TextModel;
import com.bytedance.effectcreatormobile.ckeapi.api.text.TextStyle;
import com.ss.android.ugc.aweme.effectcreator.text.TextEditActivity;
import fjb.a;
import java.util.Arrays;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.effectcreator.text.TextEditActivity$update$1$1", f = "TextEditActivity.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.amy, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94808amy extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ TextEditActivity LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ int LJLJJLL;
    public final /* synthetic */ String LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94808amy(TextEditActivity textEditActivity, String str, int i, String str2, int i2, int i3, String str3, InterfaceC67352kd<? super C94808amy> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = textEditActivity;
        this.LJLILLLLZI = str;
        this.LJLJI = i;
        this.LJLJJI = str2;
        this.LJLJJL = i2;
        this.LJLJJLL = i3;
        this.LJLJL = str3;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C94808amy(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        TextStyle textStyle;
        TextAlign textAlign;
        C141335gf.LIZJ(obj);
        Intent intent = new Intent();
        String str = this.LJLILLLLZI;
        TextEditActivity textEditActivity = this.LJLIL;
        int i = this.LJLJI;
        String str2 = this.LJLJJI;
        int i2 = this.LJLJJL;
        int i3 = this.LJLJJLL;
        String str3 = this.LJLJL;
        textEditActivity.getClass();
        String LLLZ = C16880lQ.LLLZ("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(i & 16777215)}, 1));
        o.LJIIIIZZ(LLLZ, "format(format, *args)");
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        textStyle = TextStyle.None;
                    } else {
                        textStyle = TextStyle.TextStrokeColor;
                    }
                } else {
                    textStyle = TextStyle.TextAlphaBgColor;
                }
            } else {
                textStyle = TextStyle.TextBgColor;
            }
        } else {
            textStyle = TextStyle.TextColor;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    textAlign = TextAlign.Center;
                } else {
                    textAlign = TextAlign.Right;
                }
            } else {
                textAlign = TextAlign.Center;
            }
        } else {
            textAlign = TextAlign.Left;
        }
        intent.putExtra("key_text_model", new TextModel(str, LLLZ, str2, textStyle, textAlign, str3));
        this.LJLIL.setResult(-1, intent);
        this.LJLIL.finish();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
