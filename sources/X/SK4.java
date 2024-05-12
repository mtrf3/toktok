package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.InteractPermission;
import com.ss.android.ugc.aweme.feed.model.InteractionPermission;
import com.ss.android.ugc.aweme.story.model.SwitchToStoryResponse;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SK4 implements InterfaceC116954iR<SwitchToStoryResponse> {
    public final /* synthetic */ SK5 LJLIL;
    public final /* synthetic */ InterfaceC88472Yns<Aweme, C76800UCe> LJLILLLLZI;
    public final /* synthetic */ InterfaceC88472Yns<String, C76800UCe> LJLJI;

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP d) {
        o.LJIIIZ(d, "d");
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable e) {
        o.LJIIIZ(e, "e");
        this.LJLJI.invoke(e.getMessage());
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(SwitchToStoryResponse switchToStoryResponse) {
        boolean z;
        boolean z2;
        InteractionPermission allowStorySwitchToPost;
        InteractPermission interactPermission;
        InteractionPermission allowStorySwitchToPost2;
        SwitchToStoryResponse resp = switchToStoryResponse;
        o.LJIIIZ(resp, "resp");
        Aweme aweme = this.LJLIL.LJLL;
        Aweme aweme2 = resp.getAweme();
        if (aweme2 != null) {
            z = aweme2.getIsTikTokStory();
        } else {
            z = false;
        }
        aweme.setIsTikTokStory(z);
        Aweme aweme3 = resp.getAweme();
        int i = 1;
        if (aweme3 != null) {
            z2 = aweme3.getIsStoryToNormal();
        } else {
            z2 = true;
        }
        aweme.setIsStoryToNormal(z2);
        InteractPermission interactPermission2 = aweme.getInteractPermission();
        if (interactPermission2 != null && (allowStorySwitchToPost = interactPermission2.getAllowStorySwitchToPost()) != null) {
            Aweme aweme4 = resp.getAweme();
            if (aweme4 != null && (interactPermission = aweme4.getInteractPermission()) != null && (allowStorySwitchToPost2 = interactPermission.getAllowStorySwitchToPost()) != null) {
                i = allowStorySwitchToPost2.getStatus();
            }
            allowStorySwitchToPost.setStatus(i);
        }
        Integer visibilityAction = resp.getVisibilityAction();
        if (visibilityAction != null) {
            int intValue = visibilityAction.intValue();
            AwemeStatus status = aweme.getStatus();
            if (status != null) {
                status.setPrivateStatus(intValue);
            }
        }
        Aweme aweme5 = resp.getAweme();
        if (aweme5 != null) {
            SK5 sk5 = this.LJLIL;
            sk5.getClass();
            sk5.LJLL = aweme5;
        }
        this.LJLILLLLZI.invoke(this.LJLIL.LJLL);
    }

    public SK4(SK5 sk5, AqS143S0200000_12 aqS143S0200000_12, AqS143S0200000_12 aqS143S0200000_122) {
        this.LJLIL = sk5;
        this.LJLILLLLZI = aqS143S0200000_12;
        this.LJLJI = aqS143S0200000_122;
    }
}
