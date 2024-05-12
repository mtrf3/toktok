package X;

import android.widget.FrameLayout;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.share.dislike.ChooseItemViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Om3, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62879Om3 {
    public final FrameLayout LIZ;
    public boolean LIZIZ;
    public InterfaceC88472Yns<? super Boolean, C76800UCe> LIZJ;
    public final ChooseItemViewModel LIZLLL;
    public final int LJ;
    public final int LJFF;

    public C62879Om3(C29S activity, FrameLayout frameLayout) {
        o.LJIIIZ(activity, "activity");
        this.LIZ = frameLayout;
        this.LIZLLL = (ChooseItemViewModel) ViewModelProviders.of(activity).get(ChooseItemViewModel.class);
        this.LJ = 61;
        this.LJFF = 41;
    }
}
