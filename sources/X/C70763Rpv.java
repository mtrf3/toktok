package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.Rpv, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70763Rpv {
    public static final /* synthetic */ int LJIIIZ = 0;
    public Aweme LIZ;
    public C27606AsU LIZIZ;
    public final C46580IPw LIZJ;
    public final View LIZLLL;
    public final C73062Slu LJ;
    public long LJFF;
    public boolean LJI;
    public final C62822Ol8 LJII;
    public final C70768Rq0 LJIIIIZZ;

    public C70763Rpv(Context context) {
        View LIZLLL = AnonymousClass030.LIZLLL(context, R.layout.a2z, null, false, "from(context).inflate(\n …eader_video, null, false)");
        this.LIZLLL = LIZLLL;
        C73062Slu c73062Slu = (C73062Slu) LIZLLL.findViewById(R.id.lv2);
        o.LJIIIIZZ(c73062Slu, "this");
        this.LIZJ = new C46580IPw(c73062Slu);
        this.LJ = c73062Slu;
        this.LJI = true;
        this.LJII = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1026));
        this.LJIIIIZZ = new C70768Rq0(this);
    }
}
