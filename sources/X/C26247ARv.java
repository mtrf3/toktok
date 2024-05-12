package X;

import android.view.View;
import com.ss.android.ugc.aweme.translation.service.ITranslationLangKevaService;
import com.ss.android.ugc.aweme.translation.service.TranslationLangKevaServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.ARv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26247ARv extends ASB {
    @Override // X.ASG
    public final void LIZ(View v) {
        o.LJIIIZ(v, "v");
        ITranslationLangKevaService LJIIZILJ = TranslationLangKevaServiceImpl.LJIIZILJ();
        if (LJIIZILJ != null) {
            LJIIZILJ.LJFF();
        }
    }

    public C26247ARv(C62435Oet c62435Oet, AS3 as3) {
        super(c62435Oet, as3);
    }
}
