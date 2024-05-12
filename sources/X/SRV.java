package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.assem.MentionVideoListAssem;
import com.ss.android.ugc.aweme.viewmodel.MentionFavoriteVideoVM;
import com.ss.android.ugc.aweme.viewmodel.MentionMusicVideoVM;
import com.ss.android.ugc.aweme.viewmodel.MentionPostedAndLikeVideoVM;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SRV implements ViewModelProvider.Factory {
    public final /* synthetic */ MentionVideoListAssem LIZ;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
        return C09L.LIZIZ(this, cls, c0vk);
    }

    public SRV(MentionVideoListAssem mentionVideoListAssem) {
        this.LIZ = mentionVideoListAssem;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> modelClass) {
        int i;
        o.LJIIIZ(modelClass, "modelClass");
        SRE sre = (SRE) this.LIZ.LJLILLLLZI.getValue();
        if (sre != null) {
            i = sre.LJLILLLLZI;
        } else {
            i = 1;
        }
        if (i != 6) {
            if (i != 8) {
                if (i != 9) {
                    Object newInstance = MentionFavoriteVideoVM.class.getConstructor(new Class[0]).newInstance(new Object[0]);
                    o.LJII(newInstance, "null cannot be cast to non-null type T of com.ss.android.ugc.aweme.assem.MentionVideoListAssem.getViewModelProviderFactory.<no name provided>.create");
                    return (T) newInstance;
                }
            } else {
                Object newInstance2 = MentionMusicVideoVM.class.getConstructor(new Class[0]).newInstance(new Object[0]);
                o.LJII(newInstance2, "null cannot be cast to non-null type T of com.ss.android.ugc.aweme.assem.MentionVideoListAssem.getViewModelProviderFactory.<no name provided>.create");
                return (T) newInstance2;
            }
        }
        Object newInstance3 = MentionPostedAndLikeVideoVM.class.getConstructor(new Class[0]).newInstance(new Object[0]);
        o.LJII(newInstance3, "null cannot be cast to non-null type T of com.ss.android.ugc.aweme.assem.MentionVideoListAssem.getViewModelProviderFactory.<no name provided>.create");
        return (T) newInstance3;
    }
}
