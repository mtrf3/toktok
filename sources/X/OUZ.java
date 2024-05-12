package X;

import com.ss.android.ugc.aweme.feed.assem.relationbtn.VideoRelationBtnAssem;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OUZ extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoRelationBtnAssem, C43I<? extends C195357lb>, C76800UCe> {
    public static final OUZ LJLIL = new OUZ();

    public OUZ() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoRelationBtnAssem videoRelationBtnAssem, C43I<? extends C195357lb> c43i) {
        VideoRelationBtnAssem selectSubscribe = videoRelationBtnAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (!C53324KwK.LIZ() || c43i != null) {
            selectSubscribe.z4(false);
        }
        return C76800UCe.LIZ;
    }
}
