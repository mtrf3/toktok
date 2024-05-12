package X;

import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarDefaultAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.8sx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C225398sx extends AbstractC65781Prl implements InterfaceC88471Ynr<FeedAvatarDefaultAssem, Integer, C76800UCe> {
    public static final C225398sx LJLIL = new C225398sx();

    public C225398sx() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(FeedAvatarDefaultAssem feedAvatarDefaultAssem, Integer num) {
        FeedAvatarDefaultAssem selectSubscribe = feedAvatarDefaultAssem;
        int intValue = num.intValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        selectSubscribe.g4(intValue);
        return C76800UCe.LIZ;
    }
}
