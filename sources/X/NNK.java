package X;

import Y.ACallableS113S0100000_10;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS63S1100000_10;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes11.dex */
public class NNK extends NNJ {
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(new AqS160S0100000_10(this, 579));

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.NNJ
    public final boolean LIZIZ() {
        String str;
        NNG nng = NNG.LIZIZ;
        nng.LIZ.LIZLLL("ad_lynx_download_ThirdAppOpenUrlHandler_doHandle", "begin", String.valueOf(LIZLLL().LIZ.LIZJ));
        Intent intent = (Intent) this.LIZJ.getValue();
        String str2 = LIZLLL().LIZJ.LIZ;
        if (TextUtils.isEmpty(LIZLLL().LIZJ.LIZJ)) {
            str = LIZLLL().LJ.LIZ;
        } else {
            str = LIZLLL().LIZJ.LIZJ;
        }
        if (LIZLLL().LIZJ.LIZLLL) {
            String LIZ = C58774N4w.LIZ(str2, str);
            if (LIZ != null) {
                str2 = LIZ;
            }
            NNM nnm = new NNM();
            new AqS63S1100000_10(this, str, 15).invoke(nnm.LIZ);
            C58774N4w.LIZIZ = (C58773N4v) nnm.LIZ;
        } else if (s.LJJJLZIJ(str2, "__back_url__", false)) {
            String builder = UriProtector.parse(NO2.LIZ).buildUpon().appendQueryParameter("tag", str).toString();
            o.LJIIIIZZ(builder, "parse(CommercializeConst…              .toString()");
            String encode = android.net.Uri.encode(builder);
            o.LJIIIIZZ(encode, "encode(backUrl)");
            str2 = ujb.o.LJJJJZ(str2, "__back_url__", encode, false);
            C10K.LIZJ(new ACallableS113S0100000_10(this, 23));
        }
        android.net.Uri parse = UriProtector.parse(str2);
        if (!TextUtils.isEmpty(LIZLLL().LIZ.LJIIIIZZ)) {
            parse = parse.buildUpon().appendQueryParameter("source_aid", LIZLLL().LIZ.LJIIIIZZ).build();
        }
        intent.setData(parse);
        nng.LIZ.LIZLLL("ad_lynx_download_ThirdAppOpenUrlHandler_doHandle", "startActivitySafely", String.valueOf(LIZLLL().LIZ.LIZJ));
        return NNJ.LJFF(LIZJ(), intent);
    }

    @Override // X.NNJ
    public boolean LIZ() {
        if (LIZLLL().LIZJ.LIZIZ || TextUtils.isEmpty(LIZLLL().LIZJ.LIZ)) {
            return false;
        }
        return FCD.LJ(LIZJ(), (Intent) this.LIZJ.getValue());
    }
}
