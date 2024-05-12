package X;

import android.content.Context;
import com.ss.android.ugc.aweme.journey.step.swipeup.WelcomeVideoWidget;
import fjb.a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.journey.step.swipeup.WelcomeVideoWidget$copyDefaultVideoToLocal$2$1", f = "WelcomeVideoWidget.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Eeo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36950Eeo extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ WelcomeVideoWidget LJLIL;
    public final /* synthetic */ InterfaceC67352kd<Boolean> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C36950Eeo(WelcomeVideoWidget welcomeVideoWidget, InterfaceC67352kd<? super Boolean> interfaceC67352kd, InterfaceC67352kd<? super C36950Eeo> interfaceC67352kd2) {
        super(2, interfaceC67352kd2);
        this.LJLIL = welcomeVideoWidget;
        this.LJLILLLLZI = interfaceC67352kd;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C36950Eeo(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C141335gf.LIZJ(obj);
        C37246Eja c37246Eja = C37247Ejb.LIZIZ;
        Context mContext = this.LJLIL.LJLIL;
        o.LJIIIIZZ(mContext, "mContext");
        String assetName = this.LJLIL.LJLJLJ;
        File LLIIIZ = C16880lQ.LLIIIZ(EF7.LIZIZ());
        if (LLIIIZ == null || (str = LLIIIZ.getAbsolutePath()) == null) {
            str = "";
        }
        c37246Eja.getClass();
        o.LJIIIZ(assetName, "assetName");
        File file = new File(str);
        if (file.exists() || file.mkdirs()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(file.getAbsoluteFile());
            LIZ.append("/");
            LIZ.append(assetName);
            File file2 = new File(X1D.LIZIZ(LIZ));
            file2.exists();
            try {
                if (C37246Eja.LIZ(mContext.getAssets().open(assetName), new FileOutputStream(file2))) {
                    file2.getAbsolutePath();
                }
            } catch (IOException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        InterfaceC67352kd<Boolean> interfaceC67352kd = this.LJLILLLLZI;
        Boolean bool = Boolean.TRUE;
        C3C5.m7constructorimpl(bool);
        interfaceC67352kd.resumeWith(bool);
        return C76800UCe.LIZ;
    }
}
