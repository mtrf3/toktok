package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.dsp.playpage.model.DspFeedResponse;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.io.FileOutputStream;
import kotlin.jvm.internal.o;

/* renamed from: X.ZuR, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91427ZuR<T, R> implements InterfaceC48038ItG {
    public final /* synthetic */ DspFeedResponse LJLIL;

    public C91427ZuR(DspFeedResponse dspFeedResponse) {
        this.LJLIL = dspFeedResponse;
    }

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object it) {
        o.LJIIIZ(it, "it");
        String value = GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), this.LJLIL);
        if (TextUtils.isEmpty(value)) {
            return Boolean.FALSE;
        }
        C37246Eja c37246Eja = C37247Ejb.LIZIZ;
        String LIZ = C91237ZrN.LIZ();
        c37246Eja.getClass();
        FileOutputStream fileOutputStream = new FileOutputStream(C37246Eja.LIZJ(LIZ));
        try {
            o.LJIIIIZZ(value, "value");
            byte[] bytes = value.getBytes(PVC.LIZ);
            o.LJIIIIZZ(bytes, "this as java.lang.String).getBytes(charset)");
            fileOutputStream.write(bytes);
            Boolean bool = Boolean.TRUE;
            AnonymousClass636.LJFF(fileOutputStream, null);
            return bool;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AnonymousClass636.LJFF(fileOutputStream, th);
                throw th2;
            }
        }
    }
}
