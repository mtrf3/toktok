package X;

import com.ss.android.ugc.aweme.mention.service.CommentMentionServiceImpl;
import com.ss.android.ugc.aweme.mention.service.ICommentMentionService;

/* renamed from: X.70T, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C70T implements ICommentMentionService {
    public static final C70T LIZIZ = new C70T();
    public final /* synthetic */ ICommentMentionService LIZ;

    @Override // com.ss.android.ugc.aweme.mention.service.ICommentMentionService
    public final C70G LIZ() {
        return this.LIZ.LIZ();
    }

    public C70T() {
        ICommentMentionService iCommentMentionService;
        Object LIZ = C58096Mr6.LIZ(ICommentMentionService.class, false);
        if (LIZ != null) {
            iCommentMentionService = (ICommentMentionService) LIZ;
        } else {
            if (C58096Mr6.I2 == null) {
                synchronized (ICommentMentionService.class) {
                    if (C58096Mr6.I2 == null) {
                        C58096Mr6.I2 = new CommentMentionServiceImpl();
                    }
                }
            }
            iCommentMentionService = C58096Mr6.I2;
        }
        this.LIZ = iCommentMentionService;
    }
}
