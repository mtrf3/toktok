package X;

import com.ss.android.ugc.aweme.dsp.ugcCollect.MusicDspUGCButtonAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* renamed from: X.Zwj, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91569Zwj extends AbstractC65781Prl implements InterfaceC88471Ynr<MusicDspUGCButtonAssem, C57292Mr, C76800UCe> {
    public static final C91569Zwj LJLIL = new C91569Zwj();

    public C91569Zwj() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(MusicDspUGCButtonAssem musicDspUGCButtonAssem, C57292Mr c57292Mr) {
        com.ss.android.ugc.aweme.music.model.Dsp dsp;
        com.ss.android.ugc.aweme.music.model.Dsp dsp2;
        MusicDspUGCButtonAssem selectSubscribe = musicDspUGCButtonAssem;
        C57292Mr c57292Mr2 = c57292Mr;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c57292Mr2 != null) {
            L41.LIZ.getClass();
            if (L41.LJ() && c57292Mr2.LJLJJI) {
                String str = c57292Mr2.LJLILLLLZI;
                Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme();
                String str2 = null;
                if (aweme != null && (dsp2 = aweme.getDsp()) != null) {
                    str2 = dsp2.getFullClipId();
                }
                if (o.LJ(str, str2)) {
                    int i = 1;
                    if (c57292Mr2.LJLJI != 1) {
                        i = 0;
                    }
                    Aweme aweme2 = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme();
                    if (aweme2 != null && (dsp = aweme2.getDsp()) != null) {
                        dsp.setCollectStatus(i);
                    }
                    selectSubscribe.r4();
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
