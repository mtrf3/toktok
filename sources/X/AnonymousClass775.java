package X;

import com.ss.android.ugc.now.interaction.api.InteractionApiService;

/* renamed from: X.775 */
/* loaded from: classes4.dex */
public final class AnonymousClass775 {
    public static /* synthetic */ AbstractC73672Svk LIZ(InteractionApiService interactionApiService, String str, long j, int i, String str2, int i2, int i3, int i4) {
        if ((i4 & 8) != 0) {
            str2 = null;
        }
        if ((i4 & 16) != 0) {
            i2 = 1;
        }
        if ((i4 & 32) != 0) {
            i3 = AnonymousClass776.COMMENT_LIST_SCENARIO_NOW.getValue();
        }
        return interactionApiService.fetchCommentList(str, j, i, str2, i2, i3);
    }
}
