package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C188727au;
import X.C240369c0;
import X.C240949cw;
import X.C2U8;
import X.C65352Pkq;
import X.C72197SVd;
import X.C8VC;
import X.C99K;
import X.FMX;
import X.InterfaceC241869eQ;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.music.OriginMusicArg;
import com.ss.android.ugc.aweme.music.model.MusicReleaseInfo;
import com.ss.android.ugc.aweme.music.vm.MusicCellCollectIconViewModel;
import com.ss.android.ugc.aweme.music.vm.MusicCellViewModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* loaded from: classes5.dex */
public class AqS1S1211000_4 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i4;
    public Object l1;
    public Object l2;
    public String s0;
    public boolean z3;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r12v3 */
    public static final Object invoke$0(AqS1S1211000_4 aqS1S1211000_4, Object obj) {
        String str;
        String str2;
        ?? r12;
        String str3;
        C240949cw setState = (C240949cw) obj;
        o.LJIIIZ(setState, "$this$setState");
        boolean z = !setState.LJLIL;
        MusicCellViewModel musicCellViewModel = (MusicCellViewModel) aqS1S1211000_4.l1;
        String str4 = aqS1S1211000_4.s0;
        MusicModel musicModel = (MusicModel) aqS1S1211000_4.l2;
        int i = aqS1S1211000_4.i4;
        boolean z2 = aqS1S1211000_4.z3;
        musicCellViewModel.getClass();
        C240369c0 c240369c0 = (C240369c0) C8VC.LJIIIZ(musicCellViewModel, C65352Pkq.LIZ(InterfaceC241869eQ.class));
        if (c240369c0 != null && c240369c0.LIZJ) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        C240369c0 c240369c02 = (C240369c0) C8VC.LJIIIZ(musicCellViewModel, C65352Pkq.LIZ(InterfaceC241869eQ.class));
        if (c240369c02 != null && c240369c02.LIZJ) {
            str2 = "";
        } else {
            C240369c0 c240369c03 = (C240369c0) C8VC.LJIIIZ(musicCellViewModel, C65352Pkq.LIZ(InterfaceC241869eQ.class));
            if (c240369c03 != null) {
                str2 = c240369c03.LIZ;
            } else {
                str2 = null;
            }
        }
        if (z) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", str);
            c188727au.LJIIIZ("previous_page", str4);
            c188727au.LJIIIZ("music_id", musicModel.getMusicId());
            c188727au.LJIIIZ("enter_method", "personal_list");
            c188727au.LJIIIZ("to_user_id", str2);
            c188727au.LIZLLL(i, "pos");
            c188727au.LIZLLL(z2 ? 1 : 0, "is_pin_to_top");
            MusicReleaseInfo musicReleaseInfo = musicModel.getMusicReleaseInfo();
            if (musicReleaseInfo != null && musicReleaseInfo.isNewReleaseSong()) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            c188727au.LJIIIZ("music_new_flag", str3);
            FMX.LJIIL("favourite_song", c188727au.LIZ);
            r12 = z;
        } else {
            r12 = 0;
            C188727au c188727au2 = new C188727au();
            c188727au2.LJIIIZ("enter_from", str);
            c188727au2.LJIIIZ("previous_page", str4);
            c188727au2.LJIIIZ("music_id", musicModel.getMusicId());
            c188727au2.LJIIIZ("enter_method", "personal_list");
            c188727au2.LJIIIZ("to_user_id", str2);
            c188727au2.LIZLLL(i, "pos");
            c188727au2.LIZLLL(z2 ? 1 : 0, "is_pin_to_top");
            FMX.LJIIL("cancel_favourite_song", c188727au2.LIZ);
        }
        C2U8.LIZ(new C72197SVd((MusicModel) aqS1S1211000_4.l2, r12));
        MusicCellViewModel musicCellViewModel2 = (MusicCellViewModel) aqS1S1211000_4.l1;
        MusicModel musicModel2 = (MusicModel) aqS1S1211000_4.l2;
        if (r12 == 1) {
            musicCellViewModel2.LJLILLLLZI.LJIILL(1, musicModel2.getMusicId(), 1);
        } else if (r12 == 0) {
            musicCellViewModel2.LJLILLLLZI.LJIILL(1, musicModel2.getMusicId(), 0);
        } else {
            musicCellViewModel2.getClass();
        }
        return C240949cw.LIZ(setState, r12, null, null, 6);
    }

    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r12v3 */
    public static final Object invoke$1(AqS1S1211000_4 aqS1S1211000_4, Object obj) {
        String str;
        String userId;
        ?? r12;
        String str2;
        C99K setState = (C99K) obj;
        o.LJIIIZ(setState, "$this$setState");
        boolean z = !setState.LJLIL;
        MusicCellCollectIconViewModel musicCellCollectIconViewModel = (MusicCellCollectIconViewModel) aqS1S1211000_4.l1;
        String str3 = aqS1S1211000_4.s0;
        MusicModel musicModel = (MusicModel) aqS1S1211000_4.l2;
        int i = aqS1S1211000_4.i4;
        boolean z2 = aqS1S1211000_4.z3;
        if (((OriginMusicArg) musicCellCollectIconViewModel.LJLIL.getValue()).isMe()) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        if (((OriginMusicArg) musicCellCollectIconViewModel.LJLIL.getValue()).isMe()) {
            userId = "";
        } else {
            userId = ((OriginMusicArg) musicCellCollectIconViewModel.LJLIL.getValue()).getUserId();
        }
        if (z) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", str);
            c188727au.LJIIIZ("previous_page", str3);
            c188727au.LJIIIZ("music_id", musicModel.getMusicId());
            c188727au.LJIIIZ("enter_method", "personal_list");
            c188727au.LJIIIZ("to_user_id", userId);
            c188727au.LIZLLL(i, "pos");
            c188727au.LIZLLL(z2 ? 1 : 0, "is_pin_to_top");
            MusicReleaseInfo musicReleaseInfo = musicModel.getMusicReleaseInfo();
            if (musicReleaseInfo != null && musicReleaseInfo.isNewReleaseSong()) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c188727au.LJIIIZ("music_new_flag", str2);
            FMX.LJIIL("favourite_song", c188727au.LIZ);
            r12 = z;
        } else {
            r12 = 0;
            C188727au c188727au2 = new C188727au();
            c188727au2.LJIIIZ("enter_from", str);
            c188727au2.LJIIIZ("previous_page", str3);
            c188727au2.LJIIIZ("music_id", musicModel.getMusicId());
            c188727au2.LJIIIZ("enter_method", "personal_list");
            c188727au2.LJIIIZ("to_user_id", userId);
            c188727au2.LIZLLL(i, "pos");
            c188727au2.LIZLLL(z2 ? 1 : 0, "is_pin_to_top");
            FMX.LJIIL("cancel_favourite_song", c188727au2.LIZ);
        }
        C2U8.LIZ(new C72197SVd((MusicModel) aqS1S1211000_4.l2, r12));
        MusicCellCollectIconViewModel musicCellCollectIconViewModel2 = (MusicCellCollectIconViewModel) aqS1S1211000_4.l1;
        MusicModel musicModel2 = (MusicModel) aqS1S1211000_4.l2;
        if (r12 == 1) {
            musicCellCollectIconViewModel2.LJLJI.LJIILL(1, musicModel2.getMusicId(), 1);
        } else if (r12 == 0) {
            musicCellCollectIconViewModel2.LJLJI.LJIILL(1, musicModel2.getMusicId(), 0);
        } else {
            musicCellCollectIconViewModel2.getClass();
        }
        return C99K.LIZ(setState, r12, null, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS1S1211000_4(MusicCellCollectIconViewModel musicCellCollectIconViewModel, String str, MusicModel musicModel, int i, boolean z, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = musicCellCollectIconViewModel;
        this.s0 = str;
        this.l2 = musicModel;
        this.i4 = i;
        this.z3 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS1S1211000_4(MusicCellViewModel musicCellViewModel, String str, MusicModel musicModel, int i, boolean z, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = musicCellViewModel;
        this.s0 = str;
        this.l2 = musicModel;
        this.i4 = i;
        this.z3 = z;
    }
}
