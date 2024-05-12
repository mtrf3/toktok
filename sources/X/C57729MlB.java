package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.LatestUnreadVideoInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.fragment.muflist.videoplayer.FriendNewVideoSharedVM;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.MlB, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57729MlB implements ViewModelProvider.Factory {
    public final User LIZ;
    public final EnumC57724Ml6 LIZIZ;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
        return C09L.LIZIZ(this, cls, c0vk);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> modelClass) {
        Aweme firstAweme;
        o.LJIIIZ(modelClass, "modelClass");
        ArrayList arrayList = new ArrayList();
        LatestUnreadVideoInfo latestUnreadVideoInfo = this.LIZ.getLatestUnreadVideoInfo();
        if (latestUnreadVideoInfo != null && (firstAweme = latestUnreadVideoInfo.getFirstAweme()) != null) {
            arrayList.add(firstAweme);
        }
        return new FriendNewVideoSharedVM(this.LIZ, this.LIZIZ, arrayList);
    }

    public C57729MlB(User author, EnumC57724Ml6 scene) {
        o.LJIIIZ(author, "author");
        o.LJIIIZ(scene, "scene");
        this.LIZ = author;
        this.LIZIZ = scene;
    }
}
