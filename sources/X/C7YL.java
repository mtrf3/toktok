package X;

import android.view.View;
import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.feed.assem.music.artistprofile.ArtistProfileTuxSheetFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicOwnerInfo;
import java.util.List;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7YL, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7YL extends AbstractC65781Prl implements InterfaceC88472Yns<Assembler, C76800UCe> {
    public final /* synthetic */ ArtistProfileTuxSheetFragment LJLIL;
    public final /* synthetic */ Aweme LJLILLLLZI;
    public final /* synthetic */ Music LJLJI;
    public final /* synthetic */ List<MusicOwnerInfo> LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ boolean LJLJL;
    public final /* synthetic */ View LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7YL(ArtistProfileTuxSheetFragment artistProfileTuxSheetFragment, Aweme aweme, Music music, List<MusicOwnerInfo> list, String str, String str2, boolean z, View view) {
        super(1);
        this.LJLIL = artistProfileTuxSheetFragment;
        this.LJLILLLLZI = aweme;
        this.LJLJI = music;
        this.LJLJJI = list;
        this.LJLJJL = str;
        this.LJLJJLL = str2;
        this.LJLJL = z;
        this.LJLJLJ = view;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Assembler assembler) {
        Assembler assemble = assembler;
        o.LJIIIZ(assemble, "$this$assemble");
        assemble.mv0(this.LJLIL, new C7YN(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL));
        assemble.wv0(this.LJLIL, new AqS169S0100000_3(this.LJLJLJ, 208));
        return C76800UCe.LIZ;
    }
}
