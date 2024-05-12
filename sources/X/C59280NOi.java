package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.ss.android.ugc.aweme.commercialize.depend.AdTaskDependImpl;
import com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.NOi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59280NOi implements IAdTaskDepend {
    public static final C59280NOi LIZIZ = new C59280NOi();
    public final /* synthetic */ IAdTaskDepend LIZ = AdTaskDependImpl.LJIIZILJ();

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final boolean LIZ(Context context, String str) {
        return this.LIZ.LIZ(context, str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final void LIZIZ(String openUrl) {
        o.LJIIIZ(openUrl, "openUrl");
        this.LIZ.LIZIZ(openUrl);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final void LIZJ(Context context) {
        o.LJIIIZ(context, "context");
        this.LIZ.LIZJ(context);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final void LIZLLL(Context context, String schema, String str, Bundle bundle) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(schema, "schema");
        this.LIZ.LIZLLL(context, schema, str, bundle);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final String LJ() {
        return this.LIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final void LJFF(Context context) {
        o.LJIIIZ(context, "context");
        this.LIZ.LJFF(context);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final boolean LJI(AwemeRawAd awemeRawAd) {
        return this.LIZ.LJI(awemeRawAd);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final boolean LJII(int i, Context context) {
        o.LJIIIZ(context, "context");
        return this.LIZ.LJII(i, context);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final boolean LJIIIIZZ(Context context, String str) {
        o.LJIIIZ(context, "context");
        return this.LIZ.LJIIIIZZ(context, str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final JSONObject LJIIIZ(Context context, Aweme aweme) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(aweme, "aweme");
        return this.LIZ.LJIIIZ(context, aweme);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final boolean LJIIJ(Context context, AwemeRawAd awemeRawAd, String url, String title, String awemeId, int i) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(url, "url");
        o.LJIIIZ(title, "title");
        o.LJIIIZ(awemeId, "awemeId");
        return this.LIZ.LJIIJ(context, awemeRawAd, url, title, awemeId, i);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final boolean LJIIJJI(String str, String str2, boolean z) {
        return this.LIZ.LJIIJJI(str, str2, z);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final Intent LJIIL(Context context) {
        o.LJIIIZ(context, "context");
        return this.LIZ.LJIIL(context);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final boolean LJIILIIL(Context context, AwemeRawAd awemeRawAd, String url) {
        o.LJIIIZ(url, "url");
        o.LJIIIZ(context, "context");
        return this.LIZ.LJIILIIL(context, awemeRawAd, url);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final boolean LJIILJJIL(String str) {
        return this.LIZ.LJIILJJIL(str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final boolean LJIILL() {
        return this.LIZ.LJIILL();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final boolean LJIILLIIL(String str, String str2, String str3, String str4, Context context) {
        return this.LIZ.LJIILLIIL(str, str2, str3, str4, context);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final boolean open(String openUrl) {
        o.LJIIIZ(openUrl, "openUrl");
        return this.LIZ.open(openUrl);
    }
}
