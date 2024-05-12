package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.music.model.MusicInfo;
import com.ss.android.ugc.aweme.music.model.TTMStoreLink;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SV4 extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoMusicTitleAssem, Double, C76800UCe> {
    public static final SV4 LJLIL = new SV4();

    public SV4() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoMusicTitleAssem videoMusicTitleAssem, Double d) {
        VideoMusicTitleAssem selectSubscribe = videoMusicTitleAssem;
        Double d2 = d;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (d2 != null) {
            d2.doubleValue();
            double doubleValue = d2.doubleValue();
            SV9.LIZ.getClass();
            if (doubleValue > SV9.LIZ() && !selectSubscribe.LLILII) {
                selectSubscribe.LLILII = true;
                MusicInfo B4 = selectSubscribe.B4();
                if (B4 != null && B4.isTtm()) {
                    SV7.LIZ.getClass();
                    if (SV7.LJFF(false)) {
                        TTMStoreLink storeLink = B4.getLink().getStoreLink();
                        SVA sva = SVA.TIKTOK_MUSIC;
                        EnumC72191SUx enumC72191SUx = EnumC72191SUx.BRAND_ICON;
                        Context context = selectSubscribe.getContext();
                        if (context != null) {
                            SV6.LIZ(new C72192SUy(enumC72191SUx, context, storeLink, C74221TAz.LIZJ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe), "item.aweme.aid")).LIZ(), sva);
                        }
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
