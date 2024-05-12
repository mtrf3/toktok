package X;

import com.ss.android.ugc.aweme.feed.assem.music.addtodsp.AddToMusicDspButtonAssem;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SWS extends AbstractC65781Prl implements InterfaceC88471Ynr<AddToMusicDspButtonAssem, C43I<? extends C195357lb>, C76800UCe> {
    public static final SWS LJLIL = new SWS();

    public SWS() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(AddToMusicDspButtonAssem addToMusicDspButtonAssem, C43I<? extends C195357lb> c43i) {
        AddToMusicDspButtonAssem selectSubscribe = addToMusicDspButtonAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null) {
            selectSubscribe.LLIIIL = false;
            selectSubscribe.LLIIIJ = false;
            SY4 sy4 = selectSubscribe.LLI;
            if (sy4 != null) {
                sy4.setVisibility(8);
            }
            SY4 sy42 = selectSubscribe.LLFZ;
            if (sy42 != null) {
                sy42.setVisibility(0);
            }
            SY4 sy43 = selectSubscribe.LLFZ;
            if (sy43 != null) {
                sy43.setAlpha(1.0f);
            }
        }
        return C76800UCe.LIZ;
    }
}
