package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C76800UCe;
import X.C91395Ztv;
import X.InterfaceC88473Ynt;
import android.content.Context;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.audioview.queue.MDAudioQueueViewModel;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.audioinfo.AudioInfoAssem;
import com.ss.android.ugc.aweme.music.model.MusicOwnerInfo;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;

/* loaded from: classes22.dex */
public class IDqS440S0100000_29 extends AbstractC65781Prl implements InterfaceC88473Ynt {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS440S0100000_29(MDAudioQueueViewModel mDAudioQueueViewModel, int i) {
        super(3);
        this.$t = i;
        this.l0 = mDAudioQueueViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS440S0100000_29(AudioInfoAssem audioInfoAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = audioInfoAssem;
    }

    public static final Object invoke$0(IDqS440S0100000_29 iDqS440S0100000_29, Object selectSubscribe, Object obj, Object obj2) {
        MusicOwnerInfo musicOwnerInfo;
        String uid;
        C91395Ztv c91395Ztv;
        int intValue = ((Number) obj).intValue();
        FollowStatus followStatus = (FollowStatus) obj2;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (intValue != 1) {
            if (intValue == 2) {
                C91395Ztv c91395Ztv2 = ((AudioInfoAssem) iDqS440S0100000_29.l0).LLFII;
                String str = null;
                if (c91395Ztv2 != null && (musicOwnerInfo = c91395Ztv2.LJLZ) != null && (uid = musicOwnerInfo.getUid()) != null) {
                    if (followStatus != null) {
                        str = followStatus.userId;
                    }
                    if (o.LJ(uid, str) && (c91395Ztv = ((AudioInfoAssem) iDqS440S0100000_29.l0).LLFII) != null) {
                        c91395Ztv.LJZ = Integer.valueOf(followStatus.followStatus);
                    }
                }
                AudioInfoAssem audioInfoAssem = (AudioInfoAssem) iDqS440S0100000_29.l0;
                if (followStatus != null) {
                    audioInfoAssem.n4(followStatus);
                    ((AudioInfoAssem) iDqS440S0100000_29.l0).m4();
                }
            }
        } else {
            ((AudioInfoAssem) iDqS440S0100000_29.l0).g4().playAnimation();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS440S0100000_29 iDqS440S0100000_29, Object obj, Object obj2, Object obj3) {
        String id = (String) obj;
        String fullClipId = (String) obj2;
        Context context = (Context) obj3;
        o.LJIIIZ(id, "id");
        o.LJIIIZ(fullClipId, "fullClipId");
        o.LJIIIZ(context, "context");
        ((MDAudioQueueViewModel) iDqS440S0100000_29.l0).iv0(context, id, fullClipId);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS440S0100000_29 iDqS440S0100000_29, Object obj, Object obj2, Object obj3) {
        String id = (String) obj;
        String fullClipId = (String) obj2;
        Context context = (Context) obj3;
        o.LJIIIZ(id, "id");
        o.LJIIIZ(fullClipId, "fullClipId");
        o.LJIIIZ(context, "context");
        ((MDAudioQueueViewModel) iDqS440S0100000_29.l0).iv0(context, id, fullClipId);
        return C76800UCe.LIZ;
    }
}
