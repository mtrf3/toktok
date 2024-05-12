package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.music.model.MusicReleaseInfo;
import com.ss.android.ugc.aweme.music.vm.MusicPlayViewModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.o;

/* renamed from: X.9eK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C241809eK extends AbstractC65781Prl implements InterfaceC88472Yns<C240839cl, C76800UCe> {
    public final /* synthetic */ MusicPlayViewModel LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ MusicModel LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ boolean LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C241809eK(MusicPlayViewModel musicPlayViewModel, boolean z, MusicModel musicModel, int i, boolean z2) {
        super(1);
        this.LJLIL = musicPlayViewModel;
        this.LJLILLLLZI = z;
        this.LJLJI = musicModel;
        this.LJLJJI = i;
        this.LJLJJL = z2;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C240839cl c240839cl) {
        String str;
        String jv0;
        String str2;
        String str3;
        C240839cl it = c240839cl;
        o.LJIIIZ(it, "it");
        MusicPlayViewModel musicPlayViewModel = this.LJLIL;
        boolean z = this.LJLILLLLZI;
        MusicModel musicModel = this.LJLJI;
        int i = this.LJLJJI;
        EnumC241749eE enumC241749eE = it.LJLILLLLZI;
        boolean z2 = this.LJLJJL;
        if (musicPlayViewModel.mv0()) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        if (musicPlayViewModel.mv0()) {
            jv0 = "";
        } else {
            jv0 = musicPlayViewModel.jv0();
        }
        if (musicPlayViewModel.hv0()) {
            if (enumC241749eE != EnumC241749eE.PLAYING) {
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", "personal_homepage");
                c188727au.LJIIIZ("button_type", "play_music");
                c188727au.LJIIIZ("search_result_id", musicModel.getMusicId());
                c188727au.LIZLLL(i, "rank");
                FMX.LJIIL("search_result_click", c188727au.LIZ);
            }
        } else {
            if (enumC241749eE == EnumC241749eE.PLAYING) {
                str2 = "pause";
            } else {
                str2 = "play";
            }
            C188727au c188727au2 = new C188727au();
            c188727au2.LJIIIZ("enter_from", str);
            c188727au2.LJIIIZ("previous_page", musicPlayViewModel.iv0());
            c188727au2.LJIIIZ("music_id", musicModel.getMusicId());
            c188727au2.LJIIIZ("to_user_id", jv0);
            c188727au2.LIZLLL(i, "pos");
            c188727au2.LIZLLL(z ? 1 : 0, "is_pin_to_top");
            c188727au2.LJIIIZ("play_status", str2);
            c188727au2.LJIIIZ("enter_method", "personal_list");
            MusicReleaseInfo musicReleaseInfo = musicModel.getMusicReleaseInfo();
            if (musicReleaseInfo != null && musicReleaseInfo.isNewReleaseSong()) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            c188727au2.LJIIIZ("music_new_flag", str3);
            c188727au2.LIZLLL(z2 ? 1 : 0, "highlight");
            FMX.LJIIL("play_music", c188727au2.LIZ);
        }
        return C76800UCe.LIZ;
    }
}
