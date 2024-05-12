package X;

import com.ss.android.ugc.aweme.shortvideo.inlinecaption.als.EditCaptionFontViewModel;
import com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.692, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass692 extends AbstractC163776bl<EditCaptionFontViewModel> implements InterfaceC135635Tz {
    public final C82622Wbi LJLJLJ;
    public final WMH LJLJLLL;
    public final int LJLL;
    public final InterfaceC139695e1 LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final AnonymousClass697 LJLLJ;

    @Override // X.AbstractC165596eh
    public final void LJJLIIIJJIZ() {
        if (this.LJLJLLL.isAdded(LJJLIIJ())) {
            this.LJLJLLL.hide(LJJLIIJ());
        }
        LJJLIIJ().LJZ = false;
    }

    @Override // X.AbstractC165596eh
    public final void LJJLIIIJLLLLLLLZ() {
        if (!this.LJLJLLL.isAdded(LJJLIIJ())) {
            this.LJLJLLL.add(this.LJLL, LJJLIIJ(), "EditCaptionFontScene");
        } else {
            this.LJLJLLL.show(LJJLIIJ());
        }
    }

    public final ViewOnClickListenerC1556568z LJJLIIJ() {
        return (ViewOnClickListenerC1556568z) this.LJLLILLLL.getValue();
    }

    @Override // X.AbstractC165596eh
    public final WMH LJJLI() {
        return this.LJLJLLL;
    }

    @Override // X.AbstractC165596eh
    public final InterfaceC65784Pro<EditCaptionFontViewModel> LJJLIIIJILLIZJL() {
        return this.LJLLJ;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJLJ;
    }

    public AnonymousClass692(C82622Wbi diContainer, EditCaptionScene parentScene, C147095px c147095px) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        this.LJLJLJ = diContainer;
        this.LJLJLLL = parentScene;
        this.LJLL = R.id.g34;
        this.LJLLI = c147095px;
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 803));
        this.LJLLJ = AnonymousClass697.LJLIL;
    }
}
