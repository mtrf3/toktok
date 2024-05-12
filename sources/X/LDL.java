package X;

import Y.ARunnableS45S0100000_9;
import android.graphics.drawable.Animatable;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.infoSticker.customsticker.helper.Coordinate;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LDL implements InterfaceC70769Rq1 {
    public boolean LJLIL;
    public final /* synthetic */ C82573Wav LJLILLLLZI;
    public final /* synthetic */ List<List<Coordinate>> LJLJI;

    @Override // X.InterfaceC70769Rq1
    public final void D1(android.net.Uri uri, C2047581v c2047581v) {
    }

    @Override // X.InterfaceC70769Rq1
    public final void LJLLLLLL(android.net.Uri uri) {
    }

    @Override // X.InterfaceC70769Rq1
    public final void LLZZJLIL(android.net.Uri uri, Throwable th) {
    }

    @Override // X.InterfaceC70769Rq1
    public final void T1(android.net.Uri uri, SmartImageView smartImageView) {
    }

    @Override // X.InterfaceC70769Rq1
    public final void s2(android.net.Uri uri, View view, Throwable th) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LDL(C82573Wav c82573Wav, List<? extends List<Coordinate>> list) {
        this.LJLILLLLZI = c82573Wav;
        this.LJLJI = list;
    }

    @Override // X.InterfaceC70769Rq1
    public final void U0(android.net.Uri uri, View view, C2047581v c2047581v, Animatable animatable) {
        if (this.LJLIL) {
            return;
        }
        this.LJLIL = true;
        C82573Wav c82573Wav = this.LJLILLLLZI;
        List<List<Coordinate>> old = this.LJLJI;
        if (c2047581v != null) {
            c82573Wav.getClass();
            c82573Wav.LLF = c2047581v.LIZ;
            c82573Wav.LLFF = c2047581v.LIZIZ;
        }
        RelativeLayout relativeLayout = c82573Wav.LJLL;
        if (relativeLayout != null) {
            relativeLayout.setScaleX(0.75f);
            RelativeLayout relativeLayout2 = c82573Wav.LJLL;
            if (relativeLayout2 != null) {
                relativeLayout2.setScaleY(0.75f);
                LDJ ldj = c82573Wav.LJLLLL;
                if (ldj != null) {
                    ldj.setShowAnimation(false);
                    LDJ ldj2 = c82573Wav.LJLLLL;
                    if (ldj2 != null) {
                        ldj2.setVisibility(4);
                        LDJ ldj3 = c82573Wav.LJLLLLLL;
                        if (ldj3 != null) {
                            float f = c82573Wav.LLII;
                            float f2 = c82573Wav.LLIIII;
                            float f3 = c82573Wav.LLIFFJFJJ;
                            o.LJIIIZ(old, "old");
                            Iterator<List<Coordinate>> it = old.iterator();
                            while (it.hasNext()) {
                                for (Coordinate coordinate : it.next()) {
                                    coordinate.setX((coordinate.getX() / f3) + f);
                                    coordinate.setY((coordinate.getY() / f3) + f2);
                                }
                            }
                            ldj3.setPoints(old);
                            LDJ ldj4 = c82573Wav.LJLLLLLL;
                            if (ldj4 != null) {
                                ldj4.setShowAnimation(true);
                                LDJ ldj5 = c82573Wav.LJLLLLLL;
                                if (ldj5 != null) {
                                    ldj5.postDelayed(new ARunnableS45S0100000_9(c82573Wav, 188), 1200L);
                                    return;
                                } else {
                                    o.LJIJI("maskPathView");
                                    throw null;
                                }
                            }
                            o.LJIJI("maskPathView");
                            throw null;
                        }
                        o.LJIJI("maskPathView");
                        throw null;
                    }
                    o.LJIJI("reactView");
                    throw null;
                }
                o.LJIJI("reactView");
                throw null;
            }
            o.LJIJI("maskContainer");
            throw null;
        }
        o.LJIJI("maskContainer");
        throw null;
    }
}
