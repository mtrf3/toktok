package X;

import android.app.Activity;
import android.app.Dialog;
import com.google.android.play.core.assetpacks.r2;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public abstract class HSW implements S1E {
    public InterfaceC44105HSr LJLIL;
    public int LJLILLLLZI = 100;
    public String LJLJI = "";
    public boolean LJLJJI;

    @Override // X.S1E
    public void LJIIL(C188727au c188727au, boolean z) {
    }

    @Override // X.S1E
    public int LJIILJJIL() {
        return !((HSS) this).LJJIJIIJIL() ? 1 : 0;
    }

    public boolean LJIL() {
        return false;
    }

    @Override // X.S1E
    public final InterfaceC44105HSr LJIIIZ() {
        InterfaceC44105HSr interfaceC44105HSr = this.LJLIL;
        if (interfaceC44105HSr != null) {
            return interfaceC44105HSr;
        }
        o.LJIJI("internalContext");
        throw null;
    }

    @Override // X.S1E
    public InterfaceC44104HSq LJIJI() {
        return new HSI(this.LJLJI);
    }

    @Override // X.S1E
    public final int priority() {
        if (LJIL()) {
            return -1;
        }
        return this.LJLILLLLZI;
    }

    @Override // X.S1E
    public final boolean LJIILLIIL() {
        return this.LJLJJI;
    }

    @Override // X.S1E
    public void LJIIJJI(C7F9 c7f9) {
        this.LJLIL = c7f9;
    }

    public final void LJJ(AnchorCommonStruct mainAnchor) {
        Integer num;
        o.LJIIIZ(mainAnchor, "mainAnchor");
        List<AnchorCommonStruct> anchors = LJIIIZ().LJJLL().getAnchors();
        if (anchors != null) {
            num = Integer.valueOf(anchors.indexOf(mainAnchor));
        } else {
            num = null;
        }
        String logExtra = mainAnchor.getLogExtra();
        if (logExtra == null) {
            logExtra = "";
        }
        this.LJLJI = logExtra;
        if (num == null || num.intValue() == -1) {
            this.LJLILLLLZI = 100;
        } else {
            this.LJLILLLLZI = num.intValue();
        }
    }

    @Override // X.S1E
    public void LJIJ(Activity activity, Dialog dialog) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(dialog, "dialog");
    }

    @Override // X.S1E
    public void LJII(C7F9 chain, S1F tagView, r2 feedTagPresenter) {
        o.LJIIIZ(chain, "chain");
        o.LJIIIZ(tagView, "tagView");
        o.LJIIIZ(feedTagPresenter, "feedTagPresenter");
    }

    @Override // X.S1E
    public void LJIIZILJ(C7F9 chain, String str, boolean z) {
        o.LJIIIZ(chain, "chain");
    }

    @Override // X.S1E
    public void LJIILIIL(C7F9 chain, Dialog dialog, boolean z, boolean z2) {
        o.LJIIIZ(chain, "chain");
    }
}
