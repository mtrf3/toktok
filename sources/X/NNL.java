package X;

import Y.ACallableS113S0100000_10;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.rich.model.CommonAdData;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.jvm.internal.AqS141S0200000_10;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS63S1100000_10;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes11.dex */
public final class NNL extends AbstractC59249NNd {
    public final long LIZJ;
    public final String LIZLLL;
    public final long LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final String LJIIJ;
    public final C62822Ol8 LJIIJJI;

    @Override // X.AbstractC59248NNc
    public final boolean LIZIZ() {
        if (this.LJIIIIZZ || TextUtils.isEmpty(this.LJFF)) {
            return false;
        }
        return FCD.LJ(this.LIZIZ, (Intent) this.LJIIJJI.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC59249NNd
    public final C59289NOr LIZJ() {
        String str;
        Intent intent = (Intent) this.LJIIJJI.getValue();
        String str2 = this.LJFF;
        if (TextUtils.isEmpty(this.LJII)) {
            str = this.LJI;
        } else {
            str = this.LJII;
        }
        if (this.LJIIIZ) {
            String LIZ = C58774N4w.LIZ(str2, str);
            if (LIZ != null) {
                str2 = LIZ;
            }
            NNM nnm = new NNM();
            new AqS63S1100000_10(this, str, 4).invoke(nnm.LIZ);
            C58774N4w.LIZIZ = (C58773N4v) nnm.LIZ;
        } else if (s.LJJJLZIJ(str2, "__back_url__", false)) {
            String builder = UriProtector.parse(NO2.LIZ).buildUpon().appendQueryParameter("tag", str).toString();
            o.LJIIIIZZ(builder, "parse(CommercializeConst…              .toString()");
            String encode = android.net.Uri.encode(builder);
            o.LJIIIIZZ(encode, "encode(backUrl)");
            str2 = ujb.o.LJJJJZ(str2, "__back_url__", encode, false);
            C10K.LIZJ(new ACallableS113S0100000_10(this, 9));
        }
        android.net.Uri parse = UriProtector.parse(str2);
        if (!TextUtils.isEmpty(this.LJIIJ)) {
            parse = parse.buildUpon().appendQueryParameter("source_aid", this.LJIIJ).build();
        }
        intent.setData(parse);
        return C59275NOd.LIZIZ(this.LIZIZ, intent);
    }

    @Override // X.AbstractC59248NNc
    public final void LIZ(boolean z) {
        CommonAdData LIZ = this.LIZ.LIZ();
        if (z && (LIZ instanceof AwemeRawAd)) {
            C58704N2e.LIZLLL(this.LJI, "open_url_app", LIZ).LJI();
            NNG.LIZIZ.pendingDeepLinkLog(new AqS141S0200000_10(this, LIZ, 22));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NNL(InterfaceC59247NNb taskContext, Bundle bundle) {
        super(taskContext, bundle);
        o.LJIIIZ(taskContext, "taskContext");
        this.LIZJ = bundle.getLong("creative_id", 0L);
        String string = bundle.getString("log_extra", "");
        o.LJIIIIZZ(string, "params.getString(RichTaskParams.KEY_LOG_EXTRA, \"\")");
        this.LIZLLL = string;
        this.LJ = bundle.getLong("group_id", 0L);
        String string2 = bundle.getString("open_url", "");
        o.LJIIIIZZ(string2, "params.getString(RichTaskParams.KEY_OPEN_URL, \"\")");
        this.LJFF = string2;
        String string3 = bundle.getString("log_tag", "draw_ad");
        o.LJIIIIZZ(string3, "params.getString(RichTas…cializeMob.Event.DRAW_AD)");
        this.LJI = string3;
        this.LJII = bundle.getString("back_url_tag");
        this.LJIIIIZZ = bundle.getBoolean("forbidden_open_3rd_app", false);
        this.LJIIIZ = bundle.getBoolean("use_adx_deeplink", false);
        this.LJIIJ = bundle.getString("aweme_id");
        this.LJIIJJI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 402));
    }
}
