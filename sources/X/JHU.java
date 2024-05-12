package X;

import android.graphics.drawable.Animatable;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JHU extends AbstractC72439Sbr {
    public final /* synthetic */ JHN LJLIL;

    public JHU(JHN jhn) {
        this.LJLIL = jhn;
    }

    @Override // X.AbstractC72439Sbr, X.InterfaceC70769Rq1
    public final void T1(android.net.Uri uri, SmartImageView smartImageView) {
        String str;
        super.T1(uri, smartImageView);
        Aweme mAweme = this.LJLIL.getMAweme();
        if (mAweme == null || (str = mAweme.getAid()) == null) {
            str = "";
        }
        JHV LIZ = JHP.LIZ(str);
        LIZ.getClass();
        if (o.LJ(LIZ, JHW.LIZ)) {
            return;
        }
        LIZ.LJFF = System.currentTimeMillis();
    }

    @Override // X.InterfaceC70769Rq1
    public final void s2(android.net.Uri uri, View view, Throwable th) {
        String str;
        Aweme mAweme = this.LJLIL.getMAweme();
        if (mAweme == null || (str = mAweme.getAid()) == null) {
            str = "";
        }
        JHP.LIZ(str).LIZ();
    }

    @Override // X.InterfaceC70769Rq1
    public final void U0(android.net.Uri uri, View view, C2047581v c2047581v, Animatable animatable) {
        String str;
        o.LJIIIZ(uri, "uri");
        Aweme mAweme = this.LJLIL.getMAweme();
        if (mAweme == null || (str = mAweme.getAid()) == null) {
            str = "";
        }
        JHP.LIZ(str).LIZ();
    }
}
