package X;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.commercialize.hybrid.impl.AdHybridContainerManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.NHq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC59106NHq implements NV4 {
    public static final /* synthetic */ int LJLLI = 0;
    public final Context LJLIL;
    public boolean LJLILLLLZI;
    public Aweme LJLJI;
    public AbstractC59064NGa LJLJJLL;
    public boolean LJLJLJ;
    public View LJLJLLL;
    public String LJLJJI = "unspecified_reason";
    public String LJLJJL = "";
    public final Handler LJLJL = new Handler(C16880lQ.LLJJJJ());
    public EnumC46475ILv LJLL = EnumC46475ILv.STATUS_LOAD_LOADING;

    public abstract C59066NGc LIZIZ(Context context, Aweme aweme);

    public abstract C59421NTt LIZJ(Context context, Aweme aweme);

    public abstract int LIZLLL();

    public abstract boolean LJ();

    public abstract boolean LJFF();

    public abstract void LJI();

    public abstract void LJII();

    public abstract boolean LJIIIIZZ();

    public abstract void LJIIIZ();

    public abstract void LJIIJJI(String str, boolean z);

    public abstract void LJIIL(DataCenter dataCenter);

    public abstract boolean LJIILIIL(Aweme aweme);

    public final void LIZ() {
        if (this.LJLJJLL == null) {
            Aweme aweme = this.LJLJI;
            if (aweme != null) {
                this.LJLJJLL = AdHybridContainerManager.LIZLLL().LIZJ(LIZIZ(this.LJLIL, aweme), LIZJ(this.LJLIL, aweme));
            }
            C58582Rq.LIZ(" create adHybrid container", "IAdHybridBaseStyle");
        }
    }

    public final void LJIIJ() {
        Aweme aweme = this.LJLJI;
        if (aweme != null) {
            if (!LJIILIIL(aweme)) {
                C58582Rq.LIZ(" preload shouldShowAdLynx = false", "IAdHybridBaseStyle");
                return;
            }
            LIZ();
            AbstractC59064NGa abstractC59064NGa = this.LJLJJLL;
            if (abstractC59064NGa != null) {
                abstractC59064NGa.LJIJJ(LIZJ(this.LJLIL, aweme), this, null);
            }
            C58582Rq.LIZ(" normalRender ", "IAdHybridBaseStyle");
            LJII();
        }
    }

    public AbstractC59106NHq(Context context) {
        this.LJLIL = context;
    }

    @Override // X.NV4
    public final void ze(C58978NCs c58978NCs) {
        C58582Rq.LIZ("onLoadSuccess", "IAdHybridBaseStyle");
        this.LJLJLJ = true;
        this.LJLL = c58978NCs.LIZIZ;
        this.LJLJLLL = c58978NCs.LIZ;
    }

    @Override // X.NV4
    public final void Zi(String str, String str2) {
        this.LJLJLJ = false;
        this.LJLJJL = str;
        C58582Rq.LIZ("onLoadFailed", "IAdHybridBaseStyle");
    }
}
