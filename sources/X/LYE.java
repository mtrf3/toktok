package X;

import com.ss.android.ugc.aweme.story.inbox.IStoryInboxService;

/* loaded from: classes10.dex */
public final class LYE {
    public static /* synthetic */ AbstractC73672Svk LIZ(IStoryInboxService iStoryInboxService, String str, EnumC54603Lbr enumC54603Lbr, int i) {
        String str2 = str;
        EnumC54603Lbr enumC54603Lbr2 = enumC54603Lbr;
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            enumC54603Lbr2 = EnumC54603Lbr.INBOX_TAB;
        }
        return iStoryInboxService.fetchStoryItems(0L, 20L, str2, enumC54603Lbr2);
    }
}
