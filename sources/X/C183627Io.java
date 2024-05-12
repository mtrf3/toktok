package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.upvote.detail.bubble.UpvoteVideoAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.7Io, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C183627Io extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ UpvoteVideoAssem LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C183627Io(UpvoteVideoAssem upvoteVideoAssem, String str, String str2) {
        super(0);
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = upvoteVideoAssem;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        String str = this.LJLIL;
        if (str == null) {
            str = "";
        }
        String str2 = this.LJLILLLLZI;
        String str3 = ((VideoItemParams) C51029K0z.LJIILLIIL(this.LJLJI)).mEventType;
        o.LJIIIIZZ(str3, "item.eventType");
        C183607Im.LIZ(str, str2, str3);
        return C76800UCe.LIZ;
    }
}
