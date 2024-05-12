package X;

import com.ss.android.ugc.aweme.feed.assem.relationbtn.VideoRelationBtnAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.OUe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61980OUe extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoRelationBtnAssem, C43I<? extends Boolean>, C76800UCe> {
    public static final C61980OUe LJLIL = new C61980OUe();

    public C61980OUe() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoRelationBtnAssem videoRelationBtnAssem, C43I<? extends Boolean> c43i) {
        VideoRelationBtnAssem selectSubscribe = videoRelationBtnAssem;
        C43I<? extends Boolean> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null && o.LJ(c43i2.LIZ(), Boolean.TRUE)) {
            selectSubscribe.u4().lv0();
        }
        return C76800UCe.LIZ;
    }
}
