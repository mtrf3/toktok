package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;

/* renamed from: X.HjY, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44888HjY<T> implements InterfaceC66992k3 {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ Aweme LJLJI;

    @Override // X.InterfaceC66992k3
    public final void subscribe(InterfaceC65052gv<String> interfaceC65052gv) {
        if (!C39579Fg7.LIZIZ(this.LJLIL) || !C39579Fg7.LIZIZ(this.LJLILLLLZI) || C44890Hja.LIZ) {
            ((C73578SuE) interfaceC65052gv).onSuccess("");
            return;
        }
        C44890Hja.LJII = this.LJLIL;
        C44890Hja.LJIIIIZZ = this.LJLILLLLZI;
        StringBuilder LIZ = X1D.LIZ();
        C62822Ol8 c62822Ol8 = C44890Hja.LJIIJJI;
        LIZ.append((String) c62822Ol8.getValue());
        C44890Hja.LJI = JBR.LJFF(LIZ, C44890Hja.LJ, ".mp4", LIZ);
        int i = 0;
        C39579Fg7.LJ((String) c62822Ol8.getValue(), false);
        Music music = this.LJLJI.getMusic();
        if (music != null) {
            i = music.getDuration();
        }
        int i2 = i * 1000;
        OSZ<Integer, Integer> canvasToVideoDuration = AVExternalServiceImpl.LIZ().photoModeService().getCanvasToVideoDuration();
        AVExternalServiceImpl.LIZ().abilityService().processService().convertImageToVideo(this.LJLIL, this.LJLILLLLZI, C44890Hja.LJI, Math.min(canvasToVideoDuration.getSecond().intValue(), Math.max(i2, canvasToVideoDuration.getFirst().intValue())), new C44889HjZ(this.LJLJI, (C73578SuE) interfaceC65052gv));
    }

    public C44888HjY(String str, String str2, Aweme aweme) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = aweme;
    }
}
