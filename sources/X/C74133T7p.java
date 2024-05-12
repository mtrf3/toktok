package X;

import android.content.Context;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.T7p, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74133T7p extends T8F {
    public final T84 LJLILLLLZI;
    public final Context LJLJI;
    public final C37481dY LJLJJI;
    public final MIL LJLJJL;
    public C74141T7x LJLJJLL;
    public final SmartImageView LJLJL;

    /* JADX WARN: Removed duplicated region for block: B:66:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b8  */
    @Override // X.T8F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L(X.C74125T7h r13) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74133T7p.L(X.T7h):void");
    }

    public C74133T7p(T84 t84, View view, Context context, C37481dY c37481dY, MIL mil) {
        super(view);
        this.LJLILLLLZI = t84;
        this.LJLJI = context;
        this.LJLJJI = c37481dY;
        this.LJLJJL = mil;
        if (C99W.LIZ) {
            view.findViewById(R.id.a62).getClass();
            SY4 sy4 = (SY4) view.findViewById(R.id.a64);
            sy4.getClass();
            sy4.setButtonVariant(5);
            View findViewById = view.findViewById(R.id.n95);
            o.LJIIIIZZ(findViewById, "view.findViewById(R.id.video_thumbnail_iv_rounded)");
            this.LJLJL = (SmartImageView) findViewById;
            return;
        }
        View findViewById2 = view.findViewById(R.id.n94);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.video_thumbnail_iv)");
        this.LJLJL = (SmartImageView) findViewById2;
    }
}
