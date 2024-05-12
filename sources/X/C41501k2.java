package X;

import android.app.Application;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.android.ecommerce.ocr.view.OcrActivity;
import com.bytedance.pipo.ocr.bean.PipoOcrResult;
import com.bytedance.pipo.ocr.view.CardOcrActivity;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import ij2.a;
import kotlin.jvm.internal.o;
import wi2.d;
import yi2.b;

/* renamed from: X.1k2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41501k2 implements InterfaceC31001Jo {
    @Override // X.InterfaceC269513z
    public final void LIZ(int i, int i2, String str, PipoOcrResult pipoOcrResult, String str2) {
    }

    public static final void LIZIZ(F6K f6k, d scenarioType, final InterfaceC269513z interfaceC269513z) {
        int i;
        Intent intent;
        a aVar = a.LJIJ;
        b bVar = new b() { // from class: X.1Jp
            @Override // yi2.b
            public final void LIZ(int i2, int i3, String str, PipoOcrResult pipoOcrResult, String str2) {
                InterfaceC269513z.this.LIZ(i2, i3, str, pipoOcrResult, str2);
            }
        };
        aVar.getClass();
        o.LJIIIZ(scenarioType, "scenarioType");
        a.LJIILIIL = "pitaya";
        a.LJIILJJIL = "pitaya";
        a.LJIILL = null;
        a.LJII = scenarioType;
        Integer num = f6k.LJLJJI;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        a.LJIIJJI = i;
        a.LJIILLIIL = true;
        a.LJIILIIL = a.LJ(i);
        if (a.LIZIZ) {
            aj2.d dVar = a.LIZ;
            if (dVar != null) {
                if (!TextUtils.isEmpty(dVar.LIZIZ)) {
                    a.LJI = bVar;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("startBankCardOcr: merchantUserId is ");
                    LIZ.append(f6k.LJLILLLLZI);
                    LIZ.append(" nonce is ");
                    LIZ.append(f6k.LJLJI);
                    X1D.LIZIZ(LIZ);
                    if (a.LJFF) {
                        aVar.LIZ(0, 102, "The ocr service is running, please do not repeat it!", null, "unknown");
                        return;
                    }
                    aj2.d dVar2 = a.LIZ;
                    if (dVar2 != null) {
                        Application application = dVar2.LIZ;
                        a.LJFF = true;
                        a.LIZJ = f6k.LJLIL;
                        a.LIZLLL = f6k.LJLILLLLZI;
                        a.LJ = f6k.LJLJI;
                        try {
                            String str = f6k.LJLJJLL;
                            if (str != null && str.length() != 0 && !TextUtils.equals(str, CardStruct.IStatusCode.DEFAULT)) {
                                intent = new Intent(application, (Class<?>) CardOcrActivity.class);
                                intent.putExtra("showSecurityTips", f6k.LJLJJL);
                                intent.setFlags(268435456);
                                C78598Ut0.LJIJJ(intent, application);
                                application.startActivity(intent);
                                return;
                            }
                            intent = new Intent(application, (Class<?>) OcrActivity.class);
                            intent.setFlags(268435456);
                            C78598Ut0.LJIJJ(intent, application);
                            application.startActivity(intent);
                            return;
                        } catch (Throwable th) {
                            StringBuilder LIZ2 = X1D.LIZ();
                            aVar.LIZ(0, 103, C03090Af.LIZJ(LIZ2, "error to start ocr activity:", th, LIZ2), null, "unknown");
                            return;
                        }
                    }
                    o.LJIJI("mConfiguration");
                    throw null;
                }
                throw new IllegalArgumentException("please configure host in init");
            }
            o.LJIJI("mConfiguration");
            throw null;
        }
        throw new IllegalArgumentException("please init first");
    }
}
