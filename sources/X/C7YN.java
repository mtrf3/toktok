package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicOwnerInfo;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7YN, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7YN extends AbstractC65781Prl implements InterfaceC88472Yns<C4LX<InterfaceC87283bg>, C76800UCe> {
    public final /* synthetic */ Aweme LJLIL;
    public final /* synthetic */ Music LJLILLLLZI;
    public final /* synthetic */ List<MusicOwnerInfo> LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7YN(Aweme aweme, Music music, List<MusicOwnerInfo> list, String str, String str2, boolean z) {
        super(1);
        this.LJLIL = aweme;
        this.LJLILLLLZI = music;
        this.LJLJI = list;
        this.LJLJJI = str;
        this.LJLJJL = str2;
        this.LJLJJLL = z;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C4LX<InterfaceC87283bg> c4lx) {
        C4LX<InterfaceC87283bg> hierarchyData = c4lx;
        o.LJIIIZ(hierarchyData, "$this$hierarchyData");
        Aweme aweme = this.LJLIL;
        Music music = this.LJLILLLLZI;
        List<MusicOwnerInfo> artistProfileList = this.LJLJI;
        o.LJIIIIZZ(artistProfileList, "artistProfileList");
        hierarchyData.LIZ = new C7YO(aweme, music, artistProfileList, this.LJLJJI, this.LJLJJL, this.LJLJJLL);
        hierarchyData.LIZIZ = "hierarchy_data_key";
        return C76800UCe.LIZ;
    }
}
