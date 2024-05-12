package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.InteractPlayListBottomBarAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.8zz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C229758zz extends AbstractC65781Prl implements InterfaceC88471Ynr<InteractPlayListBottomBarAssem, C43I<? extends Float>, C76800UCe> {
    public static final C229758zz LJLIL = new C229758zz();

    public C229758zz() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InteractPlayListBottomBarAssem interactPlayListBottomBarAssem, C43I<? extends Float> c43i) {
        int i;
        long j;
        Long itemTotal;
        Integer index;
        InteractPlayListBottomBarAssem selectSubscribe = interactPlayListBottomBarAssem;
        C43I<? extends Float> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null && selectSubscribe.LLIIJLIL) {
            if (C229718zv.LIZ && !selectSubscribe.LLIILII && (((Number) c43i2.LIZ).floatValue() / 100) * ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getVideo().getDuration() >= 5000.0f) {
                Context context = selectSubscribe.getContext();
                if (context != null) {
                    selectSubscribe.I4().jv0(context);
                }
                selectSubscribe.LLIILII = true;
            }
            if (o.LJ(((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).mEventType, "homepage_hot")) {
                SY4 sy4 = selectSubscribe.LLIIIL;
                int i2 = 0;
                if (sy4 == null || sy4.getVisibility() != 0) {
                    Video video = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getVideo();
                    if (video != null) {
                        i = video.getDuration();
                    } else {
                        i = 0;
                    }
                    if (i >= selectSubscribe.LLIILZL) {
                        PlayListInfo playListInfo = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().playlist_info;
                        if (playListInfo != null && (index = playListInfo.getIndex()) != null) {
                            i2 = index.intValue();
                        }
                        long j2 = i2 + 1;
                        PlayListInfo playListInfo2 = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().playlist_info;
                        if (playListInfo2 != null && (itemTotal = playListInfo2.getItemTotal()) != null) {
                            j = itemTotal.longValue();
                        } else {
                            j = 1;
                        }
                        if (j2 < j && ((((Number) c43i2.LIZ).floatValue() / 100) * ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getVideo().getDuration()) + selectSubscribe.LLIILZL >= ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getVideo().getDuration()) {
                            selectSubscribe.J4(true);
                        }
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
