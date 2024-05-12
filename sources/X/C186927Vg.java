package X;

import android.content.Context;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.LiveData;
import com.bytedance.router.OnActivityResultCallback;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.ss.android.ugc.aweme.tag.service.ITagService;
import com.ss.android.ugc.aweme.tag.service.TagServiceImpl;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7Vg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C186927Vg implements ITagService {
    public static final C186927Vg LIZIZ = new C186927Vg();
    public final /* synthetic */ ITagService LIZ;

    @Override // com.ss.android.ugc.aweme.tag.service.ITagService
    public final void LIZ() {
        this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.tag.service.ITagService
    public final int LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.tag.service.ITagService
    public final void LIZJ(ActivityC45651qj activityC45651qj, boolean z, InterfaceC65784Pro<C76800UCe> onDismiss) {
        o.LJIIIZ(onDismiss, "onDismiss");
        this.LIZ.LIZJ(activityC45651qj, z, onDismiss);
    }

    @Override // com.ss.android.ugc.aweme.tag.service.ITagService
    public final void LIZLLL(ActivityC45651qj activityC45651qj, String enterFrom, Aweme aweme, int i, List<InteractionTagUserInfo> list, InterfaceC88473Ynt<? super List<InteractionTagUserInfo>, ? super Boolean, ? super Boolean, C76800UCe> interfaceC88473Ynt) {
        o.LJIIIZ(enterFrom, "enterFrom");
        this.LIZ.LIZLLL(activityC45651qj, enterFrom, aweme, i, list, interfaceC88473Ynt);
    }

    @Override // com.ss.android.ugc.aweme.tag.service.ITagService
    public final void LJ(ActivityC45651qj activityC45651qj, Aweme aweme, String str, String anchorType) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(anchorType, "anchorType");
        this.LIZ.LJ(activityC45651qj, aweme, str, anchorType);
    }

    @Override // com.ss.android.ugc.aweme.tag.service.ITagService
    public final void LJFF(Context context, String enterFrom, Aweme aweme, int i, List<InteractionTagUserInfo> list, OnActivityResultCallback onActivityResultCallback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(enterFrom, "enterFrom");
        this.LIZ.LJFF(context, enterFrom, aweme, i, list, onActivityResultCallback);
    }

    @Override // com.ss.android.ugc.aweme.tag.service.ITagService
    public final LiveData LJI(LifecycleRegistry lifecycle) {
        o.LJIIIZ(lifecycle, "lifecycle");
        return this.LIZ.LJI(lifecycle);
    }

    public C186927Vg() {
        ITagService iTagService;
        Object LIZ = C58096Mr6.LIZ(ITagService.class, false);
        if (LIZ != null) {
            iTagService = (ITagService) LIZ;
        } else {
            if (C58096Mr6.v7 == null) {
                synchronized (ITagService.class) {
                    if (C58096Mr6.v7 == null) {
                        C58096Mr6.v7 = new TagServiceImpl();
                    }
                }
            }
            iTagService = C58096Mr6.v7;
        }
        this.LIZ = iTagService;
    }
}
