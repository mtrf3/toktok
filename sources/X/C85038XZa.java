package X;

import Y.ACListenerS24S0301000_15;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.tools.music.music.vertical.VerticalMusicView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.XZa, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85038XZa extends AbstractC65781Prl implements InterfaceC88472Yns<C6DL, C76800UCe> {
    public final /* synthetic */ VerticalMusicView LJLIL;
    public final /* synthetic */ MusicModel LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ C68322mC<InterfaceC82683Wch> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85038XZa(VerticalMusicView verticalMusicView, MusicModel musicModel, int i, C68322mC<InterfaceC82683Wch> c68322mC) {
        super(1);
        this.LJLIL = verticalMusicView;
        this.LJLILLLLZI = musicModel;
        this.LJLJI = i;
        this.LJLJJI = c68322mC;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C6DL c6dl) {
        C6DL actions = c6dl;
        o.LJIIIZ(actions, "$this$actions");
        C6DO c6do = new C6DO();
        VerticalMusicView verticalMusicView = this.LJLIL;
        MusicModel musicModel = this.LJLILLLLZI;
        int i = this.LJLJI;
        C68322mC<InterfaceC82683Wch> c68322mC = this.LJLJJI;
        c6do.LIZ = R.raw.icon_trash_bin;
        c6do.LIZJ = R.string.pul;
        c6do.LJFF = new ACListenerS24S0301000_15(verticalMusicView, (VerticalMusicView) musicModel, (MusicModel) i, (int) c68322mC, (C68322mC<InterfaceC82683Wch>) 4);
        ((ArrayList) actions.LIZIZ).add(c6do);
        return C76800UCe.LIZ;
    }
}
