package X;

import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.HgN, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44691HgN<T> implements InterfaceC86003Zc {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ C46007I3v LJLILLLLZI;

    public C44691HgN(String str, C46007I3v c46007I3v) {
        this.LJLIL = str;
        this.LJLILLLLZI = c46007I3v;
    }

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<MediaModel> interfaceC73573Su9) {
        String str = this.LJLIL;
        CutMultiVideoViewModel cutMultiVideoViewModel = this.LJLILLLLZI.LJLJJI;
        if (cutMultiVideoViewModel != null) {
            MediaModel LIZ = C44689HgL.LIZ(str, cutMultiVideoViewModel);
            if (LIZ != null) {
                interfaceC73573Su9.onNext(LIZ);
            }
            interfaceC73573Su9.onComplete();
            return;
        }
        o.LJIJI("cutMultiVideoViewModel");
        throw null;
    }
}
